package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class ui implements com.tencent.mm.ui.zc {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.storage.FinderItem f109193a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yz5.l f109194b;

    public ui(com.tencent.mm.plugin.finder.storage.FinderItem finderItem, yz5.l lVar) {
        this.f109193a = finderItem;
        this.f109194b = lVar;
    }

    @Override // com.tencent.mm.ui.zc
    public final void a(int i17, android.content.Intent intent) {
        java.util.ArrayList<java.lang.String> arrayList = new java.util.ArrayList<>();
        if (i17 == -1) {
            java.util.ArrayList<java.lang.String> stringArrayListExtra = intent != null ? intent.getStringArrayListExtra("SendMsgUsernames") : null;
            if (stringArrayListExtra == null) {
                stringArrayListExtra = new java.util.ArrayList<>(0);
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("share finderObject ");
            com.tencent.mm.plugin.finder.storage.FinderItem finderItem = this.f109193a;
            sb6.append(finderItem.getId());
            sb6.append(" to ");
            sb6.append(stringArrayListExtra);
            com.tencent.mars.xlog.Log.i("Finder.FinderShareManager", sb6.toString());
            ((com.tencent.mm.plugin.messenger.foundation.PluginMessengerFoundation) i95.n0.c(com.tencent.mm.plugin.messenger.foundation.PluginMessengerFoundation.class)).Ai().h(stringArrayListExtra);
            if (!stringArrayListExtra.isEmpty()) {
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                java.util.Iterator<java.lang.String> it = stringArrayListExtra.iterator();
                java.lang.String str = "";
                while (it.hasNext()) {
                    str = str + it.next() + ';';
                }
                if (r26.i0.o(str, ";", false, 2, null)) {
                    str = str.substring(0, str.length() - 1);
                    kotlin.jvm.internal.o.f(str, "substring(...)");
                }
                jSONObject.put("type", "1");
                jSONObject.put(dm.i4.COL_USERNAME, str);
                i95.m c17 = i95.n0.c(zy2.zb.class);
                kotlin.jvm.internal.o.f(c17, "getService(...)");
                zy2.zb.y6((zy2.zb) c17, ml2.z4.f328362m, jSONObject.toString(), null, 4, null);
                com.tencent.mm.plugin.finder.assist.n7.f102406a.D(finderItem);
            }
            arrayList = stringArrayListExtra;
        } else {
            com.tencent.mm.plugin.finder.feed.wi.b(com.tencent.mm.plugin.finder.feed.wi.f110978a);
        }
        yz5.l lVar = this.f109194b;
        if (lVar != null) {
            lVar.invoke(arrayList);
        }
    }
}

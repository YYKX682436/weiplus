package com.tencent.mm.plugin.finder.assist;

/* loaded from: classes2.dex */
public final class v6 implements com.tencent.mm.ui.xc {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.storage.FinderItem f102626d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f102627e;

    public v6(com.tencent.mm.plugin.finder.storage.FinderItem finderItem, yz5.l lVar) {
        this.f102626d = finderItem;
        this.f102627e = lVar;
    }

    @Override // com.tencent.mm.ui.xc
    public final void mmOnActivityResult(int i17, int i18, android.content.Intent intent) {
        java.util.ArrayList<java.lang.String> arrayList = new java.util.ArrayList<>();
        if (i18 == -1) {
            java.util.ArrayList<java.lang.String> stringArrayListExtra = intent != null ? intent.getStringArrayListExtra("SendMsgUsernames") : null;
            if (stringArrayListExtra == null) {
                stringArrayListExtra = new java.util.ArrayList<>(0);
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("share finderObject ");
            com.tencent.mm.plugin.finder.storage.FinderItem finderItem = this.f102626d;
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
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            jSONObject2.put("type", "3");
            i95.m c18 = i95.n0.c(zy2.zb.class);
            kotlin.jvm.internal.o.f(c18, "getService(...)");
            zy2.zb.y6((zy2.zb) c18, ml2.z4.f328362m, jSONObject2.toString(), null, 4, null);
        }
        yz5.l lVar = this.f102627e;
        if (lVar != null) {
            lVar.invoke(arrayList);
        }
    }
}

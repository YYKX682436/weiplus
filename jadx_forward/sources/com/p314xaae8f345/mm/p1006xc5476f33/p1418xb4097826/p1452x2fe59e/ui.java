package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e;

/* loaded from: classes2.dex */
public final class ui implements com.p314xaae8f345.mm.ui.zc {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 f190726a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yz5.l f190727b;

    public ui(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c079, yz5.l lVar) {
        this.f190726a = c14994x9b99c079;
        this.f190727b = lVar;
    }

    @Override // com.p314xaae8f345.mm.ui.zc
    public final void a(int i17, android.content.Intent intent) {
        java.util.ArrayList<java.lang.String> arrayList = new java.util.ArrayList<>();
        if (i17 == -1) {
            java.util.ArrayList<java.lang.String> stringArrayListExtra = intent != null ? intent.getStringArrayListExtra("SendMsgUsernames") : null;
            if (stringArrayListExtra == null) {
                stringArrayListExtra = new java.util.ArrayList<>(0);
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("share finderObject ");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c079 = this.f190726a;
            sb6.append(c14994x9b99c079.m59251x5db1b11());
            sb6.append(" to ");
            sb6.append(stringArrayListExtra);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderShareManager", sb6.toString());
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.C16508x1e702dd3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.C16508x1e702dd3.class)).Ai().h(stringArrayListExtra);
            if (!stringArrayListExtra.isEmpty()) {
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                java.util.Iterator<java.lang.String> it = stringArrayListExtra.iterator();
                java.lang.String str = "";
                while (it.hasNext()) {
                    str = str + it.next() + ';';
                }
                if (r26.i0.o(str, ";", false, 2, null)) {
                    str = str.substring(0, str.length() - 1);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "substring(...)");
                }
                jSONObject.put("type", "1");
                jSONObject.put(dm.i4.f66875xa013b0d5, str);
                i95.m c17 = i95.n0.c(zy2.zb.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                zy2.zb.y6((zy2.zb) c17, ml2.z4.f409895m, jSONObject.toString(), null, 4, null);
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.n7.f183939a.D(c14994x9b99c079);
            }
            arrayList = stringArrayListExtra;
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.wi.b(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.wi.f192511a);
        }
        yz5.l lVar = this.f190727b;
        if (lVar != null) {
            lVar.mo146xb9724478(arrayList);
        }
    }
}

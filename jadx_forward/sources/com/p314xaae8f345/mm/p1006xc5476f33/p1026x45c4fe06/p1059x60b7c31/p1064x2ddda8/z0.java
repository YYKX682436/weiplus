package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8;

/* loaded from: classes7.dex */
public class z0 implements ui1.y {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.y f161339a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.y0 f161340b;

    public z0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.y0 y0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.y yVar) {
        this.f161340b = y0Var;
        this.f161339a = yVar;
    }

    @Override // ui1.y
    public void a(int i17, java.util.ArrayList arrayList, int i18, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.y0 y0Var = this.f161340b;
        y0Var.f161325e.N = (arrayList == null ? java.util.Collections.emptyList() : arrayList).size() > 0 ? (java.lang.String) arrayList.get(0) : "";
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.C11999x85898042 c11999x85898042 = y0Var.f161325e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.y yVar = this.f161339a;
        if (i17 != 1) {
            if (i17 != 2) {
                if (i17 != 3) {
                    return;
                }
                c11999x85898042.C("");
                yVar.a(z17, 2);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiAuthorize", "user cancel");
                return;
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(c11999x85898042.N);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.C11999x85898042.B(c11999x85898042, 2, arrayList2, z17);
            yVar.a(z17, 1);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiAuthorize", "click NegativeButton");
            return;
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(c11999x85898042.N);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.C11999x85898042.B(c11999x85898042, 1, arrayList3, z17);
        yVar.a(z17, 0);
        if (c11999x85898042.N.equals("scope.voip")) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y mComponent = c11999x85898042.f160864g;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mComponent, "mComponent");
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 L = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L();
            if (!L.getBoolean("has_ever_show_wmpf_voip_call_in_scope_auth_notify_bottom_sheet", false)) {
                fl1.g2 m48800x14ed3266 = mComponent.mo32091x9a3f0ba2().m48800x14ed3266();
                android.content.Context f229340d = mComponent.getF229340d();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(f229340d, "getContext(...)");
                ((fl1.c0) m48800x14ed3266).c(new ui1.e0(f229340d));
                L.putBoolean("has_ever_show_wmpf_voip_call_in_scope_auth_notify_bottom_sheet", true);
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiAuthorize", "click PositiveButton");
    }
}

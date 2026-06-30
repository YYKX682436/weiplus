package com.p314xaae8f345.mm.p1006xc5476f33.p2312x3befc424.ui;

/* loaded from: classes14.dex */
public class e implements i11.c {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2312x3befc424.ui.ViewOnClickListenerC18768x401c3b80 f256857d;

    public e(com.p314xaae8f345.mm.p1006xc5476f33.p2312x3befc424.ui.ViewOnClickListenerC18768x401c3b80 viewOnClickListenerC18768x401c3b80) {
        this.f256857d = viewOnClickListenerC18768x401c3b80;
    }

    @Override // i11.c
    /* renamed from: onGetLocation */
    public boolean mo630x9b865cc(boolean z17, float f17, float f18, int i17, double d17, double d18, double d19) {
        java.lang.String str;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetworkDiagnoseAllInOneUI", "get location, isOK:%b", java.lang.Boolean.valueOf(z17));
        com.p314xaae8f345.mm.p1006xc5476f33.p2312x3befc424.ui.ViewOnClickListenerC18768x401c3b80 viewOnClickListenerC18768x401c3b80 = this.f256857d;
        i11.e eVar = viewOnClickListenerC18768x401c3b80.f256832u;
        if (eVar != null) {
            ((i11.h) eVar).m(viewOnClickListenerC18768x401c3b80.f256833v);
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p2312x3befc424.ui.c(this));
        java.lang.String str2 = viewOnClickListenerC18768x401c3b80.f256827p;
        if (z17) {
            str = (java.lang.String.valueOf(f18) + "-" + java.lang.String.valueOf(f17)) + "," + viewOnClickListenerC18768x401c3b80.f256827p;
        } else {
            if (!viewOnClickListenerC18768x401c3b80.f256835x && !com.p314xaae8f345.mm.sdk.p2603x2137b148.n2.a()) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2312x3befc424.ui.ViewOnClickListenerC18768x401c3b80 viewOnClickListenerC18768x401c3b802 = this.f256857d;
                viewOnClickListenerC18768x401c3b802.f256835x = true;
                db5.e1.C(viewOnClickListenerC18768x401c3b802, viewOnClickListenerC18768x401c3b802.getString(com.p314xaae8f345.mm.R.C30867xcad56011.fs_), viewOnClickListenerC18768x401c3b80.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), viewOnClickListenerC18768x401c3b80.getString(com.p314xaae8f345.mm.R.C30867xcad56011.g6z), viewOnClickListenerC18768x401c3b80.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg), false, new com.p314xaae8f345.mm.p1006xc5476f33.p2312x3befc424.ui.d(this), null);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetworkDiagnoseAllInOneUI", "get geolocation fail");
            str = "," + viewOnClickListenerC18768x401c3b80.f256827p;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68478xbd3cda5f(14533, str);
        return false;
    }
}

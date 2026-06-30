package com.p314xaae8f345.mm.p1006xc5476f33.p1390x2fb9f7.ui;

/* loaded from: classes11.dex */
public class z extends s35.b {

    /* renamed from: m, reason: collision with root package name */
    public android.view.View f181386m;

    /* renamed from: n, reason: collision with root package name */
    public android.view.View f181387n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.TextView f181388o;

    /* renamed from: p, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f181389p;

    public z(android.content.Context context) {
        super(context);
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6119x892f1237> abstractC20980x9b9ad01d = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6119x892f1237>(a0Var) { // from class: com.tencent.mm.plugin.expt.ui.ExptReportBanner$4
            {
                this.f39173x3fe91575 = -337129945;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6119x892f1237 c6119x892f1237) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6119x892f1237 c6119x892f12372 = c6119x892f1237;
                com.p314xaae8f345.mm.p1006xc5476f33.p1390x2fb9f7.ui.z zVar = com.p314xaae8f345.mm.p1006xc5476f33.p1390x2fb9f7.ui.z.this;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ExptReportBanner", "expt report banner callback %s", java.lang.Integer.valueOf(zVar.hashCode()));
                if (c6119x892f12372 == null) {
                    return false;
                }
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c6119x892f12372.f136393g.f89286a)) {
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p1390x2fb9f7.ui.y(zVar));
                    return false;
                }
                com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p1390x2fb9f7.ui.x(zVar));
                return false;
            }
        };
        this.f181389p = abstractC20980x9b9ad01d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ExptReportBanner", "expt report banner initialize %d", java.lang.Integer.valueOf(hashCode()));
        abstractC20980x9b9ad01d.mo48813x58998cd();
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(g62.b.wi().f350607d)) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p1390x2fb9f7.ui.x(this));
        } else {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p1390x2fb9f7.ui.y(this));
        }
    }

    @Override // s35.b
    public void a() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ExptReportBanner", "expt report banner destroy %d", java.lang.Integer.valueOf(hashCode()));
        this.f181389p.mo48814x2efc64();
    }

    @Override // s35.b
    public int b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.a_n;
    }

    @Override // s35.b
    public void h(android.view.View view) {
        this.f181386m = view.findViewById(com.p314xaae8f345.mm.R.id.aey);
        this.f181387n = view.findViewById(com.p314xaae8f345.mm.R.id.f564882af1);
        this.f181388o = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.f567708kh1);
        this.f181386m.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1390x2fb9f7.ui.w(this));
    }
}

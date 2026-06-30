package k84;

/* loaded from: classes4.dex */
public final class a0 implements p3325xe03a0797.p3326xc267989b.p3328x30012e.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k84.q1 f386461d;

    public a0(k84.q1 q1Var) {
        this.f386461d = q1Var;
    }

    @Override // p3325xe03a0797.p3326xc267989b.p3328x30012e.k
    /* renamed from: emit */
    public java.lang.Object mo771x2f8fd3(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        java.lang.Boolean bool;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("emit", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent$bindComponentModel$3$1");
        k84.m mVar = (k84.m) obj;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("emit", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent$bindComponentModel$3$1");
        k84.q1 q1Var = this.f386461d;
        java.lang.String j17 = q1Var.j();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("continuousLikeStateFlow collect = ");
        if (mVar != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isLike", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent$LikeState");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isLike", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent$LikeState");
            bool = java.lang.Boolean.valueOf(mVar.f386643a);
        } else {
            bool = null;
        }
        sb6.append(bool);
        sb6.append(' ');
        sb6.append(mVar != null ? java.lang.Boolean.valueOf(mVar.b()) : null);
        sb6.append(' ');
        sb6.append(mVar != null ? java.lang.Boolean.valueOf(mVar.a()) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(j17, sb6.toString());
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (mVar == null) {
            android.view.ViewGroup P = q1Var.P();
            if (P != null) {
                P.setVisibility(0);
            }
            android.view.ViewGroup R = q1Var.R();
            if (R != null) {
                R.setVisibility(4);
            }
            android.view.ViewGroup N = q1Var.N();
            if (N != null) {
                N.setVisibility(4);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("emit", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent$bindComponentModel$3$1");
        } else {
            if (mVar.b()) {
                android.view.ViewGroup P2 = q1Var.P();
                if (P2 != null) {
                    P2.setVisibility(0);
                }
                android.view.ViewGroup R2 = q1Var.R();
                if (R2 != null) {
                    R2.setVisibility(4);
                }
                android.view.ViewGroup N2 = q1Var.N();
                if (N2 != null) {
                    N2.setVisibility(4);
                }
            } else if (mVar.a()) {
                android.view.ViewGroup P3 = q1Var.P();
                if (P3 != null) {
                    P3.setVisibility(4);
                }
                android.view.ViewGroup R3 = q1Var.R();
                if (R3 != null) {
                    R3.setVisibility(0);
                }
                android.view.ViewGroup N3 = q1Var.N();
                if (N3 != null) {
                    N3.setVisibility(4);
                }
            } else {
                k84.q1.Y(q1Var, null, 1, null);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2136xd0c93d50.C17781x303781f L = q1Var.L();
                if (L != null) {
                    L.m69554x8eae3d2b(false);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2136xd0c93d50.C17781x303781f L2 = q1Var.L();
                if (L2 != null) {
                    L2.p();
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("emit", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent$bindComponentModel$3$1");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("emit", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent$bindComponentModel$3$1");
        return f0Var;
    }
}

package wo2;

/* loaded from: classes2.dex */
public final class h0 implements p012xc85e97e9.p093xedfae76a.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wo2.m0 f529609d;

    public h0(wo2.m0 m0Var) {
        this.f529609d = m0Var;
    }

    @Override // p012xc85e97e9.p093xedfae76a.k0
    /* renamed from: onChanged */
    public void mo525x7bb163d5(java.lang.Object obj) {
        java.lang.Object obj2;
        r45.f03 f03Var;
        r45.f03 f03Var2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.z9 z9Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.z9) obj;
        wo2.m0 m0Var = this.f529609d;
        com.p176xb6135e39.p177xcca8366f.p244x11d36527.p261x36337e.C2718xca2902ff R6 = m0Var.R6();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(R6, "access$getTabLayout(...)");
        oa.i O6 = wo2.m0.O6(m0Var, R6, 1003);
        if (O6 == null || (obj2 = O6.f425311a) == null) {
            return;
        }
        wo2.q qVar = (wo2.q) obj2;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[registerRedDot] TAB_NEARBY_TYPE_PERSON isShow=");
        java.lang.Integer num = null;
        sb6.append(z9Var != null ? java.lang.Boolean.valueOf(z9Var.f186860a) : null);
        sb6.append(" show_type=");
        if (z9Var != null && (f03Var2 = z9Var.f186861b) != null) {
            num = java.lang.Integer.valueOf(f03Var2.f455420d);
        }
        sb6.append(num);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NearbyActionBarUIC", sb6.toString());
        boolean z17 = z9Var != null && z9Var.f186860a;
        android.widget.ImageView imageView = qVar.f529652e;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = qVar.f529651d;
        if (!z17) {
            if ((z9Var == null || (f03Var = z9Var.f186861b) == null || f03Var.f455420d != 101) ? false : true) {
                if (c22699x3dcdb352 == null) {
                    return;
                }
                c22699x3dcdb352.setVisibility(4);
                return;
            } else {
                if (imageView != null) {
                    imageView.setVisibility(4);
                }
                if (c22699x3dcdb352 == null) {
                    return;
                }
                c22699x3dcdb352.setVisibility(((pa0.e) ((qa0.e) i95.n0.c(qa0.e.class))).wi() ? 4 : 0);
                return;
            }
        }
        r45.f03 f03Var3 = z9Var.f186861b;
        if (f03Var3 != null && f03Var3.f455420d == 101) {
            if (imageView != null) {
                imageView.setVisibility(4);
            }
            if (c22699x3dcdb352 == null) {
                return;
            }
            c22699x3dcdb352.setVisibility(0);
            return;
        }
        if (imageView != null) {
            imageView.setVisibility(0);
        }
        if (c22699x3dcdb352 == null) {
            return;
        }
        c22699x3dcdb352.setVisibility(4);
    }
}

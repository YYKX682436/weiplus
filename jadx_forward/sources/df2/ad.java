package df2;

/* loaded from: classes3.dex */
public final class ad extends if2.b {

    /* renamed from: m, reason: collision with root package name */
    public if2.d0 f311240m;

    /* renamed from: n, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.r2 f311241n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ad(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.C14197x319b1b9e store) {
        super(store);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(store, "store");
    }

    public final android.view.ViewGroup Z6() {
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) T6(com.p314xaae8f345.mm.R.id.eju, com.p314xaae8f345.mm.R.id.ejt);
        if (viewGroup == null) {
            return null;
        }
        viewGroup.setOnTouchListener(new df2.xc(this));
        return viewGroup;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onLiveActivate */
    public void mo8997x8001c97e() {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onViewMount */
    public void mo8998x9f682d55(android.view.ViewGroup pluginLayout) {
        r45.yd5 yd5Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pluginLayout, "pluginLayout");
        super.mo8998x9f682d55(pluginLayout);
        android.view.ViewGroup Z6 = Z6();
        if (Z6 != null) {
            if2.d0 d0Var = new if2.d0(Z6, new df2.vc());
            this.f372636i = new df2.wc(d0Var);
            this.f311240m = d0Var;
        }
        r45.j52 j52Var = ((mm2.c1) m56788xbba4bfc0(mm2.c1.class)).X;
        if (j52Var == null || (yd5Var = (r45.yd5) j52Var.m75936x14adae67(2)) == null) {
            return;
        }
        if (yd5Var.m75942xfb822ef2(0) == 2) {
            java.lang.String m75945x2fec8307 = yd5Var.m75945x2fec8307(1);
            if (m75945x2fec8307 == null || m75945x2fec8307.length() == 0) {
                return;
            }
            java.lang.String m75945x2fec83072 = yd5Var.m75945x2fec8307(1);
            if (m75945x2fec83072 == null) {
                m75945x2fec83072 = "";
            }
            java.lang.String str = m75945x2fec83072;
            long m75939xb282bd08 = 1000 * yd5Var.m75939xb282bd08(3);
            p3325xe03a0797.p3326xc267989b.r2 r2Var = this.f311241n;
            if (r2Var != null) {
                p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
            }
            this.f311241n = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.o(this, null, null, new df2.zc(this, str, m75939xb282bd08, null), 3, null);
        }
    }

    @Override // if2.b, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onViewUnmount */
    public void mo8999xb1ef75c(android.view.ViewGroup pluginLayout) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pluginLayout, "pluginLayout");
        this.f372636i = null;
        if2.d0 d0Var = this.f311240m;
        if (d0Var != null) {
            d0Var.d(8);
        }
        p3325xe03a0797.p3326xc267989b.r2 r2Var = this.f311241n;
        if (r2Var != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
        }
    }
}

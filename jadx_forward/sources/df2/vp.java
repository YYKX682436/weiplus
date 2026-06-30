package df2;

/* loaded from: classes10.dex */
public final class vp extends if2.b implements if2.e {

    /* renamed from: m, reason: collision with root package name */
    public mn0.b0 f313153m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f313154n;

    /* renamed from: o, reason: collision with root package name */
    public int f313155o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vp(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.C14197x319b1b9e store) {
        super(store);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(store, "store");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onViewMount */
    public void mo8998x9f682d55(android.view.ViewGroup pluginLayout) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pluginLayout, "pluginLayout");
        super.mo8998x9f682d55(pluginLayout);
        if (this.f313154n) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.o(this, null, null, new df2.up(this, null), 3, null);
    }

    @Override // if2.b, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onViewUnmount */
    public void mo8999xb1ef75c(android.view.ViewGroup pluginLayout) {
        java.lang.String str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pluginLayout, "pluginLayout");
        this.f372636i = null;
        if (!this.f313154n) {
            if (this.f313155o == 0 && this.f313153m != null) {
                this.f313155o = 1;
            }
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6681x68d4c5e2 c6681x68d4c5e2 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6681x68d4c5e2();
            int i17 = this.f313155o;
            mn0.b0 b0Var = this.f313153m;
            if (b0Var == null || (str = ((mn0.y) b0Var).f411348q) == null) {
                str = "";
            }
            long m17 = b0Var != null ? ((mn0.y) b0Var).m() : 0L;
            java.lang.String valueOf = java.lang.String.valueOf(((mm2.e1) m56788xbba4bfc0(mm2.e1.class)).f410521r.m75942xfb822ef2(0));
            ya2.b2 b17 = ya2.h.f542017a.b(((mm2.c1) m56788xbba4bfc0(mm2.c1.class)).f410385o);
            java.lang.String w07 = b17 != null ? b17.w0() : null;
            if (w07 == null) {
                w07 = "";
            }
            df2.wp.a(c6681x68d4c5e2, 1L, i17, str, m17, valueOf, w07);
            this.f313154n = true;
        }
        this.f313153m = null;
    }
}

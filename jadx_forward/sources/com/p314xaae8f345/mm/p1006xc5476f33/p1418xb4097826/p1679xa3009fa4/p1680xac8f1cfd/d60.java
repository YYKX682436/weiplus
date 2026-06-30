package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes2.dex */
public final class d60 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15477xbd78f833 f215615d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f215616e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd f215617f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d60(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15477xbd78f833 c15477xbd78f833, in5.s0 s0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd c15188xd8bd4bd) {
        super(1);
        this.f215615d = c15477xbd78f833;
        this.f215616e = s0Var;
        this.f215617f = c15188xd8bd4bd;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        float floatValue = ((java.lang.Number) obj).floatValue();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("triggerSpeedPlay change speed from ");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15477xbd78f833 c15477xbd78f833 = this.f215615d;
        sb6.append(c15477xbd78f833.f215184v);
        sb6.append(" to ");
        sb6.append(floatValue);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderSpeedControlUIC", sb6.toString());
        c15477xbd78f833.f215184v = floatValue;
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).yj("long_press_accelerate_switch", null, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15477xbd78f833.P6(c15477xbd78f833, this.f215616e, c15477xbd78f833.f215184v, false, false, true, 8, null), 1, false);
        in5.s0 V6 = c15477xbd78f833.V6();
        android.widget.TextView textView = V6 != null ? (android.widget.TextView) V6.p(com.p314xaae8f345.mm.R.id.f566398tr1) : null;
        if (textView != null) {
            textView.setText(c15477xbd78f833.m80379x76847179().getString(c15477xbd78f833.U6() ? com.p314xaae8f345.mm.R.C30867xcad56011.p5j : com.p314xaae8f345.mm.R.C30867xcad56011.f573617o20, c15477xbd78f833.b7(c15477xbd78f833.f215184v)));
        }
        float f17 = c15477xbd78f833.f215184v;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd c15188xd8bd4bd = this.f215617f;
        c15188xd8bd4bd.m61420xeb2d9731(f17);
        hc2.f1.x(c15188xd8bd4bd);
        c15477xbd78f833.f215181s.i(c15477xbd78f833.f215184v);
        c15477xbd78f833.f215179q = java.lang.System.currentTimeMillis();
        c15477xbd78f833.f215180r = c15188xd8bd4bd.mo56685x3d7f3f1d();
        return jz5.f0.f384359a;
    }
}

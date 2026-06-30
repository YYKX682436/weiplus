package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes2.dex */
public final class c60 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15477xbd78f833 f215502d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f215503e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c60(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15477xbd78f833 c15477xbd78f833, in5.s0 s0Var) {
        super(1);
        this.f215502d = c15477xbd78f833;
        this.f215503e = s0Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        long j17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1667x5faa95b.C15401xb8016041 m62197x3d6fab31;
        float floatValue = ((java.lang.Number) obj).floatValue();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("triggerSpeedPlay change speed from ");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15477xbd78f833 c15477xbd78f833 = this.f215502d;
        sb6.append(c15477xbd78f833.f215184v);
        sb6.append(" to ");
        sb6.append(floatValue);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderSpeedControlUIC", sb6.toString());
        c15477xbd78f833.f215184v = floatValue;
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).yj("long_press_accelerate_switch", null, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15477xbd78f833.P6(c15477xbd78f833, this.f215503e, c15477xbd78f833.f215184v, false, false, true, 8, null), 1, false);
        in5.s0 s0Var = this.f215503e;
        android.widget.TextView textView = (android.widget.TextView) s0Var.p(com.p314xaae8f345.mm.R.id.f566398tr1);
        if (textView != null) {
            textView.setText(c15477xbd78f833.m80379x76847179().getString(c15477xbd78f833.U6() ? com.p314xaae8f345.mm.R.C30867xcad56011.p5j : com.p314xaae8f345.mm.R.C30867xcad56011.f573617o20, c15477xbd78f833.b7(c15477xbd78f833.f215184v)));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15324x3354d808 c15324x3354d808 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15324x3354d808) s0Var.p(com.p314xaae8f345.mm.R.id.fs6);
        if (c15324x3354d808 != null && (m62197x3d6fab31 = c15324x3354d808.m62197x3d6fab31()) != null) {
            m62197x3d6fab31.m62722xa6fb01c1(c15477xbd78f833.f215184v);
            hc2.f1.x(m62197x3d6fab31);
        }
        c15477xbd78f833.f215181s.i(c15477xbd78f833.f215184v);
        c15477xbd78f833.f215179q = java.lang.System.currentTimeMillis();
        so2.j5 j5Var = (so2.j5) s0Var.f374658i;
        java.lang.Integer valueOf = j5Var != null ? java.lang.Integer.valueOf(j5Var.h()) : null;
        if (valueOf != null && valueOf.intValue() == 4) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f c15196x85976f5f = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f) s0Var.p(com.p314xaae8f345.mm.R.id.e_k);
            zy2.g5 videoView = c15196x85976f5f != null ? c15196x85976f5f.getVideoView() : null;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd c15188xd8bd4bd = videoView instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd) videoView : null;
            if (c15188xd8bd4bd != null) {
                j17 = c15188xd8bd4bd.mo56685x3d7f3f1d();
                c15477xbd78f833.f215180r = j17;
                return jz5.f0.f384359a;
            }
        }
        j17 = 0;
        c15477xbd78f833.f215180r = j17;
        return jz5.f0.f384359a;
    }
}

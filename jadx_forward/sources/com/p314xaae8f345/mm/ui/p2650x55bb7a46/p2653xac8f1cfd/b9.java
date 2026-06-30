package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

/* JADX INFO: Access modifiers changed from: package-private */
@yn.c(m177365x976763e5 = sb5.j0.class)
/* loaded from: classes11.dex */
public class b9 extends com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a implements sb5.j0 {

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 f280256g;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f280254e = null;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f280255f = null;

    /* renamed from: h, reason: collision with root package name */
    public boolean f280257h = false;

    /* renamed from: i, reason: collision with root package name */
    public final l75.q0 f280258i = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.c9(this);

    public void C() {
        kr4.e y07;
        java.lang.String m78394x7e63ed49 = this.f280113d.f542250l.m78394x7e63ed49("key_w1w_nickname");
        if (m78394x7e63ed49 == null || m78394x7e63ed49.isEmpty()) {
            gr4.f fVar = (gr4.f) i95.n0.c(gr4.f.class);
            java.lang.String sessionId = this.f280113d.u().d1();
            fr4.g0 g0Var = (fr4.g0) fVar;
            g0Var.getClass();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sessionId, "sessionId");
            kr4.n nVar = g0Var.f347357h;
            java.lang.String z07 = nVar != null ? nVar.z0(sessionId) : "";
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(z07, "")) {
                m78394x7e63ed49 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ndd);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m78394x7e63ed49, "getString(...)");
            } else {
                kr4.k kVar = g0Var.f347356g;
                m78394x7e63ed49 = (kVar == null || (y07 = kVar.y0(z07)) == null) ? null : y07.f68901x21f9b213;
                if (m78394x7e63ed49 == null) {
                    m78394x7e63ed49 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ndd);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m78394x7e63ed49, "getString(...)");
                }
            }
        }
        this.f280113d.f542250l.mo78695xbf7c1df6(m78394x7e63ed49);
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, yn.l
    public void E() {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19666xfd6e2f33 c19666xfd6e2f33 = ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.jb) ((sb5.s0) this.f280113d.f542241c.a(sb5.s0.class))).f280796e;
        if (c19666xfd6e2f33 == null || !s()) {
            return;
        }
        com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19636xc6b37291 m75443xe6828c7b = c19666xfd6e2f33.m75443xe6828c7b();
        if (m75443xe6828c7b != null) {
            m75443xe6828c7b.mo75349x4a374107(false);
            m75443xe6828c7b.j();
        }
        c19666xfd6e2f33.post(new java.lang.Runnable() { // from class: com.tencent.mm.ui.chatting.component.b9$$a
            @Override // java.lang.Runnable
            public final void run() {
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.b9.this.n0();
            }
        });
    }

    @Override // sb5.j0
    public java.lang.String H() {
        return this.f280255f;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, yn.l
    public void J() {
        if (s()) {
            ((fr4.g0) ((gr4.f) i95.n0.c(gr4.f.class))).wi(this.f280113d.u().d1());
            ((fr4.g0) ((gr4.f) i95.n0.c(gr4.f.class))).Bi().mo49775xc84af884(this.f280258i);
            java.lang.String m78394x7e63ed49 = this.f280113d.f542250l.m78394x7e63ed49("key_w1w_refer_scene");
            java.lang.String m78394x7e63ed492 = this.f280113d.f542250l.m78394x7e63ed49("key_w1w_refer_scene_note");
            java.lang.String m78394x7e63ed493 = this.f280113d.f542250l.m78394x7e63ed49("key_w1w_refer_session_id");
            java.lang.String m78394x7e63ed494 = this.f280113d.f542250l.m78394x7e63ed49("key_w1w_refer_ext_info");
            if (!s() || this.f280255f == null) {
                return;
            }
            ((fr4.g0) ((gr4.f) i95.n0.c(gr4.f.class))).cj(vu4.d.f521829i, m78394x7e63ed49, m78394x7e63ed492, m78394x7e63ed493, m78394x7e63ed494, this.f280255f, vu4.e.f521840f, "", "", this.f280113d.u().d1(), this.f280257h ? vu4.g.f521857f : vu4.g.f521856e);
        }
    }

    public void m0(int i17) {
        android.view.ViewGroup f17 = this.f280113d.p().f();
        if (!(f17.getTag(com.p314xaae8f345.mm.R.id.bgd) instanceof java.lang.Integer)) {
            f17.setTag(com.p314xaae8f345.mm.R.id.bgd, java.lang.Integer.valueOf(i17));
            f17.setPadding(f17.getPaddingLeft(), f17.getPaddingTop() + i17, f17.getPaddingRight(), f17.getPaddingBottom());
            return;
        }
        int intValue = ((java.lang.Integer) f17.getTag(com.p314xaae8f345.mm.R.id.bgd)).intValue();
        if (i17 != intValue) {
            int i18 = i17 - intValue;
            f17.setTag(com.p314xaae8f345.mm.R.id.bgd, java.lang.Integer.valueOf(i18));
            f17.setPadding(f17.getPaddingLeft(), f17.getPaddingTop() + i18, f17.getPaddingRight(), f17.getPaddingBottom());
        }
    }

    public final void n0() {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19666xfd6e2f33 c19666xfd6e2f33 = ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.jb) ((sb5.s0) this.f280113d.f542241c.a(sb5.s0.class))).f280796e;
        boolean booleanValue = this.f280113d.f542250l.m78383x21a1233e("key_w1w_need_choose_id", false).booleanValue();
        java.lang.String t17 = this.f280113d.t();
        boolean z17 = this.f280113d.f542250l.m78383x21a1233e("key_w1w_avatar_style", false).booleanValue() || com.p314xaae8f345.mm.p2621x8fb0427b.z3.K4(t17);
        if (c19666xfd6e2f33 == null || !s()) {
            return;
        }
        com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19636xc6b37291 m75443xe6828c7b = c19666xfd6e2f33.m75443xe6828c7b();
        if (m75443xe6828c7b != null) {
            m75443xe6828c7b.mo75349x4a374107(false);
            m75443xe6828c7b.j();
        }
        java.lang.String str = ((fr4.g0) ((gr4.f) i95.n0.c(gr4.f.class))).f347358i.f68901x21f9b213;
        if (str == null) {
            str = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ndd);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "getString(...)");
        }
        if (booleanValue) {
            c19666xfd6e2f33.m75484x51676efd(this.f280113d.u().d1());
            c19666xfd6e2f33.o1(t17, java.lang.Boolean.valueOf(z17), this.f280113d.g().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573550ey1, str), java.lang.Boolean.valueOf(booleanValue));
            return;
        }
        c19666xfd6e2f33.m1(t17, java.lang.Boolean.valueOf(z17), str);
        android.view.ViewGroup viewGroup = c19666xfd6e2f33.F1;
        if (viewGroup != null) {
            viewGroup.setOnClickListener(null);
        }
    }

    @Override // sb5.j0
    public boolean s() {
        return com.p314xaae8f345.mm.p2621x8fb0427b.z3.J4(this.f280113d.x());
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, yn.l
    public void x() {
        if (s()) {
            java.lang.String m78394x7e63ed49 = this.f280113d.f542250l.m78394x7e63ed49("key_w1w_refer_scene");
            java.lang.String m78394x7e63ed492 = this.f280113d.f542250l.m78394x7e63ed49("key_w1w_refer_scene_note");
            java.lang.String m78394x7e63ed493 = this.f280113d.f542250l.m78394x7e63ed49("key_w1w_refer_session_id");
            java.lang.String m78394x7e63ed494 = this.f280113d.f542250l.m78394x7e63ed49("key_w1w_refer_ext_info");
            boolean booleanValue = this.f280113d.f542250l.m78383x21a1233e("key_w1w_conv_is_hello", false).booleanValue();
            this.f280257h = booleanValue;
            vu4.g gVar = booleanValue ? vu4.g.f521857f : vu4.g.f521856e;
            gr4.f fVar = (gr4.f) i95.n0.c(gr4.f.class);
            ((fr4.g0) fVar).cj(vu4.d.f521825e, m78394x7e63ed49, m78394x7e63ed492, m78394x7e63ed493, m78394x7e63ed494, this.f280255f, vu4.e.f521840f, mr4.a.a("message_input:message_input") + "$" + mr4.a.a("message_avatar:message_avatar") + "$" + mr4.a.a("more:more"), "", this.f280113d.x(), gVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0082  */
    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, yn.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void z() {
        /*
            Method dump skipped, instructions count: 537
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.b9.z():void");
    }
}

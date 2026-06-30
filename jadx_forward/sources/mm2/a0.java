package mm2;

/* loaded from: classes3.dex */
public final class a0 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f410270a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ mm2.e0 f410271b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r45.ch1 f410272c;

    public a0(java.lang.String str, mm2.e0 e0Var, r45.ch1 ch1Var) {
        this.f410270a = str;
        this.f410271b = e0Var;
        this.f410272c = ch1Var;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        if (fVar.f152148a == 0 && fVar.f152149b == 0) {
            return jz5.f0.f384359a;
        }
        r45.zm6 zm6Var = (r45.zm6) ((r45.tp2) fVar.f152151d).m75936x14adae67(7);
        if (zm6Var != null && zm6Var.m75933x41a8a7f2(1)) {
            java.lang.String m75945x2fec8307 = zm6Var.m75945x2fec8307(0);
            if (!(m75945x2fec8307 == null || m75945x2fec8307.length() == 0)) {
                db5.t7.m123883x26a183b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, zm6Var.m75945x2fec8307(0), 0).show();
            }
        }
        java.lang.String tag = this.f410270a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tag, "tag");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(tag, "localLikeLog ".concat("cgi failed, revert like op"));
        lm2.h0 h0Var = this.f410271b.f410509s;
        r45.zi1 zi1Var = null;
        if (h0Var == null) {
            return null;
        }
        r45.zi1 zi1Var2 = new r45.zi1();
        r45.ch1 ch1Var = this.f410272c;
        com.p314xaae8f345.mm.p2495xc50a8b8b.g m75934xbce7f2f = ch1Var.m75934xbce7f2f(4);
        byte[] g17 = m75934xbce7f2f != null ? m75934xbce7f2f.g() : null;
        if (g17 != null) {
            try {
                zi1Var2.mo11468x92b714fd(g17);
                zi1Var = zi1Var2;
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.a("safeParser", "", e17);
            }
        }
        if (zi1Var != null) {
            int i17 = zi1Var.f473618f;
            int i18 = qs5.u.f448004a;
            if (i17 == 1) {
                zi1Var.f473618f = 2;
                zi1Var.f473619g--;
            } else if (i17 == 2) {
                zi1Var.f473618f = 1;
                zi1Var.f473619g++;
            }
            zi1Var.f473619g = java.lang.Math.max(0, zi1Var.f473619g);
        }
        return java.lang.Boolean.valueOf(h0Var.h(ch1Var));
    }
}

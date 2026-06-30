package gg2;

/* loaded from: classes2.dex */
public final class q extends gg2.b {

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f353241b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(tc2.g store) {
        super(store);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(store, "store");
        this.f353241b = "LiveExpTwelveItem";
    }

    /* JADX WARN: Removed duplicated region for block: B:125:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    @Override // gg2.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(android.view.View r46, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r47) {
        /*
            Method dump skipped, instructions count: 1117
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: gg2.q.a(android.view.View, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // gg2.b
    public int c() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.dr7;
    }

    @Override // gg2.b
    public int e() {
        p3325xe03a0797.p3326xc267989b.p3328x30012e.j2 j2Var;
        r45.bc2 bc2Var;
        bg2.h4 h4Var = (bg2.h4) this.f353197a.a(bg2.h4.class);
        return (h4Var == null || (j2Var = h4Var.f101672i) == null || (bc2Var = (r45.bc2) ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) j2Var).mo144003x754a37bb()) == null || ((r45.wk5) bc2Var.m75936x14adae67(1)) == null) ? -1 : 3;
    }

    @Override // gg2.b
    public java.lang.String f() {
        p3325xe03a0797.p3326xc267989b.p3328x30012e.j2 j2Var;
        r45.bc2 bc2Var;
        r45.wk5 wk5Var;
        java.lang.String m75945x2fec8307;
        bg2.h4 h4Var = (bg2.h4) this.f353197a.a(bg2.h4.class);
        if (h4Var == null || (j2Var = h4Var.f101672i) == null || (bc2Var = (r45.bc2) ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) j2Var).mo144003x754a37bb()) == null) {
            return "";
        }
        if (((r45.px3) bc2Var.m75936x14adae67(0)) != null) {
            r45.px3 px3Var = (r45.px3) bc2Var.m75936x14adae67(0);
            if (px3Var == null || (m75945x2fec8307 = px3Var.m75945x2fec8307(1)) == null) {
                return "";
            }
        } else if (((r45.wk5) bc2Var.m75936x14adae67(1)) == null || (wk5Var = (r45.wk5) bc2Var.m75936x14adae67(1)) == null || (m75945x2fec8307 = wk5Var.m75945x2fec8307(0)) == null) {
            return "";
        }
        return m75945x2fec8307;
    }

    @Override // gg2.b
    public int g() {
        return 12;
    }

    @Override // gg2.b
    public java.lang.String i() {
        return this.f353241b;
    }
}

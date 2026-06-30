package et1;

/* loaded from: classes12.dex */
public abstract class a implements et1.l {

    /* renamed from: d, reason: collision with root package name */
    public et1.l f338096d;

    @Override // et1.l
    public w11.m1 b(w11.r1 r1Var) {
        w11.m1 b17 = q().b(r1Var);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(b17, "createLocationCgi(...)");
        return b17;
    }

    @Override // et1.l
    public w11.m1 c(w11.r1 r1Var) {
        w11.m1 c17 = q().c(r1Var);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "createVideoCgi(...)");
        return c17;
    }

    @Override // et1.l
    public w11.m1 f(w11.r1 r1Var) {
        w11.m1 f17 = q().f(r1Var);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(f17, "createCdnImageCgi(...)");
        return f17;
    }

    @Override // et1.l
    public w11.m1 h(w11.r1 r1Var) {
        w11.m1 h17 = q().h(r1Var);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(h17, "createShareCardCgi(...)");
        return h17;
    }

    @Override // et1.l
    public w11.m1 i(w11.r1 r1Var) {
        w11.m1 i17 = q().i(r1Var);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(i17, "createImageCgi(...)");
        return i17;
    }

    @Override // et1.l
    public w11.m1 l(w11.r1 r1Var) {
        w11.m1 l17 = q().l(r1Var);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(l17, "createEmojiCgi(...)");
        return l17;
    }

    @Override // et1.l
    public w11.m1 m(w11.r1 r1Var) {
        w11.m1 m17 = q().m(r1Var);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m17, "createTextCgi(...)");
        return m17;
    }

    @Override // et1.l
    public void n() {
        q().n();
    }

    public abstract boolean o(w11.r1 r1Var);

    public final synchronized et1.l q() {
        et1.l lVar;
        if (this.f338096d == null) {
            ((px.f0) ((qx.i0) i95.n0.c(qx.i0.class))).getClass();
            this.f338096d = new et1.f(this);
        }
        lVar = this.f338096d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(lVar);
        return lVar;
    }

    public abstract int r();

    public abstract java.lang.String s(java.lang.String str);

    public abstract java.lang.String t(java.lang.String str);

    public void u(java.lang.String str, int i17, int i18, java.lang.String str2, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
    }
}

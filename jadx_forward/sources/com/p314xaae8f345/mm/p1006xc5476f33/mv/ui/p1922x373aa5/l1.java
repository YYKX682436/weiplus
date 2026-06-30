package com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5;

/* loaded from: classes5.dex */
public final class l1 implements ck5.e {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.C16688x2f31b8ec f233422d;

    public l1(com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.C16688x2f31b8ec c16688x2f31b8ec) {
        this.f233422d = c16688x2f31b8ec;
    }

    @Override // ck5.e
    public void R5(java.lang.String text) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(text, "text");
    }

    @Override // ck5.e
    public void c1(java.lang.String text) {
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.f1 f1Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(text, "text");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Music.MusicMvCommentFooter", "InputTextBoundaryCheck ok, ready to send, text:".concat(text));
        boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(text);
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.C16688x2f31b8ec c16688x2f31b8ec = this.f233422d;
        if (!K0 && (f1Var = c16688x2f31b8ec.f233187n) != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.g0) f1Var).a(text, "");
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e017 = c16688x2f31b8ec.f233180d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c22621x7603e017);
        c22621x7603e017.setText("");
    }

    @Override // ck5.e
    public void w0(java.lang.String text) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(text, "text");
        db5.e1.i(this.f233422d.getContext(), com.p314xaae8f345.mm.R.C30867xcad56011.f574792jh1, com.p314xaae8f345.mm.R.C30867xcad56011.f574794jh3);
    }
}

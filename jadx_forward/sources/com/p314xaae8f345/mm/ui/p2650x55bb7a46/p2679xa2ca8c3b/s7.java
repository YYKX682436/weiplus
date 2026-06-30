package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* loaded from: classes9.dex */
public final class s7 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.s7 f287027a = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.s7();

    public final boolean a(java.lang.String tag, android.view.View view, yb5.d ui6, com.p314xaae8f345.mm.p2621x8fb0427b.f9 msg) {
        jz5.f0 f0Var;
        zy2.d dVar;
        r45.hd2 hd2Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tag, "tag");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ui6, "ui");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        ot0.q v17 = ot0.q.v(msg.U1());
        if (v17 == null || (dVar = (zy2.d) v17.y(zy2.d.class)) == null || (hd2Var = dVar.f558904b) == null) {
            f0Var = null;
        } else {
            java.lang.String m75945x2fec8307 = hd2Var.m75945x2fec8307(3);
            if (m75945x2fec8307 == null || m75945x2fec8307.length() == 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(tag, "onItemClick: error, themeId is " + m75945x2fec8307);
                return true;
            }
            uc.n nVar = (uc.n) i95.n0.c(uc.n.class);
            android.app.Activity g17 = ui6.g();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(g17, "getContext(...)");
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("KEY_SHARE_TYPE", com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(msg.Q0()) ? 2 : 1);
            ((v40.s) nVar).Bi(g17, intent, m75945x2fec8307);
            f0Var = jz5.f0.f384359a;
        }
        if (f0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(tag, "onItemClick: data is null");
        }
        return true;
    }
}

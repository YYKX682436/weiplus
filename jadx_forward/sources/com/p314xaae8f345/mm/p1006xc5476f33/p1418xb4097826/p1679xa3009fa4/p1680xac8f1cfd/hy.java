package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes2.dex */
public class hy extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 {

    /* renamed from: d, reason: collision with root package name */
    public r45.xs2 f216210d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f216211e;

    /* renamed from: f, reason: collision with root package name */
    public final ey2.t0 f216212f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hy(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f216211e = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.gy(this));
        p012xc85e97e9.p093xedfae76a.c1 a17 = pf5.u.f435469a.e(c61.l7.class).a(ey2.t0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
        this.f216212f = (ey2.t0) a17;
    }

    public java.lang.String O6() {
        return "FinderEntrance";
    }

    public boolean P6() {
        boolean f07 = ((c61.l7) i95.n0.c(c61.l7.class)).nk().f0();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.RedDotUIJumpUIC", "[isIgnore] isEnableShowEntranceRedDot=" + f07);
        return !f07;
    }

    public void Q6() {
        int c17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.ta.f187412a.c("Finder.TlTabStateVM", ((c61.l7) i95.n0.c(c61.l7.class)).nk(), "FinderEntrance");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.RedDotUIJumpUIC", "[markHardRefresh] aliveType=" + c17);
        this.f216212f.N6(c17).a(ey2.q0.f339005e);
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onCreateBefore */
    public void mo2277xb2f1ab1a(android.os.Bundle bundle) {
        java.lang.String str;
        r45.xs2 xs2Var;
        r45.pc1 pc1Var;
        java.lang.String m75945x2fec8307;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb jbVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb) ((jz5.n) this.f216211e).mo141623x754a37bb();
        this.f216210d = jbVar != null ? jbVar.N : null;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("enterCtrlInfoExt=");
        sb6.append(this.f216210d != null);
        sb6.append(" enter_action=");
        r45.xs2 xs2Var2 = this.f216210d;
        sb6.append(xs2Var2 != null ? java.lang.Integer.valueOf(xs2Var2.m75939xb282bd08(13)) : null);
        sb6.append(" jump_config=");
        r45.xs2 xs2Var3 = this.f216210d;
        r45.pc1 pc1Var2 = xs2Var3 != null ? (r45.pc1) xs2Var3.m75936x14adae67(18) : null;
        if (pc1Var2 == null) {
            str = "";
        } else {
            str = "miniapp_path=" + pc1Var2.m75945x2fec8307(1) + ", miniapp_scene=" + pc1Var2.m75939xb282bd08(3) + ", miniapp_username=" + pc1Var2.m75945x2fec8307(0) + "web_url=" + pc1Var2.m75945x2fec8307(2);
        }
        sb6.append(str);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.RedDotUIJumpUIC", sb6.toString());
        if (P6() || (xs2Var = this.f216210d) == null || (pc1Var = (r45.pc1) xs2Var.m75936x14adae67(18)) == null) {
            return;
        }
        r45.xs2 xs2Var4 = this.f216210d;
        if (xs2Var4 != null && xs2Var4.m75939xb282bd08(13) == 6) {
            java.lang.String m75945x2fec83072 = pc1Var.m75945x2fec8307(2);
            if (m75945x2fec83072 != null) {
                if (!(m75945x2fec83072.length() > 0)) {
                    m75945x2fec83072 = null;
                }
                if (m75945x2fec83072 != null) {
                    Q6();
                    i95.m c17 = i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0.class);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                    p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 context = m158354x19263085();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.ActivityRouter", "[enterWebViewForRedDot] url=".concat(m75945x2fec83072));
                    android.content.Intent intent = new android.content.Intent();
                    intent.putExtra("rawUrl", m75945x2fec83072);
                    j45.l.j(context, "webview", ".ui.tools.WebViewUI", intent, null);
                    return;
                }
                return;
            }
            return;
        }
        r45.xs2 xs2Var5 = this.f216210d;
        if (!(xs2Var5 != null && xs2Var5.m75939xb282bd08(13) == 7) || (m75945x2fec8307 = pc1Var.m75945x2fec8307(0)) == null) {
            return;
        }
        java.lang.String str2 = m75945x2fec8307.length() > 0 ? m75945x2fec8307 : null;
        if (str2 != null) {
            Q6();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0 i0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0.class);
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 context2 = m158354x19263085();
            java.lang.String m75945x2fec83073 = pc1Var.m75945x2fec8307(1);
            java.lang.String str3 = m75945x2fec83073 != null ? m75945x2fec83073 : "";
            int m75939xb282bd08 = pc1Var.m75939xb282bd08(3);
            i0Var.getClass();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context2, "context");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.ActivityRouter", "[enterWeAppForRedDot] appId=" + str2 + " enterPath=" + str3 + " scene=" + m75939xb282bd08);
            l81.b1 b1Var = new l81.b1();
            b1Var.f398545a = str2;
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            b1Var.f398555f = str3;
            b1Var.f398565k = m75939xb282bd08;
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.xc) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6.class))).bj(context2, b1Var);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hy(p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 fragment) {
        super(fragment);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fragment, "fragment");
        this.f216211e = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.gy(this));
        p012xc85e97e9.p093xedfae76a.c1 a17 = pf5.u.f435469a.e(c61.l7.class).a(ey2.t0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
        this.f216212f = (ey2.t0) a17;
    }
}

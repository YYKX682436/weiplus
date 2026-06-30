package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44;

/* loaded from: classes2.dex */
public final class z1 {

    /* renamed from: a, reason: collision with root package name */
    public final p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 f206374a;

    /* renamed from: b, reason: collision with root package name */
    public final jz5.g f206375b;

    /* renamed from: c, reason: collision with root package name */
    public final jz5.g f206376c;

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f206377d;

    public z1(android.view.View header, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(header, "header");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f206374a = activity;
        this.f206375b = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44.y1(header));
        this.f206376c = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44.u1(this));
        this.f206377d = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44.v1(this));
    }

    public final void a(java.lang.String username, ya2.b2 b2Var) {
        r45.xk xkVar;
        java.lang.String string;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.l2 l2Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.l2) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.p2.f205634r.get(username);
        if (l2Var == null) {
            l2Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.l2(0, 0, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, 0, null, null, null, null, null, null, null, null, -1, 1, null);
        }
        boolean m60126x74219ae7 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.mj0) ((zy2.qb) i95.n0.c(zy2.qb.class))).m60126x74219ae7();
        r45.fw0 fw0Var = l2Var.f205451g;
        jz5.g gVar = this.f206376c;
        jz5.f0 f0Var = null;
        if (fw0Var != null) {
            java.util.LinkedList m75941xfb821914 = fw0Var.m75941xfb821914(0);
            if (m75941xfb821914 != null) {
                if (!((m75941xfb821914.isEmpty() ^ true) && !m60126x74219ae7)) {
                    m75941xfb821914 = null;
                }
                if (m75941xfb821914 != null) {
                    java.lang.String m75945x2fec8307 = ((r45.xk) m75941xfb821914.get(0)).m75945x2fec8307(0);
                    if (!(!(m75945x2fec8307 == null || m75945x2fec8307.length() == 0))) {
                        m75941xfb821914 = null;
                    }
                    if (m75941xfb821914 != null && (xkVar = (r45.xk) m75941xfb821914.get(0)) != null) {
                        android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) ((jz5.n) gVar).mo141623x754a37bb();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(relativeLayout, "<get-finderMediaEntrance>(...)");
                        ym5.a1.h(relativeLayout, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44.w1(b2Var, xkVar, this, username));
                        ((android.widget.RelativeLayout) ((jz5.n) gVar).mo141623x754a37bb()).setVisibility(0);
                        android.widget.TextView textView = (android.widget.TextView) ((jz5.n) this.f206377d).mo141623x754a37bb();
                        java.lang.String m75945x2fec83072 = xkVar.m75945x2fec8307(6);
                        if (m75945x2fec83072 == null || m75945x2fec83072.length() == 0) {
                            string = this.f206374a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ey_, xkVar.m75945x2fec8307(1));
                        } else {
                            string = xkVar.m75945x2fec8307(6) + ": " + xkVar.m75945x2fec8307(1);
                        }
                        textView.setText(string);
                        ((android.widget.RelativeLayout) ((jz5.n) gVar).mo141623x754a37bb()).setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44.x1(b2Var, xkVar, this, username));
                        f0Var = jz5.f0.f384359a;
                    }
                }
            }
        }
        if (f0Var == null) {
            ((android.widget.RelativeLayout) ((jz5.n) gVar).mo141623x754a37bb()).setVisibility(8);
        }
    }
}

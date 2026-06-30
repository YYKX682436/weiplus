package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44;

/* loaded from: classes2.dex */
public final class i2 {

    /* renamed from: a, reason: collision with root package name */
    public final p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 f206107a;

    /* renamed from: b, reason: collision with root package name */
    public final jz5.g f206108b;

    /* renamed from: c, reason: collision with root package name */
    public final jz5.g f206109c;

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f206110d;

    public i2(android.view.View header, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(header, "header");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f206107a = activity;
        this.f206108b = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44.h2(header));
        this.f206109c = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44.e2(this));
        this.f206110d = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44.f2(this));
    }

    public final void a(java.lang.String source, java.lang.String username, ya2.b2 b2Var) {
        r45.fw0 fw0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderProfileHeaderUIC", "[handleMIniProgramList] source:".concat(source));
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.l2 l2Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.l2) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.p2.f205634r.get(username);
        jz5.f0 f0Var = null;
        java.util.LinkedList m75941xfb821914 = (l2Var == null || (fw0Var = l2Var.f205451g) == null) ? null : fw0Var.m75941xfb821914(1);
        boolean m60126x74219ae7 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.mj0) ((zy2.qb) i95.n0.c(zy2.qb.class))).m60126x74219ae7();
        jz5.g gVar = this.f206109c;
        ((android.widget.LinearLayout) ((jz5.n) gVar).mo141623x754a37bb()).setVisibility(8);
        java.util.LinkedList linkedList = ((m75941xfb821914 == null || m75941xfb821914.isEmpty()) || m60126x74219ae7) ? false : true ? m75941xfb821914 : null;
        if (linkedList != null) {
            boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b("onSceneEnd:[NetSceneFinderUserPage]", source);
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = this.f206107a;
            if (b17) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3 o3Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class);
                java.lang.String m75945x2fec8307 = ((r45.ch2) linkedList.get(0)).m75945x2fec8307(0);
                if (m75945x2fec8307 == null) {
                    m75945x2fec8307 = "";
                }
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
                o3Var.Ak(5, username, "", m75945x2fec8307, ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class)).V6());
            }
            ((android.widget.TextView) ((jz5.n) this.f206110d).mo141623x754a37bb()).setText(activity.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ez9, ((r45.ch2) linkedList.get(0)).m75945x2fec8307(2)));
            ((android.widget.LinearLayout) ((jz5.n) gVar).mo141623x754a37bb()).setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44.g2(username, linkedList, this, b2Var));
            ((android.widget.LinearLayout) ((jz5.n) gVar).mo141623x754a37bb()).setVisibility(0);
            f0Var = jz5.f0.f384359a;
        }
        if (f0Var == null) {
            ((android.widget.LinearLayout) ((jz5.n) gVar).mo141623x754a37bb()).setVisibility(8);
        }
    }
}

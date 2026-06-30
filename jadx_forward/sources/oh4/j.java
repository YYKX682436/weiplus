package oh4;

/* loaded from: classes8.dex */
public final class j extends lh4.h {

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f427006m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f427007n;

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f427008o;

    /* renamed from: p, reason: collision with root package name */
    public final jz5.g f427009p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(android.content.Context context, lh4.b callback, int i17) {
        super(context, callback, i17, null, 0);
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1271x2e97505b.p1272x373aa5.AbstractC12879x228c0db6 c12881xbe3683d3;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        this.f427006m = jz5.h.b(oh4.d.f426998d);
        this.f427007n = jz5.h.b(oh4.c.f426997d);
        this.f427008o = jz5.h.b(new oh4.g(this));
        this.f427009p = jz5.h.b(new oh4.f(this));
        gp1.q m151402x143f1b92 = m151402x143f1b92();
        int m151401x2f939950 = m151401x2f939950();
        android.widget.FrameLayout parent = m145776x329d8f10();
        ip1.q qVar = (ip1.q) m151402x143f1b92;
        qVar.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AudioPanelTaskBarController", "createContentView style: " + m151401x2f939950 + ", parent: " + parent + ", " + qVar.hashCode());
        if (m151401x2f939950 == 0) {
            ((rk4.p6) ((qk.e9) i95.n0.c(qk.e9.class))).aj(rk4.l.f478339e);
            c12881xbe3683d3 = new com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1271x2e97505b.p1272x373aa5.C12881xbe3683d3(context);
        } else if (m151401x2f939950 == 1) {
            ((ku5.t0) ku5.t0.f394148d).q(ip1.m.f375125d);
            ((rk4.p6) ((qk.e9) i95.n0.c(qk.e9.class))).aj(rk4.l.f478340f);
            c12881xbe3683d3 = ((ef0.y2) ((qk.o8) i95.n0.c(qk.o8.class))).mj() ? new com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1271x2e97505b.p1272x373aa5.C12883xfb6c00a4(context, null) : new com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1271x2e97505b.p1272x373aa5.C12882xfb6c00a3(context, null);
        } else if (m151401x2f939950 != 2) {
            ((rk4.p6) ((qk.e9) i95.n0.c(qk.e9.class))).aj(rk4.l.f478339e);
            c12881xbe3683d3 = new com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1271x2e97505b.p1272x373aa5.C12881xbe3683d3(context);
        } else {
            ((rk4.p6) ((qk.e9) i95.n0.c(qk.e9.class))).aj(rk4.l.f478341g);
            c12881xbe3683d3 = new com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1271x2e97505b.p1272x373aa5.C12880x474fa32c(context, null);
        }
        jz5.g gVar = ip1.q.f375140l;
        qk.u8 u8Var = (qk.u8) ((jz5.n) gVar).mo141623x754a37bb();
        ip1.h hVar = ip1.q.f375137i;
        ((ef0.j3) u8Var).Ai(hVar);
        ((ef0.j3) ((qk.u8) ((jz5.n) gVar).mo141623x754a37bb())).wi(hVar);
        qk.u8 u8Var2 = (qk.u8) ((jz5.n) gVar).mo141623x754a37bb();
        jz5.g gVar2 = ip1.q.f375138j;
        ip1.k listener = (ip1.k) ((jz5.n) gVar2).mo141623x754a37bb();
        ef0.j3 j3Var = (ef0.j3) u8Var2;
        j3Var.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(listener, "listener");
        j3Var.f333775f.remove(listener);
        qk.u8 u8Var3 = (qk.u8) ((jz5.n) gVar).mo141623x754a37bb();
        ip1.k listener2 = (ip1.k) ((jz5.n) gVar2).mo141623x754a37bb();
        ef0.j3 j3Var2 = (ef0.j3) u8Var3;
        j3Var2.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(listener2, "listener");
        j3Var2.f333775f.add(listener2);
        ip1.q.f375131c = true;
        ip1.q.f375130b = c12881xbe3683d3;
        a(c12881xbe3683d3);
        gp1.q m151402x143f1b922 = m151402x143f1b92();
        oh4.a aVar = new oh4.a(callback);
        ((ip1.q) m151402x143f1b922).getClass();
        ip1.q.f375135g = aVar;
        kp1.l1 l1Var = ip1.q.f375130b;
        if (l1Var != null) {
            l1Var.mo54044xb95266ab(aVar);
        }
        gp1.q m151402x143f1b923 = m151402x143f1b92();
        oh4.b bVar = new oh4.b(this);
        ((ip1.q) m151402x143f1b923).getClass();
        ip1.q.f375134f = bVar;
        gp1.q m151402x143f1b924 = m151402x143f1b92();
        int m151401x2f9399502 = m151401x2f939950();
        ((ip1.q) m151402x143f1b924).getClass();
        if (m151401x2f9399502 != 1) {
            return;
        }
        ((ku5.t0) ku5.t0.f394148d).q(ip1.o.f375127d);
    }

    /* renamed from: getAudioPanelShowStyle */
    private final int m151401x2f939950() {
        return ((java.lang.Number) ((jz5.n) this.f427007n).mo141623x754a37bb()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getController */
    public final gp1.q m151402x143f1b92() {
        java.lang.Object mo141623x754a37bb = ((jz5.n) this.f427006m).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        return (gp1.q) mo141623x754a37bb;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getNoticeTitleTextView */
    public final android.widget.TextView m151403x194e98bc() {
        return (android.widget.TextView) ((jz5.n) this.f427009p).mo141623x754a37bb();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getTingRedDotArea */
    public final android.view.View m151404x74bcf229() {
        return (android.view.View) ((jz5.n) this.f427008o).mo141623x754a37bb();
    }

    @Override // lh4.h
    public void c() {
        kp1.l1 l1Var;
        ((ip1.q) m151402x143f1b92()).getClass();
        if (ip1.q.f375131c && (l1Var = ip1.q.f375130b) != null) {
            l1Var.d();
        }
    }

    @Override // lh4.h
    public java.lang.String f() {
        pv.z zVar = (pv.z) i95.n0.c(pv.z.class);
        android.content.Context context = getContext();
        int wi6 = ((ov.b) ((pv.z) i95.n0.c(pv.z.class))).wi();
        ((ov.b) zVar).getClass();
        if (context == null) {
            context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        }
        if (wi6 == 2) {
            java.lang.String string = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.mc9);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
            return string;
        }
        java.lang.String string2 = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.l8r);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
        return string2;
    }
}

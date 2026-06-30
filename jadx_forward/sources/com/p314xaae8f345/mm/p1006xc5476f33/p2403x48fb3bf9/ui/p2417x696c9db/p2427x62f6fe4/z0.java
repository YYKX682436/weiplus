package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2427x62f6fe4;

/* loaded from: classes11.dex */
public final class z0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2427x62f6fe4.a1 f267379d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bw5.pq0 f267380e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ bw5.lq0 f267381f;

    public z0(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2427x62f6fe4.a1 a1Var, bw5.kq0 kq0Var, bw5.pq0 pq0Var, bw5.lq0 lq0Var, bw5.mq0 mq0Var) {
        this.f267379d = a1Var;
        this.f267380e = pq0Var;
        this.f267381f = lq0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        bw5.lp0 lp0Var;
        java.lang.String str;
        b66.n a17;
        b66.n a18;
        int i17 = this.f267380e.f113341d;
        int i18 = this.f267381f.f111463d;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2427x62f6fe4.a1 a1Var = this.f267379d;
        if (i18 == a1Var.f267275e) {
            return;
        }
        a1Var.f267275e = i18;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2427x62f6fe4.b1 b1Var = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2427x62f6fe4.b1.f267279a;
        ((ef0.f2) ((qk.h8) i95.n0.c(qk.h8.class))).getClass();
        int f17 = rk4.k5.f(i18);
        if (f17 < 0) {
            return;
        }
        b66.h hVar = b66.i.f99700d;
        java.lang.String standAloneId = a1Var.f267274d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(standAloneId, "standAloneId");
        b66.g gVar = (b66.g) p3380x6a61f93.p3382xf513feca.C30532x21b415b4.m169657x21ba281f(standAloneId);
        if (gVar == null || (a18 = ((b66.i) gVar).a()) == null || (lp0Var = ((b66.q) a18).g()) == null) {
            lp0Var = new bw5.lp0();
        }
        long k17 = (gVar == null || (a17 = ((b66.i) gVar).a()) == null) ? 0L : a17.k();
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5722xb16ab0f4 c5722xb16ab0f4 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5722xb16ab0f4();
        am.jk jkVar = c5722xb16ab0f4.f136045g;
        jkVar.f88568a = 2;
        jkVar.f88569b = f17;
        b21.r rVar = new b21.r();
        rVar.E = lp0Var.b();
        rVar.N = false;
        rVar.V = false;
        rVar.U = true;
        jkVar.f88570c = rVar;
        jkVar.f88573f = rk4.m.f478367a.a(qk.ia.f445702e.a(i17));
        jkVar.f88572e = k17;
        if (i18 >= 0) {
            il4.l lVar = il4.l.f373675a;
            switch (i18) {
                case 1:
                    str = "prepare";
                    break;
                case 2:
                    str = "ready";
                    break;
                case 3:
                    str = "playstart";
                    break;
                case 4:
                    str = "playend";
                    break;
                case 5:
                    str = "pause";
                    break;
                case 6:
                    str = "resume";
                    break;
                case 7:
                    str = "bufferstart";
                    break;
                case 8:
                    str = "bufferend";
                    break;
                case 9:
                    str = "seekstart";
                    break;
                case 10:
                    str = "seekend";
                    break;
                case 11:
                    str = "stop";
                    break;
                case 12:
                    str = "error";
                    break;
                case 13:
                    str = "preempted";
                    break;
                default:
                    str = com.p159x477cd522.p160x333422.C1461x7397cc93.f4739x19d1382a;
                    break;
            }
            jkVar.f88580m = str;
        }
        c5722xb16ab0f4.b(android.os.Looper.getMainLooper());
    }
}

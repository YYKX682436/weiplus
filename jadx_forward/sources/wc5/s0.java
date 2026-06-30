package wc5;

/* loaded from: classes10.dex */
public final class s0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wc5.y0 f526171d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f526172e;

    public s0(wc5.y0 y0Var, java.lang.String str) {
        this.f526171d = y0Var;
        this.f526172e = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        wc5.y0 y0Var = this.f526171d;
        java.lang.String sugTextList = this.f526172e;
        try {
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            int N3 = ((com.p314xaae8f345.mm.p2621x8fb0427b.g9) c01.d9.b().u()).N3(((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2660x373fe494.ActivityC21814x1938a8b3) y0Var.U6()).j7());
            qk.x7 x7Var = (qk.x7) i95.n0.c(qk.x7.class);
            java.lang.String j76 = ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2660x373fe494.ActivityC21814x1938a8b3) y0Var.U6()).j7();
            c61.ec ecVar = (c61.ec) x7Var;
            ecVar.getClass();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sugTextList, "sugTextList");
            f65.o.f341446b = j76;
            f65.o.f341448d = -1;
            f65.o.f341449e = sugTextList;
            f65.o.f341452h = N3;
            ecVar.Bi(1);
            p3321xbce91901.C29043x91b2b43d.m143895xf1229813(jz5.f0.f384359a);
        } catch (java.lang.Throwable th6) {
            p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6));
        }
    }
}

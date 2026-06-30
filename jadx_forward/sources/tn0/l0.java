package tn0;

/* loaded from: classes3.dex */
public final class l0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ un0.h f502250d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f502251e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.g0 f502252f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ tn0.w0 f502253g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(un0.h hVar, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, p3321xbce91901.jvm.p3324x21ffc6bd.g0 g0Var, tn0.w0 w0Var) {
        super(1);
        this.f502250d = hVar;
        this.f502251e = h0Var;
        this.f502252f = g0Var;
        this.f502253g = w0Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        is0.c cVar = (is0.c) obj;
        if (un0.s.f510951b != null) {
            un0.h hVar = this.f502250d;
            boolean booleanValue = ((java.lang.Boolean) hVar.f510897m.mo152xb9724478()).booleanValue();
            p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = this.f502251e;
            tn0.w0 w0Var = this.f502253g;
            if (booleanValue) {
                android.graphics.Bitmap bitmap = hVar.f510889e;
                long j17 = hVar.f510890f;
                if (bitmap != null) {
                    java.lang.Object obj2 = h0Var.f391656d;
                    java.lang.Boolean bool = java.lang.Boolean.TRUE;
                    boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(obj2, bool);
                    p3321xbce91901.jvm.p3324x21ffc6bd.g0 g0Var = this.f502252f;
                    if (!b17 || g0Var.f391654d != j17) {
                        w0Var.N0(bitmap, 1);
                        w0Var.d0(true);
                        h0Var.f391656d = bool;
                        g0Var.f391654d = j17;
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiveCore", "#startScreenCastPreview set isLastFramePause true");
                    }
                }
            } else {
                java.lang.Object obj3 = h0Var.f391656d;
                java.lang.Boolean bool2 = java.lang.Boolean.FALSE;
                if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(obj3, bool2)) {
                    w0Var.d0(false);
                    h0Var.f391656d = bool2;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiveCore", "#startScreenCastPreview set isLastFramePause false");
                }
                if (cVar != null) {
                    android.opengl.EGLContext mo8977xe0fe423b = w0Var.f502305s.mo8977xe0fe423b();
                    if (mo8977xe0fe423b != null) {
                        int i17 = cVar.f375928e;
                        int i18 = cVar.f375933m;
                        int i19 = cVar.f375934n;
                        long currentTimeMillis = java.lang.System.currentTimeMillis();
                        long j18 = w0Var.I1;
                        if (currentTimeMillis >= j18) {
                            if (currentTimeMillis - j18 < 33) {
                                w0Var.I1 = j18 + 33;
                            } else {
                                w0Var.I1 = currentTimeMillis + 16;
                            }
                            w0Var.s0(mo8977xe0fe423b, i17, i18, i19, 0L, false);
                        }
                    } else {
                        if (w0Var.f502310x) {
                            hn0.g gVar = fn0.g.f345729b;
                            if (gVar != null) {
                                ((vd2.l5) gVar).wi("startScreenCastPreview_1", false);
                            }
                            w0Var.f502310x = false;
                        }
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LiveCore", "#startScreenCastPreview glContext is null!");
                    }
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LiveCore", "#startScreenCastPreview glTextureObject is null!");
                }
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LiveCore", "#startScreenCastPreview runningRecorder->isScreenCastRunning == false");
        }
        return jz5.f0.f384359a;
    }
}

package nj1;

/* loaded from: classes5.dex */
public final class f implements sh1.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f419352a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f419353b;

    public f(p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var2) {
        this.f419352a = h0Var;
        this.f419353b = h0Var2;
    }

    @Override // sh1.g
    public void a(int i17, int i18) {
        if (i17 <= 0 || i18 <= 0) {
            return;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.f0();
        f0Var.f391649d = i17;
        if (i17 > 4096) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SkylineNativeViewFactoryRichText", "width:" + f0Var.f391649d + " exceed the limit.");
            f0Var.f391649d = 4096;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var2 = new p3321xbce91901.jvm.p3324x21ffc6bd.f0();
        f0Var2.f391649d = i18;
        if (i18 > 4096) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SkylineNativeViewFactoryRichText", "height:" + f0Var2.f391649d + " exceed the limit.");
            f0Var2.f391649d = 4096;
        }
        ik1.h0.b(new nj1.d(f0Var, f0Var2, this.f419352a, this.f419353b));
    }

    @Override // sh1.g
    public void b(java.lang.String params) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(params, "params");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SkylineNativeViewFactoryRichText", "operateWithParams params:".concat(params));
    }

    @Override // sh1.g
    public void c(java.lang.String params) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(params, "params");
        ik1.h0.b(new nj1.c(this.f419353b, this.f419352a, params));
    }

    @Override // sh1.g
    public void d(java.lang.String params) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(params, "params");
        ik1.h0.b(new nj1.e(params, this.f419352a, this.f419353b));
    }

    @Override // sh1.g
    /* renamed from: onTouchEvent */
    public void mo45013x667eb1da(android.view.MotionEvent motionEvent) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(motionEvent, "motionEvent");
    }

    @Override // sh1.g
    /* renamed from: pause */
    public void mo45014x65825f6() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SkylineNativeViewFactoryRichText", "pause");
    }

    @Override // sh1.g
    /* renamed from: resume */
    public void mo45015xc84dc82d() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SkylineNativeViewFactoryRichText", "resume");
    }
}

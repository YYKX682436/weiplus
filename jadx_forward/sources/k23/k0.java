package k23;

/* loaded from: classes12.dex */
public final class k0 implements k23.k1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k23.v0 f385144a;

    public k0(k23.v0 v0Var) {
        this.f385144a = v0Var;
    }

    @Override // k23.k1
    public void a() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSFloatingVoiceInputViewModel", "[modeswitch] onKeyboardClick");
        k23.k1 k1Var = this.f385144a.f385264z;
        if (k1Var != null) {
            k1Var.a();
        }
    }

    @Override // k23.d1
    public void b() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSFloatingVoiceInputViewModel", "[modeswitch] onMoveToRecognize");
        k23.v0 v0Var = this.f385144a;
        k23.x xVar = v0Var.f385248j;
        if (xVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("recognizingPanel");
            throw null;
        }
        xVar.m141841x765082ba(false);
        k23.k1 k1Var = v0Var.f385264z;
        if (k1Var != null) {
            k1Var.b();
        }
    }

    @Override // k23.d1
    public void c() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSFloatingVoiceInputViewModel", "[modeswitch] onTouchDown");
        k23.v0 v0Var = this.f385144a;
        k23.v0.c(v0Var);
        k23.k1 k1Var = v0Var.f385264z;
        if (k1Var != null) {
            k1Var.c();
        }
    }

    @Override // k23.k1
    public void d(k23.f0 newMode) {
        k23.k1 k1Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(newMode, "newMode");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[modeswitch] onModeSwitch: ");
        sb6.append(newMode);
        sb6.append(", isTriggeredByConfig=");
        k23.v0 v0Var = this.f385144a;
        sb6.append(v0Var.A);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSFloatingVoiceInputViewModel", sb6.toString());
        if (v0Var.A || (k1Var = v0Var.f385264z) == null) {
            return;
        }
        k1Var.d(newMode);
    }

    @Override // k23.d1
    public void e() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSFloatingVoiceInputViewModel", "[modeswitch] onMoveUpwardToCancel");
        k23.v0 v0Var = this.f385144a;
        v0Var.H();
        k23.x xVar = v0Var.f385248j;
        if (xVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("recognizingPanel");
            throw null;
        }
        xVar.m141841x765082ba(true);
        k23.k1 k1Var = v0Var.f385264z;
        if (k1Var != null) {
            k1Var.e();
        }
    }

    @Override // k23.k1
    public void f() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSFloatingVoiceInputViewModel", "[modeswitch] onUploadClick");
        k23.k1 k1Var = this.f385144a.f385264z;
        if (k1Var != null) {
            k1Var.f();
        }
    }

    @Override // k23.d1
    public void g(boolean z17) {
        k23.v0 v0Var = this.f385144a;
        if (v0Var.f385255q) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSFloatingVoiceInputViewModel", "[modeswitch] onTouchUp: isCanceling=" + z17);
            if (z17) {
                k23.v0.a(v0Var);
            } else {
                k23.v0.b(v0Var);
            }
            k23.k1 k1Var = v0Var.f385264z;
            if (k1Var != null) {
                k1Var.g(z17);
            }
        }
    }
}

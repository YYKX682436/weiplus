package k23;

/* loaded from: classes12.dex */
public final class p0 implements k23.d1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k23.v0 f385182a;

    public p0(k23.v0 v0Var) {
        this.f385182a = v0Var;
    }

    @Override // k23.d1
    public void b() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSFloatingVoiceInputViewModel", "[ftsvoiceinput] onMoveToRecognize");
        k23.x xVar = this.f385182a.f385248j;
        if (xVar != null) {
            xVar.m141841x765082ba(false);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("recognizingPanel");
            throw null;
        }
    }

    @Override // k23.d1
    public void c() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSFloatingVoiceInputViewModel", "[ftsvoiceinput] onTouchDown");
        k23.v0.c(this.f385182a);
    }

    @Override // k23.d1
    public void e() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSFloatingVoiceInputViewModel", "[ftsvoiceinput] onMoveUpwardToCancel");
        k23.v0 v0Var = this.f385182a;
        v0Var.H();
        k23.x xVar = v0Var.f385248j;
        if (xVar != null) {
            xVar.m141841x765082ba(true);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("recognizingPanel");
            throw null;
        }
    }

    @Override // k23.d1
    public void g(boolean z17) {
        k23.v0 v0Var = this.f385182a;
        if (v0Var.f385255q) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSFloatingVoiceInputViewModel", "[ftsvoiceinput] onTouchUp: isCanceling:" + z17);
            if (z17) {
                k23.v0.a(v0Var);
            } else {
                k23.v0.b(v0Var);
            }
        }
    }
}

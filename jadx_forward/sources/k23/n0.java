package k23;

/* loaded from: classes12.dex */
public final class n0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k23.v0 f385157d;

    public n0(k23.v0 v0Var) {
        this.f385157d = v0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("finishRecognizeTimeoutTask onResult, ");
        k23.v0 v0Var = this.f385157d;
        sb6.append(v0Var.f385242d);
        sb6.append(", ");
        sb6.append(v0Var.f385243e);
        sb6.append(", scene=");
        k23.d0 d0Var = v0Var.f385240b;
        if (d0Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("params");
            throw null;
        }
        sb6.append(d0Var.f385081e);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSFloatingVoiceInputViewModel", sb6.toString());
        v0Var.f385251m = false;
        if (v0Var.f385242d.length() > 0) {
            k23.v0.x(this.f385157d, 6, "{\"voiceId\":\"" + v0Var.f385243e + "\"}", null, 4, null);
        } else {
            k23.v0.x(this.f385157d, 7, "{\"errorCode\":-2;\"errMsg\":\"empty text\";\"voiceId\":\"" + v0Var.f385243e + "\"}", null, 4, null);
        }
        k23.d0 d0Var2 = v0Var.f385240b;
        if (d0Var2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("params");
            throw null;
        }
        k23.v2 v2Var = d0Var2.f385079c;
        if (v2Var != null) {
            v2Var.b(v0Var.f385242d, v0Var.f385243e);
        }
        k23.d0 d0Var3 = v0Var.f385240b;
        if (d0Var3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("params");
            throw null;
        }
        if (d0Var3.f385081e != k23.w0.f385267d) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSFloatingVoiceInputViewModel", "finishRecognizeTimeoutTask: hideRecognizingPanel for non-TEACH_PAGE_MAIN scene");
            v0Var.s();
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSFloatingVoiceInputViewModel", "finishRecognizeTimeoutTask: skip hideRecognizingPanel for TEACH_PAGE_MAIN scene");
        }
        v0Var.z();
    }
}

package b03;

/* loaded from: classes11.dex */
public final class y implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b03.a0 f16870d;

    public y(b03.a0 a0Var) {
        this.f16870d = a0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        b03.a0 a0Var = this.f16870d;
        a0Var.f16821a.f58169h = b03.a0.a(a0Var);
        com.tencent.mm.autogen.mmdata.rpt.FlutterEngineGroupMemInfoStruct flutterEngineGroupMemInfoStruct = a0Var.f16821a;
        flutterEngineGroupMemInfoStruct.f58167f = flutterEngineGroupMemInfoStruct.f58169h;
    }
}

package b03;

/* loaded from: classes11.dex */
public final class w implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b03.a0 f16868d;

    public w(b03.a0 a0Var) {
        this.f16868d = a0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        b03.a0 a0Var = this.f16868d;
        a0Var.f16821a.f58170i = b03.a0.a(a0Var);
        com.tencent.mm.autogen.mmdata.rpt.FlutterEngineGroupMemInfoStruct flutterEngineGroupMemInfoStruct = a0Var.f16821a;
        flutterEngineGroupMemInfoStruct.f58168g = flutterEngineGroupMemInfoStruct.f58170i;
        flutterEngineGroupMemInfoStruct.f58174m = 11;
        flutterEngineGroupMemInfoStruct.f58175n = a0Var.f16822b;
        flutterEngineGroupMemInfoStruct.f58171j = pi0.q.f354694t;
        flutterEngineGroupMemInfoStruct.f58172k = pi0.q.f354695u;
        flutterEngineGroupMemInfoStruct.f58173l = pi0.q.f354696v;
        flutterEngineGroupMemInfoStruct.k();
    }
}

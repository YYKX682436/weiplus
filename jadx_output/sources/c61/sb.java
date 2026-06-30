package c61;

/* loaded from: classes8.dex */
public final class sb implements io.flutter.plugin.common.MethodChannel.MethodCallHandler {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c61.tb f39297d;

    public sb(c61.tb tbVar) {
        this.f39297d = tbVar;
    }

    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public final void onMethodCall(io.flutter.plugin.common.MethodCall call, io.flutter.plugin.common.MethodChannel.Result result) {
        boolean z17;
        kotlin.jvm.internal.o.g(call, "call");
        kotlin.jvm.internal.o.g(result, "result");
        c61.tb tbVar = this.f39297d;
        tbVar.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.FlutterSettingSwitchPlugin", "onMethodCall: " + call.method);
        if (!kotlin.jvm.internal.o.b(call.method, "getUseSeparateSendButton")) {
            result.notImplemented();
            return;
        }
        tbVar.getClass();
        try {
            java.lang.Object l17 = gm0.j1.u().c().l(66832, java.lang.Boolean.FALSE);
            kotlin.jvm.internal.o.e(l17, "null cannot be cast to non-null type kotlin.Boolean");
            z17 = ((java.lang.Boolean) l17).booleanValue();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.FlutterSettingSwitchPlugin", e17, "getUseSeparateSendButton failed", new java.lang.Object[0]);
            z17 = false;
        }
        result.success(java.lang.Boolean.valueOf(!z17));
    }
}

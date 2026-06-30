package com.tencent.mm.console;

/* loaded from: classes11.dex */
public final /* synthetic */ class p0$$h implements com.tencent.mm.console.g5 {
    @Override // com.tencent.mm.console.g5
    public final void a(android.content.Intent intent) {
        io.flutter.embedding.engine.FlutterEngine flutterEngine;
        pi0.q qVar = ((e50.z0) ((f50.y) i95.n0.c(f50.y.class))).f249558e;
        if (qVar == null || (flutterEngine = qVar.f354701e) == null) {
            return;
        }
        io.flutter.embedding.engine.dart.DartExecutor dartExecutor = flutterEngine.getDartExecutor();
        kotlin.jvm.internal.o.f(dartExecutor, "getDartExecutor(...)");
        new com.tencent.pigeon.weapm.WeAPMFlutterApi(dartExecutor, null, 2, null).reportFluencySummaryInfo(e50.v0.f249547d);
    }
}

package com.tencent.mm.console;

/* loaded from: classes11.dex */
public final /* synthetic */ class p0$$g implements com.tencent.mm.console.g5 {
    @Override // com.tencent.mm.console.g5
    public final void a(android.content.Intent intent) {
        java.util.LinkedList linkedList;
        java.util.LinkedList linkedList2;
        io.flutter.embedding.engine.FlutterEngine flutterEngine;
        e50.z0 z0Var = (e50.z0) ((f50.y) i95.n0.c(f50.y.class));
        pi0.q qVar = z0Var.f249558e;
        if (qVar != null && (flutterEngine = qVar.f354701e) != null) {
            io.flutter.embedding.engine.dart.DartExecutor dartExecutor = flutterEngine.getDartExecutor();
            kotlin.jvm.internal.o.f(dartExecutor, "getDartExecutor(...)");
            new com.tencent.pigeon.weapm.WeAPMFlutterApi(dartExecutor, null, 2, null).startFluencyTracker(e50.w0.f249548d);
        }
        pi0.q qVar2 = z0Var.f249558e;
        if (qVar2 != null && (linkedList2 = qVar2.f354702f) != null) {
            java.util.Iterator it = linkedList2.iterator();
            while (it.hasNext()) {
                io.flutter.embedding.engine.dart.DartExecutor dartExecutor2 = ((pi0.u0) it.next()).f354731b.getDartExecutor();
                kotlin.jvm.internal.o.f(dartExecutor2, "getDartExecutor(...)");
                new com.tencent.pigeon.weapm.WeAPMFlutterApi(dartExecutor2, null, 2, null).startFluencyTracker(e50.x0.f249549d);
            }
        }
        pi0.q qVar3 = z0Var.f249558e;
        if (qVar3 != null && (linkedList = qVar3.f354703g) != null) {
            java.util.Iterator it6 = linkedList.iterator();
            while (it6.hasNext()) {
                io.flutter.embedding.engine.dart.DartExecutor dartExecutor3 = ((pi0.u) it6.next()).f354727a.getDartExecutor();
                kotlin.jvm.internal.o.f(dartExecutor3, "getDartExecutor(...)");
                new com.tencent.pigeon.weapm.WeAPMFlutterApi(dartExecutor3, null, 2, null).startFluencyTracker(e50.y0.f249553d);
            }
        }
        pi0.q qVar4 = z0Var.f249558e;
        if (qVar4 == null) {
            return;
        }
        qVar4.f354715s = true;
    }
}

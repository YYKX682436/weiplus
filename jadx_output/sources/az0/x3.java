package az0;

/* loaded from: classes5.dex */
public final class x3 extends qz5.l implements yz5.p {
    public x3(kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new az0.x3(continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return new az0.x3((kotlin.coroutines.Continuation) obj2).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mars.xlog.Log.i("MicroMsg.MaasManager", "new camo session on thread: " + java.lang.Thread.currentThread().getName());
        az0.i5 i5Var = az0.i5.f15557a;
        boolean z17 = ((h62.d) i5Var.p()).nj(new com.tencent.mm.repairer.config.mjpublisher.shoot_composing.RepairerConfigShootComposingMD5Check()) == 1;
        boolean z18 = ((h62.d) i5Var.p()).nj(new com.tencent.mm.repairer.config.mjpublisher.shoot_composing.RepairerConfigShootComposingLayersRenderStats()) == 1;
        com.tencent.maas.camstudio.MJCamoSession j17 = (z17 || z18) ? i5Var.q().j(new android.os.Handler(android.os.Looper.getMainLooper()), az0.i5.a(i5Var), new com.tencent.maas.camstudio.MJCamInitParam(z17, z18)) : i5Var.q().i(new android.os.Handler(android.os.Looper.getMainLooper()), az0.i5.a(i5Var));
        if (j17 != null) {
            return new az0.xb(j17);
        }
        return null;
    }
}

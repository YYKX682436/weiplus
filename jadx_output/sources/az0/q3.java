package az0;

/* loaded from: classes5.dex */
public final class q3 extends qz5.l implements yz5.p {
    public q3(kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new az0.q3(continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return new az0.q3((kotlin.coroutines.Continuation) obj2).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pp0.p0 p0Var;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        kotlinx.coroutines.l.f(null, new az0.p3(null), 1, null);
        az0.i5 i5Var = az0.i5.f15557a;
        float f17 = az0.i5.f15558b;
        if (f17 >= 0.0d) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MaasManager", "device cpu score: " + f17);
            i5Var.q().t("kFAAnalysisCpuScore", java.lang.String.valueOf(f17));
        }
        float f18 = az0.i5.f15559c;
        if (f18 >= 0.0d) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MaasManager", "device gpu score: " + f18);
            i5Var.q().t("kFAAnalysisGpuScore", java.lang.String.valueOf(f18));
        }
        if (((h62.d) i5Var.p()).nj(new com.tencent.mm.repairer.config.mjpublisher.shoot_composing.RepairerConfigShootComposingBeautyScript()) == 1) {
            i5Var.q().t("CSUseBeautyScript", "1");
        } else {
            i5Var.q().t("CSUseBeautyScript", "0");
        }
        if (((h62.d) i5Var.p()).nj(new com.tencent.mm.repairer.config.mjpublisher.shoot_composing.RepairerConfigShootComposingGanMarker()) == 1) {
            i5Var.q().t("kBUEnableBeautyScriptDebug", "1");
        } else {
            i5Var.q().t("kBUEnableBeautyScriptDebug", "0");
        }
        int nj6 = ((h62.d) i5Var.p()).nj(new com.tencent.mm.repairer.config.mjpublisher.shoot_composing.RepairerConfigShootComposingGanSmoothCpuScore());
        int nj7 = ((h62.d) i5Var.p()).nj(new com.tencent.mm.repairer.config.mjpublisher.shoot_composing.RepairerConfigShootComposingGanSmoothGpuScore());
        boolean z17 = f17 >= ((float) nj6) && f18 >= ((float) nj7);
        boolean z18 = ((h62.d) i5Var.p()).nj(new com.tencent.mm.repairer.config.mjpublisher.shoot_composing.RepairerConfigShootComposingGanSmooth()) == 1;
        com.tencent.mars.xlog.Log.i("MicroMsg.MaasManager", "[enableGanSmoothFromExpr] cpuScoreThreshold:" + nj6 + ", gpuScoreThreshold:" + nj7 + ", isDeviceOk:" + z17 + ", enable:" + z18);
        if (z17 && z18) {
            i5Var.q().t("CSEnableGanSmooth", "1");
            i5Var.q().t("GanGpuDevice", "1.0");
        } else {
            i5Var.q().t("CSEnableGanSmooth", "0");
        }
        if (((h62.d) i5Var.p()).nj(new com.tencent.mm.repairer.config.mjpublisher.shoot_composing.RepairerConfigShootComposingBeautySkinSegment()) == 1) {
            i5Var.q().t("kCSEnableBeautySkinSeg", "1");
        } else {
            i5Var.q().t("kCSEnableBeautySkinSeg", "0");
        }
        if (((h62.d) i5Var.p()).nj(new com.tencent.mm.repairer.config.mjpublisher.shoot_composing.RepairerConfigShootComposingBeautySeparatedOcc()) == 1) {
            i5Var.q().t("kCSEnableSeparatedOccForMakeup", "1");
        } else {
            i5Var.q().t("kCSEnableSeparatedOccForMakeup", "0");
        }
        if (((h62.d) i5Var.p()).nj(new com.tencent.mm.repairer.config.mjpublisher.shoot_composing.RepairerConfigShootAlgoGrade()) == 1) {
            for (java.util.Map.Entry entry : ((java.util.HashMap) ((p05.v2) ((rh0.x) i95.n0.c(rh0.x.class))).Ai(rh0.z.f395618o)).entrySet()) {
                com.tencent.mars.xlog.Log.i("MicroMsg.MaasManager", "Device algo config: " + ((java.lang.String) entry.getKey()) + " = " + ((java.lang.String) entry.getValue()));
                i5Var.q().t((java.lang.String) entry.getKey(), (java.lang.String) entry.getValue());
            }
        }
        az0.w2 w2Var = az0.w2.f15991d;
        if (!w2Var.d() || w2Var.a() == null) {
            az0.i5 i5Var2 = az0.i5.f15557a;
            p0Var = (az0.s9) kotlinx.coroutines.l.f(null, new az0.w3(null), 1, null);
            if (p0Var == null) {
                return null;
            }
            az0.i5.f15575s = p0Var;
        } else {
            az0.i5 i5Var3 = az0.i5.f15557a;
            p0Var = (az0.xb) kotlinx.coroutines.l.f(null, new az0.y3(null), 1, null);
            if (p0Var == null) {
                return null;
            }
            az0.i5.f15575s = p0Var;
        }
        return p0Var;
    }
}

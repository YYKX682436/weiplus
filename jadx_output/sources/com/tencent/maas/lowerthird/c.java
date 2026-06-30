package com.tencent.maas.lowerthird;

/* loaded from: classes5.dex */
public class c extends com.tencent.maas.lowerthird.MJLowerThirdImageGeneratorCallback$BaseCallback {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.maas.lowerthird.b f48217a;

    public c(com.tencent.maas.lowerthird.MJLowerThirdImageGenerator mJLowerThirdImageGenerator, com.tencent.maas.lowerthird.b bVar) {
        super(mJLowerThirdImageGenerator);
        this.f48217a = bVar;
    }

    @Override // com.tencent.maas.lowerthird.MJLowerThirdImageGeneratorCallback$BaseCallback
    public void onInvoke(com.tencent.maas.lowerthird.MJLowerThirdImageGenerator mJLowerThirdImageGenerator, java.lang.Object obj) {
        com.tencent.maas.lowerthird.MJLowerThirdImageGeneratorCallback$MJLowerThirdImageGeneratorCallbackArg.ImageCompleteArg imageCompleteArg = (com.tencent.maas.lowerthird.MJLowerThirdImageGeneratorCallback$MJLowerThirdImageGeneratorCallbackArg.ImageCompleteArg) obj;
        com.tencent.maas.lowerthird.b bVar = this.f48217a;
        if (bVar == null || imageCompleteArg == null) {
            return;
        }
        ((hf2.m0) bVar).f281114a.a(imageCompleteArg.bitmap);
    }
}

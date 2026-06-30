package com.tencent.mm.feature.lite;

/* loaded from: classes15.dex */
public class f1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.lite.g1 f67152d;

    public f1(com.tencent.mm.feature.lite.g1 g1Var) {
        this.f67152d = g1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (com.tencent.mm.app.w.INSTANCE.f53889n) {
            return;
        }
        com.tencent.mm.feature.lite.g1 g1Var = this.f67152d;
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppFeatureService", "preloadLiteApp real release, appId:%s, engineId:%s, appUuid:%s, path:%s", g1Var.f67155d, java.lang.Integer.valueOf(g1Var.f67156e), java.lang.Long.valueOf(this.f67152d.f67157f), this.f67152d.f67158g);
        com.tencent.mm.feature.lite.g1 g1Var2 = this.f67152d;
        g1Var2.f67159h.Yj(g1Var2.f67155d, g1Var2.f67158g);
    }
}

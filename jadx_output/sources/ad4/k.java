package ad4;

/* loaded from: classes3.dex */
public final class k extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f3187d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(java.lang.String str, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f3187d = str;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveImageDownloadUtil$removeTask$1");
        ad4.k kVar = new ad4.k(this.f3187d, continuation);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveImageDownloadUtil$removeTask$1");
        return kVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveImageDownloadUtil$removeTask$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveImageDownloadUtil$removeTask$1");
        ad4.k kVar = (ad4.k) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        kVar.invokeSuspend(f0Var);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveImageDownloadUtil$removeTask$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveImageDownloadUtil$removeTask$1");
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveImageDownloadUtil$removeTask$1");
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        java.util.Iterator it = ad4.l.a().entrySet().iterator();
        while (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            if (r26.n0.D((java.lang.CharSequence) entry.getKey(), this.f3187d, false, 2, null)) {
                it.remove();
                com.tencent.mars.xlog.Log.i("MicroMsg.ImproveImageDownloadUtil", "delay removeTask task id:" + ((java.lang.String) entry.getKey()));
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getCancelTask$p", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveImageDownloadUtil");
                java.util.HashMap hashMap = ad4.l.f3189b;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getCancelTask$p", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveImageDownloadUtil");
                java.lang.Object key = entry.getKey();
                ku5.u0 u0Var = ku5.t0.f312615d;
                ad4.j jVar = new ad4.j(entry);
                ku5.t0 t0Var = (ku5.t0) u0Var;
                t0Var.getClass();
                wu5.c w17 = t0Var.w(jVar, 7000L, null);
                kotlin.jvm.internal.o.f(w17, "computeDelay(...)");
                hashMap.put(key, w17);
            }
        }
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveImageDownloadUtil$removeTask$1");
        return f0Var;
    }
}

package ad4;

/* loaded from: classes3.dex */
public final class h extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f3184d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f3185e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(java.lang.String str, java.lang.String str2, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f3184d = str;
        this.f3185e = str2;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveImageDownloadUtil$addTask$1");
        ad4.h hVar = new ad4.h(this.f3184d, this.f3185e, continuation);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveImageDownloadUtil$addTask$1");
        return hVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveImageDownloadUtil$addTask$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveImageDownloadUtil$addTask$1");
        ad4.h hVar = (ad4.h) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        hVar.invokeSuspend(f0Var);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveImageDownloadUtil$addTask$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveImageDownloadUtil$addTask$1");
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveImageDownloadUtil$addTask$1");
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        java.util.HashMap a17 = ad4.l.a();
        java.lang.String str = this.f3184d;
        java.lang.String str2 = this.f3185e;
        a17.put(str, str2);
        com.tencent.mars.xlog.Log.i("MicroMsg.ImproveImageDownloadUtil", "addTask feedMediaId:" + str + " task id:" + str2);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getCancelTask$p", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveImageDownloadUtil");
        java.util.HashMap hashMap = ad4.l.f3189b;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getCancelTask$p", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveImageDownloadUtil");
        java.util.Iterator it = hashMap.entrySet().iterator();
        while (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            if (kotlin.jvm.internal.o.b(entry.getKey(), str2)) {
                it.remove();
                ((wu5.c) entry.getValue()).cancel(true);
                com.tencent.mars.xlog.Log.i("MicroMsg.ImproveImageDownloadUtil", "cancel task id:" + str2);
            }
        }
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveImageDownloadUtil$addTask$1");
        return f0Var;
    }
}

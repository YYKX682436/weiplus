package b64;

/* loaded from: classes4.dex */
public final class c1 implements w44.a {

    /* renamed from: a, reason: collision with root package name */
    public final long f18165a;

    public c1(long j17) {
        this.f18165a = j17;
    }

    @Override // w44.a
    public void a(java.lang.String event, org.json.JSONObject data) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.liteapp.jsapi.LiteAppJsEvent");
        kotlin.jvm.internal.o.g(event, "event");
        kotlin.jvm.internal.o.g(data, "data");
        long j17 = this.f18165a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onEvent", "com.tencent.mm.plugin.sns.ad.liteapp.jsapi.LiteAppEventSender");
        try {
            ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).Vj(j17, event, data);
        } catch (java.lang.Throwable unused) {
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onEvent", "com.tencent.mm.plugin.sns.ad.liteapp.jsapi.LiteAppEventSender");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.liteapp.jsapi.LiteAppJsEvent");
    }
}

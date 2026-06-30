package com.tencent.matrix.resource.processor;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/tencent/matrix/resource/processor/NativeLazyForkAnalyzeProcessorV2$receiver$2$1", "Landroid/content/BroadcastReceiver;", "matrix-resource-canary-android_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes12.dex */
public final class NativeLazyForkAnalyzeProcessorV2$receiver$2$1 extends android.content.BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public volatile boolean f52967a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ cj.w f52968b;

    public NativeLazyForkAnalyzeProcessorV2$receiver$2$1(cj.w wVar) {
        this.f52968b = wVar;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        if (!kotlin.jvm.internal.o.b(intent != null ? intent.getAction() : null, "android.intent.action.SCREEN_OFF")) {
            if (!kotlin.jvm.internal.o.b(intent != null ? intent.getAction() : null, "com.tencent.matrix.force.analyze")) {
                if (kotlin.jvm.internal.o.b(intent != null ? intent.getAction() : null, "android.intent.action.SCREEN_ON")) {
                    this.f52967a = false;
                    return;
                }
                return;
            }
        }
        this.f52967a = true;
        if (ih.d.c()) {
            ((android.os.Handler) ((jz5.n) this.f52968b.f41847d.f41850f).getValue()).post(new cj.v(this));
        } else {
            oj.j.b("Matrix.LeakProcessor.NativeLazyForkAnalyze", "onReceive: Matrix NOT installed yet", new java.lang.Object[0]);
        }
    }
}

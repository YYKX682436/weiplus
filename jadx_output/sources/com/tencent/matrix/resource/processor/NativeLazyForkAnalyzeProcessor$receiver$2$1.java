package com.tencent.matrix.resource.processor;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/tencent/matrix/resource/processor/NativeLazyForkAnalyzeProcessor$receiver$2$1", "Landroid/content/BroadcastReceiver;", "matrix-resource-canary-android_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes12.dex */
public final class NativeLazyForkAnalyzeProcessor$receiver$2$1 extends android.content.BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public volatile boolean f52965a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ cj.q f52966b;

    public NativeLazyForkAnalyzeProcessor$receiver$2$1(cj.q qVar) {
        this.f52966b = qVar;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        if (!kotlin.jvm.internal.o.b(intent != null ? intent.getAction() : null, "android.intent.action.SCREEN_OFF")) {
            if (!kotlin.jvm.internal.o.b(intent != null ? intent.getAction() : null, "com.tencent.matrix.force.analyze")) {
                if (kotlin.jvm.internal.o.b(intent != null ? intent.getAction() : null, "android.intent.action.SCREEN_ON")) {
                    this.f52965a = false;
                    return;
                }
                return;
            }
        }
        this.f52965a = true;
        if (ih.d.c()) {
            ((android.os.Handler) ((jz5.n) this.f52966b.f41840d.f41843f).getValue()).post(new cj.p(this));
        } else {
            oj.j.b("Matrix.LeakProcessor.NativeLazyForkAnalyze", "onReceive: Matrix NOT installed yet", new java.lang.Object[0]);
        }
    }
}

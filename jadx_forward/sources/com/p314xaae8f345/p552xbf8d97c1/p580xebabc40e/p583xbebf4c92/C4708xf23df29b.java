package com.p314xaae8f345.p552xbf8d97c1.p580xebabc40e.p583xbebf4c92;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/tencent/matrix/resource/processor/NativeLazyForkAnalyzeProcessor$receiver$2$1", "Landroid/content/BroadcastReceiver;", "matrix-resource-canary-android_release"}, k = 1, mv = {1, 4, 2})
/* renamed from: com.tencent.matrix.resource.processor.NativeLazyForkAnalyzeProcessor$receiver$2$1 */
/* loaded from: classes12.dex */
public final class C4708xf23df29b extends android.content.BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public volatile boolean f134498a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ cj.q f134499b;

    public C4708xf23df29b(cj.q qVar) {
        this.f134499b = qVar;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(intent != null ? intent.getAction() : null, "android.intent.action.SCREEN_OFF")) {
            if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(intent != null ? intent.getAction() : null, "com.tencent.matrix.force.analyze")) {
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(intent != null ? intent.getAction() : null, "android.intent.action.SCREEN_ON")) {
                    this.f134498a = false;
                    return;
                }
                return;
            }
        }
        this.f134498a = true;
        if (ih.d.c()) {
            ((android.os.Handler) ((jz5.n) this.f134499b.f123373d.f123376f).mo141623x754a37bb()).post(new cj.p(this));
        } else {
            oj.j.b("Matrix.LeakProcessor.NativeLazyForkAnalyze", "onReceive: Matrix NOT installed yet", new java.lang.Object[0]);
        }
    }
}

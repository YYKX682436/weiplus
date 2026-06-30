package com.tencent.matrix.resource.processor;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/tencent/matrix/resource/processor/NativeForkAnalyzeProcessor$screenStateReceiver$2$1", "Landroid/content/BroadcastReceiver;", "matrix-resource-canary-android_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes12.dex */
public final class NativeForkAnalyzeProcessor$screenStateReceiver$2$1 extends android.content.BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ cj.j f52964a;

    public NativeForkAnalyzeProcessor$screenStateReceiver$2$1(cj.j jVar) {
        this.f52964a = jVar;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        this.f52964a.f41835e.f52985j.post(new cj.i(this));
    }
}

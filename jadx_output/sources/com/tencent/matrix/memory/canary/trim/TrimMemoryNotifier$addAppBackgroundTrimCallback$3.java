package com.tencent.matrix.memory.canary.trim;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\u0004"}, d2 = {"com/tencent/matrix/memory/canary/trim/TrimMemoryNotifier$addAppBackgroundTrimCallback$3", "Landroidx/lifecycle/x;", "Ljz5/f0;", "release", "matrix-memory-canary_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes11.dex */
public final class TrimMemoryNotifier$addAppBackgroundTrimCallback$3 implements androidx.lifecycle.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ki.a f52914d;

    public TrimMemoryNotifier$addAppBackgroundTrimCallback$3(ki.a aVar) {
        this.f52914d = aVar;
    }

    @androidx.lifecycle.l0(androidx.lifecycle.m.ON_DESTROY)
    public final void release() {
        java.util.ArrayList arrayList = ki.i.f308099a;
        java.util.ArrayList arrayList2 = ki.i.f308100b;
        synchronized (arrayList2) {
            arrayList2.remove(this.f52914d);
        }
    }
}

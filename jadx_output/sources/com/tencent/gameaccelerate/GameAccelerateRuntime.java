package com.tencent.gameaccelerate;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0082 J\u0011\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0002H\u0082 ¨\u0006\t"}, d2 = {"Lcom/tencent/gameaccelerate/GameAccelerateRuntime;", "", "", "isolate", "ctx", "createRuntime", "ptr", "Ljz5/f0;", "destroyRuntime", "gameaccelerate_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class GameAccelerateRuntime {

    /* renamed from: a, reason: collision with root package name */
    public long f45948a;

    static {
        yc.c.f460748a.loadLibrary("gameaccelerate");
    }

    private final native long createRuntime(long isolate, long ctx);

    private final native void destroyRuntime(long j17);

    public final void a(long j17, long j18) {
        synchronized (this) {
            if (this.f45948a == 0) {
                this.f45948a = createRuntime(j17, j18);
            }
        }
    }

    public final void b() {
        long j17;
        synchronized (this) {
            j17 = this.f45948a;
            this.f45948a = 0L;
        }
        if (j17 != 0) {
            destroyRuntime(j17);
        }
    }
}

package com.p314xaae8f345.p340xf404004f;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0082 J\u0011\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0002H\u0082 ¨\u0006\t"}, d2 = {"Lcom/tencent/gameaccelerate/GameAccelerateRuntime;", "", "", "isolate", "ctx", "createRuntime", "ptr", "Ljz5/f0;", "destroyRuntime", "gameaccelerate_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: com.tencent.gameaccelerate.GameAccelerateRuntime */
/* loaded from: classes.dex */
public final class C2943x6548d049 {

    /* renamed from: a, reason: collision with root package name */
    public long f127481a;

    static {
        yc.c.f542281a.mo32100xeb57c8f5("gameaccelerate");
    }

    /* renamed from: createRuntime */
    private final native long m21985xe258f33c(long isolate, long ctx);

    /* renamed from: destroyRuntime */
    private final native void m21986x2c3bba7e(long j17);

    public final void a(long j17, long j18) {
        synchronized (this) {
            if (this.f127481a == 0) {
                this.f127481a = m21985xe258f33c(j17, j18);
            }
        }
    }

    public final void b() {
        long j17;
        synchronized (this) {
            j17 = this.f127481a;
            this.f127481a = 0L;
        }
        if (j17 != 0) {
            m21986x2c3bba7e(j17);
        }
    }
}

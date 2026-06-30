package lt5;

/* loaded from: classes8.dex */
public abstract class j implements lt5.a {

    /* renamed from: a, reason: collision with root package name */
    public lt5.f f402848a;

    @Override // lt5.a
    public lt5.f a(android.content.Context context) {
        lt5.f fVar = this.f402848a;
        if (fVar == null || fVar.f402837b != 0) {
            this.f402848a = d(context);
        }
        return this.f402848a;
    }

    public abstract java.lang.String b(android.content.Context context, android.os.IBinder iBinder);

    public final int c(android.content.Context context, java.util.concurrent.atomic.AtomicReference atomicReference, java.util.concurrent.atomic.AtomicReference atomicReference2, java.util.concurrent.atomic.AtomicReference atomicReference3) {
        java.lang.Object obj = new java.lang.Object();
        java.util.concurrent.atomic.AtomicReference atomicReference4 = new java.util.concurrent.atomic.AtomicReference(0);
        ((ku5.t0) ku5.t0.f394148d).q(new lt5.i(this, context, atomicReference, atomicReference4, atomicReference3, atomicReference2, obj));
        synchronized (obj) {
            try {
                obj.wait(2000L);
            } catch (java.lang.Throwable unused) {
            }
        }
        return ((java.lang.Integer) atomicReference4.get()).intValue();
    }

    public lt5.f d(android.content.Context context) {
        java.util.concurrent.atomic.AtomicReference atomicReference = new java.util.concurrent.atomic.AtomicReference();
        atomicReference.set("");
        int i17 = -1;
        try {
            java.util.concurrent.atomic.AtomicReference atomicReference2 = new java.util.concurrent.atomic.AtomicReference();
            java.util.concurrent.atomic.AtomicReference atomicReference3 = new java.util.concurrent.atomic.AtomicReference();
            java.lang.Object obj = new java.lang.Object();
            if (context.bindService(e(), new lt5.h(this, atomicReference2, atomicReference3, obj), 1)) {
                if (atomicReference2.get() == null) {
                    synchronized (obj) {
                        try {
                            obj.wait(2000L);
                        } catch (java.lang.Throwable unused) {
                        }
                    }
                }
                i17 = atomicReference2.get() == null ? -105 : 0;
            } else {
                i17 = -100;
            }
            if (i17 == 0) {
                i17 = c(context, atomicReference2, atomicReference3, atomicReference);
            }
        } catch (java.lang.Throwable unused2) {
        }
        return new lt5.f((java.lang.String) atomicReference.get(), i17);
    }

    public abstract android.content.Intent e();
}

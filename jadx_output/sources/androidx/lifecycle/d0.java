package androidx.lifecycle;

/* loaded from: classes13.dex */
public class d0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.lifecycle.g0 f11619d;

    public d0(androidx.lifecycle.g0 g0Var) {
        this.f11619d = g0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.Object obj;
        synchronized (this.f11619d.mDataLock) {
            obj = this.f11619d.mPendingData;
            this.f11619d.mPendingData = androidx.lifecycle.g0.NOT_SET;
        }
        this.f11619d.setValue(obj);
    }
}

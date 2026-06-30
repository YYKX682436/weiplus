package mk2;

/* loaded from: classes3.dex */
public final class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f408664d;

    @Override // java.lang.Runnable
    public void run() {
        mk2.a aVar;
        java.lang.ref.WeakReference weakReference = mk2.h.f408673h;
        if (weakReference == null || (aVar = (mk2.a) weakReference.get()) == null) {
            return;
        }
        aVar.mo57489xb7c88e46(this.f408664d);
    }
}

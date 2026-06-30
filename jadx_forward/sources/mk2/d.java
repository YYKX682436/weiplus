package mk2;

/* loaded from: classes3.dex */
public final class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public static final mk2.d f408662d = new mk2.d();

    @Override // java.lang.Runnable
    public final void run() {
        mk2.a aVar;
        java.lang.ref.WeakReference weakReference = mk2.h.f408673h;
        if (weakReference == null || (aVar = (mk2.a) weakReference.get()) == null) {
            return;
        }
        aVar.mo57729xe407507e();
    }
}

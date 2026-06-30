package fl4;

/* loaded from: classes11.dex */
public final class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.ref.WeakReference f345466d;

    public g(java.lang.ref.WeakReference mNotificationManagerRef) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mNotificationManagerRef, "mNotificationManagerRef");
        this.f345466d = mNotificationManagerRef;
    }

    @Override // java.lang.Runnable
    public void run() {
        d75.b.g(new fl4.f(this));
    }
}

package ul1;

/* loaded from: classes7.dex */
public final class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.ref.WeakReference f510119d;

    public k(ul1.j toast) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(toast, "toast");
        this.f510119d = new java.lang.ref.WeakReference(toast);
    }

    @Override // java.lang.Runnable
    public void run() {
        ul1.j jVar = (ul1.j) this.f510119d.get();
        if (jVar != null) {
            jVar.dismiss();
        }
    }
}

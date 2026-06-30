package jy0;

/* loaded from: classes.dex */
public final class a implements android.content.DialogInterface.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final yz5.l f384013d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.ref.WeakReference f384014e;

    public a(java.lang.Object obj, yz5.l action) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(obj, "obj");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(action, "action");
        this.f384013d = action;
        this.f384014e = new java.lang.ref.WeakReference(obj);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(android.content.DialogInterface dialogInterface) {
        this.f384013d.mo146xb9724478(this.f384014e.get());
    }
}

package lb2;

/* loaded from: classes.dex */
public final class k extends lb2.j {

    /* renamed from: t, reason: collision with root package name */
    public final yz5.l f399281t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(java.lang.String title, yz5.l onClick) {
        super("", title);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(title, "title");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onClick, "onClick");
        this.f399281t = onClick;
    }

    @Override // lb2.j
    public void n(int i17) {
        java.lang.ref.WeakReference weakReference = this.f399284f;
        this.f399281t.mo146xb9724478(weakReference != null ? (android.app.Activity) weakReference.get() : null);
    }

    @Override // lb2.j
    public void o() {
    }

    @Override // lb2.j
    public /* bridge */ /* synthetic */ java.lang.Object r() {
        return "";
    }
}

package ai4;

/* loaded from: classes11.dex */
public final class c implements l75.q0 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.ref.WeakReference f86663d;

    public c(qi4.b observer) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(observer, "observer");
        this.f86663d = new java.lang.ref.WeakReference(observer);
    }

    @Override // l75.q0
    /* renamed from: onNotifyChange */
    public void mo735xb0dfc7d8(java.lang.String str, l75.w0 w0Var) {
        qi4.b bVar = (qi4.b) this.f86663d.get();
        if (bVar != null) {
            if (str == null) {
                str = "";
            }
            qi4.b.B1(bVar, str, w0Var != null ? w0Var.f398507b : -1, null, 4, null);
        }
    }
}

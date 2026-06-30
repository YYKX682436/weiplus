package ai4;

/* loaded from: classes11.dex */
public final class c implements l75.q0 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.ref.WeakReference f5130d;

    public c(qi4.b observer) {
        kotlin.jvm.internal.o.g(observer, "observer");
        this.f5130d = new java.lang.ref.WeakReference(observer);
    }

    @Override // l75.q0
    public void onNotifyChange(java.lang.String str, l75.w0 w0Var) {
        qi4.b bVar = (qi4.b) this.f5130d.get();
        if (bVar != null) {
            if (str == null) {
                str = "";
            }
            qi4.b.B1(bVar, str, w0Var != null ? w0Var.f316974b : -1, null, 4, null);
        }
    }
}

package al1;

/* loaded from: classes7.dex */
public class f implements e75.a {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.ref.WeakReference f5767d;

    public f(al1.b bVar) {
        this.f5767d = new java.lang.ref.WeakReference(bVar);
    }

    @Override // e75.a
    public void onChanged(java.lang.Object obj) {
        java.lang.Boolean bool = (java.lang.Boolean) obj;
        al1.b bVar = (al1.b) this.f5767d.get();
        if (bVar == null) {
            return;
        }
        bVar.g(bool.booleanValue(), bVar.getMainTitle());
    }
}

package b56;

/* loaded from: classes13.dex */
public class c extends android.app.Fragment {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Set f18117d = java.util.Collections.newSetFromMap(new java.util.WeakHashMap());

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.Object f18118e = new java.lang.Object();

    @Override // android.app.Fragment
    public void onResume() {
        super.onResume();
        synchronized (this.f18118e) {
            for (b56.d dVar : this.f18117d) {
                if (dVar != null) {
                    dVar.onResume();
                }
            }
        }
    }
}

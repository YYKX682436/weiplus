package b56;

/* loaded from: classes13.dex */
public class c extends android.app.Fragment {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Set f99650d = java.util.Collections.newSetFromMap(new java.util.WeakHashMap());

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.Object f99651e = new java.lang.Object();

    @Override // android.app.Fragment
    public void onResume() {
        super.onResume();
        synchronized (this.f99651e) {
            for (b56.d dVar : this.f99650d) {
                if (dVar != null) {
                    dVar.mo9868x57429eec();
                }
            }
        }
    }
}

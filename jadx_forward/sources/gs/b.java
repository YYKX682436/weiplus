package gs;

/* loaded from: classes13.dex */
public class b extends android.app.Fragment {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Set f356494d = java.util.Collections.newSetFromMap(new java.util.WeakHashMap());

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.Object f356495e = new java.lang.Object();

    @Override // android.app.Fragment
    public void onResume() {
        super.onResume();
        synchronized (this.f356495e) {
            for (gs.c cVar : this.f356494d) {
                if (cVar != null) {
                    cVar.mo77570x57429eec();
                }
            }
        }
    }
}

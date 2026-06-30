package q32;

/* loaded from: classes12.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public android.util.SparseArray f441458a;

    public void a(java.lang.String str, q32.d dVar) {
        iz5.a.g(null, dVar != null);
        if (this.f441458a == null) {
            return;
        }
        for (int i17 = 0; i17 < this.f441458a.size(); i17++) {
            q32.e eVar = (q32.e) ((java.lang.ref.WeakReference) this.f441458a.get(this.f441458a.keyAt(i17))).get();
            if (eVar != null) {
                eVar.b3(str, dVar);
            }
        }
    }

    public void b(q32.e eVar) {
        iz5.a.g(null, eVar != null);
        if (this.f441458a == null) {
            this.f441458a = new android.util.SparseArray();
        }
        this.f441458a.put(eVar.hashCode(), new java.lang.ref.WeakReference(eVar));
    }
}

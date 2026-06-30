package qz1;

/* loaded from: classes11.dex */
public class b implements gy1.a {
    @Override // gy1.a
    public boolean a(long j17, java.lang.String str, java.util.Map map, ky1.d dVar) {
        gy1.b bVar;
        if (!u46.l.e(str) && dVar != null) {
            gy1.b bVar2 = dVar.f395037f;
            if (bVar2 != null) {
                bVar2.a(j17, str, map);
            }
            java.lang.ref.WeakReference weakReference = dVar.f395036e;
            if (weakReference != null && (bVar = (gy1.b) weakReference.get()) != null) {
                bVar.a(j17, str, map);
            }
        }
        return false;
    }

    @Override // gy1.a
    public int b() {
        return 2;
    }
}

package ey2;

/* loaded from: classes2.dex */
public final class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ey2.f f338861d;

    public c(ey2.f fVar) {
        this.f338861d = fVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.Object m143895xf1229813;
        try {
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            byte[] N = com.p314xaae8f345.mm.vfs.w6.N(new com.p314xaae8f345.mm.vfs.r6(((cq.k) i95.n0.c(cq.k.class)).Di(9)).o() + "/18054.ext", 0, -1);
            jz5.f0 f0Var = null;
            if (N != null) {
                java.lang.Object a17 = u46.j.a(N);
                java.util.List<ey2.a> list = a17 instanceof java.util.List ? (java.util.List) a17 : null;
                ey2.f fVar = this.f338861d;
                if (list != null) {
                    for (ey2.a aVar : list) {
                        fVar.f338897h.put(fVar.N6(aVar.f338843d, aVar.f338846g), aVar);
                    }
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.18054CacheVM", "[restoreCache] cacheSize=" + fVar.f338897h.size());
                f0Var = jz5.f0.f384359a;
            }
            m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(f0Var);
        } catch (java.lang.Throwable th6) {
            p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6));
        }
        java.lang.Throwable m143898xd4a2fc34 = p3321xbce91901.C29043x91b2b43d.m143898xd4a2fc34(m143895xf1229813);
        if (m143898xd4a2fc34 != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("Finder.18054CacheVM", m143898xd4a2fc34, "", new java.lang.Object[0]);
        }
    }
}

package tf;

/* loaded from: classes7.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    public static volatile boolean f500365a;

    public static tf1.f a(sf.f fVar) {
        if (!f500365a) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AppBrand.MicroMsg.AudioOfVideoBackgroundPlayManagerProvider", "provide, not support");
            return null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l m17 = fVar.m();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 t37 = m17 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 ? ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5) m17).t3() : m17 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 ? ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9) m17).t3() : null;
        if (t37 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("AppBrand.MicroMsg.AudioOfVideoBackgroundPlayManagerProvider", "provide, runtime is null");
            return null;
        }
        if (t37.L0() || t37.S) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("AppBrand.MicroMsg.AudioOfVideoBackgroundPlayManagerProvider", "provide, runtime is destroyed or finishing");
            return null;
        }
        tf1.f fVar2 = (tf1.f) t37.k(tf1.f.class);
        if (fVar2 != null) {
            return fVar2;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AppBrand.MicroMsg.AudioOfVideoBackgroundPlayManagerProvider", "provide, create");
        tf1.f fVar3 = new tf1.f(t37);
        t37.l(fVar3);
        return fVar3;
    }
}

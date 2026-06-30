package ju5;

/* loaded from: classes15.dex */
public abstract class d extends ju5.f {
    @Override // ju5.f
    public void e(eu5.e eVar) {
    }

    public void h(java.lang.String str, int i17) {
        zt5.h.a("Soter.BaseSoterPrepareKeyTask", "soter: marking preference. key: %s, status: %d", str, java.lang.Integer.valueOf(i17));
        synchronized (fu5.d.class) {
            if (fu5.d.b().c() != null) {
                fu5.d.b().c().edit().putInt(str, i17).commit();
            }
        }
    }
}

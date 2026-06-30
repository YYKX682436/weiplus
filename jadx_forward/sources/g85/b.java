package g85;

/* loaded from: classes12.dex */
public abstract class b implements g85.c {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.Object f351086a;

    /* renamed from: b, reason: collision with root package name */
    public long f351087b;

    @Override // g85.c
    public void a(java.lang.Object obj) {
        this.f351086a = obj;
        this.f351087b = java.lang.System.currentTimeMillis();
    }

    @Override // g85.c
    /* renamed from: value */
    public jz5.l mo131090x6ac9171() {
        boolean z17;
        try {
            java.util.List b17 = b();
            if (b17 != null) {
                java.util.Iterator it = b17.iterator();
                while (it.hasNext()) {
                    if (!((f85.e) it.next()).a()) {
                        z17 = false;
                        break;
                    }
                }
            }
            z17 = true;
            return z17 ? new jz5.l(java.lang.Boolean.TRUE, null) : new jz5.l(java.lang.Boolean.FALSE, this.f351086a);
        } catch (java.lang.Throwable unused) {
            j85.g gVar = j85.g.f379784a;
            pm0.v.M(j85.g.f379785b, false, new j85.c("seviceName.value crash:" + c(), "BaseMethodMethodCheck"), 2, null);
            return new jz5.l(java.lang.Boolean.TRUE, null);
        }
    }
}

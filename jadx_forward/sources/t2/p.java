package t2;

/* loaded from: classes14.dex */
public abstract class p {
    public static wa.a a(t2.m mVar) {
        t2.k kVar = new t2.k();
        t2.o oVar = new t2.o(kVar);
        kVar.f496186b = oVar;
        kVar.f496185a = mVar.getClass();
        try {
            java.lang.Object mo3008x586b6594 = mVar.mo3008x586b6594(kVar);
            if (mo3008x586b6594 != null) {
                kVar.f496185a = mo3008x586b6594;
            }
        } catch (java.lang.Exception e17) {
            t2.j jVar = oVar.f496191e;
            jVar.getClass();
            if (t2.j.f496180i.b(jVar, null, new t2.e(e17))) {
                t2.j.b(jVar);
            }
        }
        return oVar;
    }
}

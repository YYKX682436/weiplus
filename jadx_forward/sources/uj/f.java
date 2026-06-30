package uj;

/* loaded from: classes7.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final uj.f f509685a = new uj.f();

    /* renamed from: b, reason: collision with root package name */
    public static uj.p f509686b;

    public final void a() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MagicPlayableMgr", "releasePlayableService");
        uj.p pVar = f509686b;
        if (pVar != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.MagicPlayableService", "cleanup");
            pVar.f509705g = null;
            pm0.v.X(new uj.o(pVar));
            pVar.f509704f = null;
            pVar.f509703e = null;
            bf3.p pVar2 = pVar.f509707i;
            if (pVar2 != null) {
                pVar2.b();
            }
            jc3.j0 j0Var = pVar.f509702d;
            if (j0Var == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("magicBrush");
                throw null;
            }
            ((rc3.w0) j0Var).m162151x5cd39ffa();
            uj.k.f509694a.a().d();
        }
        f509686b = null;
    }
}

package bp3;

@j95.b
/* loaded from: classes9.dex */
public class f extends i95.w {

    /* renamed from: e, reason: collision with root package name */
    public ep3.b f23086e;

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f23085d = new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper());

    /* renamed from: f, reason: collision with root package name */
    public dp3.h f23087f = null;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.List f23088g = new java.util.ArrayList();

    static {
        com.tencent.mm.wallet_core.a.h("ShowOrdersInfoProcess", bp3.e.class);
    }

    public static bp3.f wi() {
        return (bp3.f) i95.n0.c(bp3.f.class);
    }

    public dp3.h Ai() {
        gm0.j1.b().c();
        if (wi().f23087f == null) {
            wi().f23087f = new dp3.h();
        }
        return wi().f23087f;
    }

    public ep3.b Bi() {
        gm0.j1.b().c();
        if (wi().f23086e == null) {
            bp3.f wi6 = wi();
            gm0.j1.i();
            wi6.f23086e = new ep3.b(gm0.j1.u().f273153f);
        }
        return wi().f23086e;
    }
}

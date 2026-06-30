package c51;

/* loaded from: classes10.dex */
public final class h extends c51.e {

    /* renamed from: o, reason: collision with root package name */
    public final d51.d f120175o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(d51.d loadConfig) {
        super(loadConfig);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(loadConfig, "loadConfig");
        this.f120175o = loadConfig;
    }

    @Override // c51.e
    public void e(c51.c result) {
        yz5.l lVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(result, "result");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("RfxPAGLoadTask", " result:" + result);
        boolean z17 = result instanceof c51.b;
        d51.d dVar = this.f120175o;
        if (z17) {
            com.p314xaae8f345.mm.rfx.C20942x379cf5ee m77391x243906 = com.p314xaae8f345.mm.rfx.C20942x379cf5ee.m77391x243906(((c51.b) result).f120162a);
            yz5.l lVar2 = dVar.f308059d;
            if (lVar2 != null) {
                lVar2.mo146xb9724478(m77391x243906);
            }
        } else if ((result instanceof c51.a) && (lVar = dVar.f308059d) != null) {
            lVar.mo146xb9724478(null);
        }
        dVar.f308059d = null;
    }
}

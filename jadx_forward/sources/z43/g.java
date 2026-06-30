package z43;

/* loaded from: classes.dex */
public class g implements j35.a {
    public g(z43.h hVar) {
    }

    @Override // j35.a
    public void a(com.p314xaae8f345.mm.p2470x93e71c27.p2476xe125c5cf.AbstractActivityC19626xce283566 abstractActivityC19626xce283566) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("LiteAppJsApiBookDownloadGame", "float window permission granted");
        if (abstractActivityC19626xce283566 != null) {
            abstractActivityC19626xce283566.finish();
        }
    }

    @Override // j35.a
    public void b(com.p314xaae8f345.mm.p2470x93e71c27.p2476xe125c5cf.AbstractActivityC19626xce283566 abstractActivityC19626xce283566) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("LiteAppJsApiBookDownloadGame", "onResultCancel ok:%b", java.lang.Boolean.valueOf(((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).Ui(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a)));
        if (abstractActivityC19626xce283566 != null) {
            abstractActivityC19626xce283566.finish();
        }
    }

    @Override // j35.a
    public void c(com.p314xaae8f345.mm.p2470x93e71c27.p2476xe125c5cf.AbstractActivityC19626xce283566 abstractActivityC19626xce283566) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("LiteAppJsApiBookDownloadGame", "float window permission refused");
        if (abstractActivityC19626xce283566 != null) {
            abstractActivityC19626xce283566.finish();
        }
    }
}

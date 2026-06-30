package zi1;

/* loaded from: classes7.dex */
public final class b implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1178x6fbd6873.p1179xd10bdbf0.p1180x9d4bf30f.j {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f554627b = 0;

    /* renamed from: a, reason: collision with root package name */
    public final xi1.g f554628a;

    public b(xi1.g window) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(window, "window");
        this.f554628a = window;
    }

    @Override // xi1.p
    public xi1.o a() {
        android.util.DisplayMetrics mo48807xad90d981 = this.f554628a.mo48807xad90d981();
        if (mo48807xad90d981.heightPixels >= mo48807xad90d981.widthPixels) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CenterInsideWindowOrientationHandler", "getCurrentOrientation: portrait");
            return xi1.o.PORTRAIT;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CenterInsideWindowOrientationHandler", "getCurrentOrientation: landscape");
        return xi1.o.LANDSCAPE_SENSOR;
    }

    @Override // xi1.p
    public void b(xi1.o oVar, xi1.n nVar) {
        if (oVar == null) {
            if (nVar != null) {
                nVar.e(null, false);
                return;
            }
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CenterInsideWindowOrientationHandler", "requestDeviceOrientation: " + oVar.f536245d + ',' + oVar.name());
        zi1.a aVar = new zi1.a(oVar, this, nVar);
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.d5.a()) {
            aVar.run();
        } else {
            ((ku5.t0) ku5.t0.f394148d).B(aVar);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1178x6fbd6873.p1179xd10bdbf0.p1180x9d4bf30f.j
    /* renamed from: onConfigurationChanged */
    public void mo52316x50e1c15d(android.content.res.Configuration configuration) {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1178x6fbd6873.p1179xd10bdbf0.p1180x9d4bf30f.j
    /* renamed from: onPause */
    public void mo52317xb01dfb57() {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1178x6fbd6873.p1179xd10bdbf0.p1180x9d4bf30f.j
    /* renamed from: onResume */
    public void mo52318x57429eec() {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1178x6fbd6873.p1179xd10bdbf0.p1180x9d4bf30f.j
    /* renamed from: release */
    public void mo52319x41012807() {
    }
}

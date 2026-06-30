package x21;

/* loaded from: classes14.dex */
public final class l {

    /* renamed from: h, reason: collision with root package name */
    public static int f533076h;

    /* renamed from: a, reason: collision with root package name */
    public final int f533077a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f533078b;

    /* renamed from: c, reason: collision with root package name */
    public x21.j f533079c;

    /* renamed from: d, reason: collision with root package name */
    public final x21.i f533080d;

    /* renamed from: e, reason: collision with root package name */
    public final x21.c f533081e;

    /* renamed from: f, reason: collision with root package name */
    public volatile boolean f533082f;

    /* renamed from: g, reason: collision with root package name */
    public x21.e f533083g;

    public l(boolean z17, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        z17 = (i17 & 1) != 0 ? true : z17;
        int i18 = f533076h;
        f533076h = i18 + 1;
        this.f533077a = i18;
        this.f533078b = "MicroMsg.MSP.MultiFileSilkPlayer-" + i18;
        this.f533080d = new x21.i();
        this.f533081e = new x21.c(z17, new x21.k(this), true);
    }

    public static void d(x21.l lVar, boolean z17, boolean z18, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            z17 = false;
        }
        if ((i17 & 2) != 0) {
            z18 = false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(lVar.f533078b, "stopPlay, playingFlag: " + z18);
        lVar.f533082f = z18;
        x21.j jVar = lVar.f533079c;
        if (jVar != null) {
            jVar.c(true);
        }
        lVar.f533079c = null;
        x21.c cVar = lVar.f533081e;
        cVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MSP.AudioTrackAudioPlayer", "stop play force " + z17);
        cVar.c(z17);
        x21.i iVar = lVar.f533080d;
        iVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MSP.MultiFileSilkDecoder", "release");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MSP.MultiFileSilkDecoder", "reset");
        iVar.f533069b = null;
        x21.g gVar = iVar.f533070c;
        if (gVar != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(gVar.f533058b, "decoder uninit");
            gVar.f533063g = false;
            w21.v vVar = gVar.f533059c;
            if (vVar != null) {
                com.p314xaae8f345.mm.p963x7eba77a9.C11150x241988a2.m48246xd1cf9af6(vVar.f524015a);
            }
        }
        iVar.f533070c = null;
    }

    public final void a(java.lang.String path) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f533078b, "appendFile: ".concat(path));
        x21.i iVar = this.f533080d;
        iVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MSP.MultiFileSilkDecoder", "appendFile ".concat(path));
        java.util.ArrayList arrayList = (java.util.ArrayList) iVar.f533068a;
        arrayList.add(new x21.h(path, arrayList.size(), 0L, 4, null));
        if (this.f533082f) {
            c();
        }
    }

    public final void b() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f533078b, "clearFileList");
        x21.i iVar = this.f533080d;
        iVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MSP.MultiFileSilkDecoder", "clearFileList");
        ((java.util.ArrayList) iVar.f533068a).clear();
        iVar.f533069b = null;
        d(this, true, false, 2, null);
    }

    public final void c() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f533078b, "startPlay");
        this.f533082f = true;
        if (!(this.f533079c != null ? r1.d() : true)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f533078b, "now is playing");
            return;
        }
        if (!(true ^ ((java.util.ArrayList) this.f533080d.f533068a).isEmpty())) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(this.f533078b, "no audio file, delay init");
            return;
        }
        x21.i iVar = this.f533080d;
        iVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MSP.MultiFileSilkDecoder", "reset");
        iVar.f533069b = null;
        x21.g gVar = iVar.f533070c;
        if (gVar != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(gVar.f533058b, "decoder uninit");
            gVar.f533063g = false;
            w21.v vVar = gVar.f533059c;
            if (vVar != null) {
                com.p314xaae8f345.mm.p963x7eba77a9.C11150x241988a2.m48246xd1cf9af6(vVar.f524015a);
            }
        }
        iVar.f533070c = null;
        x21.c cVar = this.f533081e;
        cVar.b(cVar.f533048d, cVar.f533049e);
        x21.j jVar = this.f533079c;
        if (jVar == null || jVar.d()) {
            x21.j jVar2 = new x21.j(this, this.f533080d, this.f533081e);
            this.f533079c = jVar2;
            ((ku5.t0) ku5.t0.f394148d).g(jVar2);
        }
    }
}

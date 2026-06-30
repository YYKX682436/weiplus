package y21;

/* loaded from: classes14.dex */
public final class h {

    /* renamed from: h, reason: collision with root package name */
    public static int f540587h;

    /* renamed from: a, reason: collision with root package name */
    public final int f540588a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f540589b;

    /* renamed from: c, reason: collision with root package name */
    public y21.f f540590c;

    /* renamed from: d, reason: collision with root package name */
    public y21.b f540591d;

    /* renamed from: e, reason: collision with root package name */
    public y21.a f540592e;

    /* renamed from: f, reason: collision with root package name */
    public final x21.c f540593f;

    /* renamed from: g, reason: collision with root package name */
    public y21.e f540594g;

    public h(boolean z17, boolean z18, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        z17 = (i17 & 1) != 0 ? true : z17;
        z18 = (i17 & 2) != 0 ? true : z18;
        int i18 = f540587h;
        f540587h = i18 + 1;
        this.f540588a = i18;
        this.f540589b = "MicroMsg.MSP.StreamSilkPlayer-" + i18;
        this.f540593f = new x21.c(z17, new y21.g(this), z18);
    }

    public static void e(y21.h hVar, boolean z17, boolean z18, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            z17 = false;
        }
        if ((i17 & 2) != 0) {
            z18 = false;
        }
        hVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(hVar.f540589b, "stopPlay, playingFlag: " + z18);
        y21.f fVar = hVar.f540590c;
        if (fVar != null) {
            fVar.c(true);
        }
        hVar.f540590c = null;
        x21.c cVar = hVar.f540593f;
        cVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MSP.AudioTrackAudioPlayer", "stop play force " + z17);
        cVar.c(z17);
        y21.b bVar = hVar.f540591d;
        if (bVar != null) {
            bVar.mo158760x5a5ddf8();
        }
        hVar.f540591d = null;
        y21.e eVar = hVar.f540594g;
        if (eVar != null) {
            eVar.d();
        }
        hVar.f540594g = null;
    }

    public final boolean a() {
        return !(this.f540590c != null ? r0.d() : true);
    }

    public final void b(y21.b source) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f540589b, "setSource: using SafeStreamSilkDecoder for thread safety");
        y21.e eVar = this.f540594g;
        if (eVar != null) {
            eVar.d();
        }
        this.f540594g = new y21.e(source);
        this.f540591d = source;
    }

    public final void c(y21.a aVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f540589b, "setStateListener " + aVar);
        this.f540592e = aVar;
    }

    public final void d() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f540589b, "startPlay");
        if (a()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f540589b, "now is playing");
            return;
        }
        if (this.f540594g == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(this.f540589b, "no audio source, delay init");
            return;
        }
        x21.c cVar = this.f540593f;
        cVar.b(cVar.f533048d, cVar.f533049e);
        y21.f fVar = this.f540590c;
        if (fVar == null || fVar.d()) {
            y21.e eVar = this.f540594g;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(eVar);
            y21.f fVar2 = new y21.f(this, eVar, this.f540593f);
            this.f540590c = fVar2;
            ((ku5.t0) ku5.t0.f394148d).g(fVar2);
        }
    }

    public final void f(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f540589b, "switchSpeaker: " + z17);
        x21.c.d(this.f540593f, z17, 0, 2, null);
    }
}

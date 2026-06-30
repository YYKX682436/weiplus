package cw2;

/* loaded from: classes10.dex */
public final class w4 implements cw2.aa {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p2278xb8ff1437.p2282x373aa5.C18690x34c5bc78 f305617a;

    public w4(android.content.Context context, r45.mb4 media) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(media, "media");
        com.p314xaae8f345.mm.p1006xc5476f33.p2278xb8ff1437.p2282x373aa5.C18690x34c5bc78 c18690x34c5bc78 = new com.p314xaae8f345.mm.p1006xc5476f33.p2278xb8ff1437.p2282x373aa5.C18690x34c5bc78(context);
        this.f305617a = c18690x34c5bc78;
        mn2.g4 g4Var = new mn2.g4(media, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.f209900t, "xV10", 0, 0, null, false, null, 248, null);
        dk4.a aVar = new dk4.a(g4Var.n(), g4Var.mo148083xfb83cc9b(), g4Var.mo148084xb5887639() + '/' + g4Var.i(), (int) media.m75938x746dc8a6(4), (int) media.m75938x746dc8a6(5));
        aVar.f316000d = media.m75945x2fec8307(17);
        c18690x34c5bc78.f();
        c18690x34c5bc78.m71980xdb50e870(aVar);
        kk4.b player = c18690x34c5bc78.getPlayer();
        if (player != null) {
            ((kk4.v) player).f390118j = true;
        }
        kk4.b player2 = c18690x34c5bc78.getPlayer();
        if (player2 != null) {
            ((kk4.v) player2).C(true);
        }
        kk4.b player3 = c18690x34c5bc78.getPlayer();
        if (player3 != null) {
            ((kk4.v) player3).O();
        }
    }

    @Override // cw2.aa
    public void a(yz5.a onReady, yz5.a onDestroy, yz5.l onSeekFrame) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onReady, "onReady");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onDestroy, "onDestroy");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onSeekFrame, "onSeekFrame");
        com.p314xaae8f345.mm.p1006xc5476f33.p2278xb8ff1437.p2282x373aa5.C18690x34c5bc78 c18690x34c5bc78 = this.f305617a;
        c18690x34c5bc78.m71981xa2fa530b(new cw2.u4(this, onReady));
        c18690x34c5bc78.m71982xabb6f01d(new cw2.v4(this, onSeekFrame));
    }

    @Override // cw2.aa
    /* renamed from: destroy */
    public void mo122847x5cd39ffa() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2278xb8ff1437.p2282x373aa5.C18690x34c5bc78 c18690x34c5bc78 = this.f305617a;
        kk4.b player = c18690x34c5bc78.getPlayer();
        if (player != null) {
            ((kk4.v) player).P();
        }
        kk4.b player2 = c18690x34c5bc78.getPlayer();
        if (player2 != null) {
            player2.mo143590x408b7293();
        }
        c18690x34c5bc78.g();
    }

    @Override // cw2.aa
    /* renamed from: getBitmap */
    public android.graphics.Bitmap mo122848x12501425() {
        return this.f305617a.m71972x12501425();
    }

    @Override // cw2.aa
    /* renamed from: getCurrentPositionMs */
    public long mo122849xddd35a52() {
        kk4.b player = this.f305617a.getPlayer();
        if (player != null) {
            return ((kk4.v) player).o();
        }
        return 0L;
    }

    @Override // cw2.aa
    /* renamed from: getView */
    public android.view.View mo122850xfb86a31b() {
        return this.f305617a;
    }

    @Override // cw2.aa
    /* renamed from: resume */
    public void mo122851xc84dc82d() {
        kk4.b player = this.f305617a.getPlayer();
        if (player != null) {
            ((kk4.v) player).O();
        }
    }

    @Override // cw2.aa
    /* renamed from: seekTo */
    public void mo122852xc9fc1b13(long j17) {
        kk4.b player = this.f305617a.getPlayer();
        if (player != null) {
            kk4.b.f(player, (int) j17, true, null, 4, null);
        }
    }
}

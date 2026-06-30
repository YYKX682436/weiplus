package gp5;

/* loaded from: classes10.dex */
public final class e {

    /* renamed from: b, reason: collision with root package name */
    public boolean f355994b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f355995c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f355996d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f355997e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f355998f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 f355999g;

    /* renamed from: i, reason: collision with root package name */
    public wu5.c f356001i;

    /* renamed from: j, reason: collision with root package name */
    public final vx3.i f356002j;

    /* renamed from: k, reason: collision with root package name */
    public final yx3.k f356003k;

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f355993a = "";

    /* renamed from: h, reason: collision with root package name */
    public final ao4.b f356000h = new ao4.b();

    public e() {
        vx3.c cVar = new vx3.c(vx3.d.f522806d, 0, true);
        vx3.i b17 = vx3.l.E.b();
        dk4.a aVar = b17.f522817a;
        if (aVar != null) {
            aVar.f316008l = true;
        }
        this.f356002j = b17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(aVar);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RingtonePlayer", "create ringtonePlayer, mediaInfo:" + aVar + ", soundInfo:" + cVar + ", isOutCall:false");
        this.f356003k = aVar.f316001e ? new yx3.j(aVar, cVar, false) : new yx3.x(aVar, cVar, false);
    }

    public final void a(java.lang.String username, boolean z17, boolean z18, long j17, boolean z19) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        this.f355993a = username;
        this.f355994b = z17;
        this.f355995c = z18;
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("isVideoCall", !z17 ? 1 : 0);
        bundle.putString(dm.i4.f66875xa013b0d5, username);
        bundle.putBoolean("isOutCall", z18);
        bundle.putBoolean("isSpeakOn", z19);
        bundle.putString(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, "start");
        long currentTimeMillis = j17 > 0 ? java.lang.System.currentTimeMillis() - j17 : 0L;
        bundle.putLong("seekStartMs", currentTimeMillis);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c("MicroMsg.VoIPMPRingtoneController", "startRing() called with: username = " + username + ", videoCall = " + z17 + ", outCall = " + z18 + ", channelElapsedTimeMs = " + currentTimeMillis, new java.lang.Object[0]);
        this.f355997e = ((mx3.u) ((mx3.j) i95.n0.c(mx3.j.class))).Bi(mx3.i.ILINK_VOIP, bundle);
    }

    public final void b() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoIPMPRingtoneController", "stopRing");
        this.f355996d = false;
        if (this.f355997e && this.f355995c) {
            nx3.a wi6 = ((mx3.u) ((mx3.j) i95.n0.c(mx3.j.class))).wi();
            java.lang.String str = this.f355993a;
            java.lang.String str2 = wi6.f422881e;
            java.lang.String str3 = (str2 == null || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str2, "0")) ? wi6.f422880d : wi6.f422881e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str3);
            mx3.b0.g(str, str3);
        }
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, "close");
        ((mx3.u) ((mx3.j) i95.n0.c(mx3.j.class))).Bi(mx3.i.ILINK_VOIP, bundle);
        this.f355997e = false;
    }
}

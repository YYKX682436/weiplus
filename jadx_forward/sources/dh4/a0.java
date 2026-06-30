package dh4;

/* loaded from: classes15.dex */
public class a0 extends ah4.e {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dh4.f0 f314036d;

    public a0(dh4.f0 f0Var) {
        this.f314036d = f0Var;
    }

    @Override // ah4.e, com.p314xaae8f345.mm.p1006xc5476f33.p2254xdba97f87.p2255xac8f1cfd.InterfaceC18546xdab69d9b
    /* renamed from: keep_OnError */
    public void mo2061xd3b7bc8f(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.TalkRoomServer", "engineCallback OnError: %d", java.lang.Integer.valueOf(i17));
        dh4.v Bi = dh4.l.Bi();
        long j17 = Bi.A;
        if (j17 != 0) {
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            Bi.f314123c = android.os.SystemClock.elapsedRealtime() - j17;
        }
        dh4.l.Bi().f314124d = 1;
        this.f314036d.f314062x.b("component OnError " + i17, 99, i17);
        new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.getMainLooper()).mo50293x3498a0(new dh4.z(this));
    }

    @Override // ah4.e, com.p314xaae8f345.mm.p1006xc5476f33.p2254xdba97f87.p2255xac8f1cfd.InterfaceC18546xdab69d9b
    /* renamed from: keep_OnOpenSuccess */
    public void mo2062xecfe93a0() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TalkRoomServer", "OnOpenSuccess");
        dh4.f0 f0Var = this.f314036d;
        int i17 = f0Var.f314047f;
        if (i17 != 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.TalkRoomServer", "has exit the talkroom state:%d", java.lang.Integer.valueOf(i17));
            return;
        }
        dh4.v Bi = dh4.l.Bi();
        long j17 = Bi.A;
        if (j17 != 0) {
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            Bi.f314123c = android.os.SystemClock.elapsedRealtime() - j17;
        }
        new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.getMainLooper()).mo50293x3498a0(new dh4.y(this));
        f0Var.g();
        dh4.t0 t0Var = f0Var.f314062x;
        t0Var.getClass();
        dh4.k0 k0Var = new dh4.k0(t0Var);
        if (android.os.Looper.myLooper() == android.os.Looper.getMainLooper()) {
            k0Var.run();
        } else {
            t0Var.f314120b.mo50293x3498a0(k0Var);
        }
    }
}

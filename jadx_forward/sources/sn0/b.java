package sn0;

/* loaded from: classes3.dex */
public final class b extends co0.s {

    /* renamed from: e2, reason: collision with root package name */
    public static sn0.b f491497e2;

    /* renamed from: d2, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 f491498d2;

    public b() {
        super(false, 1, null);
        this.f491498d2 = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4("anchor_secondary_sei_sender", (com.p314xaae8f345.mm.sdk.p2603x2137b148.a4) new sn0.a(this), true);
    }

    @Override // tn0.w0
    public void O0(java.lang.String privateMapKey) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(privateMapKey, "privateMapKey");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(privateMapKey)) {
            return;
        }
        cl0.g gVar = new cl0.g();
        gVar.h("privateMapKey", privateMapKey);
        cl0.g gVar2 = new cl0.g();
        gVar2.h("api", "updatePrivateMapKey");
        gVar2.h("params", gVar);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiveCoreSecondaryDevice", "updatePrivateMapKey:" + gVar2 + ' ');
        T().mo30261xd33a8dd4(gVar2.toString());
    }

    @Override // co0.s, tn0.w0
    public boolean X() {
        return false;
    }

    @Override // co0.s
    public boolean Z0() {
        return true;
    }

    @Override // tn0.w0, vn0.f
    public void a(int i17) {
        super.a(i17);
        this.f491498d2.d();
    }

    @Override // co0.s, tn0.w0, vn0.f
    public void e(long j17) {
        super.e(j17);
        if (j17 > 0) {
            this.f491498d2.c(1000L, 1000L);
        }
    }

    @Override // co0.s
    public void e1(boolean z17) {
        com.p314xaae8f345.p373xbe494963.p374x58d9bd6.InterfaceC3728x6d2ee64a.AudioMusicParam audioMusicParam;
        mn0.b0 b0Var = this.R1.f363942a;
        if (b0Var != null) {
            ((mn0.y) b0Var).G(z17);
        }
        if (z17) {
            com.p314xaae8f345.p373xbe494963.p374x58d9bd6.InterfaceC3728x6d2ee64a.AudioMusicParam audioMusicParam2 = this.L;
            if (audioMusicParam2 != null) {
                T().mo30282x5f1b9a9c().mo29050xff20a1fb(audioMusicParam2.f127778id);
                return;
            }
            return;
        }
        if (!this.N || (audioMusicParam = this.L) == null) {
            return;
        }
        T().mo30282x5f1b9a9c().mo29052x96288da4(audioMusicParam.f127778id);
    }

    @Override // co0.s
    public boolean g1() {
        return true;
    }

    @Override // tn0.w0
    public android.graphics.Point z(android.content.Context context, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        return ko0.t.f391436a.a(this.U1, this.V1);
    }
}

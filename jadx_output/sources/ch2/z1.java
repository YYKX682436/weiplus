package ch2;

/* loaded from: classes10.dex */
public final class z1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ch2.o2 f41501d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.trtc.TXChorusMusicPlayer.TXChorusRole f41502e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z1(ch2.o2 o2Var, com.tencent.trtc.TXChorusMusicPlayer.TXChorusRole tXChorusRole) {
        super(0);
        this.f41501d = o2Var;
        this.f41502e = tXChorusRole;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        sf2.d3 d3Var;
        ch2.o2 o2Var = this.f41501d;
        om2.i iVar = o2Var.q7().f346307n;
        jz5.f0 f0Var = null;
        if (iVar != null) {
            iVar.j(r45.y84.LIVE_KTV_SING_STATE_SINGING, null);
            iVar.k(0, 0, 0.0f, 0);
        }
        om2.s sVar = o2Var.q7().f346308o;
        jz5.f0 f0Var2 = jz5.f0.f302826a;
        if (sVar != null) {
            ah2.b k76 = o2Var.k7();
            if (k76 != null) {
                ((dh2.x) k76).p(sVar, this.f41502e);
            }
            if (o2Var.q7().S6() && (d3Var = (sf2.d3) o2Var.controller(sf2.d3.class)) != null) {
                fn2.s1 s1Var = d3Var.f407103m;
                if (s1Var != null) {
                    com.tencent.mm.plugin.finder.live.widget.x0.i(s1Var, false, 1, null);
                }
                d3Var.f407103m = null;
            }
            f0Var = f0Var2;
        }
        if (f0Var == null) {
            com.tencent.mars.xlog.Log.e("FinderLiveKTVSingController", "startSing error liveSeiSingResourceInfo = null");
        }
        return f0Var2;
    }
}

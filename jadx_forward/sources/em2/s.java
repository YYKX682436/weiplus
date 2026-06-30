package em2;

/* loaded from: classes3.dex */
public final class s extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gk2.e f336698d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ em2.u f336699e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(gk2.e eVar, em2.u uVar) {
        super(0);
        this.f336698d = eVar;
        this.f336699e = uVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        tn0.w0 w0Var = dk2.ef.f314911d;
        co0.s sVar = w0Var instanceof co0.s ? (co0.s) w0Var : null;
        gk2.e eVar = this.f336698d;
        if (sVar != null) {
            sVar.i1(((mm2.c1) eVar.a(mm2.c1.class)).I4, android.os.SystemClock.elapsedRealtime(), false, null);
        }
        zl2.r4 r4Var = zl2.r4.f555483a;
        int R0 = r4Var.R0(eVar, false, false);
        tn0.w0 w0Var2 = dk2.ef.f314911d;
        co0.s sVar2 = w0Var2 instanceof co0.s ? (co0.s) w0Var2 : null;
        if (sVar2 != null) {
            em2.u.a(this.f336699e);
            r4Var.d0("Finder.FinderLiveMiniWindowManager");
            em2.r rVar = em2.r.f336697d;
            int i17 = sVar2.U;
            hn0.r rVar2 = sVar2.R1;
            if (i17 == 0) {
                mn0.b0 b0Var = rVar2.f363942a;
                if (b0Var != null) {
                    ((mn0.y) b0Var).Q(1);
                }
            } else {
                mn0.b0 b0Var2 = rVar2.f363942a;
                if (b0Var2 != null) {
                    ((mn0.y) b0Var2).Q(R0);
                }
            }
            sVar2.f1(sVar2.Y1);
            boolean h17 = rVar2.h();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiveCoreVisitor", "switchToCdnMode renderMode:" + R0 + ", getScene():" + sVar2.U + ", cacheMute:" + sVar2.Y1 + ", playerView:null, isPlaying:" + h17);
            if (!h17) {
                rVar2.f363942a = rVar2.f363942a;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiveCdnPlayerManager", "setTXLivePlayer: " + rVar2.f363942a);
            }
            sVar2.S0(sVar2.T1, null, new co0.r(rVar));
        }
        return jz5.f0.f384359a;
    }
}

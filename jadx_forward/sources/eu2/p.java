package eu2;

/* loaded from: classes2.dex */
public final class p extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ eu2.b0 f338336d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cw2.wa f338337e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.Long f338338f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(eu2.b0 b0Var, cw2.wa waVar, java.lang.Long l17) {
        super(0);
        this.f338336d = b0Var;
        this.f338337e = waVar;
        this.f338338f = l17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        boolean z17;
        du2.n Ui = this.f338336d.Ui();
        du2.l lVar = eu2.b0.I;
        fu2.c wi6 = Ui.wi(lVar);
        if (wi6 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderVideoSystemPlayerController", "[onPlayProgressMs] depend is null, currentBusinessType = " + lVar);
        } else {
            fu2.b bVar = ((eu2.j) wi6).f338325c;
            eu2.b0 b0Var = this.f338336d;
            bVar.f348407a = b0Var.f338297n;
            boolean z18 = true;
            if (b0Var.f338298o) {
                du2.n Ui2 = b0Var.Ui();
                Ui2.getClass();
                if (lVar != Ui2.f325022i) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderSystemPlayerManager", "[updateProgress] update progress failed! businessType = " + lVar + ", currentBusinessType = " + Ui2.f325022i);
                } else if (du2.n.Ai(Ui2, null, 1, null) != null) {
                    if (((java.lang.Boolean) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a.o0().r()).booleanValue()) {
                        z17 = true;
                    } else {
                        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                        z17 = false;
                    }
                    if (!z17 && !z65.c.a()) {
                        kb2.b bVar2 = kb2.b.f387758a;
                        z18 = false;
                    }
                    if (z18) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderSystemPlayerManager", "[updateProgress] businessType = " + lVar);
                    }
                    p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.r rVar = Ui2.f325020g;
                    if (rVar != null) {
                        rVar.a("COMMAND_UPDATE_PROGRESS", null, null);
                    }
                }
            } else {
                b0Var.rj(this.f338337e, true, null, this.f338338f);
            }
        }
        return jz5.f0.f384359a;
    }
}

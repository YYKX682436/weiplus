package ef0;

/* loaded from: classes8.dex */
public final class v2 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ef0.y2 f333875a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f333876b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.Boolean f333877c;

    public v2(ef0.y2 y2Var, boolean z17, java.lang.Boolean bool) {
        this.f333875a = y2Var;
        this.f333876b = z17;
        this.f333877c = bool;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        bw5.lc0 Ui;
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        ef0.y2 y2Var = this.f333875a;
        bw5.lc0 Ui2 = y2Var.Ui();
        java.lang.Boolean valueOf = Ui2 != null ? java.lang.Boolean.valueOf(Ui2.f111270d) : null;
        boolean z17 = this.f333876b;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(valueOf, java.lang.Boolean.valueOf(z17))) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TingEntryConfigService", "setMusicRecommendState callback errType: " + fVar.f152148a + ", errCode: " + fVar.f152149b);
            int i17 = fVar.f152148a;
            java.lang.Boolean bool = this.f333877c;
            if (i17 == 0 && fVar.f152149b == 0) {
                y2Var.wi();
                y2Var.nj(bool, z17);
            } else {
                if (bool != null && (Ui = y2Var.Ui()) != null) {
                    Ui.f111270d = bool.booleanValue();
                    Ui.f111282s[1] = true;
                }
                y2Var.wi();
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.TingEntryConfigService", "setMusicRecommendState callback state change: cur:" + valueOf + ", target: " + z17);
        }
        return jz5.f0.f384359a;
    }
}

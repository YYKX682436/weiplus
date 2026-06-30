package ef0;

/* loaded from: classes8.dex */
public final class u2 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ef0.y2 f333865a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f333866b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.Boolean f333867c;

    public u2(ef0.y2 y2Var, boolean z17, java.lang.Boolean bool) {
        this.f333865a = y2Var;
        this.f333866b = z17;
        this.f333867c = bool;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        bw5.lc0 Ui;
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        ef0.y2 y2Var = this.f333865a;
        bw5.lc0 Ui2 = y2Var.Ui();
        java.lang.Boolean valueOf = Ui2 != null ? java.lang.Boolean.valueOf(Ui2.f111273g) : null;
        boolean z17 = this.f333866b;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(valueOf, java.lang.Boolean.valueOf(z17))) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TingEntryConfigService", "setEnableSqQualityInWwan callback errType: " + fVar.f152148a + ", errCode: " + fVar.f152149b);
            if (fVar.f152148a == 0 && fVar.f152149b == 0) {
                y2Var.wi();
                int i17 = jm4.p0.f381934d;
                jm4.o0 o0Var = (jm4.o0) p3380x6a61f93.p3381xf512d0a5.C30421x21b22f78.m168730x21b0d463();
                if (o0Var != null) {
                    p3380x6a61f93.p3381xf512d0a5.C30421x21b22f78.m168731x21b1924a(((jm4.p0) o0Var).m105978x2737f10(), z17);
                }
            } else {
                java.lang.Boolean bool = this.f333867c;
                if (bool != null && (Ui = y2Var.Ui()) != null) {
                    Ui.f111273g = bool.booleanValue();
                    Ui.f111282s[4] = true;
                }
                y2Var.wi();
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.TingEntryConfigService", "setEnableSqQualityInWwan callback state change: cur:" + valueOf + ", target: " + z17);
        }
        return jz5.f0.f384359a;
    }
}

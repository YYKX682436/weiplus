package ef0;

/* loaded from: classes8.dex */
public final class t2 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ef0.y2 f333860a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f333861b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f333862c;

    public t2(ef0.y2 y2Var, int i17, int i18) {
        this.f333860a = y2Var;
        this.f333861b = i17;
        this.f333862c = i18;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        ef0.y2 y2Var = this.f333860a;
        bw5.lc0 Ui = y2Var.Ui();
        java.lang.Integer valueOf = Ui != null ? java.lang.Integer.valueOf(Ui.f111279p) : null;
        int i17 = this.f333861b;
        if (valueOf != null && valueOf.intValue() == i17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TingEntryConfigService", "setAiCreateModelType callback errType: " + fVar.f152148a + ", errCode: " + fVar.f152149b);
            if (fVar.f152148a == 0 && fVar.f152149b == 0) {
                y2Var.wi();
            } else {
                bw5.lc0 Ui2 = y2Var.Ui();
                if (Ui2 != null) {
                    Ui2.f111279p = this.f333862c;
                    Ui2.f111282s[10] = true;
                }
                y2Var.wi();
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.TingEntryConfigService", "setAiCreateModelType callback state change: cur:" + valueOf + ", target: " + i17);
        }
        return jz5.f0.f384359a;
    }
}

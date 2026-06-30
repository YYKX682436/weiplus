package gt4;

/* loaded from: classes14.dex */
public final class m0 implements com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ gt4.s0 f357002a;

    public m0(gt4.s0 s0Var) {
        this.f357002a = s0Var;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.n
    /* renamed from: onResult */
    public final void mo26477x57429edc(boolean z17, int i17, int i18, int i19) {
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletComplexDatePicker", "innerResultListener: " + i17 + ' ' + i18 + ' ' + i19);
            gt4.s0 s0Var = this.f357002a;
            s0Var.N = (i17 * 100) + i18;
            s0Var.n();
        }
    }
}

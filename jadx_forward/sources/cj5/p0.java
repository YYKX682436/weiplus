package cj5;

/* loaded from: classes.dex */
public final class p0 implements com.p314xaae8f345.mm.p2470x93e71c27.ui.a2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cj5.d1 f123744d;

    public p0(cj5.d1 d1Var) {
        this.f123744d = d1Var;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.a2
    public void M3(int i17, java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SelectContactSearchMvvmListUIC", "onSelectChange " + i17 + ' ' + str);
        if (i17 != 1 || str == null) {
            return;
        }
        cj5.d1 d1Var = this.f123744d;
        j75.f Q6 = d1Var.Q6();
        if (Q6 != null) {
            Q6.B3(new wi5.x0(str));
        }
        j75.f Q62 = d1Var.Q6();
        if (Q62 != null) {
            Q62.B3(new wi5.y0(str));
        }
    }
}

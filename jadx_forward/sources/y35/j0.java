package y35;

/* loaded from: classes11.dex */
public final class j0 implements l75.q0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.ui.p2485xa8fcbcdb.C19715xef2590cd f540758d;

    public j0(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2485xa8fcbcdb.C19715xef2590cd c19715xef2590cd) {
        this.f540758d = c19715xef2590cd;
    }

    @Override // l75.q0
    /* renamed from: onNotifyChange */
    public final void mo735xb0dfc7d8(java.lang.String str, l75.w0 w0Var) {
        if (this.f540758d.f272611h) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VerifyRecordListView", "cloudListener onNotifyChange, event = %s", str);
        ((ku5.t0) ku5.t0.f394148d).B(new y35.i0(this.f540758d));
    }
}

package w41;

/* loaded from: classes15.dex */
public final class l implements x41.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p983xc3c3c8ee.ui.p985xb099fd48.C11220xb94149d6 f524403a;

    public l(com.p314xaae8f345.mm.p983xc3c3c8ee.ui.p985xb099fd48.C11220xb94149d6 c11220xb94149d6) {
        this.f524403a = c11220xb94149d6;
    }

    @Override // x41.a
    public void a(int i17) {
        v41.r rVar = this.f524403a.D1;
        if (rVar != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenIMKefuConfirmDialogUIModelImpl", "showConfirmDialog onClose exitType: " + i17);
            v41.m mVar = ((v41.h) rVar).f514745a;
            mVar.j(new v41.g(mVar));
            w41.j jVar = mVar.f514752i;
            if (jVar != null) {
                jVar.dismiss();
            }
        }
    }
}

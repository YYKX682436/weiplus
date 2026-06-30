package w41;

/* loaded from: classes15.dex */
public final class e implements x41.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p983xc3c3c8ee.ui.p985xb099fd48.C11219x5502277f f524388a;

    public e(com.p314xaae8f345.mm.p983xc3c3c8ee.ui.p985xb099fd48.C11219x5502277f c11219x5502277f) {
        this.f524388a = c11219x5502277f;
    }

    @Override // x41.a
    public void a(int i17) {
        ab0.r rVar = this.f524388a.C1;
        if (rVar != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NewContactWidgetNormal", "confirmDialog onClose exitType:%s", java.lang.Integer.valueOf(i17));
            ((w41.c) ((com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.n0) rVar).f235068a).dismiss();
        }
    }
}

package gu0;

/* loaded from: classes5.dex */
public final class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hu0.a0 f357159d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p880x4ac6c74f.p882xed08e3c8.ActivityC10926xa2f37a4e f357160e;

    public b(hu0.a0 a0Var, com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p880x4ac6c74f.p882xed08e3c8.ActivityC10926xa2f37a4e activityC10926xa2f37a4e) {
        this.f357159d = a0Var;
        this.f357160e = activityC10926xa2f37a4e;
    }

    @Override // java.lang.Runnable
    public final void run() {
        gu0.k2 k2Var;
        this.f357159d.T6();
        gu0.k2 k2Var2 = this.f357160e.f150710d;
        boolean z17 = false;
        if (k2Var2 != null && k2Var2.f357266i) {
            z17 = true;
        }
        if (z17 || (k2Var = this.f357160e.f150710d) == null) {
            return;
        }
        k2Var.t();
    }
}

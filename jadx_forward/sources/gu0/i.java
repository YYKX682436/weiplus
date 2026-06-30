package gu0;

/* loaded from: classes5.dex */
public final class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hu0.o f357225d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ hu0.l f357226e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ hu0.a0 f357227f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f357228g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p880x4ac6c74f.p882xed08e3c8.ActivityC10926xa2f37a4e f357229h;

    public i(hu0.o oVar, hu0.l lVar, hu0.a0 a0Var, java.lang.String str, com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p880x4ac6c74f.p882xed08e3c8.ActivityC10926xa2f37a4e activityC10926xa2f37a4e) {
        this.f357225d = oVar;
        this.f357226e = lVar;
        this.f357227f = a0Var;
        this.f357228g = str;
        this.f357229h = activityC10926xa2f37a4e;
    }

    @Override // java.lang.Runnable
    public final void run() {
        gu0.k2 k2Var;
        this.f357225d.O6();
        this.f357226e.R6(true);
        this.f357227f.U6(true);
        if (this.f357228g != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MJCC.PreviewUI", "applyEditResult failed: " + this.f357228g);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MJCC.PreviewUI", "applyEditResult success");
        }
        gu0.k2 k2Var2 = this.f357229h.f150710d;
        if ((k2Var2 != null && k2Var2.f357265h) || (k2Var = this.f357229h.f150710d) == null) {
            return;
        }
        k2Var.t();
    }
}

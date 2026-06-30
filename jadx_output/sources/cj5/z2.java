package cj5;

/* loaded from: classes.dex */
public final class z2 extends wm3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f42285d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f42286e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f42287f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z2(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f42286e = "";
        this.f42287f = "";
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onCreateBefore(android.os.Bundle bundle) {
        this.f42285d = c01.id.c();
        this.f42286e = getActivity().getClass().getSimpleName() + '-' + getIntent().getIntExtra("list_type", -1);
        java.lang.String uuid = java.util.UUID.randomUUID().toString();
        kotlin.jvm.internal.o.f(uuid, "toString(...)");
        this.f42287f = uuid;
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onResume() {
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f42287f)) {
            com.tencent.mm.autogen.mmdata.rpt.MvvmOptimizeReportStruct mvvmOptimizeReportStruct = new com.tencent.mm.autogen.mmdata.rpt.MvvmOptimizeReportStruct();
            mvvmOptimizeReportStruct.f59617d = mvvmOptimizeReportStruct.b("Type", this.f42286e, true);
            mvvmOptimizeReportStruct.f59618e = mvvmOptimizeReportStruct.b("SessionId", this.f42287f, true);
            mvvmOptimizeReportStruct.f59620g = 0L;
            mvvmOptimizeReportStruct.f59619f = c01.id.c() - this.f42285d;
            mvvmOptimizeReportStruct.k();
            mvvmOptimizeReportStruct.o();
            this.f42287f = "";
        }
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        android.content.Intent intent = getIntent();
        iy1.c cVar = iy1.c.MainUI;
        cy1.a aVar = (cy1.a) rVar;
        aVar.Zj(activity, intent.getIntExtra("key_select_contact_report_page_id", 1107));
        aVar.Rj(getActivity(), iy1.a.NewGroupChat);
    }
}

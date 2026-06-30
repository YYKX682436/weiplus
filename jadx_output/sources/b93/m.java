package b93;

/* loaded from: classes16.dex */
public class m implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f18597d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f18598e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f18599f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f18600g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f18601h;

    public m(long j17, long j18, long j19, long j27, long j28) {
        this.f18597d = j17;
        this.f18598e = j18;
        this.f18599f = j19;
        this.f18600g = j27;
        this.f18601h = j28;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.autogen.mmdata.rpt.ContactTagManagementReportStruct contactTagManagementReportStruct = new com.tencent.mm.autogen.mmdata.rpt.ContactTagManagementReportStruct();
        long j17 = this.f18597d;
        contactTagManagementReportStruct.f55748d = j17;
        long j18 = this.f18598e;
        contactTagManagementReportStruct.f55749e = j18;
        long j19 = this.f18599f;
        contactTagManagementReportStruct.f55750f = j19;
        long j27 = this.f18600g;
        contactTagManagementReportStruct.f55751g = j27;
        long j28 = this.f18601h;
        contactTagManagementReportStruct.f55752h = j28;
        contactTagManagementReportStruct.k();
        com.tencent.mars.xlog.Log.i("MicroMsg.Label.LabelUtils", "24176 setSource = " + j17 + ",setAction = " + j18 + ",setOperate_label_cnt = " + j19 + ",setAdd_member_cnt = " + j27 + ",setRemove_member_cnt = " + j28);
    }
}

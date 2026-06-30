package f65;

/* loaded from: classes10.dex */
public final class u0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f341512d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f341513e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f341514f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f341515g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f341516h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f341517i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ long f341518m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(boolean z17, java.lang.String str, long j17, long j18, long j19, boolean z18, long j27) {
        super(1);
        this.f341512d = z17;
        this.f341513e = str;
        this.f341514f = j17;
        this.f341515g = j18;
        this.f341516h = j19;
        this.f341517i = z18;
        this.f341518m = j27;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        long j17;
        r45.pz6 videoReportWrapper = (r45.pz6) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(videoReportWrapper, "videoReportWrapper");
        r45.qz6 qz6Var = videoReportWrapper.f465037d;
        qz6Var.f465918h = this.f341513e;
        qz6Var.f465919i = this.f341514f;
        qz6Var.f465921n = this.f341515g;
        qz6Var.f465920m = this.f341516h;
        if (this.f341517i) {
            f65.x[] xVarArr = f65.x.f341537d;
            j17 = 1;
        } else {
            f65.x[] xVarArr2 = f65.x.f341537d;
            j17 = 2;
        }
        qz6Var.f465917g = j17;
        qz6Var.f465916f = this.f341518m;
        videoReportWrapper.f465050t = this.f341512d ? 1 : 0;
        return videoReportWrapper;
    }
}

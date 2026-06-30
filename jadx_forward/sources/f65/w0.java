package f65;

/* loaded from: classes10.dex */
public final class w0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f341531d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f341532e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f341533f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f341534g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f341535h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f341536i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(long j17, long j18, long j19, boolean z17, long j27, java.lang.String str) {
        super(1);
        this.f341531d = j17;
        this.f341532e = j18;
        this.f341533f = j19;
        this.f341534g = z17;
        this.f341535h = j27;
        this.f341536i = str;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        long j17;
        r45.pz6 videoReporterWrapper = (r45.pz6) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(videoReporterWrapper, "videoReporterWrapper");
        r45.qz6 qz6Var = videoReporterWrapper.f465037d;
        long j18 = this.f341531d;
        if (j18 != 0) {
            qz6Var.f465919i = j18;
        }
        long j19 = this.f341532e;
        if (j19 != 0) {
            qz6Var.f465920m = j19;
        }
        long j27 = this.f341533f;
        if (j27 != 0) {
            qz6Var.f465921n = j27;
        }
        if (qz6Var.f465917g == 0) {
            if (this.f341534g) {
                f65.x[] xVarArr = f65.x.f341537d;
                j17 = 1;
            } else {
                f65.x[] xVarArr2 = f65.x.f341537d;
                j17 = 2;
            }
            qz6Var.f465917g = j17;
        }
        long j28 = this.f341535h;
        if (j28 != 0) {
            qz6Var.f465916f = j28;
        }
        java.lang.String str = this.f341536i;
        if (str != null) {
            qz6Var.f465918h = str;
        }
        return videoReporterWrapper;
    }
}

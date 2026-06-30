package f65;

/* loaded from: classes12.dex */
public final class i0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f341419d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f341420e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(int i17, boolean z17) {
        super(1);
        this.f341419d = i17;
        this.f341420e = z17;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        r45.pz6 videoReporterWrapper = (r45.pz6) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(videoReporterWrapper, "videoReporterWrapper");
        videoReporterWrapper.f465046p = this.f341419d;
        if (!this.f341420e) {
            videoReporterWrapper.f465038e = java.lang.System.currentTimeMillis();
        }
        return videoReporterWrapper;
    }
}

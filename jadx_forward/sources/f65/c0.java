package f65;

/* loaded from: classes12.dex */
public final class c0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f341405d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f341406e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(int i17, int i18) {
        super(1);
        this.f341405d = i17;
        this.f341406e = i18;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        r45.pz6 videoReporterWrapper = (r45.pz6) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(videoReporterWrapper, "videoReporterWrapper");
        videoReporterWrapper.f465038e = java.lang.System.currentTimeMillis();
        videoReporterWrapper.f465044n = this.f341405d;
        videoReporterWrapper.f465045o = this.f341406e;
        return videoReporterWrapper;
    }
}

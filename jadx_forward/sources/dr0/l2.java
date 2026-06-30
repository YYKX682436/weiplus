package dr0;

/* loaded from: classes12.dex */
public final class l2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f323993d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f323994e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f323995f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f323996g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l2(long j17, long j18, long j19, java.util.Map map) {
        super(1);
        this.f323993d = j17;
        this.f323994e = j18;
        this.f323995f = j19;
        this.f323996g = map;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        dr0.u0 reportStage = (dr0.u0) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reportStage, "$this$reportStage");
        reportStage.f324091a = kz5.c0.i(java.lang.String.valueOf(this.f323993d), java.lang.String.valueOf(this.f323994e), java.lang.String.valueOf(this.f323995f));
        java.util.Map map = this.f323996g;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(map, "<set-?>");
        reportStage.f324093c = map;
        return jz5.f0.f384359a;
    }
}

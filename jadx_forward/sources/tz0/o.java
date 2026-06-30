package tz0;

/* loaded from: classes14.dex */
public final class o extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f504736d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ g1.n f504737e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f504738f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f504739g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(long j17, g1.n nVar, float f17, long j18) {
        super(1);
        this.f504736d = j17;
        this.f504737e = nVar;
        this.f504738f = f17;
        this.f504739g = j18;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        g1.i Canvas = (g1.i) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(Canvas, "$this$Canvas");
        tz0.q.b(Canvas, 0.0f, 360.0f, this.f504736d, this.f504737e, 0.0f, 16, null);
        tz0.q.b(Canvas, 270.0f, 360.0f * this.f504738f, this.f504739g, this.f504737e, 0.0f, 16, null);
        return jz5.f0.f384359a;
    }
}

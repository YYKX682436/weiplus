package yv1;

/* loaded from: classes3.dex */
public final class w0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f547713d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f547714e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f547715f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f547716g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(long j17, long j18, long j19, long j27) {
        super(1);
        this.f547713d = j17;
        this.f547714e = j18;
        this.f547715f = j19;
        this.f547716g = j27;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.lang.String it = (java.lang.String) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        if (r26.i0.y(it, "1:", false)) {
            return "1:" + (this.f547713d + this.f547714e);
        }
        if (r26.i0.y(it, "2:", false)) {
            return "2:" + this.f547715f;
        }
        if (!r26.i0.y(it, "3:", false)) {
            return it;
        }
        return "3:" + this.f547716g;
    }
}

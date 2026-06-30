package g75;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u00020\u0004B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lg75/f0;", "Lj75/b;", "InAction", "OutAction", "Lg75/t;", "Lg75/r;", "pipeline", "<init>", "(Lg75/r;)V", "wechat-sdk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public abstract class f0<InAction extends j75.b, OutAction extends j75.b> extends g75.t {

    /* renamed from: b, reason: collision with root package name */
    public final jz5.g f350897b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.Class f350898c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Class f350899d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(g75.r pipeline) {
        super(pipeline);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pipeline, "pipeline");
        this.f350897b = jz5.h.b(new g75.e0(pipeline));
    }

    @Override // g75.t
    public void c() {
        f(new g75.b0(this));
        b(new g75.d0(this));
    }

    public abstract java.lang.Object i(g75.z zVar, j75.b bVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57);
}

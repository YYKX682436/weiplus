package cu0;

/* loaded from: classes5.dex */
public final class j extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cu0.x f303851d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f303852e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f303853f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(cu0.x xVar, int i17, yz5.l lVar) {
        super(1);
        this.f303851d = xVar;
        this.f303852e = i17;
        this.f303853f = lVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        int intValue = ((java.lang.Number) obj).intValue();
        this.f303851d.f303886c.e(intValue / this.f303852e);
        this.f303853f.mo146xb9724478(java.lang.Integer.valueOf(intValue));
        return jz5.f0.f384359a;
    }
}

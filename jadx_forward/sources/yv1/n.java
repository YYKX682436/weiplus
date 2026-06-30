package yv1;

/* loaded from: classes.dex */
public final class n extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f547644d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f547645e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(java.lang.String str, long j17) {
        super(1);
        this.f547644d = str;
        this.f547645e = j17;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        yz5.p it = (yz5.p) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        it.mo149xb9724478(this.f547644d, java.lang.Long.valueOf(this.f547645e));
        return java.lang.Boolean.TRUE;
    }
}

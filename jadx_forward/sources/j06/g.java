package j06;

/* loaded from: classes5.dex */
public final class g extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Class f378593d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f378594e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(java.lang.Class cls, java.util.Map map) {
        super(0);
        this.f378593d = cls;
        this.f378594e = map;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append('@');
        sb6.append(this.f378593d.getCanonicalName());
        kz5.n0.f0(this.f378594e.entrySet(), sb6, ", ", "(", ")", 0, null, j06.f.f378592d, 48, null);
        java.lang.String sb7 = sb6.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(sb7, "toString(...)");
        return sb7;
    }
}

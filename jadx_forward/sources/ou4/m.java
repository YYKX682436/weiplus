package ou4;

/* loaded from: classes8.dex */
public final class m implements ou4.b0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f430525a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f430526b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f430527c;

    public m(p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var2, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var3) {
        this.f430525a = h0Var;
        this.f430526b = h0Var2;
        this.f430527c = h0Var3;
    }

    @Override // ou4.b0
    public void a(java.util.Map map) {
        this.f430525a.f391656d = map;
    }

    @Override // ou4.b0
    public void b(java.lang.String code, java.lang.String message) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(code, "code");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(message, "message");
        this.f430526b.f391656d = code;
        this.f430527c.f391656d = message;
    }
}

package en5;

/* loaded from: classes.dex */
public final class e1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f336922d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f336923e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f336924f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(yz5.l lVar, java.util.ArrayList arrayList, int i17) {
        super(0);
        this.f336922d = lVar;
        this.f336923e = arrayList;
        this.f336924f = i17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.Object obj = this.f336923e.get(this.f336924f);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
        this.f336922d.mo146xb9724478(obj);
        return jz5.f0.f384359a;
    }
}

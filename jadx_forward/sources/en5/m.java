package en5;

/* loaded from: classes.dex */
public final class m extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f336990d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f336991e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f336992f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(yz5.l lVar, java.util.ArrayList arrayList, int i17) {
        super(0);
        this.f336990d = lVar;
        this.f336991e = arrayList;
        this.f336992f = i17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.Object obj = this.f336991e.get(this.f336992f);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
        this.f336990d.mo146xb9724478(obj);
        return jz5.f0.f384359a;
    }
}

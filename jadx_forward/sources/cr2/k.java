package cr2;

/* loaded from: classes2.dex */
public final class k extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cr2.x f303395d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f303396e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ so2.j5 f303397f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 f303398g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f303399h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(cr2.x xVar, int i17, so2.j5 j5Var, p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 f2Var, int i18) {
        super(0);
        this.f303395d = xVar;
        this.f303396e = i17;
        this.f303397f = j5Var;
        this.f303398g = f2Var;
        this.f303399h = i18;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        cr2.x xVar = this.f303395d;
        java.util.ArrayList arrayList = xVar.f303444q;
        int i17 = this.f303396e;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b((so2.j5) kz5.n0.a0(arrayList, i17), this.f303397f)) {
            xVar.f303444q.remove(i17);
            this.f303398g.m8155x27702c4(this.f303399h);
        }
        return jz5.f0.f384359a;
    }
}

package sp2;

/* loaded from: classes2.dex */
public final class a1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sp2.o2 f492498d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f492499e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ so2.j5 f492500f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 f492501g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f492502h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(sp2.o2 o2Var, int i17, so2.j5 j5Var, p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 f2Var, int i18) {
        super(0);
        this.f492498d = o2Var;
        this.f492499e = i17;
        this.f492500f = j5Var;
        this.f492501g = f2Var;
        this.f492502h = i18;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        sp2.o2 o2Var = this.f492498d;
        java.util.ArrayList arrayList = o2Var.f492678m;
        int i17 = this.f492499e;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b((so2.j5) kz5.n0.a0(arrayList, i17), this.f492500f)) {
            o2Var.f492678m.remove(i17);
            this.f492501g.m8155x27702c4(this.f492502h);
            sp2.o2.b(o2Var);
        }
        return jz5.f0.f384359a;
    }
}

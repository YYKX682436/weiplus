package iq2;

/* loaded from: classes2.dex */
public final class s extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ iq2.d0 f375294d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f375295e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ so2.j5 f375296f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 f375297g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f375298h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(iq2.d0 d0Var, int i17, so2.j5 j5Var, p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 f2Var, int i18) {
        super(0);
        this.f375294d = d0Var;
        this.f375295e = i17;
        this.f375296f = j5Var;
        this.f375297g = f2Var;
        this.f375298h = i18;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        iq2.d0 d0Var = this.f375294d;
        java.util.ArrayList arrayList = d0Var.f375265p;
        int i17 = this.f375295e;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b((so2.j5) kz5.n0.a0(arrayList, i17), this.f375296f)) {
            d0Var.f375265p.remove(i17);
            this.f375297g.m8155x27702c4(this.f375298h);
            if (d0Var.f375274y) {
                iq2.d0.a(d0Var);
            }
        }
        return jz5.f0.f384359a;
    }
}

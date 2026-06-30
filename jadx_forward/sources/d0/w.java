package d0;

/* loaded from: classes14.dex */
public final class w extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ s1.o1[] f306757d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f306758e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ s1.x0 f306759f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.f0 f306760g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.f0 f306761h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ z0.d f306762i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(s1.o1[] o1VarArr, java.util.List list, s1.x0 x0Var, p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var, p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var2, z0.d dVar) {
        super(1);
        this.f306757d = o1VarArr;
        this.f306758e = list;
        this.f306759f = x0Var;
        this.f306760g = f0Var;
        this.f306761h = f0Var2;
        this.f306762i = dVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        s1.n1 layout = (s1.n1) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(layout, "$this$layout");
        z0.d dVar = this.f306762i;
        s1.o1[] o1VarArr = this.f306757d;
        int length = o1VarArr.length;
        int i17 = 0;
        int i18 = 0;
        while (i18 < length) {
            s1.o1 o1Var = o1VarArr[i18];
            int i19 = i17 + 1;
            if (o1Var == null) {
                throw new java.lang.NullPointerException("null cannot be cast to non-null type androidx.compose.ui.layout.Placeable");
            }
            d0.y.b(layout, o1Var, (s1.r0) this.f306758e.get(i17), this.f306759f.mo7007x6fcfed3f(), this.f306760g.f391649d, this.f306761h.f391649d, dVar);
            i18++;
            i17 = i19;
        }
        return jz5.f0.f384359a;
    }
}

package d0;

/* loaded from: classes14.dex */
public final class h2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f306660d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ s1.o1[] f306661e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.s f306662f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f306663g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ s1.x0 f306664h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int[] f306665i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ d0.t1 f306666m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ d0.k2[] f306667n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ d0.p0 f306668o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f306669p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.f0 f306670q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h2(java.util.List list, s1.o1[] o1VarArr, yz5.s sVar, int i17, s1.x0 x0Var, int[] iArr, d0.t1 t1Var, d0.k2[] k2VarArr, d0.p0 p0Var, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var) {
        super(1);
        this.f306660d = list;
        this.f306661e = o1VarArr;
        this.f306662f = sVar;
        this.f306663g = i17;
        this.f306664h = x0Var;
        this.f306665i = iArr;
        this.f306666m = t1Var;
        this.f306667n = k2VarArr;
        this.f306668o = p0Var;
        this.f306669p = i18;
        this.f306670q = f0Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        d0.t1 t1Var;
        d0.t1 t1Var2;
        s1.o1[] o1VarArr;
        s1.n1 layout = (s1.n1) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(layout, "$this$layout");
        int size = this.f306660d.size();
        int[] iArr = new int[size];
        int i17 = 0;
        int i18 = 0;
        while (true) {
            t1Var = d0.t1.Horizontal;
            t1Var2 = this.f306666m;
            o1VarArr = this.f306661e;
            if (i18 >= size) {
                break;
            }
            s1.o1 o1Var = o1VarArr[i18];
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(o1Var);
            iArr[i18] = t1Var2 == t1Var ? o1Var.f483583d : o1Var.f483584e;
            i18++;
        }
        yz5.s sVar = this.f306662f;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(this.f306663g);
        s1.x0 x0Var = this.f306664h;
        sVar.v(valueOf, iArr, x0Var.mo7007x6fcfed3f(), this.f306664h, this.f306665i);
        int length = o1VarArr.length;
        int i19 = 0;
        while (i17 < length) {
            s1.o1 o1Var2 = o1VarArr[i17];
            int i27 = i19 + 1;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(o1Var2);
            d0.k2 k2Var = this.f306667n[i19];
            d0.p0 p0Var = k2Var != null ? k2Var.f306691c : null;
            if (p0Var == null) {
                p0Var = this.f306668o;
            }
            int a17 = p0Var.a(this.f306669p - (t1Var2 == t1Var ? o1Var2.f483584e : o1Var2.f483583d), t1Var2 == t1Var ? p2.s.Ltr : x0Var.mo7007x6fcfed3f(), o1Var2, this.f306670q.f391649d);
            int[] iArr2 = this.f306665i;
            if (t1Var2 == t1Var) {
                s1.n1.b(layout, o1Var2, iArr2[i19], a17, 0.0f, 4, null);
            } else {
                s1.n1.b(layout, o1Var2, a17, iArr2[i19], 0.0f, 4, null);
            }
            i17++;
            i19 = i27;
        }
        return jz5.f0.f384359a;
    }
}

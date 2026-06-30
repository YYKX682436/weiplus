package el1;

/* loaded from: classes3.dex */
public final class a extends p012xc85e97e9.p103xe821e364.p104xd1075a44.p2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f335261d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f335262e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f335263f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ float f335264g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ float f335265h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ float f335266i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ float f335267m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ float f335268n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ float f335269o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ float f335270p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ float f335271q;

    public a(int i17, int i18, int i19, float f17, float f18, float f19, float f27, float f28, float f29, float f37, float f38) {
        this.f335261d = i17;
        this.f335262e = i18;
        this.f335263f = i19;
        this.f335264g = f17;
        this.f335265h = f18;
        this.f335266i = f19;
        this.f335267m = f27;
        this.f335268n = f28;
        this.f335269o = f29;
        this.f335270p = f37;
        this.f335271q = f38;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.p2
    /* renamed from: getItemOffsets */
    public void mo7902x5db88677(android.graphics.Rect outRect, android.view.View view, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 parent, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 state) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(outRect, "outRect");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        super.mo7902x5db88677(outRect, view, parent, state);
        int u07 = parent.u0(view);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 w07 = parent.w0(view);
        if (w07 instanceof cl1.z) {
            cl1.z zVar = (cl1.z) w07;
            if (zVar.m8185xcdaf1228() == 1 || zVar.m8185xcdaf1228() == 2) {
                if (u07 == -1) {
                    u07 = zVar.m8187x9323db3a();
                }
                int i17 = u07 - this.f335261d;
                if (i17 / 4 >= 1) {
                    outRect.top = this.f335262e;
                } else {
                    outRect.top = this.f335263f;
                }
                outRect.bottom = 0;
                int i18 = i17 % 4;
                if (i18 == 0) {
                    outRect.left = (int) this.f335264g;
                    outRect.right = (int) this.f335265h;
                    return;
                }
                if (i18 == 1) {
                    outRect.left = (int) this.f335266i;
                    outRect.right = (int) this.f335267m;
                    return;
                } else if (i18 == 2) {
                    outRect.left = (int) this.f335268n;
                    outRect.right = (int) this.f335269o;
                    return;
                } else {
                    if (i18 != 3) {
                        return;
                    }
                    outRect.left = (int) this.f335270p;
                    outRect.right = (int) this.f335271q;
                    return;
                }
            }
        }
        outRect.top = 0;
        outRect.left = 0;
        outRect.right = 0;
    }
}

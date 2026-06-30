package st2;

/* loaded from: classes3.dex */
public final class p2 {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1631xeb77f168.p1633x373aa5.C14980xd3f2584a f493947a;

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.C14399xad75a698 f493948b;

    /* renamed from: c, reason: collision with root package name */
    public final jz5.g f493949c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f493950d;

    /* renamed from: e, reason: collision with root package name */
    public final long f493951e;

    /* renamed from: f, reason: collision with root package name */
    public long f493952f;

    /* renamed from: g, reason: collision with root package name */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de f493953g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f493954h;

    /* renamed from: i, reason: collision with root package name */
    public final long f493955i;

    /* renamed from: j, reason: collision with root package name */
    public float f493956j;

    /* renamed from: k, reason: collision with root package name */
    public float f493957k;

    public p2(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1631xeb77f168.p1633x373aa5.C14980xd3f2584a container, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.C14399xad75a698 linearLayoutRecyclerView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(container, "container");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(linearLayoutRecyclerView, "linearLayoutRecyclerView");
        this.f493947a = container;
        this.f493948b = linearLayoutRecyclerView;
        this.f493949c = jz5.h.b(st2.n2.f493935d);
        this.f493950d = true;
        this.f493951e = 600L;
        this.f493955i = 600L;
    }

    public static final void a(st2.p2 p2Var, android.view.MotionEvent motionEvent) {
        boolean z17;
        if (p2Var.f493954h) {
            return;
        }
        p2Var.f493954h = true;
        p2Var.f493956j = motionEvent.getY();
        p2Var.f493957k = 0.0f;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1631xeb77f168.p1633x373aa5.C14980xd3f2584a c14980xd3f2584a = p2Var.f493947a;
        c14980xd3f2584a.j();
        boolean enableNestScrolled = c14980xd3f2584a.getEnableNestScrolled();
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de c1162x665295de = p2Var.f493953g;
        if (c1162x665295de != null) {
            z17 = c1162x665295de.w() == 0;
            if (z17 && !enableNestScrolled) {
                long currentTimeMillis = java.lang.System.currentTimeMillis() - p2Var.f493952f;
                if (currentTimeMillis <= p2Var.f493951e) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ShoppingPanelNestedScrollController", "enableNestedState enable but touchUpPassTime:" + currentTimeMillis + " too fast!");
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ShoppingPanelNestedScrollController", "enableNestedState :" + z17);
            c14980xd3f2584a.m59101x10d6bbc9(z17);
            p2Var.f493948b.m57904x6fb39c33(false);
        }
        z17 = false;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ShoppingPanelNestedScrollController", "enableNestedState :" + z17);
        c14980xd3f2584a.m59101x10d6bbc9(z17);
        p2Var.f493948b.m57904x6fb39c33(false);
    }
}

package em2;

/* loaded from: classes3.dex */
public final class d0 {
    public static int A;
    public static org.json.JSONObject B;
    public static org.json.JSONObject C;
    public static org.json.JSONObject D;

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f336624a;

    /* renamed from: b, reason: collision with root package name */
    public final int f336625b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f336626c;

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f336627d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f336628e;

    /* renamed from: f, reason: collision with root package name */
    public km2.q f336629f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.ArrayList f336630g;

    /* renamed from: h, reason: collision with root package name */
    public java.util.LinkedList f336631h;

    /* renamed from: i, reason: collision with root package name */
    public org.json.JSONArray f336632i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f336633j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f336634k;

    /* renamed from: l, reason: collision with root package name */
    public android.graphics.Point f336635l;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f336636m;

    /* renamed from: n, reason: collision with root package name */
    public int f336637n;

    /* renamed from: o, reason: collision with root package name */
    public java.util.ArrayList f336638o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.Boolean f336639p;

    /* renamed from: q, reason: collision with root package name */
    public xh2.d f336640q;

    /* renamed from: r, reason: collision with root package name */
    public gk2.e f336641r;

    /* renamed from: s, reason: collision with root package name */
    public int f336642s;

    /* renamed from: t, reason: collision with root package name */
    public int f336643t;

    /* renamed from: u, reason: collision with root package name */
    public int f336644u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f336645v;

    /* renamed from: w, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2776x373aa5.p2785x674500b.C22840x82866af5 f336646w;

    /* renamed from: x, reason: collision with root package name */
    public android.view.View f336647x;

    /* renamed from: y, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.mic.p1513xc350790d.C14245x86828950 f336648y;

    /* renamed from: z, reason: collision with root package name */
    public android.view.ViewGroup f336649z;

    public d0(android.content.Context context, int i17, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        i17 = (i18 & 2) != 0 ? 1 : i17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f336624a = context;
        this.f336625b = i17;
        this.f336626c = "Finder.FinderMiniWindowFloatLayoutAdapter";
        this.f336627d = jz5.h.b(new em2.x(this));
        this.f336628e = jz5.h.b(new em2.c0(this));
        this.f336630g = new java.util.ArrayList();
        this.f336631h = new java.util.LinkedList();
        this.f336635l = new android.graphics.Point(0, 0);
        this.f336636m = "";
        this.f336638o = new java.util.ArrayList();
    }

    public final android.graphics.Point a(gk2.e eVar) {
        dk2.ef efVar = dk2.ef.f314905a;
        tn0.w0 w0Var = dk2.ef.f314911d;
        if (w0Var != null) {
            android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            android.graphics.Point z17 = w0Var.z(context, ((mm2.c1) eVar.a(mm2.c1.class)).O7());
            if (z17 != null) {
                return z17;
            }
        }
        return ko0.t.f391436a.a(((mm2.c1) eVar.a(mm2.c1.class)).f410412s2, ((mm2.c1) eVar.a(mm2.c1.class)).f410418t2);
    }

    public final void b(android.view.View view, int i17, int i18, int i19, int i27) {
        if (i27 == 4) {
            view.setBackground(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.cnf));
            return;
        }
        if (i27 == 5 || i27 == 6) {
            view.setBackground(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.cpw));
            return;
        }
        boolean z17 = true;
        if ((i17 != 0 || (i19 != 2 && i19 != 1 && i19 != 2 && i19 != 4)) && i17 != 2) {
            z17 = false;
        }
        if (!z17) {
            if (this.f336625b != 2) {
                view.setBackground(null);
            }
        } else {
            ya2.g gVar = ya2.h.f542017a;
            gk2.e eVar = this.f336641r;
            ya2.b2 b17 = gVar.b(eVar != null ? ((mm2.c1) eVar.a(mm2.c1.class)).f410385o : null);
            if (b17 != null) {
                zl2.r4.f555483a.k(view, b17.y0());
            }
        }
    }
}

package du0;

/* loaded from: classes5.dex */
public abstract class o extends du0.g implements dv0.a {

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f324923i;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f324924m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f324925n;

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f324926o;

    /* renamed from: p, reason: collision with root package name */
    public final java.util.Map f324927p;

    /* renamed from: q, reason: collision with root package name */
    public final cv0.f f324928q;

    /* renamed from: r, reason: collision with root package name */
    public android.view.View f324929r;

    /* renamed from: s, reason: collision with root package name */
    public android.view.View f324930s;

    /* renamed from: t, reason: collision with root package name */
    public final com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3974x289f3e f324931t;

    /* renamed from: u, reason: collision with root package name */
    public final android.graphics.Rect f324932u;

    /* renamed from: v, reason: collision with root package name */
    public final jz5.g f324933v;

    /* renamed from: w, reason: collision with root package name */
    public final jz5.g f324934w;

    /* renamed from: x, reason: collision with root package name */
    public final android.graphics.Rect f324935x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f324923i = jz5.h.b(new du0.k(this));
        this.f324924m = jz5.h.b(new du0.h(this));
        this.f324925n = jz5.h.b(new du0.n(this));
        this.f324926o = jz5.h.b(new du0.m(this));
        this.f324927p = new java.util.LinkedHashMap();
        cv0.l lVar = cv0.h.f304071a;
        cv0.e eVar = cv0.e.f304064d;
        cv0.e eVar2 = cv0.e.f304063c;
        this.f324928q = new cv0.f(eVar, eVar, eVar2);
        this.f324931t = new com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3974x289f3e();
        this.f324932u = new android.graphics.Rect();
        this.f324933v = jz5.h.b(new du0.j(this));
        this.f324934w = jz5.h.b(new du0.i(this));
        this.f324935x = new android.graphics.Rect();
        for (java.util.Map.Entry entry : ((java.util.LinkedHashMap) kz5.c1.l(new jz5.l(bu0.b.f106015m, new cv0.f(eVar, eVar2, eVar2)), new jz5.l(bu0.b.f106014i, new cv0.f(eVar, eVar2, eVar2)), new jz5.l(bu0.b.f106010e, new cv0.f(eVar, eVar, eVar2)), new jz5.l(bu0.b.f106011f, new cv0.f(eVar, eVar, eVar2)), new jz5.l(bu0.b.f106016n, new cv0.f(eVar, eVar, eVar2)), new jz5.l(bu0.b.f106017o, new cv0.f(eVar, eVar2, eVar2)), new jz5.l(bu0.b.f106018p, new cv0.f(eVar, eVar2, eVar2)))).entrySet()) {
            bu0.b materialType = (bu0.b) entry.getKey();
            cv0.f options = (cv0.f) entry.getValue();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(materialType, "materialType");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(options, "options");
            this.f324927p.put(materialType, options);
        }
    }

    public static /* synthetic */ void o7(du0.o oVar, com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 c3971x241f78, boolean z17, boolean z18, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showHandleBoxForItem");
        }
        if ((i17 & 2) != 0) {
            z17 = true;
        }
        if ((i17 & 4) != 0) {
            z18 = true;
        }
        oVar.n7(c3971x241f78, z17, z18);
    }

    public final void U6(boolean z17) {
        if (q()) {
            X6().l(z17);
        }
    }

    public abstract cv0.c V6();

    public final gx0.w W6() {
        return (gx0.w) ((jz5.n) this.f324924m).mo141623x754a37bb();
    }

    public final cv0.c X6() {
        return (cv0.c) ((jz5.n) this.f324934w).mo141623x754a37bb();
    }

    public final yw0.k Y6() {
        return (yw0.k) ((jz5.n) this.f324933v).mo141623x754a37bb();
    }

    public final java.util.List Z6(bu0.b materialType) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(materialType, "materialType");
        com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3974x289f3e b76 = b7();
        cv0.l lVar = cv0.h.f304071a;
        com.p314xaae8f345.p457x3304c6.p477x633fb29.C4118xbb09bdf5 c4118xbb09bdf5 = new com.p314xaae8f345.p457x3304c6.p477x633fb29.C4118xbb09bdf5(1.0f, 0.0f, new com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3974x289f3e(0.0f, 11.0f), new com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3974x289f3e(0.5f, 0.5f));
        c4118xbb09bdf5.m33873xa32537ab(new com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3974x289f3e(c4118xbb09bdf5.m33869xa86cd69f().f129332x, c4118xbb09bdf5.m33869xa86cd69f().f129333y / b76.f129333y));
        float f17 = 9.0f / b76.f129332x;
        android.app.Activity context = m80379x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        int ordinal = materialType.ordinal();
        if (ordinal == 1) {
            return cv0.h.d(cv0.h.c(context, com.p314xaae8f345.mm.R.C30867xcad56011.m_h), c4118xbb09bdf5, f17);
        }
        if (ordinal == 2) {
            return cv0.h.d(cv0.h.c(context, com.p314xaae8f345.mm.R.C30867xcad56011.m_l), c4118xbb09bdf5, f17);
        }
        switch (ordinal) {
            case 5:
                return cv0.h.d(cv0.h.c(context, com.p314xaae8f345.mm.R.C30867xcad56011.m_i), c4118xbb09bdf5, f17);
            case 6:
                return cv0.h.d(cv0.h.c(context, com.p314xaae8f345.mm.R.C30867xcad56011.m_g), c4118xbb09bdf5, f17);
            case 7:
                return cv0.h.d(cv0.h.c(context, com.p314xaae8f345.mm.R.C30867xcad56011.m_j), c4118xbb09bdf5, f17);
            case 8:
                return cv0.h.d(cv0.h.c(context, com.p314xaae8f345.mm.R.C30867xcad56011.m_k), c4118xbb09bdf5, f17);
            case 9:
                return cv0.h.d(cv0.h.c(context, com.p314xaae8f345.mm.R.C30867xcad56011.m_f), c4118xbb09bdf5, f17);
            default:
                return kz5.p0.f395529d;
        }
    }

    public final yt0.c a7() {
        return (yt0.c) ((jz5.n) this.f324923i).mo141623x754a37bb();
    }

    public com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3974x289f3e b7() {
        android.view.View view = this.f324930s;
        com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3974x289f3e c3974x289f3e = this.f324931t;
        if (view != null) {
            c3974x289f3e.set(view.getScaleX(), view.getScaleY());
        }
        return c3974x289f3e;
    }

    public void c7(au0.b boxItem) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(boxItem, "boxItem");
    }

    public void d7() {
    }

    public boolean e7(com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 mjID) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mjID, "mjID");
        return true;
    }

    public final boolean f7(com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 segmentID) {
        java.lang.Object obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(segmentID, "segmentID");
        cv0.c X6 = X6();
        X6.getClass();
        java.util.ArrayList arrayList = X6.f304062d;
        if (arrayList.isEmpty()) {
            return false;
        }
        java.util.Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((cv0.a) obj).f304056a.c(), segmentID)) {
                break;
            }
        }
        return obj != null;
    }

    public abstract hw0.n g7();

    public abstract ow0.a0 h7();

    public abstract gx0.w i7();

    public abstract yt0.c k7();

    public final void l7() {
        cv0.c X6;
        au0.b n17;
        if (!q() || (n17 = (X6 = X6()).n()) == null) {
            return;
        }
        X6.o(n17);
        du0.o oVar = (du0.o) X6.f304061c;
        oVar.getClass();
        oVar.m7(n17, false);
    }

    public void m7(au0.b boxItem, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(boxItem, "boxItem");
    }

    public final void n7(com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 mjID, boolean z17, boolean z18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mjID, "mjID");
        cv0.c X6 = X6();
        X6.getClass();
        X6.j(mjID, null, z17, z18);
    }

    @Override // du0.g, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onViewCreated */
    public void mo47092x594b1124(android.view.View contentView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contentView, "contentView");
        super.mo47092x594b1124(contentView);
        this.f324930s = contentView.findViewById(com.p314xaae8f345.mm.R.id.s3j);
        this.f324929r = contentView.findViewById(com.p314xaae8f345.mm.R.id.q8q);
        d7();
    }

    public final void p7() {
        if (a7().A4()) {
            a7().j();
        }
    }
}

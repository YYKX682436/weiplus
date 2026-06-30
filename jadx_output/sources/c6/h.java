package c6;

/* loaded from: classes14.dex */
public final class h {
    public final c6.b A;
    public final java.lang.Integer B;
    public final android.graphics.drawable.Drawable C;
    public final java.lang.Integer D;
    public final android.graphics.drawable.Drawable E;
    public final java.lang.Integer F;
    public final android.graphics.drawable.Drawable G;
    public androidx.lifecycle.o H;
    public d6.h I;

    /* renamed from: J, reason: collision with root package name */
    public d6.g f38802J;

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f38803a;

    /* renamed from: b, reason: collision with root package name */
    public c6.c f38804b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.Object f38805c;

    /* renamed from: d, reason: collision with root package name */
    public e6.b f38806d;

    /* renamed from: e, reason: collision with root package name */
    public final c6.i f38807e;

    /* renamed from: f, reason: collision with root package name */
    public final coil.memory.MemoryCache$Key f38808f;

    /* renamed from: g, reason: collision with root package name */
    public final coil.memory.MemoryCache$Key f38809g;

    /* renamed from: h, reason: collision with root package name */
    public final android.graphics.ColorSpace f38810h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.l f38811i;

    /* renamed from: j, reason: collision with root package name */
    public final v5.g f38812j;

    /* renamed from: k, reason: collision with root package name */
    public java.util.List f38813k;

    /* renamed from: l, reason: collision with root package name */
    public final l36.h0 f38814l;

    /* renamed from: m, reason: collision with root package name */
    public final c6.o f38815m;

    /* renamed from: n, reason: collision with root package name */
    public final androidx.lifecycle.o f38816n;

    /* renamed from: o, reason: collision with root package name */
    public d6.h f38817o;

    /* renamed from: p, reason: collision with root package name */
    public d6.g f38818p;

    /* renamed from: q, reason: collision with root package name */
    public final kotlinx.coroutines.p0 f38819q;

    /* renamed from: r, reason: collision with root package name */
    public g6.e f38820r;

    /* renamed from: s, reason: collision with root package name */
    public d6.d f38821s;

    /* renamed from: t, reason: collision with root package name */
    public final android.graphics.Bitmap.Config f38822t;

    /* renamed from: u, reason: collision with root package name */
    public final java.lang.Boolean f38823u;

    /* renamed from: v, reason: collision with root package name */
    public final java.lang.Boolean f38824v;

    /* renamed from: w, reason: collision with root package name */
    public final boolean f38825w;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f38826x;

    /* renamed from: y, reason: collision with root package name */
    public final c6.b f38827y;

    /* renamed from: z, reason: collision with root package name */
    public final c6.b f38828z;

    public h(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        this.f38803a = context;
        this.f38804b = c6.c.f38772m;
        this.f38805c = null;
        this.f38806d = null;
        this.f38807e = null;
        this.f38808f = null;
        this.f38809g = null;
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            this.f38810h = null;
        }
        this.f38811i = null;
        this.f38812j = null;
        this.f38813k = kz5.p0.f313996d;
        this.f38814l = null;
        this.f38815m = null;
        this.f38816n = null;
        this.f38817o = null;
        this.f38818p = null;
        this.f38819q = null;
        this.f38820r = null;
        this.f38821s = null;
        this.f38822t = null;
        this.f38823u = null;
        this.f38824v = null;
        this.f38825w = true;
        this.f38826x = true;
        this.f38827y = null;
        this.f38828z = null;
        this.A = null;
        this.B = null;
        this.C = null;
        this.D = null;
        this.E = null;
        this.F = null;
        this.G = null;
        this.H = null;
        this.I = null;
        this.f38802J = null;
    }

    public final c6.j a() {
        l36.i0 i0Var;
        androidx.lifecycle.o oVar;
        d6.h hVar;
        d6.h aVar;
        androidx.lifecycle.o mo133getLifecycle;
        android.content.Context context = this.f38803a;
        java.lang.Object obj = this.f38805c;
        if (obj == null) {
            obj = c6.m.f38859a;
        }
        java.lang.Object obj2 = obj;
        e6.b bVar = this.f38806d;
        c6.i iVar = this.f38807e;
        coil.memory.MemoryCache$Key memoryCache$Key = this.f38808f;
        coil.memory.MemoryCache$Key memoryCache$Key2 = this.f38809g;
        android.graphics.ColorSpace colorSpace = this.f38810h;
        jz5.l lVar = this.f38811i;
        v5.g gVar = this.f38812j;
        java.util.List list = this.f38813k;
        l36.h0 h0Var = this.f38814l;
        l36.i0 i0Var2 = h0Var == null ? null : new l36.i0(h0Var);
        if (i0Var2 == null) {
            i0Var = h6.d.f279116a;
        } else {
            l36.i0 i0Var3 = h6.d.f279116a;
            i0Var = i0Var2;
        }
        c6.o oVar2 = this.f38815m;
        c6.p pVar = oVar2 == null ? null : new c6.p(kz5.c1.s(oVar2.f38860a));
        c6.p pVar2 = pVar == null ? c6.p.f38861e : pVar;
        android.content.Context context2 = this.f38803a;
        androidx.lifecycle.o oVar3 = this.f38816n;
        if (oVar3 == null && (oVar3 = this.H) == null) {
            e6.b bVar2 = this.f38806d;
            java.lang.Object context3 = bVar2 instanceof e6.c ? ((coil.target.ImageViewTarget) ((e6.c) bVar2)).f43914d.getContext() : context2;
            while (true) {
                if (context3 instanceof androidx.lifecycle.y) {
                    mo133getLifecycle = ((androidx.lifecycle.y) context3).mo133getLifecycle();
                    break;
                }
                if (!(context3 instanceof android.content.ContextWrapper)) {
                    mo133getLifecycle = null;
                    break;
                }
                context3 = ((android.content.ContextWrapper) context3).getBaseContext();
            }
            if (mo133getLifecycle == null) {
                mo133getLifecycle = c6.g.f38800b;
            }
            oVar3 = mo133getLifecycle;
        }
        d6.h hVar2 = this.f38817o;
        if (hVar2 == null && (hVar2 = this.I) == null) {
            e6.b bVar3 = this.f38806d;
            oVar = oVar3;
            if (bVar3 instanceof e6.c) {
                android.widget.ImageView view = ((coil.target.ImageViewTarget) ((e6.c) bVar3)).f43914d;
                if (view instanceof android.widget.ImageView) {
                    android.widget.ImageView.ScaleType scaleType = view.getScaleType();
                    if (scaleType == android.widget.ImageView.ScaleType.CENTER || scaleType == android.widget.ImageView.ScaleType.MATRIX) {
                        int i17 = d6.h.f226644a;
                        aVar = new d6.e(coil.size.OriginalSize.f43911d);
                    }
                }
                int i18 = d6.l.f226652a;
                kotlin.jvm.internal.o.g(view, "view");
                aVar = new d6.f(view, true);
            } else {
                aVar = new d6.a(context2);
            }
            hVar = aVar;
        } else {
            oVar = oVar3;
            hVar = hVar2;
        }
        d6.g gVar2 = this.f38818p;
        if (gVar2 == null && (gVar2 = this.f38802J) == null) {
            d6.h hVar3 = this.f38817o;
            if (hVar3 instanceof d6.l) {
                android.view.View view2 = ((d6.f) ((d6.l) hVar3)).f226639c;
                if (view2 instanceof android.widget.ImageView) {
                    gVar2 = h6.d.c((android.widget.ImageView) view2);
                }
            }
            e6.b bVar4 = this.f38806d;
            if (bVar4 instanceof e6.c) {
                android.widget.ImageView imageView = ((coil.target.ImageViewTarget) ((e6.c) bVar4)).f43914d;
                if (imageView instanceof android.widget.ImageView) {
                    gVar2 = h6.d.c(imageView);
                }
            }
            gVar2 = d6.g.FILL;
        }
        d6.g gVar3 = gVar2;
        kotlinx.coroutines.p0 p0Var = this.f38819q;
        if (p0Var == null) {
            p0Var = this.f38804b.f38773a;
        }
        kotlinx.coroutines.p0 p0Var2 = p0Var;
        g6.e eVar = this.f38820r;
        if (eVar == null) {
            eVar = this.f38804b.f38774b;
        }
        g6.e eVar2 = eVar;
        d6.d dVar = this.f38821s;
        if (dVar == null) {
            dVar = this.f38804b.f38775c;
        }
        d6.d dVar2 = dVar;
        android.graphics.Bitmap.Config config = this.f38822t;
        if (config == null) {
            config = this.f38804b.f38776d;
        }
        android.graphics.Bitmap.Config config2 = config;
        boolean z17 = this.f38826x;
        java.lang.Boolean bool = this.f38823u;
        boolean booleanValue = bool == null ? this.f38804b.f38777e : bool.booleanValue();
        java.lang.Boolean bool2 = this.f38824v;
        boolean booleanValue2 = bool2 == null ? this.f38804b.f38778f : bool2.booleanValue();
        boolean z18 = this.f38825w;
        c6.b bVar5 = this.f38827y;
        c6.b bVar6 = bVar5 == null ? this.f38804b.f38782j : bVar5;
        c6.b bVar7 = this.f38828z;
        d6.h hVar4 = hVar;
        c6.b bVar8 = bVar7 == null ? this.f38804b.f38783k : bVar7;
        c6.b bVar9 = this.A;
        c6.p pVar3 = pVar2;
        c6.b bVar10 = bVar9 == null ? this.f38804b.f38784l : bVar9;
        c6.d dVar3 = new c6.d(this.f38816n, this.f38817o, this.f38818p, this.f38819q, this.f38820r, this.f38821s, this.f38822t, this.f38823u, this.f38824v, bVar5, bVar7, bVar9);
        c6.c cVar = this.f38804b;
        java.lang.Integer num = this.B;
        android.graphics.drawable.Drawable drawable = this.C;
        java.lang.Integer num2 = this.D;
        android.graphics.drawable.Drawable drawable2 = this.E;
        java.lang.Integer num3 = this.F;
        android.graphics.drawable.Drawable drawable3 = this.G;
        kotlin.jvm.internal.o.f(i0Var, "orEmpty()");
        return new c6.j(context, obj2, bVar, iVar, memoryCache$Key, memoryCache$Key2, colorSpace, lVar, gVar, list, i0Var, pVar3, oVar, hVar4, gVar3, p0Var2, eVar2, dVar2, config2, z17, booleanValue, booleanValue2, z18, bVar6, bVar8, bVar10, num, drawable, num2, drawable2, num3, drawable3, dVar3, cVar, null);
    }

    public h(c6.j request, android.content.Context context) {
        kotlin.jvm.internal.o.g(request, "request");
        kotlin.jvm.internal.o.g(context, "context");
        this.f38803a = context;
        this.f38804b = request.H;
        this.f38805c = request.f38830b;
        this.f38806d = request.f38831c;
        this.f38807e = request.f38832d;
        this.f38808f = request.f38833e;
        this.f38809g = request.f38834f;
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            this.f38810h = request.f38835g;
        }
        this.f38811i = request.f38836h;
        this.f38812j = request.f38837i;
        this.f38813k = request.f38838j;
        this.f38814l = request.f38839k.e();
        c6.p pVar = request.f38840l;
        pVar.getClass();
        this.f38815m = new c6.o(pVar);
        c6.d dVar = request.G;
        this.f38816n = dVar.f38785a;
        this.f38817o = dVar.f38786b;
        this.f38818p = dVar.f38787c;
        this.f38819q = dVar.f38788d;
        this.f38820r = dVar.f38789e;
        this.f38821s = dVar.f38790f;
        this.f38822t = dVar.f38791g;
        this.f38823u = dVar.f38792h;
        this.f38824v = dVar.f38793i;
        this.f38825w = request.f38851w;
        this.f38826x = request.f38848t;
        this.f38827y = dVar.f38794j;
        this.f38828z = dVar.f38795k;
        this.A = dVar.f38796l;
        this.B = request.A;
        this.C = request.B;
        this.D = request.C;
        this.E = request.D;
        this.F = request.E;
        this.G = request.F;
        if (request.f38829a == context) {
            this.H = request.f38841m;
            this.I = request.f38842n;
            this.f38802J = request.f38843o;
        } else {
            this.H = null;
            this.I = null;
            this.f38802J = null;
        }
    }
}

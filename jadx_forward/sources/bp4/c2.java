package bp4;

/* loaded from: classes10.dex */
public final class c2 extends yt3.a implements bp4.b0 {
    public final jz5.g A;

    /* renamed from: f, reason: collision with root package name */
    public final android.view.ViewGroup f104650f;

    /* renamed from: g, reason: collision with root package name */
    public final android.content.Context f104651g;

    /* renamed from: h, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 f104652h;

    /* renamed from: i, reason: collision with root package name */
    public final android.view.View f104653i;

    /* renamed from: m, reason: collision with root package name */
    public final android.view.View f104654m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f104655n;

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f104656o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f104657p;

    /* renamed from: q, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.h1 f104658q;

    /* renamed from: r, reason: collision with root package name */
    public final jz5.g f104659r;

    /* renamed from: s, reason: collision with root package name */
    public final jz5.g f104660s;

    /* renamed from: t, reason: collision with root package name */
    public final jz5.g f104661t;

    /* renamed from: u, reason: collision with root package name */
    public final int f104662u;

    /* renamed from: v, reason: collision with root package name */
    public final int f104663v;

    /* renamed from: w, reason: collision with root package name */
    public rm5.k f104664w;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f104665x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f104666y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f104667z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c2(android.view.ViewGroup layout, ju3.d0 status) {
        super(status, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(layout, "layout");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(status, "status");
        this.f104650f = layout;
        android.content.Context context = layout.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        this.f104651g = context;
        this.f104652h = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("MultiEditPostPreviewPlugin");
        android.view.View findViewById = layout.findViewById(com.p314xaae8f345.mm.R.id.gws);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f104653i = findViewById;
        android.view.View findViewById2 = layout.findViewById(com.p314xaae8f345.mm.R.id.gwk);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.f104654m = findViewById2;
        this.f104655n = jz5.h.b(new bp4.v1(this));
        this.f104656o = jz5.h.b(new bp4.x1(this));
        this.f104659r = jz5.h.b(new bp4.u1(this));
        this.f104660s = jz5.h.b(new bp4.z1(this));
        this.f104661t = jz5.h.b(new bp4.y1(this));
        this.f104662u = i65.a.h(context, com.p314xaae8f345.mm.R.C30860x5b28f31.f561190bu);
        this.f104663v = i65.a.h(context, com.p314xaae8f345.mm.R.C30860x5b28f31.f561212cf);
        this.A = jz5.h.b(new bp4.b2(this));
        findViewById.setOnClickListener(new bp4.s1(this));
        findViewById2.setOnClickListener(new bp4.t1(this));
    }

    public static final android.view.View z(bp4.c2 c2Var) {
        java.lang.Object mo141623x754a37bb = ((jz5.n) c2Var.f104659r).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        return (android.view.View) mo141623x754a37bb;
    }

    public final void A(boolean z17) {
        this.f104657p = z17;
        jz5.g gVar = this.f104656o;
        jz5.g gVar2 = this.f104655n;
        android.content.Context context = this.f104651g;
        if (z17) {
            android.view.View view = this.f104654m;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/vlog/ui/plugin/MultiEditPostPreviewPlugin", "changePreviewMode", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/vlog/ui/plugin/MultiEditPostPreviewPlugin", "changePreviewMode", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view2 = this.f104653i;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/vlog/ui/plugin/MultiEditPostPreviewPlugin", "changePreviewMode", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/vlog/ui/plugin/MultiEditPostPreviewPlugin", "changePreviewMode", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view3 = (android.view.View) ((jz5.n) gVar2).mo141623x754a37bb();
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/vlog/ui/plugin/MultiEditPostPreviewPlugin", "changePreviewMode", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/vlog/ui/plugin/MultiEditPostPreviewPlugin", "changePreviewMode", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            ((android.widget.Button) ((jz5.n) gVar).mo141623x754a37bb()).setText(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572040x1));
        } else {
            android.view.View view4 = this.f104654m;
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList4.add(8);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/plugin/vlog/ui/plugin/MultiEditPostPreviewPlugin", "changePreviewMode", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(view4, "com/tencent/mm/plugin/vlog/ui/plugin/MultiEditPostPreviewPlugin", "changePreviewMode", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view5 = this.f104653i;
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            arrayList5.add(0);
            java.util.Collections.reverse(arrayList5);
            yj0.a.d(view5, arrayList5.toArray(), "com/tencent/mm/plugin/vlog/ui/plugin/MultiEditPostPreviewPlugin", "changePreviewMode", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view5.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
            yj0.a.f(view5, "com/tencent/mm/plugin/vlog/ui/plugin/MultiEditPostPreviewPlugin", "changePreviewMode", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view6 = (android.view.View) ((jz5.n) gVar2).mo141623x754a37bb();
            java.util.ArrayList arrayList6 = new java.util.ArrayList();
            arrayList6.add(0);
            java.util.Collections.reverse(arrayList6);
            yj0.a.d(view6, arrayList6.toArray(), "com/tencent/mm/plugin/vlog/ui/plugin/MultiEditPostPreviewPlugin", "changePreviewMode", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view6.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
            yj0.a.f(view6, "com/tencent/mm/plugin/vlog/ui/plugin/MultiEditPostPreviewPlugin", "changePreviewMode", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            ((android.widget.Button) ((jz5.n) gVar).mo141623x754a37bb()).setText(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572035ww));
        }
        ju3.c0 c0Var = ju3.c0.E1;
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("PARAM_1_INT", this.f104657p ? 2 : 1);
        this.f546865d.w(c0Var, bundle);
    }

    public final void B(boolean z17) {
        this.f104666y = z17;
        if (z17) {
            android.view.View view = this.f104653i;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/vlog/ui/plugin/MultiEditPostPreviewPlugin", "enablePreview", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/vlog/ui/plugin/MultiEditPostPreviewPlugin", "enablePreview", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        android.view.View view2 = this.f104653i;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/vlog/ui/plugin/MultiEditPostPreviewPlugin", "enablePreview", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/vlog/ui/plugin/MultiEditPostPreviewPlugin", "enablePreview", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public final void C() {
        android.graphics.Bitmap a17;
        java.lang.String str = this.f104665x;
        int i17 = this.f104663v;
        int i18 = this.f104662u;
        if (str != null && (a17 = j33.n.a(com.p314xaae8f345.mm.vfs.w6.i(str, false), java.lang.Math.max(i18, i17))) != null) {
            try {
                int m7343x245ab229 = new p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9(com.p314xaae8f345.mm.vfs.w6.E(str)).m7343x245ab229(p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3264x118c46b, 1);
                android.graphics.Matrix matrix = new android.graphics.Matrix();
                matrix.postRotate(m7343x245ab229 != 3 ? m7343x245ab229 != 6 ? m7343x245ab229 != 8 ? 0.0f : 270.0f : 90.0f : 180.0f);
                int width = a17.getWidth();
                int height = a17.getHeight();
                zj0.a aVar = new zj0.a();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                aVar.c(java.lang.Boolean.TRUE);
                aVar.c(matrix);
                aVar.c(java.lang.Integer.valueOf(height));
                aVar.c(java.lang.Integer.valueOf(width));
                aVar.c(0);
                aVar.c(0);
                aVar.c(a17);
                java.lang.Object obj = new java.lang.Object();
                yj0.a.d(obj, aVar.b(), "com/tencent/mm/plugin/vlog/ui/plugin/MultiEditPostPreviewPlugin", "ensureThumb", "()V", "android/graphics/Bitmap_EXEC_", "createBitmap", "(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;");
                android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap((android.graphics.Bitmap) aVar.a(0), ((java.lang.Integer) aVar.a(1)).intValue(), ((java.lang.Integer) aVar.a(2)).intValue(), ((java.lang.Integer) aVar.a(3)).intValue(), ((java.lang.Integer) aVar.a(4)).intValue(), (android.graphics.Matrix) aVar.a(5), ((java.lang.Boolean) aVar.a(6)).booleanValue());
                yj0.a.e(obj, createBitmap, "com/tencent/mm/plugin/vlog/ui/plugin/MultiEditPostPreviewPlugin", "ensureThumb", "()V", "android/graphics/Bitmap_EXEC_", "createBitmap", "(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(createBitmap, "createBitmap(...)");
                ((android.widget.ImageView) ((jz5.n) this.f104660s).mo141623x754a37bb()).setImageBitmap(createBitmap);
                ((android.widget.ImageView) ((jz5.n) this.f104661t).mo141623x754a37bb()).setImageBitmap(createBitmap);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MultiEditPostPreviewPlugin", "cannot decode thumbnail from " + this.f104665x + ", " + e17.getLocalizedMessage());
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.h1 h1Var = this.f104658q;
        if (h1Var != null) {
            rm5.k kVar = this.f104664w;
            if (kVar != null) {
                ((rm5.h) kVar).mo122875x5cd39ffa();
            }
            rm5.h a18 = rm5.h.f479022h.a(((com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.i1) kz5.n0.X(h1Var.f257130c)).f257160l);
            this.f104664w = a18;
            a18.mo122876x76500f83(i18, i17);
            rm5.k kVar2 = this.f104664w;
            if (kVar2 != null) {
                ((rm5.h) kVar2).a(kz5.b0.c(0L), new bp4.w1(this));
            }
        }
    }

    public final void D() {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var = this.f104652h;
        if (o4Var.getBoolean("isFirstEnter", false) || !this.f104666y) {
            return;
        }
        o4Var.putBoolean("isFirstEnter", true);
        C();
        ((y9.i) ((jz5.n) this.A).mo141623x754a37bb()).show();
    }

    @Override // bp4.b0
    public void b(com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.h1 h1Var, long j17, boolean z17) {
        this.f104658q = h1Var;
    }

    @Override // yt3.r2
    /* renamed from: onBackPress */
    public boolean mo9064x4ceae47d() {
        if (!this.f104657p) {
            return false;
        }
        A(false);
        return true;
    }
}

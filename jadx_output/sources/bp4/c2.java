package bp4;

/* loaded from: classes10.dex */
public final class c2 extends yt3.a implements bp4.b0 {
    public final jz5.g A;

    /* renamed from: f, reason: collision with root package name */
    public final android.view.ViewGroup f23117f;

    /* renamed from: g, reason: collision with root package name */
    public final android.content.Context f23118g;

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.o4 f23119h;

    /* renamed from: i, reason: collision with root package name */
    public final android.view.View f23120i;

    /* renamed from: m, reason: collision with root package name */
    public final android.view.View f23121m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f23122n;

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f23123o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f23124p;

    /* renamed from: q, reason: collision with root package name */
    public com.tencent.mm.plugin.vlog.model.h1 f23125q;

    /* renamed from: r, reason: collision with root package name */
    public final jz5.g f23126r;

    /* renamed from: s, reason: collision with root package name */
    public final jz5.g f23127s;

    /* renamed from: t, reason: collision with root package name */
    public final jz5.g f23128t;

    /* renamed from: u, reason: collision with root package name */
    public final int f23129u;

    /* renamed from: v, reason: collision with root package name */
    public final int f23130v;

    /* renamed from: w, reason: collision with root package name */
    public rm5.k f23131w;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f23132x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f23133y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f23134z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c2(android.view.ViewGroup layout, ju3.d0 status) {
        super(status, null);
        kotlin.jvm.internal.o.g(layout, "layout");
        kotlin.jvm.internal.o.g(status, "status");
        this.f23117f = layout;
        android.content.Context context = layout.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        this.f23118g = context;
        this.f23119h = com.tencent.mm.sdk.platformtools.o4.M("MultiEditPostPreviewPlugin");
        android.view.View findViewById = layout.findViewById(com.tencent.mm.R.id.gws);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f23120i = findViewById;
        android.view.View findViewById2 = layout.findViewById(com.tencent.mm.R.id.gwk);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f23121m = findViewById2;
        this.f23122n = jz5.h.b(new bp4.v1(this));
        this.f23123o = jz5.h.b(new bp4.x1(this));
        this.f23126r = jz5.h.b(new bp4.u1(this));
        this.f23127s = jz5.h.b(new bp4.z1(this));
        this.f23128t = jz5.h.b(new bp4.y1(this));
        this.f23129u = i65.a.h(context, com.tencent.mm.R.dimen.f479657bu);
        this.f23130v = i65.a.h(context, com.tencent.mm.R.dimen.f479679cf);
        this.A = jz5.h.b(new bp4.b2(this));
        findViewById.setOnClickListener(new bp4.s1(this));
        findViewById2.setOnClickListener(new bp4.t1(this));
    }

    public static final android.view.View z(bp4.c2 c2Var) {
        java.lang.Object value = ((jz5.n) c2Var.f23126r).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (android.view.View) value;
    }

    public final void A(boolean z17) {
        this.f23124p = z17;
        jz5.g gVar = this.f23123o;
        jz5.g gVar2 = this.f23122n;
        android.content.Context context = this.f23118g;
        if (z17) {
            android.view.View view = this.f23121m;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/vlog/ui/plugin/MultiEditPostPreviewPlugin", "changePreviewMode", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/vlog/ui/plugin/MultiEditPostPreviewPlugin", "changePreviewMode", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view2 = this.f23120i;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/vlog/ui/plugin/MultiEditPostPreviewPlugin", "changePreviewMode", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/vlog/ui/plugin/MultiEditPostPreviewPlugin", "changePreviewMode", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view3 = (android.view.View) ((jz5.n) gVar2).getValue();
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/vlog/ui/plugin/MultiEditPostPreviewPlugin", "changePreviewMode", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/vlog/ui/plugin/MultiEditPostPreviewPlugin", "changePreviewMode", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            ((android.widget.Button) ((jz5.n) gVar).getValue()).setText(context.getString(com.tencent.mm.R.string.f490507x1));
        } else {
            android.view.View view4 = this.f23121m;
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList4.add(8);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/plugin/vlog/ui/plugin/MultiEditPostPreviewPlugin", "changePreviewMode", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(view4, "com/tencent/mm/plugin/vlog/ui/plugin/MultiEditPostPreviewPlugin", "changePreviewMode", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view5 = this.f23120i;
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            arrayList5.add(0);
            java.util.Collections.reverse(arrayList5);
            yj0.a.d(view5, arrayList5.toArray(), "com/tencent/mm/plugin/vlog/ui/plugin/MultiEditPostPreviewPlugin", "changePreviewMode", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view5.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
            yj0.a.f(view5, "com/tencent/mm/plugin/vlog/ui/plugin/MultiEditPostPreviewPlugin", "changePreviewMode", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view6 = (android.view.View) ((jz5.n) gVar2).getValue();
            java.util.ArrayList arrayList6 = new java.util.ArrayList();
            arrayList6.add(0);
            java.util.Collections.reverse(arrayList6);
            yj0.a.d(view6, arrayList6.toArray(), "com/tencent/mm/plugin/vlog/ui/plugin/MultiEditPostPreviewPlugin", "changePreviewMode", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view6.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
            yj0.a.f(view6, "com/tencent/mm/plugin/vlog/ui/plugin/MultiEditPostPreviewPlugin", "changePreviewMode", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            ((android.widget.Button) ((jz5.n) gVar).getValue()).setText(context.getString(com.tencent.mm.R.string.f490502ww));
        }
        ju3.c0 c0Var = ju3.c0.E1;
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("PARAM_1_INT", this.f23124p ? 2 : 1);
        this.f465332d.w(c0Var, bundle);
    }

    public final void B(boolean z17) {
        this.f23133y = z17;
        if (z17) {
            android.view.View view = this.f23120i;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/vlog/ui/plugin/MultiEditPostPreviewPlugin", "enablePreview", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/vlog/ui/plugin/MultiEditPostPreviewPlugin", "enablePreview", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        android.view.View view2 = this.f23120i;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/vlog/ui/plugin/MultiEditPostPreviewPlugin", "enablePreview", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/vlog/ui/plugin/MultiEditPostPreviewPlugin", "enablePreview", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public final void C() {
        android.graphics.Bitmap a17;
        java.lang.String str = this.f23132x;
        int i17 = this.f23130v;
        int i18 = this.f23129u;
        if (str != null && (a17 = j33.n.a(com.tencent.mm.vfs.w6.i(str, false), java.lang.Math.max(i18, i17))) != null) {
            try {
                int attributeInt = new androidx.exifinterface.media.ExifInterface(com.tencent.mm.vfs.w6.E(str)).getAttributeInt(androidx.exifinterface.media.ExifInterface.TAG_ORIENTATION, 1);
                android.graphics.Matrix matrix = new android.graphics.Matrix();
                matrix.postRotate(attributeInt != 3 ? attributeInt != 6 ? attributeInt != 8 ? 0.0f : 270.0f : 90.0f : 180.0f);
                int width = a17.getWidth();
                int height = a17.getHeight();
                zj0.a aVar = new zj0.a();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
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
                kotlin.jvm.internal.o.f(createBitmap, "createBitmap(...)");
                ((android.widget.ImageView) ((jz5.n) this.f23127s).getValue()).setImageBitmap(createBitmap);
                ((android.widget.ImageView) ((jz5.n) this.f23128t).getValue()).setImageBitmap(createBitmap);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.MultiEditPostPreviewPlugin", "cannot decode thumbnail from " + this.f23132x + ", " + e17.getLocalizedMessage());
            }
        }
        com.tencent.mm.plugin.vlog.model.h1 h1Var = this.f23125q;
        if (h1Var != null) {
            rm5.k kVar = this.f23131w;
            if (kVar != null) {
                ((rm5.h) kVar).destroy();
            }
            rm5.h a18 = rm5.h.f397489h.a(((com.tencent.mm.plugin.vlog.model.i1) kz5.n0.X(h1Var.f175597c)).f175627l);
            this.f23131w = a18;
            a18.setSize(i18, i17);
            rm5.k kVar2 = this.f23131w;
            if (kVar2 != null) {
                ((rm5.h) kVar2).a(kz5.b0.c(0L), new bp4.w1(this));
            }
        }
    }

    public final void D() {
        com.tencent.mm.sdk.platformtools.o4 o4Var = this.f23119h;
        if (o4Var.getBoolean("isFirstEnter", false) || !this.f23133y) {
            return;
        }
        o4Var.putBoolean("isFirstEnter", true);
        C();
        ((y9.i) ((jz5.n) this.A).getValue()).show();
    }

    @Override // bp4.b0
    public void b(com.tencent.mm.plugin.vlog.model.h1 h1Var, long j17, boolean z17) {
        this.f23125q = h1Var;
    }

    @Override // yt3.r2
    public boolean onBackPress() {
        if (!this.f23124p) {
            return false;
        }
        A(false);
        return true;
    }
}

package androidx.compose.ui.platform;

/* loaded from: classes14.dex */
public final class r3 implements androidx.compose.ui.platform.p2 {

    /* renamed from: g, reason: collision with root package name */
    public static boolean f10730g = true;

    /* renamed from: a, reason: collision with root package name */
    public final android.view.RenderNode f10731a;

    /* renamed from: b, reason: collision with root package name */
    public int f10732b;

    /* renamed from: c, reason: collision with root package name */
    public int f10733c;

    /* renamed from: d, reason: collision with root package name */
    public int f10734d;

    /* renamed from: e, reason: collision with root package name */
    public int f10735e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f10736f;

    public r3(androidx.compose.ui.platform.AndroidComposeView ownerView) {
        kotlin.jvm.internal.o.g(ownerView, "ownerView");
        android.view.RenderNode create = android.view.RenderNode.create("Compose", ownerView);
        kotlin.jvm.internal.o.f(create, "create(\"Compose\", ownerView)");
        this.f10731a = create;
        if (f10730g) {
            create.setScaleX(create.getScaleX());
            create.setScaleY(create.getScaleY());
            create.setTranslationX(create.getTranslationX());
            create.setTranslationY(create.getTranslationY());
            create.setElevation(create.getElevation());
            create.setRotation(create.getRotation());
            create.setRotationX(create.getRotationX());
            create.setRotationY(create.getRotationY());
            create.setCameraDistance(create.getCameraDistance());
            create.setPivotX(create.getPivotX());
            create.setPivotY(create.getPivotY());
            create.setClipToOutline(create.getClipToOutline());
            create.setClipToBounds(false);
            create.setAlpha(create.getAlpha());
            create.isValid();
            create.setLeftTopRightBottom(0, 0, 0, 0);
            create.offsetLeftAndRight(0);
            create.offsetTopAndBottom(0);
            if (android.os.Build.VERSION.SDK_INT >= 28) {
                androidx.compose.ui.platform.x3 x3Var = androidx.compose.ui.platform.x3.f10814a;
                x3Var.c(create, x3Var.a(create));
                x3Var.d(create, x3Var.b(create));
            }
            androidx.compose.ui.platform.w3.f10785a.a(create);
            f10730g = false;
        }
    }

    @Override // androidx.compose.ui.platform.p2
    public float A() {
        return this.f10731a.getElevation();
    }

    @Override // androidx.compose.ui.platform.p2
    public void a(android.graphics.Canvas canvas) {
        kotlin.jvm.internal.o.g(canvas, "canvas");
        ((android.view.DisplayListCanvas) canvas).drawRenderNode(this.f10731a);
    }

    @Override // androidx.compose.ui.platform.p2
    public void b(float f17) {
        this.f10731a.setTranslationY(f17);
    }

    @Override // androidx.compose.ui.platform.p2
    public void c(boolean z17) {
        this.f10736f = z17;
        this.f10731a.setClipToBounds(z17);
    }

    @Override // androidx.compose.ui.platform.p2
    public void d(float f17) {
        this.f10731a.setElevation(f17);
    }

    @Override // androidx.compose.ui.platform.p2
    public void e(int i17) {
        this.f10733c += i17;
        this.f10735e += i17;
        this.f10731a.offsetTopAndBottom(i17);
    }

    @Override // androidx.compose.ui.platform.p2
    public boolean f() {
        return this.f10731a.isValid();
    }

    @Override // androidx.compose.ui.platform.p2
    public void g(e1.w0 w0Var) {
    }

    @Override // androidx.compose.ui.platform.p2
    public float getAlpha() {
        return this.f10731a.getAlpha();
    }

    @Override // androidx.compose.ui.platform.p2
    public int getBottom() {
        return this.f10735e;
    }

    @Override // androidx.compose.ui.platform.p2
    public int getHeight() {
        return this.f10735e - this.f10733c;
    }

    @Override // androidx.compose.ui.platform.p2
    public int getLeft() {
        return this.f10732b;
    }

    @Override // androidx.compose.ui.platform.p2
    public int getRight() {
        return this.f10734d;
    }

    @Override // androidx.compose.ui.platform.p2
    public int getTop() {
        return this.f10733c;
    }

    @Override // androidx.compose.ui.platform.p2
    public int getWidth() {
        return this.f10734d - this.f10732b;
    }

    @Override // androidx.compose.ui.platform.p2
    public boolean h() {
        return this.f10731a.getClipToOutline();
    }

    @Override // androidx.compose.ui.platform.p2
    public void i(float f17) {
        this.f10731a.setCameraDistance(-f17);
    }

    @Override // androidx.compose.ui.platform.p2
    public boolean j(boolean z17) {
        return this.f10731a.setHasOverlappingRendering(z17);
    }

    @Override // androidx.compose.ui.platform.p2
    public void k(float f17) {
        this.f10731a.setRotationX(f17);
    }

    @Override // androidx.compose.ui.platform.p2
    public void l(android.graphics.Matrix matrix) {
        kotlin.jvm.internal.o.g(matrix, "matrix");
        this.f10731a.getMatrix(matrix);
    }

    @Override // androidx.compose.ui.platform.p2
    public void m(float f17) {
        this.f10731a.setRotationY(f17);
    }

    @Override // androidx.compose.ui.platform.p2
    public void n(int i17) {
        this.f10732b += i17;
        this.f10734d += i17;
        this.f10731a.offsetLeftAndRight(i17);
    }

    @Override // androidx.compose.ui.platform.p2
    public void o(float f17) {
        this.f10731a.setRotation(f17);
    }

    @Override // androidx.compose.ui.platform.p2
    public void p(float f17) {
        this.f10731a.setPivotX(f17);
    }

    @Override // androidx.compose.ui.platform.p2
    public void q(float f17) {
        this.f10731a.setPivotY(f17);
    }

    @Override // androidx.compose.ui.platform.p2
    public void r(android.graphics.Outline outline) {
        this.f10731a.setOutline(outline);
    }

    @Override // androidx.compose.ui.platform.p2
    public void s(boolean z17) {
        this.f10731a.setClipToOutline(z17);
    }

    @Override // androidx.compose.ui.platform.p2
    public void setAlpha(float f17) {
        this.f10731a.setAlpha(f17);
    }

    @Override // androidx.compose.ui.platform.p2
    public void setScaleX(float f17) {
        this.f10731a.setScaleX(f17);
    }

    @Override // androidx.compose.ui.platform.p2
    public void setScaleY(float f17) {
        this.f10731a.setScaleY(f17);
    }

    @Override // androidx.compose.ui.platform.p2
    public boolean t(int i17, int i18, int i19, int i27) {
        this.f10732b = i17;
        this.f10733c = i18;
        this.f10734d = i19;
        this.f10735e = i27;
        return this.f10731a.setLeftTopRightBottom(i17, i18, i19, i27);
    }

    @Override // androidx.compose.ui.platform.p2
    public void u() {
        androidx.compose.ui.platform.w3.f10785a.a(this.f10731a);
    }

    @Override // androidx.compose.ui.platform.p2
    public boolean v() {
        return this.f10736f;
    }

    @Override // androidx.compose.ui.platform.p2
    public void w(e1.v canvasHolder, e1.p0 p0Var, yz5.l drawBlock) {
        kotlin.jvm.internal.o.g(canvasHolder, "canvasHolder");
        kotlin.jvm.internal.o.g(drawBlock, "drawBlock");
        int i17 = this.f10734d - this.f10732b;
        int i18 = this.f10735e - this.f10733c;
        android.view.RenderNode renderNode = this.f10731a;
        android.graphics.Canvas start = renderNode.start(i17, i18);
        kotlin.jvm.internal.o.f(start, "renderNode.start(width, height)");
        e1.b bVar = canvasHolder.f246288a;
        android.graphics.Canvas canvas = bVar.f246225a;
        bVar.f246225a = start;
        if (p0Var != null) {
            bVar.c();
            e1.t.a(bVar, p0Var, 0, 2, null);
        }
        drawBlock.invoke(bVar);
        if (p0Var != null) {
            bVar.b();
        }
        kotlin.jvm.internal.o.g(canvas, "<set-?>");
        bVar.f246225a = canvas;
        renderNode.end(start);
    }

    @Override // androidx.compose.ui.platform.p2
    public void x(int i17) {
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            androidx.compose.ui.platform.x3.f10814a.c(this.f10731a, i17);
        }
    }

    @Override // androidx.compose.ui.platform.p2
    public void y(float f17) {
        this.f10731a.setTranslationX(f17);
    }

    @Override // androidx.compose.ui.platform.p2
    public void z(int i17) {
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            androidx.compose.ui.platform.x3.f10814a.d(this.f10731a, i17);
        }
    }
}

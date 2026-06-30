package p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873;

/* loaded from: classes14.dex */
public final class r3 implements p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.p2 {

    /* renamed from: g, reason: collision with root package name */
    public static boolean f92263g = true;

    /* renamed from: a, reason: collision with root package name */
    public final android.view.RenderNode f92264a;

    /* renamed from: b, reason: collision with root package name */
    public int f92265b;

    /* renamed from: c, reason: collision with root package name */
    public int f92266c;

    /* renamed from: d, reason: collision with root package name */
    public int f92267d;

    /* renamed from: e, reason: collision with root package name */
    public int f92268e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f92269f;

    public r3(p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.C1059xa8272988 ownerView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ownerView, "ownerView");
        android.view.RenderNode create = android.view.RenderNode.create("Compose", ownerView);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(create, "create(\"Compose\", ownerView)");
        this.f92264a = create;
        if (f92263g) {
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
                p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.x3 x3Var = p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.x3.f92347a;
                x3Var.c(create, x3Var.a(create));
                x3Var.d(create, x3Var.b(create));
            }
            p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.w3.f92318a.a(create);
            f92263g = false;
        }
    }

    @Override // p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.p2
    public float A() {
        return this.f92264a.getElevation();
    }

    @Override // p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.p2
    public void a(android.graphics.Canvas canvas) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(canvas, "canvas");
        ((android.view.DisplayListCanvas) canvas).drawRenderNode(this.f92264a);
    }

    @Override // p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.p2
    public void b(float f17) {
        this.f92264a.setTranslationY(f17);
    }

    @Override // p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.p2
    public void c(boolean z17) {
        this.f92269f = z17;
        this.f92264a.setClipToBounds(z17);
    }

    @Override // p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.p2
    public void d(float f17) {
        this.f92264a.setElevation(f17);
    }

    @Override // p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.p2
    public void e(int i17) {
        this.f92266c += i17;
        this.f92268e += i17;
        this.f92264a.offsetTopAndBottom(i17);
    }

    @Override // p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.p2
    public boolean f() {
        return this.f92264a.isValid();
    }

    @Override // p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.p2
    public void g(e1.w0 w0Var) {
    }

    @Override // p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.p2
    /* renamed from: getAlpha */
    public float mo7108x742757a8() {
        return this.f92264a.getAlpha();
    }

    @Override // p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.p2
    /* renamed from: getBottom */
    public int mo7109x12a4bd21() {
        return this.f92268e;
    }

    @Override // p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.p2
    /* renamed from: getHeight */
    public int mo7110x1c4fb41d() {
        return this.f92268e - this.f92266c;
    }

    @Override // p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.p2
    /* renamed from: getLeft */
    public int mo7111xfb82087d() {
        return this.f92265b;
    }

    @Override // p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.p2
    /* renamed from: getRight */
    public int mo7112x75156866() {
        return this.f92267d;
    }

    @Override // p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.p2
    /* renamed from: getTop */
    public int mo7113xb588721f() {
        return this.f92266c;
    }

    @Override // p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.p2
    /* renamed from: getWidth */
    public int mo7114x755bd410() {
        return this.f92267d - this.f92265b;
    }

    @Override // p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.p2
    public boolean h() {
        return this.f92264a.getClipToOutline();
    }

    @Override // p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.p2
    public void i(float f17) {
        this.f92264a.setCameraDistance(-f17);
    }

    @Override // p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.p2
    public boolean j(boolean z17) {
        return this.f92264a.setHasOverlappingRendering(z17);
    }

    @Override // p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.p2
    public void k(float f17) {
        this.f92264a.setRotationX(f17);
    }

    @Override // p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.p2
    public void l(android.graphics.Matrix matrix) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(matrix, "matrix");
        this.f92264a.getMatrix(matrix);
    }

    @Override // p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.p2
    public void m(float f17) {
        this.f92264a.setRotationY(f17);
    }

    @Override // p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.p2
    public void n(int i17) {
        this.f92265b += i17;
        this.f92267d += i17;
        this.f92264a.offsetLeftAndRight(i17);
    }

    @Override // p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.p2
    public void o(float f17) {
        this.f92264a.setRotation(f17);
    }

    @Override // p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.p2
    public void p(float f17) {
        this.f92264a.setPivotX(f17);
    }

    @Override // p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.p2
    public void q(float f17) {
        this.f92264a.setPivotY(f17);
    }

    @Override // p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.p2
    public void r(android.graphics.Outline outline) {
        this.f92264a.setOutline(outline);
    }

    @Override // p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.p2
    public void s(boolean z17) {
        this.f92264a.setClipToOutline(z17);
    }

    @Override // p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.p2
    /* renamed from: setAlpha */
    public void mo7115x52b5721c(float f17) {
        this.f92264a.setAlpha(f17);
    }

    @Override // p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.p2
    /* renamed from: setScaleX */
    public void mo7116x222a7750(float f17) {
        this.f92264a.setScaleX(f17);
    }

    @Override // p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.p2
    /* renamed from: setScaleY */
    public void mo7117x222a7751(float f17) {
        this.f92264a.setScaleY(f17);
    }

    @Override // p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.p2
    public boolean t(int i17, int i18, int i19, int i27) {
        this.f92265b = i17;
        this.f92266c = i18;
        this.f92267d = i19;
        this.f92268e = i27;
        return this.f92264a.setLeftTopRightBottom(i17, i18, i19, i27);
    }

    @Override // p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.p2
    public void u() {
        p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.w3.f92318a.a(this.f92264a);
    }

    @Override // p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.p2
    public boolean v() {
        return this.f92269f;
    }

    @Override // p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.p2
    public void w(e1.v canvasHolder, e1.p0 p0Var, yz5.l drawBlock) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(canvasHolder, "canvasHolder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(drawBlock, "drawBlock");
        int i17 = this.f92267d - this.f92265b;
        int i18 = this.f92268e - this.f92266c;
        android.view.RenderNode renderNode = this.f92264a;
        android.graphics.Canvas start = renderNode.start(i17, i18);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(start, "renderNode.start(width, height)");
        e1.b bVar = canvasHolder.f327821a;
        android.graphics.Canvas canvas = bVar.f327758a;
        bVar.f327758a = start;
        if (p0Var != null) {
            bVar.c();
            e1.t.a(bVar, p0Var, 0, 2, null);
        }
        drawBlock.mo146xb9724478(bVar);
        if (p0Var != null) {
            bVar.b();
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(canvas, "<set-?>");
        bVar.f327758a = canvas;
        renderNode.end(start);
    }

    @Override // p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.p2
    public void x(int i17) {
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.x3.f92347a.c(this.f92264a, i17);
        }
    }

    @Override // p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.p2
    public void y(float f17) {
        this.f92264a.setTranslationX(f17);
    }

    @Override // p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.p2
    public void z(int i17) {
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.x3.f92347a.d(this.f92264a, i17);
        }
    }
}

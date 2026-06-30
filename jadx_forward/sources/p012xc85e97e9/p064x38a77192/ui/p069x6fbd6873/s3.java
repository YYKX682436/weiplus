package p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873;

/* loaded from: classes14.dex */
public final class s3 implements p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.p2 {

    /* renamed from: a, reason: collision with root package name */
    public final android.graphics.RenderNode f92276a;

    public s3(p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.C1059xa8272988 ownerView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ownerView, "ownerView");
        this.f92276a = new android.graphics.RenderNode("Compose");
    }

    @Override // p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.p2
    public float A() {
        return this.f92276a.getElevation();
    }

    @Override // p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.p2
    public void a(android.graphics.Canvas canvas) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(canvas, "canvas");
        canvas.drawRenderNode(this.f92276a);
    }

    @Override // p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.p2
    public void b(float f17) {
        this.f92276a.setTranslationY(f17);
    }

    @Override // p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.p2
    public void c(boolean z17) {
        this.f92276a.setClipToBounds(z17);
    }

    @Override // p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.p2
    public void d(float f17) {
        this.f92276a.setElevation(f17);
    }

    @Override // p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.p2
    public void e(int i17) {
        this.f92276a.offsetTopAndBottom(i17);
    }

    @Override // p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.p2
    public boolean f() {
        return this.f92276a.hasDisplayList();
    }

    @Override // p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.p2
    public void g(e1.w0 w0Var) {
        if (android.os.Build.VERSION.SDK_INT >= 31) {
            p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.t3.f92284a.a(this.f92276a, w0Var);
        }
    }

    @Override // p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.p2
    /* renamed from: getAlpha */
    public float mo7108x742757a8() {
        return this.f92276a.getAlpha();
    }

    @Override // p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.p2
    /* renamed from: getBottom */
    public int mo7109x12a4bd21() {
        return this.f92276a.getBottom();
    }

    @Override // p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.p2
    /* renamed from: getHeight */
    public int mo7110x1c4fb41d() {
        return this.f92276a.getHeight();
    }

    @Override // p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.p2
    /* renamed from: getLeft */
    public int mo7111xfb82087d() {
        return this.f92276a.getLeft();
    }

    @Override // p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.p2
    /* renamed from: getRight */
    public int mo7112x75156866() {
        return this.f92276a.getRight();
    }

    @Override // p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.p2
    /* renamed from: getTop */
    public int mo7113xb588721f() {
        return this.f92276a.getTop();
    }

    @Override // p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.p2
    /* renamed from: getWidth */
    public int mo7114x755bd410() {
        return this.f92276a.getWidth();
    }

    @Override // p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.p2
    public boolean h() {
        return this.f92276a.getClipToOutline();
    }

    @Override // p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.p2
    public void i(float f17) {
        this.f92276a.setCameraDistance(f17);
    }

    @Override // p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.p2
    public boolean j(boolean z17) {
        return this.f92276a.setHasOverlappingRendering(z17);
    }

    @Override // p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.p2
    public void k(float f17) {
        this.f92276a.setRotationX(f17);
    }

    @Override // p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.p2
    public void l(android.graphics.Matrix matrix) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(matrix, "matrix");
        this.f92276a.getMatrix(matrix);
    }

    @Override // p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.p2
    public void m(float f17) {
        this.f92276a.setRotationY(f17);
    }

    @Override // p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.p2
    public void n(int i17) {
        this.f92276a.offsetLeftAndRight(i17);
    }

    @Override // p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.p2
    public void o(float f17) {
        this.f92276a.setRotationZ(f17);
    }

    @Override // p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.p2
    public void p(float f17) {
        this.f92276a.setPivotX(f17);
    }

    @Override // p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.p2
    public void q(float f17) {
        this.f92276a.setPivotY(f17);
    }

    @Override // p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.p2
    public void r(android.graphics.Outline outline) {
        this.f92276a.setOutline(outline);
    }

    @Override // p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.p2
    public void s(boolean z17) {
        this.f92276a.setClipToOutline(z17);
    }

    @Override // p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.p2
    /* renamed from: setAlpha */
    public void mo7115x52b5721c(float f17) {
        this.f92276a.setAlpha(f17);
    }

    @Override // p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.p2
    /* renamed from: setScaleX */
    public void mo7116x222a7750(float f17) {
        this.f92276a.setScaleX(f17);
    }

    @Override // p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.p2
    /* renamed from: setScaleY */
    public void mo7117x222a7751(float f17) {
        this.f92276a.setScaleY(f17);
    }

    @Override // p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.p2
    public boolean t(int i17, int i18, int i19, int i27) {
        return this.f92276a.setPosition(i17, i18, i19, i27);
    }

    @Override // p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.p2
    public void u() {
        this.f92276a.discardDisplayList();
    }

    @Override // p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.p2
    public boolean v() {
        return this.f92276a.getClipToBounds();
    }

    @Override // p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.p2
    public void w(e1.v canvasHolder, e1.p0 p0Var, yz5.l drawBlock) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(canvasHolder, "canvasHolder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(drawBlock, "drawBlock");
        android.graphics.RenderNode renderNode = this.f92276a;
        android.graphics.RecordingCanvas beginRecording = renderNode.beginRecording();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(beginRecording, "renderNode.beginRecording()");
        e1.b bVar = canvasHolder.f327821a;
        android.graphics.Canvas canvas = bVar.f327758a;
        bVar.f327758a = beginRecording;
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
        renderNode.endRecording();
    }

    @Override // p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.p2
    public void x(int i17) {
        this.f92276a.setAmbientShadowColor(i17);
    }

    @Override // p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.p2
    public void y(float f17) {
        this.f92276a.setTranslationX(f17);
    }

    @Override // p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.p2
    public void z(int i17) {
        this.f92276a.setSpotShadowColor(i17);
    }
}

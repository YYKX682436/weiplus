package androidx.compose.ui.platform;

/* loaded from: classes14.dex */
public final class s3 implements androidx.compose.ui.platform.p2 {

    /* renamed from: a, reason: collision with root package name */
    public final android.graphics.RenderNode f10743a;

    public s3(androidx.compose.ui.platform.AndroidComposeView ownerView) {
        kotlin.jvm.internal.o.g(ownerView, "ownerView");
        this.f10743a = new android.graphics.RenderNode("Compose");
    }

    @Override // androidx.compose.ui.platform.p2
    public float A() {
        return this.f10743a.getElevation();
    }

    @Override // androidx.compose.ui.platform.p2
    public void a(android.graphics.Canvas canvas) {
        kotlin.jvm.internal.o.g(canvas, "canvas");
        canvas.drawRenderNode(this.f10743a);
    }

    @Override // androidx.compose.ui.platform.p2
    public void b(float f17) {
        this.f10743a.setTranslationY(f17);
    }

    @Override // androidx.compose.ui.platform.p2
    public void c(boolean z17) {
        this.f10743a.setClipToBounds(z17);
    }

    @Override // androidx.compose.ui.platform.p2
    public void d(float f17) {
        this.f10743a.setElevation(f17);
    }

    @Override // androidx.compose.ui.platform.p2
    public void e(int i17) {
        this.f10743a.offsetTopAndBottom(i17);
    }

    @Override // androidx.compose.ui.platform.p2
    public boolean f() {
        return this.f10743a.hasDisplayList();
    }

    @Override // androidx.compose.ui.platform.p2
    public void g(e1.w0 w0Var) {
        if (android.os.Build.VERSION.SDK_INT >= 31) {
            androidx.compose.ui.platform.t3.f10751a.a(this.f10743a, w0Var);
        }
    }

    @Override // androidx.compose.ui.platform.p2
    public float getAlpha() {
        return this.f10743a.getAlpha();
    }

    @Override // androidx.compose.ui.platform.p2
    public int getBottom() {
        return this.f10743a.getBottom();
    }

    @Override // androidx.compose.ui.platform.p2
    public int getHeight() {
        return this.f10743a.getHeight();
    }

    @Override // androidx.compose.ui.platform.p2
    public int getLeft() {
        return this.f10743a.getLeft();
    }

    @Override // androidx.compose.ui.platform.p2
    public int getRight() {
        return this.f10743a.getRight();
    }

    @Override // androidx.compose.ui.platform.p2
    public int getTop() {
        return this.f10743a.getTop();
    }

    @Override // androidx.compose.ui.platform.p2
    public int getWidth() {
        return this.f10743a.getWidth();
    }

    @Override // androidx.compose.ui.platform.p2
    public boolean h() {
        return this.f10743a.getClipToOutline();
    }

    @Override // androidx.compose.ui.platform.p2
    public void i(float f17) {
        this.f10743a.setCameraDistance(f17);
    }

    @Override // androidx.compose.ui.platform.p2
    public boolean j(boolean z17) {
        return this.f10743a.setHasOverlappingRendering(z17);
    }

    @Override // androidx.compose.ui.platform.p2
    public void k(float f17) {
        this.f10743a.setRotationX(f17);
    }

    @Override // androidx.compose.ui.platform.p2
    public void l(android.graphics.Matrix matrix) {
        kotlin.jvm.internal.o.g(matrix, "matrix");
        this.f10743a.getMatrix(matrix);
    }

    @Override // androidx.compose.ui.platform.p2
    public void m(float f17) {
        this.f10743a.setRotationY(f17);
    }

    @Override // androidx.compose.ui.platform.p2
    public void n(int i17) {
        this.f10743a.offsetLeftAndRight(i17);
    }

    @Override // androidx.compose.ui.platform.p2
    public void o(float f17) {
        this.f10743a.setRotationZ(f17);
    }

    @Override // androidx.compose.ui.platform.p2
    public void p(float f17) {
        this.f10743a.setPivotX(f17);
    }

    @Override // androidx.compose.ui.platform.p2
    public void q(float f17) {
        this.f10743a.setPivotY(f17);
    }

    @Override // androidx.compose.ui.platform.p2
    public void r(android.graphics.Outline outline) {
        this.f10743a.setOutline(outline);
    }

    @Override // androidx.compose.ui.platform.p2
    public void s(boolean z17) {
        this.f10743a.setClipToOutline(z17);
    }

    @Override // androidx.compose.ui.platform.p2
    public void setAlpha(float f17) {
        this.f10743a.setAlpha(f17);
    }

    @Override // androidx.compose.ui.platform.p2
    public void setScaleX(float f17) {
        this.f10743a.setScaleX(f17);
    }

    @Override // androidx.compose.ui.platform.p2
    public void setScaleY(float f17) {
        this.f10743a.setScaleY(f17);
    }

    @Override // androidx.compose.ui.platform.p2
    public boolean t(int i17, int i18, int i19, int i27) {
        return this.f10743a.setPosition(i17, i18, i19, i27);
    }

    @Override // androidx.compose.ui.platform.p2
    public void u() {
        this.f10743a.discardDisplayList();
    }

    @Override // androidx.compose.ui.platform.p2
    public boolean v() {
        return this.f10743a.getClipToBounds();
    }

    @Override // androidx.compose.ui.platform.p2
    public void w(e1.v canvasHolder, e1.p0 p0Var, yz5.l drawBlock) {
        kotlin.jvm.internal.o.g(canvasHolder, "canvasHolder");
        kotlin.jvm.internal.o.g(drawBlock, "drawBlock");
        android.graphics.RenderNode renderNode = this.f10743a;
        android.graphics.RecordingCanvas beginRecording = renderNode.beginRecording();
        kotlin.jvm.internal.o.f(beginRecording, "renderNode.beginRecording()");
        e1.b bVar = canvasHolder.f246288a;
        android.graphics.Canvas canvas = bVar.f246225a;
        bVar.f246225a = beginRecording;
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
        renderNode.endRecording();
    }

    @Override // androidx.compose.ui.platform.p2
    public void x(int i17) {
        this.f10743a.setAmbientShadowColor(i17);
    }

    @Override // androidx.compose.ui.platform.p2
    public void y(float f17) {
        this.f10743a.setTranslationX(f17);
    }

    @Override // androidx.compose.ui.platform.p2
    public void z(int i17) {
        this.f10743a.setSpotShadowColor(i17);
    }
}

package com.p314xaae8f345.mm.ui.p2647x2e3067.p2648x3306ec;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u00022\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u0003J\b\u0010\u0006\u001a\u00020\u0005H\u0016R\"\u0010\u000e\u001a\u00020\u00078\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR0\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R*\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00188\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\"\u0010#\u001a\u00020\u00078\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b \u0010\t\u001a\u0004\b!\u0010\u000b\"\u0004\b\"\u0010\rR:\u0010+\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010$2\u000e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010$8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*¨\u0006,"}, d2 = {"Lcom/tencent/mm/ui/blur/mask/AbstractBlurMaskView;", "CACHE", "Landroid/widget/FrameLayout;", "Ljb5/d;", "Landroid/graphics/Canvas;", "Ljb5/h;", "getViewPosition", "", "d", "I", "getBlurRadius", "()I", "setBlurRadius", "(I)V", "blurRadius", "Ljb5/f;", "Landroid/graphics/RenderNode;", "e", "Ljb5/f;", "getBlurRenderer", "()Ljb5/f;", "setBlurRenderer", "(Ljb5/f;)V", "blurRenderer", "", "value", "f", "Z", "isBlurEnabled", "()Z", "setBlurEnabled", "(Z)V", "g", "getOverlayColor", "setOverlayColor", "overlayColor", "Ljb5/e;", "h", "Ljb5/e;", "getBlurBackground", "()Ljb5/e;", "setBlurBackground", "(Ljb5/e;)V", "blurBackground", "libmmui_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.ui.blur.mask.AbstractBlurMaskView */
/* loaded from: classes14.dex */
public abstract class AbstractC21594xdda0f29a<CACHE> extends android.widget.FrameLayout implements jb5.d {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public int blurRadius;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public jb5.f blurRenderer;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public boolean isBlurEnabled;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public int overlayColor;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public jb5.e blurBackground;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AbstractC21594xdda0f29a(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    public abstract void b();

    public abstract void c(android.graphics.Canvas canvas, yz5.l lVar);

    @Override // android.view.View
    public void draw(android.graphics.Canvas canvas) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(canvas, "canvas");
        if (this.isBlurEnabled && this.blurRenderer != null && getBlurBackground() != null) {
            jb5.e blurBackground = getBlurBackground();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(blurBackground);
            if (((com.p314xaae8f345.mm.ui.p2647x2e3067.p2648x3306ec.AbstractC21593x3de6c6a8) blurBackground).isCacheEnabled) {
                c(canvas, new jb5.c(this));
                return;
            }
        }
        super.draw(canvas);
    }

    public jb5.e getBlurBackground() {
        return this.blurBackground;
    }

    @Override // jb5.d
    public int getBlurRadius() {
        return this.blurRadius;
    }

    public final jb5.f getBlurRenderer() {
        return this.blurRenderer;
    }

    @Override // jb5.d
    public int getOverlayColor() {
        return this.overlayColor;
    }

    @Override // jb5.d
    /* renamed from: getViewPosition */
    public jb5.h mo79377x7bd85564() {
        int[] iArr = new int[2];
        getLocationOnScreen(iArr);
        return new jb5.h(iArr[0], iArr[1], getWidth(), getHeight());
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m79379x8798bb18(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m79379x8798bb18(false);
    }

    /* renamed from: setBlurBackground */
    public void m79378xc62e81f7(jb5.e eVar) {
        this.blurBackground = eVar;
        invalidate();
    }

    /* renamed from: setBlurEnabled */
    public void m79379x8798bb18(boolean z17) {
        this.isBlurEnabled = z17;
        if (z17) {
            b();
            return;
        }
        jb5.f fVar = this.blurRenderer;
        if (fVar != null) {
            jb5.g gVar = (jb5.g) fVar;
            android.graphics.RenderNode renderNode = gVar.f380397a;
            if (renderNode != null) {
                renderNode.discardDisplayList();
            }
            gVar.f380397a = null;
        }
        this.blurRenderer = null;
    }

    /* renamed from: setBlurRadius */
    public void m79380xc74465db(int i17) {
        this.blurRadius = i17;
    }

    /* renamed from: setBlurRenderer */
    public final void m79381xec1e0bcc(jb5.f fVar) {
        this.blurRenderer = fVar;
    }

    /* renamed from: setOverlayColor */
    public void m79382xa6b9ba75(int i17) {
        this.overlayColor = i17;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AbstractC21594xdda0f29a(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        this(context, attributeSet, i17, 0, 8, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    public /* synthetic */ AbstractC21594xdda0f29a(android.content.Context context, android.util.AttributeSet attributeSet, int i17, int i18, int i19, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(context, (i19 & 2) != 0 ? null : attributeSet, (i19 & 4) != 0 ? 0 : i17, (i19 & 8) != 0 ? 0 : i18);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC21594xdda0f29a(android.content.Context context, android.util.AttributeSet attributeSet, int i17, int i18) {
        super(context, attributeSet, i17, i18);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.blurRadius = 50;
        this.isBlurEnabled = true;
        setWillNotDraw(false);
        setClipToOutline(true);
        setOutlineProvider(new jb5.b(this));
    }
}

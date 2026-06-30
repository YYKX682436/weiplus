package com.p314xaae8f345.mm.ui.p2647x2e3067.p2648x3306ec;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/tencent/mm/ui/blur/mask/BlurMaskView;", "Lcom/tencent/mm/ui/blur/mask/AbstractBlurMaskView;", "Landroid/graphics/RenderNode;", "libmmui_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.ui.blur.mask.BlurMaskView */
/* loaded from: classes14.dex */
public final class C21596x8c92f158 extends com.p314xaae8f345.mm.ui.p2647x2e3067.p2648x3306ec.AbstractC21594xdda0f29a<android.graphics.RenderNode> {
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C21596x8c92f158(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    @Override // com.p314xaae8f345.mm.ui.p2647x2e3067.p2648x3306ec.AbstractC21594xdda0f29a
    public void b() {
        if (getBlurRenderer() != null || android.os.Build.VERSION.SDK_INT < 31) {
            return;
        }
        m79381xec1e0bcc(new jb5.g());
    }

    @Override // com.p314xaae8f345.mm.ui.p2647x2e3067.p2648x3306ec.AbstractC21594xdda0f29a
    public void c(android.graphics.Canvas canvas, yz5.l drawOrigin) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(canvas, "canvas");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(drawOrigin, "drawOrigin");
        jb5.f blurRenderer = getBlurRenderer();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(blurRenderer);
        jb5.e blurBackground = getBlurBackground();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(blurBackground);
        jb5.g gVar = (jb5.g) blurRenderer;
        if (gVar.f380397a == null) {
            gVar.f380397a = new android.graphics.RenderNode("Blur");
        }
        android.graphics.RenderNode renderNode = gVar.f380397a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(renderNode);
        java.lang.Object mo79369x77405256 = blurBackground.mo79369x77405256();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mo79369x77405256);
        jb5.h mo79377x7bd85564 = mo79377x7bd85564();
        jb5.h mo79370x7bd85564 = blurBackground.mo79370x7bd85564();
        renderNode.setPosition(0, 0, mo79370x7bd85564.f380400c, mo79370x7bd85564.f380401d);
        int i17 = mo79377x7bd85564.f380398a - mo79370x7bd85564.f380398a;
        int i18 = mo79377x7bd85564.f380399b - mo79370x7bd85564.f380399b;
        float f17 = -i17;
        float f18 = -i18;
        renderNode.setPivotX((mo79377x7bd85564.f380400c / 2.0f) - f17);
        renderNode.setPivotY((mo79377x7bd85564.f380401d / 2.0f) - f18);
        renderNode.setTranslationX(f17);
        renderNode.setTranslationY(f18);
        android.graphics.RecordingCanvas beginRecording = renderNode.beginRecording();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(beginRecording, "beginRecording(...)");
        beginRecording.drawRenderNode((android.graphics.RenderNode) mo79369x77405256);
        float blurRadius = getBlurRadius();
        android.graphics.RenderEffect createBlurEffect = android.graphics.RenderEffect.createBlurEffect(blurRadius, blurRadius, android.graphics.Shader.TileMode.CLAMP);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(createBlurEffect, "createBlurEffect(...)");
        renderNode.setRenderEffect(createBlurEffect);
        renderNode.endRecording();
        int overlayColor = getOverlayColor();
        canvas.drawRenderNode(renderNode);
        if (overlayColor != 0) {
            canvas.drawColor(overlayColor);
        }
        drawOrigin.mo146xb9724478(canvas);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C21596x8c92f158(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        this(context, attributeSet, i17, 0, 8, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C21596x8c92f158(android.content.Context r2, android.util.AttributeSet r3, int r4, int r5, int r6, p3321xbce91901.jvm.p3324x21ffc6bd.i r7) {
        /*
            r1 = this;
            r7 = r6 & 2
            if (r7 == 0) goto L5
            r3 = 0
        L5:
            r7 = r6 & 4
            r0 = 0
            if (r7 == 0) goto Lb
            r4 = r0
        Lb:
            r6 = r6 & 8
            if (r6 == 0) goto L10
            r5 = r0
        L10:
            java.lang.String r6 = "context"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r2, r6)
            r1.<init>(r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.ui.p2647x2e3067.p2648x3306ec.C21596x8c92f158.<init>(android.content.Context, android.util.AttributeSet, int, int, int, kotlin.jvm.internal.i):void");
    }
}

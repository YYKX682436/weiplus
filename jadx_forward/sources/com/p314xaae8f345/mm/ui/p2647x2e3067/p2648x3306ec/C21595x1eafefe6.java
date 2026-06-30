package com.p314xaae8f345.mm.ui.p2647x2e3067.p2648x3306ec;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/tencent/mm/ui/blur/mask/BlurMaskBackgroundView;", "Lcom/tencent/mm/ui/blur/mask/AbstractBlurMaskBackgroundView;", "Landroid/graphics/RenderNode;", "libmmui_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.ui.blur.mask.BlurMaskBackgroundView */
/* loaded from: classes14.dex */
public final class C21595x1eafefe6 extends com.p314xaae8f345.mm.ui.p2647x2e3067.p2648x3306ec.AbstractC21593x3de6c6a8<android.graphics.RenderNode> {
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C21595x1eafefe6(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    @Override // com.p314xaae8f345.mm.ui.p2647x2e3067.p2648x3306ec.AbstractC21593x3de6c6a8
    public void b() {
        if (mo79369x77405256() != null || android.os.Build.VERSION.SDK_INT < 29) {
            return;
        }
        m79372xda5c5ca(new android.graphics.RenderNode("BlurMaskBackground"));
    }

    @Override // com.p314xaae8f345.mm.ui.p2647x2e3067.p2648x3306ec.AbstractC21593x3de6c6a8
    public void c() {
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            android.graphics.RenderNode mo79369x77405256 = mo79369x77405256();
            if (mo79369x77405256 != null) {
                mo79369x77405256.discardDisplayList();
            }
            m79372xda5c5ca(null);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2647x2e3067.p2648x3306ec.AbstractC21593x3de6c6a8
    public void d(android.graphics.Canvas canvas, yz5.l drawOrigin) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(canvas, "canvas");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(drawOrigin, "drawOrigin");
        if (!this.isCacheEnabled || !canvas.isHardwareAccelerated() || android.os.Build.VERSION.SDK_INT < 31) {
            drawOrigin.mo146xb9724478(canvas);
            return;
        }
        if (mo79369x77405256() == null) {
            m79372xda5c5ca(new android.graphics.RenderNode("BlurMaskBackground"));
        }
        android.graphics.RenderNode mo79369x77405256 = mo79369x77405256();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mo79369x77405256);
        android.graphics.RenderNode renderNode = mo79369x77405256;
        jb5.h mo79370x7bd85564 = mo79370x7bd85564();
        renderNode.setPosition(0, 0, mo79370x7bd85564.f380400c, mo79370x7bd85564.f380401d);
        android.graphics.RecordingCanvas beginRecording = renderNode.beginRecording();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(beginRecording, "beginRecording(...)");
        drawOrigin.mo146xb9724478(beginRecording);
        renderNode.endRecording();
        canvas.drawRenderNode(renderNode);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C21595x1eafefe6(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        this(context, attributeSet, i17, 0, 8, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C21595x1eafefe6(android.content.Context r2, android.util.AttributeSet r3, int r4, int r5, int r6, p3321xbce91901.jvm.p3324x21ffc6bd.i r7) {
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
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.ui.p2647x2e3067.p2648x3306ec.C21595x1eafefe6.<init>(android.content.Context, android.util.AttributeSet, int, int, int, kotlin.jvm.internal.i):void");
    }
}

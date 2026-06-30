package rp4;

/* loaded from: classes10.dex */
public final class t extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2338x6b0147b.C18821x16ce7839 f480220d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2338x6b0147b.C18821x16ce7839 c18821x16ce7839, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f480220d = c18821x16ce7839;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new rp4.t(this.f480220d, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        rp4.t tVar = (rp4.t) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        tVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        android.graphics.Rect rect;
        int i17;
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        android.graphics.Rect rect2 = lt3.n.f402796d;
        com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2338x6b0147b.C18821x16ce7839 c18821x16ce7839 = this.f480220d;
        rect2.set(c18821x16ce7839.getMediaModel().f480235g);
        rp4.g m72685x2ae1b181 = c18821x16ce7839.m72685x2ae1b181();
        ct0.b captureInfo = c18821x16ce7839.getCaptureInfo();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(captureInfo);
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 configProvider = c18821x16ce7839.getConfigProvider();
        m72685x2ae1b181.getClass();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("start preview ");
        sb6.append(captureInfo);
        sb6.append(' ');
        com.p314xaae8f345.mm.p2773x4c94ea4f.p2775x348b34.TextureViewSurfaceTextureListenerC22778x581fb68 textureViewSurfaceTextureListenerC22778x581fb68 = m72685x2ae1b181.f480182d;
        sb6.append(textureViewSurfaceTextureListenerC22778x581fb68 != null ? java.lang.Integer.valueOf(textureViewSurfaceTextureListenerC22778x581fb68.hashCode()) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EditVideoPreviewPlugin", sb6.toString());
        m72685x2ae1b181.f480187i = captureInfo;
        m72685x2ae1b181.f480188m = configProvider != null ? configProvider.f237218w : 10000;
        if (m72685x2ae1b181.f480182d == null) {
            m72685x2ae1b181.f480182d = new com.p314xaae8f345.mm.p2773x4c94ea4f.p2775x348b34.TextureViewSurfaceTextureListenerC22778x581fb68(m72685x2ae1b181.f480185g);
        }
        m72685x2ae1b181.f480193r = true;
        com.p314xaae8f345.mm.p2773x4c94ea4f.p2775x348b34.TextureViewSurfaceTextureListenerC22778x581fb68 textureViewSurfaceTextureListenerC22778x581fb682 = m72685x2ae1b181.f480182d;
        fp.e eVar = new fp.e(textureViewSurfaceTextureListenerC22778x581fb682 != null ? textureViewSurfaceTextureListenerC22778x581fb682.getContext() : null);
        m72685x2ae1b181.f480186h = eVar;
        eVar.b();
        com.p314xaae8f345.mm.p2773x4c94ea4f.p2775x348b34.TextureViewSurfaceTextureListenerC22778x581fb68 textureViewSurfaceTextureListenerC22778x581fb683 = m72685x2ae1b181.f480182d;
        if (textureViewSurfaceTextureListenerC22778x581fb683 != null) {
            textureViewSurfaceTextureListenerC22778x581fb683.setVisibility(0);
        }
        com.p314xaae8f345.mm.p2773x4c94ea4f.p2775x348b34.TextureViewSurfaceTextureListenerC22778x581fb68 textureViewSurfaceTextureListenerC22778x581fb684 = m72685x2ae1b181.f480182d;
        if (textureViewSurfaceTextureListenerC22778x581fb684 != null) {
            textureViewSurfaceTextureListenerC22778x581fb684.m82516xd24ee348(m72685x2ae1b181.f480194s);
        }
        m72685x2ae1b181.f480190o = captureInfo.f303740d;
        m72685x2ae1b181.f480191p = captureInfo.f303741e;
        android.widget.TextView textView = m72685x2ae1b181.f480184f;
        if (textView != null) {
            textView.setVisibility(8);
        }
        if (textView != null && z65.c.a()) {
            di3.u.f314296a.m77784x795fa299(new rp4.e(m72685x2ae1b181, textView));
        }
        rp4.x xVar = m72685x2ae1b181.f480192q;
        com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.h1 h1Var = xVar != null ? xVar.f480238j : null;
        com.p314xaae8f345.mm.p2773x4c94ea4f.p2775x348b34.TextureViewSurfaceTextureListenerC22778x581fb68 textureViewSurfaceTextureListenerC22778x581fb685 = m72685x2ae1b181.f480182d;
        if (textureViewSurfaceTextureListenerC22778x581fb685 != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(h1Var);
            textureViewSurfaceTextureListenerC22778x581fb685.o(h1Var.e());
        }
        android.os.Bundle bundle = new android.os.Bundle();
        int i18 = m72685x2ae1b181.f480191p - m72685x2ae1b181.f480190o;
        if (i18 > m72685x2ae1b181.f480188m + 750) {
            bundle.putBoolean("PARAM_VIDEO_NEED_CROP", true);
        }
        ju3.c0 c0Var = ju3.c0.C1;
        ju3.d0 d0Var = m72685x2ae1b181.f480183e;
        d0Var.w(c0Var, bundle);
        int i19 = m72685x2ae1b181.f480188m;
        if (i18 > i19 + 750) {
            m72685x2ae1b181.f480191p = i19 + 250;
            ju3.d0.k(d0Var, ju3.c0.f383445x0, null, 2, null);
        } else {
            if (((qs2.q) ((w40.e) i95.n0.c(w40.e.class))).Ai(i18)) {
                ju3.d0.k(d0Var, ju3.c0.T2, null, 2, null);
            }
            ju3.d0.k(d0Var, ju3.c0.U2, null, 2, null);
        }
        rp4.x xVar2 = m72685x2ae1b181.f480192q;
        android.graphics.Rect rect3 = xVar2 != null ? xVar2.f480235g : null;
        android.view.ViewGroup a17 = m72685x2ae1b181.a();
        if (rect3 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EditVideoPreviewPlugin", "setupPreviewMatrixData: failed, videoRect");
        } else if (a17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EditVideoPreviewPlugin", "setupPreviewMatrixData: failed, layoutView");
        } else {
            rect3.toString();
            sp4.b bVar = (sp4.b) ((jz5.n) m72685x2ae1b181.f480195t).mo141623x754a37bb();
            bVar.f492853a = a17.getMeasuredWidth();
            bVar.f492854b = a17.getMeasuredHeight();
            double width = (rect3.width() * 1.0d) / rect3.height();
            bVar.f492856d = width;
            if (width >= 1.0d) {
                float f17 = bVar.f492855c;
                if (f17 <= 0.0f) {
                    f17 = bVar.f492854b * 0.75f;
                }
                rect = new android.graphics.Rect();
                float f18 = bVar.f492854b - f17;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PreviewTransformCalculateHandler", "createLandscapeTargetRect centerYOffset:0 maxBottomViewHeight:" + f17 + ", videoAreaHeight:" + f18 + " videoRatio:" + ((rect3.width() * 1.0f) / rect3.height()));
                int height = (int) ((f18 - ((float) rect3.height())) / 2.0f);
                rect.top = height;
                rect.left = rect3.left;
                rect.right = rect3.right;
                rect.bottom = height + rect3.height();
            } else {
                float f19 = bVar.f492855c;
                if (f19 <= 0.0f) {
                    f19 = bVar.f492854b * 0.75f;
                }
                android.graphics.Rect rect4 = new android.graphics.Rect();
                float f27 = bVar.f492854b - f19;
                float width2 = (rect3.width() * 1.0f) / rect3.height();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PreviewTransformCalculateHandler", "createPortraitTargetRect maxBottomViewHeight:" + f19 + ", videoAreaHeight:" + f27 + ", videoRatio:" + width2);
                float f28 = width2 * f27;
                rect4.top = 0;
                int b17 = a06.d.b(((((float) bVar.f492853a) - f28) * 1.0f) / ((float) 2));
                rect4.left = b17;
                rect4.right = a06.d.b(((float) b17) + f28);
                rect4.bottom = a06.d.b(((float) rect4.top) + f27);
                rect = rect4;
            }
            float width3 = (rect3.width() / 2.0f) + rect3.left;
            p3321xbce91901.jvm.p3324x21ffc6bd.e0 e0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.e0();
            float height2 = rect3.height() / 2.0f;
            e0Var.f391648d = height2;
            if (bVar.f492856d < 1.0d && (i17 = rect3.top) > 0) {
                e0Var.f391648d = height2 + i17;
            }
            float width4 = (rect.width() * 1.0f) / rect3.width();
            float height3 = (rect.height() * 1.0f) / rect3.height();
            float f29 = (rect3.top + rect3.bottom) / 2.0f;
            rect.toString();
            a17.clearAnimation();
            bVar.f492857e = new sp4.a(bVar, a17, width3, e0Var, width4, height3, rect.centerX() - rect3.centerX(), (((rect.top + rect.bottom) / 2.0f) - f29) - ((f29 - f29) * height3), a17.getTranslationX(), a17.getTranslationY());
        }
        c18821x16ce7839.A();
        return jz5.f0.f384359a;
    }
}

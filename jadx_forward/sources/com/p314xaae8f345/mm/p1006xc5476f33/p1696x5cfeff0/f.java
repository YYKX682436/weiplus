package com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0;

/* loaded from: classes14.dex */
public class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.d0 f218750d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.TextureViewSurfaceTextureListenerC15528xde21bc5f f218751e;

    public f(com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.TextureViewSurfaceTextureListenerC15528xde21bc5f textureViewSurfaceTextureListenerC15528xde21bc5f, com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.d0 d0Var) {
        this.f218751e = textureViewSurfaceTextureListenerC15528xde21bc5f;
        this.f218750d = d0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17;
        int b17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.TextureViewSurfaceTextureListenerC15528xde21bc5f textureViewSurfaceTextureListenerC15528xde21bc5f = this.f218751e;
        textureViewSurfaceTextureListenerC15528xde21bc5f.f218552d.setVisibility(0);
        int min = java.lang.Math.min(com.p314xaae8f345.mm.ui.bl.b(textureViewSurfaceTextureListenerC15528xde21bc5f.getContext()).x, com.p314xaae8f345.mm.ui.bl.b(textureViewSurfaceTextureListenerC15528xde21bc5f.getContext()).y);
        int i18 = com.p314xaae8f345.mm.ui.bl.b(textureViewSurfaceTextureListenerC15528xde21bc5f.getContext()).x;
        int i19 = com.p314xaae8f345.mm.ui.bl.b(textureViewSurfaceTextureListenerC15528xde21bc5f.getContext()).y;
        com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.d0 d0Var = this.f218750d;
        if (i18 > i19) {
            b17 = (int) (min * com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.p1700x373aa5.C15539x128d01d6.f218789q * 2.0f);
            i17 = (int) (b17 * d0Var.b());
        } else {
            i17 = (int) (min * com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.p1700x373aa5.C15539x128d01d6.f218789q * 2.0f);
            b17 = (int) (i17 * d0Var.b());
        }
        android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) textureViewSurfaceTextureListenerC15528xde21bc5f.f218555g.getLayoutParams();
        layoutParams.width = i17;
        layoutParams.height = b17;
        int i27 = (b17 - i17) / 2;
        if (i27 < 0) {
            i27 = 0;
        }
        int m63485x618bdc5 = (int) textureViewSurfaceTextureListenerC15528xde21bc5f.f218552d.m63485x618bdc5();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceFlashManager", "faceReflectMask.getCircleMarginY() >> %d", java.lang.Integer.valueOf(m63485x618bdc5));
        if (m63485x618bdc5 > 0) {
            layoutParams.topMargin = m63485x618bdc5 - i27;
        } else {
            layoutParams.topMargin = i65.a.h(textureViewSurfaceTextureListenerC15528xde21bc5f.getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561929wr) - i27;
        }
        textureViewSurfaceTextureListenerC15528xde21bc5f.f218555g.setLayoutParams(layoutParams);
        textureViewSurfaceTextureListenerC15528xde21bc5f.f218556h.setVisibility(8);
        android.widget.RelativeLayout.LayoutParams layoutParams2 = (android.widget.RelativeLayout.LayoutParams) textureViewSurfaceTextureListenerC15528xde21bc5f.f218559n.getLayoutParams();
        layoutParams2.topMargin = (i65.a.h(textureViewSurfaceTextureListenerC15528xde21bc5f.getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561929wr) + (java.lang.Math.min(i17, b17) / 2)) - (textureViewSurfaceTextureListenerC15528xde21bc5f.f218559n.getHeight() / 2);
        textureViewSurfaceTextureListenerC15528xde21bc5f.f218559n.setLayoutParams(layoutParams2);
        if (textureViewSurfaceTextureListenerC15528xde21bc5f.f218568w != com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27901xdeb6b867.YtSDKKitFrameworkWorkMode.YT_FW_LIPREAD_TYPE) {
            android.widget.RelativeLayout.LayoutParams layoutParams3 = (android.widget.RelativeLayout.LayoutParams) textureViewSurfaceTextureListenerC15528xde21bc5f.f218561p.getLayoutParams();
            float f17 = (int) (min * com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.p1700x373aa5.C15539x128d01d6.f218789q * 2.0f);
            int i28 = (int) (0.85f * f17);
            layoutParams3.width = i28;
            layoutParams3.height = i28;
            if (m63485x618bdc5 > 0) {
                layoutParams3.topMargin = m63485x618bdc5 + (((int) (f17 * 0.14999998f)) / 2);
            } else {
                layoutParams3.topMargin = i65.a.h(textureViewSurfaceTextureListenerC15528xde21bc5f.getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561929wr) + (((int) (f17 * 0.14999998f)) / 2);
            }
            textureViewSurfaceTextureListenerC15528xde21bc5f.f218561p.setLayoutParams(layoutParams3);
            textureViewSurfaceTextureListenerC15528xde21bc5f.f218561p.setVisibility(0);
        }
    }
}

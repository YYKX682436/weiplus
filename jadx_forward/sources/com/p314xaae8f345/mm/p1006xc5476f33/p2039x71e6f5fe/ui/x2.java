package com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui;

/* loaded from: classes12.dex */
public class x2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.TextureViewSurfaceTextureListenerC17306x32f4bae6 f241348d;

    public x2(com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.TextureViewSurfaceTextureListenerC17306x32f4bae6 textureViewSurfaceTextureListenerC17306x32f4bae6) {
        this.f241348d = textureViewSurfaceTextureListenerC17306x32f4bae6;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/scanner/ui/ScanTranslationCaptureUI$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.TextureViewSurfaceTextureListenerC17306x32f4bae6 textureViewSurfaceTextureListenerC17306x32f4bae6 = this.f241348d;
        int i17 = textureViewSurfaceTextureListenerC17306x32f4bae6.H;
        if (i17 == 2) {
            try {
                textureViewSurfaceTextureListenerC17306x32f4bae6.N.f141286l = 1L;
                ((yb0.g) ((zb0.b0) i95.n0.c(zb0.b0.class))).wi(textureViewSurfaceTextureListenerC17306x32f4bae6, textureViewSurfaceTextureListenerC17306x32f4bae6.f240899w, new com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.v2(this));
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ScanTranslationCaptureUI", e17, "copy to gallery error", new java.lang.Object[0]);
            }
        } else if (i17 == 3) {
            try {
                textureViewSurfaceTextureListenerC17306x32f4bae6.N.f141285k = 1L;
                if (textureViewSurfaceTextureListenerC17306x32f4bae6.L == 0) {
                    try {
                        textureViewSurfaceTextureListenerC17306x32f4bae6.f240900x = ((com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.q0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.q0.class)).Zi("jpg");
                        com.p314xaae8f345.mm.sdk.p2603x2137b148.x.D0(textureViewSurfaceTextureListenerC17306x32f4bae6.f240898v, 80, android.graphics.Bitmap.CompressFormat.JPEG, textureViewSurfaceTextureListenerC17306x32f4bae6.f240900x, false);
                    } catch (java.io.IOException e18) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ScanTranslationCaptureUI", e18, "save translate result file error", new java.lang.Object[0]);
                    }
                }
                ((yb0.g) ((zb0.b0) i95.n0.c(zb0.b0.class))).wi(textureViewSurfaceTextureListenerC17306x32f4bae6, textureViewSurfaceTextureListenerC17306x32f4bae6.f240900x, new com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.w2(this));
            } catch (java.lang.Exception e19) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ScanTranslationCaptureUI", e19, "save to gallery error", new java.lang.Object[0]);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/scanner/ui/ScanTranslationCaptureUI$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

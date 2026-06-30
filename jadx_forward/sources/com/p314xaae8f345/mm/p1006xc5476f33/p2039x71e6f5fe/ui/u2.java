package com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui;

/* loaded from: classes12.dex */
public class u2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.TextureViewSurfaceTextureListenerC17306x32f4bae6 f241187d;

    public u2(com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.TextureViewSurfaceTextureListenerC17306x32f4bae6 textureViewSurfaceTextureListenerC17306x32f4bae6) {
        this.f241187d = textureViewSurfaceTextureListenerC17306x32f4bae6;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/scanner/ui/ScanTranslationCaptureUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.TextureViewSurfaceTextureListenerC17306x32f4bae6 textureViewSurfaceTextureListenerC17306x32f4bae6 = this.f241187d;
        int i17 = textureViewSurfaceTextureListenerC17306x32f4bae6.H;
        if (i17 == 3) {
            android.graphics.Bitmap bitmap = textureViewSurfaceTextureListenerC17306x32f4bae6.f240897u;
            if (bitmap != null) {
                textureViewSurfaceTextureListenerC17306x32f4bae6.c7(bitmap);
            }
            if (textureViewSurfaceTextureListenerC17306x32f4bae6.I.equalsIgnoreCase("zh_CN")) {
                textureViewSurfaceTextureListenerC17306x32f4bae6.f240891o.setImageResource(com.p314xaae8f345.mm.R.raw.f81249x22cfb2d);
            } else {
                textureViewSurfaceTextureListenerC17306x32f4bae6.f240891o.setImageResource(com.p314xaae8f345.mm.R.raw.f81252x76c5030);
            }
            textureViewSurfaceTextureListenerC17306x32f4bae6.H = 2;
            textureViewSurfaceTextureListenerC17306x32f4bae6.N.f141284j++;
        } else if (i17 == 2) {
            android.graphics.Bitmap bitmap2 = textureViewSurfaceTextureListenerC17306x32f4bae6.f240898v;
            if (bitmap2 != null) {
                textureViewSurfaceTextureListenerC17306x32f4bae6.c7(bitmap2);
            }
            if (textureViewSurfaceTextureListenerC17306x32f4bae6.I.equalsIgnoreCase("zh_CN")) {
                textureViewSurfaceTextureListenerC17306x32f4bae6.f240891o.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f563720b81);
            } else {
                textureViewSurfaceTextureListenerC17306x32f4bae6.f240891o.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f563722b83);
            }
            textureViewSurfaceTextureListenerC17306x32f4bae6.H = 3;
        }
        yj0.a.h(this, "com/tencent/mm/plugin/scanner/ui/ScanTranslationCaptureUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

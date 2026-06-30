package com.tencent.mm.plugin.fav.ui;

/* loaded from: classes12.dex */
public class i1 implements com.tencent.mm.ui.tools.o5 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.m1 f101156a;

    public i1(com.tencent.mm.plugin.fav.ui.m1 m1Var) {
        this.f101156a = m1Var;
    }

    @Override // com.tencent.mm.ui.tools.o5
    public void a(float f17, float f18) {
        com.tencent.mm.plugin.fav.ui.m1 m1Var = this.f101156a;
        com.tencent.mm.ui.tools.MMGestureGallery mMGestureGallery = m1Var.f101254b;
        if (mMGestureGallery == null || m1Var.f101257e == null) {
            return;
        }
        float height = mMGestureGallery.getHeight() != 0 ? 1.0f - (f18 / m1Var.f101254b.getHeight()) : 1.0f;
        float f19 = height <= 1.0f ? height : 1.0f;
        com.tencent.mm.ui.base.MultiTouchImageView W = m1Var.f101257e.W();
        if (W != null) {
            W.setPivotX(m1Var.f101254b.getWidth() / 2);
            W.setPivotY(m1Var.f101254b.getHeight() / 2);
            W.setScaleX(f19);
            W.setScaleY(f19);
            W.setTranslationX(f17);
            W.setTranslationY(f18);
            android.view.View view = m1Var.f101255c;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Float.valueOf(f19));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/fav/ui/FavDragLogic$1", "onGalleryScale", "(FF)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
            yj0.a.f(view, "com/tencent/mm/plugin/fav/ui/FavDragLogic$1", "onGalleryScale", "(FF)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
    }

    @Override // com.tencent.mm.ui.tools.o5
    public void b(float f17, float f18) {
    }
}

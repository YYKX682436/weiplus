package com.p314xaae8f345.mm.p1006xc5476f33.fav.ui;

/* loaded from: classes12.dex */
public class i1 implements com.p314xaae8f345.mm.ui.p2740x696c9db.o5 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.m1 f182689a;

    public i1(com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.m1 m1Var) {
        this.f182689a = m1Var;
    }

    @Override // com.p314xaae8f345.mm.ui.p2740x696c9db.o5
    public void a(float f17, float f18) {
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.m1 m1Var = this.f182689a;
        com.p314xaae8f345.mm.ui.p2740x696c9db.C22506x89e75b89 c22506x89e75b89 = m1Var.f182787b;
        if (c22506x89e75b89 == null || m1Var.f182790e == null) {
            return;
        }
        float height = c22506x89e75b89.getHeight() != 0 ? 1.0f - (f18 / m1Var.f182787b.getHeight()) : 1.0f;
        float f19 = height <= 1.0f ? height : 1.0f;
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21524xecd57b9a W = m1Var.f182790e.W();
        if (W != null) {
            W.setPivotX(m1Var.f182787b.getWidth() / 2);
            W.setPivotY(m1Var.f182787b.getHeight() / 2);
            W.setScaleX(f19);
            W.setScaleY(f19);
            W.setTranslationX(f17);
            W.setTranslationY(f18);
            android.view.View view = m1Var.f182788c;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Float.valueOf(f19));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/fav/ui/FavDragLogic$1", "onGalleryScale", "(FF)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
            yj0.a.f(view, "com/tencent/mm/plugin/fav/ui/FavDragLogic$1", "onGalleryScale", "(FF)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2740x696c9db.o5
    public void b(float f17, float f18) {
    }
}

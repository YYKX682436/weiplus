package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui;

/* loaded from: classes3.dex */
public final class g7 implements com.p314xaae8f345.mm.ui.p2740x696c9db.o5 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15037x1b952727 f210822a;

    public g7(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15037x1b952727 activityC15037x1b952727) {
        this.f210822a = activityC15037x1b952727;
    }

    @Override // com.p314xaae8f345.mm.ui.p2740x696c9db.o5
    public void a(float f17, float f18) {
        float f19 = 1;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15037x1b952727 activityC15037x1b952727 = this.f210822a;
        if (activityC15037x1b952727.f210121w == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("gallery");
            throw null;
        }
        float height = f19 - (f18 / r2.getHeight());
        if (height > 1.0f) {
            height = 1.0f;
        }
        java.lang.String str = activityC15037x1b952727.f210119u;
        com.p314xaae8f345.mm.ui.p2740x696c9db.C22506x89e75b89 c22506x89e75b89 = activityC15037x1b952727.f210121w;
        if (c22506x89e75b89 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("gallery");
            throw null;
        }
        android.view.View selectedView = c22506x89e75b89.getSelectedView();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(selectedView, "null cannot be cast to non-null type com.tencent.mm.ui.base.MultiTouchImageView");
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21524xecd57b9a c21524xecd57b9a = (com.p314xaae8f345.mm.ui.p2642x2e06d1.C21524xecd57b9a) selectedView;
        if (activityC15037x1b952727.f210121w == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("gallery");
            throw null;
        }
        c21524xecd57b9a.setPivotX(r5.getWidth() / 2);
        if (activityC15037x1b952727.f210121w == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("gallery");
            throw null;
        }
        c21524xecd57b9a.setPivotY(r5.getHeight() / 2);
        c21524xecd57b9a.setScaleX(height);
        c21524xecd57b9a.setScaleY(height);
        c21524xecd57b9a.setTranslationX(f17);
        c21524xecd57b9a.setTranslationY(f18);
        android.view.View view = activityC15037x1b952727.f210120v;
        if (view == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("root");
            throw null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Float.valueOf(height));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/ui/FinderImagePreviewUI$initDragGallery$1", "onGalleryScale", "(FF)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/ui/FinderImagePreviewUI$initDragGallery$1", "onGalleryScale", "(FF)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
    }

    @Override // com.p314xaae8f345.mm.ui.p2740x696c9db.o5
    public void b(float f17, float f18) {
    }
}

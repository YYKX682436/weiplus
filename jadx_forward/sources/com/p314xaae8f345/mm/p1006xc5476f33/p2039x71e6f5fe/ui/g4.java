package com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui;

/* loaded from: classes3.dex */
public class g4 implements com.p314xaae8f345.mm.ui.p2740x696c9db.o5 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.ActivityC17318xa8131d22 f241089a;

    public g4(com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.ActivityC17318xa8131d22 activityC17318xa8131d22) {
        this.f241089a = activityC17318xa8131d22;
    }

    @Override // com.p314xaae8f345.mm.ui.p2740x696c9db.o5
    public void a(float f17, float f18) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.ActivityC17318xa8131d22 activityC17318xa8131d22 = this.f241089a;
        float height = 1.0f - (f18 / activityC17318xa8131d22.f241010p.getHeight());
        float f19 = height <= 1.0f ? height : 1.0f;
        if (activityC17318xa8131d22.f241011q != null) {
            if (f17 == 0.0f && f18 == 0.0f) {
                android.view.View view = activityC17318xa8131d22.f241013s;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/scanner/ui/TranslationResultUI$4", "onGalleryScale", "(FF)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/scanner/ui/TranslationResultUI$4", "onGalleryScale", "(FF)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else {
                android.view.View view2 = activityC17318xa8131d22.f241013s;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/scanner/ui/TranslationResultUI$4", "onGalleryScale", "(FF)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/scanner/ui/TranslationResultUI$4", "onGalleryScale", "(FF)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            activityC17318xa8131d22.f241011q.setPivotX(activityC17318xa8131d22.f241010p.getWidth() / 2);
            activityC17318xa8131d22.f241011q.setPivotY(activityC17318xa8131d22.f241010p.getHeight() / 2);
            activityC17318xa8131d22.f241011q.setScaleX(f19);
            activityC17318xa8131d22.f241011q.setScaleY(f19);
            activityC17318xa8131d22.f241011q.setTranslationX(f17);
            activityC17318xa8131d22.f241011q.setTranslationY(f18);
            android.view.View view3 = activityC17318xa8131d22.f241014t;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(java.lang.Float.valueOf(f19));
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/scanner/ui/TranslationResultUI$4", "onGalleryScale", "(FF)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view3.setAlpha(((java.lang.Float) arrayList3.get(0)).floatValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/scanner/ui/TranslationResultUI$4", "onGalleryScale", "(FF)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2740x696c9db.o5
    public void b(float f17, float f18) {
    }
}

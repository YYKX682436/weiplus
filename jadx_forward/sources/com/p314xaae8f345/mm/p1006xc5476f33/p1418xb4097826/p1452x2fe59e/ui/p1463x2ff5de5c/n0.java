package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.p1463x2ff5de5c;

/* loaded from: classes10.dex */
public final class n0 implements com.p314xaae8f345.mm.ui.p2740x696c9db.o5 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2740x696c9db.C22506x89e75b89 f191404a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.p1463x2ff5de5c.ActivityC14126xa5cf9084 f191405b;

    public n0(com.p314xaae8f345.mm.ui.p2740x696c9db.C22506x89e75b89 c22506x89e75b89, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.p1463x2ff5de5c.ActivityC14126xa5cf9084 activityC14126xa5cf9084) {
        this.f191404a = c22506x89e75b89;
        this.f191405b = activityC14126xa5cf9084;
    }

    @Override // com.p314xaae8f345.mm.ui.p2740x696c9db.o5
    public void a(float f17, float f18) {
        com.p314xaae8f345.mm.ui.p2740x696c9db.C22506x89e75b89 c22506x89e75b89 = this.f191404a;
        if (c22506x89e75b89.getHeight() <= 0) {
            return;
        }
        float height = 1 - (f18 / c22506x89e75b89.getHeight());
        if (height > 1.0f) {
            height = 1.0f;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.p1463x2ff5de5c.ActivityC14126xa5cf9084 activityC14126xa5cf9084 = this.f191405b;
        activityC14126xa5cf9084.f191308J = height;
        android.view.View selectedView = c22506x89e75b89.getSelectedView();
        if (selectedView != null) {
            selectedView.setPivotX(c22506x89e75b89.getWidth() / 2.0f);
            selectedView.setPivotY(c22506x89e75b89.getHeight() / 2.0f);
            selectedView.setScaleX(height);
            selectedView.setScaleY(height);
            selectedView.setTranslationX(f17);
            selectedView.setTranslationY(f18);
            ug5.x.e(activityC14126xa5cf9084.getWindow(), height < 1.0f ? 0 : -16777216);
            android.view.View view = activityC14126xa5cf9084.f191315z;
            if (view != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(java.lang.Float.valueOf(height));
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/ui/commentimage/FinderCommentImageFlowUI$runDragAnimation$1", "onGalleryScale", "(FF)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
                yj0.a.f(view, "com/tencent/mm/plugin/finder/feed/ui/commentimage/FinderCommentImageFlowUI$runDragAnimation$1", "onGalleryScale", "(FF)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            }
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2740x696c9db.o5
    public void b(float f17, float f18) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.p1463x2ff5de5c.ActivityC14126xa5cf9084 activityC14126xa5cf9084 = this.f191405b;
        activityC14126xa5cf9084.K = (int) f17;
        activityC14126xa5cf9084.L = (int) f18;
    }
}

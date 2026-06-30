package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5;

/* loaded from: classes2.dex */
public abstract class m {
    public static final void a(android.view.View v17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(v17, "v");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Float.valueOf(1.0f));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(v17, arrayList.toArray(), "com/tencent/mm/plugin/game/chatroom/view/BaseItemAnimatorKt", "clear", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        v17.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(v17, "com/tencent/mm/plugin/game/chatroom/view/BaseItemAnimatorKt", "clear", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        v17.setScaleY(1.0f);
        v17.setScaleX(1.0f);
        v17.setTranslationY(0.0f);
        v17.setTranslationX(0.0f);
        v17.setRotation(0.0f);
        v17.setRotationY(0.0f);
        v17.setRotationX(0.0f);
        v17.setPivotY(v17.getMeasuredHeight() / 2.0f);
        v17.setPivotX(v17.getMeasuredWidth() / 2.0f);
        v17.animate().setInterpolator(null).setStartDelay(0L);
    }
}

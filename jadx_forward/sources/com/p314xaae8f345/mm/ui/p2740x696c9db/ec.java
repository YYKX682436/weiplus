package com.p314xaae8f345.mm.ui.p2740x696c9db;

/* loaded from: classes3.dex */
public class ec implements oa5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f291913a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.view.View f291914b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2740x696c9db.ActivityC22543x95896a72 f291915c;

    public ec(com.p314xaae8f345.mm.ui.p2740x696c9db.ActivityC22543x95896a72 activityC22543x95896a72, int i17, android.view.View view) {
        this.f291915c = activityC22543x95896a72;
        this.f291913a = i17;
        this.f291914b = view;
    }

    @Override // oa5.a
    public void a(float f17) {
        float f18 = 1.0f - f17;
        this.f291915c.f291751J.setTranslationY(-(this.f291913a * f18));
        android.view.View view = this.f291914b;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Float.valueOf(f18));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/tools/ShowVideoUI$19", "onUpdate", "(F)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view, "com/tencent/mm/ui/tools/ShowVideoUI$19", "onUpdate", "(F)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
    }
}

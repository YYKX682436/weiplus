package com.p314xaae8f345.mm.ui.p2740x696c9db;

/* loaded from: classes3.dex */
public class ra implements oa5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.view.View f292212a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2740x696c9db.ActivityC22534xec824752 f292213b;

    public ra(com.p314xaae8f345.mm.ui.p2740x696c9db.ActivityC22534xec824752 activityC22534xec824752, android.view.View view) {
        this.f292213b = activityC22534xec824752;
        this.f292212a = view;
    }

    @Override // oa5.a
    public void a(float f17) {
        float f18 = 1.0f - f17;
        this.f292213b.f291735r.setAlpha(f18);
        android.view.View view = this.f292212a;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Float.valueOf(f18));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/tools/ShowImageUI$14", "onUpdate", "(F)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view, "com/tencent/mm/ui/tools/ShowImageUI$14", "onUpdate", "(F)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
    }
}

package com.p3263xee53b379;

/* loaded from: classes13.dex */
public final class a0 implements com.p3263xee53b379.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p3263xee53b379.ActivityC28074x3a8f05c8 f302231a;

    public a0(com.p3263xee53b379.ActivityC28074x3a8f05c8 activityC28074x3a8f05c8) {
        this.f302231a = activityC28074x3a8f05c8;
    }

    @Override // com.p3263xee53b379.f
    public final void a(java.lang.String str, com.p3263xee53b379.g gVar) {
        boolean parseBoolean = java.lang.Boolean.parseBoolean(str);
        android.view.View view = this.f302231a.f302205m;
        if (view != null) {
            int i17 = parseBoolean ? 0 : 8;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Integer.valueOf(i17));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/unionpay/UPPayWapActivity", "a", "(Lcom/unionpay/UPPayWapActivity;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/unionpay/UPPayWapActivity", "a", "(Lcom/unionpay/UPPayWapActivity;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (gVar != null) {
            ((com.p3263xee53b379.d) gVar).a(com.p3263xee53b379.ActivityC28074x3a8f05c8.L6("0", ya.b.f77504xbb80cbe3, null));
        }
    }
}

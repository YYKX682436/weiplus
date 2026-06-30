package com.p314xaae8f345.mm.ui.p2690x38b72420;

/* loaded from: classes11.dex */
public class p2 implements com.p314xaae8f345.mm.p2470x93e71c27.ui.h2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22295xcc682948 f288608a;

    public p2(com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22295xcc682948 activityC22295xcc682948) {
        this.f288608a = activityC22295xcc682948;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.h2
    public void a(android.view.View view) {
        this.f288608a.mo53060x36654fab(view);
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.h2
    public void b() {
        c01.e2.e0(this.f288608a.f287917s);
        w11.w1.wi().h(7);
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.h2
    public void c() {
        com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22295xcc682948 activityC22295xcc682948 = this.f288608a;
        if (activityC22295xcc682948.C1.f()) {
            android.view.View view = activityC22295xcc682948.E1;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/contact/ContactRemarkInfoModUI$3", "onChangePhoneCount", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/ui/contact/ContactRemarkInfoModUI$3", "onChangePhoneCount", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            android.view.View view2 = activityC22295xcc682948.E1;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/ui/contact/ContactRemarkInfoModUI$3", "onChangePhoneCount", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/ui/contact/ContactRemarkInfoModUI$3", "onChangePhoneCount", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            activityC22295xcc682948.I1.setVisibility(8);
        }
        activityC22295xcc682948.Y6();
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.h2
    /* renamed from: onChange */
    public void mo67648x3dcbea6f() {
        int i17 = com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22295xcc682948.T1;
        this.f288608a.Y6();
    }
}

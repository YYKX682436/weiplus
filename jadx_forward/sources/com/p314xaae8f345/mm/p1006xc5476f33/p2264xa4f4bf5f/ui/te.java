package com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui;

/* loaded from: classes.dex */
public final class te implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ActivityC18656x65fa26e6 f255857d;

    public te(com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ActivityC18656x65fa26e6 activityC18656x65fa26e6) {
        this.f255857d = activityC18656x65fa26e6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.Object mo141623x754a37bb = ((jz5.n) this.f255857d.f255192f).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        android.view.View view = (android.view.View) mo141623x754a37bb;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(4);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/textstatus/ui/TextStatusOtherTopicFriendsActivity$onCreate$4$2", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/textstatus/ui/TextStatusOtherTopicFriendsActivity$onCreate$4$2", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}

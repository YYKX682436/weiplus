package com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui;

/* loaded from: classes4.dex */
public final class q1 implements android.view.ViewTreeObserver.OnScrollChangedListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui.ActivityC11495xd59e7ca0 f156148a;

    public q1(com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui.ActivityC11495xd59e7ca0 activityC11495xd59e7ca0) {
        this.f156148a = activityC11495xd59e7ca0;
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui.ActivityC11495xd59e7ca0 activityC11495xd59e7ca0 = this.f156148a;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e017 = activityC11495xd59e7ca0.f156007s;
        if (c22621x7603e017 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("addrCaptureET");
            throw null;
        }
        boolean canScrollVertically = c22621x7603e017.canScrollVertically(-1);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e0172 = activityC11495xd59e7ca0.f156007s;
        if (c22621x7603e0172 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("addrCaptureET");
            throw null;
        }
        boolean canScrollVertically2 = c22621x7603e0172.canScrollVertically(1);
        android.view.View view = activityC11495xd59e7ca0.f156011w;
        if (view == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("addrCaptureETTopMask");
            throw null;
        }
        int i17 = canScrollVertically ? 0 : 4;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/address/ui/WalletAddAddressUI$onCreate$10", "onScrollChanged", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/address/ui/WalletAddAddressUI$onCreate$10", "onScrollChanged", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view2 = activityC11495xd59e7ca0.f156012x;
        if (view2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("addrCaptureETBottomMask");
            throw null;
        }
        int i18 = canScrollVertically2 ? 0 : 4;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(java.lang.Integer.valueOf(i18));
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/address/ui/WalletAddAddressUI$onCreate$10", "onScrollChanged", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/address/ui/WalletAddAddressUI$onCreate$10", "onScrollChanged", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}

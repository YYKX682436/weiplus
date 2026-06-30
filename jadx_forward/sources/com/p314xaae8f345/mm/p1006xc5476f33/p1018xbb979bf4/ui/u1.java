package com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui;

/* loaded from: classes5.dex */
public final class u1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui.ActivityC11495xd59e7ca0 f156163d;

    public u1(com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui.ActivityC11495xd59e7ca0 activityC11495xd59e7ca0) {
        this.f156163d = activityC11495xd59e7ca0;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/address/ui/WalletAddAddressUI$onCreate$13", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.CharSequence a17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.b0.a();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "getText(...)");
        int length = a17.length();
        if (120 <= length) {
            length = 120;
        }
        java.lang.CharSequence subSequence = a17.subSequence(0, length);
        com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui.ActivityC11495xd59e7ca0 activityC11495xd59e7ca0 = this.f156163d;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e017 = activityC11495xd59e7ca0.f156007s;
        if (c22621x7603e017 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("addrCaptureET");
            throw null;
        }
        c22621x7603e017.setText(subSequence);
        android.widget.TextView textView = activityC11495xd59e7ca0.f156009u;
        if (textView == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("addrCaptureRecognizeTV");
            throw null;
        }
        textView.performClick();
        yj0.a.h(this, "com/tencent/mm/plugin/address/ui/WalletAddAddressUI$onCreate$13", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

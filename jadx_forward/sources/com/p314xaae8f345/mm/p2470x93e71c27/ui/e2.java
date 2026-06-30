package com.p314xaae8f345.mm.p2470x93e71c27.ui;

/* loaded from: classes8.dex */
public class e2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f272325d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.ui.C19645x574159e9 f272326e;

    public e2(com.p314xaae8f345.mm.p2470x93e71c27.ui.C19645x574159e9 c19645x574159e9, android.view.View view) {
        this.f272326e = c19645x574159e9;
        this.f272325d = view;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/pluginsdk/ui/ProfileEditPhoneNumberView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p2470x93e71c27.ui.C19645x574159e9 c19645x574159e9 = this.f272326e;
        c19645x574159e9.f271340h.removeView(this.f272325d);
        c19645x574159e9.g();
        yj0.a.h(this, "com/tencent/mm/pluginsdk/ui/ProfileEditPhoneNumberView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

package com.p314xaae8f345.mm.p2470x93e71c27.ui;

/* loaded from: classes.dex */
public class i2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.ui.C19650x84c3dde8 f272408d;

    public i2(com.p314xaae8f345.mm.p2470x93e71c27.ui.C19650x84c3dde8 c19650x84c3dde8) {
        this.f272408d = c19650x84c3dde8;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/pluginsdk/ui/ProfileMobilePhoneView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.String charSequence = ((android.widget.TextView) view).getText().toString();
        int i17 = com.p314xaae8f345.mm.p2470x93e71c27.ui.C19650x84c3dde8.f271346n;
        com.p314xaae8f345.mm.p2470x93e71c27.ui.C19650x84c3dde8 c19650x84c3dde8 = this.f272408d;
        c19650x84c3dde8.getClass();
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0(c19650x84c3dde8.getContext(), false, 1);
        k0Var.f293405n = new com.p314xaae8f345.mm.p2470x93e71c27.ui.j2(c19650x84c3dde8);
        k0Var.f293414s = new com.p314xaae8f345.mm.p2470x93e71c27.ui.k2(c19650x84c3dde8, charSequence);
        k0Var.v();
        c19650x84c3dde8.f271352m.onClick(view);
        yj0.a.h(this, "com/tencent/mm/pluginsdk/ui/ProfileMobilePhoneView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

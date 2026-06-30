package com.p314xaae8f345.mm.p1006xc5476f33.p1926xc1722a7f.ui;

/* loaded from: classes.dex */
public class a implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1926xc1722a7f.ui.C16720x4d2f27b4 f233656d;

    public a(com.p314xaae8f345.mm.p1006xc5476f33.p1926xc1722a7f.ui.C16720x4d2f27b4 c16720x4d2f27b4) {
        this.f233656d = c16720x4d2f27b4;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/nearby/ui/BindMobileOrQQHeaderView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Intent intent = new android.content.Intent();
        com.p314xaae8f345.mm.p1006xc5476f33.p1926xc1722a7f.ui.C16720x4d2f27b4 c16720x4d2f27b4 = this.f233656d;
        intent.setClass(c16720x4d2f27b4.getContext(), com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1009x2e243d.ui.ActivityC11360x90d2d970.class);
        intent.putExtra("key_upload_scene", 7);
        com.p314xaae8f345.mm.ui.AbstractActivityC21409xdfe27f5a.X6(c16720x4d2f27b4.getContext(), intent);
        yj0.a.h(this, "com/tencent/mm/plugin/nearby/ui/BindMobileOrQQHeaderView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

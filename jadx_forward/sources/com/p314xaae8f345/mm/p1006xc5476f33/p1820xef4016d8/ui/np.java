package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui;

/* loaded from: classes9.dex */
public class np implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.C16407x72652a1a f228781d;

    public np(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.C16407x72652a1a c16407x72652a1a) {
        this.f228781d = c16407x72652a1a;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyWishFooter$6", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.C16407x72652a1a c16407x72652a1a = this.f228781d;
        c16407x72652a1a.f228219u = false;
        c16407x72652a1a.f228216r.setVisibility(8);
        c16407x72652a1a.f228216r.h();
        c16407x72652a1a.f228213o.setImageResource(com.p314xaae8f345.mm.R.raw.f80094x8ea8d5ee);
        c16407x72652a1a.getClass();
        c16407x72652a1a.f228217s = 0;
        yj0.a.i(false, this, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyWishFooter$6", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}

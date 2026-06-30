package nl1;

/* loaded from: classes5.dex */
public class a implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.p1227x625824aa.C12780x42a41de6 f419701d;

    public a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.p1227x625824aa.C12780x42a41de6 c12780x42a41de6) {
        this.f419701d = c12780x42a41de6;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/appbrand/widget/input/numberpad/BaseNumberKeyboardView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.p1227x625824aa.C12780x42a41de6 c12780x42a41de6 = this.f419701d;
        if (c12780x42a41de6.f173103t == null) {
            yj0.a.h(this, "com/tencent/mm/plugin/appbrand/widget/input/numberpad/BaseNumberKeyboardView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        if (view.getId() != com.p314xaae8f345.mm.R.id.f78323xf2891774) {
            int i17 = view.getId() == com.p314xaae8f345.mm.R.id.f78312xf289172d ? 8 : view.getId() == com.p314xaae8f345.mm.R.id.f78313xf289172e ? 9 : view.getId() == com.p314xaae8f345.mm.R.id.f78314xf289172f ? 10 : view.getId() == com.p314xaae8f345.mm.R.id.f78315xf2891730 ? 11 : view.getId() == com.p314xaae8f345.mm.R.id.f78316xf2891731 ? 12 : view.getId() == com.p314xaae8f345.mm.R.id.f78317xf2891732 ? 13 : view.getId() == com.p314xaae8f345.mm.R.id.f78318xf2891733 ? 14 : view.getId() == com.p314xaae8f345.mm.R.id.f78319xf2891734 ? 15 : view.getId() == com.p314xaae8f345.mm.R.id.f78320xf2891735 ? 16 : view.getId() == com.p314xaae8f345.mm.R.id.f78311xf289172c ? 7 : view.getId() == com.p314xaae8f345.mm.R.id.f78321xf2891760 ? 67 : 0;
            c12780x42a41de6.f173103t.dispatchKeyEvent(new android.view.KeyEvent(0, i17));
            c12780x42a41de6.f173103t.dispatchKeyEvent(new android.view.KeyEvent(1, i17));
            yj0.a.h(this, "com/tencent/mm/plugin/appbrand/widget/input/numberpad/BaseNumberKeyboardView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        int i18 = c12780x42a41de6.f173090d;
        if (i18 == 1) {
            c12780x42a41de6.f173103t.dispatchKeyEvent(new android.view.KeyEvent(0, 59));
            c12780x42a41de6.f173103t.dispatchKeyEvent(new android.view.KeyEvent(0, 52));
            c12780x42a41de6.f173103t.dispatchKeyEvent(new android.view.KeyEvent(1, 59));
        } else if (i18 == 2) {
            c12780x42a41de6.f173103t.dispatchKeyEvent(new android.view.KeyEvent(0, 56));
        }
        yj0.a.h(this, "com/tencent/mm/plugin/appbrand/widget/input/numberpad/BaseNumberKeyboardView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

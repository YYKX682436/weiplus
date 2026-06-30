package com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui;

/* loaded from: classes4.dex */
public class h2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.ActivityC16554x70dcab5d f230873d;

    public h2(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.ActivityC16554x70dcab5d activityC16554x70dcab5d) {
        this.f230873d = activityC16554x70dcab5d;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/mmsight/ui/SightCaptureUI$12", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.ActivityC16554x70dcab5d.N1;
        com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.ActivityC16554x70dcab5d activityC16554x70dcab5d = this.f230873d;
        int i18 = activityC16554x70dcab5d.f230764g;
        boolean z17 = true;
        if (i18 != 4 && i18 != 3 && i18 != 1 && i18 != 8 && i18 != 9) {
            z17 = false;
        }
        if (!z17) {
            yj0.a.h(this, "com/tencent/mm/plugin/mmsight/ui/SightCaptureUI$12", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        activityC16554x70dcab5d.finish();
        activityC16554x70dcab5d.overridePendingTransition(-1, com.p314xaae8f345.mm.R.C30854x2dc211.f559410e1);
        yj0.a.h(this, "com/tencent/mm/plugin/mmsight/ui/SightCaptureUI$12", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

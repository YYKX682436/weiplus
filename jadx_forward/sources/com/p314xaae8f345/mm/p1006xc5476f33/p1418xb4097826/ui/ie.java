package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui;

/* loaded from: classes10.dex */
public final class ie implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15059x3e98c949 f210896d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f210897e;

    public ie(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15059x3e98c949 activityC15059x3e98c949, float f17) {
        this.f210896d = activityC15059x3e98c949;
        this.f210897e = f17;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/ui/FinderSelectCoverUI$initCropLayout$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15059x3e98c949 activityC15059x3e98c949 = this.f210896d;
        int i17 = activityC15059x3e98c949.Z;
        float f17 = this.f210897e;
        if (i17 == 1) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15059x3e98c949.c7(activityC15059x3e98c949, f17, 2);
        } else if (i17 == 2) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15059x3e98c949.c7(activityC15059x3e98c949, f17, 1);
        }
        activityC15059x3e98c949.p7();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/ui/FinderSelectCoverUI$initCropLayout$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

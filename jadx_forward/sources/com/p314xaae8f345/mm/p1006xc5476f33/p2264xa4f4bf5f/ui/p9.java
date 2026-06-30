package com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui;

/* loaded from: classes11.dex */
public final class p9 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ActivityC18639xf6f98078 f255706d;

    public p9(com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ActivityC18639xf6f98078 activityC18639xf6f98078) {
        this.f255706d = activityC18639xf6f98078;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/textstatus/ui/TextStatusEditActivity$initSmileyPanel$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ActivityC18639xf6f98078 activityC18639xf6f98078 = this.f255706d;
        if (activityC18639xf6f98078.S1 == com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.f8.f255402e) {
            com.p314xaae8f345.mm.p679x5c28046.p684x373aa5.C10449x84ee1171 c10449x84ee1171 = activityC18639xf6f98078.f255109e;
            if (c10449x84ee1171 != null && c10449x84ee1171.getVisibility() == 0) {
                com.p314xaae8f345.mm.p679x5c28046.p684x373aa5.C10449x84ee1171 c10449x84ee11712 = activityC18639xf6f98078.f255109e;
                if (c10449x84ee11712 != null) {
                    c10449x84ee11712.setVisibility(4);
                }
                activityC18639xf6f98078.J2(false, 0);
                activityC18639xf6f98078.mo48674x36654fab();
            } else {
                activityC18639xf6f98078.mo26063x7b383410();
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/textstatus/ui/TextStatusEditActivity$initSmileyPanel$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

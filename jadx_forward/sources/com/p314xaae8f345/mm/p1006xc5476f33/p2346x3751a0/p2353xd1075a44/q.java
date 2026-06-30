package com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2353xd1075a44;

/* loaded from: classes14.dex */
public class q implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f258721d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2353xd1075a44.ActivityC18942xf3a93c9a f258722e;

    public q(com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2353xd1075a44.ActivityC18942xf3a93c9a activityC18942xf3a93c9a, int i17) {
        this.f258722e = activityC18942xf3a93c9a;
        this.f258721d = i17;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/voip/widget/VoipScoreDialog$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2353xd1075a44.ActivityC18942xf3a93c9a.f258656i;
        com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2353xd1075a44.ActivityC18942xf3a93c9a activityC18942xf3a93c9a = this.f258722e;
        activityC18942xf3a93c9a.getClass();
        int i18 = this.f258721d;
        rk0.c.c("MicroMsg.VoipScoreDialog", "onScoreViewClick %s", java.lang.Integer.valueOf(i18));
        if (i18 >= 0) {
            android.widget.ImageView[] imageViewArr = activityC18942xf3a93c9a.f258659f;
            if (i18 < imageViewArr.length) {
                for (int i19 = 0; i19 <= i18; i19++) {
                    imageViewArr[i19].setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f563737ch2);
                }
                int i27 = i18 + 1;
                for (int i28 = i27; i28 < imageViewArr.length; i28++) {
                    imageViewArr[i28].setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f563736ch1);
                }
                activityC18942xf3a93c9a.f258661h = i27;
            }
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 j0Var = activityC18942xf3a93c9a.f258660g;
        if (j0Var != null) {
            j0Var.z(com.p314xaae8f345.mm.R.C30867xcad56011.kd6, new com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2353xd1075a44.u(activityC18942xf3a93c9a));
            activityC18942xf3a93c9a.f258660g.u(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg, new com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2353xd1075a44.v(activityC18942xf3a93c9a));
        }
        yj0.a.h(this, "com/tencent/mm/plugin/voip/widget/VoipScoreDialog$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

package com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851;

/* loaded from: classes12.dex */
public class w0 implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.ActivityC13591xdaafa82c f182342d;

    public w0(com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.ActivityC13591xdaafa82c activityC13591xdaafa82c) {
        this.f182342d = activityC13591xdaafa82c;
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/fav/ui/detail/FavoriteImgDetailUI$6", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        r45.gp0 gp0Var = (r45.gp0) view.getTag();
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.ActivityC13591xdaafa82c activityC13591xdaafa82c = this.f182342d;
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.a1 a1Var = (com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.a1) activityC13591xdaafa82c.f182161p.get(gp0Var.T);
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.ActivityC13591xdaafa82c.Z6(activityC13591xdaafa82c, a1Var);
        if (!a1Var.f182219d) {
            activityC13591xdaafa82c.getClass();
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5884x4c2d9184 c5884x4c2d9184 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5884x4c2d9184();
            java.lang.String x17 = o72.x1.x(a1Var.f182216a);
            am.aq aqVar = c5884x4c2d9184.f136192g;
            aqVar.f87708b = x17;
            aqVar.f87707a = java.lang.System.currentTimeMillis();
            aqVar.f87712f = 2;
            c5884x4c2d9184.e();
            a1Var.f182219d = true;
        }
        yj0.a.i(true, this, "com/tencent/mm/plugin/fav/ui/detail/FavoriteImgDetailUI$6", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return true;
    }
}

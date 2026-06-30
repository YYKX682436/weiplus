package com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851;

/* loaded from: classes12.dex */
public class x implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.ActivityC13590x9555381d f182344d;

    public x(com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.ActivityC13590x9555381d activityC13590x9555381d) {
        this.f182344d = activityC13590x9555381d;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/fav/ui/detail/FavoriteFileDetailUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.ActivityC13590x9555381d activityC13590x9555381d = this.f182344d;
        if (!com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.ActivityC13590x9555381d.i7(activityC13590x9555381d.F) || activityC13590x9555381d.E.P0() || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(activityC13590x9555381d.F.f456967s)) {
            com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.ActivityC13590x9555381d.a7(activityC13590x9555381d);
        } else {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 z2Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2(activityC13590x9555381d.mo55332x76847179(), 1, 2, false);
            z2Var.m(activityC13590x9555381d.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg), activityC13590x9555381d.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.dsz));
            z2Var.o(0);
            com.p314xaae8f345.mm.ui.bk.r0(z2Var.C.getPaint(), 0.8f);
            z2Var.v(activityC13590x9555381d.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a0c));
            com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.v vVar = new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.v(this, z2Var);
            com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.w wVar = new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.w(this, z2Var);
            z2Var.D = vVar;
            z2Var.E = wVar;
            z2Var.q(activityC13590x9555381d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572721dt2));
            android.widget.TextView textView = new android.widget.TextView(activityC13590x9555381d.mo55332x76847179());
            textView.setText(com.p314xaae8f345.mm.R.C30867xcad56011.f572720dt1);
            textView.setTextColor(activityC13590x9555381d.getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560252fa));
            textView.setTextSize(14.0f);
            z2Var.j(textView);
            z2Var.C();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/fav/ui/detail/FavoriteFileDetailUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

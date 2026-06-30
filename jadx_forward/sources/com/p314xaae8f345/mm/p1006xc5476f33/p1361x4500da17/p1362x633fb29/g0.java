package com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29;

/* loaded from: classes14.dex */
public class g0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.h0 f178806d;

    public g0(com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.h0 h0Var) {
        this.f178806d = h0Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/downloader_app/model/GameDownloadFloatBallHelper$4$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.h0 h0Var = this.f178806d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.l0.e0(h0Var.f178809a, false);
        com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.l0 l0Var = h0Var.f178809a;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var = l0Var.f178833y;
        if (u1Var != null) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 j0Var = u1Var.f293531c;
            if (j0Var != null) {
                j0Var.dismiss();
            }
            l0Var.f178833y = null;
            l0Var.A.m43072x2efc64();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/downloader_app/model/GameDownloadFloatBallHelper$4$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui;

/* loaded from: classes4.dex */
public class o2 implements com.p314xaae8f345.mm.p944x882e457a.e3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.ActivityC15952xfbdce232 f223224d;

    public o2(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.ActivityC15952xfbdce232 activityC15952xfbdce232) {
        this.f223224d = activityC15952xfbdce232;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.e3
    /* renamed from: callback */
    public int mo1034xf5bc2045(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.o oVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.ActivityC15952xfbdce232 activityC15952xfbdce232 = this.f223224d;
        if (i17 != 0 || i18 != 0) {
            int i19 = com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.ActivityC15952xfbdce232.f222273g;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsgGameDetailRankLikedUI", "CGI return is not OK. (%d, %d)(%s)", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
            activityC15952xfbdce232.finish();
            return 0;
        }
        m53.r2 r2Var = (m53.r2) oVar.f152244b.f152233a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.q2 q2Var = activityC15952xfbdce232.f222275e;
        java.util.LinkedList linkedList = r2Var.f405537d;
        if (linkedList == null) {
            q2Var.getClass();
        } else {
            java.util.LinkedList linkedList2 = (java.util.LinkedList) q2Var.f223259e;
            linkedList2.clear();
            linkedList2.addAll(linkedList);
            q2Var.notifyDataSetChanged();
        }
        activityC15952xfbdce232.f222276f.dismiss();
        return 0;
    }
}

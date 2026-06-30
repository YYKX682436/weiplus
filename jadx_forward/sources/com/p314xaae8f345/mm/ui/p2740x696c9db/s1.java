package com.p314xaae8f345.mm.ui.p2740x696c9db;

/* loaded from: classes15.dex */
public class s1 implements com.p314xaae8f345.mm.ui.p2740x696c9db.b9 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2740x696c9db.ActivityC22498xb11fdc57 f292221d;

    public s1(com.p314xaae8f345.mm.ui.p2740x696c9db.ActivityC22498xb11fdc57 activityC22498xb11fdc57) {
        this.f292221d = activityC22498xb11fdc57;
    }

    @Override // com.p314xaae8f345.mm.ui.p2740x696c9db.b9
    public void H0() {
    }

    @Override // com.p314xaae8f345.mm.ui.p2740x696c9db.b9
    public void P4(java.lang.String str) {
        com.p314xaae8f345.mm.ui.p2740x696c9db.ActivityC22498xb11fdc57 activityC22498xb11fdc57 = this.f292221d;
        activityC22498xb11fdc57.getClass();
        com.p314xaae8f345.mm.ui.p2740x696c9db.p1 p1Var = activityC22498xb11fdc57.f291519e;
        if (p1Var == null || str == null) {
            return;
        }
        p1Var.f292165g = str.trim();
        java.util.List list = p1Var.f292163e;
        list.clear();
        java.util.ArrayList arrayList = (java.util.ArrayList) p1Var.f292162d;
        int size = arrayList.size();
        for (int i17 = 0; i17 < size; i17++) {
            if (((u11.a) arrayList.get(i17)).f505262c.toUpperCase().contains(p1Var.f292165g.toUpperCase()) || ((u11.a) arrayList.get(i17)).f505263d.toUpperCase().contains(p1Var.f292165g.toUpperCase()) || ((u11.a) arrayList.get(i17)).f505261b.contains(p1Var.f292165g)) {
                list.add((u11.a) arrayList.get(i17));
            }
        }
        p1Var.c();
        p1Var.notifyDataSetChanged();
    }

    @Override // com.p314xaae8f345.mm.ui.p2740x696c9db.b9
    public void V5() {
    }

    @Override // com.p314xaae8f345.mm.ui.p2740x696c9db.b9
    public void Z2() {
    }

    @Override // com.p314xaae8f345.mm.ui.p2740x696c9db.b9
    public boolean n5(java.lang.String str) {
        return false;
    }

    @Override // com.p314xaae8f345.mm.ui.p2740x696c9db.b9
    public void v() {
    }
}

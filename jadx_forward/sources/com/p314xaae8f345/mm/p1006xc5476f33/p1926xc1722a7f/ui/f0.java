package com.p314xaae8f345.mm.p1006xc5476f33.p1926xc1722a7f.ui;

/* loaded from: classes15.dex */
public class f0 implements i11.c {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1926xc1722a7f.ui.ActivityC16724xf2604f0a f233670d;

    public f0(com.p314xaae8f345.mm.p1006xc5476f33.p1926xc1722a7f.ui.ActivityC16724xf2604f0a activityC16724xf2604f0a) {
        this.f233670d = activityC16724xf2604f0a;
    }

    @Override // i11.c
    /* renamed from: onGetLocation */
    public boolean mo630x9b865cc(boolean z17, float f17, float f18, int i17, double d17, double d18, double d19) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1926xc1722a7f.ui.ActivityC16724xf2604f0a activityC16724xf2604f0a = this.f233670d;
        if (activityC16724xf2604f0a.f233636w) {
            return false;
        }
        activityC16724xf2604f0a.f233636w = true;
        if (activityC16724xf2604f0a.B) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = activityC16724xf2604f0a.f233620d;
            if (u3Var != null) {
                u3Var.dismiss();
                activityC16724xf2604f0a.f233620d = null;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.f0.e(11);
            return false;
        }
        if (z17) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var2 = activityC16724xf2604f0a.f233620d;
            if (u3Var2 != null) {
                u3Var2.setMessage(activityC16724xf2604f0a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574152h61));
            }
            int i18 = (int) d18;
            activityC16724xf2604f0a.f233638y = new com.p314xaae8f345.mm.p1006xc5476f33.p1926xc1722a7f.ui.m0(activityC16724xf2604f0a, f18, f17, i18);
            activityC16724xf2604f0a.f233623g = new an3.f(activityC16724xf2604f0a.f233629p, f17, f18, i18, i17, "", "");
            gm0.j1.d().g(activityC16724xf2604f0a.f233623g);
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.f0.e(11);
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var3 = activityC16724xf2604f0a.f233620d;
            if (u3Var3 != null) {
                u3Var3.dismiss();
                activityC16724xf2604f0a.f233620d = null;
            }
            android.view.View findViewById = activityC16724xf2604f0a.findViewById(com.p314xaae8f345.mm.R.id.k5p);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/nearby/ui/NearbyFriendsUI$4", "onGetLocation", "(ZFFIDDD)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/nearby/ui/NearbyFriendsUI$4", "onGetLocation", "(ZFFIDDD)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            activityC16724xf2604f0a.f233622f.setVisibility(8);
            activityC16724xf2604f0a.f233634u = true;
            if (!activityC16724xf2604f0a.A && !com.p314xaae8f345.mm.sdk.p2603x2137b148.n2.a()) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1926xc1722a7f.ui.ActivityC16724xf2604f0a activityC16724xf2604f0a2 = this.f233670d;
                activityC16724xf2604f0a2.A = true;
                db5.e1.C(activityC16724xf2604f0a2, activityC16724xf2604f0a2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.fs_), activityC16724xf2604f0a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), activityC16724xf2604f0a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.g6z), activityC16724xf2604f0a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg), false, new com.p314xaae8f345.mm.p1006xc5476f33.p1926xc1722a7f.ui.e0(this), null);
            }
        }
        return false;
    }
}

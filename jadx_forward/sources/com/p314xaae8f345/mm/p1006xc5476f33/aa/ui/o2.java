package com.p314xaae8f345.mm.p1006xc5476f33.aa.ui;

/* loaded from: classes8.dex */
public class o2 extends com.p314xaae8f345.mm.p2802xd031a825.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.ActivityC11348xdd034dc7 f154288d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o2(com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.ActivityC11348xdd034dc7 activityC11348xdd034dc7) {
        super(false);
        this.f154288d = activityC11348xdd034dc7;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.z1
    /* renamed from: onRealClick */
    public void mo27114xc7e50b6b(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.ActivityC11348xdd034dc7 activityC11348xdd034dc7 = this.f154288d;
        java.util.Map map = activityC11348xdd034dc7.f154021q;
        if (map != null && ((java.util.HashMap) map).size() > 0) {
            try {
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.i0 i0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.i0(activityC11348xdd034dc7);
                i0Var.d(com.p314xaae8f345.mm.R.C30867xcad56011.f571251r);
                i0Var.f(com.p314xaae8f345.mm.R.C30867xcad56011.f571252s);
                i0Var.f293354b.E = new com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.m2(this);
                i0Var.e(com.p314xaae8f345.mm.R.C30867xcad56011.f571253t);
                i0Var.f293354b.F = new com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.n2(this);
                i0Var.h();
            } catch (java.lang.Exception unused) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LaunchAAByPersonAmountSelectUI", "clear amount error");
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(13721, 3, 8);
    }
}

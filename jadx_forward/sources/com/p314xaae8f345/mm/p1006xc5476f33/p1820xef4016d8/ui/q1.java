package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui;

/* loaded from: classes9.dex */
public class q1 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f228869d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.s1 f228870e;

    public q1(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.s1 s1Var, android.view.View view) {
        this.f228870e = s1Var;
        this.f228869d = view;
    }

    @Override // db5.o4
    /* renamed from: onCreateMMMenu */
    public void mo887xc459429a(db5.g4 g4Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.s1 s1Var = this.f228870e;
        java.lang.String string = s1Var.f228931d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.gnk);
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16363x8a0a619d activityC16363x8a0a619d = s1Var.f228931d;
        int i17 = activityC16363x8a0a619d.f227592f2.f226689g;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (i17 == 0) {
            string = activityC16363x8a0a619d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.gkp);
        } else {
            g4Var.a(1, com.p314xaae8f345.mm.R.C30867xcad56011.gm6);
        }
        g4Var.f(2, string);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.C0(this.f228869d.getTag(), "nodelete")) {
            return;
        }
        g4Var.d(3, s1Var.f228931d.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560897xj), s1Var.f228931d.mo55332x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.gjr));
    }
}

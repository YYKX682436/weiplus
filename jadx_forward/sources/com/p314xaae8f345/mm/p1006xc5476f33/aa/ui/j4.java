package com.p314xaae8f345.mm.p1006xc5476f33.aa.ui;

/* loaded from: classes9.dex */
public class j4 implements km5.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f154230a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.ActivityC11351x975a7907 f154231b;

    public j4(com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.ActivityC11351x975a7907 activityC11351x975a7907, android.content.Context context) {
        this.f154231b = activityC11351x975a7907;
        this.f154230a = context;
    }

    @Override // km5.e
    public void a(java.lang.Object obj) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Aa.LaunchAAUI", "onInterrupt: %s", obj);
        com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.ActivityC11351x975a7907 activityC11351x975a7907 = this.f154231b;
        android.app.Dialog dialog = activityC11351x975a7907.U;
        if (dialog != null) {
            dialog.dismiss();
        }
        if (obj != null && (obj instanceof java.lang.String) && !obj.toString().equalsIgnoreCase("ok")) {
            db5.e1.E(this.f154230a, obj.toString(), "", activityC11351x975a7907.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ga_), false, new com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.h4(this));
        } else if (obj == null || !(obj instanceof r45.g0)) {
            android.content.Context context = this.f154230a;
            if (obj == null || !(obj instanceof r45.a)) {
                dp.a.m125853x26a183b(context, com.p314xaae8f345.mm.R.C30867xcad56011.f573915ga2, 1).show();
            } else {
                r45.a aVar = (r45.a) obj;
                java.lang.String str = aVar.f451101e;
                java.lang.String str2 = aVar.f451102f;
                java.lang.String str3 = aVar.f451103g;
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.a aVar2 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.a();
                aVar2.f293262s = str;
                aVar2.f293265v = str3;
                aVar2.E = new com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.i4(this, aVar);
                aVar2.f293266w = str2;
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 j0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0(context, com.p314xaae8f345.mm.R.C30868x68b1db1.f576324wd);
                j0Var.e(aVar2);
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.d0 d0Var = aVar2.f293256m;
                if (d0Var != null) {
                    d0Var.a(j0Var.f293370r);
                }
                j0Var.show();
            }
        } else {
            h61.o.e(activityC11351x975a7907.mo55332x76847179(), (r45.g0) obj);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(13722, 5);
    }
}

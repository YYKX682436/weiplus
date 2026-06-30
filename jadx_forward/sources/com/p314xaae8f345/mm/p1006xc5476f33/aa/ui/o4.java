package com.p314xaae8f345.mm.p1006xc5476f33.aa.ui;

/* loaded from: classes9.dex */
public class o4 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f154290a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f154291b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.ActivityC11351x975a7907 f154292c;

    public o4(com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.ActivityC11351x975a7907 activityC11351x975a7907, java.lang.String str, android.content.Context context) {
        this.f154292c = activityC11351x975a7907;
        this.f154290a = str;
        this.f154291b = context;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        nm5.c cVar = (nm5.c) obj;
        cVar.a(0);
        com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.ActivityC11351x975a7907 activityC11351x975a7907 = this.f154292c;
        android.app.Dialog dialog = activityC11351x975a7907.U;
        if (dialog != null) {
            dialog.dismiss();
        }
        boolean booleanValue = ((java.lang.Boolean) cVar.a(0)).booleanValue();
        android.content.Context context = this.f154291b;
        if (!booleanValue) {
            dp.a.m125853x26a183b(context, com.p314xaae8f345.mm.R.C30867xcad56011.f573915ga2, 1).show();
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(13722, 10);
            return null;
        }
        java.lang.String str = this.f154290a;
        com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.ActivityC11351x975a7907.i7(activityC11351x975a7907, str);
        dp.a.m125853x26a183b(context, com.p314xaae8f345.mm.R.C30867xcad56011.gas, 1).show();
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(13722, 9);
        ((hn.k0) ((vg3.i4) i95.n0.c(vg3.i4.class))).wi(str);
        return null;
    }
}

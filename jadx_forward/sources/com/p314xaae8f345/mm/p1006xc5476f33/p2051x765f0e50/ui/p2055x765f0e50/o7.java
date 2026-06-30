package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50;

/* loaded from: classes8.dex */
public final class o7 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17414x34d8ac5f f242913d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f242914e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.ov6 f242915f;

    public o7(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17414x34d8ac5f activityC17414x34d8ac5f, int i17, r45.ov6 ov6Var) {
        this.f242913d = activityC17414x34d8ac5f;
        this.f242914e = i17;
        this.f242915f = ov6Var;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public final void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        if (menuItem.getItemId() == 1) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17414x34d8ac5f activityC17414x34d8ac5f = this.f242913d;
            activityC17414x34d8ac5f.f241873s = this.f242914e;
            l14.f fVar = l14.f.f396543a;
            r45.ov6 ov6Var = this.f242915f;
            fVar.a(202, ov6Var);
            activityC17414x34d8ac5f.getClass();
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0((android.content.Context) activityC17414x34d8ac5f.mo55332x76847179(), 1, true);
            java.lang.String string = activityC17414x34d8ac5f.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ipe);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
            java.lang.Object[] objArr = new java.lang.Object[1];
            java.lang.String str = ov6Var.f464094e;
            if (str == null) {
                str = "";
            }
            objArr[0] = str;
            java.lang.String format = java.lang.String.format(string, java.util.Arrays.copyOf(objArr, 1));
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
            k0Var.r(format, 17, i65.a.b(activityC17414x34d8ac5f, 14), null);
            k0Var.f293405n = new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.y7(activityC17414x34d8ac5f);
            k0Var.f293414s = new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.z7(ov6Var, activityC17414x34d8ac5f);
            k0Var.v();
        }
    }
}

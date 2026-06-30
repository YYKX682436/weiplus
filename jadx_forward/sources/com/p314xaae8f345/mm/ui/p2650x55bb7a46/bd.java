package com.p314xaae8f345.mm.ui.p2650x55bb7a46;

/* loaded from: classes9.dex */
public class bd implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f280035d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f280036e;

    public bd(java.lang.String str, android.content.Context context) {
        this.f280035d = str;
        this.f280036e = context;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        java.lang.String str = ((java.lang.Object) menuItem.getTitle()) + "";
        java.lang.String str2 = this.f280035d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LongClickBrandServiceHelper", "connector click[location]: to[%s] content[%s]", str, str2);
        com.p314xaae8f345.mm.p2621x8fb0427b.y8 i18 = com.p314xaae8f345.mm.p2621x8fb0427b.y8.i(str2);
        if (w11.t1.a(str)) {
            w11.r1 a17 = w11.s1.a(str);
            a17.g(str);
            a17.e(str2);
            a17.h(com.p314xaae8f345.mm.p2621x8fb0427b.z3.m4(i18.f277891a) ? 66 : 42);
            a17.b();
        } else {
            w11.r1 a18 = w11.s1.a(str);
            a18.g(str);
            a18.e(str2);
            a18.h(com.p314xaae8f345.mm.p2621x8fb0427b.z3.m4(i18.f277891a) ? 66 : 42);
            a18.f523664f = 0;
            a18.f523667i = 4;
            a18.a().a();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        java.lang.Object[] objArr = new java.lang.Object[3];
        objArr[0] = java.lang.Integer.valueOf(com.p314xaae8f345.mm.p2621x8fb0427b.z3.m4(i18.f277891a) ? 66 : 42);
        objArr[1] = 32;
        objArr[2] = str;
        g0Var.d(10424, objArr);
        android.content.Context context = this.f280036e;
        db5.e1.T(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572081y7));
    }
}

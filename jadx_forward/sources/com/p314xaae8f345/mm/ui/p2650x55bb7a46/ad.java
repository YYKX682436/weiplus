package com.p314xaae8f345.mm.ui.p2650x55bb7a46;

/* loaded from: classes9.dex */
public class ad implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f279913d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f279914e;

    public ad(java.lang.String str, android.content.Context context) {
        this.f279913d = str;
        this.f279914e = context;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        java.lang.String str = ((java.lang.Object) menuItem.getTitle()) + "";
        java.lang.String str2 = this.f279913d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LongClickBrandServiceHelper", "connector click[location]: to[%s] content[%s]", str, str2);
        if (w11.t1.a(str)) {
            w11.r1 a17 = w11.s1.a(str);
            a17.g(str);
            a17.e(str2);
            a17.h(48);
            a17.b();
        } else {
            w11.r1 a18 = w11.s1.a(str);
            a18.g(str);
            a18.e(str2);
            a18.h(48);
            a18.f523664f = 0;
            a18.f523667i = 4;
            a18.a().a();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(10424, 48, 16, str);
        android.content.Context context = this.f279914e;
        db5.e1.T(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572081y7));
    }
}

package com.p314xaae8f345.mm.ui.p2650x55bb7a46;

/* loaded from: classes9.dex */
public class cd implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.f9 f280064d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f280065e;

    public cd(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, android.content.Context context) {
        this.f280064d = f9Var;
        this.f280065e = context;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        java.lang.String str = ((java.lang.Object) menuItem.getTitle()) + "";
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = this.f280064d;
        java.lang.String str2 = new com.p314xaae8f345.mm.p2621x8fb0427b.y4(f9Var.j()).f277889d;
        if (str2 == null || str2.endsWith("-1")) {
            str2 = f9Var.z0();
        }
        java.lang.String str3 = str2;
        if (str3 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.LongClickBrandServiceHelper", "showAcceptEmojiConnector: filePath is null");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LongClickBrandServiceHelper", "connector click[emoji]: to[%s] filePath[%s]", str, str3);
        s25.a wi6 = ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).wi();
        com.p314xaae8f345.mm.p1006xc5476f33.msg.C16564xb55e1d5 c16564xb55e1d5 = new com.p314xaae8f345.mm.p1006xc5476f33.msg.C16564xb55e1d5(f9Var.m124847x74d37ac6(), f9Var.Q0());
        android.content.Context context = this.f280065e;
        if (((y12.h) wi6).W(context, str, str3, c16564xb55e1d5, 0)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(10424, 47, 64, str);
            db5.e1.T(context, "");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(10424, 47, 64, str);
        db5.e1.T(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572081y7));
    }
}

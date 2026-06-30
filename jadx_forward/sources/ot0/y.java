package ot0;

/* loaded from: classes4.dex */
public final class y implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f430347a;

    public y(android.content.Context context) {
        this.f430347a = context;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var;
        km5.b b17 = km5.u.b();
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var2 = ot0.f0.f430005a;
        if ((u3Var2 != null && u3Var2.isShowing()) && (u3Var = ot0.f0.f430005a) != null) {
            u3Var.dismiss();
        }
        android.content.Context context = this.f430347a;
        ot0.f0.f430005a = db5.e1.Q(context, context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572137zq), true, true, new ot0.x(b17));
        ot0.f0.f430006b = true;
        return null;
    }
}

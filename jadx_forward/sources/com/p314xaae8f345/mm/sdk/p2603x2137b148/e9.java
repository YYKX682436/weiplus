package com.p314xaae8f345.mm.sdk.p2603x2137b148;

/* loaded from: classes7.dex */
public class e9 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f274191d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ m3.a f274192e;

    public e9(android.content.Context context, m3.a aVar) {
        this.f274191d = context;
        this.f274192e = aVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean b17 = fp.q.b(null);
        android.content.Context context = this.f274191d;
        if (!b17) {
            dp.a.m125853x26a183b(context, com.p314xaae8f345.mm.R.C30867xcad56011.f571924to, 1).show();
            return;
        }
        if ((context instanceof android.app.Activity) || ((context instanceof android.content.ContextWrapper) && (((android.content.ContextWrapper) context).getBaseContext() instanceof android.app.Activity))) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.d9 d9Var = com.p314xaae8f345.mm.sdk.p2603x2137b148.g9.f274253c;
            d9Var.f274077h = this.f274192e;
            d9Var.a(context);
        } else {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Business.Entry#showAlert error: the given context is not activty, context = ");
            sb6.append(context == null ? "null" : context.getClass());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeChatBrands", sb6.toString());
        }
    }
}

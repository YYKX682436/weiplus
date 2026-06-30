package com.tencent.mm.plugin.appbrand;

/* loaded from: classes7.dex */
public class df extends fl1.b {
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.o6 X;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public df(android.content.Context context, final com.tencent.mm.plugin.appbrand.o6 o6Var) {
        super(context);
        this.X = o6Var;
        setCanceledOnTouchOutside(false);
        setCancelable(false);
        t(com.tencent.mm.sdk.platformtools.x2.g(o6Var.r2() ? com.tencent.mm.R.string.f490617a03 : com.tencent.mm.R.string.f490616a02));
        z(com.tencent.mm.R.string.f490615a01, new android.content.DialogInterface.OnClickListener() { // from class: com.tencent.mm.plugin.appbrand.df$$a
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
                com.tencent.mm.plugin.appbrand.o6 o6Var2 = com.tencent.mm.plugin.appbrand.o6.this;
                wg1.b bVar = wg1.b.f445711d;
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.RuntimeRestartHelper", "restartAppImplOnLaunchRequestedLatestVersion appId:%s", o6Var2.f74803n);
                new com.tencent.mm.plugin.appbrand.ye$$a(o6Var2, bVar).run();
            }
        });
    }
}

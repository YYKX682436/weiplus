package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06;

/* loaded from: classes7.dex */
public class df extends fl1.b {
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 X;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public df(android.content.Context context, final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var) {
        super(context);
        this.X = o6Var;
        setCanceledOnTouchOutside(false);
        setCancelable(false);
        t(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.g(o6Var.r2() ? com.p314xaae8f345.mm.R.C30867xcad56011.f572150a03 : com.p314xaae8f345.mm.R.C30867xcad56011.f572149a02));
        z(com.p314xaae8f345.mm.R.C30867xcad56011.f572148a01, new android.content.DialogInterface.OnClickListener() { // from class: com.tencent.mm.plugin.appbrand.df$$a
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6.this;
                wg1.b bVar = wg1.b.f527244d;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.RuntimeRestartHelper", "restartAppImplOnLaunchRequestedLatestVersion appId:%s", o6Var2.f156336n);
                new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.RunnableC12821x6d79155(o6Var2, bVar).run();
            }
        });
    }
}

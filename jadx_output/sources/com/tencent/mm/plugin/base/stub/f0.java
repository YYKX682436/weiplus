package com.tencent.mm.plugin.base.stub;

/* loaded from: classes15.dex */
public class f0 extends android.content.BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.base.stub.WXCommProvider f93745a;

    public f0(com.tencent.mm.plugin.base.stub.WXCommProvider wXCommProvider) {
        this.f93745a = wXCommProvider;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        com.tencent.mm.pluginsdk.model.app.y5 y5Var;
        ((kt.e) ((lt.m0) i95.n0.c(lt.m0.class))).getClass();
        if (java.lang.System.currentTimeMillis() - com.tencent.mm.pluginsdk.model.app.y5.f189161i >= 600000) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppUtil", "hy: get comm model time expired");
            y5Var = null;
        } else {
            y5Var = com.tencent.mm.pluginsdk.model.app.y5.f189160h;
        }
        if (y5Var != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WXCommProvider", "hy: has wxcomm query request. start to continue requesting");
            android.database.Cursor b17 = this.f93745a.b(y5Var.f189162a, y5Var.f189163b, y5Var.f189164c, y5Var.f189165d, y5Var.f189166e, y5Var.f189167f, y5Var.f189168g);
            if (b17 != null) {
                b17.close();
            }
            com.tencent.mm.pluginsdk.model.app.y5.f189160h = null;
            com.tencent.mm.pluginsdk.model.app.y5.f189161i = -1L;
        }
    }
}

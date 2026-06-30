package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f;

/* loaded from: classes8.dex */
public class s0 implements android.webkit.ValueCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f221470a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f.x0 f221471b;

    public s0(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f.x0 x0Var, java.lang.Runnable runnable) {
        this.f221471b = x0Var;
        this.f221470a = runnable;
    }

    @Override // android.webkit.ValueCallback
    public void onReceiveValue(java.lang.Object obj) {
        java.lang.String str = (java.lang.String) obj;
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f.x0 x0Var = this.f221471b;
        try {
            x0Var.Z1 = (long) java.lang.Double.parseDouble(str);
        } catch (java.lang.NumberFormatException unused) {
            x0Var.Z1 = 0L;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameWebPage", "FCP_Content:%s, FCP_Value:%d", str, java.lang.Long.valueOf(x0Var.Z1));
        java.lang.Runnable runnable = this.f221470a;
        if (runnable != null) {
            runnable.run();
        }
    }
}

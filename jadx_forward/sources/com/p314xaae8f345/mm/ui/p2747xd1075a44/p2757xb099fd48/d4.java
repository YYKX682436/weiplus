package com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48;

/* loaded from: classes14.dex */
public class d4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 f293299d;

    public d4(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var) {
        this.f293299d = e4Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var = this.f293299d;
        try {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4 f4Var = e4Var.f293307a;
            if (f4Var == null || !f4Var.isShowing()) {
                return;
            }
            e4Var.f293307a.dismiss();
        } catch (java.lang.IllegalArgumentException e17) {
            com.p314xaae8f345.mm.ui.yk.b("MicroMsg.WeToast", "IllegalArgumentException %s", e17);
        } catch (java.lang.Exception e18) {
            com.p314xaae8f345.mm.ui.yk.b("MicroMsg.WeToast", "Exception %s", e18);
        }
    }
}

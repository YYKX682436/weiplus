package c55;

/* loaded from: classes12.dex */
public final class l extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.recovery.ui.RecoveryToolsUI f38742d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(com.tencent.mm.recovery.ui.RecoveryToolsUI recoveryToolsUI) {
        super(0);
        this.f38742d = recoveryToolsUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        c55.k kVar;
        com.tencent.mm.recovery.ui.RecoveryToolsUI recoveryToolsUI = this.f38742d;
        kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
        h0Var.f310123d = null;
        try {
            java.io.File a17 = p55.b.a((java.io.File) ((jz5.n) recoveryToolsUI.f192187d).getValue());
            h0Var.f310123d = a17;
            if (a17 != null) {
                fp.r.a(recoveryToolsUI, a17, "wechat-logs.zip", "application/zip");
            }
            recoveryToolsUI.runOnUiThread(new c55.i(recoveryToolsUI, h0Var));
            java.lang.Object obj = h0Var.f310123d;
            if (obj != null && ((java.io.File) obj).exists()) {
                ((java.io.File) h0Var.f310123d).delete();
            }
            kVar = new c55.k(recoveryToolsUI);
        } catch (java.lang.Throwable th6) {
            try {
                recoveryToolsUI.runOnUiThread(new c55.j(recoveryToolsUI, jz5.a.b(th6)));
                java.lang.Object obj2 = h0Var.f310123d;
                if (obj2 != null && ((java.io.File) obj2).exists()) {
                    ((java.io.File) h0Var.f310123d).delete();
                }
                kVar = new c55.k(recoveryToolsUI);
            } catch (java.lang.Throwable th7) {
                java.lang.Object obj3 = h0Var.f310123d;
                if (obj3 != null && ((java.io.File) obj3).exists()) {
                    ((java.io.File) h0Var.f310123d).delete();
                }
                recoveryToolsUI.runOnUiThread(new c55.k(recoveryToolsUI));
                throw th7;
            }
        }
        recoveryToolsUI.runOnUiThread(kVar);
        return jz5.f0.f302826a;
    }
}

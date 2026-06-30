package ju5;

/* loaded from: classes15.dex */
public class g0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ju5.j0 f383624d;

    public g0(ju5.j0 j0Var) {
        this.f383624d = j0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        byte[] a17;
        ju5.j0 j0Var = this.f383624d;
        ju5.k0 k0Var = j0Var.f383636c;
        java.security.Signature signature = j0Var.f383634a;
        if (zt5.l.b(k0Var.f383641e)) {
            zt5.h.b("Soter.TaskBiometricAuthentication", "soter: challenge is null. should not happen here", new java.lang.Object[0]);
            j0Var.mo95999x974d2211(-1000, "challenge is null");
            return;
        }
        int g17 = wt5.a.g();
        ju5.k0 k0Var2 = j0Var.f383636c;
        if (g17 != 1) {
            try {
                signature.update(k0Var2.f383641e.getBytes(java.nio.charset.Charset.forName(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c)));
            } catch (java.lang.Exception e17) {
                zt5.h.b("Soter.TaskBiometricAuthentication", "soter: exception in update", new java.lang.Object[0]);
                zt5.h.d("Soter.TaskBiometricAuthentication", e17, "soter: exception in update");
                zt5.i.b(200, "TaskBiometric, update signature failed: onAuthenticationSucceeded().", e17);
                zt5.h.b("Soter.TaskBiometricAuthentication", "soter: remove the auth key: %s", k0Var2.f383640d);
                wt5.a.s(k0Var2.f383640d, false);
                k0Var2.b(new eu5.a(1027, "update signature failed. authkey removed after this failure, please check"));
            }
            try {
                ju5.k0.h(k0Var2, signature);
                return;
            } catch (java.lang.Exception e18) {
                zt5.h.b("Soter.TaskBiometricAuthentication", "soter: exception in executeWhenAuthenticated method", new java.lang.Object[0]);
                zt5.h.d("Soter.TaskBiometricAuthentication", e18, "soter: exception when execute");
                j0Var.mo95999x974d2211(-1000, "execute failed");
                return;
            }
        }
        long j17 = j0Var.f383635b;
        k0Var2.getClass();
        try {
            au5.b bVar = wt5.a.f531070c;
            if (bVar == null) {
                zt5.h.b("Soter.SoterCore", "soter: finishSign IMPL is null, not support soter", new java.lang.Object[0]);
                a17 = new byte[0];
            } else {
                a17 = bVar.a(j17);
            }
            k0Var2.f383651o = wt5.a.a(a17);
            zt5.h.c("Soter.TaskBiometricAuthentication", "soter: no upload wrapper, return directly", new java.lang.Object[0]);
            k0Var2.b(new eu5.a(0, k0Var2.f383651o));
        } catch (java.lang.Exception e19) {
            zt5.h.b("Soter.TaskBiometricAuthentication", "soter: finish sign failed due to exception: %s", e19.getMessage());
            zt5.h.d("Soter.TaskBiometricAuthentication", e19, "soter: sign failed due to exception");
            zt5.i.b(200, "TaskBiometric, sign failed: executeWhenAuthenticatedWithSession().", e19);
            k0Var2.b(new eu5.a(1018, "sign failed even after user authenticated the key."));
        }
    }
}

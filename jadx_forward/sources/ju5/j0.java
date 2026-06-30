package ju5;

/* loaded from: classes15.dex */
public class j0 extends com.p314xaae8f345.p2939x688c445.p2940x2eaf9f.p2941xd278cb8.C25615x7788b3d7.AuthenticationCallback {

    /* renamed from: a, reason: collision with root package name */
    public final java.security.Signature f383634a;

    /* renamed from: b, reason: collision with root package name */
    public long f383635b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ju5.k0 f383636c;

    public j0(ju5.k0 k0Var, java.security.Signature signature, ju5.a0 a0Var) {
        this.f383636c = k0Var;
        this.f383634a = null;
        this.f383634a = signature;
    }

    public final void a() {
        ju5.k0 k0Var = this.f383636c;
        k0Var.getClass();
        if (k0Var.f383642f == 2) {
            k0Var.f383644h.a(false);
            k0Var.f383653q = true;
        }
    }

    @Override // com.p314xaae8f345.p2939x688c445.p2940x2eaf9f.p2941xd278cb8.C25615x7788b3d7.AuthenticationCallback
    /* renamed from: onAuthenticationCancelled */
    public void mo95998x11c74cda() {
        zt5.h.c("Soter.TaskBiometricAuthentication", "soter: called onAuthenticationCancelled", new java.lang.Object[0]);
        ju5.k0 k0Var = this.f383636c;
        if (k0Var.f383653q) {
            zt5.h.e("Soter.TaskBiometricAuthentication", "soter: during ignore cancel period", new java.lang.Object[0]);
            return;
        }
        ju5.o.a().b(new ju5.i0(this));
        k0Var.b(new eu5.a(com.p314xaae8f345.p2926x359365.C25483x77a9a59f.f46407x44d8fa6c, "user cancelled authentication"));
        a();
    }

    @Override // com.p314xaae8f345.p2939x688c445.p2940x2eaf9f.p2941xd278cb8.C25615x7788b3d7.AuthenticationCallback
    /* renamed from: onAuthenticationError */
    public void mo95999x974d2211(int i17, java.lang.CharSequence charSequence) {
        zt5.h.b("Soter.TaskBiometricAuthentication", "soter: on authentication fatal error: %d, %s", java.lang.Integer.valueOf(i17), charSequence);
        ju5.o.a().b(new ju5.d0(this, i17, charSequence));
        ju5.k0 k0Var = this.f383636c;
        if (i17 == 10308) {
            k0Var.b(new eu5.a(com.p314xaae8f345.p2926x359365.C25483x77a9a59f.f46404xa5f7fd74, charSequence != null ? charSequence.toString() : "unknown error"));
        } else if (i17 == 10309) {
            k0Var.b(new eu5.a(com.p314xaae8f345.p2926x359365.C25483x77a9a59f.f46404xa5f7fd74, charSequence != null ? charSequence.toString() : "unknown error"));
        } else if (i17 == 10310) {
            k0Var.b(new eu5.a(1029, charSequence != null ? charSequence.toString() : "unknown error"));
        } else {
            k0Var.b(new eu5.a(1017, charSequence != null ? charSequence.toString() : "unknown error"));
        }
        a();
        zt5.i.a(401, "on authentication fatal error: " + i17 + " " + ((java.lang.Object) charSequence));
    }

    @Override // com.p314xaae8f345.p2939x688c445.p2940x2eaf9f.p2941xd278cb8.C25615x7788b3d7.AuthenticationCallback
    /* renamed from: onAuthenticationFailed */
    public void mo96000x53184554() {
        zt5.h.f("Soter.TaskBiometricAuthentication", "soter: authentication failed once", new java.lang.Object[0]);
        ju5.o.a().b(new ju5.h0(this));
        ju5.k0 k0Var = this.f383636c;
        k0Var.getClass();
        if (k0Var.f383642f == 2) {
            zt5.h.c("Soter.TaskBiometricAuthentication", "soter: should compat faceid logic.", new java.lang.Object[0]);
            k0Var.b(new eu5.a(1017, "faceid not match"));
        }
    }

    @Override // com.p314xaae8f345.p2939x688c445.p2940x2eaf9f.p2941xd278cb8.C25615x7788b3d7.AuthenticationCallback
    /* renamed from: onAuthenticationHelp */
    public void mo96001xa1c9da18(int i17, java.lang.CharSequence charSequence) {
        zt5.h.f("Soter.TaskBiometricAuthentication", "soter: on authentication help. you do not need to cancel the authentication: %d, %s", java.lang.Integer.valueOf(i17), charSequence);
        ju5.o.a().b(new ju5.e0(this, i17, charSequence));
    }

    @Override // com.p314xaae8f345.p2939x688c445.p2940x2eaf9f.p2941xd278cb8.C25615x7788b3d7.AuthenticationCallback
    /* renamed from: onAuthenticationSucceeded */
    public void mo96002x2dbde5ea(com.p314xaae8f345.p2939x688c445.p2940x2eaf9f.p2941xd278cb8.C25615x7788b3d7.AuthenticationResult authenticationResult) {
        zt5.h.c("Soter.TaskBiometricAuthentication", "soter: authentication succeed. start sign and upload upload signature", new java.lang.Object[0]);
        ju5.o.a().b(new ju5.f0(this));
        ju5.o.a().c(new ju5.g0(this));
        a();
    }
}

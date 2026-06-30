package com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p210xb01aadaf;

/* renamed from: com.google.android.gms.common.moduleinstall.ModuleInstallRequest */
/* loaded from: classes13.dex */
public final class C1965x8179ea20 {
    private final java.util.List zaa;
    private final com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p210xb01aadaf.InterfaceC1960x7be1bd21 zab;
    private final java.util.concurrent.Executor zac;

    /* renamed from: com.google.android.gms.common.moduleinstall.ModuleInstallRequest$Builder */
    /* loaded from: classes13.dex */
    public static class Builder {
        private final java.util.List zaa = new java.util.ArrayList();
        private com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p210xb01aadaf.InterfaceC1960x7be1bd21 zab;
        private java.util.concurrent.Executor zac;

        /* renamed from: addApi */
        public com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p210xb01aadaf.C1965x8179ea20.Builder m18430xab35b9b9(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.InterfaceC1750x3d57946e interfaceC1750x3d57946e) {
            this.zaa.add(interfaceC1750x3d57946e);
            return this;
        }

        /* renamed from: build */
        public com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p210xb01aadaf.C1965x8179ea20 m18431x59bc66e() {
            return new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p210xb01aadaf.C1965x8179ea20(this.zaa, this.zab, this.zac, true, null);
        }

        /* renamed from: setListener */
        public com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p210xb01aadaf.C1965x8179ea20.Builder m18433xc6cf6336(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p210xb01aadaf.InterfaceC1960x7be1bd21 interfaceC1960x7be1bd21, java.util.concurrent.Executor executor) {
            this.zab = interfaceC1960x7be1bd21;
            this.zac = executor;
            return this;
        }

        /* renamed from: setListener */
        public com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p210xb01aadaf.C1965x8179ea20.Builder m18432xc6cf6336(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p210xb01aadaf.InterfaceC1960x7be1bd21 interfaceC1960x7be1bd21) {
            return m18433xc6cf6336(interfaceC1960x7be1bd21, null);
        }
    }

    public /* synthetic */ C1965x8179ea20(java.util.List list, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p210xb01aadaf.InterfaceC1960x7be1bd21 interfaceC1960x7be1bd21, java.util.concurrent.Executor executor, boolean z17, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p210xb01aadaf.zac zacVar) {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18215x7b41bcd2(list, "APIs must not be null.");
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18198x312c1fe5(!list.isEmpty(), "APIs must not be empty.");
        if (executor != null) {
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18215x7b41bcd2(interfaceC1960x7be1bd21, "Listener must not be null when listener executor is set.");
        }
        this.zaa = list;
        this.zab = interfaceC1960x7be1bd21;
        this.zac = executor;
    }

    /* renamed from: newBuilder */
    public static com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p210xb01aadaf.C1965x8179ea20.Builder m18426x3136c9db() {
        return new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p210xb01aadaf.C1965x8179ea20.Builder();
    }

    /* renamed from: getApis */
    public java.util.List<com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.InterfaceC1750x3d57946e> m18427xfb7d320f() {
        return this.zaa;
    }

    /* renamed from: getListener */
    public com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p210xb01aadaf.InterfaceC1960x7be1bd21 m18428xcc17022a() {
        return this.zab;
    }

    /* renamed from: getListenerExecutor */
    public java.util.concurrent.Executor m18429x1ecf951d() {
        return this.zac;
    }
}

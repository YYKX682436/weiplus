package com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd;

/* renamed from: com.google.android.gms.common.api.internal.TaskApiCall */
/* loaded from: classes13.dex */
public abstract class AbstractC1794xa4358633<A extends com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.Api.InterfaceC1732xc16b58b7, ResultT> {
    private final com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1702x28db12d6[] zaa;
    private final boolean zab;
    private final int zac;

    /* renamed from: com.google.android.gms.common.api.internal.TaskApiCall$Builder */
    /* loaded from: classes13.dex */
    public static class Builder<A extends com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.Api.InterfaceC1732xc16b58b7, ResultT> {
        private com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.InterfaceC1789xb4db2fe4 zaa;
        private com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1702x28db12d6[] zac;
        private boolean zab = true;
        private int zad = 0;

        private Builder() {
        }

        /* renamed from: build */
        public com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.AbstractC1794xa4358633<A, ResultT> m17949x59bc66e() {
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18198x312c1fe5(this.zaa != null, "execute parameter required");
            return new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1870x38edda(this, this.zac, this.zab, this.zad);
        }

        @java.lang.Deprecated
        /* renamed from: execute */
        public com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.AbstractC1794xa4358633.Builder<A, ResultT> m17950xb158f775(final com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p218x36f002.InterfaceC1989xad03997d<A, com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.C2440x4f4de6dc<ResultT>> interfaceC1989xad03997d) {
            this.zaa = new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.InterfaceC1789xb4db2fe4() { // from class: com.google.android.gms.common.api.internal.zacu
                @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.InterfaceC1789xb4db2fe4
                /* renamed from: accept */
                public final void mo17946xab27b508(java.lang.Object obj, java.lang.Object obj2) {
                    com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p218x36f002.InterfaceC1989xad03997d.this.m18531xab27b508((com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.Api.InterfaceC1732xc16b58b7) obj, (com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.C2440x4f4de6dc) obj2);
                }
            };
            return this;
        }

        public com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.AbstractC1794xa4358633.Builder<A, ResultT> run(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.InterfaceC1789xb4db2fe4<A, com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.C2440x4f4de6dc<ResultT>> interfaceC1789xb4db2fe4) {
            this.zaa = interfaceC1789xb4db2fe4;
            return this;
        }

        /* renamed from: setAutoResolveMissingFeatures */
        public com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.AbstractC1794xa4358633.Builder<A, ResultT> m17951x14c0f2c8(boolean z17) {
            this.zab = z17;
            return this;
        }

        /* renamed from: setFeatures */
        public com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.AbstractC1794xa4358633.Builder<A, ResultT> m17952x653f82bf(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1702x28db12d6... c1702x28db12d6Arr) {
            this.zac = c1702x28db12d6Arr;
            return this;
        }

        /* renamed from: setMethodKey */
        public com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.AbstractC1794xa4358633.Builder<A, ResultT> m17953x28d0cf7c(int i17) {
            this.zad = i17;
            return this;
        }

        public /* synthetic */ Builder(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1871x38eddb c1871x38eddb) {
        }
    }

    @java.lang.Deprecated
    public AbstractC1794xa4358633() {
        this.zaa = null;
        this.zab = false;
        this.zac = 0;
    }

    /* renamed from: builder */
    public static <A extends com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.Api.InterfaceC1732xc16b58b7, ResultT> com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.AbstractC1794xa4358633.Builder<A, ResultT> m17947xdc3ef9b() {
        return new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.AbstractC1794xa4358633.Builder<>(null);
    }

    /* renamed from: doExecute */
    public abstract void mo17346x9ef606a(A a17, com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.C2440x4f4de6dc<ResultT> c2440x4f4de6dc);

    /* renamed from: shouldAutoResolveMissingFeatures */
    public boolean m17948x5f2358d9() {
        return this.zab;
    }

    public final int zaa() {
        return this.zac;
    }

    public final com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1702x28db12d6[] zab() {
        return this.zaa;
    }

    public AbstractC1794xa4358633(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1702x28db12d6[] c1702x28db12d6Arr, boolean z17, int i17) {
        this.zaa = c1702x28db12d6Arr;
        boolean z18 = false;
        if (c1702x28db12d6Arr != null && z17) {
            z18 = true;
        }
        this.zab = z18;
        this.zac = i17;
    }
}

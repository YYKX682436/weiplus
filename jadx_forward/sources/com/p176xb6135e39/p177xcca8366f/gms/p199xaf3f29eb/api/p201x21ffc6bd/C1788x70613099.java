package com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd;

/* renamed from: com.google.android.gms.common.api.internal.RegistrationMethods */
/* loaded from: classes13.dex */
public class C1788x70613099<A extends com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.Api.InterfaceC1732xc16b58b7, L> {

    /* renamed from: register */
    public final com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.AbstractC1787x70ddf858<A, L> f5911xd6dc2ea3;
    public final com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.AbstractC1796xcf699631 zaa;
    public final java.lang.Runnable zab;

    /* renamed from: com.google.android.gms.common.api.internal.RegistrationMethods$Builder */
    /* loaded from: classes13.dex */
    public static class Builder<A extends com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.Api.InterfaceC1732xc16b58b7, L> {
        private com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.InterfaceC1789xb4db2fe4 zaa;
        private com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.InterfaceC1789xb4db2fe4 zab;
        private com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1781xefedf3a0 zad;
        private com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1702x28db12d6[] zae;
        private int zag;
        private java.lang.Runnable zac = com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.RunnableC1858x38edce.zaa;
        private boolean zaf = true;

        private Builder() {
        }

        /* renamed from: build */
        public com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1788x70613099<A, L> m17938x59bc66e() {
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18198x312c1fe5(this.zaa != null, "Must set register function");
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18198x312c1fe5(this.zab != null, "Must set unregister function");
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18198x312c1fe5(this.zad != null, "Must set holder");
            return new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1788x70613099<>(new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1859x38edcf(this, this.zad, this.zae, this.zaf, this.zag), new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1860x38edd0(this, (com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1781xefedf3a0.ListenerKey) com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18215x7b41bcd2(this.zad.m17922x2985fbd5(), "Key must not be null")), this.zac, null);
        }

        /* renamed from: onConnectionSuspended */
        public com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1788x70613099.Builder<A, L> m17939x4511603e(java.lang.Runnable runnable) {
            this.zac = runnable;
            return this;
        }

        /* renamed from: register */
        public com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1788x70613099.Builder<A, L> m17940xd6dc2ea3(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.InterfaceC1789xb4db2fe4<A, com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.C2440x4f4de6dc<java.lang.Void>> interfaceC1789xb4db2fe4) {
            this.zaa = interfaceC1789xb4db2fe4;
            return this;
        }

        /* renamed from: setAutoResolveMissingFeatures */
        public com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1788x70613099.Builder<A, L> m17941x14c0f2c8(boolean z17) {
            this.zaf = z17;
            return this;
        }

        /* renamed from: setFeatures */
        public com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1788x70613099.Builder<A, L> m17942x653f82bf(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1702x28db12d6... c1702x28db12d6Arr) {
            this.zae = c1702x28db12d6Arr;
            return this;
        }

        /* renamed from: setMethodKey */
        public com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1788x70613099.Builder<A, L> m17943x28d0cf7c(int i17) {
            this.zag = i17;
            return this;
        }

        /* renamed from: unregister */
        public com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1788x70613099.Builder<A, L> m17944x31d4943c(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.InterfaceC1789xb4db2fe4<A, com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.C2440x4f4de6dc<java.lang.Boolean>> interfaceC1789xb4db2fe4) {
            this.zab = interfaceC1789xb4db2fe4;
            return this;
        }

        /* renamed from: withHolder */
        public com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1788x70613099.Builder<A, L> m17945x6ef13e12(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1781xefedf3a0<L> c1781xefedf3a0) {
            this.zad = c1781xefedf3a0;
            return this;
        }

        public /* synthetic */ Builder(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1861x38edd1 c1861x38edd1) {
        }
    }

    public /* synthetic */ C1788x70613099(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.AbstractC1787x70ddf858 abstractC1787x70ddf858, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.AbstractC1796xcf699631 abstractC1796xcf699631, java.lang.Runnable runnable, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1862x38edd2 c1862x38edd2) {
        this.f5911xd6dc2ea3 = abstractC1787x70ddf858;
        this.zaa = abstractC1796xcf699631;
        this.zab = runnable;
    }

    /* renamed from: builder */
    public static <A extends com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.Api.InterfaceC1732xc16b58b7, L> com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1788x70613099.Builder<A, L> m17937xdc3ef9b() {
        return new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1788x70613099.Builder<>(null);
    }
}

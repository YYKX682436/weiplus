package com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd;

/* renamed from: com.google.android.gms.common.api.internal.RegisterListenerMethod */
/* loaded from: classes13.dex */
public abstract class AbstractC1787x70ddf858<A extends com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.Api.InterfaceC1732xc16b58b7, L> {
    private final com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1781xefedf3a0 zaa;
    private final com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1702x28db12d6[] zab;
    private final boolean zac;
    private final int zad;

    public AbstractC1787x70ddf858(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1781xefedf3a0<L> c1781xefedf3a0, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1702x28db12d6[] c1702x28db12d6Arr, boolean z17, int i17) {
        this.zaa = c1781xefedf3a0;
        this.zab = c1702x28db12d6Arr;
        this.zac = z17;
        this.zad = i17;
    }

    /* renamed from: clearListener */
    public void m17933x243c4221() {
        this.zaa.m17921x5a5b64d();
    }

    /* renamed from: getListenerKey */
    public com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1781xefedf3a0.ListenerKey<L> m17934x2985fbd5() {
        return this.zaa.m17922x2985fbd5();
    }

    /* renamed from: getRequiredFeatures */
    public com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1702x28db12d6[] m17935xf716cc72() {
        return this.zab;
    }

    /* renamed from: registerListener */
    public abstract void mo17936x42780477(A a17, com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.C2440x4f4de6dc<java.lang.Void> c2440x4f4de6dc);

    public final int zaa() {
        return this.zad;
    }

    public final boolean zab() {
        return this.zac;
    }

    public AbstractC1787x70ddf858(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1781xefedf3a0<L> c1781xefedf3a0) {
        this(c1781xefedf3a0, null, false, 0);
    }

    public AbstractC1787x70ddf858(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1781xefedf3a0<L> c1781xefedf3a0, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1702x28db12d6[] c1702x28db12d6Arr, boolean z17) {
        this(c1781xefedf3a0, c1702x28db12d6Arr, z17, 0);
    }
}

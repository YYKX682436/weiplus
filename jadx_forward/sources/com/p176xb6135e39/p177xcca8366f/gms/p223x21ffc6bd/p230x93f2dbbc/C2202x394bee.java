package com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.zzes */
/* loaded from: classes13.dex */
public final class C2202x394bee implements java.util.Iterator<java.lang.String> {

    /* renamed from: zzafz */
    private java.util.Iterator<java.lang.String> f6527x6f021b5;

    /* renamed from: zzaga */
    private final /* synthetic */ com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2201x394bed f6528x6f021bb;

    public C2202x394bee(com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2201x394bed c2201x394bed) {
        android.os.Bundle bundle;
        this.f6528x6f021bb = c2201x394bed;
        bundle = c2201x394bed.f6526x6f021b4;
        this.f6527x6f021b5 = bundle.keySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f6527x6f021b5.hasNext();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ java.lang.String next() {
        return this.f6527x6f021b5.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new java.lang.UnsupportedOperationException("Remove not supported");
    }
}

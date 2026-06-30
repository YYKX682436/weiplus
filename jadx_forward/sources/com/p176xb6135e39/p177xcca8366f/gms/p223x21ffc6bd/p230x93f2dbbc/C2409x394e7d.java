package com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc;

/* renamed from: com.google.android.gms.internal.measurement.zzzw */
/* loaded from: classes13.dex */
final class C2409x394e7d<K> implements java.util.Map.Entry<K, java.lang.Object> {

    /* renamed from: zzbsu */
    private java.util.Map.Entry<K, com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2407x394e7b> f7265x6f02704;

    private C2409x394e7d(java.util.Map.Entry<K, com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2407x394e7b> entry) {
        this.f7265x6f02704 = entry;
    }

    @Override // java.util.Map.Entry
    public final K getKey() {
        return this.f7265x6f02704.getKey();
    }

    @Override // java.util.Map.Entry
    public final java.lang.Object getValue() {
        if (this.f7265x6f02704.getValue() == null) {
            return null;
        }
        return com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2407x394e7b.m19414x394dbb();
    }

    @Override // java.util.Map.Entry
    public final java.lang.Object setValue(java.lang.Object obj) {
        if (obj instanceof com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.InterfaceC2129x6f0210c) {
            return this.f7265x6f02704.getValue().zzc((com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.InterfaceC2129x6f0210c) obj);
        }
        throw new java.lang.IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
    }
}

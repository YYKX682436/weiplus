package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public abstract class dn<R extends com.tencent.mapsdk.internal.cn.a> extends com.tencent.mapsdk.internal.dl<R> {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f49222d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f49223e;

    private void a(java.lang.String str) {
        this.f49222d = str;
    }

    private void b(java.lang.String str) {
        this.f49223e = str;
    }

    @Override // com.tencent.mapsdk.internal.cn
    public final java.lang.String f() {
        return this.f49222d;
    }

    @Override // com.tencent.mapsdk.internal.dl, com.tencent.mapsdk.internal.cn
    public final java.lang.String g() {
        return this.f49223e;
    }
}

package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public final class cs implements com.tencent.mapsdk.internal.cr {

    /* renamed from: a, reason: collision with root package name */
    public boolean f49158a;

    /* renamed from: b, reason: collision with root package name */
    public java.util.List<com.tencent.map.tools.net.http.HttpProxyRule> f49159b;

    private void a(boolean z17) {
        this.f49158a = z17;
    }

    @Override // com.tencent.mapsdk.internal.cr
    public final java.util.List<com.tencent.map.tools.net.http.HttpProxyRule> b() {
        return this.f49159b;
    }

    private void a(java.util.List<com.tencent.map.tools.net.http.HttpProxyRule> list) {
        this.f49159b = list;
    }

    private void a(com.tencent.mapsdk.internal.cq cqVar) {
        this.f49158a = cqVar.f49156a;
        this.f49159b = cqVar.f49157b;
    }

    @Override // com.tencent.mapsdk.internal.cr
    public final boolean a() {
        return this.f49158a;
    }
}

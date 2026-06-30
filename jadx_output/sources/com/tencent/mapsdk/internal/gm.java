package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public final class gm {

    /* renamed from: a, reason: collision with root package name */
    final com.tencent.mapsdk.internal.gl f49613a = new com.tencent.mapsdk.internal.gl();

    /* renamed from: b, reason: collision with root package name */
    private final com.tencent.mapsdk.internal.gl.b f49614b;

    public gm(com.tencent.mapsdk.internal.gl.b bVar) {
        this.f49614b = bVar;
    }

    private void a(com.tencent.mapsdk.internal.gl.a.EnumC0038a enumC0038a, int i17, java.lang.String str, int i18) {
        com.tencent.mapsdk.internal.gl.b bVar = new com.tencent.mapsdk.internal.gl.b(this.f49614b);
        bVar.f49600a = new com.tencent.mapsdk.internal.gl.a(enumC0038a, i17, str, i18);
        this.f49613a.a(bVar);
    }

    private java.util.Collection<? extends com.tencent.mapsdk.internal.gl.b> a() {
        return this.f49613a.f49592a;
    }
}

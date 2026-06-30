package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public final class tu implements com.tencent.mapsdk.internal.ol {

    /* renamed from: a, reason: collision with root package name */
    private com.tencent.mapsdk.internal.oq f52249a;

    /* renamed from: b, reason: collision with root package name */
    private com.tencent.mapsdk.internal.tz f52250b;

    /* renamed from: c, reason: collision with root package name */
    private com.tencent.mapsdk.internal.om f52251c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f52252d;

    public tu(com.tencent.mapsdk.internal.tr trVar, java.lang.String str) {
        this.f52250b = trVar;
        this.f52249a = new com.tencent.mapsdk.internal.tx(trVar.I(), str);
        this.f52251c = new com.tencent.mapsdk.internal.tv(trVar.I(), str);
    }

    @Override // com.tencent.mapsdk.internal.ol
    public final boolean a() {
        return this.f52252d;
    }

    @Override // com.tencent.mapsdk.internal.ol
    public final void b() {
        this.f52252d = true;
    }

    @Override // com.tencent.mapsdk.internal.ol
    public final com.tencent.mapsdk.internal.oq c() {
        return this.f52249a;
    }

    @Override // com.tencent.mapsdk.internal.ol
    public final com.tencent.mapsdk.internal.lu d() {
        return new com.tencent.mapsdk.internal.tt(this.f52250b);
    }

    @Override // com.tencent.mapsdk.internal.ol
    public final com.tencent.mapsdk.internal.om e() {
        return this.f52251c;
    }
}

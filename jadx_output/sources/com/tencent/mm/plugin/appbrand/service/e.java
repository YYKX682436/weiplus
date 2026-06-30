package com.tencent.mm.plugin.appbrand.service;

/* loaded from: classes7.dex */
public final class e extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader f88660d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f88661e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader iCommLibReader, boolean z17) {
        super(0);
        this.f88660d = iCommLibReader;
        this.f88661e = z17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader iCommLibReader = this.f88660d;
        return com.tencent.mm.plugin.appbrand.jsruntime.n0.a(context, iCommLibReader != null ? iCommLibReader.i() : 0, true, com.tencent.mm.plugin.appbrand.jsruntime.u1.a(), true, null, null, false, com.eclipsesource.mmv8.snapshot.CreateSnapshotResult.Success.INVALID_CONTEXT_INDEX, ((java.lang.Boolean) ha1.p.f279783c.e()).booleanValue(), !((java.lang.Boolean) ha1.n.f279781c.e()).booleanValue(), true, 10, this.f88661e, null, null);
    }
}

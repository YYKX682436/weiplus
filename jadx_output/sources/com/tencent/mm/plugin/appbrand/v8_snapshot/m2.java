package com.tencent.mm.plugin.appbrand.v8_snapshot;

/* loaded from: classes7.dex */
public final class m2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader f90783d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.v8_snapshot.WxaPkgV8SnapshotInfo f90784e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f90785f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.l f90786g;

    public m2(com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader iCommLibReader, com.tencent.mm.plugin.appbrand.v8_snapshot.WxaPkgV8SnapshotInfo wxaPkgV8SnapshotInfo, boolean z17, yz5.l lVar) {
        this.f90783d = iCommLibReader;
        this.f90784e = wxaPkgV8SnapshotInfo;
        this.f90785f = z17;
        this.f90786g = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f90786g.invoke(com.tencent.mm.plugin.appbrand.v8_snapshot.l2.f90769a.b(this.f90783d, this.f90784e, this.f90785f));
    }
}

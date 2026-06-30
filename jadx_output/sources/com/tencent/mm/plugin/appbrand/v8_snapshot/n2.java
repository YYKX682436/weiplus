package com.tencent.mm.plugin.appbrand.v8_snapshot;

/* loaded from: classes7.dex */
public final class n2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader f90790d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.v8_snapshot.WxaPkgV8SnapshotInfo f90791e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f90792f;

    public n2(com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader iCommLibReader, com.tencent.mm.plugin.appbrand.v8_snapshot.WxaPkgV8SnapshotInfo wxaPkgV8SnapshotInfo, yz5.l lVar) {
        this.f90790d = iCommLibReader;
        this.f90791e = wxaPkgV8SnapshotInfo;
        this.f90792f = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f90792f.invoke(com.tencent.mm.plugin.appbrand.v8_snapshot.l2.f90769a.a(this.f90790d, this.f90791e));
    }
}

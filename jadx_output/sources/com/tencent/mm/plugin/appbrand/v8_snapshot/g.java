package com.tencent.mm.plugin.appbrand.v8_snapshot;

/* loaded from: classes7.dex */
public final class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f90709d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.eclipsesource.mmv8.snapshot.CreateSnapshotResult f90710e;

    public g(yz5.l lVar, com.eclipsesource.mmv8.snapshot.CreateSnapshotResult createSnapshotResult) {
        this.f90709d = lVar;
        this.f90710e = createSnapshotResult;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f90709d.invoke(this.f90710e);
    }
}

package com.tencent.mm.plugin.appbrand.v8_snapshot;

/* loaded from: classes7.dex */
public final class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f90697d;

    public e(yz5.l lVar) {
        this.f90697d = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f90697d.invoke(new com.eclipsesource.mmv8.snapshot.CreateSnapshotResult.Failure(-202, "Serialize/Deserialize params failure"));
    }
}

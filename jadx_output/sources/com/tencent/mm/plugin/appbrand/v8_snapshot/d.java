package com.tencent.mm.plugin.appbrand.v8_snapshot;

/* loaded from: classes7.dex */
public final class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f90692d;

    public d(yz5.l lVar) {
        this.f90692d = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f90692d.invoke(new com.eclipsesource.mmv8.snapshot.CreateSnapshotResult.Failure(-202, "Serialize/Deserialize params failure"));
    }
}

package dz4;

/* loaded from: classes12.dex */
public final class e0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p3133xd0ce8b26.aff.p3166xd0d3a7c0.l f326757d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ dz4.j0 f326758e;

    public e0(com.p314xaae8f345.p3133xd0ce8b26.aff.p3166xd0d3a7c0.l lVar, dz4.j0 j0Var) {
        this.f326757d = lVar;
        this.f326758e = j0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onRecordingEndEvent: ");
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3166xd0d3a7c0.l lVar = this.f326757d;
        sb6.append(lVar.f299231e);
        sb6.append(", ");
        sb6.append(lVar.f299233g[1] ? lVar.f299230d : "");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FlutterWeNoteNativeHelperImpl", sb6.toString());
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3166xd0d3a7c0.i iVar = this.f326758e.f326843b;
        if (iVar != null) {
            iVar.e1(lVar);
        }
    }
}

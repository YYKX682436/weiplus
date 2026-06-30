package dz4;

/* loaded from: classes12.dex */
public final class y implements dz4.k0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f326993a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ dz4.j0 f326994b;

    public y(long j17, dz4.j0 j0Var) {
        this.f326993a = j17;
        this.f326994b = j0Var;
    }

    public void a(java.util.ArrayList arrayList) {
        boolean z17 = arrayList == null || arrayList.isEmpty();
        long j17 = this.f326993a;
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FlutterWeNoteNativeHelperImpl", "openFileSelectorAsync: model null, taskId: " + j17);
        } else {
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3166xd0d3a7c0.i iVar = this.f326994b.f326843b;
            if (iVar != null) {
                iVar.D1(j17, arrayList);
            }
        }
    }
}

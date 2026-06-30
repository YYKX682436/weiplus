package dz4;

/* loaded from: classes12.dex */
public final class i0 implements dz4.n0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f326835a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ dz4.j0 f326836b;

    public i0(long j17, dz4.j0 j0Var) {
        this.f326835a = j17;
        this.f326836b = j0Var;
    }

    @Override // dz4.n0
    public void a(java.util.ArrayList arrayList) {
        boolean z17 = arrayList == null || arrayList.isEmpty();
        long j17 = this.f326835a;
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FlutterWeNoteNativeHelperImpl", "takePhotoAsync: model null, taskId: " + j17);
        } else {
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3166xd0d3a7c0.i iVar = this.f326836b.f326843b;
            if (iVar != null) {
                iVar.J0(j17, (com.p314xaae8f345.p3133xd0ce8b26.aff.p3143x95976a57.j) kz5.n0.X(arrayList));
            }
        }
    }
}

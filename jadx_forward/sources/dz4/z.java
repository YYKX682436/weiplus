package dz4;

/* loaded from: classes11.dex */
public final class z implements dz4.l0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f327005a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ dz4.j0 f327006b;

    public z(long j17, dz4.j0 j0Var) {
        this.f327005a = j17;
        this.f327006b = j0Var;
    }

    public void a(dz4.e eVar) {
        long j17 = this.f327005a;
        if (eVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FlutterWeNoteNativeHelperImpl", "openLocationSelectorAsync: model null, taskId: " + j17);
            return;
        }
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3143x95976a57.f fVar = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3143x95976a57.f();
        fVar.f298292d = (float) eVar.f326745e;
        boolean[] zArr = fVar.f298298m;
        zArr[1] = true;
        fVar.f298293e = (float) eVar.f326746f;
        zArr[2] = true;
        fVar.f298294f = (int) eVar.f326747g;
        zArr[3] = true;
        fVar.f298295g = eVar.f326748h;
        zArr[4] = true;
        fVar.f298296h = eVar.f326743c;
        zArr[5] = true;
        fVar.f298297i = eVar.f326749i;
        zArr[6] = true;
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3166xd0d3a7c0.i iVar = this.f327006b.f326843b;
        if (iVar != null) {
            iVar.U0(j17, fVar);
        }
    }
}

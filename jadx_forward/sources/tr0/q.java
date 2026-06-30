package tr0;

/* loaded from: classes14.dex */
public final class q implements android.hardware.Camera.PictureCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ tr0.t f502874a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f502875b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f502876c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f502877d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f502878e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 f502879f;

    public q(tr0.t tVar, int i17, int i18, int i19, long j17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        this.f502874a = tVar;
        this.f502875b = i17;
        this.f502876c = i18;
        this.f502877d = i19;
        this.f502878e = j17;
        this.f502879f = interfaceC29045xdcb5ca57;
    }

    @Override // android.hardware.Camera.PictureCallback
    public final void onPictureTaken(byte[] bArr, android.hardware.Camera camera) {
        android.graphics.Bitmap G = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.G(bArr);
        int i17 = this.f502875b;
        int i18 = this.f502876c;
        int i19 = this.f502877d;
        tr0.t tVar = this.f502874a;
        android.graphics.Bitmap y17 = tVar.y(i17, i18, i19, G, !tVar.v());
        long currentTimeMillis = java.lang.System.currentTimeMillis() - this.f502878e;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Camera.Camera1Impl", "takePicture return >> " + currentTimeMillis);
        as0.a aVar = as0.a.f94958a;
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6358xa3635a0e a17 = aVar.a(tVar.f492963d);
        if (a17 != null) {
            a17.X = 1;
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6358xa3635a0e a18 = aVar.a(tVar.f492963d);
        if (a18 != null) {
            a18.f137105u = currentTimeMillis;
        }
        this.f502879f.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(y17));
    }
}

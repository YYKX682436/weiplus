package yt3;

/* loaded from: classes5.dex */
public final class r1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f547153d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f547154e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f547155f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f547156g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ yt3.b2 f547157h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ yz5.l f547158i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r1(android.graphics.Bitmap bitmap, java.lang.String str, long j17, yt3.b2 b2Var, yz5.l lVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f547154e = bitmap;
        this.f547155f = str;
        this.f547156g = j17;
        this.f547157h = b2Var;
        this.f547158i = lVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new yt3.r1(this.f547154e, this.f547155f, this.f547156g, this.f547157h, this.f547158i, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((yt3.r1) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f547153d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("photo width: ");
            android.graphics.Bitmap bitmap = this.f547154e;
            sb6.append(bitmap.getWidth());
            sb6.append("  height:");
            sb6.append(bitmap.getHeight());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EditPhotoPluginLayout", sb6.toString());
            android.graphics.Bitmap.CompressFormat compressFormat = android.graphics.Bitmap.CompressFormat.PNG;
            java.lang.String str = this.f547155f;
            com.p314xaae8f345.mm.sdk.p2603x2137b148.x.D0(bitmap, 100, compressFormat, str, true);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EditPhotoPluginLayout", "saveBitmapToImage  cost:" + (android.os.SystemClock.elapsedRealtime() - this.f547156g) + "  path:" + str);
            this.f547157h.f546900s = false;
            p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
            p3325xe03a0797.p3326xc267989b.g3 g3Var = p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a;
            yt3.q1 q1Var = new yt3.q1(str, this.f547158i, null);
            this.f547153d = 1;
            if (p3325xe03a0797.p3326xc267989b.l.g(g3Var, q1Var, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        return jz5.f0.f384359a;
    }
}

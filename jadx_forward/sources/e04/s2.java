package e04;

/* loaded from: classes12.dex */
public final class s2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f327620d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f327621e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f327622f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f327623g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f327624h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ e04.q2 f327625i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s2(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, e04.q2 q2Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f327621e = str;
        this.f327622f = str2;
        this.f327623g = str3;
        this.f327624h = i17;
        this.f327625i = q2Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new e04.s2(this.f327621e, this.f327622f, this.f327623g, this.f327624h, this.f327625i, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((e04.s2) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f327620d;
        java.lang.String uploadPath = this.f327621e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            com.p314xaae8f345.mm.vfs.r6 s17 = new com.p314xaae8f345.mm.vfs.r6(uploadPath).s();
            if (!(s17 != null && s17.m()) && s17 != null) {
                s17.J();
            }
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(uploadPath, "$uploadPath");
            this.f327620d = 1;
            oz5.n nVar = new oz5.n(pz5.f.b(this));
            android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
            options.inJustDecodeBounds = false;
            android.graphics.Bitmap J2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.J(this.f327622f, options);
            if (J2 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ScanImageUtils", "convertHevcToJpeg bitmap null");
                p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                nVar.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(java.lang.Boolean.FALSE));
            } else {
                try {
                    java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
                    J2.compress(android.graphics.Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
                    com.p314xaae8f345.mm.vfs.w6.R(uploadPath, byteArrayOutputStream.toByteArray());
                    p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                    nVar.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(java.lang.Boolean.TRUE));
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ScanImageUtils", e17, "convertHevcToJpeg exception", new java.lang.Object[0]);
                    p3321xbce91901.C29043x91b2b43d.Companion companion3 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                    nVar.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(java.lang.Boolean.FALSE));
                }
            }
            obj = nVar.a();
            pz5.a aVar2 = pz5.a.f440719d;
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanTranslationCdnService", "addUploadTask convertHevcToJpeg success: %s, exist: %s, uploadPath: %s", java.lang.Boolean.valueOf(booleanValue), java.lang.Boolean.valueOf(com.p314xaae8f345.mm.vfs.w6.j(uploadPath)), uploadPath);
        java.lang.String str = this.f327623g;
        e04.q2 q2Var = this.f327625i;
        if (booleanValue) {
            e04.t2.f327639a.b(str, uploadPath, this.f327624h, q2Var);
        } else {
            e04.r2 r2Var = new e04.r2();
            r2Var.f327612a = 1;
            q2Var.a(str, r2Var);
        }
        return jz5.f0.f384359a;
    }
}

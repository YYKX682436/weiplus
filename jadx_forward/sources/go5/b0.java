package go5;

/* loaded from: classes14.dex */
public final class b0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ go5.c0 f355651d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f355652e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f355653f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f355654g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f355655h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ go5.b f355656i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(go5.c0 c0Var, int i17, boolean z17, int i18, int i19, go5.b bVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f355651d = c0Var;
        this.f355652e = i17;
        this.f355653f = z17;
        this.f355654g = i18;
        this.f355655h = i19;
        this.f355656i = bVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new go5.b0(this.f355651d, this.f355652e, this.f355653f, this.f355654g, this.f355655h, this.f355656i, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        go5.b0 b0Var = (go5.b0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        b0Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        int i17 = this.f355652e;
        long j17 = i17;
        go5.c0 c0Var = this.f355651d;
        c0Var.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AudioPlayerImpl", "putModelMd5() called with: sampleRate = " + j17);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.s1 s1Var = com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.s1.f258331a;
        s1Var.c(sb6, 112, j17 <= 16000 ? 3 : 4);
        if (sb6.length() > 0) {
            java.lang.String sb7 = sb6.toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(sb7, "toString(...)");
            byte[] m17 = r26.i0.m(sb7);
            com.p314xaae8f345.mm.p1006xc5476f33.p2354xcfa97743.p2355x6fbd6873.v0 v0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2354xcfa97743.p2355x6fbd6873.v0.f258820b;
            java.nio.ByteBuffer allocateDirect = java.nio.ByteBuffer.allocateDirect(m17.length);
            allocateDirect.put(m17);
            v0Var.D(951, allocateDirect, m17.length);
        }
        java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
        s1Var.c(sb8, 112, 13);
        if (sb8.length() > 0) {
            java.lang.String sb9 = sb8.toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(sb9, "toString(...)");
            byte[] m18 = r26.i0.m(sb9);
            com.p314xaae8f345.mm.p1006xc5476f33.p2354xcfa97743.p2355x6fbd6873.v0 v0Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p2354xcfa97743.p2355x6fbd6873.v0.f258820b;
            java.nio.ByteBuffer allocateDirect2 = java.nio.ByteBuffer.allocateDirect(m18.length);
            allocateDirect2.put(m18);
            v0Var2.D(970, allocateDirect2, m18.length);
        }
        if (j17 <= 16000) {
            java.lang.StringBuilder sb10 = new java.lang.StringBuilder();
            s1Var.c(sb10, 112, 7);
            if (sb10.length() > 0) {
                java.lang.String sb11 = sb10.toString();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(sb11, "toString(...)");
                byte[] m19 = r26.i0.m(sb11);
                com.p314xaae8f345.mm.p1006xc5476f33.p2354xcfa97743.p2355x6fbd6873.v0 v0Var3 = com.p314xaae8f345.mm.p1006xc5476f33.p2354xcfa97743.p2355x6fbd6873.v0.f258820b;
                java.nio.ByteBuffer allocateDirect3 = java.nio.ByteBuffer.allocateDirect(m19.length);
                allocateDirect3.put(m19);
                v0Var3.D(952, allocateDirect3, m19.length);
            }
        }
        c0Var.getClass();
        boolean bj6 = ((u14.t) ((wd0.l1) i95.n0.c(wd0.l1.class))).bj();
        int Di = ((u14.t) ((wd0.l1) i95.n0.c(wd0.l1.class))).Di();
        int Ni = ((u14.t) ((wd0.l1) i95.n0.c(wd0.l1.class))).Ni();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AudioPlayerImpl", "WaveHAid, flag:%s, type:%s, device:%s", java.lang.Boolean.valueOf(bj6), java.lang.Integer.valueOf(Di), java.lang.Integer.valueOf(Ni));
        if (bj6) {
            byte[] bArr = {(byte) (Di & 255), (byte) ((Di >> 8) & 255), (byte) ((Di >> 16) & 255), (byte) ((Di >> 24) & 255), (byte) (Ni & 255), (byte) ((Ni >> 8) & 255), (byte) ((Ni >> 16) & 255), (byte) ((Ni >> 24) & 255)};
            java.nio.ByteBuffer wrap = java.nio.ByteBuffer.wrap(bArr);
            com.p314xaae8f345.mm.p1006xc5476f33.p2354xcfa97743.p2355x6fbd6873.v0.f258820b.D(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.bio.p1070x2fd65d.j.f33899x366c91de, java.nio.ByteBuffer.allocateDirect(8).order(java.nio.ByteOrder.LITTLE_ENDIAN).put(bArr), 8);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AudioPlayerImpl", "WaveHAid, params:%d,%d,%d,%d,%d,%d,%d,%d, size:%d, buffer:%d,%d", java.lang.Byte.valueOf(bArr[0]), java.lang.Byte.valueOf(bArr[1]), java.lang.Byte.valueOf(bArr[2]), java.lang.Byte.valueOf(bArr[3]), java.lang.Byte.valueOf(bArr[4]), java.lang.Byte.valueOf(bArr[5]), java.lang.Byte.valueOf(bArr[6]), java.lang.Byte.valueOf(bArr[7]), 8, java.lang.Byte.valueOf(wrap.get()), java.lang.Byte.valueOf(wrap.get()));
        }
        java.lang.StringBuilder sb12 = new java.lang.StringBuilder("startPlay() called with: speakerOn = ");
        boolean z17 = this.f355653f;
        sb12.append(z17);
        sb12.append(", sampleRate = ");
        sb12.append(i17);
        sb12.append(", channels = ");
        int i18 = this.f355654g;
        sb12.append(i18);
        sb12.append(", frameDuration = ");
        int i19 = this.f355655h;
        sb12.append(i19);
        sb12.append(", audioDataGetter = ");
        go5.b bVar = this.f355656i;
        sb12.append(bVar);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AudioPlayerImpl", sb12.toString());
        com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.e eVar = new com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.e();
        eVar.c(i17, i18, i19, 0);
        eVar.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, z17);
        eVar.f257987q = new go5.a0(c0Var, bVar);
        c0Var.f355657a = eVar;
        eVar.R = c0Var.f355659c;
        eVar.d();
        return jz5.f0.f384359a;
    }
}

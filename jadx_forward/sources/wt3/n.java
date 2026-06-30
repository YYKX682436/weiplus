package wt3;

/* loaded from: classes5.dex */
public final class n extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f530978d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ wt3.q f530979e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f530980f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f530981g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f530982h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f530983i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(wt3.q qVar, android.graphics.Bitmap bitmap, int i17, int i18, long j17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f530979e = qVar;
        this.f530980f = bitmap;
        this.f530981g = i17;
        this.f530982h = i18;
        this.f530983i = j17;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new wt3.n(this.f530979e, this.f530980f, this.f530981g, this.f530982h, this.f530983i, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((wt3.n) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.C4093x6b88526b.MaasEC maasEC;
        android.graphics.Bitmap bitmap = this.f530980f;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f530978d;
        wt3.q qVar = this.f530979e;
        boolean z17 = true;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AudioMaasClassifier", "feedVideoFrame " + java.lang.Thread.currentThread().getName());
            this.f530978d = 1;
            obj = qVar.f(this);
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
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (!booleanValue) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AudioMaasClassifier", "feedVideoFrame but init is error");
            return f0Var;
        }
        p3325xe03a0797.p3326xc267989b.r2 r2Var = qVar.f531009e;
        if (!(r2Var != null && ((p3325xe03a0797.p3326xc267989b.a) r2Var).a()) && qVar.f531005a != null) {
            z17 = false;
        }
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AudioMaasClassifier", "feedVideoFrame but is release");
            return f0Var;
        }
        try {
            java.nio.ByteBuffer allocate = java.nio.ByteBuffer.allocate(bitmap.getByteCount());
            bitmap.copyPixelsToBuffer(allocate);
            byte[] array = allocate.array();
            int length = array.length / 4;
            int i18 = length * 3;
            byte[] bArr = new byte[i18];
            kz5.x0 it = e06.p.m(0, length).iterator();
            while (((e06.j) it).f327747f) {
                int b17 = it.b();
                int i19 = b17 * 3;
                int i27 = b17 * 4;
                bArr[i19] = array[i27];
                bArr[i19 + 1] = array[i27 + 1];
                bArr[i19 + 2] = array[i27 + 2];
            }
            java.nio.ByteBuffer allocateDirect = java.nio.ByteBuffer.allocateDirect(i18);
            allocateDirect.put(bArr);
            com.p314xaae8f345.p457x3304c6.p483x6a710b1.C4203x74688d9f c4203x74688d9f = qVar.f531005a;
            java.lang.Integer num = null;
            com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.C4093x6b88526b c17 = c4203x74688d9f != null ? c4203x74688d9f.c(allocateDirect, this.f530981g, this.f530982h, com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a.m33967x6fa736dc(this.f530983i)) : null;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append("feedVideoFrame >> ");
            if (c17 != null && (maasEC = c17.f129708ec) != null) {
                num = new java.lang.Integer(maasEC.m33752x130a215f());
            }
            sb6.append(num);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AudioMaasClassifier", sb6.toString());
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AudioMaasClassifier", "feedVideoFrame error " + e17.getMessage());
        }
        return f0Var;
    }
}

package wt3;

/* loaded from: classes5.dex */
public final class l extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f530967d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ wt3.q f530968e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f530969f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(wt3.q qVar, java.lang.String str, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f530968e = qVar;
        this.f530969f = str;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new wt3.l(this.f530968e, this.f530969f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((wt3.l) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.nio.ByteBuffer byteBuffer;
        jz5.f0 f0Var;
        com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.C4093x6b88526b.MaasEC maasEC;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f530967d;
        wt3.q qVar = this.f530968e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AudioMaasClassifier", "classifierResult " + java.lang.Thread.currentThread().getName());
            this.f530967d = 1;
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
        if (!((java.lang.Boolean) obj).booleanValue()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AudioMaasClassifier", "classifierResult but is init error");
            return null;
        }
        p3325xe03a0797.p3326xc267989b.r2 r2Var = qVar.f531009e;
        if ((r2Var != null && ((p3325xe03a0797.p3326xc267989b.a) r2Var).a()) || qVar.f531005a == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AudioMaasClassifier", "classifierResult but is release");
            return null;
        }
        java.lang.String str = this.f530969f;
        java.lang.String i18 = com.p314xaae8f345.mm.vfs.w6.i(str, true);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AudioMaasClassifier", "classifierResult >> " + str + ", " + i18);
        if (i18 != null) {
            try {
                byteBuffer = com.p314xaae8f345.p457x3304c6.p483x6a710b1.C4201xab88f943.a(new java.io.File(i18), 2, 1, 16000, com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4129xdee64553.m33997xe9d83e0e(0.0d, 3.0d));
            } catch (java.lang.IllegalArgumentException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AudioMaasClassifier", "get pcm data is error " + e17.getMessage());
                byteBuffer = null;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AudioMaasClassifier", "get audioBuffer finish");
            if (byteBuffer != null) {
                com.p314xaae8f345.p457x3304c6.p483x6a710b1.C4203x74688d9f c4203x74688d9f = qVar.f531005a;
                com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.C4093x6b88526b b17 = c4203x74688d9f != null ? c4203x74688d9f.b(byteBuffer) : null;
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("feed audio frame >> ");
                sb6.append((b17 == null || (maasEC = b17.f129708ec) == null) ? null : new java.lang.Integer(maasEC.m33752x130a215f()));
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AudioMaasClassifier", sb6.toString());
                f0Var = jz5.f0.f384359a;
            } else {
                f0Var = null;
            }
            if (f0Var == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AudioMaasClassifier", "get pcm data is null");
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AudioMaasClassifier", "start calculateClassifyResult");
        com.p314xaae8f345.p457x3304c6.p483x6a710b1.C4203x74688d9f c4203x74688d9f2 = qVar.f531005a;
        com.p314xaae8f345.p457x3304c6.p483x6a710b1.C4204xc1bc4e9c a17 = c4203x74688d9f2 != null ? c4203x74688d9f2.a() : null;
        if (a17 != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AudioMaasClassifier", "get data success");
            return wt3.q.f531003g.a(a17, qVar.d());
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AudioMaasClassifier", "get result error");
        return null;
    }
}

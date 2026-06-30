package tz2;

/* loaded from: classes14.dex */
public final class n extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f504840d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f504841e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ tz2.q f504842f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(java.lang.String str, tz2.q qVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f504841e = str;
        this.f504842f = qVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new tz2.n(this.f504841e, this.f504842f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((tz2.n) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f504840d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            java.lang.String it = this.f504841e;
            long k17 = com.p314xaae8f345.mm.vfs.w6.k(it);
            tz2.q qVar = this.f504842f;
            if (k17 <= qVar.f504857h) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(it, "$it");
                this.f504840d = 1;
                if (tz2.q.b(qVar, it, this) == aVar) {
                    return aVar;
                }
            } else {
                tz2.q.a(qVar);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FaceFlashRecordManagerForPay", "file size too big, cancel upload");
                qVar.c("", "");
                h72.s.e().d();
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

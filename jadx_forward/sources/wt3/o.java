package wt3;

/* loaded from: classes5.dex */
public final class o extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f530992d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ wt3.q f530993e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(wt3.q qVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f530993e = qVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new wt3.o(this.f530993e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((wt3.o) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.C4093x6b88526b.MaasEC maasEC;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f530992d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            pp0.n0 n0Var = (pp0.n0) i95.n0.c(pp0.n0.class);
            this.f530992d = 1;
            ((yy0.q7) n0Var).getClass();
            obj = az0.l2.f97189a.a(this);
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AudioMaasClassifier", "load maas so error");
            return f0Var;
        }
        wt3.q qVar = this.f530993e;
        if (qVar.f531005a == null) {
            com.p314xaae8f345.p457x3304c6.p483x6a710b1.C4203x74688d9f c4203x74688d9f = new com.p314xaae8f345.p457x3304c6.p483x6a710b1.C4203x74688d9f();
            qVar.f531005a = c4203x74688d9f;
            com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.C4093x6b88526b d17 = c4203x74688d9f.d(qVar.c());
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("init result >> ");
            sb6.append(java.lang.Thread.currentThread().getName());
            sb6.append(", ");
            com.p314xaae8f345.p457x3304c6.p483x6a710b1.C4203x74688d9f c4203x74688d9f2 = qVar.f531005a;
            sb6.append(c4203x74688d9f2 != null ? c4203x74688d9f2.hashCode() : 0);
            sb6.append(", ");
            sb6.append((d17 == null || (maasEC = d17.f129708ec) == null) ? null : new java.lang.Integer(maasEC.m33752x130a215f()));
            sb6.append(", ");
            sb6.append(d17 != null ? d17.f16057x38eb0007 : null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AudioMaasClassifier", sb6.toString());
        }
        return f0Var;
    }
}

package wt3;

/* loaded from: classes5.dex */
public final class m extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f530970d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ wt3.q f530971e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(wt3.q qVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f530971e = qVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new wt3.m(this.f530971e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((wt3.m) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f530970d;
        wt3.q qVar = this.f530971e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            p3325xe03a0797.p3326xc267989b.r2 r2Var = qVar.f531008d;
            if (r2Var != null) {
                p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
            }
            qVar.f531008d = null;
            p3325xe03a0797.p3326xc267989b.f1 f1Var = qVar.f531010f;
            if (f1Var != null) {
                this.f530970d = 1;
                if (p3325xe03a0797.p3326xc267989b.v2.d(f1Var, this) == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        qVar.f531010f = null;
        if (qVar.f531005a != null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("destroy ");
            sb6.append(java.lang.Thread.currentThread().getName());
            sb6.append(' ');
            com.p314xaae8f345.p457x3304c6.p483x6a710b1.C4203x74688d9f c4203x74688d9f = qVar.f531005a;
            sb6.append(c4203x74688d9f != null ? c4203x74688d9f.hashCode() : 0);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AudioMaasClassifier", sb6.toString());
            com.p314xaae8f345.p457x3304c6.p483x6a710b1.C4203x74688d9f c4203x74688d9f2 = qVar.f531005a;
            if (c4203x74688d9f2 != null && c4203x74688d9f2.e()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AudioMaasClassifier", "release resource");
                com.p314xaae8f345.p457x3304c6.p483x6a710b1.C4203x74688d9f c4203x74688d9f3 = qVar.f531005a;
                if (c4203x74688d9f3 != null) {
                    c4203x74688d9f3.f();
                }
            }
            qVar.f531005a = null;
        }
        return jz5.f0.f384359a;
    }
}

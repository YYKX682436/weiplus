package e21;

/* loaded from: classes11.dex */
public final class m0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f328083d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ xg3.q0 f328084e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f328085f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f328086g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(xg3.q0 q0Var, java.lang.String str, long j17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f328084e = q0Var;
        this.f328085f = str;
        this.f328086g = j17;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new e21.m0(this.f328084e, this.f328085f, this.f328086g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((e21.m0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f328083d;
        try {
            if (i17 == 0) {
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                java.lang.String recordContent = this.f328085f;
                xg3.q0 q0Var = this.f328084e;
                if (q0Var != null) {
                    q0Var.f535957c = this.f328086g;
                    e21.r j17 = e21.z0.f328138d.j();
                    if (j17 != null && j17.s0(q0Var)) {
                        e21.e0 e0Var = e21.z0.f328139e;
                        e0Var.getClass();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recordContent, "recordContent");
                        ((ku5.t0) ku5.t0.f394148d).r(new e21.z(e0Var, q0Var, recordContent), "oplog_reporter_serial_tag");
                    } else {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.OplogServiceKt", "dealWith option insert failed! stack=" + recordContent);
                    }
                }
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("dealWith option ");
                sb6.append(q0Var != null ? e21.a1.a(q0Var) : null);
                sb6.append(", stack=");
                sb6.append(recordContent);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OplogServiceKt", sb6.toString());
                e21.z0 z0Var = e21.z0.f328138d;
                this.f328083d = 1;
                if (e21.z0.b(z0Var, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i17 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.OplogServiceKt", th6, "dealWith error", new java.lang.Object[0]);
        }
        return jz5.f0.f384359a;
    }
}

package on2;

/* loaded from: classes3.dex */
public final class e0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f428417d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ on2.v0 f428418e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f428419f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r45.cz1 f428420g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(on2.v0 v0Var, java.lang.String str, r45.cz1 cz1Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f428418e = v0Var;
        this.f428419f = str;
        this.f428420g = cz1Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new on2.e0(this.f428418e, this.f428419f, this.f428420g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((on2.e0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f428417d;
        on2.v0 v0Var = this.f428418e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            on2.l3 l3Var = on2.l3.f428499a;
            long j17 = v0Var.f428561J;
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = v0Var.m158354x19263085();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("claimByCustomize: ");
            java.lang.String str = this.f428419f;
            sb6.append(str);
            java.lang.String sb7 = sb6.toString();
            r45.p30 p30Var = new r45.p30();
            p30Var.set(3, str);
            r45.cz1 cz1Var = this.f428420g;
            this.f428417d = 1;
            obj = l3Var.h(j17, null, m158354x19263085, sb7, p30Var, cz1Var, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        r45.yy1 yy1Var = (r45.yy1) obj;
        if (yy1Var != null) {
            pm0.v.X(new on2.d0(v0Var, yy1Var));
        }
        return jz5.f0.f384359a;
    }
}

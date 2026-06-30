package qn2;

/* loaded from: classes3.dex */
public final class t0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f446686d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qn2.v0 f446687e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f446688f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r45.cz1 f446689g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(qn2.v0 v0Var, java.lang.String str, r45.cz1 cz1Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f446687e = v0Var;
        this.f446688f = str;
        this.f446689g = cz1Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new qn2.t0(this.f446687e, this.f446688f, this.f446689g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((qn2.t0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f446686d;
        qn2.v0 v0Var = this.f446687e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            on2.l3 l3Var = on2.l3.f428499a;
            long j17 = ((mm2.e1) v0Var.f446709a.S0().a(mm2.e1.class)).f410516m;
            byte[] bArr = ((mm2.e1) v0Var.f446709a.S0().a(mm2.e1.class)).f410518o;
            android.content.Context context = v0Var.f446710b.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("claimByCustomize: ");
            java.lang.String str = this.f446688f;
            sb6.append(str);
            java.lang.String sb7 = sb6.toString();
            r45.p30 p30Var = new r45.p30();
            p30Var.set(3, str);
            r45.cz1 cz1Var = this.f446689g;
            this.f446686d = 1;
            obj = l3Var.h(j17, bArr, context, sb7, p30Var, cz1Var, this);
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
            pm0.v.X(new qn2.s0(v0Var, yy1Var));
        }
        return jz5.f0.f384359a;
    }
}

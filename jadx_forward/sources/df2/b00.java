package df2;

/* loaded from: classes3.dex */
public final class b00 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f311298d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.b35 f311299e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ df2.m00 f311300f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b00(r45.b35 b35Var, df2.m00 m00Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f311299e = b35Var;
        this.f311300f = m00Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new df2.b00(this.f311299e, this.f311300f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((df2.b00) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.lang.String str;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f311298d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            boolean a17 = ae2.in.f85221a.a(ym5.f6.I1);
            df2.m00 m00Var = this.f311300f;
            r45.b35 b35Var = this.f311299e;
            if (a17) {
                rj.j a18 = nn2.d.f420204a.a();
                java.lang.String m75945x2fec8307 = b35Var.m75945x2fec8307(0);
                str = m75945x2fec8307 != null ? m75945x2fec8307 : "";
                java.lang.String str2 = m00Var.f312273m;
                this.f311298d = 1;
                obj = ((b51.m) a18).j(str, str2, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                rj.j a19 = nn2.d.f420204a.a();
                java.lang.String m75945x2fec83072 = b35Var.m75945x2fec8307(0);
                str = m75945x2fec83072 != null ? m75945x2fec83072 : "";
                java.lang.String str3 = m00Var.f312273m;
                this.f311298d = 2;
                obj = ((b51.m) a19).h(str, str3, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i17 != 1 && i17 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        return obj;
    }
}

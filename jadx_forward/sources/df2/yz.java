package df2;

/* loaded from: classes3.dex */
public final class yz extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f313441d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.xb2 f313442e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ df2.a00 f313443f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yz(r45.xb2 xb2Var, df2.a00 a00Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f313442e = xb2Var;
        this.f313443f = a00Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new df2.yz(this.f313442e, this.f313443f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((df2.yz) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.lang.String str;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f313441d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            rj.j a17 = nn2.d.f420204a.a();
            r45.bb7 bb7Var = (r45.bb7) this.f313442e.m75936x14adae67(0);
            if (bb7Var == null || (str = bb7Var.m75945x2fec8307(0)) == null) {
                str = "";
            }
            java.lang.String str2 = this.f313443f.f311181m;
            this.f313441d = 1;
            obj = ((b51.m) a17).j(str, str2, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        return obj;
    }
}

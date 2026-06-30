package df2;

/* loaded from: classes3.dex */
public final class po extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f312636d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ xg2.h f312637e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ df2.to f312638f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public po(xg2.h hVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57, df2.to toVar) {
        super(2, interfaceC29045xdcb5ca57);
        this.f312637e = hVar;
        this.f312638f = toVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new df2.po(this.f312637e, interfaceC29045xdcb5ca57, this.f312638f);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((df2.po) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.util.LinkedList m75941xfb821914;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f312636d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            r45.v71 v71Var = (r45.v71) ((xg2.i) this.f312637e).f535926b;
            df2.to toVar = this.f312638f;
            java.lang.String str = toVar.f312993m;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getLiveNotice: cgi success， noticeSize=");
            r45.j32 j32Var = (r45.j32) v71Var.m75936x14adae67(4);
            sb6.append((j32Var == null || (m75941xfb821914 = j32Var.m75941xfb821914(0)) == null) ? null : new java.lang.Integer(m75941xfb821914.size()));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
            p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
            p3325xe03a0797.p3326xc267989b.g3 g3Var = p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a;
            df2.no noVar = new df2.no(toVar, v71Var, null);
            this.f312636d = 1;
            if (p3325xe03a0797.p3326xc267989b.l.g(g3Var, noVar, this) == aVar) {
                return aVar;
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

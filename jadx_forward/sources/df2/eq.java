package df2;

/* loaded from: classes3.dex */
public final class eq extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f311610d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ df2.gq f311611e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f311612f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eq(df2.gq gqVar, yz5.l lVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f311611e = gqVar;
        this.f311612f = lVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new df2.eq(this.f311611e, this.f311612f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((df2.eq) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.et a76;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f311610d;
        df2.gq gqVar = this.f311611e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            this.f311610d = 1;
            if (df2.gq.Z6(gqVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        r45.fu1 fu1Var = gqVar.f311771n;
        if (fu1Var != null && (a76 = gqVar.a7()) != null) {
            java.util.LinkedList m75941xfb821914 = fu1Var.m75941xfb821914(1);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getItem_list(...)");
            a76.K = m75941xfb821914;
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.vs) ((jz5.n) a76.U).mo141623x754a37bb()).m8146xced61ae5();
            a76.k0();
        }
        yz5.l lVar = this.f311612f;
        if (lVar != null) {
            lVar.mo146xb9724478(gqVar.f311771n);
        }
        return jz5.f0.f384359a;
    }
}

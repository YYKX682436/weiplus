package ap1;

/* loaded from: classes5.dex */
public final class d0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f94167d;

    /* renamed from: e, reason: collision with root package name */
    public int f94168e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ap1.i0 f94169f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f94170g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(ap1.i0 i0Var, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f94169f = i0Var;
        this.f94170g = u3Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new ap1.d0(this.f94169f, this.f94170g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((ap1.d0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        j75.f fVar;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f94168e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            ap1.i0 i0Var = this.f94169f;
            j75.f U6 = i0Var.U6();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(U6);
            boolean z17 = ((ap1.c2) U6.mo140437x75286adb()).f94158f;
            i0Var.getClass();
            this.f94167d = U6;
            this.f94168e = 1;
            obj = i0Var.T6(this);
            if (obj == aVar) {
                return aVar;
            }
            fVar = U6;
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            fVar = (j75.f) this.f94167d;
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        fVar.B3(new ap1.a((java.util.List) obj, null, 2, null));
        pf5.e.m158344xbe96bc24(this.f94169f, null, null, new ap1.c0(this.f94170g, null), 3, null);
        return jz5.f0.f384359a;
    }
}

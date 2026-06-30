package hr5;

/* loaded from: classes15.dex */
public final class i0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f365891d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ hr5.a1 f365892e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ zq5.l f365893f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(hr5.a1 a1Var, zq5.l lVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f365892e = a1Var;
        this.f365893f = lVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new hr5.i0(this.f365892e, this.f365893f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((hr5.i0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        zq5.v a17;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f365891d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            hr5.a1 a1Var = this.f365892e;
            long j17 = a1Var.f365814e;
            zq5.g gVar = new zq5.g(j17);
            if (!zq5.h.c(j17)) {
                gVar = null;
            }
            if (gVar == null) {
                return java.lang.Boolean.FALSE;
            }
            long j18 = gVar.f556600a;
            long j19 = a1Var.f365815f;
            zq5.g gVar2 = zq5.h.c(j19) ? new zq5.g(j19) : null;
            if (gVar2 == null) {
                return java.lang.Boolean.FALSE;
            }
            long j27 = gVar2.f556600a;
            float c17 = a1Var.f365830u.c();
            zq5.v vVar = a1Var.f365828s;
            zq5.v vVar2 = a1Var.f365829t;
            long j28 = vVar2.f556629b;
            float b17 = zq5.q.b(vVar2.f556628a);
            zq5.n containsWithDelta = a1Var.F;
            float f17 = a1Var.f365831v;
            float f18 = a1Var.f365833x;
            float c18 = zq5.b.c(c17, new java.lang.Integer(2).intValue());
            boolean z17 = c18 >= zq5.b.c(f17, 2) && c18 <= zq5.b.c(f18, 2);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(containsWithDelta, "$this$containsWithDelta");
            boolean z18 = zq5.l.b(j28) - containsWithDelta.f556615a >= -1.0f && zq5.l.b(j28) - containsWithDelta.f556617c < 1.0f && zq5.l.c(j28) - containsWithDelta.f556616b >= -1.0f && zq5.l.c(j28) - containsWithDelta.f556618d < 1.0f;
            if (z17 && z18) {
                return java.lang.Boolean.FALSE;
            }
            zq5.l lVar = this.f365893f;
            long i18 = a1Var.i(lVar != null ? lVar.f556613a : zq5.u.b(zq5.h.g(j18)));
            float d17 = a1Var.d(e06.p.e(c17, f17, f18) / vVar.c(), false);
            a17 = vVar2.a((r20 & 1) != 0 ? vVar2.f556628a : zq5.s.a(d17, d17), (r20 & 2) != 0 ? vVar2.f556629b : a1Var.c(hr5.b1.e(vVar2.c(), vVar2.f556629b, d17, hr5.b1.g(j18, j27, a1Var.f365817h, a1Var.f365818i, a1Var.f365819j, 0, b17, j28, i18), zq5.l.f556610b, 0.0f), d17), (r20 & 4) != 0 ? vVar2.f556630c : 0.0f, (r20 & 8) != 0 ? vVar2.f556631d : 0L, (r20 & 16) != 0 ? vVar2.f556632e : 0L);
            a1Var.f365810a.a(new hr5.h0(a1Var, this.f365893f, c17, f17, f18, containsWithDelta, j28, vVar2, a17));
            hr5.a1 a1Var2 = this.f365892e;
            java.lang.Integer num = new java.lang.Integer(32);
            gr5.d dVar = a1Var.f365825p;
            this.f365891d = 1;
            if (hr5.a1.a(a1Var2, a17, num, dVar, "rollback", this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        return java.lang.Boolean.TRUE;
    }
}

package im2;

/* loaded from: classes3.dex */
public final class b6 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f373797d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f373798e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ im2.h6 f373799f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b6(im2.h6 h6Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f373799f = h6Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        im2.b6 b6Var = new im2.b6(this.f373799f, interfaceC29045xdcb5ca57);
        b6Var.f373798e = obj;
        return b6Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((im2.b6) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        p3325xe03a0797.p3326xc267989b.y0 y0Var;
        p3325xe03a0797.p3326xc267989b.y0 y0Var2;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f373797d;
        im2.h6 h6Var = this.f373799f;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            p3325xe03a0797.p3326xc267989b.y0 y0Var3 = (p3325xe03a0797.p3326xc267989b.y0) this.f373798e;
            java.lang.Integer num = h6Var.Y().f492193o;
            if (num == null || num.intValue() <= 0) {
                y0Var = y0Var3;
                p3325xe03a0797.p3326xc267989b.f1 b17 = p3325xe03a0797.p3326xc267989b.l.b(y0Var, null, null, new im2.a6(h6Var, null), 3, null);
                h6Var.getClass();
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.oo0.Z(h6Var, null, null, new im2.y5(b17, h6Var, null), 3, null);
                h6Var.getClass();
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.oo0.Z(h6Var, null, null, new im2.d6(b17, h6Var, null), 3, null);
                h6Var.getClass();
                p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
                p3325xe03a0797.p3326xc267989b.f1 L = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.oo0.L(h6Var, p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a, null, new im2.f6(b17, h6Var, null), 2, null);
                h6Var.getClass();
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.oo0.Z(h6Var, null, null, new im2.z5(b17, L, h6Var, null), 3, null);
                return jz5.f0.f384359a;
            }
            long intValue = num.intValue();
            this.f373798e = y0Var3;
            this.f373797d = 1;
            if (p3325xe03a0797.p3326xc267989b.k1.b(intValue, this) == aVar) {
                return aVar;
            }
            y0Var2 = y0Var3;
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            y0Var2 = (p3325xe03a0797.p3326xc267989b.y0) this.f373798e;
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        y0Var = y0Var2;
        p3325xe03a0797.p3326xc267989b.f1 b172 = p3325xe03a0797.p3326xc267989b.l.b(y0Var, null, null, new im2.a6(h6Var, null), 3, null);
        h6Var.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.oo0.Z(h6Var, null, null, new im2.y5(b172, h6Var, null), 3, null);
        h6Var.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.oo0.Z(h6Var, null, null, new im2.d6(b172, h6Var, null), 3, null);
        h6Var.getClass();
        p3325xe03a0797.p3326xc267989b.p0 p0Var2 = p3325xe03a0797.p3326xc267989b.q1.f392101a;
        p3325xe03a0797.p3326xc267989b.f1 L2 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.oo0.L(h6Var, p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a, null, new im2.f6(b172, h6Var, null), 2, null);
        h6Var.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.oo0.Z(h6Var, null, null, new im2.z5(b172, L2, h6Var, null), 3, null);
        return jz5.f0.f384359a;
    }
}

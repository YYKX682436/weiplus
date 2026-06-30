package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5;

/* loaded from: classes3.dex */
public final class jc extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f197957d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f197958e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.mc f197959f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jc(java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.mc mcVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f197958e = str;
        this.f197959f = mcVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.jc(this.f197958e, this.f197959f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.jc) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.lang.Object b17;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f197957d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            db2.b1 b1Var = new db2.b1(this.f197958e, null, null, 0, null, null, null, null, 0, null, null, 2046, null);
            this.f197957d = 1;
            b17 = rm0.h.b(b1Var, this);
            if (b17 == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            b17 = obj;
        }
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) b17;
        r45.h32 h32Var = (r45.h32) ((r45.v71) fVar.f152151d).m75936x14adae67(1);
        boolean b18 = fVar.b();
        jz5.f0 f0Var = jz5.f0.f384359a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.mc mcVar = this.f197959f;
        if (b18) {
            if (!(h32Var == null)) {
                if (zl2.t.e(h32Var)) {
                    mcVar.f198017b.a7();
                } else {
                    java.lang.String str = ((mm2.c1) mcVar.f198017b.m56788xbba4bfc0(mm2.c1.class)).f410385o;
                    android.content.Context context = mcVar.f198019d.getContext();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
                    tx2.i0 i0Var = new tx2.i0(context, zl2.u4.f555523f, 0, 4, null);
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.mc mcVar2 = this.f197959f;
                    java.lang.String str2 = this.f197958e;
                    i0Var.z(str, h32Var, null);
                    i0Var.A(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.ic(mcVar2, str, str2, h32Var, i0Var));
                    i0Var.w();
                }
                return f0Var;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(mcVar.f198018c, "get notice fail " + this.f197958e + ' ' + fVar.f152148a + ' ' + fVar.f152149b);
        return f0Var;
    }
}

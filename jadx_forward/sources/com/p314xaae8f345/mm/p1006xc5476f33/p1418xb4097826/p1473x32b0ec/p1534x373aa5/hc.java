package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5;

/* loaded from: classes3.dex */
public final class hc extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f197891d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f197892e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f197893f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.mc f197894g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ r45.h32 f197895h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ tx2.i0 f197896i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hc(java.lang.String str, java.lang.String str2, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.mc mcVar, r45.h32 h32Var, tx2.i0 i0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f197892e = str;
        this.f197893f = str2;
        this.f197894g = mcVar;
        this.f197895h = h32Var;
        this.f197896i = i0Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.hc(this.f197892e, this.f197893f, this.f197894g, this.f197895h, this.f197896i, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.hc) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f197891d;
        boolean z17 = true;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            com.p314xaae8f345.mm.p944x882e457a.i mj6 = ((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4) ((s40.w0) i95.n0.c(s40.w0.class))).mj(this.f197892e, this.f197893f, 1, null, 107);
            this.f197891d = 1;
            obj = rm0.h.b(mj6, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        boolean b17 = fVar.b();
        jz5.f0 f0Var = jz5.f0.f384359a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.mc mcVar = this.f197894g;
        if (b17) {
            r45.h32 h32Var = this.f197895h;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(h32Var, "<this>");
            h32Var.set(1, 0);
            tx2.i0 i0Var = this.f197896i;
            i0Var.z(this.f197892e, h32Var, null);
            i0Var.a();
            mcVar.f198017b.a7();
            return f0Var;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(mcVar.f198018c, "reserve notice fail " + this.f197893f + ' ' + fVar.f152148a + ' ' + fVar.f152149b);
        android.view.View view = mcVar.f198019d;
        android.content.Context context = view.getContext();
        java.lang.String str = fVar.f152150c;
        if (str != null && str.length() != 0) {
            z17 = false;
        }
        if (z17) {
            str = view.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.oss);
        }
        db5.t7.m(context, str);
        return f0Var;
    }
}

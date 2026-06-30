package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes.dex */
public final class d1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f199569d;

    /* renamed from: e, reason: collision with root package name */
    public int f199570e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.h1 f199571f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.h1 h1Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f199571f = h1Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.d1(this.f199571f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.d1) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.lang.Object g17;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var;
        r45.nw1 nw1Var;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f199570e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.h1 h1Var = this.f199571f;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            android.content.Context context = h1Var.getContext();
            android.content.Context context2 = h1Var.getContext();
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 c17 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3.c(context, context2 != null ? context2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f9y) : null, false, 0, null);
            c17.show();
            gk2.e m58045xd7793f26 = h1Var.m58045xd7793f26();
            byte[] bArr = m58045xd7793f26 != null ? ((mm2.e1) m58045xd7793f26.a(mm2.e1.class)).f410518o : null;
            gk2.e m58045xd7793f262 = h1Var.m58045xd7793f26();
            long m75942xfb822ef2 = (m58045xd7793f262 == null || (nw1Var = ((mm2.e1) m58045xd7793f262.a(mm2.e1.class)).f410521r) == null) ? 0L : nw1Var.m75942xfb822ef2(0);
            gk2.e m58045xd7793f263 = h1Var.m58045xd7793f26();
            long j17 = m58045xd7793f263 != null ? ((mm2.e1) m58045xd7793f263.a(mm2.e1.class)).f410516m : 0L;
            p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392103c;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.c1 c1Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.c1(this.f199571f, bArr, m75942xfb822ef2, j17, null);
            this.f199569d = c17;
            this.f199570e = 1;
            g17 = p3325xe03a0797.p3326xc267989b.l.g(p0Var, c1Var, this);
            if (g17 == aVar) {
                return aVar;
            }
            u3Var = c17;
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u3Var = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3) this.f199569d;
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            g17 = obj;
        }
        boolean booleanValue = ((java.lang.Boolean) g17).booleanValue();
        u3Var.hide();
        u3Var.dismiss();
        if (booleanValue) {
            h1Var.d();
            db5.t7.i(h1Var.getContext(), h1Var.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ddx), com.p314xaae8f345.mm.R.raw.f80084xebd378da);
            yz5.l m58046x48cff87d = h1Var.m58046x48cff87d();
            if (m58046x48cff87d != null) {
                m58046x48cff87d.mo146xb9724478(java.lang.Boolean.TRUE);
            }
        } else {
            db5.t7.g(h1Var.getContext(), h1Var.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ddu));
            yz5.l m58046x48cff87d2 = h1Var.m58046x48cff87d();
            if (m58046x48cff87d2 != null) {
                m58046x48cff87d2.mo146xb9724478(java.lang.Boolean.FALSE);
            }
        }
        return jz5.f0.f384359a;
    }
}

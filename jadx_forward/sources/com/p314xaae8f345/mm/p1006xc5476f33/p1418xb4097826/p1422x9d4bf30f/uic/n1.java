package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.uic;

/* loaded from: classes2.dex */
public final class n1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p944x882e457a.f f183444d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.uic.C13669xe2583a4f f183445e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.c0 f183446f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n1(com.p314xaae8f345.mm.p944x882e457a.f fVar, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.uic.C13669xe2583a4f c13669xe2583a4f, p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f183444d = fVar;
        this.f183445e = c13669xe2583a4f;
        this.f183446f = c0Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.uic.n1(this.f183444d, this.f183445e, this.f183446f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.uic.n1 n1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.uic.n1) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        n1Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        r45.r03 r03Var;
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        com.p314xaae8f345.mm.p944x882e457a.f fVar = this.f183444d;
        int i17 = fVar.f152148a;
        p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var = this.f183446f;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.uic.C13669xe2583a4f c13669xe2583a4f = this.f183445e;
        if (i17 == 0 && fVar.f152149b == 0) {
            r45.ma1 ma1Var = (r45.ma1) fVar.f152151d;
            if (ma1Var != null && (r03Var = (r45.r03) ma1Var.m75936x14adae67(1)) != null) {
                c13669xe2583a4f.f534244w = r03Var;
            }
            r45.r03 r03Var2 = (r45.r03) c13669xe2583a4f.f534244w;
            if (r03Var2 != null) {
                r45.cn5 cn5Var = (r45.cn5) ((r45.ma1) fVar.f152151d).m75936x14adae67(2);
                if (cn5Var != null) {
                    if (cn5Var.m75939xb282bd08(0) > 0) {
                        r03Var2.set(1, java.lang.Long.valueOf(cn5Var.m75942xfb822ef2(1)));
                        r03Var2.set(0, cn5Var.m75945x2fec8307(3));
                        r03Var2.set(4, java.lang.Integer.valueOf(cn5Var.m75939xb282bd08(4)));
                        r45.hj2 hj2Var = (r45.hj2) r03Var2.m75936x14adae67(19);
                        if (hj2Var != null) {
                            hj2Var.set(14, 1);
                        }
                        if (cn5Var.m75942xfb822ef2(1) != 0) {
                            c13669xe2583a4f.m158359x1e885992().putExtra("key_activity_id", cn5Var.m75942xfb822ef2(1));
                        } else {
                            java.lang.String m75945x2fec8307 = cn5Var.m75945x2fec8307(3);
                            if (!(m75945x2fec8307 == null || m75945x2fec8307.length() == 0) && pm0.v.Z(cn5Var.m75945x2fec8307(3)) != 0) {
                                c13669xe2583a4f.m158359x1e885992().putExtra("key_activity_id", pm0.v.Z(cn5Var.m75945x2fec8307(3)));
                            }
                        }
                        if (cn5Var.m75939xb282bd08(4) != 0) {
                            c13669xe2583a4f.m158359x1e885992().putExtra("key_topic_type", cn5Var.m75939xb282bd08(4));
                        }
                    }
                }
                c13669xe2583a4f.E7(r03Var2);
                c0Var.f391645d = c13669xe2583a4f.Q7(r03Var2);
            }
        }
        if (!c0Var.f391645d) {
            c13669xe2583a4f.C7(fVar.f152149b, fVar.f152150c);
        }
        int i18 = fVar.f152149b;
        if (!c13669xe2583a4f.B) {
            c13669xe2583a4f.B = true;
            int i19 = i18 == 0 ? 200 : 400;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.l0 l0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.l0.f183872b;
            android.content.Intent intent = c13669xe2583a4f.m158359x1e885992();
            l0Var.getClass();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(intent, "intent");
            java.lang.String stringExtra = intent.getStringExtra("async_callback_param");
            java.lang.Object remove = stringExtra != null ? l0Var.f183836a.remove(stringExtra) : null;
            zy2.i5 i5Var = remove instanceof zy2.i5 ? (zy2.i5) remove : null;
            if (i5Var != null) {
                i5Var.a(java.lang.Integer.valueOf(i19));
            }
        }
        return jz5.f0.f384359a;
    }
}

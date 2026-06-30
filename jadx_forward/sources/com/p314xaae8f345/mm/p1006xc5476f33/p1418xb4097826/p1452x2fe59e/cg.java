package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e;

/* loaded from: classes2.dex */
public final class cg extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f188005d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.fg f188006e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f188007f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f188008g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f188009h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.c0 f188010i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cg(xg2.h hVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.fg fgVar, long j17, java.lang.String str, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var) {
        super(2, interfaceC29045xdcb5ca57);
        this.f188005d = hVar;
        this.f188006e = fgVar;
        this.f188007f = j17;
        this.f188008g = str;
        this.f188009h = h0Var;
        this.f188010i = c0Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.cg(this.f188005d, interfaceC29045xdcb5ca57, this.f188006e, this.f188007f, this.f188008g, this.f188009h, this.f188010i);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.cg cgVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.cg) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        cgVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.lang.String str;
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        r45.ov0 ov0Var = (r45.ov0) ((xg2.i) this.f188005d).f535926b;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.fg fgVar = this.f188006e;
        java.lang.String str2 = fgVar.f188274d;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("tryFetchAutoSwipeInfo feedId:");
        sb6.append(pm0.v.u(this.f188007f));
        sb6.append(" nonceId:");
        sb6.append(this.f188008g);
        sb6.append(" result:");
        java.util.LinkedList m75941xfb821914 = ov0Var.m75941xfb821914(1);
        sb6.append(m75941xfb821914 != null ? new java.lang.Integer(m75941xfb821914.size()) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, sb6.toString());
        java.util.LinkedList<r45.dl2> m75941xfb8219142 = ov0Var.m75941xfb821914(1);
        if (m75941xfb8219142 != null) {
            for (r45.dl2 dl2Var : m75941xfb8219142) {
                boolean z17 = false;
                long m75942xfb822ef2 = dl2Var != null ? dl2Var.m75942xfb822ef2(0) : 0L;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(dl2Var);
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.fg.O6(fgVar, m75942xfb822ef2, dl2Var);
                java.lang.String str3 = fgVar.f188274d;
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder("tryFetchPreloadInfo, needSwipe: ");
                r45.tl1 tl1Var = (r45.tl1) dl2Var.m75936x14adae67(15);
                sb7.append(tl1Var != null ? java.lang.Boolean.valueOf(tl1Var.m75933x41a8a7f2(0)) : null);
                sb7.append(", wording: ");
                r45.tl1 tl1Var2 = (r45.tl1) dl2Var.m75936x14adae67(15);
                sb7.append(tl1Var2 != null ? tl1Var2.m75945x2fec8307(1) : null);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str3, sb7.toString());
                r45.tl1 tl1Var3 = (r45.tl1) dl2Var.m75936x14adae67(15);
                if (tl1Var3 != null && tl1Var3.m75933x41a8a7f2(0)) {
                    z17 = true;
                }
                if (z17) {
                    r45.tl1 tl1Var4 = (r45.tl1) dl2Var.m75936x14adae67(15);
                    if (tl1Var4 == null || (str = tl1Var4.m75945x2fec8307(1)) == null) {
                        str = "";
                    }
                    this.f188009h.f391656d = str;
                    this.f188010i.f391645d = true;
                }
            }
        }
        return jz5.f0.f384359a;
    }
}

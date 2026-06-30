package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui;

/* loaded from: classes8.dex */
public final class oa extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.lk2 f211128d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15047x3a53ff1f f211129e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oa(r45.lk2 lk2Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15047x3a53ff1f activityC15047x3a53ff1f, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f211128d = lk2Var;
        this.f211129e = activityC15047x3a53ff1f;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.oa(this.f211128d, this.f211129e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.oa oaVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.oa) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        oaVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15047x3a53ff1f activityC15047x3a53ff1f;
        java.lang.Object obj2;
        java.lang.String m75945x2fec8307;
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        r45.lk2 lk2Var = this.f211128d;
        java.util.LinkedList m75941xfb821914 = lk2Var.m75941xfb821914(20);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getFinder_list(...)");
        java.util.Iterator it = m75941xfb821914.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            activityC15047x3a53ff1f = this.f211129e;
            if (!hasNext) {
                obj2 = null;
                break;
            }
            obj2 = it.next();
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) ((r45.ac5) obj2).m75936x14adae67(1);
            java.lang.String m76197x6c03c64c = c19782x23db1cfa != null ? c19782x23db1cfa.m76197x6c03c64c() : null;
            ya2.b2 b2Var = activityC15047x3a53ff1f.G;
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(m76197x6c03c64c, b2Var != null ? b2Var.f69347xdec927b : null)) {
                break;
            }
        }
        r45.ac5 ac5Var = (r45.ac5) obj2;
        if (ac5Var != null && (m75945x2fec8307 = ac5Var.m75945x2fec8307(19)) != null) {
            if (!(activityC15047x3a53ff1f.H == 1)) {
                m75945x2fec8307 = null;
            }
            if (m75945x2fec8307 != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15047x3a53ff1f.Q = m75945x2fec8307;
                gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_NICKNAME_MODIFY_WORD_STRING_SYNC, m75945x2fec8307);
            }
        }
        if (lk2Var.m75939xb282bd08(6) > 0) {
            java.lang.String str = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15047x3a53ff1f.Q;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15047x3a53ff1f.R = lk2Var.m75939xb282bd08(6);
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_NICKNAME_MODIFY_LIMIT_LENGTH_INT_SYNC, new java.lang.Integer(lk2Var.m75939xb282bd08(6)));
        }
        if (lk2Var.m75939xb282bd08(4) > 0) {
            activityC15047x3a53ff1f.f210160J = lk2Var.m75939xb282bd08(4);
        }
        java.lang.String m75945x2fec83072 = ac5Var != null ? ac5Var.m75945x2fec8307(13) : null;
        if (m75945x2fec83072 == null) {
            m75945x2fec83072 = "";
        }
        activityC15047x3a53ff1f.E = m75945x2fec83072;
        activityC15047x3a53ff1f.f7();
        return jz5.f0.f384359a;
    }
}

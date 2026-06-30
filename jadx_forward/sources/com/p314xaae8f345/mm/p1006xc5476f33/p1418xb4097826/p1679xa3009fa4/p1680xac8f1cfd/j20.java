package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes2.dex */
public final class j20 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f216335d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.f50 f216336e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j20(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.f50 f50Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f216336e = f50Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.j20(this.f216336e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.j20) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.lang.Object x17;
        java.util.LinkedList m75941xfb821914;
        java.lang.Object obj2;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e2862;
        r45.k74 m76504xa819f0c7;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f216335d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.f50 f50Var = this.f216336e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            int intExtra = f50Var.m158359x1e885992().getIntExtra("key_user_prepare_scene", 8);
            g92.b bVar = g92.b.f351302e;
            this.f216335d = 1;
            x17 = bVar.x1(intExtra, this);
            if (x17 == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            x17 = ((p3321xbce91901.C29043x91b2b43d) obj).getValue();
        }
        if (p3321xbce91901.C29043x91b2b43d.m143903xa8fbbff4(x17)) {
            r45.lk2 lk2Var = (r45.lk2) x17;
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e28622 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.f50.f215868y1;
            f50Var.getClass();
            android.widget.ProgressBar progressBar = f50Var.f215873f;
            if (progressBar == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("progressBar");
                throw null;
            }
            progressBar.setVisibility(8);
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = f50Var.m158354x19263085();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
            ((sr2.l5) pf5.z.f435481a.a(activity).a(sr2.l5.class)).O6(0, 0, null, lk2Var);
            boolean z17 = f50Var.f215872e == null;
            f50Var.f215872e = lk2Var;
            if (!f50Var.Y && (m75941xfb821914 = lk2Var.m75941xfb821914(20)) != null) {
                java.util.Iterator it = m75941xfb821914.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj2 = null;
                        break;
                    }
                    obj2 = it.next();
                    com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) ((r45.ac5) obj2).m75936x14adae67(1);
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(c19782x23db1cfa != null ? c19782x23db1cfa.m76197x6c03c64c() : null, f50Var.f215871d)) {
                        break;
                    }
                }
                r45.ac5 ac5Var = (r45.ac5) obj2;
                if (ac5Var != null && (c19786x6a1e2862 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862) ac5Var.m75936x14adae67(56)) != null && (m76504xa819f0c7 = c19786x6a1e2862.m76504xa819f0c7()) != null) {
                    f50Var.Y = true;
                    i95.m c17 = i95.n0.c(c61.yb.class);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                    ((c61.p2) ((c61.yb) c17)).Qj(f50Var.m80379x76847179(), m76504xa819f0c7);
                }
            }
            if (z17) {
                f50Var.r7();
            }
            ((im2.p4) f50Var.e7()).S6(f50Var.f215872e);
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity2 = f50Var.m158354x19263085();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity2, "activity");
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1419xb9d38a2d.p1421xac8f1cfd.l) ((zy2.o5) pf5.z.f435481a.a(activity2).c(zy2.o5.class))).O6(lk2Var);
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity3 = f50Var.m158354x19263085();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity3, "activity");
            ((im2.v4) ((zy2.o8) pf5.z.f435481a.a(activity3).c(zy2.o8.class))).O6(lk2Var.m75939xb282bd08(26), (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862) lk2Var.m75936x14adae67(32), false);
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_PURCHASE_LIVE_TOTAL_COUNT_INT, new java.lang.Integer(lk2Var.m75939xb282bd08(12)));
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_PURCHASE_MEMBER_TOTAL_COUNT_INT, new java.lang.Integer(lk2Var.m75939xb282bd08(29)));
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_PURCHASE_COURSE_TOTAL_COUNT_INT, new java.lang.Integer(lk2Var.m75939xb282bd08(33)));
            f50Var.q7(false);
        }
        java.lang.Throwable m143898xd4a2fc34 = p3321xbce91901.C29043x91b2b43d.m143898xd4a2fc34(x17);
        if (m143898xd4a2fc34 != null) {
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e28623 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.f50.f215868y1;
            f50Var.getClass();
            rm0.j jVar = m143898xd4a2fc34 instanceof rm0.j ? (rm0.j) m143898xd4a2fc34 : null;
            if (jVar != null) {
                android.widget.ProgressBar progressBar2 = f50Var.f215873f;
                if (progressBar2 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("progressBar");
                    throw null;
                }
                progressBar2.setVisibility(8);
                p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity4 = f50Var.m158354x19263085();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity4, "activity");
                ((sr2.l5) pf5.z.f435481a.a(activity4).a(sr2.l5.class)).mo815x76e0bfae(jVar.f478957e, jVar.f478958f, jVar.f478959g, null);
                f50Var.r7();
                db5.t7.m123882x26a183b(f50Var.m158354x19263085(), com.p314xaae8f345.mm.R.C30867xcad56011.exk, 1).show();
            }
        }
        return jz5.f0.f384359a;
    }
}

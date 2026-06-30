package qf2;

/* loaded from: classes3.dex */
public final class n3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f444028d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f444029e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ qf2.q3 f444030f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n3(xg2.h hVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57, yz5.l lVar, qf2.q3 q3Var) {
        super(2, interfaceC29045xdcb5ca57);
        this.f444028d = hVar;
        this.f444029e = lVar;
        this.f444030f = q3Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new qf2.n3(this.f444028d, interfaceC29045xdcb5ca57, this.f444029e, this.f444030f);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        qf2.n3 n3Var = (qf2.n3) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        n3Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        r45.r7 r7Var;
        r45.nb nbVar;
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        r45.nu1 nu1Var = (r45.nu1) ((xg2.i) this.f444028d).f535926b;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLivePayMicControl", "requestPurchaseInfo success");
        if (nu1Var != null && (nbVar = (r45.nb) nu1Var.m75936x14adae67(2)) != null) {
            mm2.g5 g5Var = (mm2.g5) this.f444030f.m56788xbba4bfc0(mm2.g5.class);
            if (g5Var != null) {
                g5Var.f410622f = nbVar.m75937x160e9ec7(0);
            }
            mm2.g5 g5Var2 = (mm2.g5) this.f444030f.m56788xbba4bfc0(mm2.g5.class);
            if (g5Var2 != null) {
                g5Var2.f410625i = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862) nbVar.m75936x14adae67(1);
            }
        }
        if (zl2.r4.f555483a.x1() && nu1Var != null && (r7Var = (r45.r7) nu1Var.m75936x14adae67(1)) != null) {
            mm2.g5 g5Var3 = (mm2.g5) this.f444030f.m56788xbba4bfc0(mm2.g5.class);
            if (g5Var3 != null) {
                g5Var3.f410622f = r7Var.m75937x160e9ec7(3);
            }
            mm2.g5 g5Var4 = (mm2.g5) this.f444030f.m56788xbba4bfc0(mm2.g5.class);
            if (g5Var4 != null) {
                g5Var4.f410625i = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862) r7Var.m75936x14adae67(5);
            }
            mm2.g5 g5Var5 = (mm2.g5) this.f444030f.m56788xbba4bfc0(mm2.g5.class);
            if (g5Var5 != null) {
                g5Var5.f410624h = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862) r7Var.m75936x14adae67(4);
            }
            java.util.HashMap hashMap = new java.util.HashMap();
            java.util.List<km2.q> list = ((mm2.o4) this.f444030f.m56788xbba4bfc0(mm2.o4.class)).f410851o;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(list, "<get-linkMicUserList>(...)");
            synchronized (list) {
                for (km2.q qVar : list) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.b(hashMap.get(qVar.f390703a), qVar);
                }
            }
            ((mm2.o4) this.f444030f.m56788xbba4bfc0(mm2.o4.class)).f410851o.clear();
            java.util.LinkedList<r45.if5> m75941xfb821914 = r7Var.m75941xfb821914(2);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getApplyed_audience_list(...)");
            for (r45.if5 if5Var : m75941xfb821914) {
                qf2.q3 q3Var = this.f444030f;
                java.util.List list2 = ((mm2.o4) q3Var.m56788xbba4bfc0(mm2.o4.class)).f410851o;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(list2, "<get-linkMicUserList>(...)");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(if5Var);
                qf2.q3.Z6(q3Var, list2, if5Var, hashMap);
            }
            java.util.LinkedList<r45.if5> m75941xfb8219142 = r7Var.m75941xfb821914(1);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb8219142, "getCur_in_mic_audience(...)");
            for (r45.if5 if5Var2 : m75941xfb8219142) {
                qf2.q3 q3Var2 = this.f444030f;
                java.util.List list3 = ((mm2.o4) q3Var2.m56788xbba4bfc0(mm2.o4.class)).f410851o;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(list3, "<get-linkMicUserList>(...)");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(if5Var2);
                km2.q Z6 = qf2.q3.Z6(q3Var2, list3, if5Var2, hashMap);
                if (Z6.f390707e == 2) {
                    Z6.f390714l = 4;
                } else {
                    Z6.f390714l = 3;
                }
            }
        }
        yz5.l lVar = this.f444029e;
        if (lVar != null) {
            lVar.mo146xb9724478(nu1Var);
        }
        return jz5.f0.f384359a;
    }
}

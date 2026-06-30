package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class ph extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f195415d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f195416e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f195417f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2495xc50a8b8b.g f195418g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f195419h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.qh f195420i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ph(java.lang.String str, long j17, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar, long j18, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.qh qhVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f195416e = str;
        this.f195417f = j17;
        this.f195418g = gVar;
        this.f195419h = j18;
        this.f195420i = qhVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ph(this.f195416e, this.f195417f, this.f195418g, this.f195419h, this.f195420i, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ph) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        r45.zr1 zr1Var;
        r45.m70 m70Var;
        r45.l70 l70Var;
        java.lang.Object obj2;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f195415d;
        java.lang.String str = this.f195416e;
        try {
            if (i17 == 0) {
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                r45.yr1 yr1Var = new r45.yr1();
                long j17 = this.f195417f;
                com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f195418g;
                long j18 = this.f195419h;
                yr1Var.set(1, db2.t4.f309704a.a(10635));
                yr1Var.set(2, str);
                yr1Var.set(3, java.lang.Long.valueOf(j17));
                yr1Var.set(5, gVar);
                yr1Var.set(4, java.lang.Long.valueOf(j18));
                yr1Var.set(7, 2);
                com.p314xaae8f345.mm.p944x882e457a.i d17 = yr1Var.d();
                this.f195415d = 1;
                obj = rm0.h.a(d17, 0L, null, this, 3, null);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i17 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            }
            zr1Var = (r45.zr1) obj;
        } catch (rm0.j e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveConcertTicketPlugin", "#tryToShowTicket FinderLiveGetConcertTicketInfoRequest fail. " + e17);
            zr1Var = null;
        }
        if (zr1Var != null && (m70Var = (r45.m70) zr1Var.m75936x14adae67(1)) != null) {
            if (!m70Var.m75933x41a8a7f2(6)) {
                m70Var = null;
            }
            if (m70Var != null) {
                java.util.LinkedList m75941xfb821914 = m70Var.m75941xfb821914(22);
                if (m75941xfb821914 != null) {
                    java.util.Iterator it = m75941xfb821914.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj2 = null;
                            break;
                        }
                        obj2 = it.next();
                        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((r45.l70) obj2).m75945x2fec8307(0), m70Var.m75945x2fec8307(21))) {
                            break;
                        }
                    }
                    l70Var = (r45.l70) obj2;
                } else {
                    l70Var = null;
                }
                ((ml2.r0) i95.n0.c(ml2.r0.class)).jk(1, str);
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.qh qhVar = this.f195420i;
                qhVar.K0(0);
                qhVar.f195543q.setText(l70Var != null ? l70Var.m75945x2fec8307(1) : null);
                mn2.g1 g1Var = mn2.g1.f411508a;
                wo0.c b17 = g1Var.e().b(new mn2.q3(l70Var != null ? l70Var.m75945x2fec8307(4) : null, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.f209888e), g1Var.h(mn2.f1.f411498s));
                android.widget.ImageView imageView = qhVar.f195544r;
                b17.c(imageView);
                imageView.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.oh(str, qhVar, m70Var));
            }
        }
        return jz5.f0.f384359a;
    }
}

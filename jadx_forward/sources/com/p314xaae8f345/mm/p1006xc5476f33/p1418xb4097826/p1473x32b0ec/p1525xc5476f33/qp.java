package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes.dex */
public final class qp extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f195569d;

    /* renamed from: e, reason: collision with root package name */
    public int f195570e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.dq f195571f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qp(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.dq dqVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f195571f = dqVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.qp(this.f195571f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.qp) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.util.LinkedList toRestore;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f195570e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.dq dqVar = this.f195571f;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            r45.y72 y72Var = new r45.y72();
            y72Var.set(1, db2.t4.f309704a.a(15763));
            y72Var.set(2, ((k40.f) ((l40.e) i95.n0.c(l40.e.class))).Ui(dqVar.f446856d.getContext()));
            y72Var.set(3, java.lang.Long.valueOf(((mm2.e1) dqVar.P0(mm2.e1.class)).f410516m));
            y72Var.set(4, java.lang.Long.valueOf(((mm2.e1) dqVar.P0(mm2.e1.class)).f410521r.m75942xfb822ef2(0)));
            y72Var.set(7, pm0.b0.h(((mm2.e1) dqVar.P0(mm2.e1.class)).f410518o));
            y72Var.set(5, dqVar.f193858r);
            y72Var.set(6, zl2.q4.f555466a.m());
            y72Var.set(8, new java.util.LinkedList(dqVar.f193853l1));
            y72Var.set(9, 1);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveGiftSendPlugin", "send free gifts " + dqVar.f193853l1);
            java.util.LinkedList linkedList = new java.util.LinkedList(dqVar.f193853l1);
            ((java.util.ArrayList) dqVar.f193853l1).clear();
            com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
            lVar.f152200d = 15763;
            lVar.f152199c = "/cgi-bin/micromsg-bin/finderliverewardfreegift";
            lVar.f152197a = y72Var;
            lVar.f152198b = new r45.z72();
            com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
            com.p314xaae8f345.mm.p944x882e457a.i wi6 = ((pc2.e) ((zy2.x5) i95.n0.c(zy2.x5.class))).wi();
            wi6.p(a17);
            this.f195569d = linkedList;
            this.f195570e = 1;
            obj = rm0.h.b(wi6, this);
            if (obj == aVar) {
                return aVar;
            }
            toRestore = linkedList;
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            toRestore = (java.util.LinkedList) this.f195569d;
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        if (fVar.b()) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("send freeGifts ");
            sb6.append(toRestore);
            sb6.append(" success, succItems = ");
            sb6.append(((r45.z72) fVar.f152151d).m75941xfb821914(1));
            sb6.append(" failItems = ");
            java.util.LinkedList<r45.ct5> m75941xfb821914 = ((r45.z72) fVar.f152151d).m75941xfb821914(2);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getFail_items(...)");
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(m75941xfb821914, 10));
            for (r45.ct5 ct5Var : m75941xfb821914) {
                arrayList.add("giftId " + ct5Var.m75945x2fec8307(0) + ", failReason: " + ct5Var.m75939xb282bd08(1));
            }
            sb6.append(arrayList);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveGiftSendPlugin", sb6.toString());
            je2.t tVar = (je2.t) dqVar.P0(je2.t.class);
            java.util.LinkedList m75941xfb8219142 = ((r45.z72) fVar.f152151d).m75941xfb821914(2);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb8219142, "getFail_items(...)");
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(m75941xfb8219142, 10));
            java.util.Iterator it = m75941xfb8219142.iterator();
            while (true) {
                java.lang.String str = "";
                if (!it.hasNext()) {
                    break;
                }
                java.lang.String m75945x2fec8307 = ((r45.ct5) it.next()).m75945x2fec8307(0);
                if (m75945x2fec8307 != null) {
                    str = m75945x2fec8307;
                }
                arrayList2.add(str);
            }
            synchronized (tVar) {
                tVar.f380810w.removeAll(kz5.n0.X0(arrayList2));
                tVar.Q6();
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.dq dqVar2 = this.f195571f;
            java.lang.String str2 = dqVar2.f193858r;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.dq.v1(dqVar2, str2 == null ? "" : str2, dqVar2.f193863w, dqVar2.f193859s, dqVar2.f193862v, ((r45.z72) fVar.f152151d).m75941xfb821914(1).size());
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Finder.FinderLiveGiftSendPlugin", "send freeGifts " + toRestore + " failed, errCode = " + fVar.f152149b + ", errType = " + fVar.f152148a);
            je2.t tVar2 = (je2.t) dqVar.P0(je2.t.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(toRestore, "toRestore");
            synchronized (tVar2) {
                tVar2.f380810w.removeAll(kz5.n0.X0(toRestore));
                tVar2.Q6();
            }
        }
        return jz5.f0.f384359a;
    }
}

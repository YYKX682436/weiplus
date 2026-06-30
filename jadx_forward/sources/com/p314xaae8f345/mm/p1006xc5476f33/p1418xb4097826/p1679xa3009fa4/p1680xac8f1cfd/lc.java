package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes2.dex */
public final class lc extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f216577d;

    /* renamed from: e, reason: collision with root package name */
    public int f216578e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.nc f216579f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f216580g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.util.List f216581h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ r45.qt2 f216582i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lc(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.nc ncVar, int i17, java.util.List list, r45.qt2 qt2Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f216579f = ncVar;
        this.f216580g = i17;
        this.f216581h = list;
        this.f216582i = qt2Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.lc(this.f216579f, this.f216580g, this.f216581h, this.f216582i, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.lc) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.lang.Object P6;
        java.util.LinkedList linkedList;
        r45.qt2 qt2Var;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f216578e;
        int i18 = this.f216580g;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.nc ncVar = this.f216579f;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            java.util.LinkedList linkedList2 = new java.util.LinkedList();
            this.f216577d = linkedList2;
            this.f216578e = 1;
            P6 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.nc.P6(ncVar, i18, this);
            if (P6 == aVar) {
                return aVar;
            }
            linkedList = linkedList2;
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            linkedList = (java.util.LinkedList) this.f216577d;
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            P6 = obj;
        }
        java.util.List list = (java.util.List) P6;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.List list2 = this.f216581h;
        java.util.Iterator it = list2.iterator();
        while (true) {
            boolean z17 = false;
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) next;
            java.util.Iterator it6 = list.iterator();
            int i19 = 0;
            while (true) {
                if (!it6.hasNext()) {
                    i19 = -1;
                    break;
                }
                if (((r45.e13) it6.next()).m75942xfb822ef2(0) == c19792x256d2725.m76784x5db1b11()) {
                    break;
                }
                i19++;
            }
            if (i19 < 0) {
                java.util.concurrent.ConcurrentSkipListSet concurrentSkipListSet = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.nc.f216822z;
                if (!ncVar.X6().P6(i18, c19792x256d2725.m76784x5db1b11())) {
                    z17 = true;
                }
            }
            if (z17) {
                arrayList.add(next);
            }
        }
        java.util.Iterator it7 = arrayList.iterator();
        while (true) {
            boolean hasNext = it7.hasNext();
            qt2Var = this.f216582i;
            if (!hasNext) {
                break;
            }
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d27252 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) it7.next();
            r45.e13 e13Var = new r45.e13();
            e13Var.set(0, java.lang.Long.valueOf(c19792x256d27252.m76784x5db1b11()));
            r45.dm2 m76806xdef68064 = c19792x256d27252.m76806xdef68064();
            java.lang.String str = null;
            e13Var.set(4, m76806xdef68064 != null ? m76806xdef68064.m75945x2fec8307(62) : null);
            e13Var.set(1, c19792x256d27252.m76803x6c285d75());
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3 o3Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class);
            long m75942xfb822ef2 = e13Var.m75942xfb822ef2(0);
            r45.dm2 m76806xdef680642 = c19792x256d27252.m76806xdef68064();
            if (m76806xdef680642 != null) {
                str = m76806xdef680642.m75945x2fec8307(62);
            }
            e13Var.set(3, o3Var.ek(m75942xfb822ef2, str, qt2Var.m75939xb282bd08(5)));
            e13Var.set(2, 4);
            linkedList.add(e13Var);
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[reportUnreadFeed] (");
        sb6.append(list2.size());
        sb6.append(" => ");
        sb6.append(linkedList.size());
        sb6.append(") list=");
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(linkedList, 10));
        java.util.Iterator it8 = linkedList.iterator();
        while (it8.hasNext()) {
            arrayList2.add(pm0.v.u(((r45.e13) it8.next()).m75942xfb822ef2(0)));
        }
        sb6.append(arrayList2);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.EnhanceFeedUIC", sb6.toString());
        if (!linkedList.isEmpty()) {
            new db2.f(linkedList, qt2Var).l();
        }
        return jz5.f0.f384359a;
    }
}

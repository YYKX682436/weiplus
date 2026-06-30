package so2;

/* loaded from: classes2.dex */
public final class i1 implements so2.j5 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f491949d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.ArrayList f491950e;

    /* renamed from: f, reason: collision with root package name */
    public final long f491951f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f491952g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f491953h;

    public i1() {
        ae2.in inVar = ae2.in.f85221a;
        this.f491953h = ((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.f85405s3).mo141623x754a37bb()).r()).intValue() == 0;
        this.f491949d = null;
        this.f491950e = new java.util.ArrayList();
        new java.util.ArrayList();
        this.f491951f = g();
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0030, code lost:
    
        if (((r3 == null || (r3 = r3.m76794xd0557130()) == null || r3.m75942xfb822ef2(0) != r8) ? false : true) != false) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int a(long r8) {
        /*
            r7 = this;
            java.util.ArrayList r0 = r7.f491950e
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
            r2 = r1
        L8:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L3a
            java.lang.Object r3 = r0.next()
            so2.j5 r3 = (so2.j5) r3
            boolean r4 = r3 instanceof so2.j1
            if (r4 == 0) goto L33
            so2.j1 r3 = (so2.j1) r3
            com.tencent.mm.protocal.protobuf.FinderObject r3 = r3.f491972d
            r4 = 1
            if (r3 == 0) goto L2f
            r45.nw1 r3 = r3.m76794xd0557130()
            if (r3 == 0) goto L2f
            long r5 = r3.m75942xfb822ef2(r1)
            int r3 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r3 != 0) goto L2f
            r3 = r4
            goto L30
        L2f:
            r3 = r1
        L30:
            if (r3 == 0) goto L33
            goto L34
        L33:
            r4 = r1
        L34:
            if (r4 == 0) goto L37
            goto L3b
        L37:
            int r2 = r2 + 1
            goto L8
        L3a:
            r2 = -1
        L3b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: so2.i1.a(long):int");
    }

    public final so2.j1 b(long j17) {
        java.lang.Object obj;
        r45.nw1 m76794xd0557130;
        java.util.Iterator it = f().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = ((so2.j1) obj).f491972d;
            boolean z17 = false;
            if (c19792x256d2725 != null && (m76794xd0557130 = c19792x256d2725.m76794xd0557130()) != null && m76794xd0557130.m75942xfb822ef2(0) == j17) {
                z17 = true;
            }
        }
        return (so2.j1) obj;
    }

    public final java.util.ArrayList c() {
        return this.f491950e;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.r0
    public int d(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.r0 obj) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(obj, "obj");
        return ((obj instanceof so2.i1 ? (so2.i1) obj : null) == null || this.f491951f != ((so2.i1) obj).f491951f) ? -1 : 0;
    }

    public final long e() {
        return this.f491951f;
    }

    public final java.util.ArrayList f() {
        try {
            java.util.ArrayList arrayList = this.f491950e;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (java.lang.Object obj : arrayList) {
                if (obj instanceof so2.j1) {
                    arrayList2.add(obj);
                }
            }
            return arrayList2;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderFeedLiveList", "get liveList:" + e17.getMessage());
            return new java.util.ArrayList();
        }
    }

    public final long g() {
        java.util.Iterator it = this.f491950e.iterator();
        long j17 = io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28565x745483d5.f70718x647d53d2;
        while (it.hasNext()) {
            j17 &= ((so2.j5) it.next()).mo2128x1ed62e84();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderFeedLiveList", "listId:" + j17);
        return j17;
    }

    @Override // in5.c
    /* renamed from: getItemId */
    public long mo2128x1ed62e84() {
        return this.f491951f;
    }

    @Override // in5.c
    public int h() {
        return 2003;
    }

    public final java.util.ArrayList i(java.util.List list) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            if (cm2.a.f124861a.t((com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) obj)) {
                arrayList.add(obj);
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(arrayList, 10));
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new so2.j1((com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) it.next()));
        }
        return new java.util.ArrayList(arrayList2);
    }

    public final void j(int i17) {
        java.util.ArrayList arrayList = this.f491950e;
        if (i17 >= 0 && i17 < arrayList.size()) {
            arrayList.remove(i17);
        }
        if (f().isEmpty()) {
            arrayList.clear();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderFeedLiveList", "removeItem clear list!");
        }
    }

    public final void k() {
        if (this.f491953h) {
            java.util.ArrayList arrayList = this.f491950e;
            if (arrayList.size() > 0) {
                java.util.Iterator it = arrayList.iterator();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(it, "iterator(...)");
                while (it.hasNext()) {
                    java.lang.Object next = it.next();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(next, "next(...)");
                    if (((so2.j5) next) instanceof so2.m1) {
                        it.remove();
                    }
                }
                if (f().size() > 0) {
                    arrayList.add(new so2.m1());
                }
            }
        }
    }

    /* renamed from: toString */
    public java.lang.String m164892x9616526c() {
        java.util.ArrayList arrayList = this.f491950e;
        int size = arrayList.size();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("liveListId,size:" + size + ':');
        for (int i17 = 0; i17 < size; i17++) {
            so2.j5 j5Var = (so2.j5) arrayList.get(i17);
            if (j5Var instanceof so2.j1) {
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder("[index:");
                sb7.append(i17);
                sb7.append(",username:");
                so2.j1 j1Var = (so2.j1) j5Var;
                sb7.append(j1Var.f491972d.m76801x8010e5e4());
                sb7.append(",feedId:");
                sb7.append(j1Var.f491972d.m76784x5db1b11());
                sb7.append(",liveId:");
                r45.nw1 m76794xd0557130 = j1Var.f491972d.m76794xd0557130();
                sb7.append(m76794xd0557130 != null ? java.lang.Long.valueOf(m76794xd0557130.m75942xfb822ef2(0)) : null);
                sb7.append("，friendLikeCount:");
                sb7.append(j1Var.f491972d.m76779xf67fd084());
                sb7.append(']');
                sb6.append(sb7.toString());
            } else {
                sb6.append("[index:" + i17 + ",feedId:" + j5Var.mo2128x1ed62e84() + ']');
            }
        }
        java.lang.String sb8 = sb6.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(sb8, "toString(...)");
        return sb8;
    }

    public i1(r45.ww2 finderStreamCard) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderStreamCard, "finderStreamCard");
        ae2.in inVar = ae2.in.f85221a;
        this.f491953h = ((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.f85405s3).mo141623x754a37bb()).r()).intValue() == 0;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.f491950e = arrayList;
        new java.util.ArrayList();
        java.util.LinkedList m75941xfb821914 = finderStreamCard.m75941xfb821914(4);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getObject(...)");
        arrayList.addAll(i(m75941xfb821914));
        k();
        this.f491949d = finderStreamCard.m75934xbce7f2f(6);
        this.f491951f = g();
        this.f491952g = finderStreamCard.m75933x41a8a7f2(10);
    }
}

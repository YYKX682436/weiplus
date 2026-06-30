package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1628x7643c6b5;

/* loaded from: classes2.dex */
public final class d2 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f207559a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f207560b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f207561c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f207562d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1628x7643c6b5.l2 f207563e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f207564f;

    public d2(int i17, java.util.LinkedList linkedList, boolean z17, int i18, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1628x7643c6b5.l2 l2Var, int i19) {
        this.f207559a = i17;
        this.f207560b = linkedList;
        this.f207561c = z17;
        this.f207562d = i18;
        this.f207563e = l2Var;
        this.f207564f = i19;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar;
        com.p314xaae8f345.mm.p944x882e457a.f fVar2 = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        int i17 = fVar2.f152148a;
        java.util.LinkedList<r45.rv0> linkedList = this.f207560b;
        int i18 = this.f207559a;
        if (i17 != 0 || fVar2.f152149b != 0 || (fVar = fVar2.f152151d) == null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("recordPreloadFeed error commentScene:");
            sb6.append(i18);
            sb6.append(' ');
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(linkedList, 10));
            for (r45.rv0 rv0Var : linkedList) {
                arrayList.add("objectId:" + rv0Var.m75942xfb822ef2(0) + " exportId:" + rv0Var.m75945x2fec8307(1));
            }
            sb6.append(arrayList);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderFeedDetailService", sb6.toString());
        } else if (!((r45.sv0) fVar).m75933x41a8a7f2(4)) {
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("recordPreloadFeed error can_pre_download commentScene:");
            sb7.append(i18);
            sb7.append(' ');
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(linkedList, 10));
            for (r45.rv0 rv0Var2 : linkedList) {
                arrayList2.add("objectId:" + pm0.v.u(rv0Var2.m75942xfb822ef2(0)) + " exportId:" + rv0Var2.m75945x2fec8307(1));
            }
            sb7.append(arrayList2);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderFeedDetailService", sb7.toString());
        } else if (this.f207561c) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1628x7643c6b5.l2 l2Var = this.f207563e;
            int i19 = this.f207562d;
            if (i19 != 0) {
                l2Var.f207648f.put(java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(((r45.sv0) fVar2.f152151d).m75939xb282bd08(2)));
            }
            java.util.LinkedList m75941xfb821914 = ((r45.sv0) fVar2.f152151d).m75941xfb821914(1);
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder("recordPreloadFeed commentScene:");
            sb8.append(i18);
            sb8.append(" get ");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m75941xfb821914);
            java.util.ArrayList arrayList3 = new java.util.ArrayList(kz5.d0.q(m75941xfb821914, 10));
            java.util.Iterator it = m75941xfb821914.iterator();
            while (it.hasNext()) {
                arrayList3.add(hc2.o0.m((com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) it.next()));
            }
            sb8.append(arrayList3);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderFeedDetailService", sb8.toString());
            l2Var.f207647e.a(i18, m75941xfb821914, this.f207564f);
        }
        return jz5.f0.f384359a;
    }
}

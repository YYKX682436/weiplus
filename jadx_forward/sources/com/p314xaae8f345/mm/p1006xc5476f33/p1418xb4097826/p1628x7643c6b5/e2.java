package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1628x7643c6b5;

/* loaded from: classes2.dex */
public final class e2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f207569d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f207570e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f207571f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f207572g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1628x7643c6b5.l2 f207573h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f207574i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e2(int i17, java.util.LinkedList linkedList, boolean z17, int i18, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1628x7643c6b5.l2 l2Var, int i19) {
        super(1);
        this.f207569d = i17;
        this.f207570e = linkedList;
        this.f207571f = z17;
        this.f207572g = i18;
        this.f207573h = l2Var;
        this.f207574i = i19;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        r45.sv0 it = (r45.sv0) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        boolean m75933x41a8a7f2 = it.m75933x41a8a7f2(4);
        int i17 = this.f207569d;
        if (!m75933x41a8a7f2) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("recordPreloadFeed error can_pre_download commentScene:");
            sb6.append(i17);
            sb6.append(' ');
            java.util.LinkedList<r45.rv0> linkedList = this.f207570e;
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(linkedList, 10));
            for (r45.rv0 rv0Var : linkedList) {
                arrayList.add("objectId:" + pm0.v.u(rv0Var.m75942xfb822ef2(0)) + " exportId:" + rv0Var.m75945x2fec8307(1));
            }
            sb6.append(arrayList);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderFeedDetailService", sb6.toString());
        } else if (this.f207571f) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1628x7643c6b5.l2 l2Var = this.f207573h;
            int i18 = this.f207572g;
            if (i18 != 0) {
                l2Var.f207648f.put(java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(it.m75939xb282bd08(2)));
            }
            java.util.LinkedList m75941xfb821914 = it.m75941xfb821914(1);
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("recordPreloadFeed commentScene:");
            sb7.append(i17);
            sb7.append(" get ");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m75941xfb821914);
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(m75941xfb821914, 10));
            java.util.Iterator it6 = m75941xfb821914.iterator();
            while (it6.hasNext()) {
                arrayList2.add(hc2.o0.m((com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) it6.next()));
            }
            sb7.append(arrayList2);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderFeedDetailService", sb7.toString());
            l2Var.f207647e.a(i17, m75941xfb821914, this.f207574i);
        }
        return jz5.f0.f384359a;
    }
}

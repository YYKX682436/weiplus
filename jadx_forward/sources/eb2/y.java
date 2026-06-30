package eb2;

/* loaded from: classes2.dex */
public final class y extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.s {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f332396d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ eb2.b0 f332397e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f332398f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f332399g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f332400h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ db2.u3 f332401i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(java.util.List list, eb2.b0 b0Var, int i17, boolean z17, boolean z18, db2.u3 u3Var) {
        super(5);
        this.f332396d = list;
        this.f332397e = b0Var;
        this.f332398f = i17;
        this.f332399g = z17;
        this.f332400h = z18;
        this.f332401i = u3Var;
    }

    @Override // yz5.s
    public java.lang.Object v(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5) {
        java.util.List list;
        java.util.ArrayList arrayList;
        int intValue = ((java.lang.Number) obj).intValue();
        int intValue2 = ((java.lang.Number) obj2).intValue();
        java.lang.String str = (java.lang.String) obj3;
        r45.v61 v61Var = (r45.v61) obj4;
        java.lang.Object m17 = gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_TIMELINE_HEADER_WORDING_STRING_SYNC, "headWording");
        if (m17 instanceof java.lang.String) {
        }
        java.lang.Object m18 = gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_TIMELINE_FOOTER_WORDING_STRING_SYNC, "endWording");
        if (m18 instanceof java.lang.String) {
        }
        java.util.List list2 = this.f332396d;
        int i17 = this.f332398f;
        eb2.b0 b0Var = this.f332397e;
        if (intValue == 0 && intValue2 == 0) {
            jx3.f.INSTANCE.mo68477x336bdfd8(1279L, 3L, 1L, false);
            java.util.LinkedList m75941xfb821914 = v61Var != null ? v61Var.m75941xfb821914(1) : null;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m75941xfb821914);
            java.util.LinkedList linkedList = new java.util.LinkedList();
            if (list2 != null) {
                linkedList.addAll(list2);
            }
            linkedList.addAll(m75941xfb821914);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (java.lang.Object obj6 : linkedList) {
                if (hc2.o0.C((com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) obj6)) {
                    arrayList2.add(obj6);
                }
            }
            cu2.t tVar = cu2.u.f303974a;
            list = tVar.j(arrayList2, hc2.d0.d(b0Var.f332248g), b0Var.f332249h);
            if (i17 != 2) {
                java.util.ArrayList arrayList3 = new java.util.ArrayList(kz5.d0.q(list, 10));
                java.util.Iterator it = ((java.util.ArrayList) list).iterator();
                while (it.hasNext()) {
                    arrayList3.add(cu2.u.f303974a.p((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079) it.next()));
                }
                tVar.m(arrayList3, hc2.d0.d(b0Var.f332248g), "", this.f332399g);
            }
        } else {
            jx3.f.INSTANCE.mo68477x336bdfd8(1279L, 4L, 1L, false);
            list = null;
        }
        if (list != null) {
            arrayList = new java.util.ArrayList(kz5.d0.q(list, 10));
            java.util.Iterator it6 = list.iterator();
            while (it6.hasNext()) {
                arrayList.add(cu2.u.f303974a.p((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079) it6.next()));
            }
        } else {
            arrayList = null;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[getHistory] tabType=");
        sb6.append(b0Var.f332248g);
        sb6.append(" list ");
        sb6.append(list != null ? java.lang.Integer.valueOf(list.size()) : null);
        sb6.append(",isFirstPage=");
        sb6.append(this.f332400h);
        sb6.append(" extraList=");
        sb6.append(list2 != null ? java.lang.Integer.valueOf(list2.size()) : null);
        sb6.append(" pullType=");
        sb6.append(i17);
        sb6.append(" continue_flag=");
        sb6.append(v61Var != null ? java.lang.Integer.valueOf(v61Var.m75939xb282bd08(3)) : null);
        sb6.append(" errType=");
        sb6.append(intValue);
        sb6.append(" errCode=");
        sb6.append(intValue2);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLbsFeedFetcher", sb6.toString());
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.d dVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.d(arrayList, intValue, intValue2, str);
        dVar.f189309n = v61Var != null ? v61Var.m75934xbce7f2f(2) : null;
        if (intValue == 0 && intValue2 == 0) {
            dVar.f189303h = v61Var != null ? v61Var.m75939xb282bd08(3) : 1;
        } else {
            dVar.f189303h = 1;
        }
        this.f332401i.a(dVar, i17);
        return jz5.f0.f384359a;
    }
}

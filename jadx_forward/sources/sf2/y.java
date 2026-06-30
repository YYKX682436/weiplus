package sf2;

/* loaded from: classes3.dex */
public final class y extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f488892d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ sf2.e0 f488893e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f488894f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f488895g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ r45.xg7 f488896h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ r45.pt1 f488897i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ yz5.l f488898m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(int i17, sf2.e0 e0Var, int i18, java.lang.String str, r45.xg7 xg7Var, r45.pt1 pt1Var, yz5.l lVar) {
        super(0);
        this.f488892d = i17;
        this.f488893e = e0Var;
        this.f488894f = i18;
        this.f488895g = str;
        this.f488896h = xg7Var;
        this.f488897i = pt1Var;
        this.f488898m = lVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.util.ArrayList arrayList;
        sf2.e0 e0Var = this.f488893e;
        int i17 = this.f488892d;
        if (i17 < 0) {
            zl2.r4.f555483a.f3(e0Var.O6(), "(DEBUG)获取 Tab 失败 " + i17);
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[getTabList onCgiBack] errType=");
        sb6.append(this.f488894f);
        sb6.append(" errCode=");
        sb6.append(i17);
        sb6.append(" errMsg=");
        sb6.append(this.f488895g);
        sb6.append(" tab type = ");
        r45.xg7 type = this.f488896h;
        sb6.append(type);
        sb6.append(" list size=");
        r45.pt1 pt1Var = this.f488897i;
        sb6.append(pt1Var.m75941xfb821914(1).size());
        sb6.append(" hide recommend=");
        sb6.append(pt1Var.m75933x41a8a7f2(4));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveAnchorSearchMusicController", sb6.toString());
        java.util.List list = (java.util.List) ((mm2.c1) e0Var.m56788xbba4bfc0(mm2.c1.class)).Z6().f315417m.get(type);
        int size = list != null ? list.size() : 0;
        dk2.p Z6 = ((mm2.c1) e0Var.m56788xbba4bfc0(mm2.c1.class)).Z6();
        Z6.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(type, "type");
        java.util.List list2 = (java.util.List) Z6.f315417m.get(type);
        java.util.LinkedList<r45.d22> m75941xfb821914 = pt1Var.m75941xfb821914(1);
        if (m75941xfb821914 != null) {
            arrayList = new java.util.ArrayList(kz5.d0.q(m75941xfb821914, 10));
            for (r45.d22 d22Var : m75941xfb821914) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(d22Var);
                arrayList.add(new dk2.vg(d22Var, 0, Z6.h(d22Var) ? 51 : 0, 0, false, 0L, 56, null));
            }
        } else {
            arrayList = null;
        }
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("updateMusicListData size:");
        sb7.append(arrayList != null ? java.lang.Integer.valueOf(arrayList.size()) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveAnchorMusicData", sb7.toString());
        if (arrayList != null && list2 != null) {
            list2.addAll(arrayList);
        }
        Z6.f315416l.put(type, pt1Var.m75934xbce7f2f(2));
        Z6.f315415k.put(type, java.lang.Integer.valueOf(pt1Var.m75939xb282bd08(3)));
        boolean z17 = !pt1Var.m75933x41a8a7f2(4);
        int size2 = pt1Var.m75941xfb821914(1).size();
        java.util.List list3 = (java.util.List) ((mm2.c1) e0Var.m56788xbba4bfc0(mm2.c1.class)).Z6().f315417m.get(type);
        if (list3 == null || list3.isEmpty()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.i8 i8Var = e0Var.f488644m;
            if (i8Var != null) {
                i8Var.k0(list3 == null ? kz5.p0.f395529d : list3, type, z17);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveAnchorSearchMusicController", "updateMusicListView, musicList:" + list3);
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.i8 i8Var2 = e0Var.f488644m;
            if (i8Var2 != null) {
                i8Var2.k0(list3, type, z17);
            }
            bm2.a0 a0Var = (bm2.a0) ((java.util.LinkedHashMap) e0Var.f488646o).get(type);
            if (a0Var != null) {
                java.lang.Integer num = (java.lang.Integer) ((java.util.LinkedHashMap) ((mm2.c1) e0Var.m56788xbba4bfc0(mm2.c1.class)).Z6().f315415k).get(type);
                a0Var.B(list3, num == null || num.intValue() != 0);
                a0Var.m8153xd399a4d9(size, size2);
            }
        }
        yz5.l lVar = this.f488898m;
        if (lVar != null) {
            java.util.LinkedList m75941xfb8219142 = pt1Var.m75941xfb821914(1);
            lVar.mo146xb9724478(java.lang.Integer.valueOf(m75941xfb8219142 != null ? m75941xfb8219142.size() : 0));
        }
        return jz5.f0.f384359a;
    }
}

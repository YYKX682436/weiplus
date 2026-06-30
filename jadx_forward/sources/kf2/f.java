package kf2;

/* loaded from: classes.dex */
public final class f extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1488x6c222b6a.C14198xcf03f077 f388754d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f388755e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.List f388756f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1488x6c222b6a.C14198xcf03f077 c14198xcf03f077, java.util.List list, java.util.List list2) {
        super(0);
        this.f388754d = c14198xcf03f077;
        this.f388755e = list;
        this.f388756f = list2;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1488x6c222b6a.C14198xcf03f077 c14198xcf03f077 = this.f388754d;
        java.lang.String str = c14198xcf03f077.f193118d;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("updateRect vertical from:");
        java.util.ArrayList arrayList = c14198xcf03f077.f193119e;
        sb6.append(kz5.n0.g0(arrayList, ",", null, null, 0, null, null, 62, null));
        sb6.append(", horizontal from:");
        java.util.ArrayList arrayList2 = c14198xcf03f077.f193120f;
        sb6.append(kz5.n0.g0(arrayList2, ",", null, null, 0, null, null, 62, null));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
        arrayList.clear();
        arrayList2.clear();
        java.util.List list = this.f388755e;
        java.util.ArrayList arrayList3 = new java.util.ArrayList(kz5.d0.q(list, 10));
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList3.add(c14198xcf03f077.a((android.graphics.RectF) it.next()));
        }
        arrayList.addAll(arrayList3);
        java.util.List list2 = this.f388756f;
        java.util.ArrayList arrayList4 = new java.util.ArrayList(kz5.d0.q(list2, 10));
        java.util.Iterator it6 = list2.iterator();
        while (it6.hasNext()) {
            arrayList4.add(c14198xcf03f077.a((android.graphics.RectF) it6.next()));
        }
        arrayList2.addAll(arrayList4);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c14198xcf03f077.f193118d, "updateRect vertical to:" + kz5.n0.g0(arrayList, ",", null, null, 0, null, null, 62, null) + ", horizontal to:" + kz5.n0.g0(arrayList2, ",", null, null, 0, null, null, 62, null));
        return jz5.f0.f384359a;
    }
}

package ba2;

/* loaded from: classes2.dex */
public final class a extends ir2.c {

    /* renamed from: e, reason: collision with root package name */
    public final int f18681e;

    /* renamed from: f, reason: collision with root package name */
    public final long f18682f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.Long f18683g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f18684h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f18685i;

    /* renamed from: m, reason: collision with root package name */
    public final int f18686m;

    /* renamed from: n, reason: collision with root package name */
    public final r45.qt2 f18687n;

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.String f18688o;

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.String f18689p;

    /* renamed from: q, reason: collision with root package name */
    public final int f18690q;

    /* renamed from: r, reason: collision with root package name */
    public final r45.a34 f18691r;

    /* renamed from: s, reason: collision with root package name */
    public final ey2.p2 f18692s;

    public a(int i17, long j17, java.lang.Long l17, java.lang.String str, java.lang.String str2, int i18, com.tencent.mm.protobuf.g gVar, r45.qt2 qt2Var, java.lang.String str3, java.lang.String key, int i19, r45.a34 a34Var) {
        kotlin.jvm.internal.o.g(key, "key");
        this.f18681e = i17;
        this.f18682f = j17;
        this.f18683g = l17;
        this.f18684h = str;
        this.f18685i = str2;
        this.f18686m = i18;
        this.f18687n = qt2Var;
        this.f18688o = str3;
        this.f18689p = key;
        this.f18690q = i19;
        this.f18691r = a34Var;
        androidx.lifecycle.c1 a17 = pf5.u.f353936a.e(c61.l7.class).a(ey2.p2.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        this.f18692s = (ey2.p2) a17;
        this.f294118d = gVar;
    }

    @Override // ir2.c
    public ir2.a f(com.tencent.mm.protobuf.f fVar) {
        r45.oa1 resp = (r45.oa1) fVar;
        kotlin.jvm.internal.o.g(resp, "resp");
        boolean z17 = this.f294118d == null;
        this.f294118d = resp.getByteString(2);
        java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderObject> list = resp.getList(1);
        kotlin.jvm.internal.o.f(list, "getObject(...)");
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list, 10));
        for (com.tencent.mm.protocal.protobuf.FinderObject finderObject : list) {
            i95.m c17 = i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            com.tencent.mm.plugin.finder.report.o3 o3Var = (com.tencent.mm.plugin.finder.report.o3) c17;
            kotlin.jvm.internal.o.d(finderObject);
            r45.qt2 qt2Var = this.f18687n;
            o3Var.rk(finderObject, qt2Var != null ? qt2Var.getInteger(5) : 0, null);
            com.tencent.mm.plugin.finder.storage.FinderItem a17 = com.tencent.mm.plugin.finder.storage.FinderItem.Companion.a(finderObject, 64);
            com.tencent.mm.plugin.finder.feed.ui.FinderTopicFeedUI.I.put(java.lang.Long.valueOf(a17.getId()), a17);
            arrayList.add(cu2.u.f222441a.p(a17));
        }
        com.tencent.mars.xlog.Log.i("Finder.ActivityCgiSource", "handleResp incrementList:" + arrayList + ", innerTabType: " + this.f18686m + ", mediaTabType: " + this.f18690q);
        com.tencent.mm.protobuf.g gVar = this.f294118d;
        ba2.b bVar = new ba2.b(arrayList, gVar == null, gVar);
        bVar.f18693k = (r45.r03) resp.getCustom(5);
        bVar.f294087i = resp.getInteger(3);
        if (z17) {
            java.lang.String str = this.f18689p;
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                this.f18692s.O6(str, arrayList, (r45.r03) resp.getCustom(5));
            }
        }
        return bVar;
    }

    @Override // ir2.c, ir2.a0, ay1.m
    /* renamed from: getKey */
    public ir2.z getF123276h() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(this.f18686m);
        sb6.append('_');
        sb6.append(this.f18690q);
        return new ir2.z(sb6.toString());
    }

    @Override // ir2.c
    public az2.j h() {
        return new db2.t1(this.f18681e, this.f18682f, this.f18683g, this.f18684h, this.f18685i, this.f18686m, this.f294118d, this.f18687n, this.f18688o, this.f18690q, this.f18691r);
    }
}

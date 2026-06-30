package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes10.dex */
public final class hn implements fs2.a {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f106932d;

    /* renamed from: e, reason: collision with root package name */
    public final r45.qt2 f106933e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.feed.rn f106934f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f106935g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.ArrayList f106936h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.ArrayList f106937i;

    /* renamed from: m, reason: collision with root package name */
    public long f106938m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f106939n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f106940o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f106941p;

    public hn(java.lang.String username, r45.qt2 currentReportObj) {
        kotlin.jvm.internal.o.g(username, "username");
        kotlin.jvm.internal.o.g(currentReportObj, "currentReportObj");
        this.f106932d = username;
        this.f106933e = currentReportObj;
        this.f106936h = new java.util.ArrayList();
        this.f106937i = new java.util.ArrayList();
        this.f106938m = android.os.SystemClock.uptimeMillis();
        this.f106939n = true;
        this.f106940o = true;
    }

    public static final so2.k4 c(com.tencent.mm.plugin.finder.feed.hn hnVar, int i17, int i18) {
        hnVar.getClass();
        so2.k4 k4Var = new so2.k4(new r45.bw0(), 1, i17);
        k4Var.f410456f = i18;
        return k4Var;
    }

    public static final java.util.ArrayList f(com.tencent.mm.plugin.finder.feed.hn hnVar, java.util.LinkedList linkedList, int i17) {
        hnVar.getClass();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (linkedList != null) {
            java.util.Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                arrayList.add(new so2.k4((r45.bw0) it.next(), 2, i17));
            }
        }
        return arrayList;
    }

    public final void g(boolean z17, int i17) {
        this.f106938m = android.os.SystemClock.uptimeMillis();
        i95.m c17 = i95.n0.c(cq.k.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        com.tencent.mm.protobuf.g gVar = this.f106935g;
        com.tencent.mm.plugin.finder.feed.bn bnVar = new com.tencent.mm.plugin.finder.feed.bn(this, z17);
        com.tencent.mm.plugin.finder.feed.cn cnVar = new com.tencent.mm.plugin.finder.feed.cn(this);
        java.lang.String friendUsername = this.f106932d;
        kotlin.jvm.internal.o.g(friendUsername, "friendUsername");
        bq.g1 g1Var = new bq.g1(friendUsername, gVar, i17, this.f106933e);
        pm0.v.T(g1Var.l(), new cq.d1(bnVar, g1Var, cnVar));
    }

    @Override // fs2.a
    public void onDetach() {
        this.f106941p = false;
        this.f106937i.clear();
        this.f106936h.clear();
    }
}

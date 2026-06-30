package eb2;

/* loaded from: classes2.dex */
public final class a0 implements db2.u3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ eb2.b0 f332242d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f332243e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ eb2.v f332244f;

    public a0(eb2.b0 b0Var, int i17, eb2.v vVar) {
        this.f332242d = b0Var;
        this.f332243e = i17;
        this.f332244f = vVar;
    }

    @Override // db2.u3
    public void a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.d info, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        eb2.b0 b0Var = this.f332242d;
        int i18 = info.f189297b;
        int i19 = info.f189296a;
        if (i19 == 0 && i18 == 0) {
            b0Var.f332250i.f332392c = info.f189309n;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLbsFeedFetcher", "[call] onFetchDone... pullType=" + i17);
        boolean z17 = info.f189303h != 0;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.n2 n2Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.n2(i19, i18, info.f189298c);
        java.util.LinkedList linkedList = new java.util.LinkedList();
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(b0Var.f332250i.f332393d)) {
            linkedList.addAll(b0Var.f332250i.f332393d);
            b0Var.f332250i.f332393d.clear();
        }
        java.util.Iterator it = info.f189300e.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            so2.j5 j5Var = (so2.j5) it.next();
            if (j5Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 feed = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) j5Var;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feed, "feed");
                r45.dh2 dh2Var = new r45.dh2();
                dh2Var.set(0, 2);
                dh2Var.set(3, feed.getFeedObject().getFeedObject());
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.ja0 ja0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.ja0(dh2Var);
                ja0Var.f208526b = null;
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 feedObject = feed.getFeedObject();
                ja0Var.f208527c = feedObject;
                ja0Var.f208528d = null;
                ja0Var.f208530f = feedObject.getMediaType();
                ja0Var.f208531g = feedObject.m59251x5db1b11();
                linkedList.add(new so2.k(ja0Var));
            }
        }
        n2Var.m56420x2a5f836b(linkedList);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("incrementList size: ");
        java.util.List m56409x97891cf7 = n2Var.m56409x97891cf7();
        sb6.append(m56409x97891cf7 != null ? java.lang.Integer.valueOf(m56409x97891cf7.size()) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLbsFeedFetcher", sb6.toString());
        n2Var.m56423xd4b4a5a1(this.f332243e);
        n2Var.m56421x73095078(info.f189309n);
        n2Var.m56419xdac5ee4d(z17);
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p2) this.f332244f).a(n2Var);
    }
}

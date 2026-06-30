package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e;

/* loaded from: classes2.dex */
public final class ys implements so2.j5 {

    /* renamed from: d, reason: collision with root package name */
    public r45.ww2 f192725d;

    /* renamed from: e, reason: collision with root package name */
    public final int f192726e;

    /* renamed from: f, reason: collision with root package name */
    public java.util.LinkedList f192727f;

    /* renamed from: g, reason: collision with root package name */
    public long f192728g;

    /* renamed from: h, reason: collision with root package name */
    public int f192729h;

    public ys(r45.ww2 card, int i17, java.util.LinkedList rvFeedList) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(card, "card");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rvFeedList, "rvFeedList");
        this.f192725d = card;
        this.f192726e = i17;
        this.f192727f = rvFeedList;
        this.f192728g = c01.id.c();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderStreamCardFeed", "#init");
        this.f192729h = -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.r0
    public int d(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.r0 obj) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(obj, "obj");
        if (!(obj instanceof r45.ww2)) {
            return -1;
        }
        r45.ww2 ww2Var = (r45.ww2) obj;
        return (ww2Var.m75942xfb822ef2(0) == this.f192725d.m75942xfb822ef2(0) && ww2Var.m75939xb282bd08(7) == this.f192725d.m75939xb282bd08(7)) ? 0 : -1;
    }

    @Override // in5.c
    /* renamed from: getItemId */
    public long mo2128x1ed62e84() {
        return this.f192725d.m75942xfb822ef2(14);
    }

    @Override // in5.c
    public int h() {
        int i17 = this.f192726e;
        return i17 != 0 ? i17 != 2 ? i17 != 4 ? 0 : 4 : com.p314xaae8f345.p2926x359365.C25483x77a9a59f.f46369x2e1760d : com.p314xaae8f345.p2926x359365.C25483x77a9a59f.f46355x206ed2ef;
    }
}

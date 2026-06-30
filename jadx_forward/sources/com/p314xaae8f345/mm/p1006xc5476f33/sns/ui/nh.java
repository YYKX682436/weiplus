package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* loaded from: classes4.dex */
public final class nh extends p012xc85e97e9.p093xedfae76a.c1 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19806x4c372b7 f251526d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 f251527e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f251528f;

    /* renamed from: g, reason: collision with root package name */
    public long f251529g;

    /* renamed from: h, reason: collision with root package name */
    public android.content.Context f251530h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f251531i;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.n4 f251532m;

    /* renamed from: n, reason: collision with root package name */
    public int f251533n;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.ArrayList f251534o = new java.util.ArrayList();

    /* renamed from: p, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.p3328x30012e.i2 f251535p;

    /* renamed from: q, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.p3328x30012e.n2 f251536q;

    /* renamed from: r, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.p3328x30012e.i2 f251537r;

    /* renamed from: s, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.p3328x30012e.n2 f251538s;

    /* renamed from: t, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.p3328x30012e.n2 f251539t;

    public nh() {
        u26.u uVar = u26.u.DROP_OLDEST;
        p3325xe03a0797.p3326xc267989b.p3328x30012e.i2 b17 = p3325xe03a0797.p3326xc267989b.p3328x30012e.r2.b(0, 1, uVar, 1, null);
        this.f251535p = b17;
        this.f251536q = p3325xe03a0797.p3326xc267989b.p3328x30012e.l.a(b17);
        p3325xe03a0797.p3326xc267989b.p3328x30012e.i2 b18 = p3325xe03a0797.p3326xc267989b.p3328x30012e.r2.b(0, 1, uVar, 1, null);
        this.f251537r = b18;
        this.f251538s = p3325xe03a0797.p3326xc267989b.p3328x30012e.l.a(b18);
        this.f251539t = p3325xe03a0797.p3326xc267989b.p3328x30012e.l.a(p3325xe03a0797.p3326xc267989b.p3328x30012e.r2.b(0, Integer.MAX_VALUE, null, 5, null));
    }

    public final java.util.ArrayList N6() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getCommentDataList", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUIModel");
        java.util.ArrayList arrayList = this.f251534o;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getCommentDataList", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUIModel");
        return arrayList;
    }

    public final long O6() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getEnterCommentId", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUIModel");
        long j17 = this.f251529g;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getEnterCommentId", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUIModel");
        return j17;
    }

    public final java.lang.String P6() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getSnsId", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUIModel");
        java.lang.String str = this.f251528f;
        if (str != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSnsId", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUIModel");
            return str;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("snsId");
        throw null;
    }

    /* renamed from: clear */
    public final void m71155x5a5b64d() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("clear", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUIModel");
        java.util.ArrayList arrayList = this.f251534o;
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ei) it.next()).d();
        }
        arrayList.clear();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("clear", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUIModel");
    }
}

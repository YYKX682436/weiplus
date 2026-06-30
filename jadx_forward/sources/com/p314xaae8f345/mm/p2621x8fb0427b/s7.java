package com.p314xaae8f345.mm.p2621x8fb0427b;

/* loaded from: classes4.dex */
public class s7 {

    /* renamed from: c, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p2621x8fb0427b.s7 f276832c = new com.p314xaae8f345.mm.p2621x8fb0427b.s7("timeline");

    /* renamed from: d, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p2621x8fb0427b.s7 f276833d = new com.p314xaae8f345.mm.p2621x8fb0427b.s7("album_friend");

    /* renamed from: e, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p2621x8fb0427b.s7 f276834e = new com.p314xaae8f345.mm.p2621x8fb0427b.s7("album_self");

    /* renamed from: f, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p2621x8fb0427b.s7 f276835f = new com.p314xaae8f345.mm.p2621x8fb0427b.s7("album_stranger");

    /* renamed from: g, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p2621x8fb0427b.s7 f276836g = new com.p314xaae8f345.mm.p2621x8fb0427b.s7("profile_friend");

    /* renamed from: h, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p2621x8fb0427b.s7 f276837h = new com.p314xaae8f345.mm.p2621x8fb0427b.s7("profile_stranger");

    /* renamed from: i, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p2621x8fb0427b.s7 f276838i = new com.p314xaae8f345.mm.p2621x8fb0427b.s7(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37641x4a9d0f2f);

    /* renamed from: j, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p2621x8fb0427b.s7 f276839j = new com.p314xaae8f345.mm.p2621x8fb0427b.s7("comment_detail");

    /* renamed from: k, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p2621x8fb0427b.s7 f276840k = new com.p314xaae8f345.mm.p2621x8fb0427b.s7("other");

    /* renamed from: l, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p2621x8fb0427b.s7 f276841l = new com.p314xaae8f345.mm.p2621x8fb0427b.s7("snssight");

    /* renamed from: m, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p2621x8fb0427b.s7 f276842m = new com.p314xaae8f345.mm.p2621x8fb0427b.s7("fts");

    /* renamed from: n, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p2621x8fb0427b.s7 f276843n = new com.p314xaae8f345.mm.p2621x8fb0427b.s7("storysight");

    /* renamed from: o, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p2621x8fb0427b.s7 f276844o = new com.p314xaae8f345.mm.p2621x8fb0427b.s7("storyalbum");

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f276845a;

    /* renamed from: b, reason: collision with root package name */
    public int f276846b = 0;

    public s7(java.lang.String str) {
        this.f276845a = "";
        this.f276845a = str;
    }

    public static com.p314xaae8f345.mm.p2621x8fb0427b.s7 a() {
        return new com.p314xaae8f345.mm.p2621x8fb0427b.s7("album_self");
    }

    public static com.p314xaae8f345.mm.p2621x8fb0427b.s7 c() {
        return new com.p314xaae8f345.mm.p2621x8fb0427b.s7("snssight");
    }

    public static com.p314xaae8f345.mm.p2621x8fb0427b.s7 d() {
        return new com.p314xaae8f345.mm.p2621x8fb0427b.s7("timeline");
    }

    public com.p314xaae8f345.mm.p2621x8fb0427b.s7 b(int i17) {
        this.f276846b = i17;
        return this;
    }

    /* renamed from: equals */
    public boolean m78111xb2c87fbf(java.lang.Object obj) {
        return obj instanceof com.p314xaae8f345.mm.p2621x8fb0427b.s7 ? ((com.p314xaae8f345.mm.p2621x8fb0427b.s7) obj).f276845a.equals(this.f276845a) : super.equals(obj);
    }

    /* renamed from: toString */
    public java.lang.String m78112x9616526c() {
        return this.f276845a + "@" + this.f276846b;
    }
}

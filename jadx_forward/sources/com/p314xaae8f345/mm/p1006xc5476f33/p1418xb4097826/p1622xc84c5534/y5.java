package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534;

/* loaded from: classes2.dex */
public final class y5 extends fc2.a {

    /* renamed from: d, reason: collision with root package name */
    public final long f207006d;

    /* renamed from: e, reason: collision with root package name */
    public final r45.mb4 f207007e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f207008f;

    /* renamed from: g, reason: collision with root package name */
    public final int f207009g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.LinkedList f207010h;

    /* renamed from: i, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 f207011i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f207012j;

    /* renamed from: k, reason: collision with root package name */
    public final java.util.LinkedList f207013k;

    public y5(long j17, r45.mb4 media, java.lang.String objectNonceId, int i17, java.util.LinkedList mediaList, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 feed, boolean z17, java.util.LinkedList linkedList) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(media, "media");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(objectNonceId, "objectNonceId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaList, "mediaList");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feed, "feed");
        this.f207006d = j17;
        this.f207007e = media;
        this.f207008f = objectNonceId;
        this.f207009g = i17;
        this.f207010h = mediaList;
        this.f207011i = feed;
        this.f207012j = z17;
        this.f207013k = linkedList;
    }

    public final long b() {
        return this.f207006d;
    }

    public final int c() {
        return this.f207009g;
    }

    public final r45.mb4 d() {
        return this.f207007e;
    }

    public final java.util.LinkedList e() {
        return this.f207013k;
    }

    /* renamed from: equals */
    public boolean m58917xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.y5)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.y5 y5Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.y5) obj;
        return this.f207006d == y5Var.f207006d && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f207007e, y5Var.f207007e) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f207008f, y5Var.f207008f) && this.f207009g == y5Var.f207009g && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f207010h, y5Var.f207010h) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f207011i, y5Var.f207011i) && this.f207012j == y5Var.f207012j && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f207013k, y5Var.f207013k);
    }

    public final boolean f() {
        return this.f207012j;
    }

    /* renamed from: hashCode */
    public int m58918x8cdac1b() {
        int hashCode = ((((((((((((java.lang.Long.hashCode(this.f207006d) * 31) + this.f207007e.hashCode()) * 31) + this.f207008f.hashCode()) * 31) + java.lang.Integer.hashCode(this.f207009g)) * 31) + this.f207010h.hashCode()) * 31) + this.f207011i.m58305x8cdac1b()) * 31) + java.lang.Boolean.hashCode(this.f207012j)) * 31;
        java.util.LinkedList linkedList = this.f207013k;
        return hashCode + (linkedList == null ? 0 : linkedList.hashCode());
    }

    /* renamed from: toString */
    public java.lang.String m58919x9616526c() {
        return "PageChangeEvent(feedId=" + this.f207006d + ", media=" + this.f207007e + ", objectNonceId=" + this.f207008f + ", index=" + this.f207009g + ", mediaList=" + this.f207010h + ", feed=" + this.f207011i + ", isAuto=" + this.f207012j + ", viewInfos=" + this.f207013k + ')';
    }
}

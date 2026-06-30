package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public final class rq implements java.lang.Comparable<com.tencent.mapsdk.internal.rq> {

    /* renamed from: a, reason: collision with root package name */
    public final int f51249a;

    /* renamed from: b, reason: collision with root package name */
    public final int f51250b;

    /* renamed from: c, reason: collision with root package name */
    public final int f51251c;

    public rq(int i17, int i18, int i19) {
        this.f51249a = i17;
        this.f51250b = i18;
        this.f51251c = i19;
    }

    private int a(com.tencent.mapsdk.internal.rq rqVar) {
        return this.f51249a - rqVar.f51249a;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(com.tencent.mapsdk.internal.rq rqVar) {
        return this.f51249a - rqVar.f51249a;
    }
}

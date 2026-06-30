package com.p314xaae8f345.mm.p2830x630df168.p2831xc0404e27.p2832x21ffc6bd;

/* loaded from: classes11.dex */
public final class n1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f296563d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f296564e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f296565f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f296566g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f296567h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2830x630df168.p2831xc0404e27.p2832x21ffc6bd.v1 f296568i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ float f296569m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n1(java.lang.String str, java.util.List list, boolean z17, int i17, int i18, com.p314xaae8f345.mm.p2830x630df168.p2831xc0404e27.p2832x21ffc6bd.v1 v1Var, float f17) {
        super(0);
        this.f296563d = str;
        this.f296564e = list;
        this.f296565f = z17;
        this.f296566g = i17;
        this.f296567h = i18;
        this.f296568i = v1Var;
        this.f296569m = f17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("TileManager. refreshTiles:");
        sb6.append(this.f296563d);
        sb6.append(". interrupted, foregroundTiles is null or size is 1. foregroundTilesSize=");
        java.util.List list = this.f296564e;
        sb6.append(list != null ? list.size() : 0);
        sb6.append(", sampleSizeChanged=");
        sb6.append(this.f296565f);
        sb6.append(", sampleSize=");
        sb6.append(this.f296566g);
        sb6.append(" -> ");
        sb6.append(this.f296567h);
        sb6.append(", imageSize=");
        com.p314xaae8f345.mm.p2830x630df168.p2831xc0404e27.p2832x21ffc6bd.v1 v1Var = this.f296568i;
        sb6.append(zq5.h.f(v1Var.f296660e.f546124a));
        sb6.append(", contentSize=");
        sb6.append(zq5.h.f(v1Var.f296661f));
        sb6.append(", scale=");
        sb6.append(zq5.b.c(this.f296569m, 4));
        sb6.append(", preferredTileSize=");
        sb6.append(zq5.h.f(v1Var.f296662g));
        sb6.append(", tileGridMap=");
        sb6.append(com.p314xaae8f345.mm.p2830x630df168.p2831xc0404e27.p2832x21ffc6bd.q0.c(v1Var.f296675t));
        sb6.append(". '");
        sb6.append(v1Var.f296657b.a());
        sb6.append('\'');
        return sb6.toString();
    }
}

package com.p314xaae8f345.mm.p2830x630df168.p2831xc0404e27.p2832x21ffc6bd;

/* loaded from: classes11.dex */
public final class y0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2830x630df168.p2831xc0404e27.p2832x21ffc6bd.v1 f296695d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f296696e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(com.p314xaae8f345.mm.p2830x630df168.p2831xc0404e27.p2832x21ffc6bd.v1 v1Var, int i17) {
        super(0);
        this.f296695d = v1Var;
        this.f296696e = i17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("TileManager. init. imageSize=");
        com.p314xaae8f345.mm.p2830x630df168.p2831xc0404e27.p2832x21ffc6bd.v1 v1Var = this.f296695d;
        sb6.append(zq5.h.f(v1Var.f296660e.f546124a));
        sb6.append(", contentSize=");
        sb6.append(zq5.h.f(v1Var.f296661f));
        sb6.append(", preferredTileSize=");
        sb6.append(zq5.h.f(v1Var.f296662g));
        sb6.append(", maxSampleSize=");
        sb6.append(this.f296696e);
        sb6.append(", sortedTileGridMap=");
        sb6.append(com.p314xaae8f345.mm.p2830x630df168.p2831xc0404e27.p2832x21ffc6bd.q0.c(v1Var.f296675t));
        sb6.append(". '");
        sb6.append(v1Var.f296657b.a());
        sb6.append('\'');
        return sb6.toString();
    }
}

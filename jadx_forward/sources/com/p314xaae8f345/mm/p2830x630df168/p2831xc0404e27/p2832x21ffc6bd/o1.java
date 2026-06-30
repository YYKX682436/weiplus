package com.p314xaae8f345.mm.p2830x630df168.p2831xc0404e27.p2832x21ffc6bd;

/* loaded from: classes11.dex */
public final class o1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f296580d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zq5.e f296581e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ zq5.e f296582f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2830x630df168.p2831xc0404e27.p2832x21ffc6bd.v1 f296583g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ zq5.e f296584h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o1(java.lang.String str, zq5.e eVar, zq5.e eVar2, com.p314xaae8f345.mm.p2830x630df168.p2831xc0404e27.p2832x21ffc6bd.v1 v1Var, zq5.e eVar3) {
        super(0);
        this.f296580d = str;
        this.f296581e = eVar;
        this.f296582f = eVar2;
        this.f296583g = v1Var;
        this.f296584h = eVar3;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("TileManager. refreshTiles:");
        sb6.append(this.f296580d);
        sb6.append(". interrupted, imageLoadRect is empty. imageLoadRect=");
        sb6.append(zq5.f.b(this.f296581e));
        sb6.append(" -> ");
        sb6.append(zq5.f.b(this.f296582f));
        sb6.append(", imageSize=");
        com.p314xaae8f345.mm.p2830x630df168.p2831xc0404e27.p2832x21ffc6bd.v1 v1Var = this.f296583g;
        sb6.append(zq5.h.f(v1Var.f296660e.f546124a));
        sb6.append(", contentSize=");
        sb6.append(zq5.h.f(v1Var.f296661f));
        sb6.append(", preferredTileSize=");
        sb6.append(zq5.h.f(v1Var.f296662g));
        sb6.append(", contentVisibleRect=");
        sb6.append(zq5.f.b(this.f296584h));
        sb6.append(", '");
        sb6.append(v1Var.f296657b.a());
        sb6.append('\'');
        return sb6.toString();
    }
}

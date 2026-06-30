package com.p314xaae8f345.mm.p2830x630df168.p2831xc0404e27.p2832x21ffc6bd;

/* loaded from: classes11.dex */
public final class p1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f296588d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f296589e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.f0 f296590f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.f0 f296591g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.f0 f296592h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.f0 f296593i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f296594m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f296595n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ java.util.List f296596o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ zq5.e f296597p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ zq5.e f296598q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ float f296599r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ zq5.e f296600s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2830x630df168.p2831xc0404e27.p2832x21ffc6bd.v1 f296601t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p1(int i17, java.lang.String str, p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var, p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var2, p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var3, p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var4, int i18, int i19, java.util.List list, zq5.e eVar, zq5.e eVar2, float f17, zq5.e eVar3, com.p314xaae8f345.mm.p2830x630df168.p2831xc0404e27.p2832x21ffc6bd.v1 v1Var) {
        super(0);
        this.f296588d = i17;
        this.f296589e = str;
        this.f296590f = f0Var;
        this.f296591g = f0Var2;
        this.f296592h = f0Var3;
        this.f296593i = f0Var4;
        this.f296594m = i18;
        this.f296595n = i19;
        this.f296596o = list;
        this.f296597p = eVar;
        this.f296598q = eVar2;
        this.f296599r = f17;
        this.f296600s = eVar3;
        this.f296601t = v1Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.String a17 = gr5.s.f356479a.a(this.f296588d);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("TileManager. refreshTiles:");
        sb6.append(this.f296589e);
        sb6.append(". loadCount=");
        sb6.append(this.f296590f.f391649d);
        sb6.append('/');
        sb6.append(this.f296591g.f391649d);
        sb6.append(", freeCount=");
        sb6.append(this.f296592h.f391649d);
        sb6.append('/');
        sb6.append(this.f296593i.f391649d);
        sb6.append(". sampleSize=");
        sb6.append(this.f296594m);
        sb6.append(" -> ");
        sb6.append(this.f296595n);
        sb6.append(", foregroundTiles=");
        sb6.append(this.f296596o.size());
        sb6.append(", imageLoadRect=");
        sb6.append(zq5.f.b(this.f296597p));
        sb6.append(" -> ");
        sb6.append(zq5.f.b(this.f296598q));
        sb6.append(". scale=");
        sb6.append(this.f296599r);
        sb6.append(", contentVisibleRect=");
        sb6.append(zq5.f.b(this.f296600s));
        sb6.append(", contentSize=");
        com.p314xaae8f345.mm.p2830x630df168.p2831xc0404e27.p2832x21ffc6bd.v1 v1Var = this.f296601t;
        sb6.append(zq5.h.f(v1Var.f296661f));
        sb6.append(", continuousTransformType=");
        sb6.append(a17);
        sb6.append(", imageInfo=");
        sb6.append(v1Var.f296660e.a());
        sb6.append(", '");
        sb6.append(v1Var.f296657b.a());
        return sb6.toString();
    }
}

package wp2;

/* loaded from: classes2.dex */
public abstract class b extends so2.h1 implements wp2.a {

    /* renamed from: o, reason: collision with root package name */
    public final r45.ea2 f529916o;

    /* renamed from: p, reason: collision with root package name */
    public final r45.fa2 f529917p;

    /* renamed from: q, reason: collision with root package name */
    public final java.lang.String f529918q;

    /* renamed from: r, reason: collision with root package name */
    public final java.lang.String f529919r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f529920s;

    /* renamed from: t, reason: collision with root package name */
    public r45.d94 f529921t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 feedObject, r45.ea2 streamCard, r45.fa2 container, java.lang.String str, java.lang.String str2, boolean z17) {
        super(feedObject);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feedObject, "feedObject");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(streamCard, "streamCard");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(container, "container");
        this.f529916o = streamCard;
        this.f529917p = container;
        this.f529918q = str;
        this.f529919r = str2;
        this.f529920s = z17;
        r45.d94 d94Var = new r45.d94();
        d94Var.set(0, java.lang.Long.valueOf(feedObject.getFeedObject().m76784x5db1b11()));
        this.f529921t = d94Var;
    }

    @Override // wp2.a
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g a() {
        return this.f529917p.f455665n;
    }

    @Override // wp2.a
    public void b(int i17) {
        this.f529917p.f455663i = i17;
    }

    @Override // wp2.a
    public int c() {
        return 1;
    }

    @Override // wp2.a
    public void f(com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar) {
        this.f529917p.f455665n = gVar;
    }

    @Override // wp2.a
    public java.util.List g() {
        return kz5.c0.k(java.lang.Long.valueOf(getFeedObject().getFeedObject().m76784x5db1b11()));
    }

    public abstract int g2();

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5, in5.c
    public int h() {
        return g2();
    }

    @Override // wp2.a
    public int i() {
        return this.f529917p.f455658d;
    }
}

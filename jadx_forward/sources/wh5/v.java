package wh5;

/* loaded from: classes12.dex */
public final class v implements mf3.k, uh5.i {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2621x8fb0427b.f9 f527629a;

    /* renamed from: b, reason: collision with root package name */
    public final bm5.b0 f527630b;

    /* renamed from: c, reason: collision with root package name */
    public mf3.w f527631c;

    public v(com.p314xaae8f345.mm.p2621x8fb0427b.f9 msgInfo, bm5.b0 fileDescriptor) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgInfo, "msgInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fileDescriptor, "fileDescriptor");
        this.f527629a = msgInfo;
        this.f527630b = fileDescriptor;
        this.f527631c = mf3.w.f407661d;
    }

    @Override // mf3.k
    public gg3.c a() {
        java.lang.String mo2110x5db1b11 = mo2110x5db1b11();
        java.lang.String c17 = e().a(sf3.m.f488937f).c();
        if (c17 == null) {
            c17 = "";
        }
        return new gg3.c(mo2110x5db1b11, c17, g(), null, 0L, false, 40, null);
    }

    @Override // uh5.i
    public com.p314xaae8f345.mm.p2621x8fb0427b.f9 b() {
        return this.f527629a;
    }

    @Override // mf3.k
    public eg3.i c() {
        return null;
    }

    public final l70.d d() {
        s70.c cVar = wh5.t.f527627a[this.f527631c.ordinal()] == 1 ? s70.c.f485453h : s70.c.f485452g;
        try {
            i95.m c17 = i95.n0.c(xs.d1.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            return xs.d1.H5((xs.d1) c17, this.f527629a, cVar, false, 4, null);
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    @Override // mf3.k
    public sf3.g e() {
        java.lang.String mediaId = mo2110x5db1b11();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaId, "mediaId");
        java.util.Map linkedHashMap = new java.util.LinkedHashMap();
        sf3.m mVar = sf3.m.f488937f;
        bm5.f0 f0Var = bm5.f0.f104096h;
        bm5.b0 b0Var = this.f527630b;
        linkedHashMap.put(mVar, bm5.b0.a(b0Var, f0Var, false, 2, null));
        sf3.m mVar2 = sf3.m.f488936e;
        linkedHashMap.put(mVar2, bm5.b0.a(b0Var, bm5.f0.f104095g, false, 2, null));
        linkedHashMap.put(sf3.m.f488939h, bm5.b0.a(b0Var, bm5.f0.f104097i, false, 2, null));
        if ((60 & 1) != 0) {
            linkedHashMap = kz5.q0.f395534d;
        }
        java.util.Map map = linkedHashMap;
        java.lang.String previewPath = (60 & 4) != 0 ? "" : null;
        java.lang.String detectPath = (60 & 8) != 0 ? "" : null;
        sf3.m detectType = (60 & 16) != 0 ? sf3.m.f488935d : null;
        sf3.b loadStrategy = (60 & 32) != 0 ? new sf3.b() : null;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(previewPath, "previewPath");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(detectPath, "detectPath");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(detectType, "detectType");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(loadStrategy, "loadStrategy");
        sf3.m mVar3 = wh5.t.f527627a[this.f527631c.ordinal()] == 1 ? mVar2 : mVar;
        sf3.g gVar = new sf3.g(map, mediaId, previewPath, detectPath, null, loadStrategy, 16, null);
        java.lang.String str = (java.lang.String) gVar.f488920a.get(mVar3);
        gVar.f488923d = str != null ? str : "";
        gVar.f488924e = mVar3;
        gVar.f488925f = new wh5.u(this);
        return gVar;
    }

    @Override // mf3.k
    public void f(mf3.w level) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(level, "level");
        this.f527631c = level;
    }

    @Override // mf3.k
    public java.lang.String g() {
        int i17 = wh5.t.f527627a[this.f527631c.ordinal()];
        bm5.b0 b0Var = this.f527630b;
        return i17 == 1 ? bm5.b0.a(b0Var, bm5.f0.f104102q, false, 2, null) : bm5.b0.a(b0Var, bm5.f0.f104101p, false, 2, null);
    }

    @Override // mf3.k
    /* renamed from: getId */
    public java.lang.String mo2110x5db1b11() {
        return java.lang.String.valueOf(this.f527629a.m124847x74d37ac6());
    }

    @Override // mf3.k
    /* renamed from: getLevel */
    public mf3.w mo147256x74bf41ce() {
        return this.f527631c;
    }

    @Override // mf3.k
    /* renamed from: getType */
    public mf3.u mo2109xfb85f7b0() {
        return mf3.u.f407658g;
    }

    public final l70.d h() {
        s70.c cVar = wh5.t.f527627a[this.f527631c.ordinal()] == 1 ? s70.c.f485455m : s70.c.f485454i;
        try {
            i95.m c17 = i95.n0.c(xs.d1.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            return xs.d1.H5((xs.d1) c17, this.f527629a, cVar, false, 4, null);
        } catch (java.lang.Exception unused) {
            return null;
        }
    }
}

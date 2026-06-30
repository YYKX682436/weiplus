package th5;

/* loaded from: classes12.dex */
public final class o extends th5.b {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f500952d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f500953e;

    /* renamed from: f, reason: collision with root package name */
    public mf3.w f500954f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f500955g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f500956h;

    /* renamed from: i, reason: collision with root package name */
    public float f500957i;

    /* renamed from: j, reason: collision with root package name */
    public yz5.l f500958j;

    /* renamed from: k, reason: collision with root package name */
    public yz5.a f500959k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(int i17, java.lang.String originUrl, java.lang.String thumbUrl, long j17, com.p314xaae8f345.mm.p689xc5a27af6.p750xf44c7752.api.C10611x5d5fb73d bizData) {
        super(i17, j17, bizData);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(originUrl, "originUrl");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(thumbUrl, "thumbUrl");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bizData, "bizData");
        this.f500952d = originUrl;
        this.f500953e = thumbUrl;
        this.f500954f = mf3.w.f407661d;
        this.f500955g = "";
        this.f500956h = "";
        th5.m mVar = th5.m.f500940a;
        java.lang.String a17 = mVar.a(b());
        if (com.p314xaae8f345.mm.vfs.w6.j(a17)) {
            this.f500956h = a17;
            if (d()) {
                this.f500954f = mf3.w.f407662e;
            }
        }
        java.lang.String b17 = mVar.b(b());
        if ((this.f500955g.length() == 0) && com.p314xaae8f345.mm.vfs.w6.j(b17)) {
            this.f500955g = b17;
        }
    }

    @Override // mf3.k
    public gg3.c a() {
        return null;
    }

    public final java.lang.String b() {
        th5.a1 a1Var = th5.a1.f500873a;
        java.lang.String a17 = a1Var.a(this.f500952d);
        java.lang.String a18 = a1Var.a(this.f500953e);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(this.f500875a);
        sb6.append('_');
        sb6.append(a17.hashCode());
        sb6.append('_');
        sb6.append(a18.hashCode());
        return r26.i0.u(sb6.toString(), '-', '_', false, 4, null);
    }

    @Override // mf3.k
    public eg3.i c() {
        return null;
    }

    public final boolean d() {
        java.lang.String str = this.f500952d;
        if (!r26.n0.N(str)) {
            java.lang.String str2 = this.f500953e;
            if ((!r26.n0.N(str2)) && !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, str2)) {
                return true;
            }
        }
        return false;
    }

    @Override // mf3.k
    public sf3.g e() {
        java.lang.String path = this.f500955g;
        if (path.length() == 0) {
            path = th5.m.f500940a.b(b());
        }
        java.lang.String path2 = this.f500956h;
        if (path2.length() == 0) {
            path2 = th5.m.f500940a.a(b());
        }
        java.lang.String mediaId = mo2110x5db1b11();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaId, "mediaId");
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        sf3.m mVar = sf3.m.f488939h;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        linkedHashMap.put(mVar, path);
        sf3.m mVar2 = sf3.m.f488937f;
        linkedHashMap.put(mVar2, path);
        sf3.m mVar3 = sf3.m.f488936e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path2, "path");
        linkedHashMap.put(mVar3, path2);
        java.util.Map map = (60 & 1) != 0 ? kz5.q0.f395534d : linkedHashMap;
        java.lang.String previewPath = (60 & 4) != 0 ? "" : null;
        java.lang.String detectPath = (60 & 8) != 0 ? "" : null;
        sf3.m detectType = (60 & 16) != 0 ? sf3.m.f488935d : null;
        sf3.b loadStrategy = (60 & 32) != 0 ? new sf3.b() : null;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(previewPath, "previewPath");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(detectPath, "detectPath");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(detectType, "detectType");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(loadStrategy, "loadStrategy");
        if (th5.n.f500947a[this.f500954f.ordinal()] != 1) {
            if (!(this.f500956h.length() > 0) || !com.p314xaae8f345.mm.vfs.w6.j(this.f500956h)) {
                mVar3 = mVar2;
            }
        }
        sf3.g gVar = new sf3.g(map, mediaId, previewPath, detectPath, null, loadStrategy, 16, null);
        java.lang.String str = (java.lang.String) gVar.f488920a.get(mVar3);
        gVar.f488923d = str != null ? str : "";
        gVar.f488924e = mVar3;
        gVar.f488925f = new th5.x();
        return gVar;
    }

    @Override // mf3.k
    public void f(mf3.w level) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(level, "level");
        this.f500954f = level;
    }

    @Override // mf3.k
    public java.lang.String g() {
        if ((this.f500956h.length() > 0) && com.p314xaae8f345.mm.vfs.w6.j(this.f500956h)) {
            return this.f500956h;
        }
        if ((this.f500955g.length() > 0) && com.p314xaae8f345.mm.vfs.w6.j(this.f500955g)) {
            return this.f500955g;
        }
        java.lang.String str = this.f500955g;
        return str.length() == 0 ? this.f500956h : str;
    }

    @Override // mf3.k
    /* renamed from: getId */
    public java.lang.String mo2110x5db1b11() {
        return "biz_photo_img_".concat(b());
    }

    @Override // mf3.k
    /* renamed from: getLevel */
    public mf3.w mo147256x74bf41ce() {
        return this.f500954f;
    }

    @Override // mf3.k
    /* renamed from: getType */
    public mf3.u mo2109xfb85f7b0() {
        return mf3.u.f407656e;
    }
}

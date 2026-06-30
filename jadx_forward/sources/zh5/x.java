package zh5;

/* loaded from: classes12.dex */
public final class x extends zh5.a {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(java.lang.String mediaId, java.lang.String uriString, e60.t0 config) {
        super(mediaId, uriString, config);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaId, "mediaId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(uriString, "uriString");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(config, "config");
    }

    @Override // mf3.k
    public gg3.c a() {
        return new gg3.c(this.f554524a, this.f554526c, this.f554528e, null, this.f554529f, false, 40, null);
    }

    @Override // mf3.k
    public eg3.i c() {
        return null;
    }

    @Override // zh5.a
    public dn.m d() {
        java.lang.String str = "favDataItem" + this.f554524a;
        dn.m mVar = this.f554527d;
        mVar.f69601xaca5bdda = str;
        e60.t0 t0Var = this.f554525b;
        mVar.f323318d = t0Var.f331266d;
        mVar.f69609xd84b8349 = t0Var.f331267e;
        mVar.f69592xf1ebe47b = 4;
        mVar.f69594x4b409164 = false;
        return mVar;
    }

    @Override // mf3.k
    public sf3.g e() {
        java.lang.String mediaId = this.f554524a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaId, "mediaId");
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        sf3.m mVar = sf3.m.f488937f;
        java.lang.String path = this.f554526c;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        linkedHashMap.put(mVar, path);
        return new sf3.g(linkedHashMap, mediaId, null, null, null, null, 60, null).a(mVar);
    }

    @Override // zh5.a, mf3.k
    public java.lang.String g() {
        return this.f554528e;
    }

    @Override // zh5.a, mf3.k
    /* renamed from: getId */
    public java.lang.String mo2110x5db1b11() {
        return this.f554524a;
    }

    @Override // mf3.k
    /* renamed from: getType */
    public mf3.u mo2109xfb85f7b0() {
        return mf3.u.f407657f;
    }
}

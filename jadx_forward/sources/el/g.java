package el;

/* loaded from: classes9.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f335230a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f335231b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f335232c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f335233d;

    /* renamed from: e, reason: collision with root package name */
    public final int f335234e;

    /* renamed from: f, reason: collision with root package name */
    public final int f335235f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f335236g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f335237h;

    /* renamed from: i, reason: collision with root package name */
    public final int f335238i;

    /* renamed from: j, reason: collision with root package name */
    public final java.lang.String f335239j;

    /* renamed from: k, reason: collision with root package name */
    public final java.lang.String f335240k;

    /* renamed from: l, reason: collision with root package name */
    public final java.lang.String f335241l;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f335242m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f335243n;

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.String f335244o;

    /* renamed from: p, reason: collision with root package name */
    public final java.util.LinkedList f335245p;

    /* renamed from: q, reason: collision with root package name */
    public final int f335246q;

    public g(java.lang.String appId, java.lang.String title, java.lang.String desc, java.lang.String identifier, int i17, int i18, java.lang.String url, java.lang.String nickName, int i19, java.lang.String page, java.lang.String query, java.lang.String thumbUrl, java.lang.String transferCtx, boolean z17, java.lang.String srcId, java.util.LinkedList excerptList, int i27) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(title, "title");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(desc, "desc");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(identifier, "identifier");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(nickName, "nickName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(page, "page");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(query, "query");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(thumbUrl, "thumbUrl");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(transferCtx, "transferCtx");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(srcId, "srcId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(excerptList, "excerptList");
        this.f335230a = appId;
        this.f335231b = title;
        this.f335232c = desc;
        this.f335233d = identifier;
        this.f335234e = i17;
        this.f335235f = i18;
        this.f335236g = url;
        this.f335237h = nickName;
        this.f335238i = i19;
        this.f335239j = page;
        this.f335240k = query;
        this.f335241l = thumbUrl;
        this.f335242m = transferCtx;
        this.f335243n = z17;
        this.f335244o = srcId;
        this.f335245p = excerptList;
        this.f335246q = i27;
    }

    /* renamed from: equals */
    public boolean m127809xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof el.g)) {
            return false;
        }
        el.g gVar = (el.g) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f335230a, gVar.f335230a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f335231b, gVar.f335231b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f335232c, gVar.f335232c) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f335233d, gVar.f335233d) && this.f335234e == gVar.f335234e && this.f335235f == gVar.f335235f && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f335236g, gVar.f335236g) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f335237h, gVar.f335237h) && this.f335238i == gVar.f335238i && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f335239j, gVar.f335239j) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f335240k, gVar.f335240k) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f335241l, gVar.f335241l) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f335242m, gVar.f335242m) && this.f335243n == gVar.f335243n && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f335244o, gVar.f335244o) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f335245p, gVar.f335245p) && this.f335246q == gVar.f335246q;
    }

    /* renamed from: hashCode */
    public int m127810x8cdac1b() {
        return (((((((((((((((((((((((((((((((this.f335230a.hashCode() * 31) + this.f335231b.hashCode()) * 31) + this.f335232c.hashCode()) * 31) + this.f335233d.hashCode()) * 31) + java.lang.Integer.hashCode(this.f335234e)) * 31) + java.lang.Integer.hashCode(this.f335235f)) * 31) + this.f335236g.hashCode()) * 31) + this.f335237h.hashCode()) * 31) + java.lang.Integer.hashCode(this.f335238i)) * 31) + this.f335239j.hashCode()) * 31) + this.f335240k.hashCode()) * 31) + this.f335241l.hashCode()) * 31) + this.f335242m.hashCode()) * 31) + java.lang.Boolean.hashCode(this.f335243n)) * 31) + this.f335244o.hashCode()) * 31) + this.f335245p.hashCode()) * 31) + java.lang.Integer.hashCode(this.f335246q);
    }

    /* renamed from: toString */
    public java.lang.String m127811x9616526c() {
        return "LiteAppFavoriteAction(appId=" + this.f335230a + ", title=" + this.f335231b + ", desc=" + this.f335232c + ", identifier=" + this.f335233d + ", bizId=" + this.f335234e + ", mediaType=" + this.f335235f + ", url=" + this.f335236g + ", nickName=" + this.f335237h + ", jumpType=" + this.f335238i + ", page=" + this.f335239j + ", query=" + this.f335240k + ", thumbUrl=" + this.f335241l + ", transferCtx=" + this.f335242m + ", isTransparent=" + this.f335243n + ", srcId=" + this.f335244o + ", excerptList=" + this.f335245p + ", actionType=" + this.f335246q + ')';
    }
}

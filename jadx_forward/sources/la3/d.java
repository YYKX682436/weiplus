package la3;

/* loaded from: classes8.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final int f399050a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f399051b;

    /* renamed from: c, reason: collision with root package name */
    public final int f399052c;

    /* renamed from: d, reason: collision with root package name */
    public final int f399053d;

    /* renamed from: e, reason: collision with root package name */
    public final int f399054e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f399055f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f399056g;

    /* renamed from: h, reason: collision with root package name */
    public final la3.a f399057h;

    public d(int i17, java.lang.String url, int i18, int i19, int i27, boolean z17, java.lang.String appId, la3.a aVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        this.f399050a = i17;
        this.f399051b = url;
        this.f399052c = i18;
        this.f399053d = i19;
        this.f399054e = i27;
        this.f399055f = z17;
        this.f399056g = appId;
        this.f399057h = aVar;
    }

    public final void a(java.lang.String eventName, java.util.Map params) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(eventName, "eventName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(params, "params");
        la3.a aVar = this.f399057h;
        if (aVar != null) {
            la3.j jVar = (la3.j) aVar;
            try {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppWebviewView", "the " + eventName + " is called, params is " + params);
                io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2 c28688xe8dbe4c2 = jVar.f399072d;
                if (c28688xe8dbe4c2 != null) {
                    c28688xe8dbe4c2.m138438xd8c5c779(eventName, params);
                }
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LiteAppWebviewView", "the " + eventName + " exception: " + th6.getMessage());
            }
        }
    }

    /* renamed from: equals */
    public boolean m145463xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof la3.d)) {
            return false;
        }
        la3.d dVar = (la3.d) obj;
        return this.f399050a == dVar.f399050a && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f399051b, dVar.f399051b) && this.f399052c == dVar.f399052c && this.f399053d == dVar.f399053d && this.f399054e == dVar.f399054e && this.f399055f == dVar.f399055f && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f399056g, dVar.f399056g) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f399057h, dVar.f399057h);
    }

    /* renamed from: hashCode */
    public int m145464x8cdac1b() {
        int hashCode = ((((((((((((java.lang.Integer.hashCode(this.f399050a) * 31) + this.f399051b.hashCode()) * 31) + java.lang.Integer.hashCode(this.f399052c)) * 31) + java.lang.Integer.hashCode(this.f399053d)) * 31) + java.lang.Integer.hashCode(this.f399054e)) * 31) + java.lang.Boolean.hashCode(this.f399055f)) * 31) + this.f399056g.hashCode()) * 31;
        la3.a aVar = this.f399057h;
        return hashCode + (aVar == null ? 0 : aVar.hashCode());
    }

    /* renamed from: toString */
    public java.lang.String m145465x9616526c() {
        return "LiteAppWebViewData(id=" + this.f399050a + ", url=" + this.f399051b + ", appUuid=" + this.f399052c + ", pageId=" + this.f399053d + ", nodeId=" + this.f399054e + ", isTransparent=" + this.f399055f + ", appId=" + this.f399056g + ", onEvent=" + this.f399057h + ')';
    }
}

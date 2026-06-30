package e85;

/* loaded from: classes10.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f331831a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f331832b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f331833c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f331834d;

    /* renamed from: e, reason: collision with root package name */
    public final long f331835e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f331836f;

    /* renamed from: g, reason: collision with root package name */
    public d85.f0 f331837g;

    public c(java.lang.String action, java.lang.String pageName, java.lang.String pageRef, java.lang.String process, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(action, "action");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pageName, "pageName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pageRef, "pageRef");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(process, "process");
        this.f331831a = action;
        this.f331832b = pageName;
        this.f331833c = pageRef;
        this.f331834d = process;
        this.f331835e = j17;
        this.f331836f = "";
    }

    /* renamed from: equals */
    public boolean m127182xb2c87fbf(java.lang.Object obj) {
        if (obj != null && (obj instanceof e85.c)) {
            e85.c cVar = (e85.c) obj;
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f331832b, cVar.f331832b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f331834d, cVar.f331834d)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: hashCode */
    public int m127183x8cdac1b() {
        return (((((((this.f331831a.hashCode() * 31) + this.f331832b.hashCode()) * 31) + this.f331833c.hashCode()) * 31) + this.f331834d.hashCode()) * 31) + java.lang.Long.hashCode(this.f331835e);
    }

    /* renamed from: toString */
    public java.lang.String m127184x9616526c() {
        return "page:" + this.f331832b + ", action:" + this.f331831a + ", process:" + this.f331834d + ", time:" + this.f331835e;
    }
}

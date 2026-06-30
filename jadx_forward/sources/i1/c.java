package i1;

/* loaded from: classes13.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f368369a;

    /* renamed from: b, reason: collision with root package name */
    public final float f368370b;

    /* renamed from: c, reason: collision with root package name */
    public final float f368371c;

    /* renamed from: d, reason: collision with root package name */
    public final float f368372d;

    /* renamed from: e, reason: collision with root package name */
    public final float f368373e;

    /* renamed from: f, reason: collision with root package name */
    public final float f368374f;

    /* renamed from: g, reason: collision with root package name */
    public final float f368375g;

    /* renamed from: h, reason: collision with root package name */
    public final float f368376h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.List f368377i;

    /* renamed from: j, reason: collision with root package name */
    public final java.util.List f368378j;

    public c(java.lang.String name, float f17, float f18, float f19, float f27, float f28, float f29, float f37, java.util.List clipPathData, java.util.List children, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        name = (i17 & 1) != 0 ? "" : name;
        f17 = (i17 & 2) != 0 ? 0.0f : f17;
        f18 = (i17 & 4) != 0 ? 0.0f : f18;
        f19 = (i17 & 8) != 0 ? 0.0f : f19;
        f27 = (i17 & 16) != 0 ? 1.0f : f27;
        f28 = (i17 & 32) != 0 ? 1.0f : f28;
        f29 = (i17 & 64) != 0 ? 0.0f : f29;
        f37 = (i17 & 128) != 0 ? 0.0f : f37;
        if ((i17 & 256) != 0) {
            int i18 = i1.p1.f368534a;
            clipPathData = kz5.p0.f395529d;
        }
        children = (i17 & 512) != 0 ? new java.util.ArrayList() : children;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(clipPathData, "clipPathData");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(children, "children");
        this.f368369a = name;
        this.f368370b = f17;
        this.f368371c = f18;
        this.f368372d = f19;
        this.f368373e = f27;
        this.f368374f = f28;
        this.f368375g = f29;
        this.f368376h = f37;
        this.f368377i = clipPathData;
        this.f368378j = children;
    }
}

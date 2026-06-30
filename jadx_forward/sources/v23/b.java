package v23;

/* loaded from: classes10.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f514419a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f514420b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f514421c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f514422d;

    /* renamed from: e, reason: collision with root package name */
    public final int f514423e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f514424f;

    public b(java.lang.String name, java.util.List mediaList, java.lang.String bucketId, boolean z17, int i17, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        mediaList = (i18 & 2) != 0 ? new java.util.ArrayList() : mediaList;
        bucketId = (i18 & 4) != 0 ? "" : bucketId;
        z17 = (i18 & 8) != 0 ? false : z17;
        i17 = (i18 & 16) != 0 ? -1 : i17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaList, "mediaList");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bucketId, "bucketId");
        this.f514419a = name;
        this.f514420b = mediaList;
        this.f514421c = bucketId;
        this.f514422d = z17;
        this.f514423e = i17;
        this.f514424f = jz5.h.b(new v23.a(this));
    }

    public final long a() {
        return ((java.lang.Number) ((jz5.n) this.f514424f).mo141623x754a37bb()).longValue();
    }

    /* renamed from: equals */
    public boolean m171006xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(getClass(), obj.getClass())) {
            return false;
        }
        v23.b bVar = (v23.b) obj;
        return a() == bVar.a() && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f514419a, bVar.f514419a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f514420b, bVar.f514420b);
    }
}

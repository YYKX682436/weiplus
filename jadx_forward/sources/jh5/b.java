package jh5;

/* loaded from: classes7.dex */
public final class b {

    /* renamed from: d, reason: collision with root package name */
    public static final jh5.b f381399d = new jh5.b("", "", "");

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f381400a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f381401b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f381402c;

    public b(java.lang.String eggKey, java.lang.String eggId, java.lang.String sceneId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(eggKey, "eggKey");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(eggId, "eggId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sceneId, "sceneId");
        this.f381400a = eggKey;
        this.f381401b = eggId;
        this.f381402c = sceneId;
    }

    /* renamed from: equals */
    public boolean m140979xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jh5.b)) {
            return false;
        }
        jh5.b bVar = (jh5.b) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f381400a, bVar.f381400a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f381401b, bVar.f381401b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f381402c, bVar.f381402c);
    }

    /* renamed from: hashCode */
    public int m140980x8cdac1b() {
        return (((this.f381400a.hashCode() * 31) + this.f381401b.hashCode()) * 31) + this.f381402c.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m140981x9616526c() {
        return "MagicEmojiEggMeta(eggKey=" + this.f381400a + ", eggId=" + this.f381401b + ", sceneId=" + this.f381402c + ')';
    }
}

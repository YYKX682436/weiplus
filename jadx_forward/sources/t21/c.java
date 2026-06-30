package t21;

/* loaded from: classes10.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d f496240a;

    /* renamed from: b, reason: collision with root package name */
    public final long f496241b;

    /* renamed from: c, reason: collision with root package name */
    public final long f496242c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f496243d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f496244e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f496245f;

    /* renamed from: g, reason: collision with root package name */
    public final t21.x1 f496246g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f496247h;

    /* renamed from: i, reason: collision with root package name */
    public int f496248i;

    /* renamed from: j, reason: collision with root package name */
    public t21.d2 f496249j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f496250k;

    public c(com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d videoParam) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(videoParam, "videoParam");
        this.f496240a = videoParam;
        this.f496241b = -1L;
        this.f496242c = -1L;
        this.f496245f = true;
        this.f496246g = new t21.x1(false, 0, 3, null);
    }

    /* renamed from: equals */
    public boolean m165676xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t21.c) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f496240a, ((t21.c) obj).f496240a);
    }

    /* renamed from: hashCode */
    public int m165677x8cdac1b() {
        return this.f496240a.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m165678x9616526c() {
        return "CompositionVideoTranscodeParam(videoParam=" + this.f496240a + ')';
    }
}

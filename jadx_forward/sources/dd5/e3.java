package dd5;

/* loaded from: classes11.dex */
public final class e3 implements uc5.r0 {

    /* renamed from: a, reason: collision with root package name */
    public final long f310658a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f310659b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f310660c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f310661d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f310662e;

    public e3(long j17, java.lang.String talker, java.lang.String videoThumbKey, java.lang.String videoThumbPath, java.lang.String videoDuration) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(talker, "talker");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(videoThumbKey, "videoThumbKey");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(videoThumbPath, "videoThumbPath");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(videoDuration, "videoDuration");
        this.f310658a = j17;
        this.f310659b = talker;
        this.f310660c = videoThumbKey;
        this.f310661d = videoThumbPath;
        this.f310662e = videoDuration;
    }

    /* renamed from: equals */
    public boolean m124016xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dd5.e3)) {
            return false;
        }
        dd5.e3 e3Var = (dd5.e3) obj;
        return this.f310658a == e3Var.f310658a && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f310659b, e3Var.f310659b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f310660c, e3Var.f310660c) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f310661d, e3Var.f310661d) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f310662e, e3Var.f310662e);
    }

    /* renamed from: hashCode */
    public int m124017x8cdac1b() {
        return (((((((java.lang.Long.hashCode(this.f310658a) * 31) + this.f310659b.hashCode()) * 31) + this.f310660c.hashCode()) * 31) + this.f310661d.hashCode()) * 31) + this.f310662e.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m124018x9616526c() {
        return "ViewModel(msgId=" + this.f310658a + ", talker=" + this.f310659b + ", videoThumbKey=" + this.f310660c + ", videoThumbPath=" + this.f310661d + ", videoDuration=" + this.f310662e + ')';
    }
}

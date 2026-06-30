package kw2;

/* loaded from: classes5.dex */
public final class f0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f394542a;

    /* renamed from: b, reason: collision with root package name */
    public int f394543b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f394544c;

    /* renamed from: d, reason: collision with root package name */
    public long f394545d;

    public f0(java.lang.String mediaId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaId, "mediaId");
        this.f394542a = mediaId;
        this.f394544c = "";
    }

    /* renamed from: equals */
    public boolean m144495xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kw2.f0) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f394542a, ((kw2.f0) obj).f394542a);
    }

    /* renamed from: hashCode */
    public int m144496x8cdac1b() {
        return this.f394542a.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m144497x9616526c() {
        return "ReportTaskInfo(mediaId=" + this.f394542a + ')';
    }
}

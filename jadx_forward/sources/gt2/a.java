package gt2;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f356906a;

    /* renamed from: b, reason: collision with root package name */
    public final long f356907b;

    /* renamed from: c, reason: collision with root package name */
    public long f356908c;

    /* renamed from: d, reason: collision with root package name */
    public final r45.qt2 f356909d;

    public a(int i17, long j17, long j18, r45.qt2 contextObj, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        i17 = (i18 & 1) != 0 ? 0 : i17;
        j17 = (i18 & 2) != 0 ? 0L : j17;
        j18 = (i18 & 4) != 0 ? 0L : j18;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contextObj, "contextObj");
        this.f356906a = i17;
        this.f356907b = j17;
        this.f356908c = j18;
        this.f356909d = contextObj;
    }

    /* renamed from: equals */
    public boolean m132353xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gt2.a)) {
            return false;
        }
        gt2.a aVar = (gt2.a) obj;
        return this.f356906a == aVar.f356906a && this.f356907b == aVar.f356907b && this.f356908c == aVar.f356908c && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f356909d, aVar.f356909d);
    }

    /* renamed from: hashCode */
    public int m132354x8cdac1b() {
        return (((((java.lang.Integer.hashCode(this.f356906a) * 31) + java.lang.Long.hashCode(this.f356907b)) * 31) + java.lang.Long.hashCode(this.f356908c)) * 31) + this.f356909d.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m132355x9616526c() {
        return "FinderProcessOut(processId=" + this.f356906a + ", inTime=" + this.f356907b + ", outTime=" + this.f356908c + ", contextObj=" + this.f356909d + ')';
    }
}

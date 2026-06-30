package rv;

/* loaded from: classes11.dex */
public final class l3 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f481406a;

    /* renamed from: b, reason: collision with root package name */
    public final long f481407b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f481408c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f481409d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f481410e;

    /* renamed from: f, reason: collision with root package name */
    public final long f481411f;

    public l3(boolean z17, long j17, java.lang.String redDotContent, java.lang.String redDotId, boolean z18, long j18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(redDotContent, "redDotContent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(redDotId, "redDotId");
        this.f481406a = z17;
        this.f481407b = j17;
        this.f481408c = redDotContent;
        this.f481409d = redDotId;
        this.f481410e = z18;
        this.f481411f = j18;
    }

    /* renamed from: equals */
    public boolean m163103xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rv.l3)) {
            return false;
        }
        rv.l3 l3Var = (rv.l3) obj;
        return this.f481406a == l3Var.f481406a && this.f481407b == l3Var.f481407b && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f481408c, l3Var.f481408c) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f481409d, l3Var.f481409d) && this.f481410e == l3Var.f481410e && this.f481411f == l3Var.f481411f;
    }

    /* renamed from: hashCode */
    public int m163104x8cdac1b() {
        return (((((((((java.lang.Boolean.hashCode(this.f481406a) * 31) + java.lang.Long.hashCode(this.f481407b)) * 31) + this.f481408c.hashCode()) * 31) + this.f481409d.hashCode()) * 31) + java.lang.Boolean.hashCode(this.f481410e)) * 31) + java.lang.Long.hashCode(this.f481411f);
    }

    /* renamed from: toString */
    public java.lang.String m163105x9616526c() {
        return "MeTabRedDotReportInfo(hasRedDot=" + this.f481406a + ", redDotType=" + this.f481407b + ", redDotContent=" + this.f481408c + ", redDotId=" + this.f481409d + ", hasInteractiveRedDot=" + this.f481410e + ", interactiveRedDotCnt=" + this.f481411f + ')';
    }

    public /* synthetic */ l3(boolean z17, long j17, java.lang.String str, java.lang.String str2, boolean z18, long j18, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this((i17 & 1) != 0 ? false : z17, (i17 & 2) != 0 ? 0L : j17, (i17 & 4) != 0 ? "" : str, (i17 & 8) == 0 ? str2 : "", (i17 & 16) == 0 ? z18 : false, (i17 & 32) == 0 ? j18 : 0L);
    }
}

package m91;

/* loaded from: classes7.dex */
public final class c implements java.lang.Comparable {

    /* renamed from: m, reason: collision with root package name */
    public static final m91.b f406475m = new m91.b(null);

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f406476d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f406477e;

    /* renamed from: f, reason: collision with root package name */
    public final int f406478f;

    /* renamed from: g, reason: collision with root package name */
    public final int f406479g;

    /* renamed from: h, reason: collision with root package name */
    public final int f406480h;

    /* renamed from: i, reason: collision with root package name */
    public final int f406481i;

    public c(java.lang.String appId, java.lang.String appName, int i17, int i18, int i19, int i27) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appName, "appName");
        this.f406476d = appId;
        this.f406477e = appName;
        this.f406478f = i17;
        this.f406479g = i18;
        this.f406480h = i19;
        this.f406481i = i27;
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(m91.c other) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(other, "other");
        int compareTo = this.f406476d.compareTo(other.f406476d);
        int i17 = this.f406478f;
        if (compareTo == 0) {
            compareTo = i17 - other.f406478f;
        }
        return (compareTo == 0 && com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.g0.b(i17)) ? this.f406479g - other.f406479g : compareTo;
    }

    /* renamed from: equals */
    public boolean m147048xb2c87fbf(java.lang.Object obj) {
        return (obj instanceof m91.c) && compareTo((m91.c) obj) == 0;
    }

    /* renamed from: hashCode */
    public int m147049x8cdac1b() {
        return ("[" + this.f406476d + "::" + this.f406478f + "::" + this.f406479g + ']').hashCode();
    }
}

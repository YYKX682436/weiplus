package yn5;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public long f545565a;

    /* renamed from: b, reason: collision with root package name */
    public int f545566b;

    public h(long j17, int i17, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        j17 = (i18 & 1) != 0 ? 0L : j17;
        i17 = (i18 & 2) != 0 ? 0 : i17;
        this.f545565a = j17;
        this.f545566b = i17;
    }

    /* renamed from: equals */
    public boolean m177419xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yn5.h)) {
            return false;
        }
        yn5.h hVar = (yn5.h) obj;
        return this.f545565a == hVar.f545565a && this.f545566b == hVar.f545566b;
    }

    /* renamed from: hashCode */
    public int m177420x8cdac1b() {
        return (java.lang.Long.hashCode(this.f545565a) * 31) + java.lang.Integer.hashCode(this.f545566b);
    }

    /* renamed from: toString */
    public java.lang.String m177421x9616526c() {
        return "SortStruct(cost=" + this.f545565a + ", cnt=" + this.f545566b + ')';
    }
}

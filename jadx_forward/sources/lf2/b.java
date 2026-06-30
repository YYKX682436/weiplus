package lf2;

/* loaded from: classes10.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final om2.m f399807a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f399808b;

    public b(om2.m reverbType, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reverbType, "reverbType");
        this.f399807a = reverbType;
        this.f399808b = z17;
    }

    /* renamed from: equals */
    public boolean m145697xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lf2.b)) {
            return false;
        }
        lf2.b bVar = (lf2.b) obj;
        return this.f399807a == bVar.f399807a && this.f399808b == bVar.f399808b;
    }

    /* renamed from: hashCode */
    public int m145698x8cdac1b() {
        return (this.f399807a.hashCode() * 31) + java.lang.Boolean.hashCode(this.f399808b);
    }

    /* renamed from: toString */
    public java.lang.String m145699x9616526c() {
        return "ReverberationItemData(reverbType=" + this.f399807a + ", selected=" + this.f399808b + ')';
    }
}

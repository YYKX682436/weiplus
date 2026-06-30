package hk0;

/* loaded from: classes3.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final hk0.e f363267a;

    /* renamed from: b, reason: collision with root package name */
    public final hk0.e f363268b;

    public g(hk0.e doodleBean, hk0.e lastDoodleBean) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(doodleBean, "doodleBean");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(lastDoodleBean, "lastDoodleBean");
        this.f363267a = doodleBean;
        this.f363268b = lastDoodleBean;
    }

    /* renamed from: equals */
    public boolean m133632xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hk0.g)) {
            return false;
        }
        hk0.g gVar = (hk0.g) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f363267a, gVar.f363267a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f363268b, gVar.f363268b);
    }

    /* renamed from: hashCode */
    public int m133633x8cdac1b() {
        return (this.f363267a.m133630x8cdac1b() * 31) + this.f363268b.m133630x8cdac1b();
    }

    /* renamed from: toString */
    public java.lang.String m133634x9616526c() {
        return "DoodleState(doodleBean=" + this.f363267a + ", lastDoodleBean=" + this.f363268b + ')';
    }
}

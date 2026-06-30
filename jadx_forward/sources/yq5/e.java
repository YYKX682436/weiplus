package yq5;

/* loaded from: classes5.dex */
public final class e implements yq5.d {

    /* renamed from: a, reason: collision with root package name */
    public final yq5.f f546128a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f546129b;

    public e(yq5.f imageSource) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(imageSource, "imageSource");
        this.f546128a = imageSource;
        this.f546129b = ((yq5.b) imageSource).f546123b;
    }

    /* renamed from: equals */
    public boolean m177520xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || yq5.e.class != obj.getClass()) {
            return false;
        }
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f546128a, ((yq5.e) obj).f546128a);
    }

    /* renamed from: hashCode */
    public int m177521x8cdac1b() {
        return this.f546128a.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m177522x9616526c() {
        return "WrapperFactory(" + this.f546128a + ')';
    }
}

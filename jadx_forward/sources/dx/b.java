package dx;

/* loaded from: classes7.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Collection f325951a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.Collection f325952b;

    public b(java.util.Collection mbJsApiSet, java.util.Collection appBrandJsApi) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mbJsApiSet, "mbJsApiSet");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appBrandJsApi, "appBrandJsApi");
        this.f325951a = mbJsApiSet;
        this.f325952b = appBrandJsApi;
    }

    /* renamed from: equals */
    public boolean m126402xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dx.b)) {
            return false;
        }
        dx.b bVar = (dx.b) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f325951a, bVar.f325951a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f325952b, bVar.f325952b);
    }

    /* renamed from: hashCode */
    public int m126403x8cdac1b() {
        return (this.f325951a.hashCode() * 31) + this.f325952b.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m126404x9616526c() {
        return "MagicBrandServiceJsApiGroup(mbJsApiSet=" + this.f325951a + ", appBrandJsApi=" + this.f325952b + ')';
    }
}

package jc3;

/* loaded from: classes7.dex */
public final class y0 {

    /* renamed from: a, reason: collision with root package name */
    public java.util.Collection f380545a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.Collection f380546b;

    public y0(java.util.Collection mbJsApiSet, java.util.Collection appBrandJsApi) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mbJsApiSet, "mbJsApiSet");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appBrandJsApi, "appBrandJsApi");
        this.f380545a = mbJsApiSet;
        this.f380546b = appBrandJsApi;
    }

    /* renamed from: equals */
    public boolean m140646xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jc3.y0)) {
            return false;
        }
        jc3.y0 y0Var = (jc3.y0) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f380545a, y0Var.f380545a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f380546b, y0Var.f380546b);
    }

    /* renamed from: hashCode */
    public int m140647x8cdac1b() {
        return (this.f380545a.hashCode() * 31) + this.f380546b.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m140648x9616526c() {
        return "MagicBushJsApiGroup(mbJsApiSet=" + this.f380545a + ", appBrandJsApi=" + this.f380546b + ')';
    }
}

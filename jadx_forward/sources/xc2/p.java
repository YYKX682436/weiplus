package xc2;

/* loaded from: classes2.dex */
public abstract class p extends xc2.o0 {

    /* renamed from: f, reason: collision with root package name */
    public final cl0.g f534760f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f534761g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f534762h;

    /* renamed from: i, reason: collision with root package name */
    public final long f534763i;

    /* renamed from: j, reason: collision with root package name */
    public final java.lang.String f534764j;

    /* renamed from: k, reason: collision with root package name */
    public long f534765k;

    public p(cl0.g data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        this.f534760f = data;
        this.f534761g = data.mo15082x48bce8a4("url");
        this.f534762h = "";
        this.f534764j = "";
        java.lang.String mo15082x48bce8a4 = data.mo15082x48bce8a4("uxinfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo15082x48bce8a4, "optString(...)");
        this.f534762h = mo15082x48bce8a4;
        this.f534763i = data.optLong("aid");
        java.lang.String mo15082x48bce8a42 = data.mo15082x48bce8a4("ad_posid");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo15082x48bce8a42, "optString(...)");
        this.f534764j = mo15082x48bce8a42;
        this.f534765k = pm0.v.Z(data.mo15082x48bce8a4("canvas_id"));
    }
}

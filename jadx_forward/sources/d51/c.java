package d51;

/* loaded from: classes10.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f308056a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f308057b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f308058c;

    public c(java.lang.String url, java.lang.String path, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        this.f308056a = url;
        this.f308057b = path;
        this.f308058c = z17;
    }

    /* renamed from: toString */
    public java.lang.String m123520x9616526c() {
        return "url:" + this.f308056a + ", path:" + this.f308057b + ", delOnLoadFail:" + this.f308058c;
    }
}

package qy5;

/* loaded from: classes13.dex */
public abstract class h {

    /* renamed from: e, reason: collision with root package name */
    public static qy5.h f449326e;

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f449327a = "";

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f449328b = "";

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f449329c = "";

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f449330d = "";

    public static qy5.h a() {
        if (f449326e == null) {
            f449326e = java.util.Locale.getDefault().toString().startsWith("zh") ? new qy5.i() : new qy5.j();
        }
        return f449326e;
    }
}

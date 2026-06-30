package ys1;

/* loaded from: classes7.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f546659a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f546660b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f546661c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f546662d;

    /* renamed from: e, reason: collision with root package name */
    public final int f546663e;

    /* renamed from: f, reason: collision with root package name */
    public int f546664f;

    /* renamed from: g, reason: collision with root package name */
    public int f546665g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f546666h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f546667i;

    /* renamed from: j, reason: collision with root package name */
    public final java.lang.String f546668j;

    public b(java.lang.String url, java.lang.String appId, java.lang.String title, java.lang.String desc, java.lang.String from, int i17, int i18, int i19, java.lang.String str, java.lang.String str2, java.lang.String str3, int i27, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        from = (i27 & 16) != 0 ? "" : from;
        i17 = (i27 & 32) != 0 ? -1 : i17;
        i18 = (i27 & 64) != 0 ? -1 : i18;
        i19 = (i27 & 128) != 0 ? -1 : i19;
        java.lang.Integer num = null;
        str = (i27 & 256) != 0 ? null : str;
        str2 = (i27 & 512) != 0 ? null : str2;
        str3 = (i27 & 1024) != 0 ? null : str3;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(title, "title");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(desc, "desc");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(from, "from");
        this.f546659a = url;
        this.f546660b = appId;
        this.f546661c = title;
        this.f546662d = desc;
        this.f546663e = i17;
        this.f546664f = i18;
        this.f546665g = i19;
        this.f546666h = str;
        this.f546667i = str2;
        this.f546668j = str3;
        if (hy4.i.j(url)) {
            num = 211;
        } else if (hy4.i.n(url)) {
            num = 213;
        } else if (hy4.i.o(url)) {
            num = 212;
        }
        if (num != null) {
            int intValue = num.intValue();
            if (this.f546664f != num.intValue()) {
                this.f546665g = this.f546664f;
                this.f546664f = intValue;
            }
        }
    }
}

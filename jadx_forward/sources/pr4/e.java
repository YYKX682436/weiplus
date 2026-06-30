package pr4;

/* loaded from: classes8.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f f439520a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f439521b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f439522c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f439523d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f439524e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f439525f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.ImageView f439526g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f439527h;

    public e(p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f context, java.lang.String title, java.lang.String str, java.util.List priceTiers, java.lang.String protocolWording, java.util.List tips) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(title, "title");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(priceTiers, "priceTiers");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(protocolWording, "protocolWording");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tips, "tips");
        this.f439520a = context;
        this.f439521b = title;
        this.f439522c = str;
        this.f439523d = priceTiers;
        this.f439524e = protocolWording;
        this.f439525f = tips;
        this.f439527h = "";
        java.lang.String string = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.lhq);
        java.lang.String string2 = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.lhr);
        java.lang.String string3 = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.lhs);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string3, "getString(...)");
        java.lang.String format = java.lang.String.format(string3, java.util.Arrays.copyOf(new java.lang.Object[]{"https://kf.qq.com/touch/product/WXDB_app.html"}, 1));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
        this.f439525f = kz5.n0.t0(tips, kz5.c0.i(string, string2, format));
    }
}

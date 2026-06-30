package b2;

/* loaded from: classes15.dex */
public final class l implements b2.p {
    @Override // b2.p
    public android.text.StaticLayout a(b2.q params) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(params, "params");
        android.text.StaticLayout.Builder obtain = android.text.StaticLayout.Builder.obtain(params.f98826a, params.f98827b, params.f98828c, params.f98829d, params.f98830e);
        obtain.setTextDirection(params.f98831f);
        obtain.setAlignment(params.f98832g);
        obtain.setMaxLines(params.f98833h);
        obtain.setEllipsize(params.f98834i);
        obtain.setEllipsizedWidth(params.f98835j);
        obtain.setLineSpacing(params.f98837l, params.f98836k);
        obtain.setIncludePad(params.f98839n);
        obtain.setBreakStrategy(params.f98841p);
        obtain.setHyphenationFrequency(params.f98842q);
        obtain.setIndents(params.f98843r, params.f98844s);
        int i17 = android.os.Build.VERSION.SDK_INT;
        if (i17 >= 26) {
            b2.m.f98823a.a(obtain, params.f98838m);
        }
        if (i17 >= 28) {
            b2.n.f98824a.a(obtain, params.f98840o);
        }
        android.text.StaticLayout build = obtain.build();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(build, "obtain(params.text, para…  }\n            }.build()");
        return build;
    }
}

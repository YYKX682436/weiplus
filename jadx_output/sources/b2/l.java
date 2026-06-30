package b2;

/* loaded from: classes15.dex */
public final class l implements b2.p {
    @Override // b2.p
    public android.text.StaticLayout a(b2.q params) {
        kotlin.jvm.internal.o.g(params, "params");
        android.text.StaticLayout.Builder obtain = android.text.StaticLayout.Builder.obtain(params.f17293a, params.f17294b, params.f17295c, params.f17296d, params.f17297e);
        obtain.setTextDirection(params.f17298f);
        obtain.setAlignment(params.f17299g);
        obtain.setMaxLines(params.f17300h);
        obtain.setEllipsize(params.f17301i);
        obtain.setEllipsizedWidth(params.f17302j);
        obtain.setLineSpacing(params.f17304l, params.f17303k);
        obtain.setIncludePad(params.f17306n);
        obtain.setBreakStrategy(params.f17308p);
        obtain.setHyphenationFrequency(params.f17309q);
        obtain.setIndents(params.f17310r, params.f17311s);
        int i17 = android.os.Build.VERSION.SDK_INT;
        if (i17 >= 26) {
            b2.m.f17290a.a(obtain, params.f17305m);
        }
        if (i17 >= 28) {
            b2.n.f17291a.a(obtain, params.f17307o);
        }
        android.text.StaticLayout build = obtain.build();
        kotlin.jvm.internal.o.f(build, "obtain(params.text, para…  }\n            }.build()");
        return build;
    }
}

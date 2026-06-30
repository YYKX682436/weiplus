package kv4;

/* loaded from: classes12.dex */
public final class b0 implements jv4.n {

    /* renamed from: a, reason: collision with root package name */
    public final int f394217a;

    /* renamed from: b, reason: collision with root package name */
    public final kv4.m f394218b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.List f394219c;

    /* renamed from: d, reason: collision with root package name */
    public final rv4.p f394220d;

    /* renamed from: e, reason: collision with root package name */
    public g75.s f394221e;

    public b0(int i17, kv4.m delegate, java.util.List data, rv4.p hotSearchData) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(delegate, "delegate");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(hotSearchData, "hotSearchData");
        this.f394217a = i17;
        this.f394218b = delegate;
        this.f394219c = data;
        this.f394220d = hotSearchData;
    }

    public static final void a(android.widget.TextView textView, java.lang.String str, float f17) {
        if ((textView != null ? textView.getPaint() : null) == null || f17 <= 0.0f) {
            return;
        }
        java.lang.CharSequence ellipsize = android.text.TextUtils.ellipsize(str, textView.getPaint(), f17, android.text.TextUtils.TruncateAt.END);
        textView.setMaxWidth((int) textView.getPaint().measureText(ellipsize.toString()));
        textView.setText(ellipsize);
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0336  */
    @Override // jv4.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void c(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 r52) {
        /*
            Method dump skipped, instructions count: 1241
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kv4.b0.c(androidx.recyclerview.widget.k3):void");
    }

    @Override // jv4.n
    /* renamed from: getType */
    public jv4.m mo141457xfb85f7b0() {
        return jv4.m.f383787t;
    }

    @Override // nv4.g
    public java.lang.String v() {
        jv4.l lVar = jv4.m.f383775e;
        return "11:".concat(kz5.n0.g0(this.f394219c, "-", null, null, 0, null, kv4.z.f394284d, 30, null));
    }

    @Override // nv4.g
    public void w() {
        this.f394220d.k(vu4.a.f521772f, vu4.b.B, "", kz5.n0.g0(this.f394219c, "#", null, null, 0, null, kv4.a0.f394214d, 30, null), "");
    }
}

package d00;

/* loaded from: classes7.dex */
public final class e implements d00.d {

    /* renamed from: a, reason: collision with root package name */
    public final l81.b1 f306787a;

    /* renamed from: b, reason: collision with root package name */
    public final android.content.Context f306788b;

    public e(l81.b1 appOpenBundle, android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appOpenBundle, "appOpenBundle");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f306787a = appOpenBundle;
        this.f306788b = context;
    }

    @Override // d00.d
    public java.lang.Object a(java.lang.Object obj) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        l81.b1 b1Var = this.f306787a;
        if (booleanValue) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("RealStartAppBrandTask", "force pull , set appOpenBundle version is INT_MAX");
            b1Var.f398551d = Integer.MAX_VALUE;
            b1Var.N = true;
        }
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.xc) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6.class))).bj(this.f306788b, b1Var);
        return jz5.f0.f384359a;
    }
}

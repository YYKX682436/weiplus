package fq0;

/* loaded from: classes7.dex */
public final class v extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fq0.x f347005d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f347006e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f347007f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(fq0.x xVar, int i17, int i18) {
        super(0);
        this.f347005d = xVar;
        this.f347006e = i17;
        this.f347007f = i18;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        fq0.x xVar = this.f347005d;
        com.p314xaae8f345.mm.p840x5dc4f1ad.p841xc5476f33.scl.p848x373aa5.C10867x3e50a04d c10867x3e50a04d = xVar.f347021l;
        android.view.ViewGroup.LayoutParams layoutParams = c10867x3e50a04d != null ? c10867x3e50a04d.getLayoutParams() : null;
        int i17 = xVar.f347015f;
        int i18 = this.f347007f;
        int i19 = this.f347006e;
        boolean z17 = ((i19 == i17 || i19 == 0) && (i18 == xVar.f347016g || i18 == 0)) ? false : true;
        if (i19 > 0 && i19 != i17) {
            xVar.f347015f = i19;
            if (layoutParams != null) {
                layoutParams.width = vp0.b.b(java.lang.Integer.valueOf(i19));
            }
        }
        if (i18 > 0 && i18 != xVar.f347016g) {
            xVar.f347016g = i18;
            if (layoutParams != null) {
                layoutParams.height = vp0.b.b(java.lang.Integer.valueOf(i18));
            }
        }
        if (z17) {
            hq0.e0 e0Var = xVar.f347012c;
            if (e0Var != null) {
                e0Var.i(xVar);
            }
            yz5.a aVar = xVar.f347018i;
            if (aVar != null) {
                aVar.mo152xb9724478();
            }
        }
        com.p314xaae8f345.mm.p840x5dc4f1ad.p841xc5476f33.scl.p848x373aa5.C10867x3e50a04d c10867x3e50a04d2 = xVar.f347021l;
        if (c10867x3e50a04d2 != null) {
            c10867x3e50a04d2.setLayoutParams(layoutParams);
        }
        return jz5.f0.f384359a;
    }
}

package yt3;

/* loaded from: classes10.dex */
public final class l implements wu3.a1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yt3.m f547053a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ju3.d0 f547054b;

    public l(yt3.m mVar, ju3.d0 d0Var) {
        this.f547053a = mVar;
        this.f547054b = d0Var;
    }

    @Override // wu3.a1
    public void a(java.lang.CharSequence charSequence, int i17, int i18, java.lang.String font) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(font, "font");
        yt3.m mVar = this.f547053a;
        if (charSequence != null) {
            if (!(charSequence.length() == 0)) {
                android.os.Bundle bundle = new android.os.Bundle();
                int mode = mVar.f547065g.getMode();
                ju3.d0 d0Var = this.f547054b;
                if (mode == 0) {
                    bundle.putCharSequence("PARAM_EDIT_TEXT_CONTENT", charSequence.toString());
                    bundle.putInt("PARAM_EDIT_TEXT_COLOR", i17);
                    bundle.putInt("PARAM_EDIT_TEXT_COLOR_BG_INT", i18);
                    bundle.putString("PARAM_EDIT_TEXT_FONT", font);
                    d0Var.w(ju3.c0.f383400J, bundle);
                } else if (mode == 2) {
                    r45.is isVar = mVar.f547067i;
                    byte[] bytes = charSequence.toString().getBytes(r26.c.f450398a);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes, "getBytes(...)");
                    isVar.f458830d = new com.p314xaae8f345.mm.p2495xc50a8b8b.g(bytes, 0, bytes.length);
                    bundle.putByteArray("PARAM_1_BYTEARRAY", mVar.f547067i.mo14344x5f01b1f6());
                    bundle.putLong("PARAM_1_LONG", mVar.f547067i.f458831e);
                    bundle.putInt("PARAM_EDIT_TEXT_COLOR", i17);
                    bundle.putInt("PARAM_EDIT_TEXT_COLOR_BG_INT", i18);
                    bundle.putString("PARAM_EDIT_TEXT_FONT", font);
                    d0Var.w(ju3.c0.f383439u2, bundle);
                }
                mVar.f547065g.m68225x76500a7f(false);
                return;
            }
        }
        mVar.f547065g.m68225x76500a7f(false);
    }

    @Override // wu3.a1
    /* renamed from: onCancel */
    public void mo126263x3d6f0539() {
        yt3.m mVar = this.f547053a;
        mVar.f547065g.m68225x76500a7f(false);
        int mode = mVar.f547065g.getMode();
        ju3.d0 d0Var = this.f547054b;
        if (mode == 0) {
            ju3.d0.k(d0Var, ju3.c0.f383446x1, null, 2, null);
            ju3.d0.k(d0Var, ju3.c0.L, null, 2, null);
        } else {
            if (mode != 2) {
                return;
            }
            ju3.d0.k(d0Var, ju3.c0.f383443w2, null, 2, null);
        }
    }
}

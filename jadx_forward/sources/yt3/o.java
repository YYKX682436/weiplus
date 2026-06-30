package yt3;

/* loaded from: classes10.dex */
public final class o implements wu3.b1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yt3.p f547090a;

    public o(yt3.p pVar) {
        this.f547090a = pVar;
    }

    public void a(java.lang.CharSequence charSequence, int i17, int i18, java.lang.String font) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(font, "font");
        yt3.p pVar = this.f547090a;
        pVar.f547109e.m68225x76500a7f(false);
        if (charSequence != null) {
            if (!(charSequence.length() == 0)) {
                pVar.f547110f.setVisibility(8);
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putCharSequence("PARAM_EDIT_TEXT_CONTENT", charSequence);
                bundle.putInt("PARAM_EDIT_TEXT_COLOR", i17);
                bundle.putInt("PARAM_EDIT_TEXT_COLOR_BG_INT", i18);
                pVar.f547108d.w(ju3.c0.M, bundle);
            }
        }
        pVar.f547110f.setVisibility(0);
        android.os.Bundle bundle2 = new android.os.Bundle();
        bundle2.putCharSequence("PARAM_EDIT_TEXT_CONTENT", charSequence);
        bundle2.putInt("PARAM_EDIT_TEXT_COLOR", i17);
        bundle2.putInt("PARAM_EDIT_TEXT_COLOR_BG_INT", i18);
        pVar.f547108d.w(ju3.c0.M, bundle2);
    }
}

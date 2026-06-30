package f93;

/* loaded from: classes11.dex */
public final class x0 implements android.text.InputFilter {

    /* renamed from: d, reason: collision with root package name */
    public final char[] f342033d = {'\n', ',', ';', 12289, 65292, 65307};

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.ActivityC16167x7777ff84 f342034e;

    public x0(com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.ActivityC16167x7777ff84 activityC16167x7777ff84) {
        this.f342034e = activityC16167x7777ff84;
    }

    @Override // android.text.InputFilter
    public java.lang.CharSequence filter(java.lang.CharSequence source, int i17, int i18, android.text.Spanned dest, int i19, int i27) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dest, "dest");
        for (int i28 = i17; i28 < i18; i28++) {
            char[] cArr = new char[i18 - i17];
            android.text.TextUtils.getChars(source, i17, i18, cArr, 0);
            for (char c17 : this.f342033d) {
                char c18 = cArr[i28];
                com.p314xaae8f345.mm.ui.ik ikVar = com.p314xaae8f345.mm.ui.jk.f290544a;
                com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.ActivityC16167x7777ff84 activityC16167x7777ff84 = this.f342034e;
                if (c18 == ' ' && i19 == 0 && i28 == 0) {
                    android.widget.TextView textView = activityC16167x7777ff84.f224747f;
                    if (textView != null) {
                        textView.setVisibility(0);
                    }
                    android.widget.TextView textView2 = activityC16167x7777ff84.f224747f;
                    if (textView2 != null) {
                        textView2.setText(activityC16167x7777ff84.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571362cx));
                    }
                    ikVar.a();
                    return "";
                }
                if (c18 == c17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ContactLabelCreateUI", "MMInputFilter, showInvalidMsg.");
                    android.widget.TextView textView3 = activityC16167x7777ff84.f224747f;
                    if (textView3 != null) {
                        textView3.setVisibility(0);
                    }
                    android.widget.TextView textView4 = activityC16167x7777ff84.f224747f;
                    if (textView4 != null) {
                        textView4.setText(activityC16167x7777ff84.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571362cx));
                    }
                    ikVar.a();
                    return "";
                }
            }
        }
        return null;
    }
}

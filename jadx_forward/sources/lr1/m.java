package lr1;

/* loaded from: classes9.dex */
public abstract class m {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f402218a = 0;

    static {
        new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.getMainLooper());
    }

    public static void a(android.widget.ImageView imageView, com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var, java.lang.String str, boolean z17) {
        o11.f fVar = new o11.f();
        fVar.f423624o = com.p314xaae8f345.mm.R.C30861xcebc809e.bgo;
        fVar.f423612c = true;
        fVar.f423629t = true;
        n11.a.b().h(str, imageView, fVar.a());
    }

    public static boolean b(android.widget.TextView textView, java.lang.CharSequence charSequence) {
        if (textView == null) {
            return false;
        }
        if (charSequence == null || charSequence.length() == 0) {
            textView.setVisibility(8);
            return false;
        }
        textView.setVisibility(0);
        textView.setText(charSequence);
        return true;
    }

    public static android.text.Spanned c(android.content.Context context, java.lang.String str, java.util.List list, int i17) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return null;
        }
        if (context == null || list == null) {
            return new android.text.SpannableString(str);
        }
        p13.j e17 = o13.q.e(p13.i.a(str, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(list, " "), false, false));
        java.lang.CharSequence charSequence = e17.f432638a;
        return charSequence instanceof android.text.Spannable ? (android.text.Spannable) charSequence : new android.text.SpannableString(e17.f432638a);
    }
}

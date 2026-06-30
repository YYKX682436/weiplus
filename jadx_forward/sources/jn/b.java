package jn;

/* loaded from: classes.dex */
public class b implements tg3.c1 {
    @Override // tg3.c1
    public java.lang.CharSequence Ya(java.util.Map map, java.lang.String str, android.os.Bundle bundle, java.lang.ref.WeakReference weakReference, java.lang.ref.WeakReference weakReference2) {
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
        java.lang.String str2 = (java.lang.String) map.get(str + ".title");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            return "";
        }
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        ((ke0.e) xVar).getClass();
        android.text.SpannableString i17 = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(context, str2);
        jn.a aVar = new jn.a(this, 1, null, weakReference, bundle, map, weakReference2);
        aVar.m75740x3ab833d4(true);
        i17.setSpan(aVar, 0, str2.length(), 33);
        spannableStringBuilder.append((java.lang.CharSequence) i17);
        return spannableStringBuilder;
    }
}

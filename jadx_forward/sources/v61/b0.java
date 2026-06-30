package v61;

/* loaded from: classes4.dex */
public class b0 implements tg3.c1 {
    @Override // tg3.c1
    public java.lang.CharSequence Ya(java.util.Map map, java.lang.String str, android.os.Bundle bundle, java.lang.ref.WeakReference weakReference, java.lang.ref.WeakReference weakReference2) {
        java.lang.String str2 = (java.lang.String) map.get(str + ".title");
        android.text.SpannableString spannableString = new android.text.SpannableString(str2);
        if (!android.text.TextUtils.isEmpty(str2)) {
            spannableString.setSpan(new v61.a0(this, 1, null, weakReference), 0, str2.length(), 33);
        }
        return spannableString;
    }
}

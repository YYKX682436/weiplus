package m90;

/* loaded from: classes4.dex */
public class n1 implements tg3.c1 {
    @Override // tg3.c1
    public java.lang.CharSequence Ya(java.util.Map map, java.lang.String str, android.os.Bundle bundle, java.lang.ref.WeakReference weakReference, java.lang.ref.WeakReference weakReference2) {
        if (map == null) {
            return null;
        }
        if (map.containsKey(str + ".redpacketinfo")) {
            return "";
        }
        java.lang.String str2 = (java.lang.String) map.get(str + ".title");
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        java.lang.String str3 = str2 != null ? str2 : "";
        java.lang.String str4 = (java.lang.String) map.get(str + ".url");
        android.text.SpannableString spannableString = new android.text.SpannableString(str3);
        if (!android.text.TextUtils.isEmpty(str4)) {
            m90.m1 m1Var = new m90.m1(this, 1, null, weakReference, str4);
            m1Var.m75740x3ab833d4(true);
            spannableString.setSpan(m1Var, 0, str3.length(), 33);
        }
        return spannableString;
    }
}

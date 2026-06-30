package m90;

/* loaded from: classes4.dex */
public class y1 implements tg3.c1 {
    @Override // tg3.c1
    public java.lang.CharSequence Ya(java.util.Map map, java.lang.String str, android.os.Bundle bundle, java.lang.ref.WeakReference weakReference, java.lang.ref.WeakReference weakReference2) {
        if (map == null) {
            return null;
        }
        java.lang.String string = bundle != null ? bundle.getString("conv_talker_username") : "";
        ((sg3.r) i95.n0.c(sg3.r.class)).hj(map, str, bundle, weakReference, string, false);
        java.lang.String str2 = (java.lang.String) map.get(str + ".title");
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        java.lang.String str3 = str2 == null ? "" : str2;
        android.text.SpannableString spannableString = new android.text.SpannableString(str3);
        m90.x1 x1Var = new m90.x1(this, 1, null, map, str, bundle, weakReference, string, weakReference2);
        x1Var.m75740x3ab833d4(true);
        spannableString.setSpan(x1Var, 0, str3.length(), 33);
        return spannableString;
    }
}

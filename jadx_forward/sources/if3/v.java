package if3;

/* loaded from: classes.dex */
public class v implements tg3.c1 {
    @Override // tg3.c1
    public java.lang.CharSequence Ya(java.util.Map map, java.lang.String str, android.os.Bundle bundle, java.lang.ref.WeakReference weakReference, java.lang.ref.WeakReference weakReference2) {
        long E1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.E1((java.lang.String) map.get(str + ".masssend_newxml_info.newmsgid"));
        java.lang.String str2 = (java.lang.String) map.get(str + ".title");
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er erVar = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er) ((com.p314xaae8f345.p2837x8fa2df7c.p2838xc43d2152.p2840x373aa5.C23001x9d3a0bdc) weakReference2.get()).getTag();
        java.lang.String str3 = erVar != null ? erVar.f285439b : "";
        android.text.SpannableString spannableString = new android.text.SpannableString(str2);
        if (!android.text.TextUtils.isEmpty(str2)) {
            spannableString.setSpan(new if3.u(this, 1, null, str3, weakReference, E1), 0, str2.length(), 33);
        }
        return spannableString;
    }
}

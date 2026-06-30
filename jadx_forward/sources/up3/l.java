package up3;

/* loaded from: classes12.dex */
public class l implements up3.p {
    @Override // up3.a
    public java.lang.Object a(java.lang.Object obj) {
        java.lang.String str;
        java.lang.String str2 = (java.lang.String) ((java.util.Map) obj).get(up3.o.f511376i);
        if (str2 == null) {
            str2 = "";
        }
        java.lang.String e17 = up3.o.e(str2, ':', true);
        try {
            if (android.text.TextUtils.isEmpty(e17)) {
                str = up3.o.f511383s;
            } else {
                str = up3.o.f511383s + ":" + e17;
            }
            android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            java.lang.String str3 = up3.n.f511366a;
            android.content.Intent intent = new android.content.Intent(up3.n.f511367b);
            intent.putExtra("op", 2);
            intent.putExtra(up3.n.f511368c, str);
            intent.setPackage(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b);
            context.sendBroadcast(intent, up3.n.f511366a);
            return null;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(up3.o.f511371d, th6, "[-] Explained by src 8: %s", e17);
            return null;
        }
    }
}

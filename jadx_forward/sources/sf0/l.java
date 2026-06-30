package sf0;

/* loaded from: classes.dex */
public class l implements gm0.i2 {
    @Override // gm0.i2
    public void kh(int i17) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274645h != i17) {
            android.content.SharedPreferences sharedPreferences = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSharedPreferences("UpdaterConfigSharedPreferences", 0);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(sharedPreferences, "getSharedPreferences(...)");
            sharedPreferences.edit().putInt("RedDotCheckUpdateTab", 0).putInt("RedDotAboutWechatTab", 0).putInt("RedDotSettingTab", 0).putInt("RedDotBottomTab", 0).apply();
        }
    }
}

package wv;

@j95.b
/* loaded from: classes11.dex */
public class i0 extends i95.w implements xv.o0 {
    public void Ai() {
        java.util.Map map = c83.e.f121211a;
        android.content.SharedPreferences sharedPreferences = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSharedPreferences("tinker_patch_share_config", 4);
        sharedPreferences.edit().putLong(c83.e.f121213c, java.lang.System.currentTimeMillis()).apply();
        java.lang.String str = c83.e.f121214d;
        sharedPreferences.edit().putInt(str, sharedPreferences.getInt(str, 0) + 1).apply();
    }

    public boolean wi() {
        java.util.Map map = c83.e.f121211a;
        android.content.SharedPreferences sharedPreferences = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSharedPreferences("tinker_patch_share_config", 4);
        return java.lang.System.currentTimeMillis() - sharedPreferences.getLong(c83.e.f121213c, 0L) > 86400000 && sharedPreferences.getInt(c83.e.f121214d, 0) < 4;
    }
}

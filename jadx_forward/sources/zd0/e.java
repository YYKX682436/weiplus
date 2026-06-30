package zd0;

@j95.b
/* loaded from: classes7.dex */
public class e extends i95.w implements ae0.h {
    public java.lang.String Ai(java.lang.String str) {
        return xp1.d.d(str, wo.w0.g(true));
    }

    public java.lang.String Bi(java.lang.String str) {
        return xp1.d.d(str, wo.w0.c());
    }

    public java.lang.String Di(java.lang.String str, boolean z17) {
        if (str != null && str.length() > 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShortcutUtil", "process name: %s", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.W(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, android.os.Process.myPid()));
            wo.w0.f529372a = true;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DeviceInfo", "allowGetSensitiveDataFromSys");
            java.lang.String h17 = xp1.c.h(str, z17 ? wo.w0.c() : wo.w0.g(true));
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(h17)) {
                return "shortcut_" + xp1.c.o(h17.getBytes());
            }
        }
        return null;
    }

    @Override // i95.w
    /* renamed from: onAccountInitialized */
    public void mo204xfac946a6(android.content.Context context) {
        java.util.Set<java.lang.String> stringSet;
        super.mo204xfac946a6(context);
        android.content.SharedPreferences sharedPreferences = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSharedPreferences("app_brand_global_sp", 0);
        if (sharedPreferences == null || (stringSet = sharedPreferences.getStringSet("uin_set", new java.util.HashSet())) == null) {
            return;
        }
        if (stringSet.add("" + gm0.j1.b().h())) {
            android.content.SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.remove("uin_set");
            edit.commit();
            edit.putStringSet("uin_set", stringSet);
            edit.commit();
        }
    }

    public java.lang.String wi(java.lang.String str, java.lang.String str2) {
        return kk.k.g((kk.k.g(str.getBytes()) + xp1.c.h(str2, str)).getBytes());
    }
}

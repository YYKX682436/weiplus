package c01;

/* loaded from: classes5.dex */
public class b9 extends lp0.h {

    /* renamed from: c, reason: collision with root package name */
    public static final c01.b9 f37069c = new c01.b9(lp0.h.f320266b);

    /* renamed from: d, reason: collision with root package name */
    public static final java.lang.String f37070d = lp0.b.e() + "last_avatar_dir";

    public b9(lp0.h hVar) {
        super(hVar.f320267a);
    }

    public void b(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.LastLoginInfo", "Save last avatar: " + str);
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return;
        }
        java.lang.String substring = str.substring(str.lastIndexOf(47) + 1);
        if (com.tencent.mm.sdk.platformtools.t8.K0(substring)) {
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.lang.String str2 = f37070d;
        sb6.append(str2);
        sb6.append("/");
        sb6.append(substring);
        java.lang.String sb7 = sb6.toString();
        com.tencent.mm.vfs.w6.u(str2);
        com.tencent.mars.xlog.Log.i("MicroMsg.LastLoginInfo", "delete old avatar path[%s], ret[%b]", sb7, java.lang.Boolean.valueOf(com.tencent.mm.vfs.w6.h(sb7)));
        com.tencent.mm.vfs.w6.c(str, sb7);
        d("last_avatar_path", sb7);
        if (gm0.j1.a()) {
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_LAST_LOGIN_AVATAR_PATH_STRING, sb7);
        }
    }

    public void c(java.lang.String str, int i17, java.lang.String str2) {
        int i18;
        if (i17 != 0) {
            d("last_login_bind_qq", java.lang.String.valueOf(i17));
            i18 = 1;
        } else {
            i18 = 0;
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            i18 |= 2;
            d("last_login_bind_email", java.lang.String.valueOf(str2));
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            i18 |= 4;
            d("last_login_bind_mobile", str);
        }
        d("last_bind_info", i18 + "");
    }

    public void d(java.lang.String str, java.lang.String str2) {
        com.tencent.mars.xlog.Log.i("MicroMsg.LastLoginInfo", "save key : %s value : %s", str, str2);
        android.content.SharedPreferences.Editor edit = this.f320267a.edit();
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        edit.putString(str, str2 == null ? "" : str2).commit();
        if (str.equals("login_weixin_username")) {
            com.tencent.mm.sdk.platformtools.x2.f193071a.getSharedPreferences("notify_key_pref_no_account", 4).edit().putString("login_weixin_username", str2).commit();
        }
        com.tencent.mm.sdk.platformtools.o4 M = com.tencent.mm.sdk.platformtools.o4.M("MMKV_Name_LastLoginInfo");
        if (str2 == null) {
            str2 = "";
        }
        M.putString(str, str2);
    }
}

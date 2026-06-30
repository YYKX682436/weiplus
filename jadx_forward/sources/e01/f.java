package e01;

/* loaded from: classes4.dex */
public class f extends e01.a {
    @Override // e01.a
    public java.lang.String[] d() {
        return new java.lang.String[]{"wording", "linkname", "linksrc", "showtype", "expiretime"};
    }

    @Override // e01.a
    public java.lang.String e() {
        return "ChattingSecurityBannerStorage_user_status_";
    }

    @Override // e01.a
    public boolean f(java.lang.String str) {
        if (!super.f(str)) {
            return false;
        }
        if (c(str, "showtype").equals("3")) {
            long parseLong = java.lang.Long.parseLong(c(str, "expiretime")) * 1000;
            long c17 = c01.id.c();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingSecurityBannerStorage", "isShowBanner now:" + c17 + ", expireTime:" + parseLong);
            if (c17 >= parseLong && parseLong != 0) {
                b(str);
                return false;
            }
        }
        return true;
    }
}

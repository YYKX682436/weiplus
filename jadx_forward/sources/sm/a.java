package sm;

/* loaded from: classes10.dex */
public abstract class a {
    public static java.lang.String a(java.lang.String str) {
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.l(str)) {
            return "words-en.json";
        }
        if (str.equals("in")) {
            str = dm.i4.f66865x76d1ec5a;
        }
        return "words-" + str + ".json";
    }

    public static java.lang.String b() {
        java.lang.String str;
        java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.a9.f273996a;
        if (c()) {
            str = "brand/2/" + a(str2);
        } else {
            str = "brand/1/" + a(str2);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.XAgreementResManager", "getDefWordsTablePath:  targetLang:%s, isWeChatUser:%s, wordPath:%s ", str2, java.lang.String.valueOf(c()), str);
        return str;
    }

    public static boolean c() {
        int o17;
        if ((com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.e()).o("repairer_separation_use_default_agreement", 1) != 1) && (o17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.e()).o("repairer_separation_agreement", -1)) != -1) {
            if (o17 == 0) {
                return false;
            }
            if (o17 == 1) {
                return true;
            }
        }
        return !(android.text.TextUtils.isEmpty(com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("mmkv_crossprocess_infos").u("mmkv_key_user_reg_ic", null)) ? com.p314xaae8f345.mm.sdk.p2603x2137b148.a9.f273996a.equals("zh_CN") : "CN".equalsIgnoreCase(r0));
    }
}

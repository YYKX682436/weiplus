package kp5;

/* loaded from: classes12.dex */
public class a extends com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C27997xfdbbeb01 {
    public a(int i17) {
        this.f62849x72d77883 = i17;
    }

    public final java.lang.String a(java.lang.String str, java.lang.String str2) {
        int i17 = this.f62849x72d77883;
        if (i17 != 40 && i17 != -20) {
            str = str.replaceAll(" ", "");
        }
        int i18 = this.f62849x72d77883;
        if (i18 != -20 && i18 != -10) {
            if (i18 == 20 || i18 == 30 || i18 == 40 || i18 == 50) {
                return b(false, str, str2);
            }
            if (i18 != 60) {
                return str;
            }
        }
        return b(true, str, str2);
    }

    public final java.lang.String b(boolean z17, java.lang.String str, java.lang.String str2) {
        int i17 = this.f62849x72d77883;
        int i18 = -20 == i17 ? 40 : -10 == i17 ? 20 : i17;
        java.lang.String str3 = (i17 == -10 || i17 == -20 || i17 == 60) ? com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C27997xfdbbeb01.f62846x68d3fef : com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C27997xfdbbeb01.f62845xa1e463a0;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(i18);
        sb6.append("|");
        sb6.append(str3);
        sb6.append("|");
        sb6.append(str2);
        sb6.append("|");
        if (z17) {
            char[] cArr = com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.f274579a;
            sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.b(str.getBytes()));
        } else {
            sb6.append(str);
        }
        try {
            byte[] bytes = sb6.toString().getBytes();
            com.p314xaae8f345.mm.p2493x1bc889d6.C19764x527bffc1 c19764x527bffc1 = new com.p314xaae8f345.mm.p2493x1bc889d6.C19764x527bffc1();
            if (!com.p314xaae8f345.mm.p2496xc50a8ce6.C19776x5804ff1f.m75992x80cb5d5c(bytes, c19764x527bffc1, m121505x960859e4().getBytes(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c), m121506x960c713b().getBytes(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c))) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WxPayuSecureEncrypt", "MMProtocalJni encrypt failed!");
            }
            return "01" + android.util.Base64.encodeToString(c19764x527bffc1.f38861x6ac9171, 2);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WxPayuSecureEncrypt", e17, "", new java.lang.Object[0]);
            return null;
        }
    }

    @Override // com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C27997xfdbbeb01, com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.InterfaceC27988x58d9925
    /* renamed from: desedeEncode */
    public java.lang.String mo121431xea62cd8a(java.lang.String str, java.lang.String str2) {
        return a(str, str2);
    }

    @Override // com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C27997xfdbbeb01, com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.InterfaceC27988x58d9925
    /* renamed from: desedeVerifyCode */
    public java.lang.String mo121432x19b57b7a(java.lang.String str, java.lang.String str2) {
        return a(str, str2);
    }

    @Override // com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C27997xfdbbeb01, com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.InterfaceC27988x58d9925
    /* renamed from: encryptPasswd */
    public java.lang.String mo121433xd26bb163(boolean z17, java.lang.String str, java.lang.String str2) {
        return a(str, str2);
    }
}

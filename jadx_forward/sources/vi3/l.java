package vi3;

/* loaded from: classes10.dex */
public abstract class l {
    public static void a(java.lang.String str, java.lang.String str2, byte[] bArr) {
        int i17;
        if (android.text.TextUtils.isEmpty(str) || bArr == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MsgSynchronizeUtil", "appendFile dir:%s fileName:%s ", str, str2);
            return;
        }
        int i18 = 3;
        while (true) {
            int i19 = i18 - 1;
            if (i18 <= 0) {
                return;
            }
            long e17 = kn1.k.e(str + str2);
            try {
                com.p314xaae8f345.mm.vfs.z7 a17 = com.p314xaae8f345.mm.vfs.z7.a(str);
                java.lang.String str3 = a17.f294812f;
                if (str3 != null) {
                    java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str3, false, false);
                    if (!str3.equals(l17)) {
                        a17 = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, l17, a17.f294813g, a17.f294814h);
                    }
                }
                com.p314xaae8f345.mm.vfs.b3 b3Var = com.p314xaae8f345.mm.vfs.a3.f294314a;
                com.p314xaae8f345.mm.vfs.z2 m17 = b3Var.m(a17, null);
                if (!(!m17.a() ? false : m17.f294799a.F(m17.f294800b))) {
                    com.p314xaae8f345.mm.vfs.z2 m18 = b3Var.m(a17, m17);
                    if (m18.a()) {
                        m18.f294799a.r(m18.f294800b);
                    }
                }
                java.lang.String str4 = str + "/" + str2;
                com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(str4);
                if (!r6Var.m()) {
                    r6Var.k();
                }
                i17 = com.p314xaae8f345.mm.vfs.w6.a(str4, bArr);
            } catch (java.lang.Exception e18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.MsgSynchronizeUtil", e18, "", new java.lang.Object[0]);
                i17 = -1;
            }
            long e19 = kn1.k.e(str + str2);
            if (i17 == 0 && e19 >= bArr.length) {
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MsgSynchronizeUtil", "appendFile retry:%d append:%d  old:%d  new:%d  data:%d", java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(e17), java.lang.Long.valueOf(e19), java.lang.Integer.valueOf(bArr.length));
            i18 = i19;
        }
    }

    public static java.lang.String b() {
        return gm0.j1.u().h() + "msgsynchronize/";
    }

    public static java.lang.String c() {
        try {
            java.lang.String str = gm0.j1.u().h() + "msgsynchronize.zip";
            com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(str);
            if (!r6Var.m()) {
                r6Var.k();
            }
            return str;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.MsgSynchronizeUtil", e17, "", new java.lang.Object[0]);
            return "";
        }
    }
}

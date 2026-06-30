package qp5;

/* loaded from: classes9.dex */
public abstract class z {
    public static java.lang.String a(int i17, com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28001xdd2bb359 c28001xdd2bb359, long j17, java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.IEncryptDelegate", "is tenpay. encrypt with tenpay");
        if (j17 == 0) {
            j17 = c01.id.a() / 1000;
        }
        long j18 = j17;
        switch (i17) {
            case 0:
                com.p314xaae8f345.mm.p2802xd031a825.b.a().g();
                return c28001xdd2bb359.m121598x15a9108d(false, true);
            case 1:
                com.p314xaae8f345.mm.p2802xd031a825.b.a().g();
                return c28001xdd2bb359.m121598x15a9108d(true, true);
            case 2:
                return c28001xdd2bb359.m121591x7d902dbb();
            case 3:
                return c28001xdd2bb359.m121593xa958131b();
            case 4:
                return c28001xdd2bb359.m121599xcaa6edea(com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28001xdd2bb359.EncryptMode.SM2_WITH_MD5, j18, str);
            case 5:
                return c28001xdd2bb359.m121599xcaa6edea(com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28001xdd2bb359.EncryptMode.SM2_WITH_PBKDF2, j18, str);
            case 6:
                return c28001xdd2bb359.m121600xf456eafd(com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28001xdd2bb359.HKSoftEncryMode.HKSOFT_RSA2048_WITH_MD5, j18, str, str2);
            case 7:
                return c28001xdd2bb359.m121600xf456eafd(com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28001xdd2bb359.HKSoftEncryMode.HKSOFT_RSA2048_WITH_PBKDF2, j18, str, str2);
            default:
                return c28001xdd2bb359.getText().toString() == null ? "" : c28001xdd2bb359.getText().toString();
        }
    }
}

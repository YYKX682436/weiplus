package com.p3249xcbb51f6b.tsm;

/* renamed from: com.tenpay.tsm.TSMStorage */
/* loaded from: classes16.dex */
public class C28042x6bec74ed {
    /* renamed from: checkSM2PriKey */
    public static boolean m121997x2b165d68(java.lang.String str) {
        int m122078xaa8ffbb5 = com.p3249xcbb51f6b.p3256x6a710b1.C28047xad48c753.m122078xaa8ffbb5(str);
        if (m122078xaa8ffbb5 == 0) {
            return m122078xaa8ffbb5 == 0;
        }
        if (m122078xaa8ffbb5 == -60012) {
            return false;
        }
        throw new com.p3249xcbb51f6b.tsm.C28041x16492e41(m122078xaa8ffbb5);
    }

    /* renamed from: checkSM2PubKey */
    public static boolean m121998x2b3d7552(java.lang.String str) {
        int m122079xaab7139f = com.p3249xcbb51f6b.p3256x6a710b1.C28047xad48c753.m122079xaab7139f(str);
        if (m122079xaab7139f == 0) {
            return m122079xaab7139f == 0;
        }
        if (m122079xaab7139f == -60012) {
            return false;
        }
        throw new com.p3249xcbb51f6b.tsm.C28041x16492e41(m122079xaab7139f);
    }

    /* renamed from: checkSM4Key */
    public static boolean m121999x2b8e15ed(java.lang.String str) {
        int m122080x55f0e2c0 = com.p3249xcbb51f6b.p3256x6a710b1.C28047xad48c753.m122080x55f0e2c0(str);
        if (m122080x55f0e2c0 == 0) {
            return m122080x55f0e2c0 == 0;
        }
        if (m122080x55f0e2c0 == -60012) {
            return false;
        }
        throw new com.p3249xcbb51f6b.tsm.C28041x16492e41(m122080x55f0e2c0);
    }

    /* renamed from: deleteSM2PriKey */
    public static void m122000xec0ac425(java.lang.String str) {
        int m122081x5bc4ef78 = com.p3249xcbb51f6b.p3256x6a710b1.C28047xad48c753.m122081x5bc4ef78(str);
        if (m122081x5bc4ef78 != 0) {
            throw new com.p3249xcbb51f6b.tsm.C28041x16492e41(m122081x5bc4ef78);
        }
    }

    /* renamed from: deleteSM2PubKey */
    public static void m122001xec31dc0f(java.lang.String str) {
        int m122082x5bec0762 = com.p3249xcbb51f6b.p3256x6a710b1.C28047xad48c753.m122082x5bec0762(str);
        if (m122082x5bec0762 != 0) {
            throw new com.p3249xcbb51f6b.tsm.C28041x16492e41(m122082x5bec0762);
        }
    }

    /* renamed from: deleteSM4Key */
    public static void m122002xd0707050(java.lang.String str) {
        int m122083xf2673ddd = com.p3249xcbb51f6b.p3256x6a710b1.C28047xad48c753.m122083xf2673ddd(str);
        if (m122083xf2673ddd != 0) {
            throw new com.p3249xcbb51f6b.tsm.C28041x16492e41(m122083xf2673ddd);
        }
    }

    /* renamed from: exportSM2PriKey */
    public static java.lang.String[] m122003x36dcf03c(java.lang.String str, com.p3249xcbb51f6b.tsm.C28043xc4c57f6b.TSMStorageSM2KeyFormat tSMStorageSM2KeyFormat) {
        java.lang.String[] strArr = new java.lang.String[1];
        java.lang.String[] strArr2 = new java.lang.String[1];
        int m122084xa6971b8f = com.p3249xcbb51f6b.p3256x6a710b1.C28047xad48c753.m122084xa6971b8f(str, tSMStorageSM2KeyFormat.ordinal(), strArr, strArr2);
        if (m122084xa6971b8f == 0) {
            return new java.lang.String[]{strArr[0], strArr2[0]};
        }
        if (m122084xa6971b8f == -60012) {
            return null;
        }
        throw new com.p3249xcbb51f6b.tsm.C28041x16492e41(m122084xa6971b8f);
    }

    /* renamed from: exportSM2PubKey */
    public static java.lang.String m122004x37040826(java.lang.String str, com.p3249xcbb51f6b.tsm.C28043xc4c57f6b.TSMStorageSM2KeyFormat tSMStorageSM2KeyFormat) {
        java.lang.String[] strArr = new java.lang.String[1];
        int m122085xa6be3379 = com.p3249xcbb51f6b.p3256x6a710b1.C28047xad48c753.m122085xa6be3379(str, tSMStorageSM2KeyFormat.ordinal(), strArr);
        if (m122085xa6be3379 == 0) {
            return strArr[0];
        }
        if (m122085xa6be3379 == -60012) {
            return null;
        }
        throw new com.p3249xcbb51f6b.tsm.C28041x16492e41(m122085xa6be3379);
    }

    /* renamed from: exportSM4Key */
    public static byte[] m122005xcaa89399(java.lang.String str) {
        byte[][] bArr = new byte[1];
        int m122086xec9f6126 = com.p3249xcbb51f6b.p3256x6a710b1.C28047xad48c753.m122086xec9f6126(str, bArr);
        if (m122086xec9f6126 == 0) {
            return bArr[0];
        }
        if (m122086xec9f6126 == -60012) {
            return null;
        }
        throw new com.p3249xcbb51f6b.tsm.C28041x16492e41(m122086xec9f6126);
    }

    /* renamed from: generateSM2KeyPair */
    public static boolean m122006xc21320d6(java.lang.String str) {
        int m122087x93cad0a3 = com.p3249xcbb51f6b.p3256x6a710b1.C28047xad48c753.m122087x93cad0a3(str);
        if (m122087x93cad0a3 == 0) {
            return true;
        }
        throw new com.p3249xcbb51f6b.tsm.C28041x16492e41(m122087x93cad0a3);
    }

    /* renamed from: generateSM4Key */
    public static boolean m122007x7ff5809a(java.lang.String str) {
        int m122088xff6f1ee7 = com.p3249xcbb51f6b.p3256x6a710b1.C28047xad48c753.m122088xff6f1ee7(str);
        if (m122088xff6f1ee7 == 0) {
            return true;
        }
        throw new com.p3249xcbb51f6b.tsm.C28041x16492e41(m122088xff6f1ee7);
    }

    /* renamed from: importSM2PriKey */
    public static void m122008xe9c2ef6b(java.lang.String str, java.lang.String str2, com.p3249xcbb51f6b.tsm.C28043xc4c57f6b.TSMStorageSM2KeyFormat tSMStorageSM2KeyFormat) {
        int m122089x597d1abe = com.p3249xcbb51f6b.p3256x6a710b1.C28047xad48c753.m122089x597d1abe(str, str2, tSMStorageSM2KeyFormat.ordinal());
        if (m122089x597d1abe != 0) {
            throw new com.p3249xcbb51f6b.tsm.C28041x16492e41(m122089x597d1abe);
        }
    }

    /* renamed from: importSM2PubKey */
    public static void m122009xe9ea0755(java.lang.String str, java.lang.String str2, com.p3249xcbb51f6b.tsm.C28043xc4c57f6b.TSMStorageSM2KeyFormat tSMStorageSM2KeyFormat) {
        int m122090x59a432a8 = com.p3249xcbb51f6b.p3256x6a710b1.C28047xad48c753.m122090x59a432a8(str, str2, tSMStorageSM2KeyFormat.ordinal());
        if (m122090x59a432a8 != 0) {
            throw new com.p3249xcbb51f6b.tsm.C28041x16492e41(m122090x59a432a8);
        }
    }

    /* renamed from: importSM4Key */
    public static void m122010x839b7aca(java.lang.String str, byte[] bArr) {
        int m122091xa5924857 = com.p3249xcbb51f6b.p3256x6a710b1.C28047xad48c753.m122091xa5924857(str, bArr);
        if (m122091xa5924857 != 0) {
            throw new com.p3249xcbb51f6b.tsm.C28041x16492e41(m122091xa5924857);
        }
    }

    /* renamed from: init */
    public static void m122011x316510(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        int m122092x5c10f9d = com.p3249xcbb51f6b.p3256x6a710b1.C28047xad48c753.m122092x5c10f9d(str, str2, str3);
        if (m122092x5c10f9d != 0) {
            throw new com.p3249xcbb51f6b.tsm.C28041x16492e41(m122092x5c10f9d);
        }
    }

    /* renamed from: updateSM2PriKey */
    public static void m122012x545b2c7(java.lang.String str, java.lang.String str2, com.p3249xcbb51f6b.tsm.C28043xc4c57f6b.TSMStorageSM2KeyFormat tSMStorageSM2KeyFormat) {
        int m122093x74ffde1a = com.p3249xcbb51f6b.p3256x6a710b1.C28047xad48c753.m122093x74ffde1a(str, str2, tSMStorageSM2KeyFormat.ordinal());
        if (m122093x74ffde1a != 0) {
            throw new com.p3249xcbb51f6b.tsm.C28041x16492e41(m122093x74ffde1a);
        }
    }

    /* renamed from: updateSM2PubKey */
    public static void m122013x56ccab1(java.lang.String str, java.lang.String str2, com.p3249xcbb51f6b.tsm.C28043xc4c57f6b.TSMStorageSM2KeyFormat tSMStorageSM2KeyFormat) {
        int m122094x7526f604 = com.p3249xcbb51f6b.p3256x6a710b1.C28047xad48c753.m122094x7526f604(str, str2, tSMStorageSM2KeyFormat.ordinal());
        if (m122094x7526f604 != 0) {
            throw new com.p3249xcbb51f6b.tsm.C28041x16492e41(m122094x7526f604);
        }
    }

    /* renamed from: updateSM4Key */
    public static void m122014xc5b2d4ee(java.lang.String str, byte[] bArr) {
        int m122095xe7a9a27b = com.p3249xcbb51f6b.p3256x6a710b1.C28047xad48c753.m122095xe7a9a27b(str, bArr);
        if (m122095xe7a9a27b != 0) {
            throw new com.p3249xcbb51f6b.tsm.C28041x16492e41(m122095xe7a9a27b);
        }
    }
}

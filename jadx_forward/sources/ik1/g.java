package ik1;

/* loaded from: classes7.dex */
public abstract class g {
    public static final long a(java.lang.String str) {
        long j17;
        com.p314xaae8f345.mm.vfs.x1 m17;
        sk1.b.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        long j18 = 0;
        if (str != null) {
            if (!(str.length() == 0)) {
                com.p314xaae8f345.mm.vfs.z7 a17 = com.p314xaae8f345.mm.vfs.z7.a(str);
                java.lang.String str2 = a17.f294812f;
                if (str2 != null) {
                    java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str2, false, false);
                    if (!str2.equals(l17)) {
                        a17 = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, l17, a17.f294813g, a17.f294814h);
                    }
                }
                long currentTimeMillis = java.lang.System.currentTimeMillis();
                java.lang.String m83301xaf6cfc61 = new com.p314xaae8f345.mm.p2809x52b77bcb.C22917xbc5972a2().m83301xaf6cfc61(str);
                try {
                    j17 = java.lang.Long.parseLong(m83301xaf6cfc61, 16);
                } catch (java.lang.NumberFormatException e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChecksumUtil", "crc32 parseLong failed, hexString(%s), e(%s)", m83301xaf6cfc61, e17.getMessage());
                    j17 = 0;
                }
                long currentTimeMillis2 = java.lang.System.currentTimeMillis();
                java.lang.String str3 = a17.f294812f;
                int lastIndexOf = str3.lastIndexOf("/");
                if (lastIndexOf >= 0) {
                    str3 = str3.substring(lastIndexOf + 1);
                }
                java.lang.Long valueOf = java.lang.Long.valueOf(j17);
                com.p314xaae8f345.mm.vfs.z2 m18 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(a17, null);
                if (m18.a() && (m17 = m18.f294799a.m(m18.f294800b)) != null) {
                    j18 = m17.f294766c;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChecksumUtil", "crc32: file(%s), checksum(%d), size(%.2f)KB, cost(%d)ms", str3, valueOf, java.lang.Double.valueOf(j18 / 1024.0d), java.lang.Long.valueOf(currentTimeMillis2 - currentTimeMillis));
                return j17;
            }
        }
        return 0L;
    }
}

package co5;

/* loaded from: classes8.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public static final co5.i f125372a = new co5.i();

    /* renamed from: b, reason: collision with root package name */
    public static long f125373b;

    public final int a() {
        java.lang.String m40061x1de3608b = com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40061x1de3608b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ILinkVoIPHelper", "on network changed: " + m40061x1de3608b);
        if (m40061x1de3608b != null) {
            int hashCode = m40061x1de3608b.hashCode();
            if (hashCode != 1621) {
                if (hashCode != 1652) {
                    if (hashCode != 1683) {
                        if (hashCode != 1714) {
                            if (hashCode == 2664213 && m40061x1de3608b.equals("WIFI")) {
                                return 4;
                            }
                        } else if (m40061x1de3608b.equals("5G")) {
                            return 6;
                        }
                    } else if (m40061x1de3608b.equals("4G")) {
                        return 5;
                    }
                } else if (m40061x1de3608b.equals("3G")) {
                    return 3;
                }
            } else if (m40061x1de3608b.equals("2G")) {
                return 1;
            }
        }
        return 0;
    }
}

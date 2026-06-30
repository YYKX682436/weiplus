package co5;

/* loaded from: classes8.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public static final co5.i f43839a = new co5.i();

    /* renamed from: b, reason: collision with root package name */
    public static long f43840b;

    public final int a() {
        java.lang.String formatedNetType = com.tencent.mars.comm.NetStatusUtil.getFormatedNetType(com.tencent.mm.sdk.platformtools.x2.f193071a);
        com.tencent.mars.xlog.Log.i("MicroMsg.ILinkVoIPHelper", "on network changed: " + formatedNetType);
        if (formatedNetType != null) {
            int hashCode = formatedNetType.hashCode();
            if (hashCode != 1621) {
                if (hashCode != 1652) {
                    if (hashCode != 1683) {
                        if (hashCode != 1714) {
                            if (hashCode == 2664213 && formatedNetType.equals("WIFI")) {
                                return 4;
                            }
                        } else if (formatedNetType.equals("5G")) {
                            return 6;
                        }
                    } else if (formatedNetType.equals("4G")) {
                        return 5;
                    }
                } else if (formatedNetType.equals("3G")) {
                    return 3;
                }
            } else if (formatedNetType.equals("2G")) {
                return 1;
            }
        }
        return 0;
    }
}

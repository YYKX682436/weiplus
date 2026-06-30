package ha5;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public static final ha5.i f361540a = new ha5.i();

    public final java.lang.String a() {
        java.lang.String i17 = com.p314xaae8f345.mm.vfs.w6.i(com.p314xaae8f345.mm.vfs.q7.c("AFFUDRPath"), true);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(i17)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.UDRPath", "udrAffRoot path is null");
            return null;
        }
        return i17 + "/resource";
    }
}

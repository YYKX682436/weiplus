package at4;

/* loaded from: classes9.dex */
public class p1 {

    /* renamed from: a, reason: collision with root package name */
    public static at4.p1 f95458a;

    /* renamed from: b, reason: collision with root package name */
    public static java.util.ArrayList f95459b;

    public boolean a(at4.i0 i0Var) {
        if (i0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WalletPushNotifyManager", "hy: the callback for registering is null. register failed");
            return false;
        }
        if (f95459b == null) {
            f95459b = new java.util.ArrayList();
        }
        f95459b.add(i0Var);
        return true;
    }

    public boolean b(at4.i0 i0Var) {
        java.util.ArrayList arrayList = f95459b;
        if (arrayList == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WalletPushNotifyManager", "hy: callback pool is null. release failed");
            return false;
        }
        arrayList.remove(i0Var);
        return true;
    }
}

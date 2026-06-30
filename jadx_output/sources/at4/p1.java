package at4;

/* loaded from: classes9.dex */
public class p1 {

    /* renamed from: a, reason: collision with root package name */
    public static at4.p1 f13925a;

    /* renamed from: b, reason: collision with root package name */
    public static java.util.ArrayList f13926b;

    public boolean a(at4.i0 i0Var) {
        if (i0Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WalletPushNotifyManager", "hy: the callback for registering is null. register failed");
            return false;
        }
        if (f13926b == null) {
            f13926b = new java.util.ArrayList();
        }
        f13926b.add(i0Var);
        return true;
    }

    public boolean b(at4.i0 i0Var) {
        java.util.ArrayList arrayList = f13926b;
        if (arrayList == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WalletPushNotifyManager", "hy: callback pool is null. release failed");
            return false;
        }
        arrayList.remove(i0Var);
        return true;
    }
}

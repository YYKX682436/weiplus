package si1;

/* loaded from: classes7.dex */
public abstract class e1 {

    /* renamed from: a, reason: collision with root package name */
    public static final ik1.x f489772a = new ik1.x();

    public static void a(java.lang.String str, z2.f fVar) {
        if (android.text.TextUtils.isEmpty(str) || fVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Luggage.RequestPermissionRegistry", "addCallback fail, invalid arguments");
        } else {
            f489772a.e(str, fVar);
        }
    }

    public static void b(java.lang.String str, z2.f fVar) {
        if (android.text.TextUtils.isEmpty(str) || fVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Luggage.RequestPermissionRegistry", "removeCallback fail, invalid arguments");
        } else {
            f489772a.f(str, fVar);
        }
    }

    public static void c(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Luggage.RequestPermissionRegistry", "removeCallbacks fail, invalid arguments");
        } else {
            f489772a.g(str);
        }
    }

    public static void d(java.lang.String str, int i17, java.lang.String[] strArr, int[] iArr, boolean z17) {
        if (str == null || str.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Luggage.RequestPermissionRegistry", "removeCallback fail, invalid id");
            return;
        }
        java.util.Set d17 = f489772a.d(str);
        if (d17 != null) {
            java.util.Iterator it = d17.iterator();
            while (it.hasNext()) {
                ((z2.f) it.next()).mo50562x953457f1(i17, strArr, iArr);
            }
            if (z17) {
                d17.clear();
            }
        }
    }
}

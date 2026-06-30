package i62;

/* loaded from: classes13.dex */
public final class e implements yj0.d {
    @Override // yj0.d
    public void a(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Object obj, java.lang.Object obj2) {
    }

    @Override // yj0.d
    public void b(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Object obj, java.lang.Object[] objArr) {
        if (str2 != null) {
            switch (str2.hashCode()) {
                case -1401315045:
                    if (str2.equals("onDestroy")) {
                        i62.o.f370496a.d(i62.k.f370491e);
                        return;
                    }
                    return;
                case -1064374413:
                    if (str2.equals("onActivityPreCreated")) {
                        java.lang.Object obj2 = objArr != null ? objArr[0] : null;
                        android.app.Activity activity = obj2 instanceof android.app.Activity ? (android.app.Activity) obj2 : null;
                        if (activity == null) {
                            return;
                        }
                        try {
                            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new i62.b(activity, java.lang.System.nanoTime(), 7));
                            return;
                        } catch (java.lang.Throwable th6) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("ActivityStartReportHelper", th6, "handleActivityOnCreate err", new java.lang.Object[0]);
                            return;
                        }
                    }
                    return;
                case 497594859:
                    if (str2.equals("onActivityPostDestroyed")) {
                        if (objArr != null) {
                            java.lang.Object obj3 = objArr[0];
                        }
                        i62.o.f370496a.d(i62.k.f370491e);
                        return;
                    }
                    return;
                case 1046116283:
                    str2.equals("onCreate");
                    return;
                default:
                    return;
            }
        }
    }
}

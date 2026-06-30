package com.p314xaae8f345.mm.p2802xd031a825;

/* loaded from: classes9.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.Map f295324a = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: b, reason: collision with root package name */
    public static final android.util.SparseArray f295325b = new android.util.SparseArray();

    public static void a(android.app.Activity activity) {
        com.p314xaae8f345.mm.p2802xd031a825.h g17 = g(activity);
        java.lang.Object[] objArr = new java.lang.Object[2];
        objArr[0] = activity;
        objArr[1] = g17 == null ? "" : g17.e();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ProcessManager", "backProcess to1 context: %s procname %s", objArr);
        if (g17 != null) {
            g17.c(activity, 0);
        }
    }

    public static void b(android.app.Activity activity, int i17) {
        if (activity == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ProcessManager", "hy: back context is null");
        }
        com.p314xaae8f345.mm.p2802xd031a825.h g17 = g(activity);
        java.lang.Object[] objArr = new java.lang.Object[3];
        objArr[0] = activity;
        objArr[1] = java.lang.Integer.valueOf(i17);
        objArr[2] = g17 == null ? "" : g17.e();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ProcessManager", "backProcess to1 context: %s errCode %s procname %s ", objArr);
        if (g17 != null) {
            g17.c(activity, i17);
        } else {
            if (activity.isFinishing()) {
                return;
            }
            activity.finish();
        }
    }

    public static void c(android.app.Activity activity, android.os.Bundle bundle, int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ProcessManager", "endProcess with errCode : " + i17);
        if (activity == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ProcessManager", "hy: end context is null");
        }
        if (bundle != null) {
            bundle.putInt("key_process_err_code", i17);
        }
        com.p314xaae8f345.mm.p2802xd031a825.h g17 = g(activity);
        java.lang.Object[] objArr = new java.lang.Object[3];
        objArr[0] = activity;
        objArr[1] = bundle == null ? "" : bundle.toString();
        objArr[2] = g17 != null ? g17.e() : "";
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ProcessManager", "endProcess to1 context: %s bundle: %s procName %s", objArr);
        if (g17 != null) {
            g17.f(activity, bundle);
        } else {
            if (activity.isFinishing()) {
                return;
            }
            activity.finish();
        }
    }

    public static void d(android.app.Activity activity, android.os.Bundle bundle) {
        com.p314xaae8f345.mm.p2802xd031a825.h g17 = g(activity);
        java.lang.Object[] objArr = new java.lang.Object[3];
        objArr[0] = activity;
        objArr[1] = bundle == null ? "" : bundle.toString();
        objArr[2] = g17 != null ? g17.e() : "";
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ProcessManager", "forwardProcess to1 context: %s bundle: %s procName %s", objArr);
        if (g17 != null) {
            g17.o(activity, 0, bundle);
        }
    }

    public static android.os.Bundle e(android.app.Activity activity) {
        com.p314xaae8f345.mm.p2802xd031a825.h g17 = g(activity);
        return g17 != null ? g17.f295334c : new android.os.Bundle();
    }

    public static java.util.List f(java.lang.String str) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        android.util.SparseArray sparseArray = f295325b;
        int size = sparseArray.size();
        for (int i17 = 0; i17 < size; i17++) {
            com.p314xaae8f345.mm.p2802xd031a825.h hVar = (com.p314xaae8f345.mm.p2802xd031a825.h) sparseArray.valueAt(i17);
            if (str.equals(hVar.e())) {
                arrayList.add(hVar);
            }
        }
        return arrayList;
    }

    public static com.p314xaae8f345.mm.p2802xd031a825.h g(android.app.Activity activity) {
        if (activity == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ProcessManager", "hy: ac is null");
            return null;
        }
        if (activity.getIntent() != null) {
            return (com.p314xaae8f345.mm.p2802xd031a825.h) f295325b.get(activity.getIntent().getIntExtra("process_id", 0));
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ProcessManager", "hy: get intent is null");
        return null;
    }

    public static void h(java.lang.String str, java.lang.Class cls) {
        java.util.Map map = f295324a;
        if (!((java.util.concurrent.ConcurrentHashMap) map).containsKey(str)) {
            ((java.util.concurrent.ConcurrentHashMap) map).put(str, cls);
        } else {
            throw new java.lang.IllegalArgumentException("register process fail, exist process=" + str);
        }
    }

    public static void i(int i17) {
        f295325b.remove(i17);
    }

    public static void j(android.app.Activity activity, java.lang.Class cls, android.os.Bundle bundle, com.p314xaae8f345.mm.p2802xd031a825.g gVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ProcessManager", "startProcess to1 context:%s proc name: %s bundle %s", activity, cls.getSimpleName(), bundle == null ? "" : bundle.toString());
        try {
            if ((activity instanceof com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e) && gVar != null) {
                ((com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e) activity).m83117x3e84cd51(gVar);
            }
            if (bundle == null) {
                bundle = new android.os.Bundle();
            }
            if (bundle.getLong("key_SessionId", 0L) == 0) {
                bundle.putLong("key_SessionId", java.lang.System.currentTimeMillis());
            }
            com.p314xaae8f345.mm.p2802xd031a825.h hVar = (com.p314xaae8f345.mm.p2802xd031a825.h) cls.newInstance();
            hVar.f295334c.putAll(bundle);
            hVar.f295332a = new java.lang.ref.WeakReference(gVar);
            hVar.f295333b = new java.lang.ref.WeakReference(activity);
            hVar.A(activity, bundle);
            f295325b.put(cls.hashCode(), hVar);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ProcessManager", e17, "", new java.lang.Object[0]);
        }
    }

    public static void k(android.app.Activity activity, java.lang.String str, java.lang.String str2, android.os.Bundle bundle, com.p314xaae8f345.mm.p2802xd031a825.g gVar) {
        try {
            java.lang.Object[] objArr = new java.lang.Object[3];
            objArr[0] = activity;
            objArr[1] = str2;
            objArr[2] = bundle == null ? "" : bundle.toString();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ProcessManager", "startProcess to2 context:%s proc name: %s bundle %s", objArr);
            java.lang.Class cls = (java.lang.Class) ((java.util.concurrent.ConcurrentHashMap) f295324a).get(str2);
            if (cls != null) {
                j(activity, cls, bundle, gVar);
                return;
            }
            java.lang.String format = java.lang.String.format("start process=%s fail, process not register or plugin no import", str2);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ProcessManager", format);
            db5.t7.m123883x26a183b(activity, format, 1).show();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ProcessManager", "plugin load failed : " + e17.toString());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ProcessManager", e17, "", new java.lang.Object[0]);
        }
    }
}

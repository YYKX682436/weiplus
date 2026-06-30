package y45;

/* loaded from: classes12.dex */
public class k implements yj0.c {
    public k(android.content.Context context) {
    }

    @Override // yj0.c
    public java.lang.Object a(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, final java.lang.Object obj, final java.lang.Object[] objArr) {
        if (str4.equals("getRemoteService")) {
            y45.l.f540904a++;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RecoveryInspector", "BaseGmsClient#getRemoteService, args = " + java.util.Arrays.toString(objArr) + ", count = " + y45.l.f540904a);
            if (obj instanceof com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.AbstractC1900x418ca687) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RecoveryInspector", "post");
                ku5.u0 u0Var = ku5.t0.f394148d;
                java.util.concurrent.Callable callable = new java.util.concurrent.Callable() { // from class: y45.k$$a
                    @Override // java.util.concurrent.Callable
                    public final java.lang.Object call() {
                        java.lang.Object obj2 = obj;
                        java.lang.Object[] objArr2 = objArr;
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RecoveryInspector", "working");
                        java.lang.reflect.Method[] declaredMethods = com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.AbstractC1900x418ca687.class.getDeclaredMethods();
                        int length = declaredMethods.length;
                        int i17 = 0;
                        while (true) {
                            if (i17 >= length) {
                                break;
                            }
                            java.lang.reflect.Method method = declaredMethods[i17];
                            java.lang.Class<?>[] parameterTypes = method.getParameterTypes();
                            if (parameterTypes.length == 2 && parameterTypes[0] == com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.InterfaceC1914xc5c6680b.class && parameterTypes[1] == java.util.Set.class) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RecoveryInspector", "delegate");
                                long uptimeMillis = android.os.SystemClock.uptimeMillis();
                                try {
                                    method.invoke(obj2, objArr2);
                                } catch (java.lang.Throwable th6) {
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.RecoveryInspector", "invoke err: " + th6.getMessage());
                                }
                                long uptimeMillis2 = android.os.SystemClock.uptimeMillis() - uptimeMillis;
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RecoveryInspector", "cost: " + uptimeMillis2);
                                if (uptimeMillis2 > 60000) {
                                    ap.a.a(1, "GmsLagging", null, null, java.lang.String.valueOf(y45.l.f540904a), "lagging");
                                }
                            } else {
                                i17++;
                            }
                        }
                        return null;
                    }
                };
                ku5.t0 t0Var = (ku5.t0) u0Var;
                t0Var.getClass();
                t0Var.n(callable, 0L, "gms-invoke");
            }
        }
        return null;
    }
}

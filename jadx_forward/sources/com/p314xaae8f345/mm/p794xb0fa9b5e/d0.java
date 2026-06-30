package com.p314xaae8f345.mm.p794xb0fa9b5e;

/* loaded from: classes7.dex */
public abstract class d0 {
    public static void a(java.lang.String str, com.p314xaae8f345.mm.p794xb0fa9b5e.s0 s0Var) {
        com.p314xaae8f345.mm.p794xb0fa9b5e.q b17 = com.p314xaae8f345.mm.p794xb0fa9b5e.q.b();
        if (s0Var == null) {
            b17.getClass();
            return;
        }
        synchronized (b17.f149926f) {
            java.util.Set set = (java.util.Set) ((java.util.HashMap) b17.f149926f).get(str);
            if (set == null) {
                set = new java.util.HashSet();
            }
            set.add(s0Var);
            ((java.util.HashMap) b17.f149926f).put(str, set);
        }
    }

    public static void b(java.lang.String str, com.p314xaae8f345.mm.p794xb0fa9b5e.t0 t0Var) {
        com.p314xaae8f345.mm.p794xb0fa9b5e.q b17 = com.p314xaae8f345.mm.p794xb0fa9b5e.q.b();
        if (t0Var == null) {
            b17.getClass();
            return;
        }
        synchronized (b17.f149924d) {
            java.util.Set set = (java.util.Set) ((java.util.HashMap) b17.f149924d).get(str);
            if (set == null) {
                set = new java.util.HashSet();
            }
            set.add(t0Var);
            ((java.util.HashMap) b17.f149924d).put(str, set);
        }
    }

    public static void c(java.lang.String str, com.p314xaae8f345.mm.p794xb0fa9b5e.u0 u0Var) {
        com.p314xaae8f345.mm.p794xb0fa9b5e.q b17 = com.p314xaae8f345.mm.p794xb0fa9b5e.q.b();
        if (u0Var == null) {
            b17.getClass();
            return;
        }
        synchronized (b17.f149925e) {
            java.util.Set set = (java.util.Set) ((java.util.HashMap) b17.f149925e).get(str);
            if (set == null) {
                set = new java.util.HashSet();
            }
            set.add(u0Var);
            ((java.util.HashMap) b17.f149925e).put(str, set);
        }
    }

    public static boolean d(java.lang.String str, android.os.Parcelable parcelable, java.lang.Class cls, com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar) {
        return e(str, parcelable, cls, rVar, null);
    }

    public static boolean e(java.lang.String str, android.os.Parcelable parcelable, java.lang.Class cls, com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar, java.lang.String str2) {
        if (str == null || str.length() == 0) {
            rk0.c.b("IPC.IPCInvoker", "invokeAsync failed, process is null or nil.", new java.lang.Object[0]);
            return false;
        }
        if (cls == null) {
            rk0.c.b("IPC.IPCInvoker", "invokeAsync failed, taskClass is null(process : %s).", str);
            return false;
        }
        com.p314xaae8f345.mm.p794xb0fa9b5e.i0.b();
        com.p314xaae8f345.mm.p794xb0fa9b5e.z zVar = new com.p314xaae8f345.mm.p794xb0fa9b5e.z(cls, str, parcelable, rVar, str2);
        com.p314xaae8f345.mm.p794xb0fa9b5e.r0 r0Var = com.p314xaae8f345.mm.p794xb0fa9b5e.r0.f149928b;
        com.p314xaae8f345.mm.p794xb0fa9b5e.a0 a0Var = new com.p314xaae8f345.mm.p794xb0fa9b5e.a0(str2, zVar);
        if (com.p314xaae8f345.mm.p794xb0fa9b5e.y.f150004d == null) {
            a0Var.run();
            return true;
        }
        if (com.p314xaae8f345.mm.app.v5.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a) != com.p314xaae8f345.mm.app.v5.f135384h) {
            a0Var.run();
        } else if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getPackageName().equals(str)) {
            a0Var.run();
        } else {
            nm.i iVar = (nm.i) nm.i.f419969g.b();
            android.app.Application[] applicationArr = iVar.f419972c;
            if (applicationArr[0] == null) {
                synchronized (applicationArr) {
                    if (iVar.f419972c[0] == null) {
                        throw new java.lang.IllegalStateException("Please call install(...) first.");
                    }
                }
            }
            synchronized (iVar.f419973d) {
                java.lang.Boolean bool = iVar.f419973d[0];
                if (bool == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FirstScreenArrangement2", "[+] Undetermined startup type, but run action %s directly with run_immediately:%s, first_ui_shown:%s", a0Var, java.lang.Boolean.TRUE, java.lang.Boolean.valueOf(iVar.f419975f));
                    ((ku5.t0) ku5.t0.f394148d).h(a0Var, "FirstScreenArrangedTasks");
                } else if (!bool.booleanValue()) {
                    ((ku5.t0) ku5.t0.f394148d).h(a0Var, "FirstScreenArrangedTasks");
                } else if (iVar.f419975f) {
                    ((ku5.t0) ku5.t0.f394148d).h(a0Var, "FirstScreenArrangedTasks");
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FirstScreenArrangement2", "[+] Startup by ui and the first biz ui is not shown, pending action %s.", a0Var);
                    ((java.util.ArrayList) iVar.f419974e).add(a0Var);
                }
            }
        }
        return true;
    }

    public static android.os.Parcelable f(java.lang.String str, android.os.Parcelable parcelable, java.lang.Class cls) {
        if (str == null || str.length() == 0) {
            rk0.c.b("IPC.IPCInvoker", "invokeSync failed, process is null or nil.", new java.lang.Object[0]);
            return null;
        }
        if (cls == null) {
            rk0.c.b("IPC.IPCInvoker", "invokeSync failed, taskClass is null(process : %s).", str);
            return null;
        }
        com.p314xaae8f345.mm.p794xb0fa9b5e.i0.b();
        if (com.p314xaae8f345.mm.p794xb0fa9b5e.y.b(str)) {
            java.lang.Object mo32082xb9724478 = ((com.p314xaae8f345.mm.p794xb0fa9b5e.k0) com.p314xaae8f345.mm.p794xb0fa9b5e.v0.a(cls, com.p314xaae8f345.mm.p794xb0fa9b5e.k0.class)).mo32082xb9724478(parcelable);
            if (mo32082xb9724478 == null) {
                return null;
            }
            return (android.os.Parcelable) mo32082xb9724478;
        }
        l(cls);
        lk0.c a17 = com.p314xaae8f345.mm.p794xb0fa9b5e.q.b().a(str, false);
        try {
            if (a17 == null) {
                rk0.c.b("IPC.IPCInvoker", "invokeSync failed, get bridge is null by process(%s).", str);
                return null;
            }
            rk0.c.c("IPC.IPCInvoker", "invokeSync run, task=" + cls + ", proc=" + str, new java.lang.Object[0]);
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelable("__remote_task_data", parcelable);
            android.os.Bundle D5 = a17.D5(bundle, cls.getName());
            if (D5 == null) {
                return null;
            }
            D5.setClassLoader(com.p314xaae8f345.mm.p794xb0fa9b5e.d0.class.getClassLoader());
            return D5.getParcelable("__remote_task_result_data");
        } catch (android.os.RemoteException e17) {
            rk0.c.a("IPC.IPCInvoker", "invokeSync failed, ipc invoke error : %s", e17);
            return null;
        } finally {
            l(null);
        }
    }

    public static boolean g(java.lang.String str) {
        if (com.p314xaae8f345.mm.p794xb0fa9b5e.y.b(str)) {
            return true;
        }
        com.p314xaae8f345.mm.p794xb0fa9b5e.q b17 = com.p314xaae8f345.mm.p794xb0fa9b5e.q.b();
        b17.getClass();
        if (!((com.p314xaae8f345.mm.p794xb0fa9b5e.y.b(str) || ((java.util.concurrent.ConcurrentHashMap) b17.f149923c).get(str) == null) ? false : true)) {
            return false;
        }
        com.p314xaae8f345.mm.p794xb0fa9b5e.p pVar = (com.p314xaae8f345.mm.p794xb0fa9b5e.p) ((java.util.concurrent.ConcurrentHashMap) b17.f149923c).get(str);
        return (pVar == null || pVar.f149916c || pVar.f149915b == null || pVar.f149914a == null) ? false : true;
    }

    public static void h(com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar) {
        com.p314xaae8f345.mm.p794xb0fa9b5e.b0 b0Var;
        if (rVar == null) {
            return;
        }
        java.util.Map map = com.p314xaae8f345.mm.p794xb0fa9b5e.b0.f149865g;
        synchronized (map) {
            java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) ((java.util.WeakHashMap) map).get(rVar);
            b0Var = weakReference == null ? null : (com.p314xaae8f345.mm.p794xb0fa9b5e.b0) weakReference.get();
        }
        if (b0Var != null) {
            b0Var.e();
        }
        java.util.Set set = pk0.a.f436946a;
        synchronized (set) {
            ((java.util.HashSet) set).remove(rVar);
        }
    }

    public static boolean i(java.lang.String str, com.p314xaae8f345.mm.p794xb0fa9b5e.s0 s0Var) {
        com.p314xaae8f345.mm.p794xb0fa9b5e.q b17 = com.p314xaae8f345.mm.p794xb0fa9b5e.q.b();
        boolean z17 = false;
        if (s0Var == null) {
            b17.getClass();
        } else {
            synchronized (b17.f149926f) {
                java.util.Set set = (java.util.Set) ((java.util.HashMap) b17.f149926f).get(str);
                if (set != null) {
                    z17 = set.remove(s0Var);
                }
            }
        }
        return z17;
    }

    public static void j(java.lang.String str, com.p314xaae8f345.mm.p794xb0fa9b5e.t0 t0Var) {
        com.p314xaae8f345.mm.p794xb0fa9b5e.q b17 = com.p314xaae8f345.mm.p794xb0fa9b5e.q.b();
        if (t0Var == null) {
            b17.getClass();
            return;
        }
        synchronized (b17.f149924d) {
            java.util.Set set = (java.util.Set) ((java.util.HashMap) b17.f149924d).get(str);
            if (set != null) {
                set.remove(t0Var);
            }
        }
    }

    public static void k(java.lang.String str, com.p314xaae8f345.mm.p794xb0fa9b5e.u0 u0Var) {
        com.p314xaae8f345.mm.p794xb0fa9b5e.q b17 = com.p314xaae8f345.mm.p794xb0fa9b5e.q.b();
        if (u0Var == null) {
            b17.getClass();
            return;
        }
        synchronized (b17.f149925e) {
            java.util.Set set = (java.util.Set) ((java.util.HashMap) b17.f149925e).get(str);
            if (set != null) {
                set.remove(u0Var);
            }
        }
    }

    public static void l(java.lang.Class cls) {
        if (com.p314xaae8f345.mm.p794xb0fa9b5e.q.f149920i == null) {
            com.p314xaae8f345.mm.p794xb0fa9b5e.q.f149920i = new java.lang.ThreadLocal();
        }
        com.p314xaae8f345.mm.p794xb0fa9b5e.q.f149920i.set(cls);
    }
}

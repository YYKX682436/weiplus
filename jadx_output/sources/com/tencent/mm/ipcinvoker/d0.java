package com.tencent.mm.ipcinvoker;

/* loaded from: classes7.dex */
public abstract class d0 {
    public static void a(java.lang.String str, com.tencent.mm.ipcinvoker.s0 s0Var) {
        com.tencent.mm.ipcinvoker.q b17 = com.tencent.mm.ipcinvoker.q.b();
        if (s0Var == null) {
            b17.getClass();
            return;
        }
        synchronized (b17.f68393f) {
            java.util.Set set = (java.util.Set) ((java.util.HashMap) b17.f68393f).get(str);
            if (set == null) {
                set = new java.util.HashSet();
            }
            set.add(s0Var);
            ((java.util.HashMap) b17.f68393f).put(str, set);
        }
    }

    public static void b(java.lang.String str, com.tencent.mm.ipcinvoker.t0 t0Var) {
        com.tencent.mm.ipcinvoker.q b17 = com.tencent.mm.ipcinvoker.q.b();
        if (t0Var == null) {
            b17.getClass();
            return;
        }
        synchronized (b17.f68391d) {
            java.util.Set set = (java.util.Set) ((java.util.HashMap) b17.f68391d).get(str);
            if (set == null) {
                set = new java.util.HashSet();
            }
            set.add(t0Var);
            ((java.util.HashMap) b17.f68391d).put(str, set);
        }
    }

    public static void c(java.lang.String str, com.tencent.mm.ipcinvoker.u0 u0Var) {
        com.tencent.mm.ipcinvoker.q b17 = com.tencent.mm.ipcinvoker.q.b();
        if (u0Var == null) {
            b17.getClass();
            return;
        }
        synchronized (b17.f68392e) {
            java.util.Set set = (java.util.Set) ((java.util.HashMap) b17.f68392e).get(str);
            if (set == null) {
                set = new java.util.HashSet();
            }
            set.add(u0Var);
            ((java.util.HashMap) b17.f68392e).put(str, set);
        }
    }

    public static boolean d(java.lang.String str, android.os.Parcelable parcelable, java.lang.Class cls, com.tencent.mm.ipcinvoker.r rVar) {
        return e(str, parcelable, cls, rVar, null);
    }

    public static boolean e(java.lang.String str, android.os.Parcelable parcelable, java.lang.Class cls, com.tencent.mm.ipcinvoker.r rVar, java.lang.String str2) {
        if (str == null || str.length() == 0) {
            rk0.c.b("IPC.IPCInvoker", "invokeAsync failed, process is null or nil.", new java.lang.Object[0]);
            return false;
        }
        if (cls == null) {
            rk0.c.b("IPC.IPCInvoker", "invokeAsync failed, taskClass is null(process : %s).", str);
            return false;
        }
        com.tencent.mm.ipcinvoker.i0.b();
        com.tencent.mm.ipcinvoker.z zVar = new com.tencent.mm.ipcinvoker.z(cls, str, parcelable, rVar, str2);
        com.tencent.mm.ipcinvoker.r0 r0Var = com.tencent.mm.ipcinvoker.r0.f68395b;
        com.tencent.mm.ipcinvoker.a0 a0Var = new com.tencent.mm.ipcinvoker.a0(str2, zVar);
        if (com.tencent.mm.ipcinvoker.y.f68471d == null) {
            a0Var.run();
            return true;
        }
        if (com.tencent.mm.app.v5.a(com.tencent.mm.sdk.platformtools.x2.f193071a) != com.tencent.mm.app.v5.f53851h) {
            a0Var.run();
        } else if (com.tencent.mm.sdk.platformtools.x2.f193071a.getPackageName().equals(str)) {
            a0Var.run();
        } else {
            nm.i iVar = (nm.i) nm.i.f338436g.b();
            android.app.Application[] applicationArr = iVar.f338439c;
            if (applicationArr[0] == null) {
                synchronized (applicationArr) {
                    if (iVar.f338439c[0] == null) {
                        throw new java.lang.IllegalStateException("Please call install(...) first.");
                    }
                }
            }
            synchronized (iVar.f338440d) {
                java.lang.Boolean bool = iVar.f338440d[0];
                if (bool == null) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.FirstScreenArrangement2", "[+] Undetermined startup type, but run action %s directly with run_immediately:%s, first_ui_shown:%s", a0Var, java.lang.Boolean.TRUE, java.lang.Boolean.valueOf(iVar.f338442f));
                    ((ku5.t0) ku5.t0.f312615d).h(a0Var, "FirstScreenArrangedTasks");
                } else if (!bool.booleanValue()) {
                    ((ku5.t0) ku5.t0.f312615d).h(a0Var, "FirstScreenArrangedTasks");
                } else if (iVar.f338442f) {
                    ((ku5.t0) ku5.t0.f312615d).h(a0Var, "FirstScreenArrangedTasks");
                } else {
                    com.tencent.mars.xlog.Log.i("MicroMsg.FirstScreenArrangement2", "[+] Startup by ui and the first biz ui is not shown, pending action %s.", a0Var);
                    ((java.util.ArrayList) iVar.f338441e).add(a0Var);
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
        com.tencent.mm.ipcinvoker.i0.b();
        if (com.tencent.mm.ipcinvoker.y.b(str)) {
            java.lang.Object invoke = ((com.tencent.mm.ipcinvoker.k0) com.tencent.mm.ipcinvoker.v0.a(cls, com.tencent.mm.ipcinvoker.k0.class)).invoke(parcelable);
            if (invoke == null) {
                return null;
            }
            return (android.os.Parcelable) invoke;
        }
        l(cls);
        lk0.c a17 = com.tencent.mm.ipcinvoker.q.b().a(str, false);
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
            D5.setClassLoader(com.tencent.mm.ipcinvoker.d0.class.getClassLoader());
            return D5.getParcelable("__remote_task_result_data");
        } catch (android.os.RemoteException e17) {
            rk0.c.a("IPC.IPCInvoker", "invokeSync failed, ipc invoke error : %s", e17);
            return null;
        } finally {
            l(null);
        }
    }

    public static boolean g(java.lang.String str) {
        if (com.tencent.mm.ipcinvoker.y.b(str)) {
            return true;
        }
        com.tencent.mm.ipcinvoker.q b17 = com.tencent.mm.ipcinvoker.q.b();
        b17.getClass();
        if (!((com.tencent.mm.ipcinvoker.y.b(str) || ((java.util.concurrent.ConcurrentHashMap) b17.f68390c).get(str) == null) ? false : true)) {
            return false;
        }
        com.tencent.mm.ipcinvoker.p pVar = (com.tencent.mm.ipcinvoker.p) ((java.util.concurrent.ConcurrentHashMap) b17.f68390c).get(str);
        return (pVar == null || pVar.f68383c || pVar.f68382b == null || pVar.f68381a == null) ? false : true;
    }

    public static void h(com.tencent.mm.ipcinvoker.r rVar) {
        com.tencent.mm.ipcinvoker.b0 b0Var;
        if (rVar == null) {
            return;
        }
        java.util.Map map = com.tencent.mm.ipcinvoker.b0.f68332g;
        synchronized (map) {
            java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) ((java.util.WeakHashMap) map).get(rVar);
            b0Var = weakReference == null ? null : (com.tencent.mm.ipcinvoker.b0) weakReference.get();
        }
        if (b0Var != null) {
            b0Var.e();
        }
        java.util.Set set = pk0.a.f355413a;
        synchronized (set) {
            ((java.util.HashSet) set).remove(rVar);
        }
    }

    public static boolean i(java.lang.String str, com.tencent.mm.ipcinvoker.s0 s0Var) {
        com.tencent.mm.ipcinvoker.q b17 = com.tencent.mm.ipcinvoker.q.b();
        boolean z17 = false;
        if (s0Var == null) {
            b17.getClass();
        } else {
            synchronized (b17.f68393f) {
                java.util.Set set = (java.util.Set) ((java.util.HashMap) b17.f68393f).get(str);
                if (set != null) {
                    z17 = set.remove(s0Var);
                }
            }
        }
        return z17;
    }

    public static void j(java.lang.String str, com.tencent.mm.ipcinvoker.t0 t0Var) {
        com.tencent.mm.ipcinvoker.q b17 = com.tencent.mm.ipcinvoker.q.b();
        if (t0Var == null) {
            b17.getClass();
            return;
        }
        synchronized (b17.f68391d) {
            java.util.Set set = (java.util.Set) ((java.util.HashMap) b17.f68391d).get(str);
            if (set != null) {
                set.remove(t0Var);
            }
        }
    }

    public static void k(java.lang.String str, com.tencent.mm.ipcinvoker.u0 u0Var) {
        com.tencent.mm.ipcinvoker.q b17 = com.tencent.mm.ipcinvoker.q.b();
        if (u0Var == null) {
            b17.getClass();
            return;
        }
        synchronized (b17.f68392e) {
            java.util.Set set = (java.util.Set) ((java.util.HashMap) b17.f68392e).get(str);
            if (set != null) {
                set.remove(u0Var);
            }
        }
    }

    public static void l(java.lang.Class cls) {
        if (com.tencent.mm.ipcinvoker.q.f68387i == null) {
            com.tencent.mm.ipcinvoker.q.f68387i = new java.lang.ThreadLocal();
        }
        com.tencent.mm.ipcinvoker.q.f68387i.set(cls);
    }
}

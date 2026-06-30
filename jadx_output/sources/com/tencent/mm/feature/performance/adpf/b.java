package com.tencent.mm.feature.performance.adpf;

/* loaded from: classes12.dex */
public final class b extends ob0.e {

    /* renamed from: c, reason: collision with root package name */
    public final com.tencent.mm.feature.performance.adpf.x1 f67393c;

    /* renamed from: d, reason: collision with root package name */
    public final ob0.d f67394d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f67395e;

    /* renamed from: f, reason: collision with root package name */
    public ob0.o3 f67396f;

    /* renamed from: g, reason: collision with root package name */
    public int f67397g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Runnable f67398h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(com.tencent.mm.feature.performance.adpf.x1 scheduler, ob0.d callback) {
        super(callback);
        kotlin.jvm.internal.o.g(scheduler, "scheduler");
        kotlin.jvm.internal.o.g(callback, "callback");
        this.f67393c = scheduler;
        this.f67394d = callback;
        callback.attach(this);
        this.f67395e = callback.getName();
    }

    public static final void c(com.tencent.mm.feature.performance.adpf.b bVar, int i17, int i18) {
        throw new java.lang.IllegalStateException((bVar.f67395e + '(' + com.tencent.mm.feature.performance.adpf.c.b(i17) + ") handleSignal " + com.tencent.mm.feature.performance.adpf.c.a(i18) + " error: signal=" + com.tencent.mm.feature.performance.adpf.c.a(i18) + ", currTaskStatus=" + com.tencent.mm.feature.performance.adpf.c.b(i17)).toString());
    }

    public static final void f(com.tencent.mm.feature.performance.adpf.b bVar, int i17, int i18) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AdpfContinuation", bVar.f67395e + " onLowEnergy fail: transfer to " + com.tencent.mm.feature.performance.adpf.c.b(i18));
        if (i17 == i18) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AdpfContinuation", bVar.f67395e + " onLowEnergy fail: transfer skip, already in " + com.tencent.mm.feature.performance.adpf.c.b(i18));
            return;
        }
        if (i18 == 1) {
            bVar.k();
        } else if (i18 == 2) {
            bVar.i();
        } else {
            throw new java.lang.IllegalStateException(("Unknown fallback status: " + i18).toString());
        }
    }

    public static final void g(com.tencent.mm.feature.performance.adpf.b bVar, int i17) {
        java.lang.annotation.Annotation annotation = bVar.f67394d.getClass().getAnnotation(com.tencent.mm.feature.performance.api.AdpfAnno$Callbacks$RunThreadsWithLowEnergy.class);
        kotlin.jvm.internal.o.d(annotation);
        if (((com.tencent.mm.feature.performance.api.AdpfAnno$Callbacks$RunThreadsWithLowEnergy) annotation).suspendWhenFailed()) {
            f(bVar, i17, 1);
        } else {
            f(bVar, i17, 2);
        }
    }

    public static final void h(com.tencent.mm.feature.performance.adpf.b bVar, int i17) {
        synchronized (bVar.f343898a) {
            bVar.f343899b = i17;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AdpfContinuation", bVar.f67395e + " onLowEnergy done: curr=" + com.tencent.mm.feature.performance.adpf.c.b(bVar.a()));
        bVar.d(bVar.a());
    }

    @Override // ob0.e
    public boolean b(java.util.List tidList) {
        boolean z17;
        kotlin.jvm.internal.o.g(tidList, "tidList");
        com.tencent.mars.xlog.Log.i("MicroMsg.AdpfContinuation", this.f67395e + " runWithLowEnergy: tidList=" + tidList + ", curr=" + com.tencent.mm.feature.performance.adpf.c.b(a()));
        if (tidList.isEmpty()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AdpfContinuation", this.f67395e + " runWithLowEnergy fail: empty tidList");
            return false;
        }
        if (a() != 3) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AdpfContinuation", this.f67395e + " runWithLowEnergy fail: status not meet");
            return false;
        }
        ob0.o3 Ni = ((cr0.z6) ((ob0.p3) i95.n0.c(ob0.p3.class))).Ni(tidList);
        synchronized (Ni) {
            z17 = !Ni.b().isEmpty();
        }
        if (!z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AdpfContinuation", this.f67395e + " runWithLowEnergy fail: schedLowEnergyAffinity failed");
            return false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AdpfContinuation", this.f67395e + " runWithLowEnergy success");
        synchronized (this) {
            ob0.o3 o3Var = this.f67396f;
            if (o3Var == null) {
                this.f67396f = Ni;
            } else {
                o3Var.a(Ni);
            }
        }
        return true;
    }

    public final void d(int i17) {
        if (i17 == 3) {
            ap.a.a(10002, "ThreadProfiler", null, null, "AdpfInspect", "post", this.f67395e + '(' + this.f67393c.e() + ')', com.tencent.mm.feature.performance.adpf.c.b(i17));
        }
        synchronized (this) {
            synchronized (this) {
                if (this.f67398h != null) {
                    android.os.Handler a17 = com.tencent.mm.feature.performance.adpf.a2.a();
                    java.lang.Runnable runnable = this.f67398h;
                    kotlin.jvm.internal.o.d(runnable);
                    a17.removeCallbacks(runnable);
                    this.f67398h = null;
                }
            }
        }
        this.f67398h = new com.tencent.mm.feature.performance.adpf.a(this, i17);
        android.os.Handler a18 = com.tencent.mm.feature.performance.adpf.a2.a();
        java.lang.Runnable runnable2 = this.f67398h;
        kotlin.jvm.internal.o.d(runnable2);
        a18.postDelayed(runnable2, 3600000L);
    }

    public final void e() {
        boolean z17;
        boolean z18;
        java.util.List list;
        boolean z19;
        int a17 = a();
        com.tencent.mars.xlog.Log.i("MicroMsg.AdpfContinuation", this.f67395e + " onLowEnergy: " + com.tencent.mm.feature.performance.adpf.c.b(a17) + ">>" + com.tencent.mm.feature.performance.adpf.c.b(3));
        java.lang.Object obj = this.f67394d;
        if (!obj.getClass().isAnnotationPresent(com.tencent.mm.feature.performance.api.AdpfAnno$Callbacks$OnLowEnergy.class)) {
            z17 = false;
        } else {
            if (!(obj instanceof ob0.a)) {
                throw new java.lang.IllegalStateException(("AdpfCallback annotated with 'OnLowEnergy' should implements " + ob0.a.class).toString());
            }
            ((ob0.a) obj).onLowEnergy();
            z17 = true;
        }
        if (z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AdpfContinuation", this.f67395e + " onLowEnergy: dispatchLowEnergyMode");
            h(this, 3);
            return;
        }
        ob0.d dVar = this.f67394d;
        if (!dVar.getClass().isAnnotationPresent(com.tencent.mm.feature.performance.api.AdpfAnno$Callbacks$RunThreadsWithLowEnergy.class)) {
            z18 = false;
        } else {
            if (!(dVar instanceof ob0.c)) {
                throw new java.lang.IllegalStateException(("AdpfCallback annotated with 'RunThreadsWithLowEnergy' should implements " + ob0.c.class).toString());
            }
            z18 = true;
        }
        if (!z18) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AdpfContinuation", this.f67395e + " onLowEnergy fail: unsupported");
            f(this, a17, 1);
            return;
        }
        java.lang.Object obj2 = this.f67394d;
        if (obj2.getClass().isAnnotationPresent(com.tencent.mm.feature.performance.api.AdpfAnno$Callbacks$RunThreadsWithLowEnergy.class) && (obj2 instanceof ob0.c)) {
            list = ((ob0.c) obj2).runThreadWithLowEnergy();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj3 : list) {
                if (((java.lang.Number) obj3).intValue() <= 0) {
                    arrayList.add(obj3);
                }
            }
            if (!(!arrayList.isEmpty())) {
                arrayList = null;
            }
            if (arrayList != null) {
                throw new java.lang.IllegalStateException(("Illegal thread tid: " + arrayList).toString());
            }
            if (list.contains(java.lang.Integer.valueOf(android.os.Process.myTid()))) {
                throw new java.lang.IllegalStateException("Can NOT run low-energy mode in the ADPF lifecycle thread, run with your worker thread instead!".toString());
            }
        } else {
            list = kz5.p0.f313996d;
        }
        if (list.isEmpty()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AdpfContinuation", this.f67395e + " onLowEnergy fail: empty tidList");
            g(this, a17);
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AdpfContinuation", this.f67395e + " onLowEnergy: runThreadsWithLowEnergyMode, tidList=" + list);
        ob0.o3 Ni = ((cr0.z6) ((ob0.p3) i95.n0.c(ob0.p3.class))).Ni(list);
        synchronized (Ni) {
            z19 = !Ni.b().isEmpty();
        }
        if (!z19) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AdpfContinuation", this.f67395e + " onLowEnergy fail: schedLowEnergyAffinity failed");
            g(this, a17);
            return;
        }
        synchronized (this) {
            ob0.o3 o3Var = this.f67396f;
            if (o3Var == null) {
                this.f67396f = Ni;
            } else {
                o3Var.a(Ni);
            }
        }
        h(this, 3);
    }

    public final void i() {
        boolean z17;
        com.tencent.mars.xlog.Log.i("MicroMsg.AdpfContinuation", this.f67395e + " onResume: " + com.tencent.mm.feature.performance.adpf.c.b(a()) + ">>" + com.tencent.mm.feature.performance.adpf.c.b(2));
        synchronized (this) {
            if (this.f67396f != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.AdpfContinuation", this.f67395e + " onResume: restore LOW_ENERGY");
                ob0.o3 o3Var = this.f67396f;
                kotlin.jvm.internal.o.d(o3Var);
                synchronized (o3Var) {
                    synchronized (o3Var) {
                        z17 = !o3Var.b().isEmpty();
                    }
                    this.f67396f = null;
                }
                if (z17) {
                    ((cr0.z6) ((ob0.p3) i95.n0.c(ob0.p3.class))).Di(o3Var.b());
                }
                this.f67396f = null;
            }
        }
        synchronized (this.f343898a) {
            this.f343899b = 2;
        }
        this.f67394d.onResume();
        com.tencent.mars.xlog.Log.i("MicroMsg.AdpfContinuation", this.f67395e + " onResume done: curr=" + com.tencent.mm.feature.performance.adpf.c.b(a()));
        d(a());
    }

    public final void j(com.tencent.mm.feature.performance.adpf.x0 adpfSignal) {
        kotlin.jvm.internal.o.g(adpfSignal, "adpfSignal");
        int i17 = this.f67397g;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.lang.String str = this.f67395e;
        sb6.append(str);
        sb6.append(" onSignal: ");
        sb6.append(com.tencent.mm.feature.performance.adpf.c.a(i17));
        sb6.append(" >> ");
        int i18 = adpfSignal.f67504a;
        sb6.append(com.tencent.mm.feature.performance.adpf.c.a(i18));
        com.tencent.mars.xlog.Log.i("MicroMsg.AdpfContinuation", sb6.toString());
        int a17 = a();
        if (i18 != 1) {
            if (i18 != 2) {
                if (i18 != 3) {
                    c(this, a17, i18);
                    throw null;
                }
                if (a17 == 0 || a17 == 1) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.AdpfContinuation", str + '(' + com.tencent.mm.feature.performance.adpf.c.b(a17) + ") handleSignal " + com.tencent.mm.feature.performance.adpf.c.a(i18) + ": resume from " + com.tencent.mm.feature.performance.adpf.c.b(a17) + " first");
                    i();
                    int a18 = a();
                    if (a18 == 2) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.AdpfContinuation", "then continue low-energy");
                        e();
                    } else {
                        com.tencent.mars.xlog.Log.i("MicroMsg.AdpfContinuation", "resume failed: " + com.tencent.mm.feature.performance.adpf.c.b(a17) + ">>" + com.tencent.mm.feature.performance.adpf.c.b(a18) + ", skip");
                    }
                } else if (a17 == 2) {
                    e();
                } else {
                    if (a17 != 3) {
                        c(this, a17, i18);
                        throw null;
                    }
                    com.tencent.mars.xlog.Log.i("MicroMsg.AdpfContinuation", str + '(' + com.tencent.mm.feature.performance.adpf.c.b(a17) + ") handleSignal " + com.tencent.mm.feature.performance.adpf.c.a(i18) + " skip: REENTRANT");
                }
            } else if (a17 == 0) {
                i();
            } else if (a17 == 1) {
                i();
            } else if (a17 == 2) {
                com.tencent.mars.xlog.Log.i("MicroMsg.AdpfContinuation", str + '(' + com.tencent.mm.feature.performance.adpf.c.b(a17) + ") handleSignal " + com.tencent.mm.feature.performance.adpf.c.a(i18) + " skip: REENTRANT");
            } else {
                if (a17 != 3) {
                    c(this, a17, i18);
                    throw null;
                }
                i();
            }
        } else if (a17 == 0) {
            k();
        } else if (a17 == 1) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AdpfContinuation", str + '(' + com.tencent.mm.feature.performance.adpf.c.b(a17) + ") handleSignal " + com.tencent.mm.feature.performance.adpf.c.a(i18) + " skip: REENTRANT");
        } else if (a17 == 2) {
            k();
        } else {
            if (a17 != 3) {
                c(this, a17, i18);
                throw null;
            }
            k();
        }
        this.f67397g = i18;
        com.tencent.mars.xlog.Log.i("MicroMsg.AdpfContinuation", str + " onSignalHandled: " + com.tencent.mm.feature.performance.adpf.c.a(i17) + ">>" + com.tencent.mm.feature.performance.adpf.c.a(i18) + ", curr=" + com.tencent.mm.feature.performance.adpf.c.a(this.f67397g));
    }

    public final void k() {
        int a17 = a();
        com.tencent.mars.xlog.Log.i("MicroMsg.AdpfContinuation", this.f67395e + " onSuspend: " + com.tencent.mm.feature.performance.adpf.c.b(a17) + ">>" + com.tencent.mm.feature.performance.adpf.c.b(1));
        ((com.tencent.mm.feature.performance.adpf.s0) ((ob0.f) i95.n0.c(ob0.f.class))).getClass();
        com.tencent.mm.feature.performance.adpf.IAdpfState.Companion.getClass();
        ((com.tencent.mm.feature.performance.adpf.h2) ((ob0.g) ((jz5.n) com.tencent.mm.feature.performance.adpf.k2.f67441c).getValue())).getClass();
        if (com.tencent.mm.feature.performance.adpf.k2.f67439a.e(com.tencent.mm.feature.performance.adpf.IAdpfState.STATE_COMPOSITE_EMERGENCY).active()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AdpfContinuation", this.f67395e + " onSuspend: suspended by emergency states");
            java.lang.String str = com.tencent.matrix.lifecycle.owners.f0.f52719a;
            if (com.tencent.matrix.lifecycle.owners.f0.f52739u && mm.o.j(false, 1, null)) {
                ap.a.a(10002, "ThreadProfiler", null, null, "AdpfInspect", "emergency", this.f67395e + '(' + this.f67393c.e() + ')', com.tencent.mm.feature.performance.adpf.c.b(a17) + ">>" + com.tencent.mm.feature.performance.adpf.c.b(1));
            }
        }
        synchronized (this.f343898a) {
            this.f343899b = 1;
        }
        this.f67394d.onSuspend();
        com.tencent.mars.xlog.Log.i("MicroMsg.AdpfContinuation", this.f67395e + " onSuspend done: curr=" + com.tencent.mm.feature.performance.adpf.c.b(a()));
        synchronized (this) {
            if (this.f67398h != null) {
                android.os.Handler a18 = com.tencent.mm.feature.performance.adpf.a2.a();
                java.lang.Runnable runnable = this.f67398h;
                kotlin.jvm.internal.o.d(runnable);
                a18.removeCallbacks(runnable);
                this.f67398h = null;
            }
        }
    }
}

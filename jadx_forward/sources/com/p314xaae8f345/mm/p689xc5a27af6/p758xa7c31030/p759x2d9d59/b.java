package com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59;

/* loaded from: classes12.dex */
public final class b extends ob0.e {

    /* renamed from: c, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.x1 f148926c;

    /* renamed from: d, reason: collision with root package name */
    public final ob0.d f148927d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f148928e;

    /* renamed from: f, reason: collision with root package name */
    public ob0.o3 f148929f;

    /* renamed from: g, reason: collision with root package name */
    public int f148930g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Runnable f148931h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.x1 scheduler, ob0.d callback) {
        super(callback);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scheduler, "scheduler");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        this.f148926c = scheduler;
        this.f148927d = callback;
        callback.m150907xac1eee45(this);
        this.f148928e = callback.m150909xfb82e301();
    }

    public static final void c(com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.b bVar, int i17, int i18) {
        throw new java.lang.IllegalStateException((bVar.f148928e + '(' + com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.c.b(i17) + ") handleSignal " + com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.c.a(i18) + " error: signal=" + com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.c.a(i18) + ", currTaskStatus=" + com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.c.b(i17)).toString());
    }

    public static final void f(com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.b bVar, int i17, int i18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AdpfContinuation", bVar.f148928e + " onLowEnergy fail: transfer to " + com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.c.b(i18));
        if (i17 == i18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AdpfContinuation", bVar.f148928e + " onLowEnergy fail: transfer skip, already in " + com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.c.b(i18));
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

    public static final void g(com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.b bVar, int i17) {
        java.lang.annotation.Annotation annotation = bVar.f148927d.getClass().getAnnotation(com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.api.InterfaceC10648x6e95a725.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(annotation);
        if (((com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.api.InterfaceC10648x6e95a725) annotation).m45132x8870b973()) {
            f(bVar, i17, 1);
        } else {
            f(bVar, i17, 2);
        }
    }

    public static final void h(com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.b bVar, int i17) {
        synchronized (bVar.f425431a) {
            bVar.f425432b = i17;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AdpfContinuation", bVar.f148928e + " onLowEnergy done: curr=" + com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.c.b(bVar.a()));
        bVar.d(bVar.a());
    }

    @Override // ob0.e
    public boolean b(java.util.List tidList) {
        boolean z17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tidList, "tidList");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AdpfContinuation", this.f148928e + " runWithLowEnergy: tidList=" + tidList + ", curr=" + com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.c.b(a()));
        if (tidList.isEmpty()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AdpfContinuation", this.f148928e + " runWithLowEnergy fail: empty tidList");
            return false;
        }
        if (a() != 3) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AdpfContinuation", this.f148928e + " runWithLowEnergy fail: status not meet");
            return false;
        }
        ob0.o3 Ni = ((cr0.z6) ((ob0.p3) i95.n0.c(ob0.p3.class))).Ni(tidList);
        synchronized (Ni) {
            z17 = !Ni.b().isEmpty();
        }
        if (!z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AdpfContinuation", this.f148928e + " runWithLowEnergy fail: schedLowEnergyAffinity failed");
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AdpfContinuation", this.f148928e + " runWithLowEnergy success");
        synchronized (this) {
            ob0.o3 o3Var = this.f148929f;
            if (o3Var == null) {
                this.f148929f = Ni;
            } else {
                o3Var.a(Ni);
            }
        }
        return true;
    }

    public final void d(int i17) {
        if (i17 == 3) {
            ap.a.a(10002, "ThreadProfiler", null, null, "AdpfInspect", "post", this.f148928e + '(' + this.f148926c.e() + ')', com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.c.b(i17));
        }
        synchronized (this) {
            synchronized (this) {
                if (this.f148931h != null) {
                    android.os.Handler a17 = com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.a2.a();
                    java.lang.Runnable runnable = this.f148931h;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(runnable);
                    a17.removeCallbacks(runnable);
                    this.f148931h = null;
                }
            }
        }
        this.f148931h = new com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.a(this, i17);
        android.os.Handler a18 = com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.a2.a();
        java.lang.Runnable runnable2 = this.f148931h;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(runnable2);
        a18.postDelayed(runnable2, 3600000L);
    }

    public final void e() {
        boolean z17;
        boolean z18;
        java.util.List list;
        boolean z19;
        int a17 = a();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AdpfContinuation", this.f148928e + " onLowEnergy: " + com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.c.b(a17) + ">>" + com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.c.b(3));
        java.lang.Object obj = this.f148927d;
        if (!obj.getClass().isAnnotationPresent(com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.api.InterfaceC10646xad458faa.class)) {
            z17 = false;
        } else {
            if (!(obj instanceof ob0.a)) {
                throw new java.lang.IllegalStateException(("AdpfCallback annotated with 'OnLowEnergy' should implements " + ob0.a.class).toString());
            }
            ((ob0.a) obj).mo54499xa8ad2fdd();
            z17 = true;
        }
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AdpfContinuation", this.f148928e + " onLowEnergy: dispatchLowEnergyMode");
            h(this, 3);
            return;
        }
        ob0.d dVar = this.f148927d;
        if (!dVar.getClass().isAnnotationPresent(com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.api.InterfaceC10648x6e95a725.class)) {
            z18 = false;
        } else {
            if (!(dVar instanceof ob0.c)) {
                throw new java.lang.IllegalStateException(("AdpfCallback annotated with 'RunThreadsWithLowEnergy' should implements " + ob0.c.class).toString());
            }
            z18 = true;
        }
        if (!z18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AdpfContinuation", this.f148928e + " onLowEnergy fail: unsupported");
            f(this, a17, 1);
            return;
        }
        java.lang.Object obj2 = this.f148927d;
        if (obj2.getClass().isAnnotationPresent(com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.api.InterfaceC10648x6e95a725.class) && (obj2 instanceof ob0.c)) {
            list = ((ob0.c) obj2).mo46784xc6f2d661();
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
            list = kz5.p0.f395529d;
        }
        if (list.isEmpty()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AdpfContinuation", this.f148928e + " onLowEnergy fail: empty tidList");
            g(this, a17);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AdpfContinuation", this.f148928e + " onLowEnergy: runThreadsWithLowEnergyMode, tidList=" + list);
        ob0.o3 Ni = ((cr0.z6) ((ob0.p3) i95.n0.c(ob0.p3.class))).Ni(list);
        synchronized (Ni) {
            z19 = !Ni.b().isEmpty();
        }
        if (!z19) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AdpfContinuation", this.f148928e + " onLowEnergy fail: schedLowEnergyAffinity failed");
            g(this, a17);
            return;
        }
        synchronized (this) {
            ob0.o3 o3Var = this.f148929f;
            if (o3Var == null) {
                this.f148929f = Ni;
            } else {
                o3Var.a(Ni);
            }
        }
        h(this, 3);
    }

    public final void i() {
        boolean z17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AdpfContinuation", this.f148928e + " onResume: " + com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.c.b(a()) + ">>" + com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.c.b(2));
        synchronized (this) {
            if (this.f148929f != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AdpfContinuation", this.f148928e + " onResume: restore LOW_ENERGY");
                ob0.o3 o3Var = this.f148929f;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(o3Var);
                synchronized (o3Var) {
                    synchronized (o3Var) {
                        z17 = !o3Var.b().isEmpty();
                    }
                    this.f148929f = null;
                }
                if (z17) {
                    ((cr0.z6) ((ob0.p3) i95.n0.c(ob0.p3.class))).Di(o3Var.b());
                }
                this.f148929f = null;
            }
        }
        synchronized (this.f425431a) {
            this.f425432b = 2;
        }
        this.f148927d.mo46781x57429eec();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AdpfContinuation", this.f148928e + " onResume done: curr=" + com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.c.b(a()));
        d(a());
    }

    public final void j(com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.x0 adpfSignal) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(adpfSignal, "adpfSignal");
        int i17 = this.f148930g;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.lang.String str = this.f148928e;
        sb6.append(str);
        sb6.append(" onSignal: ");
        sb6.append(com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.c.a(i17));
        sb6.append(" >> ");
        int i18 = adpfSignal.f149037a;
        sb6.append(com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.c.a(i18));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AdpfContinuation", sb6.toString());
        int a17 = a();
        if (i18 != 1) {
            if (i18 != 2) {
                if (i18 != 3) {
                    c(this, a17, i18);
                    throw null;
                }
                if (a17 == 0 || a17 == 1) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AdpfContinuation", str + '(' + com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.c.b(a17) + ") handleSignal " + com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.c.a(i18) + ": resume from " + com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.c.b(a17) + " first");
                    i();
                    int a18 = a();
                    if (a18 == 2) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AdpfContinuation", "then continue low-energy");
                        e();
                    } else {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AdpfContinuation", "resume failed: " + com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.c.b(a17) + ">>" + com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.c.b(a18) + ", skip");
                    }
                } else if (a17 == 2) {
                    e();
                } else {
                    if (a17 != 3) {
                        c(this, a17, i18);
                        throw null;
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AdpfContinuation", str + '(' + com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.c.b(a17) + ") handleSignal " + com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.c.a(i18) + " skip: REENTRANT");
                }
            } else if (a17 == 0) {
                i();
            } else if (a17 == 1) {
                i();
            } else if (a17 == 2) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AdpfContinuation", str + '(' + com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.c.b(a17) + ") handleSignal " + com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.c.a(i18) + " skip: REENTRANT");
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AdpfContinuation", str + '(' + com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.c.b(a17) + ") handleSignal " + com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.c.a(i18) + " skip: REENTRANT");
        } else if (a17 == 2) {
            k();
        } else {
            if (a17 != 3) {
                c(this, a17, i18);
                throw null;
            }
            k();
        }
        this.f148930g = i18;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AdpfContinuation", str + " onSignalHandled: " + com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.c.a(i17) + ">>" + com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.c.a(i18) + ", curr=" + com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.c.a(this.f148930g));
    }

    public final void k() {
        int a17 = a();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AdpfContinuation", this.f148928e + " onSuspend: " + com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.c.b(a17) + ">>" + com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.c.b(1));
        ((com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.s0) ((ob0.f) i95.n0.c(ob0.f.class))).getClass();
        com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.InterfaceC10643xb9d7086f.f28887x233c02ec.getClass();
        ((com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.h2) ((ob0.g) ((jz5.n) com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.k2.f148974c).mo141623x754a37bb())).getClass();
        if (com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.k2.f148972a.e(com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.InterfaceC10643xb9d7086f.f28892x6d9274cb).mo40960xab2f7f06()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AdpfContinuation", this.f148928e + " onSuspend: suspended by emergency states");
            java.lang.String str = com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.f0.f134252a;
            if (com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.f0.f134272u && mm.o.j(false, 1, null)) {
                ap.a.a(10002, "ThreadProfiler", null, null, "AdpfInspect", "emergency", this.f148928e + '(' + this.f148926c.e() + ')', com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.c.b(a17) + ">>" + com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.c.b(1));
            }
        }
        synchronized (this.f425431a) {
            this.f425432b = 1;
        }
        this.f148927d.mo46783xe142a15d();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AdpfContinuation", this.f148928e + " onSuspend done: curr=" + com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.c.b(a()));
        synchronized (this) {
            if (this.f148931h != null) {
                android.os.Handler a18 = com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.a2.a();
                java.lang.Runnable runnable = this.f148931h;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(runnable);
                a18.removeCallbacks(runnable);
                this.f148931h = null;
            }
        }
    }
}

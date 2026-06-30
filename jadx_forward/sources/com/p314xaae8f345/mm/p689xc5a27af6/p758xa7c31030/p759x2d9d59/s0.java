package com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59;

@j95.b
/* loaded from: classes12.dex */
public final class s0 extends i95.w implements ob0.f {

    /* renamed from: d, reason: collision with root package name */
    public static final jz5.g f149015d = jz5.h.b(com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.i.f148959d);

    /* renamed from: e, reason: collision with root package name */
    public static final jz5.g f149016e = jz5.h.b(com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.g.f148953d);

    /* renamed from: f, reason: collision with root package name */
    public static final jz5.g f149017f = jz5.h.b(com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.e.f148946d);

    public final void Ai() {
        java.util.Iterator it = com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.x1.f149040f.a().iterator();
        int i17 = 0;
        while (it.hasNext()) {
            i17 += ((com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.x1) it.next()).j();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AdpfFeatureService", "dumpAllCallbacks: " + i17);
        for (com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.x1 x1Var : com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.x1.f149040f.a()) {
            synchronized (x1Var.f()) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                sb6.append(x1Var.e());
                sb6.append(" dump: ");
                sb6.append(x1Var.j());
                sb6.append(", list=");
                java.util.List f17 = x1Var.f();
                java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(f17, 10));
                java.util.Iterator it6 = f17.iterator();
                while (it6.hasNext()) {
                    arrayList.add(((com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.b) ((ob0.e) it6.next())).f148927d.m150909xfb82e301());
                }
                sb6.append(arrayList);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AdpfFeatureService", sb6.toString());
            }
        }
    }

    public void Bi(java.lang.String type) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(type, "type");
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        if (kz5.c0.i("ANR", "SIGNAL_ANR", "LAG", "LAG_IDLE_HANDLER", "LAG_TOUCH").contains(type)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AdpfFeatureService", "onLagging: ".concat(type));
            com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.InterfaceC10643xb9d7086f.f28887x233c02ec.d(com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.InterfaceC10643xb9d7086f.f28910xa61c6470).mo45068xfec5eff7();
            ((com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.b2) ((jz5.n) f149015d).mo141623x754a37bb()).a(30000L, 1800000L);
        }
    }

    public void Di(ob0.d callback) {
        java.lang.Object obj;
        java.lang.Class cls;
        java.lang.Object obj2;
        com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.x1 x1Var;
        f06.d[] dVarArr;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        java.util.Iterator it = com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.x1.f149040f.a().iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.x1) obj).b(callback)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.x1 x1Var2 = (com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.x1) obj;
        if (x1Var2 != null) {
            throw new java.lang.IllegalStateException(("AdpfCallback already registered: " + callback.getClass().getName() + ", scheduler=" + x1Var2.e()).toString());
        }
        java.util.List list = (java.util.List) ((jz5.n) com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.x1.f149042h).mo141623x754a37bb();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj3 : list) {
            if (callback.getClass().isAnnotationPresent((java.lang.Class) obj3)) {
                arrayList.add(obj3);
            }
        }
        if (arrayList.size() > 1) {
            throw new java.lang.IllegalStateException(("AdpfCallback can only be annotated with 1 policy, present: " + arrayList).toString());
        }
        java.util.List list2 = (java.util.List) ((jz5.n) com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.x1.f149043i).mo141623x754a37bb();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj4 : list2) {
            if (callback.getClass().isAnnotationPresent((java.lang.Class) obj4)) {
                arrayList2.add(obj4);
            }
        }
        if (arrayList2.contains(com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.api.InterfaceC10648x6e95a725.class) && arrayList2.contains(com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.api.InterfaceC10646xad458faa.class)) {
            throw new java.lang.IllegalStateException(("AdpfCallback can only be annotated with 1 low-energy callback, present: " + arrayList2).toString());
        }
        if (callback.getClass().isAnnotationPresent(com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.api.InterfaceC10651x7fa7781.class)) {
            java.lang.annotation.Annotation annotation = callback.getClass().getAnnotation(com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.api.InterfaceC10651x7fa7781.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(annotation);
            cls = ((com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.api.InterfaceC10651x7fa7781) annotation).m45133x10a881b9() ? com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.l1.class : com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.k1.class;
        } else {
            cls = callback.getClass().isAnnotationPresent(com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.api.InterfaceC10649x58c45a3c.class) ? com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.c1.class : callback.getClass().isAnnotationPresent(com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.api.InterfaceC10652xb225492.class) ? com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.q1.class : callback.getClass().isAnnotationPresent(com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.api.InterfaceC10650xc317fd5d.class) ? com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.j1.class : com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.k1.class;
        }
        if (callback.getClass().isAnnotationPresent(com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.api.InterfaceC10645x23f31ae6.class)) {
            java.util.List[] listArr = new java.util.List[2];
            java.lang.annotation.Annotation annotation2 = callback.getClass().getAnnotation(com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.api.InterfaceC10645x23f31ae6.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(annotation2);
            listArr[0] = kz5.z.z0(((com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.api.InterfaceC10645x23f31ae6) annotation2).m45130xc1458579());
            java.lang.annotation.Annotation annotation3 = callback.getClass().getAnnotation(com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.api.InterfaceC10645x23f31ae6.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(annotation3);
            java.lang.Class<? extends android.app.Activity>[] m45129x7a1b3bed = ((com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.api.InterfaceC10645x23f31ae6) annotation3).m45129x7a1b3bed();
            p3321xbce91901.jvm.p3324x21ffc6bd.j0 j0Var = p3321xbce91901.jvm.p3324x21ffc6bd.i0.f391657a;
            int length = m45129x7a1b3bed.length;
            if (length == 0) {
                dVarArr = p3321xbce91901.jvm.p3324x21ffc6bd.i0.f391658b;
            } else {
                f06.d[] dVarArr2 = new f06.d[length];
                for (int i17 = 0; i17 < length; i17++) {
                    dVarArr2[i17] = p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(m45129x7a1b3bed[i17]);
                }
                dVarArr = dVarArr2;
            }
            java.util.ArrayList arrayList3 = new java.util.ArrayList(dVarArr.length);
            for (f06.d dVar : dVarArr) {
                arrayList3.add(xz5.a.b(dVar).getName());
            }
            listArr[1] = arrayList3;
            obj2 = kz5.d0.r(kz5.c0.i(listArr));
        } else {
            obj2 = kz5.p0.f395529d;
        }
        java.util.Iterator it6 = com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.x1.f149040f.a().iterator();
        while (true) {
            if (!it6.hasNext()) {
                x1Var = (com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.x1) cls.getConstructor(java.util.List.class).newInstance(obj2);
                java.util.List a17 = com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.x1.f149040f.a();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(x1Var);
                a17.add(x1Var);
                break;
            }
            x1Var = (com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.x1) it6.next();
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(x1Var.getClass(), cls) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(x1Var.d(), obj2)) {
                break;
            }
        }
        synchronized (x1Var.f()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AdpfFeatureService", x1Var.e() + " register: " + callback.m150909xfb82e301());
            x1Var.k();
            x1Var.i(callback);
            com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.b bVar = new com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.b(x1Var, callback);
            bVar.j(x1Var.c("Init"));
            x1Var.f().add(bVar);
        }
        Ai();
    }

    public void Ni(java.lang.String stateName, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(stateName, "stateName");
        com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.InterfaceC10643xb9d7086f.IMutableAdpfState d17 = com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.InterfaceC10643xb9d7086f.f28887x233c02ec.d(stateName);
        if (z17) {
            d17.mo45068xfec5eff7();
        } else {
            d17.mo45067xcd4bed6d();
        }
    }

    @Override // i95.w
    /* renamed from: onCreate */
    public void mo8845x3e5a77bb(android.content.Context context) {
        android.os.PowerManager powerManager;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.k2 k2Var = com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.InterfaceC10643xb9d7086f.f28887x233c02ec;
        k2Var.b(com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.InterfaceC10643xb9d7086f.f28899x7d387f4f);
        k2Var.b(com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.InterfaceC10643xb9d7086f.f28900x9f0d1206);
        k2Var.b(com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.InterfaceC10643xb9d7086f.f28906x317abe32);
        k2Var.b(com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.InterfaceC10643xb9d7086f.f28903xa2240438);
        k2Var.b(com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.InterfaceC10643xb9d7086f.f28904x31761d7e);
        k2Var.b(com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.InterfaceC10643xb9d7086f.f28905x15790c96);
        k2Var.b(com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.InterfaceC10643xb9d7086f.f28889x1e581cd);
        k2Var.b(com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.InterfaceC10643xb9d7086f.f28890x98f1cdd1);
        k2Var.b(com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.InterfaceC10643xb9d7086f.f28888x35a9db14);
        k2Var.b(com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.InterfaceC10643xb9d7086f.f28908x49081a78);
        k2Var.b(com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.InterfaceC10643xb9d7086f.f28909x48c586);
        k2Var.b(com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.InterfaceC10643xb9d7086f.f28907x7a6d18e1);
        k2Var.b(com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.InterfaceC10643xb9d7086f.f28897x9c332c16);
        k2Var.b(com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.InterfaceC10643xb9d7086f.f28898xb354a5a8);
        k2Var.b(com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.InterfaceC10643xb9d7086f.f28901x21a7a784);
        k2Var.b(com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.InterfaceC10643xb9d7086f.f28910xa61c6470);
        k2Var.b(com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.InterfaceC10643xb9d7086f.f28902x27412e03);
        k2Var.b(com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.InterfaceC10643xb9d7086f.f28891x6a6f3283);
        com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.t0 t0Var = com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.t0.f134433d;
        k2Var.a(com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.InterfaceC10643xb9d7086f.f28893xd4779aa7, new com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.C4663xe8a96ff5(t0Var, k2Var.e(com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.InterfaceC10643xb9d7086f.f28899x7d387f4f), k2Var.e(com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.InterfaceC10643xb9d7086f.f28900x9f0d1206)));
        com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.s0 s0Var = com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.s0.f134323d;
        k2Var.a(com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.InterfaceC10643xb9d7086f.f28894xb7503cd6, new com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.C4663xe8a96ff5(s0Var, k2Var.e(com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.InterfaceC10643xb9d7086f.f28902x27412e03), k2Var.e(com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.InterfaceC10643xb9d7086f.f28891x6a6f3283)));
        k2Var.a(com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.InterfaceC10643xb9d7086f.f28895x329ee430, new com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.C4663xe8a96ff5(t0Var, k2Var.e(com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.InterfaceC10643xb9d7086f.f28906x317abe32), k2Var.e(com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.InterfaceC10643xb9d7086f.f28903xa2240438), k2Var.e(com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.InterfaceC10643xb9d7086f.f28904x31761d7e), k2Var.e(com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.InterfaceC10643xb9d7086f.f28905x15790c96)));
        k2Var.a(com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.InterfaceC10643xb9d7086f.f28896x35694041, new com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.C4663xe8a96ff5(t0Var, k2Var.e(com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.InterfaceC10643xb9d7086f.f28889x1e581cd), k2Var.e(com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.InterfaceC10643xb9d7086f.f28888x35a9db14), k2Var.e(com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.InterfaceC10643xb9d7086f.f28908x49081a78), k2Var.e(com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.InterfaceC10643xb9d7086f.f28907x7a6d18e1), k2Var.e(com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.InterfaceC10643xb9d7086f.f28897x9c332c16), k2Var.e(com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.InterfaceC10643xb9d7086f.f28901x21a7a784), k2Var.e(com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.InterfaceC10643xb9d7086f.f28910xa61c6470)));
        k2Var.a(com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.InterfaceC10643xb9d7086f.f28892x6d9274cb, new com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.C4663xe8a96ff5(t0Var, new com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.C4668x25f5e561(new com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.C4663xe8a96ff5(s0Var, k2Var.e(com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.InterfaceC10643xb9d7086f.f28889x1e581cd), k2Var.e(com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.InterfaceC10643xb9d7086f.f28908x49081a78), k2Var.e(com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.InterfaceC10643xb9d7086f.f28897x9c332c16)), false, false), new com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.C4668x25f5e561(new com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.C4663xe8a96ff5(t0Var, k2Var.e(com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.InterfaceC10643xb9d7086f.f28890x98f1cdd1), k2Var.e(com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.InterfaceC10643xb9d7086f.f28909x48c586), k2Var.e(com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.InterfaceC10643xb9d7086f.f28898xb354a5a8)), false, false)));
        com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.C4679x33de8120.f19966x4fbc8495.mo40973x40b15f2e(new com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.s());
        com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.C4681x94468210 c4681x94468210 = com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.C4681x94468210.f19970x4fbc8495;
        c4681x94468210.mo40963x40b15f2e(new com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.u());
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6231x4f3054ba>(a0Var) { // from class: com.tencent.mm.feature.performance.adpf.AdpfFeatureService$initListeners$3

            /* renamed from: d, reason: collision with root package name */
            public final jz5.g f148919d = jz5.h.b(com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.v.f149029d);

            {
                this.f39173x3fe91575 = -797557590;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6231x4f3054ba c6231x4f3054ba) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6231x4f3054ba event = c6231x4f3054ba;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                boolean wi6 = ((kg0.r) ((lg0.n) i95.n0.c(lg0.n.class))).wi();
                jz5.g gVar = this.f148919d;
                am.y00 y00Var = event.f136478g;
                if (wi6) {
                    if (((com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.InterfaceC10643xb9d7086f.IMutableAdpfState) ((jz5.n) gVar).mo141623x754a37bb()).mo40960xab2f7f06()) {
                        return false;
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AdpfFeatureService", "on voip launched: %s", java.lang.Integer.valueOf(y00Var.f89948b));
                    ((com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.InterfaceC10643xb9d7086f.IMutableAdpfState) ((jz5.n) gVar).mo141623x754a37bb()).mo45068xfec5eff7();
                    return false;
                }
                if (!((com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.InterfaceC10643xb9d7086f.IMutableAdpfState) ((jz5.n) gVar).mo141623x754a37bb()).mo40960xab2f7f06()) {
                    return false;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AdpfFeatureService", "on voip stopped: %s", java.lang.Integer.valueOf(y00Var.f89948b));
                ((com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.InterfaceC10643xb9d7086f.IMutableAdpfState) ((jz5.n) gVar).mo141623x754a37bb()).mo45067xcd4bed6d();
                return false;
            }
        }.mo48813x58998cd();
        ob0.f3 f3Var = (ob0.f3) i95.n0.c(ob0.f3.class);
        com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.y yVar = new com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.y();
        ((vk.n) f3Var).getClass();
        vk.l lVar = vk.n.f519274d;
        synchronized (vk.l.b(lVar)) {
            vk.l.b(lVar).add(yVar);
        }
        ph.e eVar = ph.t.f435818m;
        if (eVar.b()) {
            jz5.g b17 = jz5.h.b(com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.p0.f148995d);
            jz5.g b18 = jz5.h.b(com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.h0.f148957d);
            jz5.g b19 = jz5.h.b(com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.g0.f148954d);
            jz5.g b27 = jz5.h.b(com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.f0.f148949d);
            jz5.g b28 = jz5.h.b(com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.q0.f148999d);
            com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.n0 n0Var = new com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.n0(b17);
            com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.i0 i0Var = new com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.i0(b27);
            com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.l0 l0Var = new com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.l0(b18, b19);
            com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.o0 o0Var = new com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.o0(b28);
            ph.c c17 = eVar.a().c();
            n0Var.mo146xb9724478(java.lang.Boolean.valueOf(c17.d()));
            i0Var.mo146xb9724478(java.lang.Integer.valueOf(c17.b()));
            android.content.Context context2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
            l0Var.mo146xb9724478(java.lang.Integer.valueOf(wh.m.l(context2)));
            o0Var.mo146xb9724478(java.lang.Boolean.valueOf(c17.c()));
            eVar.a().b(new com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.z(i0Var, n0Var, l0Var, o0Var));
        }
        if (android.os.Build.VERSION.SDK_INT >= 29 && (powerManager = (android.os.PowerManager) com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService(android.os.PowerManager.class)) != null) {
            com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.d0 d0Var = new com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.d0(new p3321xbce91901.jvm.p3324x21ffc6bd.h0());
            d0Var.mo146xb9724478(java.lang.Integer.valueOf(powerManager.getCurrentThermalStatus()));
            powerManager.addThermalStatusListener(new com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.a0(d0Var));
        }
        ob0.f3 f3Var2 = (ob0.f3) i95.n0.c(ob0.f3.class);
        com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.e0 e0Var = new com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.e0();
        ((vk.n) f3Var2).getClass();
        synchronized (vk.l.c(lVar)) {
            vk.l.c(lVar).add(e0Var);
        }
        if (com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.p2.f148997a) {
            c4681x94468210.mo40963x40b15f2e(new com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.o2());
        }
    }

    public void wi(java.lang.String stateName, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(stateName, "stateName");
        for (com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.x1 x1Var : com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.x1.f149040f.a()) {
            com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.InterfaceC10643xb9d7086f.f28887x233c02ec.getClass();
            ob0.g allStates = (ob0.g) ((jz5.n) com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.k2.f148974c).mo141623x754a37bb();
            x1Var.getClass();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(allStates, "allStates");
            synchronized (x1Var.f()) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                sb6.append(x1Var.e());
                sb6.append(" dispatchStateChanged: ");
                sb6.append(stateName);
                sb6.append('=');
                sb6.append(z17 ? "on" : "off");
                sb6.append(", list=");
                sb6.append(x1Var.f().size());
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AdpfFeatureService", sb6.toString());
                if (!x1Var.f().isEmpty()) {
                    com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.s1 s1Var = new com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.s1(x1Var, stateName, allStates, z17);
                    android.os.Looper myLooper = android.os.Looper.myLooper();
                    jz5.g gVar = com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.a2.f148924a;
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(myLooper, ((android.os.Handler) ((jz5.n) gVar).mo141623x754a37bb()).getLooper())) {
                        s1Var.mo152xb9724478();
                    } else {
                        ((android.os.Handler) ((jz5.n) gVar).mo141623x754a37bb()).post(new com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.v1(s1Var));
                    }
                }
            }
        }
    }
}

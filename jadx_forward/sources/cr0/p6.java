package cr0;

/* loaded from: classes12.dex */
public final class p6 extends com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.g {

    /* renamed from: b, reason: collision with root package name */
    public static final cr0.p6 f303244b = new cr0.p6();

    /* renamed from: c, reason: collision with root package name */
    public static final jz5.g f303245c;

    /* renamed from: d, reason: collision with root package name */
    public static final jz5.g f303246d;

    /* renamed from: e, reason: collision with root package name */
    public static final jz5.g f303247e;

    /* renamed from: f, reason: collision with root package name */
    public static final jz5.g f303248f;

    /* renamed from: g, reason: collision with root package name */
    public static final jz5.g f303249g;

    /* renamed from: h, reason: collision with root package name */
    public static final jz5.g f303250h;

    /* renamed from: i, reason: collision with root package name */
    public static final jz5.g f303251i;

    static {
        jz5.i iVar = jz5.i.f384362d;
        f303245c = jz5.h.a(iVar, cr0.o6.f303237d);
        f303246d = jz5.h.a(iVar, cr0.n6.f303227d);
        f303247e = jz5.h.a(iVar, cr0.h6.f303178d);
        f303248f = jz5.h.a(iVar, cr0.j6.f303195d);
        f303249g = jz5.h.a(iVar, cr0.i6.f303186d);
        f303250h = jz5.h.b(cr0.h5.f303177d);
        f303251i = jz5.h.b(cr0.l6.f303214d);
    }

    @Override // com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.g
    public void a() {
        if (f()) {
            android.os.Handler handler = cr0.z6.f303359f;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(handler);
            jz5.g gVar = f303250h;
            handler.removeCallbacks((java.lang.Runnable) ((jz5.n) gVar).mo141623x754a37bb());
            android.os.Handler handler2 = cr0.z6.f303359f;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(handler2);
            handler2.removeCallbacks((java.lang.Runnable) ((jz5.n) f303251i).mo141623x754a37bb());
            android.os.Handler handler3 = cr0.z6.f303359f;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(handler3);
            handler3.postDelayed((java.lang.Runnable) ((jz5.n) gVar).mo141623x754a37bb(), 300000);
        }
    }

    @Override // com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.g
    public void b() {
        if (f()) {
            android.os.Handler handler = cr0.z6.f303359f;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(handler);
            handler.removeCallbacks((java.lang.Runnable) ((jz5.n) f303250h).mo141623x754a37bb());
            android.os.Handler handler2 = cr0.z6.f303359f;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(handler2);
            jz5.g gVar = f303251i;
            handler2.removeCallbacks((java.lang.Runnable) ((jz5.n) gVar).mo141623x754a37bb());
            android.os.Handler handler3 = cr0.z6.f303359f;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(handler3);
            handler3.post((java.lang.Runnable) ((jz5.n) gVar).mo141623x754a37bb());
        }
    }

    public final java.util.List c() {
        return (java.util.List) f303247e.mo141623x754a37bb();
    }

    public final java.util.List d() {
        return (java.util.List) f303249g.mo141623x754a37bb();
    }

    public final java.util.List e() {
        return (java.util.List) f303246d.mo141623x754a37bb();
    }

    public final boolean f() {
        boolean z17;
        ((cr0.z6) ((ob0.p3) i95.n0.c(ob0.p3.class))).getClass();
        if (cr0.z6.f303359f != null) {
            jz5.g gVar = f303245c;
            synchronized (((java.util.Set) gVar.mo141623x754a37bb())) {
                z17 = !((java.util.Set) gVar.mo141623x754a37bb()).isEmpty();
            }
            if (z17) {
                return true;
            }
        }
        return false;
    }

    public final void g() {
        int i17;
        int threadPriority;
        android.os.Handler wi6;
        if (f() && com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.C4681x94468210.f19970x4fbc8495.mo40965x320351f8()) {
            cr0.f5 f5Var = cr0.z6.f303357d;
            if (((java.lang.Boolean) ((jz5.n) cr0.z6.f303358e).mo141623x754a37bb()).booleanValue() && (wi6 = cr0.z6.wi()) != null) {
                wi6.post(cr0.i5.f303185d);
            }
            java.util.Map a17 = kh.q3.f389430a.a();
            synchronized (c()) {
                int Bi = cr0.z6.Bi();
                java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
                java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap();
                java.util.LinkedHashMap linkedHashMap3 = new java.util.LinkedHashMap();
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                sb6.append("REDUCE thread activity: group=");
                sb6.append(a17.size());
                sb6.append(", total=");
                java.util.Iterator it = a17.values().iterator();
                int i18 = 0;
                int i19 = 0;
                while (it.hasNext()) {
                    i19 += ((java.util.List) it.next()).size();
                }
                sb6.append(i19);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ThreadSchedFeatureService", sb6.toString());
                for (java.util.Map.Entry entry : a17.entrySet()) {
                    java.lang.String str = (java.lang.String) entry.getKey();
                    java.util.List list = (java.util.List) entry.getValue();
                    cr0.p6 p6Var = f303244b;
                    if (!p6Var.e().contains(str)) {
                        java.util.Iterator it6 = list.iterator();
                        while (true) {
                            if (it6.hasNext()) {
                                int a18 = ((kh.f3) ((jz5.l) it6.next()).c()).a();
                                if (!((java.util.Set) f303245c.mo141623x754a37bb()).contains(java.lang.Integer.valueOf(a18))) {
                                    if (!com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.C4681x94468210.f19970x4fbc8495.mo40965x320351f8()) {
                                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ThreadSchedFeatureService", "REDUCE break: fg");
                                        break;
                                    }
                                    if (wh.u1.b(android.os.Process.myPid(), a18)) {
                                        try {
                                            threadPriority = android.os.Process.getThreadPriority(a18);
                                        } catch (java.lang.Exception unused) {
                                            java.lang.Object obj = linkedHashMap.get(-1);
                                            if (obj == null) {
                                                obj = new java.util.ArrayList();
                                                linkedHashMap.put(-1, obj);
                                            }
                                            i17 = 0;
                                            ((java.util.List) obj).add(new jz5.o(java.lang.Integer.valueOf(a18), 0, 0));
                                        }
                                        if (threadPriority != Bi) {
                                            android.os.Process.setThreadPriority(a18, Bi);
                                            java.lang.Integer valueOf = java.lang.Integer.valueOf(i18);
                                            java.lang.Object obj2 = linkedHashMap.get(valueOf);
                                            if (obj2 == null) {
                                                obj2 = new java.util.ArrayList();
                                                linkedHashMap.put(valueOf, obj2);
                                            }
                                            ((java.util.List) obj2).add(new jz5.o(java.lang.Integer.valueOf(a18), java.lang.Integer.valueOf(threadPriority), java.lang.Integer.valueOf(Bi)));
                                            if (((p6Var.f() && cr0.z6.f303360g) ? 1 : i18) != 0) {
                                                try {
                                                    jz5.l c17 = com.p314xaae8f345.p552xbf8d97c1.p561x30f523.p563xb541530b.C4652xc579910a.c(a18);
                                                    int intValue = ((java.lang.Number) c17.a()).intValue();
                                                    int intValue2 = ((java.lang.Number) c17.b()).intValue();
                                                    cr0.f5 f5Var2 = cr0.z6.f303357d;
                                                    if (intValue != ((java.lang.Number) cr0.f5.a(f5Var2).c()).intValue()) {
                                                        int intValue3 = ((java.lang.Number) cr0.f5.a(f5Var2).c()).intValue();
                                                        int intValue4 = ((java.lang.Number) cr0.f5.a(f5Var2).d()).intValue();
                                                        com.p314xaae8f345.p552xbf8d97c1.p561x30f523.p563xb541530b.C4652xc579910a.f134187c.a();
                                                        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(com.p314xaae8f345.p552xbf8d97c1.p561x30f523.p563xb541530b.C4652xc579910a.m40916xe8a94c65(a18, intValue3, intValue4));
                                                        java.lang.Object obj3 = linkedHashMap2.get(valueOf2);
                                                        if (obj3 == null) {
                                                            obj3 = new java.util.ArrayList();
                                                            linkedHashMap2.put(valueOf2, obj3);
                                                        }
                                                        ((java.util.List) obj3).add(new jz5.o(java.lang.Integer.valueOf(a18), new jz5.l(java.lang.Integer.valueOf(intValue), java.lang.Integer.valueOf(intValue2)), cr0.f5.a(f5Var2)));
                                                    }
                                                } catch (java.lang.Throwable unused2) {
                                                }
                                            }
                                            if (p6Var.f() && cr0.z6.f303361h) {
                                                try {
                                                    boolean[] b17 = com.p314xaae8f345.p552xbf8d97c1.p561x30f523.p563xb541530b.C4652xc579910a.b(a18);
                                                    if (zh.c.a(b17) && !java.util.Arrays.equals(cr0.z6.Ai(), b17)) {
                                                        java.lang.Integer valueOf3 = java.lang.Integer.valueOf(com.p314xaae8f345.p552xbf8d97c1.p561x30f523.p563xb541530b.C4652xc579910a.f(a18, cr0.z6.Ai()));
                                                        java.lang.Object obj4 = linkedHashMap3.get(valueOf3);
                                                        if (obj4 == null) {
                                                            obj4 = new java.util.ArrayList();
                                                            linkedHashMap3.put(valueOf3, obj4);
                                                        }
                                                        java.lang.Integer valueOf4 = java.lang.Integer.valueOf(a18);
                                                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(b17);
                                                        boolean[] Ai = cr0.z6.Ai();
                                                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(Ai);
                                                        ((java.util.List) obj4).add(new jz5.o(valueOf4, b17, Ai));
                                                    }
                                                } catch (java.lang.Exception unused3) {
                                                }
                                            }
                                            i17 = 0;
                                            i18 = i17;
                                        }
                                    }
                                }
                                i17 = i18;
                                i18 = i17;
                            }
                        }
                    }
                    i18 = i18;
                }
                java.util.List<java.util.Map.Entry> F0 = kz5.n0.F0(linkedHashMap.entrySet(), new cr0.m5());
                int i27 = 16;
                java.util.LinkedHashMap linkedHashMap4 = new java.util.LinkedHashMap(e06.p.b(kz5.b1.d(kz5.d0.q(F0, 10)), 16));
                for (java.util.Map.Entry entry2 : F0) {
                    jz5.l a19 = jz5.p.a(entry2.getKey(), entry2.getValue());
                    linkedHashMap4.put(a19.c(), a19.d());
                }
                for (java.util.Map.Entry entry3 : linkedHashMap4.entrySet()) {
                    int intValue5 = ((java.lang.Number) entry3.getKey()).intValue();
                    java.util.List list2 = (java.util.List) entry3.getValue();
                    if (intValue5 == 0) {
                        java.util.List F02 = kz5.n0.F0(list2, new cr0.p5());
                        cr0.p6 p6Var2 = f303244b;
                        p6Var2.c().clear();
                        p6Var2.c().addAll(F02);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ThreadSchedFeatureService", "REDUCE nice_succ: " + list2.size());
                        java.util.LinkedHashMap linkedHashMap5 = new java.util.LinkedHashMap();
                        for (java.lang.Object obj5 : list2) {
                            java.lang.Integer valueOf5 = java.lang.Integer.valueOf(((java.lang.Number) ((jz5.o) obj5).e()).intValue());
                            java.lang.Object obj6 = linkedHashMap5.get(valueOf5);
                            if (obj6 == null) {
                                obj6 = new java.util.ArrayList();
                                linkedHashMap5.put(valueOf5, obj6);
                            }
                            ((java.util.List) obj6).add(obj5);
                        }
                        java.util.List<java.util.Map.Entry> F03 = kz5.n0.F0(linkedHashMap5.entrySet(), new cr0.q5());
                        java.util.LinkedHashMap linkedHashMap6 = new java.util.LinkedHashMap(e06.p.b(kz5.b1.d(kz5.d0.q(F03, 10)), i27));
                        for (java.util.Map.Entry entry4 : F03) {
                            jz5.l a27 = jz5.p.a(entry4.getKey(), entry4.getValue());
                            linkedHashMap6.put(a27.c(), a27.d());
                        }
                        for (java.util.Map.Entry entry5 : linkedHashMap6.entrySet()) {
                            int intValue6 = ((java.lang.Number) entry5.getKey()).intValue();
                            java.util.List list3 = (java.util.List) entry5.getValue();
                            java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                            sb7.append(" - ");
                            sb7.append(intValue6);
                            sb7.append(">>");
                            sb7.append(Bi);
                            sb7.append(": ");
                            sb7.append(list3.size());
                            sb7.append(", tids=");
                            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list3, 10));
                            java.util.Iterator it7 = list3.iterator();
                            while (it7.hasNext()) {
                                arrayList.add(java.lang.Integer.valueOf(((java.lang.Number) ((jz5.o) it7.next()).d()).intValue()));
                            }
                            sb7.append(kz5.n0.g0(arrayList, ",", null, null, 0, null, null, 62, null));
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ThreadSchedFeatureService", sb7.toString());
                        }
                    } else {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ThreadSchedFeatureService", "REDUCE nice_fail: " + list2.size());
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ThreadSchedFeatureService", " - " + intValue5 + ": tids=" + kz5.n0.g0(list2, ",", null, null, 0, null, cr0.k5.f303205d, 30, null));
                    }
                    i27 = 16;
                }
                java.util.List<java.util.Map.Entry> F04 = kz5.n0.F0(linkedHashMap2.entrySet(), new cr0.n5());
                java.util.LinkedHashMap linkedHashMap7 = new java.util.LinkedHashMap(e06.p.b(kz5.b1.d(kz5.d0.q(F04, 10)), 16));
                for (java.util.Map.Entry entry6 : F04) {
                    jz5.l a28 = jz5.p.a(entry6.getKey(), entry6.getValue());
                    linkedHashMap7.put(a28.c(), a28.d());
                }
                for (java.util.Map.Entry entry7 : linkedHashMap7.entrySet()) {
                    int intValue7 = ((java.lang.Number) entry7.getKey()).intValue();
                    java.util.List list4 = (java.util.List) entry7.getValue();
                    if (intValue7 == 0) {
                        java.util.List F05 = kz5.n0.F0(list4, new cr0.r5());
                        jz5.g gVar = f303248f;
                        ((java.util.List) gVar.mo141623x754a37bb()).clear();
                        ((java.util.List) gVar.mo141623x754a37bb()).addAll(F05);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ThreadSchedFeatureService", "REDUCE policy_succ: " + list4.size());
                        java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
                        sb8.append(" - ");
                        sb8.append(intValue7);
                        sb8.append(": tids=");
                        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(list4, 10));
                        java.util.Iterator it8 = list4.iterator();
                        while (it8.hasNext()) {
                            arrayList2.add(java.lang.Integer.valueOf(((java.lang.Number) ((jz5.o) it8.next()).d()).intValue()));
                        }
                        sb8.append(kz5.n0.g0(arrayList2, ",", null, null, 0, null, null, 62, null));
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ThreadSchedFeatureService", sb8.toString());
                    } else {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ThreadSchedFeatureService", "REDUCE policy_fail: " + list4.size());
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ThreadSchedFeatureService", " - " + intValue7 + ": tids=" + kz5.n0.g0(list4, ",", null, null, 0, null, cr0.l5.f303213d, 30, null));
                    }
                }
                java.util.List<java.util.Map.Entry> F06 = kz5.n0.F0(linkedHashMap3.entrySet(), new cr0.o5());
                java.util.LinkedHashMap linkedHashMap8 = new java.util.LinkedHashMap(e06.p.b(kz5.b1.d(kz5.d0.q(F06, 10)), 16));
                for (java.util.Map.Entry entry8 : F06) {
                    jz5.l a29 = jz5.p.a(entry8.getKey(), entry8.getValue());
                    linkedHashMap8.put(a29.c(), a29.d());
                }
                for (java.util.Map.Entry entry9 : linkedHashMap8.entrySet()) {
                    int intValue8 = ((java.lang.Number) entry9.getKey()).intValue();
                    java.util.List list5 = (java.util.List) entry9.getValue();
                    if (intValue8 == 0) {
                        java.util.List F07 = kz5.n0.F0(list5, new cr0.s5());
                        cr0.p6 p6Var3 = f303244b;
                        p6Var3.d().clear();
                        p6Var3.d().addAll(F07);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ThreadSchedFeatureService", "REDUCE affinity_succ: " + list5.size());
                        java.lang.StringBuilder sb9 = new java.lang.StringBuilder();
                        sb9.append(" - ");
                        sb9.append(intValue8);
                        sb9.append(": tids=");
                        java.util.ArrayList arrayList3 = new java.util.ArrayList(kz5.d0.q(list5, 10));
                        java.util.Iterator it9 = list5.iterator();
                        while (it9.hasNext()) {
                            arrayList3.add(java.lang.Integer.valueOf(((java.lang.Number) ((jz5.o) it9.next()).d()).intValue()));
                        }
                        sb9.append(kz5.n0.g0(arrayList3, ",", null, null, 0, null, null, 62, null));
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ThreadSchedFeatureService", sb9.toString());
                    } else {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ThreadSchedFeatureService", "REDUCE affinity_fail: " + list5.size());
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ThreadSchedFeatureService", " - " + intValue8 + ": tids=" + kz5.n0.g0(list5, ",", null, null, 0, null, cr0.j5.f303194d, 30, null));
                    }
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void h() {
        java.lang.Object obj;
        java.lang.Object obj2;
        jz5.l lVar;
        java.lang.Object obj3;
        java.lang.Object obj4;
        java.lang.Object obj5;
        int m40916xe8a94c65;
        android.os.Handler wi6;
        if (f()) {
            cr0.f5 f5Var = cr0.z6.f303357d;
            if (((java.lang.Boolean) ((jz5.n) cr0.z6.f303358e).mo141623x754a37bb()).booleanValue() && (wi6 = cr0.z6.wi()) != null) {
                wi6.post(cr0.t5.f303288d);
            }
            synchronized (c()) {
                java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
                java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap();
                java.util.LinkedHashMap linkedHashMap3 = new java.util.LinkedHashMap();
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("RESTORE thread activity: ");
                cr0.p6 p6Var = f303244b;
                sb6.append(p6Var.c().size());
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ThreadSchedFeatureService", sb6.toString());
                for (jz5.o oVar : p6Var.c()) {
                    int intValue = ((java.lang.Number) oVar.a()).intValue();
                    int intValue2 = ((java.lang.Number) oVar.b()).intValue();
                    int intValue3 = ((java.lang.Number) oVar.c()).intValue();
                    try {
                        if (wh.u1.b(android.os.Process.myPid(), intValue)) {
                            if (f303244b.f() && cr0.z6.f303360g) {
                                java.util.Iterator it = ((java.util.List) f303248f.mo141623x754a37bb()).iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        obj5 = it.next();
                                        if (((java.lang.Number) ((jz5.o) obj5).d()).intValue() == intValue) {
                                            break;
                                        }
                                    } else {
                                        obj5 = null;
                                        break;
                                    }
                                }
                                jz5.o oVar2 = (jz5.o) obj5;
                                if (oVar2 != null) {
                                    jz5.l lVar2 = (jz5.l) oVar2.b();
                                    jz5.l lVar3 = (jz5.l) oVar2.c();
                                    try {
                                        jz5.l c17 = com.p314xaae8f345.p552xbf8d97c1.p561x30f523.p563xb541530b.C4652xc579910a.c(intValue);
                                        int intValue4 = ((java.lang.Number) c17.a()).intValue();
                                        int intValue5 = ((java.lang.Number) c17.b()).intValue();
                                        if (!(intValue4 == ((java.lang.Number) lVar3.c()).intValue() && intValue5 == ((java.lang.Number) lVar3.d()).intValue()) && kz5.p1.f(0, 3, 5, lVar2.c()).contains(java.lang.Integer.valueOf(intValue4))) {
                                            java.lang.Object obj6 = linkedHashMap2.get(-114514);
                                            if (obj6 == null) {
                                                obj6 = new java.util.ArrayList();
                                                linkedHashMap2.put(-114514, obj6);
                                            }
                                            ((java.util.List) obj6).add(new jz5.o(java.lang.Integer.valueOf(intValue), new jz5.l(java.lang.Integer.valueOf(intValue4), java.lang.Integer.valueOf(intValue5)), lVar2));
                                        } else {
                                            if (intValue4 == ((java.lang.Number) lVar2.c()).intValue() && intValue5 == ((java.lang.Number) lVar2.d()).intValue()) {
                                                m40916xe8a94c65 = 0;
                                            } else {
                                                int intValue6 = ((java.lang.Number) lVar2.c()).intValue();
                                                int intValue7 = ((java.lang.Number) lVar2.d()).intValue();
                                                com.p314xaae8f345.p552xbf8d97c1.p561x30f523.p563xb541530b.C4652xc579910a.f134187c.a();
                                                m40916xe8a94c65 = com.p314xaae8f345.p552xbf8d97c1.p561x30f523.p563xb541530b.C4652xc579910a.m40916xe8a94c65(intValue, intValue6, intValue7);
                                            }
                                            java.lang.Integer valueOf = java.lang.Integer.valueOf(m40916xe8a94c65);
                                            java.lang.Object obj7 = linkedHashMap2.get(valueOf);
                                            if (obj7 == null) {
                                                obj7 = new java.util.ArrayList();
                                                linkedHashMap2.put(valueOf, obj7);
                                            }
                                            ((java.util.List) obj7).add(new jz5.o(java.lang.Integer.valueOf(intValue), new jz5.l(java.lang.Integer.valueOf(intValue4), java.lang.Integer.valueOf(intValue5)), lVar2));
                                        }
                                    } catch (java.lang.Exception unused) {
                                    }
                                }
                            }
                            cr0.p6 p6Var2 = f303244b;
                            if (p6Var2.f() && cr0.z6.f303361h) {
                                java.util.Iterator it6 = p6Var2.d().iterator();
                                while (true) {
                                    if (!it6.hasNext()) {
                                        obj4 = null;
                                        break;
                                    }
                                    java.lang.Object next = it6.next();
                                    if (((java.lang.Number) ((jz5.o) next).d()).intValue() == intValue) {
                                        obj4 = next;
                                        break;
                                    }
                                }
                                jz5.o oVar3 = (jz5.o) obj4;
                                if (oVar3 != null) {
                                    boolean[] zArr = (boolean[]) oVar3.b();
                                    boolean[] zArr2 = (boolean[]) oVar3.c();
                                    try {
                                        boolean[] b17 = com.p314xaae8f345.p552xbf8d97c1.p561x30f523.p563xb541530b.C4652xc579910a.b(intValue);
                                        if (zh.c.a(b17)) {
                                            if (java.util.Arrays.equals(b17, zArr2)) {
                                                java.lang.Integer valueOf2 = java.lang.Integer.valueOf(java.util.Arrays.equals(b17, zArr) ? 0 : com.p314xaae8f345.p552xbf8d97c1.p561x30f523.p563xb541530b.C4652xc579910a.f(intValue, zArr));
                                                java.lang.Object obj8 = linkedHashMap3.get(valueOf2);
                                                if (obj8 == null) {
                                                    obj8 = new java.util.ArrayList();
                                                    linkedHashMap3.put(valueOf2, obj8);
                                                }
                                                java.lang.Integer valueOf3 = java.lang.Integer.valueOf(intValue);
                                                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(b17);
                                                ((java.util.List) obj8).add(new jz5.o(valueOf3, b17, zArr));
                                            } else {
                                                java.lang.Object obj9 = linkedHashMap3.get(-114514);
                                                if (obj9 == null) {
                                                    obj9 = new java.util.ArrayList();
                                                    linkedHashMap3.put(-114514, obj9);
                                                }
                                                java.lang.Integer valueOf4 = java.lang.Integer.valueOf(intValue);
                                                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(b17);
                                                ((java.util.List) obj9).add(new jz5.o(valueOf4, b17, zArr));
                                            }
                                        }
                                    } catch (java.lang.Exception unused2) {
                                    }
                                }
                            }
                            int threadPriority = android.os.Process.getThreadPriority(intValue);
                            if (threadPriority != intValue3) {
                                java.lang.Object obj10 = linkedHashMap.get(-114514);
                                if (obj10 == null) {
                                    obj10 = new java.util.ArrayList();
                                    linkedHashMap.put(-114514, obj10);
                                }
                                ((java.util.List) obj10).add(new jz5.o(java.lang.Integer.valueOf(intValue), java.lang.Integer.valueOf(threadPriority), java.lang.Integer.valueOf(intValue2)));
                            } else {
                                if (threadPriority != intValue2) {
                                    android.os.Process.setThreadPriority(intValue, intValue2);
                                }
                                java.lang.Object obj11 = linkedHashMap.get(0);
                                if (obj11 == null) {
                                    obj11 = new java.util.ArrayList();
                                    linkedHashMap.put(0, obj11);
                                }
                                ((java.util.List) obj11).add(new jz5.o(java.lang.Integer.valueOf(intValue), java.lang.Integer.valueOf(threadPriority), java.lang.Integer.valueOf(intValue2)));
                            }
                        }
                    } catch (java.lang.Exception unused3) {
                        java.lang.Object obj12 = linkedHashMap.get(-1);
                        if (obj12 == null) {
                            obj12 = new java.util.ArrayList();
                            linkedHashMap.put(-1, obj12);
                        }
                        ((java.util.List) obj12).add(new jz5.o(java.lang.Integer.valueOf(intValue), 0, 0));
                    }
                }
                java.util.List<java.util.Map.Entry> F0 = kz5.n0.F0(linkedHashMap.entrySet(), new cr0.a6());
                java.util.LinkedHashMap linkedHashMap4 = new java.util.LinkedHashMap(e06.p.b(kz5.b1.d(kz5.d0.q(F0, 10)), 16));
                for (java.util.Map.Entry entry : F0) {
                    jz5.l a17 = jz5.p.a(entry.getKey(), entry.getValue());
                    linkedHashMap4.put(a17.c(), a17.d());
                }
                for (java.util.Map.Entry entry2 : linkedHashMap4.entrySet()) {
                    int intValue8 = ((java.lang.Number) entry2.getKey()).intValue();
                    java.util.List list = (java.util.List) entry2.getValue();
                    if (intValue8 == -114514) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ThreadSchedFeatureService", "RESTORE nice_skip: " + list.size());
                        java.util.LinkedHashMap linkedHashMap5 = new java.util.LinkedHashMap();
                        for (java.lang.Object obj13 : list) {
                            jz5.o oVar4 = (jz5.o) obj13;
                            int intValue9 = ((java.lang.Number) oVar4.d()).intValue();
                            int intValue10 = ((java.lang.Number) oVar4.f()).intValue();
                            java.util.Iterator it7 = f303244b.c().iterator();
                            while (true) {
                                if (it7.hasNext()) {
                                    obj3 = it7.next();
                                    if (((java.lang.Number) ((jz5.o) obj3).d()).intValue() == intValue9) {
                                        break;
                                    }
                                } else {
                                    obj3 = null;
                                    break;
                                }
                            }
                            jz5.o oVar5 = (jz5.o) obj3;
                            java.lang.Integer num = oVar5 != null ? (java.lang.Integer) oVar5.f() : null;
                            java.lang.String str = intValue10 + ">>" + num + ">>" + ((java.lang.Number) oVar4.e()).intValue();
                            java.lang.Object obj14 = linkedHashMap5.get(str);
                            if (obj14 == null) {
                                obj14 = new java.util.ArrayList();
                                linkedHashMap5.put(str, obj14);
                            }
                            ((java.util.List) obj14).add(obj13);
                        }
                        java.util.List<java.util.Map.Entry> F02 = kz5.n0.F0(linkedHashMap5.entrySet(), new cr0.e6());
                        java.util.LinkedHashMap linkedHashMap6 = new java.util.LinkedHashMap(e06.p.b(kz5.b1.d(kz5.d0.q(F02, 10)), 16));
                        for (java.util.Map.Entry entry3 : F02) {
                            jz5.l a18 = jz5.p.a(entry3.getKey(), entry3.getValue());
                            linkedHashMap6.put(a18.c(), a18.d());
                        }
                        for (java.util.Map.Entry entry4 : linkedHashMap6.entrySet()) {
                            java.lang.String str2 = (java.lang.String) entry4.getKey();
                            java.util.List list2 = (java.util.List) entry4.getValue();
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ThreadSchedFeatureService", " - " + str2 + ": " + list2.size() + ", tids=" + kz5.n0.g0(list2, ",", null, null, 0, null, cr0.w5.f303338d, 30, null));
                        }
                    } else if (intValue8 != 0) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ThreadSchedFeatureService", "RESTORE nice_fail: " + list.size());
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ThreadSchedFeatureService", " - " + intValue8 + ": tids=" + kz5.n0.g0(list, ",", null, null, 0, null, cr0.x5.f303342d, 30, null));
                    } else {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ThreadSchedFeatureService", "RESTORE nice_succ: " + list.size());
                        java.util.LinkedHashMap linkedHashMap7 = new java.util.LinkedHashMap();
                        for (java.lang.Object obj15 : list) {
                            jz5.o oVar6 = (jz5.o) obj15;
                            java.lang.String str3 = ((java.lang.Number) oVar6.e()).intValue() + ">>" + ((java.lang.Number) oVar6.f()).intValue();
                            java.lang.Object obj16 = linkedHashMap7.get(str3);
                            if (obj16 == null) {
                                obj16 = new java.util.ArrayList();
                                linkedHashMap7.put(str3, obj16);
                            }
                            ((java.util.List) obj16).add(obj15);
                        }
                        java.util.List<java.util.Map.Entry> F03 = kz5.n0.F0(linkedHashMap7.entrySet(), new cr0.d6());
                        java.util.LinkedHashMap linkedHashMap8 = new java.util.LinkedHashMap(e06.p.b(kz5.b1.d(kz5.d0.q(F03, 10)), 16));
                        for (java.util.Map.Entry entry5 : F03) {
                            jz5.l a19 = jz5.p.a(entry5.getKey(), entry5.getValue());
                            linkedHashMap8.put(a19.c(), a19.d());
                        }
                        for (java.util.Map.Entry entry6 : linkedHashMap8.entrySet()) {
                            java.lang.String str4 = (java.lang.String) entry6.getKey();
                            java.util.List list3 = (java.util.List) entry6.getValue();
                            java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                            sb7.append(" - ");
                            sb7.append(str4);
                            sb7.append(": ");
                            sb7.append(list3.size());
                            sb7.append(", tids=");
                            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list3, 10));
                            java.util.Iterator it8 = list3.iterator();
                            while (it8.hasNext()) {
                                arrayList.add(java.lang.Integer.valueOf(((java.lang.Number) ((jz5.o) it8.next()).d()).intValue()));
                            }
                            sb7.append(kz5.n0.g0(arrayList, ",", null, null, 0, null, null, 62, null));
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ThreadSchedFeatureService", sb7.toString());
                        }
                    }
                }
                java.util.List<java.util.Map.Entry> F04 = kz5.n0.F0(linkedHashMap2.entrySet(), new cr0.b6());
                java.util.LinkedHashMap linkedHashMap9 = new java.util.LinkedHashMap(e06.p.b(kz5.b1.d(kz5.d0.q(F04, 10)), 16));
                for (java.util.Map.Entry entry7 : F04) {
                    jz5.l a27 = jz5.p.a(entry7.getKey(), entry7.getValue());
                    linkedHashMap9.put(a27.c(), a27.d());
                }
                for (java.util.Map.Entry entry8 : linkedHashMap9.entrySet()) {
                    int intValue11 = ((java.lang.Number) entry8.getKey()).intValue();
                    java.util.List list4 = (java.util.List) entry8.getValue();
                    if (intValue11 == -114514) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ThreadSchedFeatureService", "RESTORE policy_skip: " + list4.size());
                        java.util.LinkedHashMap linkedHashMap10 = new java.util.LinkedHashMap();
                        for (java.lang.Object obj17 : list4) {
                            jz5.o oVar7 = (jz5.o) obj17;
                            int intValue12 = ((java.lang.Number) oVar7.d()).intValue();
                            int intValue13 = ((java.lang.Number) ((jz5.l) oVar7.f()).c()).intValue();
                            java.util.Iterator it9 = ((java.util.List) f303248f.mo141623x754a37bb()).iterator();
                            while (true) {
                                if (it9.hasNext()) {
                                    obj2 = it9.next();
                                    if (((java.lang.Number) ((jz5.o) obj2).d()).intValue() == intValue12) {
                                        break;
                                    }
                                } else {
                                    obj2 = null;
                                    break;
                                }
                            }
                            jz5.o oVar8 = (jz5.o) obj2;
                            java.lang.Integer num2 = (oVar8 == null || (lVar = (jz5.l) oVar8.f()) == null) ? null : (java.lang.Integer) lVar.c();
                            java.lang.String str5 = intValue13 + ">>" + num2 + ">>" + ((java.lang.Number) ((jz5.l) oVar7.e()).c()).intValue();
                            java.lang.Object obj18 = linkedHashMap10.get(str5);
                            if (obj18 == null) {
                                obj18 = new java.util.ArrayList();
                                linkedHashMap10.put(str5, obj18);
                            }
                            ((java.util.List) obj18).add(obj17);
                        }
                        java.util.List<java.util.Map.Entry> F05 = kz5.n0.F0(linkedHashMap10.entrySet(), new cr0.f6());
                        java.util.LinkedHashMap linkedHashMap11 = new java.util.LinkedHashMap(e06.p.b(kz5.b1.d(kz5.d0.q(F05, 10)), 16));
                        for (java.util.Map.Entry entry9 : F05) {
                            jz5.l a28 = jz5.p.a(entry9.getKey(), entry9.getValue());
                            linkedHashMap11.put(a28.c(), a28.d());
                        }
                        for (java.util.Map.Entry entry10 : linkedHashMap11.entrySet()) {
                            java.lang.String str6 = (java.lang.String) entry10.getKey();
                            java.util.List list5 = (java.util.List) entry10.getValue();
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ThreadSchedFeatureService", " - " + str6 + ": " + list5.size() + ", tids=" + kz5.n0.g0(list5, ",", null, null, 0, null, cr0.y5.f303347d, 30, null));
                        }
                    } else if (intValue11 != 0) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ThreadSchedFeatureService", "RESTORE policy_fail: " + list4.size());
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ThreadSchedFeatureService", " - " + intValue11 + ": tids=" + kz5.n0.g0(list4, ",", null, null, 0, null, cr0.z5.f303356d, 30, null));
                    } else {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ThreadSchedFeatureService", "RESTORE policy_succ: " + list4.size());
                        java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
                        sb8.append(" - ");
                        sb8.append(intValue11);
                        sb8.append(": tids=");
                        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(list4, 10));
                        java.util.Iterator it10 = list4.iterator();
                        while (it10.hasNext()) {
                            arrayList2.add(java.lang.Integer.valueOf(((java.lang.Number) ((jz5.o) it10.next()).d()).intValue()));
                        }
                        sb8.append(kz5.n0.g0(arrayList2, ",", null, null, 0, null, null, 62, null));
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ThreadSchedFeatureService", sb8.toString());
                    }
                }
                java.util.List<java.util.Map.Entry> F06 = kz5.n0.F0(linkedHashMap3.entrySet(), new cr0.c6());
                java.util.LinkedHashMap linkedHashMap12 = new java.util.LinkedHashMap(e06.p.b(kz5.b1.d(kz5.d0.q(F06, 10)), 16));
                for (java.util.Map.Entry entry11 : F06) {
                    jz5.l a29 = jz5.p.a(entry11.getKey(), entry11.getValue());
                    linkedHashMap12.put(a29.c(), a29.d());
                }
                for (java.util.Map.Entry entry12 : linkedHashMap12.entrySet()) {
                    int intValue14 = ((java.lang.Number) entry12.getKey()).intValue();
                    java.util.List list6 = (java.util.List) entry12.getValue();
                    if (intValue14 == -114514) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ThreadSchedFeatureService", "RESTORE affinity_skip: " + list6.size());
                        java.util.LinkedHashMap linkedHashMap13 = new java.util.LinkedHashMap();
                        for (java.lang.Object obj19 : list6) {
                            jz5.o oVar9 = (jz5.o) obj19;
                            int intValue15 = ((java.lang.Number) oVar9.d()).intValue();
                            java.lang.String b18 = zh.c.b((boolean[]) oVar9.f());
                            java.util.Iterator it11 = f303244b.d().iterator();
                            while (true) {
                                if (it11.hasNext()) {
                                    obj = it11.next();
                                    if (((java.lang.Number) ((jz5.o) obj).d()).intValue() == intValue15) {
                                        break;
                                    }
                                } else {
                                    obj = null;
                                    break;
                                }
                            }
                            jz5.o oVar10 = (jz5.o) obj;
                            java.lang.String str7 = b18 + ">>" + zh.c.b(oVar10 != null ? (boolean[]) oVar10.f() : null) + ">>" + zh.c.b((boolean[]) oVar9.e());
                            java.lang.Object obj20 = linkedHashMap13.get(str7);
                            if (obj20 == null) {
                                obj20 = new java.util.ArrayList();
                                linkedHashMap13.put(str7, obj20);
                            }
                            ((java.util.List) obj20).add(obj19);
                        }
                        java.util.List<java.util.Map.Entry> F07 = kz5.n0.F0(linkedHashMap13.entrySet(), new cr0.g6());
                        java.util.LinkedHashMap linkedHashMap14 = new java.util.LinkedHashMap(e06.p.b(kz5.b1.d(kz5.d0.q(F07, 10)), 16));
                        for (java.util.Map.Entry entry13 : F07) {
                            jz5.l a37 = jz5.p.a(entry13.getKey(), entry13.getValue());
                            linkedHashMap14.put(a37.c(), a37.d());
                        }
                        for (java.util.Map.Entry entry14 : linkedHashMap14.entrySet()) {
                            java.lang.String str8 = (java.lang.String) entry14.getKey();
                            java.util.List list7 = (java.util.List) entry14.getValue();
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ThreadSchedFeatureService", " - " + str8 + ": " + list7.size() + ", tids=" + kz5.n0.g0(list7, ",", null, null, 0, null, cr0.u5.f303307d, 30, null));
                        }
                    } else if (intValue14 != 0) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ThreadSchedFeatureService", "RESTORE affinity_fail: " + list6.size());
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ThreadSchedFeatureService", " - " + intValue14 + ": tids=" + kz5.n0.g0(list6, ",", null, null, 0, null, cr0.v5.f303318d, 30, null));
                    } else {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ThreadSchedFeatureService", "RESTORE affinity_succ: " + list6.size());
                        java.lang.StringBuilder sb9 = new java.lang.StringBuilder();
                        sb9.append(" - ");
                        sb9.append(intValue14);
                        sb9.append(": tids=");
                        java.util.ArrayList arrayList3 = new java.util.ArrayList(kz5.d0.q(list6, 10));
                        java.util.Iterator it12 = list6.iterator();
                        while (it12.hasNext()) {
                            arrayList3.add(java.lang.Integer.valueOf(((java.lang.Number) ((jz5.o) it12.next()).d()).intValue()));
                        }
                        sb9.append(kz5.n0.g0(arrayList3, ",", null, null, 0, null, null, 62, null));
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ThreadSchedFeatureService", sb9.toString());
                    }
                }
                cr0.p6 p6Var3 = f303244b;
                p6Var3.c().clear();
                ((java.util.List) f303248f.mo141623x754a37bb()).clear();
                p6Var3.d().clear();
            }
        }
    }
}

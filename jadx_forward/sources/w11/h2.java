package w11;

/* loaded from: classes12.dex */
public final class h2 {

    /* renamed from: e, reason: collision with root package name */
    public static final xu5.b f523582e;

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.String f523583f;

    /* renamed from: a, reason: collision with root package name */
    public final w11.t f523584a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.LinkedList f523585b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.HashMap f523586c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Object f523587d;

    static {
        xu5.b a17 = xu5.b.a("SyncProcessorThreadTag");
        f523582e = a17;
        f523583f = a17.f538835a;
    }

    public h2(w11.t finishCmdCallback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finishCmdCallback, "finishCmdCallback");
        this.f523584a = finishCmdCallback;
        this.f523585b = new java.util.LinkedList();
        this.f523586c = new java.util.HashMap();
        this.f523587d = new java.lang.Object();
    }

    public final void a(r45.jj6 jj6Var, w11.f fVar) {
        synchronized (this.f523585b) {
            java.util.LinkedList linkedList = this.f523585b;
            java.lang.String str = jj6Var.f459422m;
            if (str == null) {
                str = "";
            }
            if (linkedList.contains(str)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SyncServiceHandler", "already sync dataId " + jj6Var.f459422m);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SyncServiceHandler", "onContinueSync dataId:" + jj6Var.f459422m);
                java.util.LinkedList linkedList2 = this.f523585b;
                java.lang.String str2 = jj6Var.f459422m;
                if (str2 == null) {
                    str2 = "";
                }
                linkedList2.add(str2);
                ((w11.f2) this.f523584a).a(jj6Var, fVar);
            }
            if (this.f523585b.size() > 5) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SyncServiceHandler", "remove first dataId " + ((java.lang.String) this.f523585b.removeFirst()));
            }
        }
    }

    public final void b(r45.jj6 syncData, w11.u processor) {
        boolean z17;
        r45.bj6 bj6Var;
        boolean z18;
        int size;
        java.util.LinkedList linkedList;
        java.util.LinkedList linkedList2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(syncData, "syncData");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(processor, "processor");
        long c17 = c01.id.c();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(processor.hashCode());
        sb6.append('_');
        sb6.append(c17);
        syncData.f459422m = sb6.toString();
        syncData.f459421i = processor.hashCode();
        if (syncData.f459423n == 1) {
            jx3.f.INSTANCE.mo68477x336bdfd8(99L, 100L, 1L, false);
        } else {
            jx3.f.INSTANCE.mo68477x336bdfd8(99L, 101L, 1L, false);
        }
        if (!gm0.j1.a() || gm0.m.r() || gm0.j1.u() == null || gm0.j1.u().c() == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SyncServiceHandler", "Error CmdProcHandler " + processor + " accHasReady:" + gm0.j1.a() + " hold:" + gm0.m.r() + " accstg:" + gm0.j1.u());
            c(syncData);
            ((w11.f2) this.f523584a).b(syncData, processor);
            ((w11.f2) this.f523584a).a(syncData, w11.f.f523548d);
            return;
        }
        r45.ew4 ew4Var = syncData.f459416d;
        if (ew4Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SyncServiceHandler", "Error SyncResponse " + processor + " accHasReady:" + gm0.j1.a() + " hold:" + gm0.m.r() + " accstg:" + gm0.j1.u());
            ((w11.f2) this.f523584a).b(syncData, processor);
            ((w11.f2) this.f523584a).a(syncData, w11.f.f523549e);
            return;
        }
        mm.h hVar = mm.h.f410018a;
        java.lang.String from = "SyncServiceHandler-".concat(processor.getClass().getName());
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(from, "from");
        r45.c50 c50Var = ew4Var.f455292e;
        boolean z19 = false;
        int size2 = (c50Var == null || (linkedList2 = c50Var.f452828e) == null) ? 0 : linkedList2.size();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(jx3.f.A(size2, new int[]{0, 1, 2, 3, 5, 10}, new java.lang.Integer[]{java.lang.Integer.valueOf(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.cd.f33971x366c91de), 248, 247, 246, 245, 244, 243}), "null cannot be cast to non-null type kotlin.Int");
        jx3.f.INSTANCE.mo68477x336bdfd8(99L, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.q1((java.lang.Integer) r0), 1L, false);
        try {
            java.lang.reflect.Method method = android.os.PowerManager.class.getMethod("isScreenOn", new java.lang.Class[0]);
            java.lang.Object systemService = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService("power");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(systemService, "null cannot be cast to non-null type android.os.PowerManager");
            java.lang.Object invoke = method.invoke((android.os.PowerManager) systemService, new java.lang.Object[0]);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(invoke, "null cannot be cast to non-null type kotlin.Boolean");
            z17 = ((java.lang.Boolean) invoke).booleanValue();
        } catch (java.lang.Exception e17) {
            jx3.f.INSTANCE.mo68477x336bdfd8(99L, 45L, 1L, false);
            java.lang.Boolean bool = java.lang.Boolean.TRUE;
            boolean z27 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SyncServiceHandler", "reflectScreenOn invoke ERROR use isScreenOn:%s e:%s", bool, com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e17));
            z17 = true;
        }
        if (!z17) {
            jx3.f.INSTANCE.mo68477x336bdfd8(99L, size2 > 0 ? 221L : 218L, 1L, false);
        } else if (z65.c.f551988a) {
            jx3.f.INSTANCE.mo68477x336bdfd8(99L, size2 > 0 ? 219L : 216L, 1L, false);
        } else {
            jx3.f.INSTANCE.mo68477x336bdfd8(99L, size2 > 0 ? 220L : 217L, 1L, false);
        }
        long j17 = ew4Var.f455297m;
        if (java.lang.String.valueOf(j17).length() == 10) {
            j17 *= 1000;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        long j18 = currentTimeMillis - j17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SyncServiceHandler", "client time is:%s,server time is:%s,diff time is:%s, diff second time is:%s,just save millisecond diff time", java.lang.Long.valueOf(currentTimeMillis), java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j18), java.lang.Long.valueOf(j18 / 1000));
        c01.id.g(j17);
        gm0.j1.b().D(ew4Var.f455295h, ew4Var.f455296i);
        gm0.m.A(ew4Var.f455295h);
        r45.c50 c50Var2 = ew4Var.f455292e;
        if ((c50Var2 == null || (linkedList = c50Var2.f452828e) == null || !linkedList.isEmpty()) ? false : true) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SyncServiceHandler", "Empty CmdList " + syncData.mo12245xcc313de3());
            d(syncData.f459417e, ew4Var, processor);
            c(syncData);
            ((w11.f2) this.f523584a).b(syncData, processor);
            ((w11.f2) this.f523584a).a(syncData, w11.f.f523550f);
            return;
        }
        synchronized (this.f523587d) {
            this.f523586c.put(java.lang.Integer.valueOf(syncData.f459421i), processor);
            byte[] j19 = w11.c2.f523524a.b().j("process_data_list");
            if (j19 != null) {
                bj6Var = new r45.bj6();
                try {
                    bj6Var.mo11468x92b714fd(j19);
                } catch (java.lang.Exception e18) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SyncServiceHandler", e18, "parse data queue", new java.lang.Object[0]);
                }
            } else {
                bj6Var = new r45.bj6();
            }
            z18 = bj6Var.f452345d.size() < 4;
            bj6Var.f452345d.add(syncData);
            size = bj6Var.f452345d.size();
            try {
                z19 = w11.c2.f523524a.b().H("process_data_list", bj6Var.mo14344x5f01b1f6());
            } catch (java.lang.Exception e19) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SyncServiceHandler", e19, "save data queue", new java.lang.Object[0]);
            }
            if (z19) {
                d(syncData.f459417e, ew4Var, processor);
            } else {
                jx3.f.INSTANCE.mo68477x336bdfd8(99L, 53L, 1L, false);
            }
            if (syncData.f459423n == 1) {
                jx3.f.INSTANCE.mo68477x336bdfd8(99L, 102L, 1L, false);
            } else {
                jx3.f.INSTANCE.mo68477x336bdfd8(99L, 103L, 1L, false);
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SyncServiceHandler", "doProcessCmd: saveResult:" + z19 + " continueSync:" + z18 + " costTime:" + (c01.id.a() - c17) + " queueSize:" + size + " netSceneMap:" + this.f523586c.size() + " syncData:" + syncData.mo12245xcc313de3());
        ((ku5.t0) ku5.t0.f394148d).h(new w11.g2(this), f523583f);
        if (z18) {
            a(syncData, w11.f.f523551g);
        }
    }

    public final void c(r45.jj6 syncData) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(syncData, "syncData");
        r45.ew4 ew4Var = syncData.f459416d;
        if (ew4Var != null) {
            gm0.j1.u().c().w(8196, java.lang.Long.valueOf(ew4Var.f455293f));
            boolean z17 = (ew4Var.f455293f & syncData.f459419g) != 0;
            if (!z17) {
                a25.u uVar = com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a1.f270152b != null ? (a25.u) com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a1.f270152b.get() : null;
                w11.v vVar = new w11.v(syncData);
                if (uVar != null) {
                    boolean z18 = vVar instanceof w11.z0;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.v2 v2Var = com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.z2.f230302b;
                    if (z18) {
                        v2Var.z(vVar);
                    } else if ((vVar instanceof java.lang.String) && vVar.equals("NetSceneInit")) {
                        v2Var.z(vVar);
                    } else {
                        v2Var.z(vVar);
                    }
                }
            }
            if (!z17 && (ew4Var.f455293f & 256) != 0) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6099xc95a2e47 c6099xc95a2e47 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6099xc95a2e47();
                c6099xc95a2e47.f136376g.f90144a = 3;
                c6099xc95a2e47.e();
            }
            if (!z17 && (ew4Var.f455293f & 2097152) != 0) {
                new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5822x76918f51().e();
            }
            if (!z17 && (ew4Var.f455293f & 128) != 0) {
                new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6139xfc5b076a().e();
            }
            if (!z17 && (ew4Var.f455293f & com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26306x4f373ca9.f52070xe96767bb) != 0) {
                new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5535xce15fb19().e();
            }
            if (z17 || (ew4Var.f455293f & 32) == 0) {
                return;
            }
            new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5218x7db5f878().e();
        }
    }

    public final void d(boolean z17, r45.ew4 ew4Var, java.lang.Object obj) {
        w11.b2 b2Var = w11.c2.f523524a;
        byte[] a17 = b2Var.a();
        byte[] d17 = x51.j1.d(ew4Var.f455294g);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SyncServiceHandler", "mergeSyncBuf processResp %s synckey req:%s  shouldMerge:%s", obj, o45.qi.d(a17), java.lang.Boolean.valueOf(z17));
        r45.cu5 cu5Var = ew4Var.f455294g;
        if (cu5Var != null) {
            if ((cu5Var != null ? cu5Var.f453372d : 0) > 0) {
                if (z17) {
                    byte[] c17 = o45.qi.c(a17, d17);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SyncServiceHandler", "processResp synckey merge:%s", o45.qi.d(c17));
                    if (c17 != null) {
                        if (!(c17.length == 0)) {
                            d17 = c17;
                        }
                    }
                    ew4Var.f455294g = x51.j1.a(d17);
                }
                byte[] d18 = x51.j1.d(ew4Var.f455294g);
                if (java.util.Arrays.equals(a17, d18)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SyncServiceHandler", "processResp %s  Sync Key Not change, not save", obj);
                    return;
                } else {
                    b2Var.d(d18, true);
                    return;
                }
            }
        }
        jx3.f.INSTANCE.mo68477x336bdfd8(99L, 47L, 1L, false);
    }
}

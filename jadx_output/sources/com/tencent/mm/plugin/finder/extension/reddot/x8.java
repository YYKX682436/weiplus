package com.tencent.mm.plugin.finder.extension.reddot;

/* loaded from: classes8.dex */
public final class x8 implements com.tencent.mm.plugin.finder.extension.reddot.va {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.extension.reddot.x9 f106000a;

    /* renamed from: b, reason: collision with root package name */
    public final zy2.ba f106001b;

    /* renamed from: c, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.extension.reddot.ua f106002c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f106003d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f106004e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f106005f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f106006g;

    public x8(com.tencent.mm.plugin.finder.extension.reddot.x9 manager, zy2.ba storage, com.tencent.mm.plugin.finder.extension.reddot.ua freqController) {
        kotlin.jvm.internal.o.g(manager, "manager");
        kotlin.jvm.internal.o.g(storage, "storage");
        kotlin.jvm.internal.o.g(freqController, "freqController");
        this.f106000a = manager;
        this.f106001b = storage;
        this.f106002c = freqController;
        this.f106003d = "Finder.RedDotManagerCrossPlatformNative";
        this.f106004e = new java.util.concurrent.ConcurrentHashMap();
        this.f106005f = new java.util.concurrent.ConcurrentHashMap();
        this.f106006g = jz5.h.b(new com.tencent.mm.plugin.finder.extension.reddot.w8(this));
    }

    @Override // com.tencent.mm.plugin.finder.extension.reddot.va
    public com.tencent.mm.plugin.finder.extension.reddot.jb a(java.lang.String path, java.lang.String tipsUuid, boolean z17, boolean z18) {
        java.util.ArrayList arrayList;
        java.util.ArrayList arrayList2;
        kotlin.jvm.internal.o.g(path, "path");
        kotlin.jvm.internal.o.g(tipsUuid, "tipsUuid");
        java.util.List list = (java.util.List) this.f106004e.get(path);
        java.lang.Object obj = null;
        if (list != null) {
            synchronized (list) {
                arrayList2 = new java.util.ArrayList();
                for (java.lang.Object obj2 : list) {
                    com.tencent.mm.plugin.finder.extension.reddot.jb jbVar = (com.tencent.mm.plugin.finder.extension.reddot.jb) obj2;
                    boolean z19 = (jbVar.z0(g92.b.f269769e.T0()) && kotlin.jvm.internal.o.b(jbVar.field_tips_uuid, tipsUuid)) && com.tencent.mm.plugin.finder.extension.reddot.y8.f106036a.a("getByTipsUuid", path);
                    if (z17) {
                        z19 = z19 && !((com.tencent.mm.plugin.finder.extension.reddot.l5) this.f106002c).C(path, jbVar);
                    }
                    if (z19) {
                        arrayList2.add(obj2);
                    }
                }
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        java.util.List g17 = this.f106000a.g1("getByTipsUuid", arrayList, path, z17, z18);
        if (g17 == null) {
            return null;
        }
        synchronized (g17) {
            java.util.ListIterator listIterator = g17.listIterator(g17.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    break;
                }
                java.lang.Object previous = listIterator.previous();
                if (((com.tencent.mm.plugin.finder.extension.reddot.jb) previous).I0(path) != null) {
                    obj = previous;
                    break;
                }
            }
        }
        return (com.tencent.mm.plugin.finder.extension.reddot.jb) obj;
    }

    @Override // com.tencent.mm.plugin.finder.extension.reddot.va
    public boolean b(java.lang.String path, java.util.List ctrlTypeList) {
        kotlin.jvm.internal.o.g(path, "path");
        kotlin.jvm.internal.o.g(ctrlTypeList, "ctrlTypeList");
        java.util.List list = (java.util.List) this.f106004e.get(path);
        int i17 = -1;
        if (list != null) {
            synchronized (list) {
                java.util.Iterator it = list.iterator();
                int i18 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    if (ctrlTypeList.contains(java.lang.Integer.valueOf(((com.tencent.mm.plugin.finder.extension.reddot.jb) it.next()).getType()))) {
                        i17 = i18;
                        break;
                    }
                    i18++;
                }
            }
        }
        return i17 >= 0;
    }

    @Override // com.tencent.mm.plugin.finder.extension.reddot.va
    public com.tencent.mm.plugin.finder.extension.reddot.jb c(java.lang.String str) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f106005f;
        if (str == null) {
            str = "";
        }
        return (com.tencent.mm.plugin.finder.extension.reddot.jb) concurrentHashMap.get(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x006c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0032 A[SYNTHETIC] */
    @Override // com.tencent.mm.plugin.finder.extension.reddot.va
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.HashMap d(java.lang.String r13, java.util.List r14) {
        /*
            r12 = this;
            java.lang.String r0 = "username"
            kotlin.jvm.internal.o.g(r13, r0)
            com.tencent.mm.plugin.finder.extension.reddot.g4 r0 = com.tencent.mm.plugin.finder.extension.reddot.l5.H
            java.util.List r0 = r0.e()
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
            r2 = r1
        L12:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto Lae
            java.lang.Object r3 = r0.next()
            java.lang.String r3 = (java.lang.String) r3
            java.util.concurrent.ConcurrentHashMap r4 = r12.f106004e
            java.lang.Object r4 = r4.get(r3)
            java.util.List r4 = (java.util.List) r4
            if (r4 == 0) goto L12
            monitor-enter(r4)
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Lab
            r5.<init>()     // Catch: java.lang.Throwable -> Lab
            java.util.Iterator r6 = r4.iterator()     // Catch: java.lang.Throwable -> Lab
        L32:
            boolean r7 = r6.hasNext()     // Catch: java.lang.Throwable -> Lab
            r8 = 1
            r9 = 0
            if (r7 == 0) goto L70
            java.lang.Object r7 = r6.next()     // Catch: java.lang.Throwable -> Lab
            r10 = r7
            com.tencent.mm.plugin.finder.extension.reddot.jb r10 = (com.tencent.mm.plugin.finder.extension.reddot.jb) r10     // Catch: java.lang.Throwable -> Lab
            boolean r11 = r10.z0(r13)     // Catch: java.lang.Throwable -> Lab
            if (r11 == 0) goto L69
            if (r14 == 0) goto L51
            boolean r11 = r14.contains(r3)     // Catch: java.lang.Throwable -> Lab
            if (r11 != r8) goto L51
            r11 = r8
            goto L52
        L51:
            r11 = r9
        L52:
            if (r11 != 0) goto L5e
            com.tencent.mm.plugin.finder.extension.reddot.ua r11 = r12.f106002c     // Catch: java.lang.Throwable -> Lab
            com.tencent.mm.plugin.finder.extension.reddot.l5 r11 = (com.tencent.mm.plugin.finder.extension.reddot.l5) r11     // Catch: java.lang.Throwable -> Lab
            boolean r10 = r11.C(r3, r10)     // Catch: java.lang.Throwable -> Lab
            if (r10 != 0) goto L69
        L5e:
            com.tencent.mm.plugin.finder.extension.reddot.y8 r10 = com.tencent.mm.plugin.finder.extension.reddot.y8.f106036a     // Catch: java.lang.Throwable -> Lab
            java.lang.String r11 = "collectFindTabRedDot"
            boolean r10 = r10.a(r11, r3)     // Catch: java.lang.Throwable -> Lab
            if (r10 == 0) goto L69
            goto L6a
        L69:
            r8 = r9
        L6a:
            if (r8 == 0) goto L32
            r5.add(r7)     // Catch: java.lang.Throwable -> Lab
            goto L32
        L70:
            monitor-exit(r4)
            monitor-enter(r5)
            int r4 = r5.size()     // Catch: java.lang.Throwable -> La8
            java.util.ListIterator r4 = r5.listIterator(r4)     // Catch: java.lang.Throwable -> La8
        L7a:
            boolean r6 = r4.hasPrevious()     // Catch: java.lang.Throwable -> La8
            if (r6 == 0) goto L93
            java.lang.Object r6 = r4.previous()     // Catch: java.lang.Throwable -> La8
            r7 = r6
            com.tencent.mm.plugin.finder.extension.reddot.jb r7 = (com.tencent.mm.plugin.finder.extension.reddot.jb) r7     // Catch: java.lang.Throwable -> La8
            r45.f03 r7 = r7.I0(r3)     // Catch: java.lang.Throwable -> La8
            if (r7 == 0) goto L8f
            r7 = r8
            goto L90
        L8f:
            r7 = r9
        L90:
            if (r7 == 0) goto L7a
            goto L94
        L93:
            r6 = r1
        L94:
            monitor-exit(r5)
            com.tencent.mm.plugin.finder.extension.reddot.jb r6 = (com.tencent.mm.plugin.finder.extension.reddot.jb) r6
            if (r6 == 0) goto L12
            if (r2 != 0) goto La0
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
        La0:
            java.lang.Object r3 = r2.put(r3, r6)
            com.tencent.mm.plugin.finder.extension.reddot.jb r3 = (com.tencent.mm.plugin.finder.extension.reddot.jb) r3
            goto L12
        La8:
            r13 = move-exception
            monitor-exit(r5)
            throw r13
        Lab:
            r13 = move-exception
            monitor-exit(r4)
            throw r13
        Lae:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.extension.reddot.x8.d(java.lang.String, java.util.List):java.util.HashMap");
    }

    @Override // com.tencent.mm.plugin.finder.extension.reddot.va
    public java.util.HashSet e(int i17, java.lang.String username, yz5.l filter) {
        kotlin.jvm.internal.o.g(username, "username");
        kotlin.jvm.internal.o.g(filter, "filter");
        boolean wi6 = ((com.tencent.mm.plugin.finder.storage.mj0) ((zy2.qb) i95.n0.c(zy2.qb.class))).wi();
        java.lang.String str = this.f106003d;
        if (wi6 && !com.tencent.mm.plugin.finder.extension.reddot.f3.a(java.lang.Integer.valueOf(i17))) {
            com.tencent.mars.xlog.Log.i(str, "[clearCtrlInfo] 青少年模式且只看关注的模式下只clear关注的红点展示");
            return new java.util.HashSet();
        }
        java.util.HashMap z17 = z(i17, filter, username);
        if (!z17.isEmpty()) {
            com.tencent.mars.xlog.Log.i(str, "[clearCtrlInfo] type=" + i17 + " removeRedDot clearMap=" + z17);
        }
        java.util.HashSet hashSet = new java.util.HashSet();
        for (java.util.Map.Entry entry : z17.entrySet()) {
            java.util.List list = (java.util.List) this.f106004e.get((java.lang.String) entry.getKey());
            if (list != null) {
                pm0.v.G(list, new com.tencent.mm.plugin.finder.extension.reddot.s8(entry));
            }
            for (com.tencent.mm.plugin.finder.extension.reddot.jb jbVar : (java.lang.Iterable) entry.getValue()) {
                if (!hashSet.contains(jbVar)) {
                    l75.e0 e0Var = com.tencent.mm.plugin.finder.extension.reddot.jb.Q;
                    jbVar.A0(this.f106001b, true);
                    hashSet.add(jbVar);
                }
            }
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(z17.size());
        java.util.Iterator it = z17.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add((java.lang.String) ((java.util.Map.Entry) it.next()).getKey());
        }
        return kz5.n0.Q0(arrayList);
    }

    @Override // com.tencent.mm.plugin.finder.extension.reddot.va
    public java.util.LinkedList f(int i17, java.lang.String username) {
        kotlin.jvm.internal.o.g(username, "username");
        java.util.HashMap z17 = z(i17, com.tencent.mm.plugin.finder.extension.reddot.p8.f105774d, username);
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.Iterator it = z17.entrySet().iterator();
        while (it.hasNext()) {
            linkedList.addAll((java.util.Collection) ((java.util.Map.Entry) it.next()).getValue());
        }
        return linkedList;
    }

    @Override // com.tencent.mm.plugin.finder.extension.reddot.va
    public void g(java.lang.String groupId) {
        kotlin.jvm.internal.o.g(groupId, "groupId");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f106004e;
        synchronized (concurrentHashMap) {
            java.util.Iterator it = concurrentHashMap.entrySet().iterator();
            while (it.hasNext()) {
                java.lang.Iterable<com.tencent.mm.plugin.finder.extension.reddot.jb> iterable = (java.lang.Iterable) ((java.util.Map.Entry) it.next()).getValue();
                synchronized (iterable) {
                    for (com.tencent.mm.plugin.finder.extension.reddot.jb jbVar : iterable) {
                        if (kotlin.jvm.internal.o.b(jbVar.field_ctrInfo.f388500u, groupId)) {
                            arrayList.add(jbVar);
                        }
                    }
                }
            }
        }
        java.util.Iterator it6 = arrayList.iterator();
        while (it6.hasNext()) {
            this.f106000a.L((com.tencent.mm.plugin.finder.extension.reddot.jb) it6.next());
        }
    }

    @Override // com.tencent.mm.plugin.finder.extension.reddot.va
    public boolean h(com.tencent.mm.plugin.finder.extension.reddot.jb ctrlInfo, java.lang.String path, long j17, boolean z17) {
        kotlin.jvm.internal.o.g(ctrlInfo, "ctrlInfo");
        kotlin.jvm.internal.o.g(path, "path");
        boolean l17 = ctrlInfo.l1(path, j17, z17);
        if (l17) {
            com.tencent.mm.plugin.finder.extension.reddot.jb.o1(ctrlInfo, this.f106001b, false, 2, null);
        }
        return l17;
    }

    @Override // com.tencent.mm.plugin.finder.extension.reddot.va
    public com.tencent.mm.plugin.finder.extension.reddot.jb i(java.lang.String path, java.lang.String str, boolean z17, boolean z18) {
        java.util.ArrayList arrayList;
        java.util.ArrayList arrayList2;
        kotlin.jvm.internal.o.g(path, "path");
        java.util.List list = (java.util.List) this.f106004e.get(path);
        java.lang.Object obj = null;
        if (list != null) {
            synchronized (list) {
                arrayList2 = new java.util.ArrayList();
                for (java.lang.Object obj2 : list) {
                    com.tencent.mm.plugin.finder.extension.reddot.jb jbVar = (com.tencent.mm.plugin.finder.extension.reddot.jb) obj2;
                    boolean z19 = jbVar.z0(str) && com.tencent.mm.plugin.finder.extension.reddot.y8.f106036a.a("ctrlInfoAtPath", path) && !jbVar.d1(path, "ctrlInfoAtPath_n");
                    if (z17) {
                        z19 = z19 && !((com.tencent.mm.plugin.finder.extension.reddot.l5) this.f106002c).C(path, jbVar);
                    }
                    if (z19) {
                        arrayList2.add(obj2);
                    }
                }
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        java.util.List g17 = this.f106000a.g1("ctrlInfoAtPath", arrayList, path, z17, z18);
        if (g17 == null) {
            return null;
        }
        synchronized (g17) {
            java.util.ListIterator listIterator = g17.listIterator(g17.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    break;
                }
                java.lang.Object previous = listIterator.previous();
                if (((com.tencent.mm.plugin.finder.extension.reddot.jb) previous).I0(path) != null) {
                    obj = previous;
                    break;
                }
            }
        }
        return (com.tencent.mm.plugin.finder.extension.reddot.jb) obj;
    }

    @Override // com.tencent.mm.plugin.finder.extension.reddot.va
    public void j() {
        com.tencent.mars.xlog.Log.i(this.f106003d, "onAccountChange");
    }

    @Override // com.tencent.mm.plugin.finder.extension.reddot.va
    public void k(androidx.recyclerview.widget.RecyclerView swipeView, int i17) {
        kotlin.jvm.internal.o.g(swipeView, "swipeView");
        ((com.tencent.mm.plugin.finder.extension.reddot.la) ((jz5.n) this.f106006g).getValue()).a(swipeView, i17);
    }

    @Override // com.tencent.mm.plugin.finder.extension.reddot.va
    public java.util.Set l(com.tencent.mm.plugin.finder.extension.reddot.jb jbVar, r45.f03 f03Var, r45.ut2 revokeInfo) {
        kotlin.jvm.internal.o.g(revokeInfo, "revokeInfo");
        java.util.HashSet hashSet = new java.util.HashSet();
        int integer = revokeInfo.getInteger(1);
        com.tencent.mm.plugin.finder.extension.reddot.y2 y2Var = com.tencent.mm.plugin.finder.extension.reddot.z2.f106043c;
        com.tencent.mm.plugin.finder.extension.reddot.x9 x9Var = this.f106000a;
        if (integer == 0) {
            if (f03Var == null) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(20951, 0, 0, 3, "", revokeInfo.getString(0), java.lang.Integer.valueOf(revokeInfo.getInteger(1)), "");
            } else if (jbVar != null) {
                com.tencent.mm.plugin.finder.report.x2.j(com.tencent.mm.plugin.finder.report.x2.f125429a, jbVar, f03Var, 1, revokeInfo.getInteger(1), null, null, 48, null);
            }
            java.lang.String string = revokeInfo.getString(0);
            if (string == null) {
                string = "";
            }
            if (y2Var.a(string)) {
                com.tencent.mm.plugin.finder.extension.reddot.x9 x9Var2 = this.f106000a;
                java.lang.String string2 = revokeInfo.getString(0);
                for (com.tencent.mm.plugin.finder.extension.reddot.jb jbVar2 : zy2.ia.Y(x9Var2, "revokeRedDotPath#0", string2 == null ? "" : string2, null, 4, null)) {
                    x9Var.o0("revokeRedDotPath#0", jbVar2);
                    hashSet.addAll(jbVar2.J0());
                }
            } else {
                java.lang.String string3 = revokeInfo.getString(0);
                if (string3 == null) {
                    string3 = "";
                }
                x9Var.q0(string3, "revokeRedDotPath#0");
                java.lang.String string4 = revokeInfo.getString(0);
                hashSet.addAll(x9Var.N(string4 != null ? string4 : ""));
            }
        } else if (revokeInfo.getInteger(1) == 1) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            java.util.LinkedList list = revokeInfo.getList(2);
            kotlin.jvm.internal.o.f(list, "getTips_id_list(...)");
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                sb6.append(((java.lang.String) it.next()) + ';');
            }
            r26.n0.V(sb6, ";");
            kotlin.jvm.internal.c0 c0Var = new kotlin.jvm.internal.c0();
            c0Var.f310112d = true;
            kotlin.jvm.internal.c0 c0Var2 = new kotlin.jvm.internal.c0();
            java.lang.String string5 = revokeInfo.getString(0);
            if (string5 == null) {
                string5 = "";
            }
            if (y2Var.a(string5)) {
                java.lang.String string6 = revokeInfo.getString(0);
                for (com.tencent.mm.plugin.finder.extension.reddot.jb jbVar3 : x9Var.C("revokeRedDotPath#1", string6 != null ? string6 : "", new com.tencent.mm.plugin.finder.extension.reddot.u8(revokeInfo, c0Var2, c0Var))) {
                    hashSet.addAll(jbVar3.J0());
                    x9Var.o0("revokeRedDotPath#1", jbVar3);
                }
            } else {
                com.tencent.mm.plugin.finder.extension.reddot.x9 x9Var3 = this.f106000a;
                java.lang.String string7 = revokeInfo.getString(0);
                hashSet.addAll(zy2.ia.E0(x9Var3, string7 == null ? "" : string7, new com.tencent.mm.plugin.finder.extension.reddot.v8(revokeInfo, c0Var, c0Var2, this), false, null, 12, null));
            }
            com.tencent.mars.xlog.Log.i(this.f106003d, "[revokePathRedDot] isHasDisposed=" + c0Var2.f310112d + " isAllDisposed=" + c0Var.f310112d + " tipsList=" + ((java.lang.Object) sb6));
            boolean z17 = c0Var2.f310112d;
            if (z17 && c0Var.f310112d) {
                if (jbVar != null && f03Var != null) {
                    com.tencent.mm.plugin.finder.report.x2 x2Var = com.tencent.mm.plugin.finder.report.x2.f125429a;
                    int integer2 = revokeInfo.getInteger(1);
                    java.lang.String sb7 = sb6.toString();
                    kotlin.jvm.internal.o.f(sb7, "toString(...)");
                    com.tencent.mm.plugin.finder.report.x2.j(x2Var, jbVar, f03Var, 1, integer2, sb7, null, 32, null);
                }
            } else if (!z17 || c0Var.f310112d) {
                if (!z17 && jbVar != null && f03Var != null) {
                    com.tencent.mm.plugin.finder.report.x2 x2Var2 = com.tencent.mm.plugin.finder.report.x2.f125429a;
                    int integer3 = revokeInfo.getInteger(1);
                    java.lang.String sb8 = sb6.toString();
                    kotlin.jvm.internal.o.f(sb8, "toString(...)");
                    com.tencent.mm.plugin.finder.report.x2.j(x2Var2, jbVar, f03Var, 4, integer3, sb8, null, 32, null);
                }
            } else if (jbVar != null && f03Var != null) {
                com.tencent.mm.plugin.finder.report.x2 x2Var3 = com.tencent.mm.plugin.finder.report.x2.f125429a;
                int integer4 = revokeInfo.getInteger(1);
                java.lang.String sb9 = sb6.toString();
                kotlin.jvm.internal.o.f(sb9, "toString(...)");
                com.tencent.mm.plugin.finder.report.x2.j(x2Var3, jbVar, f03Var, 2, integer4, sb9, null, 32, null);
            }
        }
        return hashSet;
    }

    @Override // com.tencent.mm.plugin.finder.extension.reddot.va
    public java.util.HashSet m(java.lang.String source, com.tencent.mm.plugin.finder.extension.reddot.jb ctrlInfo, java.lang.String path, boolean z17, java.lang.String username, yz5.l call) {
        java.util.List list;
        kotlin.jvm.internal.o.g(source, "source");
        kotlin.jvm.internal.o.g(ctrlInfo, "ctrlInfo");
        kotlin.jvm.internal.o.g(path, "path");
        kotlin.jvm.internal.o.g(username, "username");
        kotlin.jvm.internal.o.g(call, "call");
        java.util.HashSet hashSet = new java.util.HashSet();
        if (!ctrlInfo.y0(path)) {
            return hashSet;
        }
        hashSet.add(path);
        if (((java.lang.Boolean) call.invoke(ctrlInfo)).booleanValue()) {
            java.util.LinkedList q17 = com.tencent.mm.plugin.finder.extension.reddot.jb.q1(ctrlInfo, path, z17, 0, username, 4, null);
            if (q17.size() > 0 && ctrlInfo.n1(this.f106001b, true)) {
                hashSet.addAll(q17);
            }
            if (ctrlInfo.h1() && (list = (java.util.List) this.f106004e.get(path)) != null) {
                pm0.v.G(list, new com.tencent.mm.plugin.finder.extension.reddot.t8(ctrlInfo));
            }
        }
        com.tencent.mars.xlog.Log.i(this.f106003d, source + " removeRedDotAtPath path=" + path + " removePathSet=" + hashSet + " hash=" + hashCode() + ' ' + j40.o.f297604a.b());
        return hashSet;
    }

    @Override // com.tencent.mm.plugin.finder.extension.reddot.va
    public java.util.List n(java.lang.String path, java.lang.String finderUserName, boolean z17, boolean z18) {
        kotlin.jvm.internal.o.g(path, "path");
        kotlin.jvm.internal.o.g(finderUserName, "finderUserName");
        java.util.HashSet hashSet = new java.util.HashSet();
        for (java.util.Map.Entry entry : this.f106004e.entrySet()) {
            synchronized (entry.getValue()) {
                for (com.tencent.mm.plugin.finder.extension.reddot.jb jbVar : (java.util.List) entry.getValue()) {
                    if (jbVar.F0(finderUserName) && jbVar.I0(path) != null && com.tencent.mm.plugin.finder.extension.reddot.y8.f106036a.a("ctrlInfoListAtPath", path)) {
                        if (z17 ? !((com.tencent.mm.plugin.finder.extension.reddot.l5) this.f106002c).C(path, jbVar) : true) {
                            hashSet.add(jbVar);
                        }
                    }
                }
            }
        }
        if ((!hashSet.isEmpty()) && z18 && ((com.tencent.mm.plugin.finder.extension.reddot.l5) this.f106002c).m()) {
            java.util.HashMap d17 = d(finderUserName, null);
            java.util.Iterator it = hashSet.iterator();
            kotlin.jvm.internal.o.f(it, "iterator(...)");
            while (it.hasNext()) {
                java.lang.Object next = it.next();
                kotlin.jvm.internal.o.f(next, "next(...)");
                if (((com.tencent.mm.plugin.finder.extension.reddot.l5) this.f106002c).E("getCtrlInfoByPath", path, (com.tencent.mm.plugin.finder.extension.reddot.jb) next, d17)) {
                    it.remove();
                }
            }
        }
        return kz5.n0.S0(hashSet);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0052 A[EDGE_INSN: B:23:0x0052->B:24:0x0052 BREAK  A[LOOP:1: B:11:0x0027->B:31:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[LOOP:1: B:11:0x0027->B:31:?, LOOP_END, SYNTHETIC] */
    @Override // com.tencent.mm.plugin.finder.extension.reddot.va
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean o(java.lang.String r9) {
        /*
            r8 = this;
            java.util.concurrent.ConcurrentHashMap r0 = r8.f106004e
            java.util.Collection r0 = r0.values()
            java.lang.String r1 = "<get-values>(...)"
            kotlin.jvm.internal.o.f(r0, r1)
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            monitor-enter(r0)
            java.util.Iterator r1 = r0.iterator()     // Catch: java.lang.Throwable -> L5c
        L12:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L5c
            r3 = 0
            if (r2 == 0) goto L5a
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L5c
            java.util.List r2 = (java.util.List) r2     // Catch: java.lang.Throwable -> L5c
            kotlin.jvm.internal.o.d(r2)     // Catch: java.lang.Throwable -> L5c
            monitor-enter(r2)     // Catch: java.lang.Throwable -> L5c
            java.util.Iterator r4 = r2.iterator()     // Catch: java.lang.Throwable -> L57
        L27:
            boolean r5 = r4.hasNext()     // Catch: java.lang.Throwable -> L57
            r6 = 1
            if (r5 == 0) goto L51
            java.lang.Object r5 = r4.next()     // Catch: java.lang.Throwable -> L57
            r7 = r5
            com.tencent.mm.plugin.finder.extension.reddot.jb r7 = (com.tencent.mm.plugin.finder.extension.reddot.jb) r7     // Catch: java.lang.Throwable -> L57
            java.lang.String r7 = r7.field_tips_uuid     // Catch: java.lang.Throwable -> L57
            boolean r7 = kotlin.jvm.internal.o.b(r7, r9)     // Catch: java.lang.Throwable -> L57
            if (r7 == 0) goto L4d
            if (r9 == 0) goto L48
            int r7 = r9.length()     // Catch: java.lang.Throwable -> L57
            if (r7 != 0) goto L46
            goto L48
        L46:
            r7 = r3
            goto L49
        L48:
            r7 = r6
        L49:
            if (r7 != 0) goto L4d
            r7 = r6
            goto L4e
        L4d:
            r7 = r3
        L4e:
            if (r7 == 0) goto L27
            goto L52
        L51:
            r5 = 0
        L52:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L5c
            if (r5 == 0) goto L12
            monitor-exit(r0)
            return r6
        L57:
            r9 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L5c
            throw r9     // Catch: java.lang.Throwable -> L5c
        L5a:
            monitor-exit(r0)
            return r3
        L5c:
            r9 = move-exception
            monitor-exit(r0)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.extension.reddot.x8.o(java.lang.String):boolean");
    }

    @Override // com.tencent.mm.plugin.finder.extension.reddot.va
    public jz5.l p(java.lang.String source, com.tencent.mm.plugin.finder.extension.reddot.jb info) {
        kotlin.jvm.internal.o.g(source, "source");
        kotlin.jvm.internal.o.g(info, "info");
        r45.vs2 field_ctrInfo = info.field_ctrInfo;
        kotlin.jvm.internal.o.f(field_ctrInfo, "field_ctrInfo");
        java.lang.String b17 = hc2.u0.b(field_ctrInfo);
        java.util.HashSet e17 = e(info.getType(), b17, com.tencent.mm.plugin.finder.extension.reddot.l8.f105691d);
        com.tencent.mars.xlog.Log.i(this.f106003d, "[addNewRedDot] source=" + source + " username=" + b17 + ' ' + hc2.u0.e(info.field_ctrInfo) + " revokeId=" + info.field_revokeId);
        if (com.tencent.mars.xlog.Log.isDebug()) {
            info.W0().getString(5);
            java.lang.String str = info.field_ctrInfo.f388499t;
        }
        java.util.HashSet y17 = y(b17, info, true);
        ((com.tencent.mm.plugin.finder.extension.reddot.la) ((jz5.n) this.f106006g).getValue()).b(info);
        return new jz5.l(y17, e17);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00ea A[Catch: all -> 0x0191, LOOP:1: B:22:0x00e4->B:24:0x00ea, LOOP_END, TryCatch #0 {all -> 0x0191, blocks: (B:3:0x0072, B:4:0x0078, B:6:0x007e, B:8:0x008b, B:11:0x00a4, B:13:0x00aa, B:15:0x00c3, B:17:0x00d1, B:21:0x00d9, B:22:0x00e4, B:24:0x00ea, B:26:0x0118, B:28:0x0157, B:29:0x0163, B:31:0x016b, B:36:0x018a), top: B:2:0x0072 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0157 A[Catch: all -> 0x0191, TryCatch #0 {all -> 0x0191, blocks: (B:3:0x0072, B:4:0x0078, B:6:0x007e, B:8:0x008b, B:11:0x00a4, B:13:0x00aa, B:15:0x00c3, B:17:0x00d1, B:21:0x00d9, B:22:0x00e4, B:24:0x00ea, B:26:0x0118, B:28:0x0157, B:29:0x0163, B:31:0x016b, B:36:0x018a), top: B:2:0x0072 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x016b A[Catch: all -> 0x0191, TryCatch #0 {all -> 0x0191, blocks: (B:3:0x0072, B:4:0x0078, B:6:0x007e, B:8:0x008b, B:11:0x00a4, B:13:0x00aa, B:15:0x00c3, B:17:0x00d1, B:21:0x00d9, B:22:0x00e4, B:24:0x00ea, B:26:0x0118, B:28:0x0157, B:29:0x0163, B:31:0x016b, B:36:0x018a), top: B:2:0x0072 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0187 A[SYNTHETIC] */
    @Override // com.tencent.mm.plugin.finder.extension.reddot.va
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.List q(java.lang.String r21, yz5.l r22) {
        /*
            Method dump skipped, instructions count: 425
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.extension.reddot.x8.q(java.lang.String, yz5.l):java.util.List");
    }

    @Override // com.tencent.mm.plugin.finder.extension.reddot.va
    public void r(com.tencent.mm.plugin.finder.extension.reddot.jb ctrlInfo) {
        kotlin.jvm.internal.o.g(ctrlInfo, "ctrlInfo");
        com.tencent.mm.plugin.finder.extension.reddot.jb.o1(ctrlInfo, this.f106001b, false, 2, null);
    }

    @Override // com.tencent.mm.plugin.finder.extension.reddot.va
    public java.util.HashSet s(com.tencent.mm.plugin.finder.extension.reddot.jb ctrInfo) {
        kotlin.jvm.internal.o.g(ctrInfo, "ctrInfo");
        java.util.HashSet hashSet = new java.util.HashSet();
        for (java.lang.String str : ctrInfo.J0()) {
            java.util.List list = (java.util.List) this.f106004e.get(str);
            if (list != null) {
                pm0.v.G(list, new com.tencent.mm.plugin.finder.extension.reddot.r8(ctrInfo));
            }
            hashSet.add(str);
        }
        ctrInfo.A0(this.f106001b, true);
        return hashSet;
    }

    @Override // com.tencent.mm.plugin.finder.extension.reddot.va
    public void t(java.lang.String removePath, com.tencent.mm.plugin.finder.extension.reddot.jb ctrlInfo) {
        java.util.List list;
        kotlin.jvm.internal.o.g(removePath, "removePath");
        kotlin.jvm.internal.o.g(ctrlInfo, "ctrlInfo");
        if (!ctrlInfo.h1() || (list = (java.util.List) this.f106004e.get(removePath)) == null) {
            return;
        }
        list.remove(ctrlInfo);
    }

    @Override // com.tencent.mm.plugin.finder.extension.reddot.va
    public java.util.Set u() {
        java.util.HashSet hashSet = new java.util.HashSet();
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f106004e;
        synchronized (concurrentHashMap) {
            java.util.Iterator it = concurrentHashMap.entrySet().iterator();
            while (it.hasNext()) {
                hashSet.addAll((java.util.Collection) ((java.util.Map.Entry) it.next()).getValue());
            }
        }
        return hashSet;
    }

    @Override // com.tencent.mm.plugin.finder.extension.reddot.va
    public void v() {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f106004e;
        kotlin.jvm.internal.o.g(concurrentHashMap, "<this>");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        for (java.util.Map.Entry entry : concurrentHashMap.entrySet()) {
            java.lang.String str = (java.lang.String) entry.getKey();
            java.util.List list = (java.util.List) entry.getValue();
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
            sb7.append(str);
            sb7.append(':');
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list, 10));
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((com.tencent.mm.plugin.finder.extension.reddot.jb) it.next()).field_tips_uuid);
            }
            sb7.append(arrayList);
            sb7.append('\n');
            sb6.append(sb7.toString());
        }
        com.tencent.mars.xlog.Log.i("[prepare] all ctrInfo:", sb6.toString());
    }

    @Override // com.tencent.mm.plugin.finder.extension.reddot.va
    public void w(com.tencent.mm.plugin.finder.extension.reddot.jb jbVar) {
        java.lang.String str;
        if (jbVar == null || (str = jbVar.field_revokeId) == null) {
            return;
        }
        this.f106005f.put(str, jbVar);
    }

    @Override // com.tencent.mm.plugin.finder.extension.reddot.va
    public java.util.Map x() {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f106004e;
        java.util.Enumeration keys = concurrentHashMap.keys();
        kotlin.jvm.internal.o.f(keys, "keys(...)");
        java.util.ArrayList list = java.util.Collections.list(keys);
        kotlin.jvm.internal.o.f(list, "list(...)");
        com.tencent.mars.xlog.Log.i(this.f106003d, "removeAllCtrlInfo list:" + list);
        java.util.HashMap hashMap = new java.util.HashMap(concurrentHashMap);
        concurrentHashMap.clear();
        return hashMap;
    }

    public final java.util.HashSet y(java.lang.String str, com.tencent.mm.plugin.finder.extension.reddot.jb jbVar, boolean z17) {
        java.util.HashSet hashSet = new java.util.HashSet();
        for (java.lang.String str2 : jbVar.J0()) {
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f106004e;
            java.util.List list = (java.util.List) concurrentHashMap.get(str2);
            if (list == null) {
                list = java.util.Collections.synchronizedList(new java.util.LinkedList());
                kotlin.jvm.internal.o.d(list);
                concurrentHashMap.put(str2, list);
            }
            if (jbVar.z0(str)) {
                pm0.v.G(list, new com.tencent.mm.plugin.finder.extension.reddot.m8(jbVar));
                list.add(jbVar);
                kz5.g0.t(list, mz5.a.a(com.tencent.mm.plugin.finder.extension.reddot.n8.f105727d, com.tencent.mm.plugin.finder.extension.reddot.o8.f105750d));
                hashSet.add(str2);
            }
        }
        if (z17) {
            com.tencent.mm.plugin.finder.extension.reddot.jb.o1(jbVar, this.f106001b, false, 2, null);
        }
        return hashSet;
    }

    public final java.util.HashMap z(int i17, yz5.l lVar, java.lang.String str) {
        com.tencent.mars.xlog.Log.i(this.f106003d, "getCtrlInfoMap type:" + i17 + " username=" + str);
        java.util.HashMap hashMap = new java.util.HashMap();
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f106004e;
        synchronized (concurrentHashMap) {
            for (java.util.Map.Entry entry : concurrentHashMap.entrySet()) {
                java.lang.String str2 = (java.lang.String) entry.getKey();
                java.lang.Iterable<com.tencent.mm.plugin.finder.extension.reddot.jb> iterable = (java.lang.Iterable) entry.getValue();
                synchronized (iterable) {
                    for (com.tencent.mm.plugin.finder.extension.reddot.jb jbVar : iterable) {
                        if (jbVar.F0(str) && (jbVar.field_ctrInfo.f388487e == i17 || i17 == Integer.MIN_VALUE)) {
                            if (((java.lang.Boolean) lVar.invoke(jbVar)).booleanValue()) {
                                java.util.LinkedList linkedList = (java.util.LinkedList) hashMap.get(str2);
                                if (linkedList == null) {
                                    linkedList = new java.util.LinkedList();
                                    hashMap.put(str2, linkedList);
                                }
                                linkedList.add(jbVar);
                            }
                        }
                    }
                }
            }
        }
        return hashMap;
    }
}

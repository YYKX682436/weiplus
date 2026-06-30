package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718;

/* loaded from: classes8.dex */
public final class x8 implements com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.va {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.x9 f187533a;

    /* renamed from: b, reason: collision with root package name */
    public final zy2.ba f187534b;

    /* renamed from: c, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.ua f187535c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f187536d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f187537e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f187538f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f187539g;

    public x8(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.x9 manager, zy2.ba storage, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.ua freqController) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(manager, "manager");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(storage, "storage");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(freqController, "freqController");
        this.f187533a = manager;
        this.f187534b = storage;
        this.f187535c = freqController;
        this.f187536d = "Finder.RedDotManagerCrossPlatformNative";
        this.f187537e = new java.util.concurrent.ConcurrentHashMap();
        this.f187538f = new java.util.concurrent.ConcurrentHashMap();
        this.f187539g = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.w8(this));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.va
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb a(java.lang.String path, java.lang.String tipsUuid, boolean z17, boolean z18) {
        java.util.ArrayList arrayList;
        java.util.ArrayList arrayList2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tipsUuid, "tipsUuid");
        java.util.List list = (java.util.List) this.f187537e.get(path);
        java.lang.Object obj = null;
        if (list != null) {
            synchronized (list) {
                arrayList2 = new java.util.ArrayList();
                for (java.lang.Object obj2 : list) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb jbVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb) obj2;
                    boolean z19 = (jbVar.z0(g92.b.f351302e.T0()) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(jbVar.f65882x5364c75d, tipsUuid)) && com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.y8.f187569a.a("getByTipsUuid", path);
                    if (z17) {
                        z19 = z19 && !((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.l5) this.f187535c).C(path, jbVar);
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
        java.util.List g17 = this.f187533a.g1("getByTipsUuid", arrayList, path, z17, z18);
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
                if (((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb) previous).I0(path) != null) {
                    obj = previous;
                    break;
                }
            }
        }
        return (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb) obj;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.va
    public boolean b(java.lang.String path, java.util.List ctrlTypeList) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ctrlTypeList, "ctrlTypeList");
        java.util.List list = (java.util.List) this.f187537e.get(path);
        int i17 = -1;
        if (list != null) {
            synchronized (list) {
                java.util.Iterator it = list.iterator();
                int i18 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    if (ctrlTypeList.contains(java.lang.Integer.valueOf(((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb) it.next()).m55856xfb85f7b0()))) {
                        i17 = i18;
                        break;
                    }
                    i18++;
                }
            }
        }
        return i17 >= 0;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.va
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb c(java.lang.String str) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f187538f;
        if (str == null) {
            str = "";
        }
        return (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb) concurrentHashMap.get(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x006c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0032 A[SYNTHETIC] */
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.va
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.HashMap d(java.lang.String r13, java.util.List r14) {
        /*
            r12 = this;
            java.lang.String r0 = "username"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r13, r0)
            com.tencent.mm.plugin.finder.extension.reddot.g4 r0 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.l5.H
            java.util.List r0 = r0.e()
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
            r2 = r1
        L12:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto Lae
            java.lang.Object r3 = r0.next()
            java.lang.String r3 = (java.lang.String) r3
            java.util.concurrent.ConcurrentHashMap r4 = r12.f187537e
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
            com.tencent.mm.plugin.finder.extension.reddot.jb r10 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb) r10     // Catch: java.lang.Throwable -> Lab
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
            com.tencent.mm.plugin.finder.extension.reddot.ua r11 = r12.f187535c     // Catch: java.lang.Throwable -> Lab
            com.tencent.mm.plugin.finder.extension.reddot.l5 r11 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.l5) r11     // Catch: java.lang.Throwable -> Lab
            boolean r10 = r11.C(r3, r10)     // Catch: java.lang.Throwable -> Lab
            if (r10 != 0) goto L69
        L5e:
            com.tencent.mm.plugin.finder.extension.reddot.y8 r10 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.y8.f187569a     // Catch: java.lang.Throwable -> Lab
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
            com.tencent.mm.plugin.finder.extension.reddot.jb r7 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb) r7     // Catch: java.lang.Throwable -> La8
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
            com.tencent.mm.plugin.finder.extension.reddot.jb r6 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb) r6
            if (r6 == 0) goto L12
            if (r2 != 0) goto La0
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
        La0:
            java.lang.Object r3 = r2.put(r3, r6)
            com.tencent.mm.plugin.finder.extension.reddot.jb r3 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb) r3
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
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.x8.d(java.lang.String, java.util.List):java.util.HashMap");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.va
    public java.util.HashSet e(int i17, java.lang.String username, yz5.l filter) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(filter, "filter");
        boolean wi6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.mj0) ((zy2.qb) i95.n0.c(zy2.qb.class))).wi();
        java.lang.String str = this.f187536d;
        if (wi6 && !com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.f3.a(java.lang.Integer.valueOf(i17))) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "[clearCtrlInfo] 青少年模式且只看关注的模式下只clear关注的红点展示");
            return new java.util.HashSet();
        }
        java.util.HashMap z17 = z(i17, filter, username);
        if (!z17.isEmpty()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "[clearCtrlInfo] type=" + i17 + " removeRedDot clearMap=" + z17);
        }
        java.util.HashSet hashSet = new java.util.HashSet();
        for (java.util.Map.Entry entry : z17.entrySet()) {
            java.util.List list = (java.util.List) this.f187537e.get((java.lang.String) entry.getKey());
            if (list != null) {
                pm0.v.G(list, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.s8(entry));
            }
            for (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb jbVar : (java.lang.Iterable) entry.getValue()) {
                if (!hashSet.contains(jbVar)) {
                    l75.e0 e0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb.Q;
                    jbVar.A0(this.f187534b, true);
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

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.va
    public java.util.LinkedList f(int i17, java.lang.String username) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        java.util.HashMap z17 = z(i17, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.p8.f187307d, username);
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.Iterator it = z17.entrySet().iterator();
        while (it.hasNext()) {
            linkedList.addAll((java.util.Collection) ((java.util.Map.Entry) it.next()).getValue());
        }
        return linkedList;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.va
    public void g(java.lang.String groupId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(groupId, "groupId");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f187537e;
        synchronized (concurrentHashMap) {
            java.util.Iterator it = concurrentHashMap.entrySet().iterator();
            while (it.hasNext()) {
                java.lang.Iterable<com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb> iterable = (java.lang.Iterable) ((java.util.Map.Entry) it.next()).getValue();
                synchronized (iterable) {
                    for (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb jbVar : iterable) {
                        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(jbVar.f65874xb5f7102a.f470033u, groupId)) {
                            arrayList.add(jbVar);
                        }
                    }
                }
            }
        }
        java.util.Iterator it6 = arrayList.iterator();
        while (it6.hasNext()) {
            this.f187533a.L((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb) it6.next());
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.va
    public boolean h(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb ctrlInfo, java.lang.String path, long j17, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ctrlInfo, "ctrlInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        boolean l17 = ctrlInfo.l1(path, j17, z17);
        if (l17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb.o1(ctrlInfo, this.f187534b, false, 2, null);
        }
        return l17;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.va
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb i(java.lang.String path, java.lang.String str, boolean z17, boolean z18) {
        java.util.ArrayList arrayList;
        java.util.ArrayList arrayList2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        java.util.List list = (java.util.List) this.f187537e.get(path);
        java.lang.Object obj = null;
        if (list != null) {
            synchronized (list) {
                arrayList2 = new java.util.ArrayList();
                for (java.lang.Object obj2 : list) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb jbVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb) obj2;
                    boolean z19 = jbVar.z0(str) && com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.y8.f187569a.a("ctrlInfoAtPath", path) && !jbVar.d1(path, "ctrlInfoAtPath_n");
                    if (z17) {
                        z19 = z19 && !((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.l5) this.f187535c).C(path, jbVar);
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
        java.util.List g17 = this.f187533a.g1("ctrlInfoAtPath", arrayList, path, z17, z18);
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
                if (((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb) previous).I0(path) != null) {
                    obj = previous;
                    break;
                }
            }
        }
        return (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb) obj;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.va
    public void j() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f187536d, "onAccountChange");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.va
    public void k(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 swipeView, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(swipeView, "swipeView");
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.la) ((jz5.n) this.f187539g).mo141623x754a37bb()).a(swipeView, i17);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.va
    public java.util.Set l(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb jbVar, r45.f03 f03Var, r45.ut2 revokeInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(revokeInfo, "revokeInfo");
        java.util.HashSet hashSet = new java.util.HashSet();
        int m75939xb282bd08 = revokeInfo.m75939xb282bd08(1);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.y2 y2Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.z2.f187576c;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.x9 x9Var = this.f187533a;
        if (m75939xb282bd08 == 0) {
            if (f03Var == null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(20951, 0, 0, 3, "", revokeInfo.m75945x2fec8307(0), java.lang.Integer.valueOf(revokeInfo.m75939xb282bd08(1)), "");
            } else if (jbVar != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.x2.j(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.x2.f206962a, jbVar, f03Var, 1, revokeInfo.m75939xb282bd08(1), null, null, 48, null);
            }
            java.lang.String m75945x2fec8307 = revokeInfo.m75945x2fec8307(0);
            if (m75945x2fec8307 == null) {
                m75945x2fec8307 = "";
            }
            if (y2Var.a(m75945x2fec8307)) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.x9 x9Var2 = this.f187533a;
                java.lang.String m75945x2fec83072 = revokeInfo.m75945x2fec8307(0);
                for (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb jbVar2 : zy2.ia.Y(x9Var2, "revokeRedDotPath#0", m75945x2fec83072 == null ? "" : m75945x2fec83072, null, 4, null)) {
                    x9Var.o0("revokeRedDotPath#0", jbVar2);
                    hashSet.addAll(jbVar2.J0());
                }
            } else {
                java.lang.String m75945x2fec83073 = revokeInfo.m75945x2fec8307(0);
                if (m75945x2fec83073 == null) {
                    m75945x2fec83073 = "";
                }
                x9Var.q0(m75945x2fec83073, "revokeRedDotPath#0");
                java.lang.String m75945x2fec83074 = revokeInfo.m75945x2fec8307(0);
                hashSet.addAll(x9Var.N(m75945x2fec83074 != null ? m75945x2fec83074 : ""));
            }
        } else if (revokeInfo.m75939xb282bd08(1) == 1) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            java.util.LinkedList m75941xfb821914 = revokeInfo.m75941xfb821914(2);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getTips_id_list(...)");
            java.util.Iterator it = m75941xfb821914.iterator();
            while (it.hasNext()) {
                sb6.append(((java.lang.String) it.next()) + ';');
            }
            r26.n0.V(sb6, ";");
            p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.c0();
            c0Var.f391645d = true;
            p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var2 = new p3321xbce91901.jvm.p3324x21ffc6bd.c0();
            java.lang.String m75945x2fec83075 = revokeInfo.m75945x2fec8307(0);
            if (m75945x2fec83075 == null) {
                m75945x2fec83075 = "";
            }
            if (y2Var.a(m75945x2fec83075)) {
                java.lang.String m75945x2fec83076 = revokeInfo.m75945x2fec8307(0);
                for (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb jbVar3 : x9Var.C("revokeRedDotPath#1", m75945x2fec83076 != null ? m75945x2fec83076 : "", new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.u8(revokeInfo, c0Var2, c0Var))) {
                    hashSet.addAll(jbVar3.J0());
                    x9Var.o0("revokeRedDotPath#1", jbVar3);
                }
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.x9 x9Var3 = this.f187533a;
                java.lang.String m75945x2fec83077 = revokeInfo.m75945x2fec8307(0);
                hashSet.addAll(zy2.ia.E0(x9Var3, m75945x2fec83077 == null ? "" : m75945x2fec83077, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.v8(revokeInfo, c0Var, c0Var2, this), false, null, 12, null));
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f187536d, "[revokePathRedDot] isHasDisposed=" + c0Var2.f391645d + " isAllDisposed=" + c0Var.f391645d + " tipsList=" + ((java.lang.Object) sb6));
            boolean z17 = c0Var2.f391645d;
            if (z17 && c0Var.f391645d) {
                if (jbVar != null && f03Var != null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.x2 x2Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.x2.f206962a;
                    int m75939xb282bd082 = revokeInfo.m75939xb282bd08(1);
                    java.lang.String sb7 = sb6.toString();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(sb7, "toString(...)");
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.x2.j(x2Var, jbVar, f03Var, 1, m75939xb282bd082, sb7, null, 32, null);
                }
            } else if (!z17 || c0Var.f391645d) {
                if (!z17 && jbVar != null && f03Var != null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.x2 x2Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.x2.f206962a;
                    int m75939xb282bd083 = revokeInfo.m75939xb282bd08(1);
                    java.lang.String sb8 = sb6.toString();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(sb8, "toString(...)");
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.x2.j(x2Var2, jbVar, f03Var, 4, m75939xb282bd083, sb8, null, 32, null);
                }
            } else if (jbVar != null && f03Var != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.x2 x2Var3 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.x2.f206962a;
                int m75939xb282bd084 = revokeInfo.m75939xb282bd08(1);
                java.lang.String sb9 = sb6.toString();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(sb9, "toString(...)");
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.x2.j(x2Var3, jbVar, f03Var, 2, m75939xb282bd084, sb9, null, 32, null);
            }
        }
        return hashSet;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.va
    public java.util.HashSet m(java.lang.String source, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb ctrlInfo, java.lang.String path, boolean z17, java.lang.String username, yz5.l call) {
        java.util.List list;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ctrlInfo, "ctrlInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(call, "call");
        java.util.HashSet hashSet = new java.util.HashSet();
        if (!ctrlInfo.y0(path)) {
            return hashSet;
        }
        hashSet.add(path);
        if (((java.lang.Boolean) call.mo146xb9724478(ctrlInfo)).booleanValue()) {
            java.util.LinkedList q17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb.q1(ctrlInfo, path, z17, 0, username, 4, null);
            if (q17.size() > 0 && ctrlInfo.n1(this.f187534b, true)) {
                hashSet.addAll(q17);
            }
            if (ctrlInfo.h1() && (list = (java.util.List) this.f187537e.get(path)) != null) {
                pm0.v.G(list, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.t8(ctrlInfo));
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f187536d, source + " removeRedDotAtPath path=" + path + " removePathSet=" + hashSet + " hash=" + hashCode() + ' ' + j40.o.f379137a.b());
        return hashSet;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.va
    public java.util.List n(java.lang.String path, java.lang.String finderUserName, boolean z17, boolean z18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderUserName, "finderUserName");
        java.util.HashSet hashSet = new java.util.HashSet();
        for (java.util.Map.Entry entry : this.f187537e.entrySet()) {
            synchronized (entry.getValue()) {
                for (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb jbVar : (java.util.List) entry.getValue()) {
                    if (jbVar.F0(finderUserName) && jbVar.I0(path) != null && com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.y8.f187569a.a("ctrlInfoListAtPath", path)) {
                        if (z17 ? !((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.l5) this.f187535c).C(path, jbVar) : true) {
                            hashSet.add(jbVar);
                        }
                    }
                }
            }
        }
        if ((!hashSet.isEmpty()) && z18 && ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.l5) this.f187535c).m()) {
            java.util.HashMap d17 = d(finderUserName, null);
            java.util.Iterator it = hashSet.iterator();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(it, "iterator(...)");
            while (it.hasNext()) {
                java.lang.Object next = it.next();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(next, "next(...)");
                if (((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.l5) this.f187535c).E("getCtrlInfoByPath", path, (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb) next, d17)) {
                    it.remove();
                }
            }
        }
        return kz5.n0.S0(hashSet);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0052 A[EDGE_INSN: B:23:0x0052->B:24:0x0052 BREAK  A[LOOP:1: B:11:0x0027->B:31:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[LOOP:1: B:11:0x0027->B:31:?, LOOP_END, SYNTHETIC] */
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.va
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean o(java.lang.String r9) {
        /*
            r8 = this;
            java.util.concurrent.ConcurrentHashMap r0 = r8.f187537e
            java.util.Collection r0 = r0.values()
            java.lang.String r1 = "<get-values>(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r0, r1)
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            monitor-enter(r0)
            java.util.Iterator r1 = r0.iterator()     // Catch: java.lang.Throwable -> L5c
        L12:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L5c
            r3 = 0
            if (r2 == 0) goto L5a
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L5c
            java.util.List r2 = (java.util.List) r2     // Catch: java.lang.Throwable -> L5c
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r2)     // Catch: java.lang.Throwable -> L5c
            monitor-enter(r2)     // Catch: java.lang.Throwable -> L5c
            java.util.Iterator r4 = r2.iterator()     // Catch: java.lang.Throwable -> L57
        L27:
            boolean r5 = r4.hasNext()     // Catch: java.lang.Throwable -> L57
            r6 = 1
            if (r5 == 0) goto L51
            java.lang.Object r5 = r4.next()     // Catch: java.lang.Throwable -> L57
            r7 = r5
            com.tencent.mm.plugin.finder.extension.reddot.jb r7 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb) r7     // Catch: java.lang.Throwable -> L57
            java.lang.String r7 = r7.f65882x5364c75d     // Catch: java.lang.Throwable -> L57
            boolean r7 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r7, r9)     // Catch: java.lang.Throwable -> L57
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
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.x8.o(java.lang.String):boolean");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.va
    public jz5.l p(java.lang.String source, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb info) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        r45.vs2 field_ctrInfo = info.f65874xb5f7102a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_ctrInfo, "field_ctrInfo");
        java.lang.String b17 = hc2.u0.b(field_ctrInfo);
        java.util.HashSet e17 = e(info.m55856xfb85f7b0(), b17, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.l8.f187224d);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f187536d, "[addNewRedDot] source=" + source + " username=" + b17 + ' ' + hc2.u0.e(info.f65874xb5f7102a) + " revokeId=" + info.f65878xe8897e6);
        if (com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40539x7a994349()) {
            info.W0().m75945x2fec8307(5);
            java.lang.String str = info.f65874xb5f7102a.f470032t;
        }
        java.util.HashSet y17 = y(b17, info, true);
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.la) ((jz5.n) this.f187539g).mo141623x754a37bb()).b(info);
        return new jz5.l(y17, e17);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00ea A[Catch: all -> 0x0191, LOOP:1: B:22:0x00e4->B:24:0x00ea, LOOP_END, TryCatch #0 {all -> 0x0191, blocks: (B:3:0x0072, B:4:0x0078, B:6:0x007e, B:8:0x008b, B:11:0x00a4, B:13:0x00aa, B:15:0x00c3, B:17:0x00d1, B:21:0x00d9, B:22:0x00e4, B:24:0x00ea, B:26:0x0118, B:28:0x0157, B:29:0x0163, B:31:0x016b, B:36:0x018a), top: B:2:0x0072 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0157 A[Catch: all -> 0x0191, TryCatch #0 {all -> 0x0191, blocks: (B:3:0x0072, B:4:0x0078, B:6:0x007e, B:8:0x008b, B:11:0x00a4, B:13:0x00aa, B:15:0x00c3, B:17:0x00d1, B:21:0x00d9, B:22:0x00e4, B:24:0x00ea, B:26:0x0118, B:28:0x0157, B:29:0x0163, B:31:0x016b, B:36:0x018a), top: B:2:0x0072 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x016b A[Catch: all -> 0x0191, TryCatch #0 {all -> 0x0191, blocks: (B:3:0x0072, B:4:0x0078, B:6:0x007e, B:8:0x008b, B:11:0x00a4, B:13:0x00aa, B:15:0x00c3, B:17:0x00d1, B:21:0x00d9, B:22:0x00e4, B:24:0x00ea, B:26:0x0118, B:28:0x0157, B:29:0x0163, B:31:0x016b, B:36:0x018a), top: B:2:0x0072 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0187 A[SYNTHETIC] */
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.va
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.List q(java.lang.String r21, yz5.l r22) {
        /*
            Method dump skipped, instructions count: 425
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.x8.q(java.lang.String, yz5.l):java.util.List");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.va
    public void r(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb ctrlInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ctrlInfo, "ctrlInfo");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb.o1(ctrlInfo, this.f187534b, false, 2, null);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.va
    public java.util.HashSet s(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb ctrInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ctrInfo, "ctrInfo");
        java.util.HashSet hashSet = new java.util.HashSet();
        for (java.lang.String str : ctrInfo.J0()) {
            java.util.List list = (java.util.List) this.f187537e.get(str);
            if (list != null) {
                pm0.v.G(list, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.r8(ctrInfo));
            }
            hashSet.add(str);
        }
        ctrInfo.A0(this.f187534b, true);
        return hashSet;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.va
    public void t(java.lang.String removePath, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb ctrlInfo) {
        java.util.List list;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(removePath, "removePath");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ctrlInfo, "ctrlInfo");
        if (!ctrlInfo.h1() || (list = (java.util.List) this.f187537e.get(removePath)) == null) {
            return;
        }
        list.remove(ctrlInfo);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.va
    public java.util.Set u() {
        java.util.HashSet hashSet = new java.util.HashSet();
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f187537e;
        synchronized (concurrentHashMap) {
            java.util.Iterator it = concurrentHashMap.entrySet().iterator();
            while (it.hasNext()) {
                hashSet.addAll((java.util.Collection) ((java.util.Map.Entry) it.next()).getValue());
            }
        }
        return hashSet;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.va
    public void v() {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f187537e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(concurrentHashMap, "<this>");
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
                arrayList.add(((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb) it.next()).f65882x5364c75d);
            }
            sb7.append(arrayList);
            sb7.append('\n');
            sb6.append(sb7.toString());
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("[prepare] all ctrInfo:", sb6.toString());
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.va
    public void w(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb jbVar) {
        java.lang.String str;
        if (jbVar == null || (str = jbVar.f65878xe8897e6) == null) {
            return;
        }
        this.f187538f.put(str, jbVar);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.va
    public java.util.Map x() {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f187537e;
        java.util.Enumeration keys = concurrentHashMap.keys();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(keys, "keys(...)");
        java.util.ArrayList list = java.util.Collections.list(keys);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(list, "list(...)");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f187536d, "removeAllCtrlInfo list:" + list);
        java.util.HashMap hashMap = new java.util.HashMap(concurrentHashMap);
        concurrentHashMap.clear();
        return hashMap;
    }

    public final java.util.HashSet y(java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb jbVar, boolean z17) {
        java.util.HashSet hashSet = new java.util.HashSet();
        for (java.lang.String str2 : jbVar.J0()) {
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f187537e;
            java.util.List list = (java.util.List) concurrentHashMap.get(str2);
            if (list == null) {
                list = java.util.Collections.synchronizedList(new java.util.LinkedList());
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(list);
                concurrentHashMap.put(str2, list);
            }
            if (jbVar.z0(str)) {
                pm0.v.G(list, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.m8(jbVar));
                list.add(jbVar);
                kz5.g0.t(list, mz5.a.a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.n8.f187260d, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.o8.f187283d));
                hashSet.add(str2);
            }
        }
        if (z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb.o1(jbVar, this.f187534b, false, 2, null);
        }
        return hashSet;
    }

    public final java.util.HashMap z(int i17, yz5.l lVar, java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f187536d, "getCtrlInfoMap type:" + i17 + " username=" + str);
        java.util.HashMap hashMap = new java.util.HashMap();
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f187537e;
        synchronized (concurrentHashMap) {
            for (java.util.Map.Entry entry : concurrentHashMap.entrySet()) {
                java.lang.String str2 = (java.lang.String) entry.getKey();
                java.lang.Iterable<com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb> iterable = (java.lang.Iterable) entry.getValue();
                synchronized (iterable) {
                    for (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb jbVar : iterable) {
                        if (jbVar.F0(str) && (jbVar.f65874xb5f7102a.f470020e == i17 || i17 == Integer.MIN_VALUE)) {
                            if (((java.lang.Boolean) lVar.mo146xb9724478(jbVar)).booleanValue()) {
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

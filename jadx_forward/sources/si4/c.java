package si4;

/* loaded from: classes11.dex */
public final class c implements si4.a {

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.Set f489849c;

    /* renamed from: a, reason: collision with root package name */
    public final si4.a f489850a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.ArrayList f489851b = new java.util.ArrayList();

    static {
        java.util.concurrent.ConcurrentHashMap.KeySetView newKeySet = java.util.concurrent.ConcurrentHashMap.newKeySet();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(newKeySet, "newKeySet(...)");
        f489849c = newKeySet;
    }

    public c(si4.a aVar) {
        this.f489850a = aVar;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.StatusInfoAffStorage", "init: ");
    }

    public static java.util.List A(si4.c cVar, java.util.List list, boolean z17, int i17, java.lang.Object obj) {
        if ((i17 & 2) != 0) {
            di4.i iVar = di4.i.f314315a;
            z17 = false;
        }
        cVar.getClass();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.HashMap hashMap = new java.util.HashMap();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            bw5.sm0 sm0Var = (bw5.sm0) it.next();
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(sm0Var.m12979xca73e223())) {
                if (!(sm0Var.f114587g + ((long) com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26672xc5b068cb.f56198x1c9ff21c) < c01.id.c())) {
                    if (z17) {
                        arrayList.add(sm0Var);
                    } else {
                        java.lang.String e17 = sm0Var.e();
                        bw5.sm0 sm0Var2 = (bw5.sm0) hashMap.get(e17);
                        if (sm0Var2 == null) {
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(e17);
                            hashMap.put(e17, sm0Var);
                        } else if (sm0Var.f114587g >= sm0Var2.f114587g) {
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(e17);
                            hashMap.put(e17, sm0Var);
                        }
                    }
                }
            }
        }
        if (!z17) {
            java.util.Iterator it6 = hashMap.values().iterator();
            while (it6.hasNext()) {
                arrayList.add((bw5.sm0) it6.next());
            }
        }
        return arrayList;
    }

    public static /* synthetic */ void z(si4.c cVar, int i17, java.lang.String str, java.lang.String str2, int i18, java.lang.Object obj) {
        if ((i18 & 4) != 0) {
            str2 = bk4.k1.a();
        }
        cVar.y(i17, str, str2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0034, code lost:
    
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_text_status_read_report_and, 1) == 1) goto L24;
     */
    @Override // si4.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(java.lang.String r8, java.lang.String r9) {
        /*
            Method dump skipped, instructions count: 288
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: si4.c.a(java.lang.String, java.lang.String):void");
    }

    @Override // si4.a
    public mj4.h b(java.lang.String str) {
        if (!(str == null || str.length() == 0)) {
            return qi4.v.f445321a.d(str);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.StatusInfoAffStorage", "getLatestStatusByUserName: failed");
        return null;
    }

    @Override // si4.a
    public boolean c(java.lang.String userName, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userName, "userName");
        if ((userName.length() == 0) || i17 <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.StatusInfoAffStorage", "deleteByCreateTime: failed, " + userName + ", " + i17);
            return false;
        }
        si4.a aVar = this.f489850a;
        java.lang.Boolean valueOf = aVar != null ? java.lang.Boolean.valueOf(aVar.c(userName, i17)) : null;
        bw5.um0 m117490x103247b8 = com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27545x8281b564.m117475x9cf0d20b().m117490x103247b8(userName, 0, -1, 0L);
        java.util.LinkedList linkedList = m117490x103247b8.f115520g;
        java.util.Iterator it = linkedList.iterator();
        java.lang.String str = "";
        while (it.hasNext()) {
            bw5.sm0 sm0Var = (bw5.sm0) it.next();
            long j17 = sm0Var.f114587g;
            sm0Var.e();
            sm0Var.m12979xca73e223();
            long j18 = sm0Var.f114587g;
            qi4.p pVar = qi4.p.f445309a;
            if (j18 < i17 * 1000) {
                bw5.um0 m117479x7b98302c = com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27545x8281b564.m117475x9cf0d20b().m117479x7b98302c(sm0Var.m12979xca73e223(), -1);
                if ((m117479x7b98302c != null ? m117479x7b98302c.f115517d : false) && (str = sm0Var.m12979xca73e223()) == null) {
                    str = "";
                }
                qi4.v vVar = qi4.v.f445321a;
                java.lang.String e17 = sm0Var.e();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(e17, "getUserName(...)");
                vVar.a(e17, sm0Var.m12979xca73e223());
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.StatusInfoAffStorage", "[deleteByCreateTime] statusId = " + sm0Var.m12979xca73e223() + ", affResult = " + java.lang.Boolean.valueOf(m117490x103247b8.f115517d));
            }
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c("MicroMsg.TextStatus.StatusInfoAffStorage", "[deleteByCreateTime] userName = " + userName + ", createTimeLimit = " + i17 + ", uncheck size = " + linkedList.size() + ", oldResult = " + valueOf + ", affResult = " + java.lang.Boolean.valueOf(m117490x103247b8.f115517d), new java.lang.Object[0]);
        boolean z17 = m117490x103247b8.f115517d;
        if (!r26.n0.N(str)) {
            z(this, 5, str, null, 4, null);
        }
        return z17;
    }

    @Override // qi4.a
    public void d(qi4.b observer) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(observer, "observer");
        java.util.ArrayList arrayList = this.f489851b;
        arrayList.add(observer);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[observe] stack = ");
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        sb6.append(new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
        sb6.append(", this = ");
        sb6.append(this);
        sb6.append(", observers size = ");
        sb6.append(arrayList.size());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.StatusInfoAffStorage", sb6.toString());
    }

    @Override // si4.a
    public int e() {
        return 1;
    }

    @Override // si4.a
    public java.util.List f(java.lang.String str, java.lang.String str2, boolean z17) {
        qi4.v vVar = qi4.v.f445321a;
        ((ku5.t0) ku5.t0.f394148d).q(qi4.t.f445320d);
        java.util.HashMap hashMap = new java.util.HashMap();
        synchronized (vVar) {
            hashMap.putAll(qi4.v.f445322b);
        }
        java.util.HashMap hashMap2 = new java.util.HashMap();
        for (java.util.Map.Entry entry : hashMap.entrySet()) {
            mj4.k kVar = (mj4.k) ((mj4.h) entry.getValue());
            java.lang.String c17 = kVar.c();
            if (c17 == null) {
                c17 = "";
            }
            if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str2, kVar.o()) && (!z17 || !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, kVar.h()))) {
                if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, kVar.c()) && !kVar.w()) {
                    ai4.e eVar = (ai4.e) hashMap2.get(c17);
                    if (eVar == null) {
                        java.util.LinkedList linkedList = new java.util.LinkedList();
                        linkedList.add(kVar);
                        hashMap2.put(c17, new ai4.e(c17, linkedList));
                    } else {
                        eVar.f86668b.add(kVar);
                    }
                }
            }
        }
        for (ai4.e eVar2 : hashMap2.values()) {
            java.util.List F0 = kz5.n0.F0(eVar2.f86668b, new qi4.s());
            eVar2.f86668b.clear();
            eVar2.f86668b.addAll(F0);
        }
        java.util.LinkedList linkedList2 = new java.util.LinkedList(kz5.n0.F0(hashMap2.values(), new qi4.r()));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("StatusJVMCacheStorage", "[getSameTopicInfos] status topic size = " + hashMap2.keySet().size());
        return linkedList2;
    }

    @Override // si4.a
    public java.util.List h(java.lang.String str, java.util.ArrayList arrayList) {
        if (str == null) {
            return kz5.p0.f395529d;
        }
        qi4.v vVar = qi4.v.f445321a;
        ((ku5.t0) ku5.t0.f394148d).q(qi4.t.f445320d);
        java.util.HashSet hashSet = new java.util.HashSet();
        if (arrayList != null) {
            hashSet.addAll(arrayList);
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        synchronized (vVar) {
            hashMap.putAll(qi4.v.f445322b);
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.util.Map.Entry entry : hashMap.entrySet()) {
            mj4.h hVar = (mj4.h) entry.getValue();
            if (!vVar.c(hVar)) {
                mj4.k kVar = (mj4.k) hVar;
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, kVar.h()) && !hashSet.contains(kVar.o())) {
                    arrayList2.add(kVar);
                }
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("StatusJVMCacheStorage", "[getByIconId] iconId=" + str + ", final statusInfos size = " + arrayList2.size() + ", excludeUserNames=" + arrayList);
        return arrayList2;
    }

    @Override // si4.a
    public mj4.h i(java.lang.String str, int i17) {
        java.lang.Object obj;
        if (str == null || str.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.StatusInfoAffStorage", "getLatestStatusByUserName: failed");
            return null;
        }
        java.util.LinkedList linkedList = com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27545x8281b564.m117475x9cf0d20b().m117490x103247b8(str, 0, -1, c01.id.c() - com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26672xc5b068cb.f56198x1c9ff21c).f115520g;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(linkedList, "getInfo(...)");
        java.util.Iterator it = A(this, linkedList, false, 2, null).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            long j17 = ((bw5.sm0) obj).f114587g;
            qi4.p pVar = qi4.p.f445309a;
            if (j17 == ((long) i17) * 1000) {
                break;
            }
        }
        bw5.sm0 sm0Var = (bw5.sm0) obj;
        if (sm0Var == null) {
            return null;
        }
        return ai4.f.e(ai4.f.f86672a, sm0Var, null, 2, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    @Override // si4.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void j(java.lang.String r11, java.lang.String r12, boolean r13) {
        /*
            Method dump skipped, instructions count: 291
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: si4.c.j(java.lang.String, java.lang.String, boolean):void");
    }

    @Override // si4.a
    public boolean l(mj4.h item, boolean z17) {
        mj4.h hVar;
        boolean z18;
        java.util.Iterator it;
        mj4.h hVar2;
        boolean r17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        bw5.sm0 h17 = ai4.f.f86672a.h(item);
        if (this.f489850a != null) {
            mj4.h x17 = x(item);
            if (x17 == null) {
                r17 = si4.a.m(this.f489850a, item, false, 2, null);
            } else {
                mj4.j jVar = new mj4.j((mj4.k) item);
                jVar.f408599b.put("systemRowid", java.lang.Long.valueOf(((mj4.k) x17).f408600b.f72763xa3c65b86));
                r17 = si4.a.r(this.f489850a, jVar.a(), false, 2, null);
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("update: oldItem exist= ");
            sb6.append(x17 != null);
            sb6.append(", oldResult = ");
            sb6.append(r17);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.StatusInfoAffStorage", sb6.toString());
        }
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(h17.e(), bk4.k1.a()) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(h17.m12979xca73e223())) {
            hVar = item;
        } else {
            java.lang.String e17 = h17.e();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(e17, "getUserName(...)");
            long j17 = h17.f114587g;
            if ((e17.length() == 0) || j17 <= 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.StatusInfoAffStorage", "deleteTempStatusInfo: failed, " + e17 + ", " + j17);
                z18 = false;
            } else {
                long j18 = j17;
                java.util.Iterator it6 = com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27545x8281b564.m117475x9cf0d20b().m117490x103247b8(e17, 0, -1, j17).f115520g.iterator();
                z18 = false;
                while (it6.hasNext()) {
                    bw5.sm0 sm0Var = (bw5.sm0) it6.next();
                    sm0Var.e();
                    sm0Var.m12979xca73e223();
                    sm0Var.m12978x1deb2e6a();
                    long j19 = j18;
                    if (sm0Var.f114587g == j19 && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(sm0Var.e(), e17)) {
                        z18 = com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27545x8281b564.m117475x9cf0d20b().m117481x3068513f(e17, j19, -1).f115517d;
                        qi4.v vVar = qi4.v.f445321a;
                        java.lang.String e18 = sm0Var.e();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(e18, "getUserName(...)");
                        long j27 = sm0Var.f114587g;
                        vVar.b();
                        synchronized (vVar) {
                            it = it6;
                            java.util.concurrent.ConcurrentHashMap concurrentHashMap = qi4.v.f445322b;
                            if (concurrentHashMap.containsKey(e18)) {
                                mj4.h hVar3 = (mj4.h) concurrentHashMap.get(e18);
                                java.lang.String l17 = hVar3 != null ? ((mj4.k) hVar3).l() : null;
                                java.lang.String str = e18 + '_' + j27;
                                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(l17, str)) {
                                    concurrentHashMap.remove(e18);
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("StatusJVMCacheStorage", "[deleteTempStatusInfo] success, userName: ".concat(e18));
                                    bw5.um0 m117490x103247b8 = com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27545x8281b564.m117475x9cf0d20b().m117490x103247b8(e18, 0, 1, c01.id.c() - com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26672xc5b068cb.f56198x1c9ff21c);
                                    if (m117490x103247b8 == null || !m117490x103247b8.f115517d || m117490x103247b8.f115520g.size() <= 0) {
                                        hVar2 = null;
                                    } else {
                                        ai4.f fVar = ai4.f.f86672a;
                                        java.lang.Object obj = m117490x103247b8.f115520g.get(0);
                                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
                                        hVar2 = ai4.f.e(fVar, (bw5.sm0) obj, null, 2, null);
                                    }
                                    if (hVar2 != null) {
                                        synchronized (vVar) {
                                            concurrentHashMap.put(e18, hVar2);
                                        }
                                        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("[deleteTempStatusInfo] update, userName=");
                                        sb7.append(e18);
                                        sb7.append(" statusId:");
                                        mj4.k kVar = (mj4.k) hVar2;
                                        sb7.append(kVar.o());
                                        sb7.append(" createTime: ");
                                        sb7.append(kVar.f408600b.f76512x81959a6e);
                                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("StatusJVMCacheStorage", sb7.toString());
                                    }
                                } else {
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("StatusJVMCacheStorage", "[deleteTempStatusInfo] abort, userName: " + e18 + ", cacheStatusId: " + l17 + " not match tempStatusId: " + str);
                                }
                            } else {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("StatusJVMCacheStorage", "[deleteTempStatusInfo] abort, userName not exist in cache");
                            }
                        }
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.StatusInfoAffStorage", "[deleteTempStatusInfo] " + z18 + ", statusId = " + sm0Var.m12979xca73e223() + ", " + j19 + ',');
                    } else {
                        it = it6;
                    }
                    j18 = j19;
                    it6 = it;
                }
            }
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder("[update]: deleteTemp success=");
            sb8.append(z18);
            sb8.append(", statusId=, iconId=");
            sb8.append(h17.m12978x1deb2e6a());
            sb8.append(", ");
            hVar = item;
            sb8.append(((mj4.k) hVar).f408600b.f76512x81959a6e);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.StatusInfoAffStorage", sb8.toString());
        }
        bw5.um0 f17 = qi4.v.f445321a.f(h17, hVar);
        if (z17) {
            java.lang.String e19 = h17.e();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(e19, "getUserName(...)");
            c(e19, ((mj4.k) hVar).f408600b.f76512x81959a6e);
        }
        if (f17 == null) {
            return false;
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c("MicroMsg.TextStatus.StatusInfoAffStorage", "[update] user = " + h17.e() + ", statusId = " + h17.m12979xca73e223() + ", needDeleteExistData=" + z17 + ", affResult = " + java.lang.Boolean.valueOf(f17.f115517d), new java.lang.Object[0]);
        boolean z19 = f17.f115517d;
        if (z19) {
            ai4.m mVar = ai4.m.f86700a;
            java.lang.String m12979xca73e223 = h17.m12979xca73e223();
            if (m12979xca73e223 == null) {
                m12979xca73e223 = "";
            }
            java.lang.String str2 = m12979xca73e223;
            java.lang.String e27 = h17.e();
            if (e27 == null) {
                e27 = "";
            }
            mVar.b(3, str2, e27, h17.f114587g);
            java.lang.String m12979xca73e2232 = h17.m12979xca73e223();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m12979xca73e2232, "getStatusId(...)");
            z(this, 3, m12979xca73e2232, null, 4, null);
        }
        return z19;
    }

    @Override // si4.a
    public boolean n(java.lang.String userName) {
        mj4.h hVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userName, "userName");
        if (userName.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.StatusInfoAffStorage", "deleteByUserName: failed");
            return false;
        }
        si4.a aVar = this.f489850a;
        java.lang.Boolean valueOf = aVar != null ? java.lang.Boolean.valueOf(aVar.n(userName)) : null;
        bw5.um0 m117480x57255b27 = com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27545x8281b564.m117475x9cf0d20b().m117480x57255b27(userName, 0);
        qi4.v vVar = qi4.v.f445321a;
        vVar.b();
        synchronized (vVar) {
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = qi4.v.f445322b;
            if (concurrentHashMap.containsKey(userName)) {
                concurrentHashMap.remove(userName);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("StatusJVMCacheStorage", "[deleteStatusInfoWithUserName] success, userName: ".concat(userName));
                bw5.um0 m117490x103247b8 = com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27545x8281b564.m117475x9cf0d20b().m117490x103247b8(userName, 0, 1, c01.id.c() - com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26672xc5b068cb.f56198x1c9ff21c);
                if (m117490x103247b8 == null || !m117490x103247b8.f115517d || m117490x103247b8.f115520g.size() <= 0) {
                    hVar = null;
                } else {
                    ai4.f fVar = ai4.f.f86672a;
                    java.lang.Object obj = m117490x103247b8.f115520g.get(0);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
                    hVar = ai4.f.e(fVar, (bw5.sm0) obj, null, 2, null);
                }
                if (hVar != null) {
                    synchronized (vVar) {
                        concurrentHashMap.put(userName, hVar);
                    }
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[deleteStatusInfoWithUserName] update, userName=");
                    sb6.append(userName);
                    sb6.append(" statusId:");
                    mj4.k kVar = (mj4.k) hVar;
                    sb6.append(kVar.o());
                    sb6.append(" createTime: ");
                    sb6.append(kVar.f408600b.f76512x81959a6e);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("StatusJVMCacheStorage", sb6.toString());
                }
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("StatusJVMCacheStorage", "[deleteStatusInfoWithUserName] abort, userName not exist in cache");
            }
        }
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("[deleteByUserName] userName = ");
        sb7.append(userName);
        sb7.append(", oldResult = ");
        sb7.append(valueOf);
        sb7.append(", affResult = ");
        sb7.append(m117480x57255b27 != null ? java.lang.Boolean.valueOf(m117480x57255b27.f115517d) : null);
        sb7.append(' ');
        com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c("MicroMsg.TextStatus.StatusInfoAffStorage", sb7.toString(), new java.lang.Object[0]);
        boolean z17 = m117480x57255b27.f115517d;
        z(this, 5, "", null, 4, null);
        return z17;
    }

    @Override // si4.a
    public int o(java.lang.String str) {
        int size;
        synchronized (qi4.v.f445321a) {
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = qi4.v.f445322b;
            size = concurrentHashMap.size();
            if (str != null) {
                if (concurrentHashMap.containsKey(str)) {
                    size--;
                }
            }
        }
        if (size < 0) {
            size = 0;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("StatusJVMCacheStorage", "[getStatusTotalNum] statusInfos size = " + size);
        return size;
    }

    @Override // si4.a
    public boolean p(mj4.h item, boolean z17) {
        java.util.LinkedList linkedList;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        bw5.sm0 h17 = ai4.f.f86672a.h(item);
        mj4.k kVar = (mj4.k) item;
        java.lang.String o17 = kVar.o();
        boolean equals = o17.equals(bk4.k1.a());
        if (equals && z17) {
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27545x8281b564.m117475x9cf0d20b().m117480x57255b27(bk4.k1.a(), h17.f114592o);
        }
        bw5.sm0 sm0Var = null;
        si4.a aVar = this.f489850a;
        java.lang.Boolean valueOf = aVar != null ? java.lang.Boolean.valueOf(si4.a.m(aVar, item, false, 2, null)) : null;
        bw5.um0 f17 = qi4.v.f445321a.f(h17, item);
        if (f17 == null) {
            return false;
        }
        if (z17) {
            java.lang.String e17 = h17.e();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(e17, "getUserName(...)");
            c(e17, kVar.f408600b.f76512x81959a6e);
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c("MicroMsg.TextStatus.StatusInfoAffStorage", "[insert] username = " + h17.e() + ", iconId = " + h17.m12978x1deb2e6a() + ", statusId = " + h17.m12979xca73e223() + ", topicId = " + h17.m12980xf9e58274() + ", createTimeMs = " + h17.f114587g + ", needDeleteExistData=" + z17 + ", oldResult = " + valueOf + ", affResult = " + java.lang.Boolean.valueOf(f17.f115517d), new java.lang.Object[0]);
        boolean z18 = f17.f115517d;
        if (z18) {
            if (equals && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(h17.m12979xca73e223(), "")) {
                bw5.um0 m117490x103247b8 = com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27545x8281b564.m117475x9cf0d20b().m117490x103247b8(o17, 0, 1, -1L);
                if (m117490x103247b8 != null && (linkedList = m117490x103247b8.f115520g) != null) {
                    sm0Var = (bw5.sm0) kz5.n0.a0(linkedList, 0);
                }
                if (sm0Var != null) {
                    ai4.m mVar = ai4.m.f86700a;
                    java.lang.String m12979xca73e223 = sm0Var.m12979xca73e223();
                    java.lang.String str = m12979xca73e223 == null ? "" : m12979xca73e223;
                    java.lang.String e18 = sm0Var.e();
                    mVar.b(2, str, e18 == null ? "" : e18, sm0Var.f114587g);
                    java.lang.String m12979xca73e2232 = sm0Var.m12979xca73e223();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m12979xca73e2232, "getStatusId(...)");
                    z(this, 2, m12979xca73e2232, null, 4, null);
                }
            } else {
                ai4.m mVar2 = ai4.m.f86700a;
                java.lang.String m12979xca73e2233 = h17.m12979xca73e223();
                java.lang.String str2 = m12979xca73e2233 == null ? "" : m12979xca73e2233;
                java.lang.String e19 = h17.e();
                mVar2.b(2, str2, e19 == null ? "" : e19, h17.f114587g);
                java.lang.String m12979xca73e2234 = h17.m12979xca73e223();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m12979xca73e2234, "getStatusId(...)");
                z(this, 2, m12979xca73e2234, null, 4, null);
            }
        }
        return z18;
    }

    @Override // si4.a
    public java.util.List q(java.lang.String userName) {
        if (userName == null || userName.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.StatusInfoAffStorage", "getAllStatusByUserName: failed");
            return kz5.p0.f395529d;
        }
        qi4.v vVar = qi4.v.f445321a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userName, "userName");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        mj4.h d17 = vVar.d(userName);
        if (d17 != null) {
            arrayList.add(d17);
        }
        return arrayList;
    }

    @Override // si4.a
    public boolean s(mj4.h item) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        bw5.sm0 h17 = ai4.f.f86672a.h(item);
        mj4.h x17 = x(item);
        si4.a aVar = this.f489850a;
        java.lang.Boolean bool = null;
        if (x17 != null) {
            long j17 = ((mj4.k) x17).f408600b.f72763xa3c65b86;
            mj4.j jVar = new mj4.j((mj4.k) item);
            jVar.f408599b.put("systemRowid", java.lang.Long.valueOf(j17));
            mj4.h a17 = jVar.a();
            if (aVar != null) {
                bool = java.lang.Boolean.valueOf(aVar.s(a17));
            }
        } else if (aVar != null) {
            bool = java.lang.Boolean.valueOf(si4.a.m(aVar, item, false, 2, null));
        }
        bw5.um0 f17 = qi4.v.f445321a.f(h17, item);
        if (f17 == null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[replace error] iconId = ");
            sb6.append(h17.m12978x1deb2e6a());
            sb6.append(", statusId = ");
            sb6.append(h17.m12979xca73e223());
            sb6.append(", topicId = ");
            sb6.append(h17.m12980xf9e58274());
            sb6.append(", oldItem exist = ");
            sb6.append(x17 != null);
            sb6.append(", oldResult = ");
            sb6.append(bool);
            sb6.append(", affResult = null");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.TextStatus.StatusInfoAffStorage", sb6.toString());
            return false;
        }
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("[replace] iconId = ");
        sb7.append(h17.m12978x1deb2e6a());
        sb7.append(", statusId = ");
        sb7.append(h17.m12979xca73e223());
        sb7.append(", topicId = ");
        sb7.append(h17.m12980xf9e58274());
        sb7.append(", oldItem exist = ");
        sb7.append(x17 != null);
        sb7.append(", oldResult = ");
        sb7.append(bool);
        sb7.append(", affResult = ");
        sb7.append(java.lang.Boolean.valueOf(f17.f115517d));
        com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c("MicroMsg.TextStatus.StatusInfoAffStorage", sb7.toString(), new java.lang.Object[0]);
        boolean z17 = f17.f115517d;
        if (z17) {
            ai4.m mVar = ai4.m.f86700a;
            java.lang.String m12979xca73e223 = h17.m12979xca73e223();
            if (m12979xca73e223 == null) {
                m12979xca73e223 = "";
            }
            java.lang.String e17 = h17.e();
            mVar.b(3, m12979xca73e223, e17 != null ? e17 : "", h17.f114587g);
            java.lang.String m12979xca73e2232 = h17.m12979xca73e223();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m12979xca73e2232, "getStatusId(...)");
            z(this, 4, m12979xca73e2232, null, 4, null);
        }
        return z17;
    }

    @Override // si4.a
    public mj4.h t(java.lang.String statusId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(statusId, "statusId");
        java.util.LinkedList linkedList = com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27545x8281b564.m117475x9cf0d20b().m117489x9b21d7d(statusId).f115520g;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(linkedList, "getInfo(...)");
        java.util.List A = A(this, linkedList, false, 2, null);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[getByStatusId] ");
        sb6.append(statusId);
        sb6.append(", size = ");
        java.util.ArrayList arrayList = (java.util.ArrayList) A;
        sb6.append(arrayList.size());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.StatusInfoAffStorage", sb6.toString());
        if (!(!A.isEmpty())) {
            return null;
        }
        return ai4.f.e(ai4.f.f86672a, (bw5.sm0) arrayList.get(0), null, 2, null);
    }

    @Override // si4.a
    public boolean u(java.lang.String userName, java.lang.String statusId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userName, "userName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(statusId, "statusId");
        if (userName.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.StatusInfoAffStorage", "deleteByStatusId: failed, ".concat(statusId));
            return false;
        }
        si4.a aVar = this.f489850a;
        java.lang.Boolean valueOf = aVar != null ? java.lang.Boolean.valueOf(aVar.u(userName, statusId)) : null;
        bw5.um0 m117479x7b98302c = com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27545x8281b564.m117475x9cf0d20b().m117479x7b98302c(statusId, 0);
        qi4.v.f445321a.a(userName, statusId);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[deleteByStatusId] statusId = ");
        sb6.append(statusId);
        sb6.append(", oldResult = ");
        sb6.append(valueOf);
        sb6.append(", affResult = ");
        sb6.append(m117479x7b98302c != null ? java.lang.Boolean.valueOf(m117479x7b98302c.f115517d) : null);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c("MicroMsg.TextStatus.StatusInfoAffStorage", sb6.toString(), new java.lang.Object[0]);
        boolean z17 = m117479x7b98302c.f115517d;
        if (z17) {
            ai4.m.f86700a.b(5, statusId, userName, 0L);
        }
        z(this, 5, statusId, null, 4, null);
        return z17;
    }

    @Override // si4.a
    public boolean v() {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap;
        qi4.v vVar = qi4.v.f445321a;
        java.util.HashMap hashMap = new java.util.HashMap();
        synchronized (vVar) {
            concurrentHashMap = qi4.v.f445322b;
            hashMap.putAll(concurrentHashMap);
        }
        for (java.util.Map.Entry entry : concurrentHashMap.entrySet()) {
            if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((mj4.k) ((mj4.h) entry.getValue())).o(), bk4.k1.a()) && !((mj4.k) ((mj4.h) entry.getValue())).z()) {
                return true;
            }
        }
        return false;
    }

    @Override // si4.a
    public java.util.List w(java.lang.String str, java.util.ArrayList arrayList) {
        if (str == null) {
            return kz5.p0.f395529d;
        }
        qi4.v vVar = qi4.v.f445321a;
        ((ku5.t0) ku5.t0.f394148d).q(qi4.t.f445320d);
        java.util.HashSet hashSet = new java.util.HashSet();
        if (arrayList != null) {
            hashSet.addAll(arrayList);
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        synchronized (vVar) {
            hashMap.putAll(qi4.v.f445322b);
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.util.Map.Entry entry : hashMap.entrySet()) {
            mj4.h hVar = (mj4.h) entry.getValue();
            if (!vVar.c(hVar)) {
                mj4.k kVar = (mj4.k) hVar;
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, kVar.c()) && !hashSet.contains(kVar.o())) {
                    arrayList2.add(kVar);
                }
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("StatusJVMCacheStorage", "[getByClusterId] iconId=" + str + ", final statusInfos size = " + arrayList2.size() + ", excludeUserNames=" + arrayList);
        return arrayList2;
    }

    public final mj4.h x(mj4.h newStatusItem) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(newStatusItem, "newStatusItem");
        si4.a aVar = this.f489850a;
        if (aVar == null) {
            return null;
        }
        mj4.k kVar = (mj4.k) newStatusItem;
        mj4.h t17 = kVar.y() ? null : aVar.t(kVar.l());
        return (t17 == null && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(kVar.o(), bk4.k1.a())) ? aVar.i(kVar.o(), kVar.f408600b.f76512x81959a6e) : t17;
    }

    public final void y(int i17, java.lang.String statusId, java.lang.String targetKey) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(statusId, "statusId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(targetKey, "targetKey");
        java.util.ArrayList arrayList = this.f489851b;
        if (arrayList.size() == 0) {
            return;
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c("MicroMsg.TextStatus.StatusInfoAffStorage", "notifyObserves observers size = " + arrayList.size() + ", eventId=" + i17 + ", targetKey=" + targetKey + ", statusId=" + statusId, new java.lang.Object[0]);
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((qi4.b) it.next()).L3(targetKey, i17, statusId);
        }
    }
}

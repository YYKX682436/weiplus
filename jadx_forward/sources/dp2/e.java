package dp2;

/* loaded from: classes2.dex */
public final class e {

    /* renamed from: b, reason: collision with root package name */
    public static boolean f323726b;

    /* renamed from: a, reason: collision with root package name */
    public static final dp2.e f323725a = new dp2.e();

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f323727c = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: d, reason: collision with root package name */
    public static long f323728d = java.lang.System.currentTimeMillis();

    /* renamed from: e, reason: collision with root package name */
    public static final jz5.g f323729e = jz5.h.b(dp2.d.f323724d);

    public static final java.lang.String a(dp2.e eVar, long j17, java.lang.String str) {
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) f323727c.get(eVar.f(j17, str));
        if (c19792x256d2725 == null) {
            return "";
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NearbyEnterTargetLiveRoomChecker", "getTargetLiveId return for hit cache.");
        r45.nw1 m76794xd0557130 = c19792x256d2725.m76794xd0557130();
        return java.lang.String.valueOf(m76794xd0557130 != null ? java.lang.Long.valueOf(m76794xd0557130.m75942xfb822ef2(0)) : null);
    }

    public static final void b(dp2.e eVar, long j17, com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725) {
        synchronized (eVar.e()) {
            java.util.LinkedList linkedList = (java.util.LinkedList) f323725a.e().remove(java.lang.Long.valueOf(j17));
            if (linkedList != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NearbyEnterTargetLiveRoomChecker", "invokeFinderObjectCallback " + j17 + " size:" + linkedList.size());
                java.util.Iterator it = linkedList.iterator();
                while (it.hasNext()) {
                    yz5.l lVar = (yz5.l) ((java.lang.ref.WeakReference) it.next()).get();
                    if (lVar != null) {
                        lVar.mo146xb9724478(c19792x256d2725);
                    } else {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NearbyEnterTargetLiveRoomChecker", "invokeFinderObjectCallback callback is null!");
                    }
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0575  */
    /* JADX WARN: Removed duplicated region for block: B:116:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0493  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x037b  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x035e  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0332  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0337  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0359  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0369  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0373  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x038e  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x03c2  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x03d4  */
    /* JADX WARN: Type inference failed for: r8v13, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v34 */
    /* JADX WARN: Type inference failed for: r8v35 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void d(dp2.e r40, android.app.Activity r41, int r42, long r43, java.lang.String r45, java.lang.String r46, java.lang.String r47, long r48, yz5.l r50, int r51, java.lang.Object r52) {
        /*
            Method dump skipped, instructions count: 1481
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dp2.e.d(dp2.e, android.app.Activity, int, long, java.lang.String, java.lang.String, java.lang.String, long, yz5.l, int, java.lang.Object):void");
    }

    public void c(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf, long j17, java.lang.String str, boolean z17, int i17, yz5.l lVar) {
        jz5.f0 f0Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 h17;
        java.lang.String str2 = str;
        if (j17 == -1 || j17 == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("NearbyEnterTargetLiveRoomChecker", "checkEnterTargetLiveRoom return for targetObjectId:" + j17);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NearbyEnterTargetLiveRoomChecker", "checkEnterTargetLiveRoom activity:" + abstractActivityC21394xb3d2c0cf + ", checkCache:" + z17 + ", targetObjectId:" + j17 + " targetObjectNonceId:" + str2);
        if (z17 && (h17 = bu2.j.f106067a.h(j17)) != null) {
            if (lVar != null) {
                lVar.mo146xb9724478(h17.getFeedObject());
                return;
            }
            return;
        }
        r45.qt2 qt2Var = new r45.qt2();
        qt2Var.set(7, java.lang.Integer.valueOf(i17));
        qt2Var.set(5, java.lang.Integer.valueOf(i17));
        if (str2 == null) {
            str2 = "";
        }
        java.lang.String str3 = str2;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("fetchTargetLiveRoomObject activity:");
        sb6.append(abstractActivityC21394xb3d2c0cf);
        sb6.append(", objectId:");
        sb6.append(j17);
        sb6.append(" objectNonceId:");
        sb6.append(str3);
        sb6.append(",onGetFinderObjectCallback is null:");
        sb6.append(lVar == null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NearbyEnterTargetLiveRoomChecker", sb6.toString());
        f323728d = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) f323727c.get(f(j17, str3));
        if (c19792x256d2725 != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NearbyEnterTargetLiveRoomChecker", "fetchTargetLiveRoomObject fetch time:" + (java.lang.System.currentTimeMillis() - f323728d));
            if (lVar != null) {
                lVar.mo146xb9724478(c19792x256d2725);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NearbyEnterTargetLiveRoomChecker", "fetchTargetLiveRoomObject return for hit cache.");
            return;
        }
        if (lVar != null) {
            synchronized (e()) {
                dp2.e eVar = f323725a;
                java.util.LinkedList linkedList = (java.util.LinkedList) eVar.e().get(java.lang.Long.valueOf(j17));
                if (linkedList != null) {
                    linkedList.add(new java.lang.ref.WeakReference(lVar));
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NearbyEnterTargetLiveRoomChecker", "setFinderObjectCallback add " + j17 + " onGetFinderObjectCallback size:" + linkedList.size());
                    f0Var = jz5.f0.f384359a;
                } else {
                    f0Var = null;
                }
                if (f0Var == null) {
                    java.util.HashMap e17 = eVar.e();
                    java.lang.Long valueOf = java.lang.Long.valueOf(j17);
                    java.util.LinkedList linkedList2 = new java.util.LinkedList();
                    linkedList2.add(new java.lang.ref.WeakReference(lVar));
                    e17.put(valueOf, linkedList2);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NearbyEnterTargetLiveRoomChecker", "setFinderObjectCallback put " + j17 + " onGetFinderObjectCallback");
                }
            }
        }
        if (f323726b) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NearbyEnterTargetLiveRoomChecker", "fetchTargetLiveRoomObject return for isFetchTargetFeed:" + f323726b + '.');
            return;
        }
        f323726b = true;
        pq5.g l17 = new db2.g4(j17, str3, 0, 2, "", true, null, null, 0L, null, false, false, null, qt2Var, 0, null, false, null, null, null, null, null, 0, 0, null, null, false, null, null, 536829888, null).l();
        if (abstractActivityC21394xb3d2c0cf != null) {
            l17.f(abstractActivityC21394xb3d2c0cf);
        }
        l17.h(new dp2.c(j17, str3));
    }

    public final java.util.HashMap e() {
        return (java.util.HashMap) ((jz5.n) f323729e).mo141623x754a37bb();
    }

    public final java.lang.String f(long j17, java.lang.String str) {
        return j17 + '-' + str;
    }

    public final r45.kd1 g() {
        r45.xs2 Q = ((c61.l7) i95.n0.c(c61.l7.class)).nk().Q("NearbyLiveTab");
        boolean z17 = Q != null;
        r45.kd1 kd1Var = new r45.kd1();
        if (Q != null) {
            kd1Var.set(0, java.lang.Long.valueOf(Q.m75942xfb822ef2(3)));
            kd1Var.set(1, Q.m75945x2fec8307(8));
            kd1Var.set(2, Q.m75934xbce7f2f(7));
            if (c92.g.f121271a.b()) {
                kd1Var.set(3, "FinderLiveEntrance");
            } else {
                kd1Var.set(3, "NearbyEntrance");
            }
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getRedDotInfo isEnterRequest=");
        sb6.append(z17);
        sb6.append(" tab_tips_path=");
        sb6.append(kd1Var.m75945x2fec8307(3));
        sb6.append("  tabTipsByPassInfo=");
        sb6.append(kd1Var.m75934xbce7f2f(2) != null);
        sb6.append(" objectId=");
        sb6.append(pm0.v.u(kd1Var.m75942xfb822ef2(0)));
        sb6.append(' ');
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NearbyEnterTargetLiveRoomChecker", sb6.toString());
        return kd1Var;
    }
}

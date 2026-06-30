package g52;

/* loaded from: classes15.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public e42.g0 f350427a;

    public d() {
        d52.d.a().f308064a.f308060a = new g52.c(this);
    }

    public static void d(g52.d dVar, r45.kd6 kd6Var) {
        java.lang.String str;
        dVar.getClass();
        r45.bn6 bn6Var = kd6Var.f460134d;
        if (bn6Var == null || android.text.TextUtils.isEmpty(bn6Var.f452433d)) {
            r45.b2 e17 = f52.c.b().e();
            if (e17 != null) {
                str = e17.f451967d.f452433d;
                h52.d dVar2 = (h52.d) h52.c.a().f360572a;
                r45.x1 a17 = dVar2.a();
                if (a17 == null) {
                    a17 = new r45.x1();
                }
                a17.f471165p = str;
                dVar2.b(a17);
            } else {
                str = null;
            }
        } else {
            str = kd6Var.f460134d.f452433d;
            h52.c a18 = h52.c.a();
            boolean z17 = kd6Var.f460136f;
            java.lang.String str2 = kd6Var.f460137g;
            h52.d dVar3 = (h52.d) a18.f360572a;
            r45.x1 a19 = dVar3.a();
            if (a19 == null) {
                a19 = new r45.x1();
            }
            if (!z17) {
                str2 = null;
            }
            if (str2 == null) {
                str2 = str.getClass().getCanonicalName();
            }
            a19.f471165p = str2;
            dVar3.b(a19);
        }
        h52.e.d(str, kd6Var.f460137g, 100);
        java.lang.String str3 = kd6Var.f460135e.f452433d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HABBYGE-MALI.AsyncActivityMonitor", "_startActivity, toActivity: %s, %s", str, str3);
        h52.e.d(str3, null, 101);
        java.lang.String str4 = kd6Var.f460139i;
        java.lang.String str5 = kd6Var.f460141n;
        java.lang.String str6 = kd6Var.f460140m;
        if (!android.text.TextUtils.isEmpty(str4)) {
            h52.b.b("Chat_User", str4);
        }
        if (java.lang.String.valueOf(1).equals(str6) && "jd_store".equals(str5)) {
            h52.b.b("minimize_secene", str6);
            h52.b.b("KPublisherId", str5);
        } else {
            h52.b.b("minimize_secene", "");
            h52.b.b("KPublisherId", "");
        }
        n(kd6Var.f460138h, str, kd6Var.f460137g, str3, 0, kd6Var.f460142o);
        h52.d dVar4 = (h52.d) h52.c.a().f360572a;
        r45.x1 a27 = dVar4.a();
        if (a27 == null) {
            a27 = new r45.x1();
        }
        a27.f471156d = true;
        a27.f471160h = str3 == null ? "" : str3;
        dVar4.b(a27);
        h52.d dVar5 = (h52.d) h52.c.a().f360572a;
        r45.x1 a28 = dVar5.a();
        if (a28 == null) {
            a28 = new r45.x1();
        }
        a28.f471158f = true;
        if (str == null) {
            str = "";
        }
        a28.f471162m = str;
        dVar5.b(a28);
        g52.a.b(0);
        if (str3 == null || dVar.f350427a == null) {
            return;
        }
        c52.c.d("hell_mmkv_fbm__", new byte[0]);
        v52.c g17 = v52.c.g();
        g17.getClass();
        if ("VideoActivity".equals(b52.b.g(str3))) {
            c62.g gVar = g17.f514839b;
            gVar.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HABBYGE-MALI.VoipFloatSession", "VoipFloatSession, startMonitor");
            xj0.a.h().l(gVar.f120992a, gVar.f120993b);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void e(g52.d r17, r45.bn6 r18) {
        /*
            Method dump skipped, instructions count: 332
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g52.d.e(g52.d, r45.bn6):void");
    }

    public static void f(g52.d dVar, r45.bn6 bn6Var) {
        dVar.getClass();
        h52.e.d(bn6Var.f452433d, null, 108);
        p(bn6Var.f452433d, bn6Var.f452434e, f52.a.DESTROY);
        if (dVar.f350427a != null) {
            java.lang.String str = bn6Var.f452433d;
            int i17 = bn6Var.f452434e;
            java.util.Map map = z52.a.f551772a;
            java.util.HashMap hashMap = (java.util.HashMap) map;
            if (!hashMap.isEmpty()) {
                if (i17 > 0) {
                    try {
                        ((java.util.HashMap) map).remove(java.lang.Integer.valueOf(i17));
                    } catch (java.lang.NumberFormatException e17) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("HABBYGE-MALI.HellPageParamsCatcher", e17, "HellPageParamsCatcher, onDestroy: %s", e17.getMessage());
                    }
                } else {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.util.Iterator it = hashMap.entrySet().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
                        if (entry != null) {
                            android.app.Activity activity = (android.app.Activity) ((java.lang.ref.WeakReference) entry.getValue()).get();
                            if (activity != null) {
                                java.lang.String canonicalName = activity.getClass().getCanonicalName();
                                if (canonicalName != null && canonicalName.equals(str)) {
                                    arrayList.add((java.lang.Integer) entry.getKey());
                                    break;
                                }
                            } else {
                                arrayList.add((java.lang.Integer) entry.getKey());
                            }
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        java.util.Iterator it6 = arrayList.iterator();
                        while (it6.hasNext()) {
                            hashMap.remove(java.lang.Integer.valueOf(((java.lang.Integer) it6.next()).intValue()));
                        }
                    }
                }
            }
            java.util.Map map2 = z52.c.f551774a;
            synchronized (z52.c.class) {
                java.util.Map map3 = z52.c.f551774a;
                if (!((java.util.HashMap) map3).isEmpty()) {
                    if (i17 > 0) {
                        try {
                            ((java.util.HashMap) map3).remove(java.lang.Integer.valueOf(i17));
                        } catch (java.lang.NumberFormatException e18) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("HABBYGE-MALI.HellSessionUBAParamsCatcher", e18, "HellSessionUBAParamsCatcher, onDestroy: %s", e18.getMessage());
                        }
                    } else {
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        java.util.Iterator it7 = ((java.util.HashMap) map3).entrySet().iterator();
                        while (true) {
                            if (!it7.hasNext()) {
                                break;
                            }
                            java.util.Map.Entry entry2 = (java.util.Map.Entry) it7.next();
                            if (entry2 != null) {
                                android.app.Activity activity2 = (android.app.Activity) ((java.lang.ref.WeakReference) entry2.getValue()).get();
                                if (activity2 != null) {
                                    java.lang.String canonicalName2 = activity2.getClass().getCanonicalName();
                                    if (canonicalName2 != null && canonicalName2.equals(str)) {
                                        arrayList2.add((java.lang.Integer) entry2.getKey());
                                        break;
                                    }
                                } else {
                                    arrayList2.add((java.lang.Integer) entry2.getKey());
                                }
                            }
                        }
                        if (!arrayList2.isEmpty()) {
                            java.util.Iterator it8 = arrayList2.iterator();
                            while (it8.hasNext()) {
                                ((java.util.HashMap) z52.c.f551774a).remove(java.lang.Integer.valueOf(((java.lang.Integer) it8.next()).intValue()));
                            }
                        }
                    }
                }
            }
            v52.c g17 = v52.c.g();
            g17.getClass();
            if ("VideoActivity".equals(b52.b.g(str))) {
                c62.g gVar = g17.f514839b;
                gVar.getClass();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HABBYGE-MALI.VoipFloatSession", "VoipFloatSession, stopMonitor");
                xj0.a.h().o(gVar.f120992a, gVar.f120993b);
            }
            if ("com.tencent.mm.plugin.scanner.ui.BaseScanUI".equals(str)) {
                d52.d.a().c(com.p314xaae8f345.p3006xb8ff1437.api.C26181xd678f817.f50628x98affc23);
            }
        }
    }

    public static void g(g52.d dVar, r45.bn6 bn6Var, boolean z17) {
        r45.bn6 bn6Var2;
        dVar.getClass();
        r45.bn6 l17 = l(bn6Var);
        if (l17 == null || android.text.TextUtils.isEmpty(l17.f452433d)) {
            return;
        }
        h52.e.d(l17.f452433d, null, 103);
        f52.f fVar = f52.c.b().f341163a.f341164a;
        fVar.getClass();
        r45.c2 a17 = f52.b.a();
        r45.b2 b2Var = new r45.b2();
        r45.bn6 bn6Var3 = new r45.bn6();
        b2Var.f451967d = bn6Var3;
        bn6Var3.f452433d = l17.f452433d;
        bn6Var3.f452434e = l17.f452434e;
        bn6Var3.f452435f = l17.f452435f;
        nm5.b c17 = f52.f.c(a17, b2Var);
        if (c17 != null) {
            r45.vk6 vk6Var = (r45.vk6) c17.a(0);
            int intValue = ((java.lang.Integer) c17.a(1)).intValue();
            if (z17 || f52.g.a(((r45.b2) vk6Var.f469860e.getFirst()).f451967d, b2Var.f451967d)) {
                java.util.LinkedList linkedList = a17.f452769d;
                if (intValue == linkedList.size() - 1) {
                    linkedList.remove(intValue);
                    linkedList.addFirst(vk6Var);
                    f52.b.b(a17);
                    if (fVar.f341165a != null) {
                        v52.c.g().j(null, b2Var, 3, fVar.b(a17));
                        e42.j0 j0Var = a52.f.f83120d;
                        if (j0Var != null && (bn6Var2 = b2Var.f451967d) != null) {
                            j0Var.f(bn6Var2.f452434e);
                        }
                    }
                }
            }
        }
        dVar.o(l17.f452433d, false);
        if (dVar.f350427a != null) {
            java.lang.String str = l17.f452433d;
            int i17 = l17.f452434e;
            long j17 = l17.f452435f;
            t52.a.f497242a.c(str, j17, t52.h.f497248e);
            j52.c c18 = j52.c.c();
            c18.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HABBYGE-MALI.StoryGalleryMonitor", "_finishMMFecordUI: %s", str);
            if ("com.tencent.mm.plugin.recordvideo.activity.MMRecordUI".equals(str)) {
                c18.d(1, j17);
            }
            v52.c.g().r(true, str, i17, j17);
            s52.b.f(103, str, i17, j17);
            p52.k.d(str);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00b2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void h(g52.d r8, r45.bn6 r9) {
        /*
            Method dump skipped, instructions count: 364
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g52.d.h(g52.d, r45.bn6):void");
    }

    public static void i(g52.d dVar, java.lang.String str, java.lang.String str2) {
        dVar.getClass();
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5803x94812b53 c5803x94812b53 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5803x94812b53();
        c5803x94812b53.f136112g.getClass();
        c5803x94812b53.e();
    }

    public static void j(g52.d dVar, r45.bn6 bn6Var) {
        dVar.getClass();
        h52.e.d(bn6Var.f452433d, null, 106);
        p(bn6Var.f452433d, bn6Var.f452434e, f52.a.PAUSE);
        if (dVar.f350427a != null) {
            s52.b.f(101, bn6Var.f452433d, bn6Var.f452434e, bn6Var.f452435f);
        }
    }

    public static void k(g52.d dVar, r45.bn6 bn6Var) {
        dVar.getClass();
        if ("com.tencent.mm.plugin.appbrand.launching.AppBrandLaunchProxyUI".equals(bn6Var.f452433d)) {
            return;
        }
        h52.e.d(bn6Var.f452433d, null, 107);
        p(bn6Var.f452433d, bn6Var.f452434e, f52.a.STOP);
        if (dVar.f350427a != null) {
            s52.b.f(102, bn6Var.f452433d, bn6Var.f452434e, bn6Var.f452435f);
        }
    }

    public static r45.bn6 l(r45.bn6 bn6Var) {
        nm5.b c17;
        if (bn6Var == null || android.text.TextUtils.isEmpty(bn6Var.f452433d)) {
            try {
                f52.c.b().getClass();
                r45.a2 a2Var = f52.b.a().f452770e;
                if (a2Var == null) {
                    c17 = nm5.j.c(null, null);
                } else {
                    r45.b2 b2Var = a2Var.f451182d;
                    if (b2Var == null) {
                        c17 = nm5.j.c(null, null);
                    } else {
                        r45.bn6 bn6Var2 = b2Var.f451967d;
                        c17 = nm5.j.c(bn6Var2.f452433d, java.lang.Integer.valueOf(bn6Var2.f452434e));
                    }
                }
                if (bn6Var == null) {
                    bn6Var = new r45.bn6();
                    bn6Var.f452435f = java.lang.System.currentTimeMillis();
                }
                bn6Var.f452433d = (java.lang.String) c17.a(0);
                bn6Var.f452434e = ((java.lang.Integer) c17.a(1)).intValue();
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("HABBYGE-MALI.AsyncActivityMonitor", e17, "getActivityOnFinish", new java.lang.Object[0]);
                return null;
            }
        }
        return bn6Var;
    }

    public static nm5.b m(android.app.Activity activity) {
        boolean z17;
        p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 d17 = i52.l.d(activity);
        java.lang.String canonicalName = d17 != null ? d17.getClass().getCanonicalName() : null;
        if (canonicalName == null) {
            canonicalName = activity.getClass().getCanonicalName();
            z17 = false;
        } else {
            z17 = true;
        }
        return nm5.j.c(canonicalName, java.lang.Boolean.valueOf(z17));
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x0301, code lost:
    
        if (r12 < r11) goto L162;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0304, code lost:
    
        r11 = r11 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0306, code lost:
    
        if (r11 < r12) goto L212;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0308, code lost:
    
        r14 = ((r45.vk6) r13.remove(r11)).f469860e.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0318, code lost:
    
        if (r14.hasNext() == false) goto L213;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x031a, code lost:
    
        r2 = (r45.b2) r14.next();
        r4 = r0.f341165a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0322, code lost:
    
        if (r4 == null) goto L216;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0324, code lost:
    
        r2.f451967d.f452435f = r3.f451967d.f452435f;
        ((a52.c) r4).a(r2, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x0164, code lost:
    
        if (r8 != false) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:216:0x01ff, code lost:
    
        if ((r8 & 524288) == 524288) goto L103;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void n(int r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, int r12, long r13) {
        /*
            Method dump skipped, instructions count: 963
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g52.d.n(int, java.lang.String, java.lang.String, java.lang.String, int, long):void");
    }

    public static void p(java.lang.String str, int i17, f52.a aVar) {
        f52.c.b().getClass();
        r45.c2 a17 = f52.b.a();
        if (a17.f452770e == null) {
            a17.f452770e = new r45.a2();
        }
        int ordinal = aVar.ordinal();
        if (ordinal == 0) {
            r45.a2 a2Var = a17.f452770e;
            if (a2Var.f451182d == null) {
                a2Var.f451182d = new r45.b2();
            }
            r45.b2 b2Var = a17.f452770e.f451182d;
            if (b2Var.f451967d == null) {
                b2Var.f451967d = new r45.bn6();
            }
            r45.b2 b2Var2 = a17.f452770e.f451182d;
            r45.bn6 bn6Var = b2Var2.f451967d;
            bn6Var.f452433d = str;
            bn6Var.f452434e = i17;
            b2Var2.f451969f = 0;
        } else if (ordinal == 1) {
            r45.a2 a2Var2 = a17.f452770e;
            if (a2Var2.f451183e == null) {
                a2Var2.f451183e = new r45.b2();
            }
            r45.b2 b2Var3 = a17.f452770e.f451183e;
            if (b2Var3.f451967d == null) {
                b2Var3.f451967d = new r45.bn6();
            }
            r45.b2 b2Var4 = a17.f452770e.f451183e;
            r45.bn6 bn6Var2 = b2Var4.f451967d;
            bn6Var2.f452433d = str;
            bn6Var2.f452434e = i17;
            b2Var4.f451969f = 1;
        } else if (ordinal == 2) {
            r45.a2 a2Var3 = a17.f452770e;
            if (a2Var3.f451184f == null) {
                a2Var3.f451184f = new r45.b2();
            }
            r45.b2 b2Var5 = a17.f452770e.f451184f;
            if (b2Var5.f451967d == null) {
                b2Var5.f451967d = new r45.bn6();
            }
            r45.b2 b2Var6 = a17.f452770e.f451184f;
            r45.bn6 bn6Var3 = b2Var6.f451967d;
            bn6Var3.f452433d = str;
            bn6Var3.f452434e = i17;
            b2Var6.f451969f = 2;
        } else if (ordinal == 3) {
            r45.a2 a2Var4 = a17.f452770e;
            if (a2Var4.f451185g == null) {
                a2Var4.f451185g = new r45.b2();
            }
            r45.b2 b2Var7 = a17.f452770e.f451185g;
            if (b2Var7.f451967d == null) {
                b2Var7.f451967d = new r45.bn6();
            }
            r45.b2 b2Var8 = a17.f452770e.f451185g;
            r45.bn6 bn6Var4 = b2Var8.f451967d;
            bn6Var4.f452433d = str;
            bn6Var4.f452434e = i17;
            b2Var8.f451969f = 3;
        }
        f52.b.b(a17);
    }

    public final r45.sy4 a(android.content.Intent intent, android.app.Activity activity) {
        r45.sy4 sy4Var = new r45.sy4();
        if (intent != null) {
            sy4Var.f467550e = intent.getFlags();
        }
        r45.bn6 bn6Var = new r45.bn6();
        sy4Var.f467549d = bn6Var;
        if (activity == null) {
            return sy4Var;
        }
        bn6Var.f452433d = activity.getClass().getCanonicalName();
        sy4Var.f467549d.f452434e = activity.hashCode();
        sy4Var.f467549d.f452435f = java.lang.System.currentTimeMillis();
        return sy4Var;
    }

    public final r45.uy4 b(android.app.Activity activity, long j17) {
        nm5.c d17;
        r45.uy4 uy4Var = new r45.uy4();
        r45.bn6 bn6Var = new r45.bn6();
        uy4Var.f469269d = bn6Var;
        bn6Var.f452433d = activity.getClass().getCanonicalName();
        uy4Var.f469269d.f452434e = activity.hashCode();
        uy4Var.f469269d.f452435f = j17;
        nm5.b m17 = m(activity);
        if (((java.lang.Boolean) m17.a(1)).booleanValue()) {
            d17 = nm5.j.d((java.lang.String) m17.a(0), (java.lang.Boolean) m17.a(1), java.lang.Boolean.valueOf(b52.b.k(activity.getClass().getCanonicalName())));
        } else {
            d17 = nm5.j.d((java.lang.String) m17.a(0), (java.lang.Boolean) m17.a(1), java.lang.Boolean.FALSE);
        }
        uy4Var.f469272g = (java.lang.String) d17.a(0);
        uy4Var.f469270e = ((java.lang.Boolean) d17.a(1)).booleanValue();
        uy4Var.f469271f = ((java.lang.Boolean) d17.a(2)).booleanValue();
        return uy4Var;
    }

    public final void c(int i17, r45.bn6 bn6Var) {
        h52.e.d(bn6Var.f452433d, null, 104);
        nm5.c c17 = h52.e.c(101);
        java.lang.String str = c17 != null ? (java.lang.String) c17.a(0) : null;
        if (!bn6Var.f452433d.equals(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("HABBYGE-MALI.AsyncActivityMonitor", "_onCreateEvent: %s, %s", str, bn6Var.f452433d);
            n(i17, null, null, bn6Var.f452433d, bn6Var.f452434e, bn6Var.f452435f);
        }
        p(bn6Var.f452433d, bn6Var.f452434e, f52.a.CREATE);
    }

    public final void o(java.lang.String str, boolean z17) {
        g52.a.b(1);
        if (!z17 && b52.b.k(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HABBYGE-MALI.AsyncActivityMonitor", "_quiteActivity come frome: moveActivityTaskToBack");
            return;
        }
        r45.b2 e17 = f52.c.b().e();
        java.lang.String str2 = e17 != null ? e17.f451967d.f452433d : null;
        h52.d dVar = (h52.d) h52.c.a().f360572a;
        r45.x1 a17 = dVar.a();
        if (a17 == null) {
            a17 = new r45.x1();
        }
        a17.f471159g = true;
        a17.f471163n = str == null ? "" : str;
        dVar.b(a17);
        h52.d dVar2 = (h52.d) h52.c.a().f360572a;
        r45.x1 a18 = dVar2.a();
        if (a18 == null) {
            a18 = new r45.x1();
        }
        a18.f471157e = true;
        a18.f471161i = str2 != null ? str2 : "";
        dVar2.b(a18);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HABBYGE-MALI.AsyncActivityMonitor", "setActivityActionOnFinish: from: %s, to: %s", str, str2);
    }
}

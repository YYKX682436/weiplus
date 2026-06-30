package h62;

@j95.b(m140513x1e06fd29 = {c42.l.class})
/* loaded from: classes15.dex */
public class d extends i95.w implements e42.e0 {

    /* renamed from: d, reason: collision with root package name */
    public final l62.d[] f360717d = {null};

    /* renamed from: e, reason: collision with root package name */
    public final l62.b[] f360718e = {null};

    /* renamed from: f, reason: collision with root package name */
    public final kk.j f360719f = new jt0.j(500);

    /* renamed from: g, reason: collision with root package name */
    public final kk.j f360720g = new jt0.j(1000);

    /* renamed from: h, reason: collision with root package name */
    public boolean f360721h = false;

    public static h62.d vj() {
        return (h62.d) i95.n0.c(h62.d.class);
    }

    public void Ai(java.util.List list, java.util.List list2, java.util.List list3) {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        if (list != null) {
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                j62.c cVar = (j62.c) it.next();
                if (cVar != null) {
                    if (cVar.f66064xab2ef376 == 10) {
                        vy4.n nVar = new vy4.n();
                        nVar.f523041a = cVar.f66062xf8fc5057;
                        nVar.f523043c = cVar.f66067x1bb3b54a;
                        nVar.f523044d = cVar.f66059x14c61803;
                        nVar.f523042b = cVar.f66063x268de0a3;
                        nVar.f523045e = cVar.E();
                        linkedList.add(nVar);
                    }
                }
            }
        }
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        if (list2 != null) {
            java.util.Iterator it6 = list2.iterator();
            while (it6.hasNext()) {
                r45.w8 w8Var = (r45.w8) it6.next();
                vy4.o oVar = new vy4.o();
                oVar.f523046a = w8Var.f470489d;
                oVar.f523047b = w8Var.f470490e;
                linkedList2.add(oVar);
            }
        }
        vy4.k kVar = (vy4.k) ((vy4.i) i95.n0.c(vy4.i.class));
        kVar.getClass();
        ((ku5.t0) ku5.t0.f394148d).h(new vy4.j(kVar, linkedList, linkedList2, list3), "cross_welab");
    }

    public final synchronized void Aj() {
        ((lt0.f) this.f360719f).mo143584x5a5b64d();
        ((lt0.f) this.f360720g).mo143584x5a5b64d();
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.ArrayList Bi() {
        /*
            r8 = this;
            l62.d r0 = r8.tj()
            r0.getClass()
            java.lang.String r1 = "select exptId from ExptItem ORDER BY exptId ASC"
            r2 = 0
            r3 = 0
            l75.k0 r0 = r0.f398301d     // Catch: java.lang.Throwable -> L3a java.lang.Exception -> L3c
            android.database.Cursor r0 = r0.B(r1, r3)     // Catch: java.lang.Throwable -> L3a java.lang.Exception -> L3c
            if (r0 == 0) goto L34
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Exception -> L2f java.lang.Throwable -> L57
            r1.<init>()     // Catch: java.lang.Exception -> L2f java.lang.Throwable -> L57
        L19:
            boolean r3 = r0.moveToNext()     // Catch: java.lang.Exception -> L2d java.lang.Throwable -> L57
            if (r3 == 0) goto L2b
            int r3 = r0.getInt(r2)     // Catch: java.lang.Exception -> L2d java.lang.Throwable -> L57
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Exception -> L2d java.lang.Throwable -> L57
            r1.add(r3)     // Catch: java.lang.Exception -> L2d java.lang.Throwable -> L57
            goto L19
        L2b:
            r3 = r1
            goto L34
        L2d:
            r3 = move-exception
            goto L40
        L2f:
            r1 = move-exception
            r7 = r3
            r3 = r1
            r1 = r7
            goto L40
        L34:
            if (r0 == 0) goto L56
            r0.close()
            goto L56
        L3a:
            r0 = move-exception
            goto L5a
        L3c:
            r0 = move-exception
            r1 = r3
            r3 = r0
            r0 = r1
        L40:
            java.lang.String r4 = "MicroMsg.ExptStorage"
            java.lang.String r5 = "get all expt id error[%s]"
            r6 = 1
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch: java.lang.Throwable -> L57
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L57
            r6[r2] = r3     // Catch: java.lang.Throwable -> L57
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r4, r5, r6)     // Catch: java.lang.Throwable -> L57
            if (r0 == 0) goto L55
            r0.close()
        L55:
            r3 = r1
        L56:
            return r3
        L57:
            r1 = move-exception
            r3 = r0
            r0 = r1
        L5a:
            if (r3 == 0) goto L5f
            r3.close()
        L5f:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: h62.d.Bi():java.util.ArrayList");
    }

    public final void Bj(int i17) {
        if (i17 <= 0) {
            i17 = 1;
        }
        kk.v vVar = new kk.v(gm0.j1.b().h());
        int abs = (int) java.lang.Math.abs(vVar.longValue() % i17);
        int i18 = (((int) com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1()) + (abs * 60)) - 86400;
        com.p314xaae8f345.mm.p2621x8fb0427b.n3 c17 = gm0.j1.u().c();
        com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_GET_EXPT_LAST_TIME_SEC_INT;
        int intValue = ((java.lang.Integer) c17.m(u3Var, 0)).intValue();
        int min = java.lang.Math.min(intValue, i18);
        gm0.j1.u().c().x(u3Var, java.lang.Integer.valueOf(min));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ExptService.Write", "reset get expt time tryGetTime[%d] uin[%d] hashTime[%d] needUpdateTime[%d] lastTime[%d] fixLastUpdateTime[%d]", java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(vVar.longValue()), java.lang.Integer.valueOf(abs), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(intValue), java.lang.Integer.valueOf(min));
    }

    public void Cj(boolean z17) {
        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_NEXT_GET_EXPT_APP_IS_INCREMENT_BOOLEAN, java.lang.Boolean.valueOf(z17));
        if (z17) {
            jx3.f.INSTANCE.mo68477x336bdfd8(863L, 168L, 1L, false);
        } else {
            jx3.f.INSTANCE.mo68477x336bdfd8(863L, 169L, 1L, false);
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c("MicroMsg.ExptService", "set next get exptapp isIncrement [%b]", java.lang.Boolean.valueOf(z17));
    }

    public float Di(e42.b0 b0Var, float f17) {
        java.lang.String Zi = Zi(b0Var, "", true);
        return com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(Zi) ? f17 : com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L(Zi, f17);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0047, code lost:
    
        if (r5 == 1) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Dj(j62.c r4, j62.a r5) {
        /*
            r3 = this;
            java.lang.String r0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a
            boolean r0 = z65.c.a()
            if (r0 == 0) goto L5f
            if (r4 == 0) goto Lf
            java.util.HashMap r0 = r4.E()
            goto L13
        Lf:
            java.util.HashMap r0 = r5.E()
        L13:
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = ""
            if (r4 == 0) goto L2c
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            int r4 = r4.f66062xf8fc5057
            r5.append(r4)
            r5.append(r2)
            java.lang.String r4 = r5.toString()
            goto L3d
        L2c:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            int r5 = r5.f379412d
            r4.append(r5)
            r4.append(r2)
            java.lang.String r4 = r4.toString()
        L3d:
            r5 = 0
            r1[r5] = r4
            r4 = 1
            if (r0 == 0) goto L4a
            int r5 = r0.size()
            if (r5 != r4) goto L4a
            goto L4b
        L4a:
            r0 = r2
        L4b:
            r1[r4] = r0
            java.lang.String r4 = "Receive expt : %s %s"
            java.lang.String r4 = java.lang.String.format(r4, r1)
            ku5.u0 r5 = ku5.t0.f394148d
            h62.a r0 = new h62.a
            r0.<init>(r3, r4)
            ku5.t0 r5 = (ku5.t0) r5
            r5.B(r0)
        L5f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h62.d.Dj(j62.c, j62.a):void");
    }

    public void Ej(android.content.Context context, android.content.Intent intent) {
        intent.setClass(context, com.tencent.mm.plugin.expt.ui.ExptAppDebugUI.class);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/expt/model/ExptService", "showExptAppUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/expt/model/ExptService", "showExptAppUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public void Fj(android.content.Context context, android.content.Intent intent) {
        intent.setClass(context, com.tencent.mm.plugin.expt.ui.ExptDebugUI.class);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/expt/model/ExptService", "showExptUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/expt/model/ExptService", "showExptUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public void Gj(int i17) {
        gm0.j1.d().g(new h62.l(i17));
    }

    public void Hj(int i17) {
        ((ku5.t0) ku5.t0.f394148d).h(new h62.c(this, i17), "get_expt_app");
    }

    /* JADX WARN: Code restructure failed: missing block: B:261:0x060b, code lost:
    
        if (r4 == null) goto L265;
     */
    /* JADX WARN: Code restructure failed: missing block: B:262:0x060d, code lost:
    
        r4.w(java.lang.Long.valueOf(r21));
     */
    /* JADX WARN: Code restructure failed: missing block: B:263:0x0614, code lost:
    
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ExptKeyMapIdStorage", "end update expt keymapid map size[%d] ret[%s] cost[%d]", java.lang.Integer.valueOf(r3.size()), java.lang.Integer.valueOf(r10), java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - r13));
     */
    /* JADX WARN: Code restructure failed: missing block: B:267:0x05ed, code lost:
    
        if (r4 != null) goto L264;
     */
    /* JADX WARN: Code restructure failed: missing block: B:300:0x0561, code lost:
    
        if (r4 == null) goto L234;
     */
    /* JADX WARN: Code restructure failed: missing block: B:301:0x0563, code lost:
    
        r4.w(java.lang.Long.valueOf(r34));
     */
    /* JADX WARN: Code restructure failed: missing block: B:302:0x056a, code lost:
    
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ExptKeyMapIdStorage", "end insert expt keymapid map size[%d] ret[%s] cost[%d]", java.lang.Integer.valueOf(r7.size()), java.lang.Integer.valueOf(r15), java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - r13));
     */
    /* JADX WARN: Code restructure failed: missing block: B:305:0x0540, code lost:
    
        if (r4 != null) goto L233;
     */
    /* JADX WARN: Code restructure failed: missing block: B:345:0x021c, code lost:
    
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ExptKeyMapIdStorage", "deleteExptKeyMapIdById exptIds size[%d] ret[%d]", java.lang.Integer.valueOf(r47.size()), java.lang.Integer.valueOf(r27));
     */
    /* JADX WARN: Code restructure failed: missing block: B:349:0x01ea, code lost:
    
        if (r5 != null) goto L91;
     */
    /* JADX WARN: Removed duplicated region for block: B:116:0x044e  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0482  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x048e  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x047b  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0725  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0738 A[LOOP:8: B:208:0x0732->B:210:0x0738, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:218:0x07bd  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x07cb  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0804  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x081a  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x081f  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0809  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x07d5  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0326  */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void Ij(int r46, java.util.List r47, java.util.List r48, java.util.List r49) {
        /*
            Method dump skipped, instructions count: 2101
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: h62.d.Ij(int, java.util.List, java.util.List, java.util.List):void");
    }

    public void Jj(int i17, java.util.List list, java.util.List list2) {
        int i18;
        java.util.HashMap E;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 d17;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        java.util.HashSet hashSet = new java.util.HashSet();
        boolean z18 = true;
        if (i17 == 1) {
            j62.b f17 = j62.b.f();
            f17.getClass();
            try {
                f17.d().clear();
                f17.e().clear();
            } catch (java.lang.Exception unused) {
            }
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6426x3c8b73d3 c6426x3c8b73d3 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6426x3c8b73d3();
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6425xa48e42de c6425xa48e42de = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6425xa48e42de();
        int i19 = 0;
        if (list != null && list.size() > 0) {
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                int intValue = ((java.lang.Integer) it.next()).intValue();
                c6426x3c8b73d3.f137660d = intValue;
                c6426x3c8b73d3.f137661e = 0;
                c6426x3c8b73d3.f137662f = 3;
                c6426x3c8b73d3.l();
                j62.a g17 = j62.b.f().g(intValue);
                hashSet.add(g17);
                if (g17 != null) {
                    if (g17.f379422q == 7 ? z18 : false) {
                        h62.d vj6 = vj();
                        long j17 = g17.f379412d;
                        vj6.getClass();
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ExptService.Write", "notifyNewEdgeScriptDelete configID [%d]", java.lang.Long.valueOf(j17));
                        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5738xc2db3c07 c5738xc2db3c07 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5738xc2db3c07();
                        c5738xc2db3c07.f136062g.f87695a = j17;
                        c5738xc2db3c07.e();
                    }
                }
                if (g17 != null) {
                    if (g17.f379422q == 8) {
                        h62.d vj7 = vj();
                        long j18 = g17.f379412d;
                        vj7.getClass();
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ExptService.Write", "notifyNewEdgeSqlDelete configID [%d]", java.lang.Long.valueOf(j18));
                        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5740x676425be c5740x676425be = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5740x676425be();
                        c5740x676425be.f136064g.f87893a = j18;
                        c5740x676425be.e();
                    }
                }
                if (g17 != null) {
                    c6425xa48e42de.f137657d = g17.f379412d;
                    c6425xa48e42de.f137658e = g17.f379414f;
                    c6425xa48e42de.f137659f = g17.f379415g;
                    c6425xa48e42de.l();
                }
                z18 = true;
            }
        }
        if (list2 != null && list2.size() > 0) {
            java.util.Iterator it6 = list2.iterator();
            while (it6.hasNext()) {
                j62.a aVar = (j62.a) it6.next();
                hashSet.add(aVar);
                c6426x3c8b73d3.f137660d = aVar.f379412d;
                c6426x3c8b73d3.f137661e = aVar.f379414f;
                c6426x3c8b73d3.f137662f = 2;
                c6426x3c8b73d3.f137663g = aVar.f379415g;
                c6426x3c8b73d3.l();
                if (aVar.f379422q == 7) {
                    h62.d vj8 = vj();
                    long j19 = aVar.f379412d;
                    vj8.getClass();
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ExptService.Write", "notifyNewEdgeScriptUpdate configID [%d]", java.lang.Long.valueOf(j19));
                    com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5739xe38acba9 c5739xe38acba9 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5739xe38acba9();
                    am.bl blVar = c5739xe38acba9.f136063g;
                    blVar.f87793a = j19;
                    blVar.f87794b = aVar;
                    c5739xe38acba9.e();
                }
                if (aVar.f379422q == 8) {
                    h62.d vj9 = vj();
                    long j27 = aVar.f379412d;
                    vj9.getClass();
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ExptService.Write", "notifyNewEdgeSqlUpdate configID [%d]", java.lang.Long.valueOf(j27));
                    com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5741x8813b560 c5741x8813b560 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5741x8813b560();
                    am.dl dlVar = c5741x8813b560.f136065g;
                    dlVar.f88008a = j27;
                    dlVar.f88009b = aVar;
                    c5741x8813b560.e();
                }
            }
        }
        j62.b f18 = j62.b.f();
        ((kk.l) f18.f379425a).mo143584x5a5b64d();
        if (list == null || list.size() <= 0 || (d17 = f18.d()) == null) {
            i18 = 0;
        } else {
            java.util.Iterator it7 = list.iterator();
            i18 = 0;
            while (it7.hasNext()) {
                int intValue2 = ((java.lang.Integer) it7.next()).intValue();
                if (d17.contains(intValue2 + "")) {
                    d17.remove(intValue2 + "");
                    i18++;
                }
            }
        }
        j62.b f19 = j62.b.f();
        ((kk.l) f19.f379425a).mo143584x5a5b64d();
        if (list2 != null && list2.size() > 0) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 d18 = f19.d();
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 e17 = f19.e();
            if (d18 != null && e17 != null) {
                java.util.Iterator it8 = list2.iterator();
                while (it8.hasNext()) {
                    j62.a aVar2 = (j62.a) it8.next();
                    if (aVar2 != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(aVar2.f379416h) && (E = aVar2.E()) != null && E.size() > 0) {
                        java.util.Iterator it9 = E.keySet().iterator();
                        while (it9.hasNext()) {
                            e17.putInt((java.lang.String) it9.next(), aVar2.f379412d);
                        }
                        d18.putString(aVar2.f379412d + "", aVar2.f379416h);
                        i19++;
                    }
                }
            }
        }
        long elapsedRealtime2 = android.os.SystemClock.elapsedRealtime() - elapsedRealtime;
        new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5386xed4ad233().c("update_expt");
        zj(null, hashSet);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ExptService.Write", "update Expt app flag = %d, delCount = %d, replaceCount = %d cost = %d mmkvCost = %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime), java.lang.Long.valueOf(elapsedRealtime2));
    }

    public int Ni(e42.b0 b0Var, int i17) {
        java.lang.String Zi = Zi(b0Var, "", true);
        return com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(Zi) ? i17 : com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(Zi, i17);
    }

    public int Ri(e42.b0 b0Var, bm5.h0 h0Var, int i17) {
        return Ni(b0Var, ((java.lang.Integer) bm5.o1.f104252a.b(h0Var, java.lang.Integer.valueOf(i17))).intValue());
    }

    public long Ui(e42.b0 b0Var, long j17) {
        java.lang.String Zi = Zi(b0Var, "", true);
        return com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(Zi) ? j17 : com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.V(Zi, j17);
    }

    public java.lang.String Vi(e42.b0 b0Var, java.lang.String str) {
        return Zi(b0Var, str, true);
    }

    public final java.lang.String Zi(e42.b0 b0Var, java.lang.String str, boolean z17) {
        return bj(b0Var == null ? null : b0Var.mo122878x337a8b(), str, z17);
    }

    public java.lang.String aj(java.lang.String str, java.lang.String str2) {
        java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        return bj(str, str2, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00ac A[Catch: all -> 0x0105, TryCatch #0 {all -> 0x0105, blocks: (B:20:0x0044, B:21:0x004c, B:24:0x0054, B:26:0x005a, B:29:0x0062, B:31:0x006e, B:33:0x0075, B:35:0x0089, B:36:0x00a2, B:38:0x00ac, B:39:0x00d7), top: B:19:0x0044 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0102  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String bj(java.lang.String r21, java.lang.String r22, boolean r23) {
        /*
            Method dump skipped, instructions count: 277
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: h62.d.bj(java.lang.String, java.lang.String, boolean):java.lang.String");
    }

    public java.util.HashMap cj(int i17, boolean z17, com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7153x86b40b71 c7153x86b40b71, com.p314xaae8f345.mm.p2493x1bc889d6.C19762x487075a c19762x487075a) {
        java.util.HashMap hashMap = null;
        if (i17 <= 0) {
            return null;
        }
        boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        android.os.SystemClock.elapsedRealtime();
        j62.c oj6 = oj(i17);
        if (oj6 == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(oj6.f66061x384f96bd)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ExptService", "expt item is null or expt content is null.");
        } else if (!z17 || oj6.y0()) {
            hashMap = oj6.E();
            if (oj6.g0()) {
                c19762x487075a.f38859x6ac9171 = true;
                if (c7153x86b40b71 != null) {
                    c7153x86b40b71.f144600d = oj6.f66062xf8fc5057;
                    c7153x86b40b71.f144601e = oj6.f66065x861009b5;
                    c7153x86b40b71.f144602f = oj6.f66063x268de0a3;
                    c7153x86b40b71.f144603g = oj6.f66067x1bb3b54a;
                    c7153x86b40b71.f144604h = oj6.f66059x14c61803;
                    c7153x86b40b71.f144607k = oj6.f66058x81ee695;
                }
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ExptService", "expt time is invalid time[%d %d] seq[%d]", java.lang.Long.valueOf(oj6.f66067x1bb3b54a), java.lang.Long.valueOf(oj6.f66059x14c61803), java.lang.Integer.valueOf(oj6.f66063x268de0a3));
        }
        android.os.SystemClock.elapsedRealtime();
        return hashMap;
    }

    public boolean fj(e42.b0 b0Var, boolean z17) {
        java.lang.String Zi = Zi(b0Var, "", true);
        return com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(Zi) ? z17 : com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(Zi, z17 ? 1 : 0) != 0;
    }

    public float hj(q55.e eVar) {
        bm5.o1 o1Var = bm5.o1.f104252a;
        float f17 = o1Var.f(eVar);
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        return o1Var.m(eVar) == 0 ? com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L(aj(eVar.k(), null), f17) : o1Var.f(eVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0041, code lost:
    
        if (r5 != null) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x005e, code lost:
    
        ((lt0.f) r0).put(r15, java.lang.Integer.valueOf(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0067, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x005b, code lost:
    
        r5.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0059, code lost:
    
        if (r5 == null) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int ij(java.lang.String r15) {
        /*
            r14 = this;
            kk.j r0 = r14.f360720g
            r1 = r0
            lt0.f r1 = (lt0.f) r1
            java.lang.Object r1 = r1.get(r15)
            java.lang.Integer r1 = (java.lang.Integer) r1
            if (r1 == 0) goto L12
            int r15 = r1.intValue()
            return r15
        L12:
            l62.b r1 = r14.pj()
            r1.getClass()
            r2 = 1
            r3 = 0
            r4 = -1
            r5 = 0
            l75.k0 r6 = r1.f398296d     // Catch: java.lang.Throwable -> L44 java.lang.Exception -> L46
            java.lang.String r7 = "ExptKeyMapId"
            java.lang.String[] r8 = new java.lang.String[r2]     // Catch: java.lang.Throwable -> L44 java.lang.Exception -> L46
            java.lang.String r1 = "exptId"
            r8[r3] = r1     // Catch: java.lang.Throwable -> L44 java.lang.Exception -> L46
            java.lang.String r9 = "exptKey=?"
            java.lang.String[] r10 = new java.lang.String[]{r15}     // Catch: java.lang.Throwable -> L44 java.lang.Exception -> L46
            r11 = 0
            r12 = 0
            r13 = 0
            android.database.Cursor r5 = r6.E(r7, r8, r9, r10, r11, r12, r13)     // Catch: java.lang.Throwable -> L44 java.lang.Exception -> L46
            if (r5 == 0) goto L41
            boolean r1 = r5.moveToFirst()     // Catch: java.lang.Throwable -> L44 java.lang.Exception -> L46
            if (r1 == 0) goto L41
            int r1 = r5.getInt(r3)     // Catch: java.lang.Throwable -> L44 java.lang.Exception -> L46
            r4 = r1
        L41:
            if (r5 == 0) goto L5e
            goto L5b
        L44:
            r15 = move-exception
            goto L68
        L46:
            r1 = move-exception
            java.lang.String r6 = "MicroMsg.ExptKeyMapIdStorage"
            java.lang.String r7 = "get expt id [%s] [%s]"
            r8 = 2
            java.lang.Object[] r8 = new java.lang.Object[r8]     // Catch: java.lang.Throwable -> L44
            r8[r3] = r15     // Catch: java.lang.Throwable -> L44
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L44
            r8[r2] = r1     // Catch: java.lang.Throwable -> L44
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r6, r7, r8)     // Catch: java.lang.Throwable -> L44
            if (r5 == 0) goto L5e
        L5b:
            r5.close()
        L5e:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)
            lt0.f r0 = (lt0.f) r0
            r0.put(r15, r1)
            return r4
        L68:
            if (r5 == 0) goto L6d
            r5.close()
        L6d:
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: h62.d.ij(java.lang.String):int");
    }

    public boolean mj(e42.b0 b0Var, com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f c19767x257d7f, com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f c19767x257d7f2) {
        j62.c oj6;
        if (c19767x257d7f == null || c19767x257d7f2 == null) {
            return false;
        }
        if ((gm0.j1.h() && gm0.j1.a()) ? false : true) {
            return j62.e.g().b(b0Var.mo122878x337a8b(), c19767x257d7f, c19767x257d7f2);
        }
        int ij6 = ij(b0Var.mo122878x337a8b());
        if (ij6 <= 0 || (oj6 = oj(ij6)) == null) {
            return false;
        }
        c19767x257d7f.f38864x6ac9171 = oj6.f66062xf8fc5057;
        c19767x257d7f2.f38864x6ac9171 = oj6.f66065x861009b5;
        return true;
    }

    public int nj(q55.e eVar) {
        bm5.o1 o1Var = bm5.o1.f104252a;
        int h17 = o1Var.h(eVar);
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        return o1Var.m(eVar) == 0 ? com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(aj(eVar.k(), null), h17) : o1Var.h(eVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0089  */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v2, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public j62.c oj(int r15) {
        /*
            r14 = this;
            kk.j r0 = r14.f360719f
            java.lang.Integer r1 = java.lang.Integer.valueOf(r15)
            r2 = r0
            lt0.f r2 = (lt0.f) r2
            java.lang.Object r1 = r2.get(r1)
            j62.c r1 = (j62.c) r1
            if (r1 == 0) goto L12
            return r1
        L12:
            l62.d r1 = r14.tj()
            r1.getClass()
            r2 = 0
            r3 = 1
            r4 = 0
            l75.k0 r5 = r1.f398301d     // Catch: java.lang.Throwable -> L5e java.lang.Exception -> L60
            java.lang.String r6 = "ExptItem"
            r7 = 0
            java.lang.String r8 = "exptId=?"
            java.lang.String[] r9 = new java.lang.String[r3]     // Catch: java.lang.Throwable -> L5e java.lang.Exception -> L60
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5e java.lang.Exception -> L60
            r1.<init>()     // Catch: java.lang.Throwable -> L5e java.lang.Exception -> L60
            r1.append(r15)     // Catch: java.lang.Throwable -> L5e java.lang.Exception -> L60
            java.lang.String r10 = ""
            r1.append(r10)     // Catch: java.lang.Throwable -> L5e java.lang.Exception -> L60
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L5e java.lang.Exception -> L60
            r9[r2] = r1     // Catch: java.lang.Throwable -> L5e java.lang.Exception -> L60
            r10 = 0
            r11 = 0
            r12 = 0
            android.database.Cursor r1 = r5.E(r6, r7, r8, r9, r10, r11, r12)     // Catch: java.lang.Throwable -> L5e java.lang.Exception -> L60
            if (r1 == 0) goto L58
            boolean r5 = r1.moveToFirst()     // Catch: java.lang.Exception -> L53 java.lang.Throwable -> L85
            if (r5 == 0) goto L58
            j62.c r5 = new j62.c     // Catch: java.lang.Exception -> L53 java.lang.Throwable -> L85
            r5.<init>()     // Catch: java.lang.Exception -> L53 java.lang.Throwable -> L85
            r5.mo9015xbf5d97fd(r1)     // Catch: java.lang.Exception -> L51 java.lang.Throwable -> L85
            r4 = r5
            goto L58
        L51:
            r4 = move-exception
            goto L64
        L53:
            r5 = move-exception
            r13 = r5
            r5 = r4
            r4 = r13
            goto L64
        L58:
            if (r1 == 0) goto L79
            r1.close()
            goto L79
        L5e:
            r15 = move-exception
            goto L87
        L60:
            r1 = move-exception
            r5 = r4
            r4 = r1
            r1 = r5
        L64:
            java.lang.String r6 = "MicroMsg.ExptStorage"
            java.lang.String r7 = "get expt error [%s]"
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L85
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L85
            r3[r2] = r4     // Catch: java.lang.Throwable -> L85
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r6, r7, r3)     // Catch: java.lang.Throwable -> L85
            if (r1 == 0) goto L78
            r1.close()
        L78:
            r4 = r5
        L79:
            if (r4 == 0) goto L84
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)
            lt0.f r0 = (lt0.f) r0
            r0.put(r15, r4)
        L84:
            return r4
        L85:
            r15 = move-exception
            r4 = r1
        L87:
            if (r4 == 0) goto L8c
            r4.close()
        L8c:
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: h62.d.oj(int):j62.c");
    }

    @Override // i95.w
    /* renamed from: onAccountReleased */
    public void mo836xb8969aab(android.content.Context context) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ExptService", "onAccountRelease");
        Aj();
        ((ku5.t0) ku5.t0.f394148d).A("manual_get_expt");
        java.util.HashMap hashMap = k62.a.f386059a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ExptServiceShell", "destroy");
        k62.a.f386060b.mo48814x2efc64();
        k62.a.f386059a.clear();
    }

    public final l62.b pj() {
        l62.b[] bVarArr = this.f360718e;
        if (bVarArr[0] == null) {
            synchronized (bVarArr) {
                l62.b[] bVarArr2 = this.f360718e;
                if (bVarArr2[0] == null) {
                    bVarArr2[0] = new l62.b(((c42.l) i95.n0.c(c42.l.class)).wi());
                }
            }
        }
        return this.f360718e[0];
    }

    public long qj(q55.e eVar) {
        bm5.o1 o1Var = bm5.o1.f104252a;
        long j17 = o1Var.j(eVar);
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        return o1Var.m(eVar) == 0 ? com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.V(aj(eVar.k(), null), j17) : o1Var.j(eVar);
    }

    public int rj(e42.b0 b0Var, int i17) {
        java.lang.String Zi = Zi(b0Var, "", false);
        return com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(Zi) ? i17 : com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(Zi, i17);
    }

    public boolean sj(e42.b0 b0Var, boolean z17) {
        java.lang.String Zi = Zi(b0Var, "", false);
        return com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(Zi) ? z17 : com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(Zi, z17 ? 1 : 0) != 0;
    }

    public final l62.d tj() {
        l62.d[] dVarArr = this.f360717d;
        if (dVarArr[0] == null) {
            synchronized (dVarArr) {
                l62.d[] dVarArr2 = this.f360717d;
                if (dVarArr2[0] == null) {
                    dVarArr2[0] = new l62.d(((c42.l) i95.n0.c(c42.l.class)).wi());
                }
            }
        }
        return this.f360717d[0];
    }

    public java.lang.String uj(q55.e eVar) {
        bm5.o1 o1Var = bm5.o1.f104252a;
        java.lang.String l17 = o1Var.l(eVar);
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        return o1Var.m(eVar) == 0 ? aj(eVar.k(), l17) : o1Var.l(eVar);
    }

    public final void wi(int i17) {
        if (!gm0.j1.a()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ExptService", "account is not ready, don't get expt config");
            return;
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ExptService", "it is not mm process, why you call update expt?");
            return;
        }
        int intValue = ((java.lang.Integer) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_GET_EXPT_LAST_TIME_SEC_INT, 0)).intValue();
        int intValue2 = ((java.lang.Integer) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_GET_EXPT_INTERVAL_SEC_INT, 86400)).intValue();
        if (intValue2 <= 3600) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ExptService", "interval is less than 1 hour, something warn here!!!");
            intValue2 = 3600;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.H1(intValue) >= intValue2) {
            Gj(i17);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0040, code lost:
    
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ExptKeyMapIdStorage", "get key count[%d] cost[%d]", java.lang.Long.valueOf(r6), java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - r2));
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0056, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003d, code lost:
    
        r5.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003b, code lost:
    
        if (r5 == null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0027, code lost:
    
        if (r5 != null) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long wj() {
        /*
            r10 = this;
            l62.b r0 = r10.pj()
            r0.getClass()
            java.lang.String r1 = "MicroMsg.ExptKeyMapIdStorage"
            boolean r2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a
            long r2 = android.os.SystemClock.elapsedRealtime()
            r4 = 0
            r5 = 0
            r6 = 0
            l75.k0 r0 = r0.f398296d     // Catch: java.lang.Throwable -> L2a java.lang.Exception -> L2c
            java.lang.String r8 = "SELECT count(*) FROM ExptKeyMapId"
            android.database.Cursor r5 = r0.B(r8, r5)     // Catch: java.lang.Throwable -> L2a java.lang.Exception -> L2c
            if (r5 == 0) goto L27
            boolean r0 = r5.moveToFirst()     // Catch: java.lang.Throwable -> L2a java.lang.Exception -> L2c
            if (r0 == 0) goto L27
            long r6 = r5.getLong(r4)     // Catch: java.lang.Throwable -> L2a java.lang.Exception -> L2c
        L27:
            if (r5 == 0) goto L40
            goto L3d
        L2a:
            r0 = move-exception
            goto L57
        L2c:
            r0 = move-exception
            java.lang.String r8 = "get key count error [%s]"
            r9 = 1
            java.lang.Object[] r9 = new java.lang.Object[r9]     // Catch: java.lang.Throwable -> L2a
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L2a
            r9[r4] = r0     // Catch: java.lang.Throwable -> L2a
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r1, r8, r9)     // Catch: java.lang.Throwable -> L2a
            if (r5 == 0) goto L40
        L3d:
            r5.close()
        L40:
            java.lang.Long r0 = java.lang.Long.valueOf(r6)
            long r4 = android.os.SystemClock.elapsedRealtime()
            long r4 = r4 - r2
            java.lang.Long r2 = java.lang.Long.valueOf(r4)
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r2}
            java.lang.String r2 = "get key count[%d] cost[%d]"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r2, r0)
            return r6
        L57:
            if (r5 == 0) goto L5c
            r5.close()
        L5c:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: h62.d.wj():long");
    }

    public void xj(j62.c cVar, boolean z17) {
        if (cVar != null && cVar.w0()) {
            if (cVar.f66068x5334f55 == 1) {
                h62.d vj6 = vj();
                java.lang.String A0 = cVar.A0();
                boolean z07 = cVar.z0();
                vj6.getClass();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ExptService.Write", "notify session config json[%b] needReport[%b] isDel[%b]", java.lang.Boolean.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(A0)), java.lang.Boolean.valueOf(z07), java.lang.Boolean.FALSE);
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5997x26bcc452 c5997x26bcc452 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5997x26bcc452();
                am.st stVar = c5997x26bcc452.f136291g;
                stVar.f89466a = A0;
                stVar.f89468c = java.lang.Boolean.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(A0));
                stVar.f89467b = java.lang.Boolean.valueOf(z07);
                c5997x26bcc452.e();
            }
            if (cVar.f66068x5334f55 == 2) {
                h62.d vj7 = vj();
                java.lang.String A02 = cVar.A0();
                vj7.getClass();
                java.lang.Boolean valueOf = java.lang.Boolean.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(A02));
                java.lang.Boolean bool = java.lang.Boolean.FALSE;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ExptService.Write", "notify session uba config json[%b] isDel[%b]", valueOf, bool);
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6001x5b1d72aa c6001x5b1d72aa = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6001x5b1d72aa();
                am.wt wtVar = c6001x5b1d72aa.f136295g;
                wtVar.f89855a = A02;
                wtVar.f89856b = bool;
                c6001x5b1d72aa.e();
            }
            if (cVar.f66068x5334f55 == 3) {
                h62.d vj8 = vj();
                java.util.HashMap hashMap = cVar.H;
                long j17 = 0;
                if (hashMap != null && hashMap.size() > 0) {
                    j17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.V((java.lang.String) cVar.H.get("jsoncfg_param_" + cVar.f66062xf8fc5057 + "_sessionpageid"), 0L);
                }
                java.lang.String A03 = cVar.A0();
                boolean z08 = cVar.z0();
                vj8.getClass();
                java.lang.Long valueOf2 = java.lang.Long.valueOf(j17);
                java.lang.Boolean valueOf3 = java.lang.Boolean.valueOf(z08);
                java.lang.Boolean bool2 = java.lang.Boolean.FALSE;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ExptService.Write", "notify session page config sessionPageId [%d] json[%s] needReport[%b] isDel[%b]", valueOf2, A03, valueOf3, bool2);
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6000xaeda0c83 c6000xaeda0c83 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6000xaeda0c83();
                am.vt vtVar = c6000xaeda0c83.f136294g;
                vtVar.f89748a = j17;
                vtVar.f89749b = A03;
                vtVar.f89751d = bool2;
                vtVar.f89752e = java.lang.Boolean.valueOf(z08);
                vtVar.f89750c = new java.util.ArrayList();
                vtVar.f89753f = 1;
                c6000xaeda0c83.e();
            }
            if (cVar.f66068x5334f55 == 4) {
                h62.d vj9 = vj();
                long j18 = cVar.f66062xf8fc5057;
                java.lang.String A04 = cVar.A0();
                vj9.getClass();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ExptService.Write", "notify session view black list config sessionPageId [%d] json[%s] isDel[%b]", java.lang.Long.valueOf(j18), A04, java.lang.Boolean.valueOf(z17));
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6002x4bb7f628 c6002x4bb7f628 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6002x4bb7f628();
                c6002x4bb7f628.f136296g.getClass();
                c6002x4bb7f628.e();
            }
            if (cVar.f66068x5334f55 == 5) {
                h62.d vj10 = vj();
                long j19 = cVar.f66062xf8fc5057;
                java.lang.String A05 = cVar.A0();
                vj10.getClass();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ExptService.Write", "notify session edge script config sessionPageId [%d] json[%s] isDel[%b]", java.lang.Long.valueOf(j19), A05, java.lang.Boolean.valueOf(z17));
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5998x499615ec c5998x499615ec = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5998x499615ec();
                java.lang.Boolean valueOf4 = java.lang.Boolean.valueOf(z17);
                am.tt ttVar = c5998x499615ec.f136292g;
                ttVar.f89569c = valueOf4;
                ttVar.f89568b = A05;
                ttVar.f89567a = j19;
                c5998x499615ec.e();
            }
            if (cVar.f66068x5334f55 == 6) {
                h62.d vj11 = vj();
                long j27 = cVar.f66062xf8fc5057;
                java.lang.String A06 = cVar.A0();
                vj11.getClass();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ExptService.Write", "notify session edge sql config sessionPageId [%d] json[%s] isDel[%b]", java.lang.Long.valueOf(j27), A06, java.lang.Boolean.valueOf(z17));
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5999x77bc6a4f c5999x77bc6a4f = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5999x77bc6a4f();
                java.lang.Boolean valueOf5 = java.lang.Boolean.valueOf(z17);
                am.ut utVar = c5999x77bc6a4f.f136293g;
                utVar.f89670c = valueOf5;
                utVar.f89669b = A06;
                utVar.f89668a = j27;
                c5999x77bc6a4f.e();
            }
        }
    }

    public void yj(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ExptService", "receive expt xml but content is null");
            return;
        }
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        j62.c cVar = new j62.c();
        if (cVar.t0(str)) {
            if (cVar.f66062xf8fc5057 == 0) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(863L, 9L, 1L, false);
                try {
                    Bj(new org.json.JSONObject(str).optInt("TryGetTime"));
                    this.f360721h = true;
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ExptService", e17, "on get xml msg reset get expt time error [%s]", e17.toString());
                }
                Cj(false);
                Hj(4);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ExptService", "rece xml to get expt app");
                return;
            }
            if (cVar.f66063x268de0a3 < 0) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(863L, 3L, 1L, false);
                linkedList.add(java.lang.Integer.valueOf(cVar.f66062xf8fc5057));
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(863L, 4L, 1L, false);
                linkedList2.add(cVar);
            }
        }
        Ij(0, linkedList, linkedList2, null);
        Dj(cVar, null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ExptService.Write", "received expt xml [%s] ", str);
    }

    public void zj(java.util.HashSet hashSet, java.util.HashSet hashSet2) {
        int i17;
        java.util.HashMap E;
        java.util.HashMap E2;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        int i18 = 0;
        if (hashSet != null) {
            java.util.Iterator it = hashSet.iterator();
            i17 = 0;
            while (it.hasNext()) {
                j62.c cVar = (j62.c) it.next();
                if (cVar != null && (E2 = cVar.E()) != null) {
                    for (java.lang.String str : E2.keySet()) {
                        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5281xaccc9f21 c5281xaccc9f21 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5281xaccc9f21();
                        c5281xaccc9f21.f135605g.f88659a = str;
                        c5281xaccc9f21.e();
                        i17++;
                    }
                }
            }
        } else {
            i17 = 0;
        }
        if (hashSet2 != null) {
            java.util.Iterator it6 = hashSet2.iterator();
            while (it6.hasNext()) {
                j62.a aVar = (j62.a) it6.next();
                if (aVar != null && (E = aVar.E()) != null) {
                    for (java.lang.String str2 : E.keySet()) {
                        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5281xaccc9f21 c5281xaccc9f212 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5281xaccc9f21();
                        c5281xaccc9f212.f135605g.f88659a = str2;
                        c5281xaccc9f212.e();
                        i18++;
                    }
                }
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ExptService.Write", "notifyExptChange cost[%d] notifyExptCount[%d] notifyExptAppCount[%d]", java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
    }
}

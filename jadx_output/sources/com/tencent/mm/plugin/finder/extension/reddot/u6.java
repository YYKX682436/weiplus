package com.tencent.mm.plugin.finder.extension.reddot;

/* loaded from: classes8.dex */
public final class u6 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f105896a;

    /* renamed from: b, reason: collision with root package name */
    public final int f105897b;

    /* renamed from: c, reason: collision with root package name */
    public final int f105898c;

    /* renamed from: d, reason: collision with root package name */
    public final int f105899d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f105900e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f105901f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f105902g;

    /* renamed from: h, reason: collision with root package name */
    public int f105903h;

    /* renamed from: i, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.extension.reddot.m6 f105904i;

    /* renamed from: j, reason: collision with root package name */
    public final int f105905j;

    /* renamed from: k, reason: collision with root package name */
    public r45.ng7 f105906k;

    /* renamed from: l, reason: collision with root package name */
    public r45.en f105907l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f105908m;

    public u6() {
        boolean z17;
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        boolean z18 = false;
        if (((java.lang.Boolean) t70Var.o0().r()).booleanValue()) {
            z17 = true;
        } else {
            java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
            z17 = false;
        }
        if (z17 || z65.c.a()) {
            z18 = true;
        } else {
            kb2.b bVar = kb2.b.f306225a;
        }
        this.f105896a = z18;
        this.f105897b = 60;
        this.f105898c = 3600;
        this.f105899d = 86400;
        this.f105900e = jz5.h.b(com.tencent.mm.plugin.finder.extension.reddot.q6.f105787d);
        this.f105901f = jz5.h.b(com.tencent.mm.plugin.finder.extension.reddot.s6.f105859d);
        this.f105902g = jz5.h.b(com.tencent.mm.plugin.finder.extension.reddot.r6.f105805d);
        this.f105904i = com.tencent.mm.plugin.finder.extension.reddot.m6.f105707d;
        this.f105905j = com.tencent.mm.plugin.finder.storage.aj0.f126440a.K() ? ((java.lang.Number) com.tencent.mm.plugin.finder.storage.z70.f(com.tencent.mm.plugin.finder.storage.z70.f128432a, t70Var, "发现页红点x同屏限制pctr计算时长", e42.c0.clicfg_finder_red_dot_x_strategy_pctr_cal_time, 90, false, com.tencent.mm.plugin.finder.storage.ih0.f126952d, 8, null)).intValue() : ((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.aj0.f126456j).getValue()).r()).intValue();
    }

    public final void a(java.lang.String str, int i17) {
        boolean z17;
        if (i17 < 0) {
            boolean z18 = true;
            if (((java.lang.Boolean) com.tencent.mm.plugin.finder.storage.t70.f127590a.o0().r()).booleanValue()) {
                z17 = true;
            } else {
                java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                z17 = false;
            }
            if (!z17 && !z65.c.a()) {
                kb2.b bVar = kb2.b.f306225a;
                z18 = false;
            }
            if (!z18) {
                pm0.z.b(xy2.b.f458155b, "xStrategy_bt_err", false, null, null, false, false, new com.tencent.mm.plugin.finder.extension.reddot.n6(str), 60, null);
                return;
            }
            com.tencent.mm.sdk.platformtools.Log.c("FinderRedDotFreqCtrlXStrategy", "checkBusinessType " + i17 + " error uuid=" + str, new java.lang.Object[0]);
            java.lang.Exception exc = new java.lang.Exception("FinderRedDotFreqCtrlXStrategy");
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("checkBusinessType ");
            sb6.append(i17);
            hc2.c.a(exc, sb6.toString());
        }
    }

    public final void b() {
        boolean z17;
        com.tencent.mars.xlog.Log.i("FinderRedDotFreqCtrlXStrategy", "[clear]");
        f().clear();
        com.tencent.mm.plugin.finder.extension.reddot.x6 x6Var = com.tencent.mm.plugin.finder.extension.reddot.x6.f105995a;
        try {
            boolean z18 = false;
            if (((java.lang.Boolean) com.tencent.mm.plugin.finder.storage.t70.f127590a.o0().r()).booleanValue()) {
                z17 = true;
            } else {
                java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                z17 = false;
            }
            if (z17 || z65.c.a()) {
                z18 = true;
            } else {
                kb2.b bVar = kb2.b.f306225a;
            }
            if (z18) {
                com.tencent.mars.xlog.Log.i("FinderRedDotHistoryRecordProvider", "delete all");
            }
            ((com.tencent.wcdb.core.Table) ((jz5.n) com.tencent.mm.plugin.finder.extension.reddot.x6.f105998d).getValue()).deleteObjects();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("FinderRedDotHistoryRecordProvider", "[deleteAll] e:" + e17.getMessage());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x003f, code lost:
    
        if (r5 > r3) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005c, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:?, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x004f, code lost:
    
        if (r5 > r3) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0054, code lost:
    
        if (r5 > r3) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0059, code lost:
    
        if (r5 > r3) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int c(int r5, int r6) {
        /*
            r4 = this;
            r0 = 0
            if (r5 >= r6) goto L4
            goto L5c
        L4:
            com.tencent.mm.plugin.finder.storage.t70 r1 = com.tencent.mm.plugin.finder.storage.t70.f127590a
            lb2.j r1 = r1.o0()
            java.lang.Object r1 = r1.r()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            r2 = 1
            if (r1 != 0) goto L1b
            java.lang.String r1 = com.tencent.mm.sdk.platformtools.z.f193105a
            r1 = r0
            goto L1c
        L1b:
            r1 = r2
        L1c:
            if (r1 != 0) goto L27
            boolean r1 = z65.c.a()
            if (r1 != 0) goto L27
            kb2.b r1 = kb2.b.f306225a
            goto L28
        L27:
            r0 = r2
        L28:
            int r1 = r4.f105899d
            int r3 = r4.f105905j
            if (r0 == 0) goto L57
            com.tencent.mm.plugin.finder.extension.reddot.m6 r0 = r4.f105904i
            int r0 = r0.ordinal()
            if (r0 == 0) goto L52
            if (r0 == r2) goto L4b
            r1 = 2
            if (r0 != r1) goto L45
            int r5 = r5 - r6
            int r6 = r4.f105897b
            int r5 = r5 / r6
            if (r5 <= r3) goto L43
        L41:
            r0 = r3
            goto L5c
        L43:
            r0 = r5
            goto L5c
        L45:
            jz5.j r5 = new jz5.j
            r5.<init>()
            throw r5
        L4b:
            int r5 = r5 - r6
            int r6 = r4.f105898c
            int r5 = r5 / r6
            if (r5 <= r3) goto L43
            goto L41
        L52:
            int r5 = r5 - r6
            int r5 = r5 / r1
            if (r5 <= r3) goto L43
            goto L41
        L57:
            int r5 = r5 - r6
            int r5 = r5 / r1
            if (r5 <= r3) goto L43
            goto L41
        L5c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.extension.reddot.u6.c(int, int):int");
    }

    public final void d(java.lang.String str, int i17, int i18, java.util.LinkedList linkedList) {
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        for (int i19 = 0; i19 < i18; i19++) {
            r45.tw3 tw3Var = new r45.tw3();
            tw3Var.set(0, java.lang.Integer.valueOf(i19));
            linkedList2.add(tw3Var);
        }
        boolean z17 = this.f105896a;
        if (z17) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(str);
            sb6.append(" [fixHistoryRecordItems] businessType=");
            sb6.append(i17);
            sb6.append(",diffDay=");
            sb6.append(i18);
            sb6.append(",before fix item=");
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(linkedList, 10));
            java.util.Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                r45.tw3 tw3Var2 = (r45.tw3) it.next();
                arrayList.add(tw3Var2.getInteger(0) + ":(" + tw3Var2.getInteger(1) + ',' + tw3Var2.getInteger(2) + ')');
            }
            sb6.append(arrayList);
            com.tencent.mars.xlog.Log.i("FinderRedDotFreqCtrlXStrategy", sb6.toString());
        }
        java.util.Iterator it6 = linkedList.iterator();
        kotlin.jvm.internal.o.f(it6, "iterator(...)");
        int i27 = i18;
        while (it6.hasNext()) {
            java.lang.Object next = it6.next();
            kotlin.jvm.internal.o.f(next, "next(...)");
            r45.tw3 tw3Var3 = (r45.tw3) next;
            it6.remove();
            tw3Var3.set(0, java.lang.Integer.valueOf(tw3Var3.getInteger(0) + i18));
            if (tw3Var3.getInteger(0) == i27) {
                linkedList2.add(tw3Var3);
                i27++;
            } else if (tw3Var3.getInteger(0) > i27) {
                int integer = tw3Var3.getInteger(0);
                while (i27 < integer) {
                    r45.tw3 tw3Var4 = new r45.tw3();
                    tw3Var4.set(0, java.lang.Integer.valueOf(i27));
                    linkedList2.add(tw3Var4);
                    i27++;
                }
                linkedList2.add(tw3Var3);
                i27 = tw3Var3.getInteger(0) + 1;
            } else {
                tw3Var3.getInteger(0);
            }
        }
        linkedList.clear();
        linkedList.addAll(kz5.n0.K0(linkedList2, this.f105905j));
        if (z17) {
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("[fixHistoryRecordItems] businessType=");
            sb7.append(i17);
            sb7.append(",after fix item=");
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(linkedList, 10));
            java.util.Iterator it7 = linkedList.iterator();
            while (it7.hasNext()) {
                r45.tw3 tw3Var5 = (r45.tw3) it7.next();
                arrayList2.add(tw3Var5.getInteger(0) + ":(" + tw3Var5.getInteger(1) + ',' + tw3Var5.getInteger(2) + ')');
            }
            sb7.append(arrayList2);
            com.tencent.mars.xlog.Log.i("FinderRedDotFreqCtrlXStrategy", sb7.toString());
        }
    }

    public final java.util.List e() {
        java.util.LinkedList list;
        r45.en enVar = this.f105907l;
        java.util.LinkedList list2 = enVar != null ? enVar.getList(0) : null;
        boolean z17 = list2 == null || list2.isEmpty();
        java.util.List list3 = kz5.p0.f313996d;
        if (!z17) {
            r45.en enVar2 = this.f105907l;
            java.util.LinkedList list4 = enVar2 != null ? enVar2.getList(0) : null;
            return list4 == null ? list3 : list4;
        }
        boolean z18 = this.f105908m;
        boolean z19 = this.f105896a;
        if (!z18) {
            if (z19) {
                com.tencent.mars.xlog.Log.i("FinderRedDotFreqCtrlXStrategy", "[getBusinessTypeList] but disable x strategy!");
            }
            return list3;
        }
        r45.ng7 ng7Var = this.f105906k;
        if (ng7Var != null && (list = ng7Var.getList(1)) != null) {
            list3 = new java.util.LinkedList(list);
        }
        java.util.List F0 = kz5.n0.F0(list3, new com.tencent.mm.plugin.finder.extension.reddot.o6(this));
        if (z19) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[getBusinessTypeList] before sorted list=");
            r45.ng7 ng7Var2 = this.f105906k;
            sb6.append(ng7Var2 != null ? ng7Var2.getList(1) : null);
            sb6.append(";after sorted list=");
            sb6.append(F0);
            sb6.append(";pctrMap=");
            sb6.append(g());
            sb6.append(";pctrCalTime=");
            sb6.append(this.f105905j);
            com.tencent.mars.xlog.Log.i("FinderRedDotFreqCtrlXStrategy", sb6.toString());
        } else {
            com.tencent.mars.xlog.Log.i("FinderRedDotFreqCtrlXStrategy", "[getBusinessTypeList] sorted list=" + F0);
        }
        return F0;
    }

    public final java.util.List f() {
        return (java.util.List) ((jz5.n) this.f105900e).getValue();
    }

    public final android.util.SparseArray g() {
        return (android.util.SparseArray) this.f105901f.getValue();
    }

    public final java.lang.String h(java.util.List list) {
        if (list == null) {
            return "";
        }
        if (list.isEmpty()) {
            return "Empty";
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            mi0.b bVar = (mi0.b) it.next();
            byte[] bArr = bVar.f326503c;
            if (bArr == null || bArr.length == 0) {
                sb6.append("businessType=" + bVar.f326501a + " data is null!");
            } else {
                r45.sw3 b17 = com.tencent.mm.plugin.finder.extension.reddot.x6.f105995a.b(bVar);
                sb6.append(java.lang.String.valueOf(b17 != null ? com.tencent.mm.plugin.finder.extension.reddot.qa.e(b17) : null));
            }
        }
        java.lang.String sb7 = sb6.toString();
        kotlin.jvm.internal.o.f(sb7, "toString(...)");
        return sb7;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0020, code lost:
    
        if ((r6 == null || r6.isEmpty()) != false) goto L12;
     */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01cc A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0283 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:163:? A[LOOP:7: B:134:0x0263->B:163:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:170:? A[LOOP:6: B:105:0x01af->B:170:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x035c A[Catch: all -> 0x045f, LOOP:1: B:57:0x0356->B:59:0x035c, LOOP_END, TryCatch #5 {, blocks: (B:31:0x0076, B:33:0x0099, B:35:0x00a0, B:37:0x00a6, B:39:0x00ad, B:40:0x00ba, B:42:0x0107, B:45:0x0130, B:46:0x0145, B:54:0x016b, B:55:0x016c, B:56:0x0349, B:57:0x0356, B:59:0x035c, B:61:0x0370, B:62:0x0379, B:69:0x0393, B:70:0x0394, B:71:0x03d8, B:78:0x03ff, B:79:0x0400, B:80:0x0431, B:82:0x0437, B:84:0x0448, B:88:0x045a, B:89:0x045b, B:92:0x045d, B:93:0x045e, B:96:0x018f, B:97:0x0190, B:100:0x0127, B:101:0x0191, B:102:0x019e, B:104:0x01a4, B:105:0x01af, B:107:0x01b5, B:115:0x01ce, B:117:0x01d2, B:120:0x01dc, B:122:0x01e4, B:123:0x01ed, B:125:0x0213, B:126:0x024d, B:129:0x022a, B:131:0x0236, B:132:0x01e7, B:133:0x0256, B:134:0x0263, B:136:0x0269, B:144:0x0285, B:146:0x0289, B:149:0x02a6, B:151:0x02f0, B:152:0x030e, B:154:0x0312, B:156:0x0325, B:161:0x029d, B:164:0x0278, B:171:0x01c1, B:44:0x0118, B:73:0x03d9, B:74:0x03e8, B:76:0x03ee, B:148:0x028e, B:64:0x037a, B:65:0x037e, B:67:0x0384, B:48:0x0146, B:49:0x014a, B:51:0x0150), top: B:30:0x0076, inners: #0, #1, #2, #3, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x037a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(r45.ng7 r18, r45.en r19) {
        /*
            Method dump skipped, instructions count: 1155
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.extension.reddot.u6.i(r45.ng7, r45.en):void");
    }

    public final boolean j(long j17, long j18) {
        boolean z17;
        boolean z18;
        int ordinal;
        if (((java.lang.Boolean) com.tencent.mm.plugin.finder.storage.t70.f127590a.o0().r()).booleanValue()) {
            z17 = true;
        } else {
            java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
            z17 = false;
        }
        if (z17 || z65.c.a()) {
            z18 = true;
        } else {
            kb2.b bVar = kb2.b.f306225a;
            z18 = false;
        }
        if (z18 && (ordinal = this.f105904i.ordinal()) != 0) {
            if (ordinal != 1) {
                java.util.Calendar calendar = java.util.Calendar.getInstance();
                calendar.setTimeInMillis(j17);
                java.util.Calendar calendar2 = java.util.Calendar.getInstance();
                calendar2.setTimeInMillis(j18);
                if (calendar.get(1) != calendar2.get(1) || calendar.get(5) != calendar2.get(5) || calendar.get(2) != calendar2.get(2) || calendar.get(11) != calendar2.get(11) || calendar.get(12) != calendar2.get(12)) {
                    return false;
                }
            } else {
                java.util.Calendar calendar3 = java.util.Calendar.getInstance();
                calendar3.setTimeInMillis(j17);
                java.util.Calendar calendar4 = java.util.Calendar.getInstance();
                calendar4.setTimeInMillis(j18);
                if (calendar3.get(1) != calendar4.get(1) || calendar3.get(5) != calendar4.get(5) || calendar3.get(2) != calendar4.get(2) || calendar3.get(11) != calendar4.get(11)) {
                    return false;
                }
            }
            return true;
        }
        return com.tencent.mm.sdk.platformtools.t8.T0(j17, j18);
    }

    public final void k(r45.sw3 sw3Var) {
        java.util.LinkedList<r45.tw3> list = sw3Var.getList(1);
        kotlin.jvm.internal.o.f(list, "getRecord_items(...)");
        for (r45.tw3 tw3Var : list) {
            tw3Var.set(0, java.lang.Integer.valueOf(tw3Var.getInteger(0) + 1));
        }
        java.util.LinkedList list2 = sw3Var.getList(1);
        r45.tw3 tw3Var2 = new r45.tw3();
        tw3Var2.set(0, 0);
        list2.add(0, tw3Var2);
        if (sw3Var.getList(1).size() > this.f105905j) {
            java.util.LinkedList list3 = sw3Var.getList(1);
            kotlin.jvm.internal.o.f(list3, "getRecord_items(...)");
            pm0.v.d0(list3, new com.tencent.mm.plugin.finder.extension.reddot.t6(this));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object] */
    public final void l(java.lang.String str, int i17, int i18, r45.sw3 sw3Var) {
        int i19;
        r45.sw3 sw3Var2;
        int i27 = 0;
        if (sw3Var == null) {
            java.util.List f17 = f();
            kotlin.jvm.internal.o.f(f17, "<get-historyRecords>(...)");
            synchronized (f17) {
                java.util.Iterator it = f17.iterator();
                while (true) {
                    if (it.hasNext()) {
                        sw3Var2 = it.next();
                        if (((r45.sw3) sw3Var2).getInteger(0) == i18) {
                            break;
                        }
                    } else {
                        sw3Var2 = 0;
                        break;
                    }
                }
            }
            sw3Var = sw3Var2;
        }
        if (sw3Var != null) {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            java.util.LinkedList<r45.tw3> list = sw3Var.getList(1);
            if (list != null) {
                i19 = 0;
                for (r45.tw3 tw3Var : list) {
                    i27 += tw3Var.getInteger(1);
                    i19 += tw3Var.getInteger(2);
                }
            } else {
                i19 = 0;
            }
            float f18 = i27 > 0 ? i19 / i27 : 0.0f;
            java.lang.Float f19 = (java.lang.Float) g().get(i18);
            jz5.l lVar = (jz5.l) ((android.util.SparseArray) ((jz5.n) this.f105902g).getValue()).get(i18);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(str);
            sb6.append(" [updatePctr] businessType=");
            sb6.append(i18);
            sb6.append(" timeCost=");
            sb6.append(java.lang.System.currentTimeMillis() - currentTimeMillis);
            sb6.append(" updateTime=");
            sb6.append(i17);
            sb6.append(" pctr from ");
            sb6.append(f19);
            sb6.append('(');
            sb6.append(lVar != null ? (java.lang.Integer) lVar.f302834e : null);
            sb6.append('/');
            sb6.append(lVar != null ? (java.lang.Integer) lVar.f302833d : null);
            sb6.append(") to ");
            sb6.append(f18);
            sb6.append('(');
            sb6.append(i19);
            sb6.append('/');
            sb6.append(i27);
            sb6.append("),pctrCalTime=");
            sb6.append(this.f105905j);
            com.tencent.mars.xlog.Log.i("FinderRedDotFreqCtrlXStrategy", sb6.toString());
            g().put(i18, java.lang.Float.valueOf(f18));
            ((android.util.SparseArray) ((jz5.n) this.f105902g).getValue()).put(i18, new jz5.l(java.lang.Integer.valueOf(i27), java.lang.Integer.valueOf(i19)));
            this.f105903h = i17;
            r2 = jz5.f0.f302826a;
        }
        if (r2 == null) {
            com.tencent.mars.xlog.Log.e("FinderRedDotFreqCtrlXStrategy", str + " [updatePctr] but " + i18 + " record is null!");
        }
    }
}

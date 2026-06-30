package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718;

/* loaded from: classes8.dex */
public final class u6 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f187429a;

    /* renamed from: b, reason: collision with root package name */
    public final int f187430b;

    /* renamed from: c, reason: collision with root package name */
    public final int f187431c;

    /* renamed from: d, reason: collision with root package name */
    public final int f187432d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f187433e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f187434f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f187435g;

    /* renamed from: h, reason: collision with root package name */
    public int f187436h;

    /* renamed from: i, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.m6 f187437i;

    /* renamed from: j, reason: collision with root package name */
    public final int f187438j;

    /* renamed from: k, reason: collision with root package name */
    public r45.ng7 f187439k;

    /* renamed from: l, reason: collision with root package name */
    public r45.en f187440l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f187441m;

    public u6() {
        boolean z17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
        boolean z18 = false;
        if (((java.lang.Boolean) t70Var.o0().r()).booleanValue()) {
            z17 = true;
        } else {
            java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            z17 = false;
        }
        if (z17 || z65.c.a()) {
            z18 = true;
        } else {
            kb2.b bVar = kb2.b.f387758a;
        }
        this.f187429a = z18;
        this.f187430b = 60;
        this.f187431c = 3600;
        this.f187432d = 86400;
        this.f187433e = jz5.h.b(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.q6.f187320d);
        this.f187434f = jz5.h.b(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.s6.f187392d);
        this.f187435g = jz5.h.b(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.r6.f187338d);
        this.f187437i = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.m6.f187240d;
        this.f187438j = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.aj0.f207973a.K() ? ((java.lang.Number) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.z70.f(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.z70.f209965a, t70Var, "发现页红点x同屏限制pctr计算时长", e42.c0.clicfg_finder_red_dot_x_strategy_pctr_cal_time, 90, false, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.ih0.f208485d, 8, null)).intValue() : ((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.aj0.f207989j).mo141623x754a37bb()).r()).intValue();
    }

    public final void a(java.lang.String str, int i17) {
        boolean z17;
        if (i17 < 0) {
            boolean z18 = true;
            if (((java.lang.Boolean) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a.o0().r()).booleanValue()) {
                z17 = true;
            } else {
                java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                z17 = false;
            }
            if (!z17 && !z65.c.a()) {
                kb2.b bVar = kb2.b.f387758a;
                z18 = false;
            }
            if (!z18) {
                pm0.z.b(xy2.b.f539688b, "xStrategy_bt_err", false, null, null, false, false, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.n6(str), 60, null);
                return;
            }
            com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c("FinderRedDotFreqCtrlXStrategy", "checkBusinessType " + i17 + " error uuid=" + str, new java.lang.Object[0]);
            java.lang.Exception exc = new java.lang.Exception("FinderRedDotFreqCtrlXStrategy");
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("checkBusinessType ");
            sb6.append(i17);
            hc2.c.a(exc, sb6.toString());
        }
    }

    public final void b() {
        boolean z17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderRedDotFreqCtrlXStrategy", "[clear]");
        f().clear();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.x6 x6Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.x6.f187528a;
        try {
            boolean z18 = false;
            if (((java.lang.Boolean) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a.o0().r()).booleanValue()) {
                z17 = true;
            } else {
                java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                z17 = false;
            }
            if (z17 || z65.c.a()) {
                z18 = true;
            } else {
                kb2.b bVar = kb2.b.f387758a;
            }
            if (z18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderRedDotHistoryRecordProvider", "delete all");
            }
            ((com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26924x4cd4bae) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.x6.f187531d).mo141623x754a37bb()).m107087x90df30e9();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderRedDotHistoryRecordProvider", "[deleteAll] e:" + e17.getMessage());
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
            com.tencent.mm.plugin.finder.storage.t70 r1 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a
            lb2.j r1 = r1.o0()
            java.lang.Object r1 = r1.r()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            r2 = 1
            if (r1 != 0) goto L1b
            java.lang.String r1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a
            r1 = r0
            goto L1c
        L1b:
            r1 = r2
        L1c:
            if (r1 != 0) goto L27
            boolean r1 = z65.c.a()
            if (r1 != 0) goto L27
            kb2.b r1 = kb2.b.f387758a
            goto L28
        L27:
            r0 = r2
        L28:
            int r1 = r4.f187432d
            int r3 = r4.f187438j
            if (r0 == 0) goto L57
            com.tencent.mm.plugin.finder.extension.reddot.m6 r0 = r4.f187437i
            int r0 = r0.ordinal()
            if (r0 == 0) goto L52
            if (r0 == r2) goto L4b
            r1 = 2
            if (r0 != r1) goto L45
            int r5 = r5 - r6
            int r6 = r4.f187430b
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
            int r6 = r4.f187431c
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
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.u6.c(int, int):int");
    }

    public final void d(java.lang.String str, int i17, int i18, java.util.LinkedList linkedList) {
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        for (int i19 = 0; i19 < i18; i19++) {
            r45.tw3 tw3Var = new r45.tw3();
            tw3Var.set(0, java.lang.Integer.valueOf(i19));
            linkedList2.add(tw3Var);
        }
        boolean z17 = this.f187429a;
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
                arrayList.add(tw3Var2.m75939xb282bd08(0) + ":(" + tw3Var2.m75939xb282bd08(1) + ',' + tw3Var2.m75939xb282bd08(2) + ')');
            }
            sb6.append(arrayList);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderRedDotFreqCtrlXStrategy", sb6.toString());
        }
        java.util.Iterator it6 = linkedList.iterator();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(it6, "iterator(...)");
        int i27 = i18;
        while (it6.hasNext()) {
            java.lang.Object next = it6.next();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(next, "next(...)");
            r45.tw3 tw3Var3 = (r45.tw3) next;
            it6.remove();
            tw3Var3.set(0, java.lang.Integer.valueOf(tw3Var3.m75939xb282bd08(0) + i18));
            if (tw3Var3.m75939xb282bd08(0) == i27) {
                linkedList2.add(tw3Var3);
                i27++;
            } else if (tw3Var3.m75939xb282bd08(0) > i27) {
                int m75939xb282bd08 = tw3Var3.m75939xb282bd08(0);
                while (i27 < m75939xb282bd08) {
                    r45.tw3 tw3Var4 = new r45.tw3();
                    tw3Var4.set(0, java.lang.Integer.valueOf(i27));
                    linkedList2.add(tw3Var4);
                    i27++;
                }
                linkedList2.add(tw3Var3);
                i27 = tw3Var3.m75939xb282bd08(0) + 1;
            } else {
                tw3Var3.m75939xb282bd08(0);
            }
        }
        linkedList.clear();
        linkedList.addAll(kz5.n0.K0(linkedList2, this.f187438j));
        if (z17) {
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("[fixHistoryRecordItems] businessType=");
            sb7.append(i17);
            sb7.append(",after fix item=");
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(linkedList, 10));
            java.util.Iterator it7 = linkedList.iterator();
            while (it7.hasNext()) {
                r45.tw3 tw3Var5 = (r45.tw3) it7.next();
                arrayList2.add(tw3Var5.m75939xb282bd08(0) + ":(" + tw3Var5.m75939xb282bd08(1) + ',' + tw3Var5.m75939xb282bd08(2) + ')');
            }
            sb7.append(arrayList2);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderRedDotFreqCtrlXStrategy", sb7.toString());
        }
    }

    public final java.util.List e() {
        java.util.LinkedList m75941xfb821914;
        r45.en enVar = this.f187440l;
        java.util.LinkedList m75941xfb8219142 = enVar != null ? enVar.m75941xfb821914(0) : null;
        boolean z17 = m75941xfb8219142 == null || m75941xfb8219142.isEmpty();
        java.util.List list = kz5.p0.f395529d;
        if (!z17) {
            r45.en enVar2 = this.f187440l;
            java.util.LinkedList m75941xfb8219143 = enVar2 != null ? enVar2.m75941xfb821914(0) : null;
            return m75941xfb8219143 == null ? list : m75941xfb8219143;
        }
        boolean z18 = this.f187441m;
        boolean z19 = this.f187429a;
        if (!z18) {
            if (z19) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderRedDotFreqCtrlXStrategy", "[getBusinessTypeList] but disable x strategy!");
            }
            return list;
        }
        r45.ng7 ng7Var = this.f187439k;
        if (ng7Var != null && (m75941xfb821914 = ng7Var.m75941xfb821914(1)) != null) {
            list = new java.util.LinkedList(m75941xfb821914);
        }
        java.util.List F0 = kz5.n0.F0(list, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.o6(this));
        if (z19) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[getBusinessTypeList] before sorted list=");
            r45.ng7 ng7Var2 = this.f187439k;
            sb6.append(ng7Var2 != null ? ng7Var2.m75941xfb821914(1) : null);
            sb6.append(";after sorted list=");
            sb6.append(F0);
            sb6.append(";pctrMap=");
            sb6.append(g());
            sb6.append(";pctrCalTime=");
            sb6.append(this.f187438j);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderRedDotFreqCtrlXStrategy", sb6.toString());
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderRedDotFreqCtrlXStrategy", "[getBusinessTypeList] sorted list=" + F0);
        }
        return F0;
    }

    public final java.util.List f() {
        return (java.util.List) ((jz5.n) this.f187433e).mo141623x754a37bb();
    }

    public final android.util.SparseArray g() {
        return (android.util.SparseArray) this.f187434f.mo141623x754a37bb();
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
            byte[] bArr = bVar.f408036c;
            if (bArr == null || bArr.length == 0) {
                sb6.append("businessType=" + bVar.f408034a + " data is null!");
            } else {
                r45.sw3 b17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.x6.f187528a.b(bVar);
                sb6.append(java.lang.String.valueOf(b17 != null ? com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.qa.e(b17) : null));
            }
        }
        java.lang.String sb7 = sb6.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(sb7, "toString(...)");
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
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.u6.i(r45.ng7, r45.en):void");
    }

    public final boolean j(long j17, long j18) {
        boolean z17;
        boolean z18;
        int ordinal;
        if (((java.lang.Boolean) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a.o0().r()).booleanValue()) {
            z17 = true;
        } else {
            java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            z17 = false;
        }
        if (z17 || z65.c.a()) {
            z18 = true;
        } else {
            kb2.b bVar = kb2.b.f387758a;
            z18 = false;
        }
        if (z18 && (ordinal = this.f187437i.ordinal()) != 0) {
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
        return com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.T0(j17, j18);
    }

    public final void k(r45.sw3 sw3Var) {
        java.util.LinkedList<r45.tw3> m75941xfb821914 = sw3Var.m75941xfb821914(1);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getRecord_items(...)");
        for (r45.tw3 tw3Var : m75941xfb821914) {
            tw3Var.set(0, java.lang.Integer.valueOf(tw3Var.m75939xb282bd08(0) + 1));
        }
        java.util.LinkedList m75941xfb8219142 = sw3Var.m75941xfb821914(1);
        r45.tw3 tw3Var2 = new r45.tw3();
        tw3Var2.set(0, 0);
        m75941xfb8219142.add(0, tw3Var2);
        if (sw3Var.m75941xfb821914(1).size() > this.f187438j) {
            java.util.LinkedList m75941xfb8219143 = sw3Var.m75941xfb821914(1);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb8219143, "getRecord_items(...)");
            pm0.v.d0(m75941xfb8219143, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.t6(this));
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
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(f17, "<get-historyRecords>(...)");
            synchronized (f17) {
                java.util.Iterator it = f17.iterator();
                while (true) {
                    if (it.hasNext()) {
                        sw3Var2 = it.next();
                        if (((r45.sw3) sw3Var2).m75939xb282bd08(0) == i18) {
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
            java.util.LinkedList<r45.tw3> m75941xfb821914 = sw3Var.m75941xfb821914(1);
            if (m75941xfb821914 != null) {
                i19 = 0;
                for (r45.tw3 tw3Var : m75941xfb821914) {
                    i27 += tw3Var.m75939xb282bd08(1);
                    i19 += tw3Var.m75939xb282bd08(2);
                }
            } else {
                i19 = 0;
            }
            float f18 = i27 > 0 ? i19 / i27 : 0.0f;
            java.lang.Float f19 = (java.lang.Float) g().get(i18);
            jz5.l lVar = (jz5.l) ((android.util.SparseArray) ((jz5.n) this.f187435g).mo141623x754a37bb()).get(i18);
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
            sb6.append(lVar != null ? (java.lang.Integer) lVar.f384367e : null);
            sb6.append('/');
            sb6.append(lVar != null ? (java.lang.Integer) lVar.f384366d : null);
            sb6.append(") to ");
            sb6.append(f18);
            sb6.append('(');
            sb6.append(i19);
            sb6.append('/');
            sb6.append(i27);
            sb6.append("),pctrCalTime=");
            sb6.append(this.f187438j);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderRedDotFreqCtrlXStrategy", sb6.toString());
            g().put(i18, java.lang.Float.valueOf(f18));
            ((android.util.SparseArray) ((jz5.n) this.f187435g).mo141623x754a37bb()).put(i18, new jz5.l(java.lang.Integer.valueOf(i27), java.lang.Integer.valueOf(i19)));
            this.f187436h = i17;
            r2 = jz5.f0.f384359a;
        }
        if (r2 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderRedDotFreqCtrlXStrategy", str + " [updatePctr] but " + i18 + " record is null!");
        }
    }
}

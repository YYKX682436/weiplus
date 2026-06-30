package nx1;

/* loaded from: classes12.dex */
public class d {

    /* renamed from: g, reason: collision with root package name */
    public static volatile nx1.d f422814g;

    /* renamed from: a, reason: collision with root package name */
    public java.util.ArrayList f422815a = null;

    /* renamed from: b, reason: collision with root package name */
    public mx1.a f422816b = null;

    /* renamed from: c, reason: collision with root package name */
    public r45.gp0 f422817c = null;

    /* renamed from: d, reason: collision with root package name */
    public int f422818d = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f422819e = 0;

    /* renamed from: f, reason: collision with root package name */
    public int f422820f = 0;

    public static nx1.d q() {
        if (f422814g == null) {
            synchronized (nx1.d.class) {
                if (f422814g == null) {
                    f422814g = new nx1.d();
                }
            }
        }
        return f422814g;
    }

    public final java.lang.String A(java.lang.String str, int i17) {
        return java.lang.String.format("<div><object data-type=\"%d\" id=\"%s\" name=\"%s\" class=\"item item-\"></object></div>", java.lang.Integer.valueOf(i17), str, str);
    }

    public int B() {
        java.util.ArrayList arrayList = this.f422815a;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    public final void C(ix1.a aVar, boolean z17) {
        if (aVar == null) {
            return;
        }
        if (aVar.b() != 1) {
            if (z17) {
                this.f422820f++;
                return;
            } else {
                this.f422820f--;
                return;
            }
        }
        int d17 = com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.u1.d(((ix1.l) aVar).f376871s);
        if (z17) {
            this.f422819e += d17;
        } else {
            this.f422819e -= d17;
        }
    }

    public boolean a(int i17, ix1.a aVar, boolean z17) {
        boolean z18;
        mx1.a aVar2;
        synchronized (this) {
            if (aVar != null) {
                java.util.ArrayList arrayList = this.f422815a;
                if (arrayList != null && i17 >= 0 && i17 <= arrayList.size()) {
                    this.f422815a.add(i17, aVar);
                    C(aVar, true);
                    z18 = true;
                }
            }
            z18 = false;
        }
        if (z18 && z17 && (aVar2 = this.f422816b) != null) {
            aVar2.d5(i17);
            if (i17 > 0) {
                int i18 = i17 - 1;
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.AbstractActivityC13156x6363e8e1) this.f422816b).e7(i18, this.f422815a.size() - i18);
            } else {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.AbstractActivityC13156x6363e8e1) this.f422816b).e7(i17, this.f422815a.size() - i17);
            }
        }
        return z18;
    }

    public boolean b(ix1.a aVar, boolean z17) {
        boolean z18;
        mx1.a aVar2;
        synchronized (this) {
            if (aVar != null) {
                java.util.ArrayList arrayList = this.f422815a;
                if (arrayList != null) {
                    arrayList.add(aVar);
                    C(aVar, true);
                    z18 = true;
                }
            }
            z18 = false;
        }
        if (z18 && z17 && (aVar2 = this.f422816b) != null) {
            aVar2.d5(this.f422815a.size() - 1);
        }
        return z18;
    }

    public final boolean c(int i17, ix1.a aVar, boolean z17) {
        boolean z18;
        mx1.a aVar2;
        java.util.ArrayList arrayList;
        if (aVar == null || (arrayList = this.f422815a) == null || i17 < 0 || i17 > arrayList.size()) {
            z18 = false;
        } else {
            this.f422815a.add(i17, aVar);
            C(aVar, true);
            z18 = true;
        }
        if (z18 && z17 && (aVar2 = this.f422816b) != null) {
            aVar2.d5(i17);
            if (i17 > 0) {
                int i18 = i17 - 1;
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.AbstractActivityC13156x6363e8e1) this.f422816b).e7(i18, this.f422815a.size() - i18);
            } else {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.AbstractActivityC13156x6363e8e1) this.f422816b).e7(i17, this.f422815a.size() - i17);
            }
        }
        return z18;
    }

    public void d(int i17, int i18, boolean z17) {
        mx1.a aVar;
        mx1.a aVar2;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EditorDataManager", "checkMergeTextDataItem startPos: %d endPos: %d needNotify: %b", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Boolean.valueOf(z17));
        synchronized (this) {
            java.util.ArrayList arrayList = this.f422815a;
            if (arrayList == null) {
                return;
            }
            if (i17 <= 0) {
                i17 = 0;
            }
            if (i18 >= arrayList.size()) {
                i18 = this.f422815a.size() - 1;
            }
            int i19 = -1;
            while (i18 > i17) {
                ix1.a aVar3 = (ix1.a) this.f422815a.get(i18);
                int i27 = i18 - 1;
                ix1.a aVar4 = (ix1.a) this.f422815a.get(i27);
                if (aVar3 != null && aVar3.b() == 1 && aVar4 != null && aVar4.b() == 1) {
                    ix1.l lVar = (ix1.l) aVar3;
                    ix1.l lVar2 = (ix1.l) aVar4;
                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(lVar.f376871s)) {
                        android.text.Spanned a17 = lx1.a.a(lVar.f376871s);
                        android.text.Spanned a18 = lx1.a.a(lVar2.f376871s);
                        lVar2.f376871s += "<br/>" + lVar.f376871s;
                        if (lVar.f376845b) {
                            lVar2.f376845b = true;
                            lVar2.f376850g = false;
                            int i28 = lVar.f376846c;
                            if (i28 != -1 && i28 < a17.length()) {
                                lVar2.f376846c = a18.length() + 1 + lVar.f376846c;
                            }
                            lVar2.f376846c = -1;
                        } else if (lVar2.f376845b && lVar2.f376846c == -1) {
                            lVar2.f376846c = a18.length();
                        }
                    } else if (lVar.f376845b) {
                        lVar2.f376845b = true;
                        lVar2.f376850g = false;
                        lVar2.f376846c = -1;
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EditorDataManager", "checkMergeTextDataItem remove position: %d", java.lang.Integer.valueOf(i18));
                    x(i18, false);
                    if (z17 && (aVar2 = this.f422816b) != null) {
                        aVar2.x1(i18);
                    }
                    i19 = i27;
                }
                i18--;
            }
            if (i19 != -1 && z17 && (aVar = this.f422816b) != null) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.AbstractActivityC13156x6363e8e1) aVar).e7(i19, this.f422815a.size() - i19);
            }
            v();
        }
    }

    public boolean e(java.util.ArrayList arrayList) {
        int i17;
        java.util.ArrayList arrayList2 = this.f422815a;
        if (arrayList2 != null) {
            java.util.Iterator it = arrayList2.iterator();
            i17 = 0;
            while (it.hasNext()) {
                ix1.a aVar = (ix1.a) it.next();
                if ((aVar instanceof ix1.m) || (aVar instanceof ix1.j) || (aVar instanceof ix1.b)) {
                    i17 = (int) (i17 + ((ix1.d) aVar).f376859o);
                }
            }
        } else {
            i17 = 0;
        }
        if (arrayList != null) {
            java.util.Iterator it6 = arrayList.iterator();
            while (it6.hasNext()) {
                ix1.a aVar2 = (ix1.a) it6.next();
                if ((aVar2 instanceof ix1.m) || (aVar2 instanceof ix1.j) || (aVar2 instanceof ix1.b)) {
                    i17 = (int) (i17 + ((ix1.d) aVar2).f376859o);
                }
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EditorDataManager", "checkReachMaxAttachLimit: %dM", java.lang.Integer.valueOf((i17 / 1024) / 1024));
        return i17 > 104857600;
    }

    public boolean f(int i17, int i18) {
        boolean z17 = i17 >= 0;
        boolean z18 = i18 >= 0;
        if (!z17 || this.f422819e + i17 <= 16384) {
            return z18 && this.f422820f + i18 > 30;
        }
        return true;
    }

    public boolean g(java.util.ArrayList arrayList) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.util.Iterator it = arrayList.iterator();
        int i17 = 0;
        while (it.hasNext()) {
            ix1.a aVar = (ix1.a) it.next();
            if (aVar.b() != 1) {
                i17++;
            } else {
                sb6.append(((ix1.l) aVar).f376871s);
            }
        }
        return f(com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.u1.d(sb6.toString()), i17);
    }

    public void h(boolean z17) {
        mx1.a aVar;
        boolean z18 = true;
        java.lang.Object[] objArr = new java.lang.Object[1];
        java.util.ArrayList arrayList = this.f422815a;
        objArr[0] = java.lang.Integer.valueOf(arrayList != null ? arrayList.size() : 0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EditorDataManager", "clear mDataList, size:%d", objArr);
        synchronized (this) {
            java.util.ArrayList arrayList2 = this.f422815a;
            if (arrayList2 != null) {
                arrayList2.clear();
            } else {
                z18 = false;
            }
        }
        this.f422820f = 0;
        this.f422819e = 0;
        if (z18 && z17 && (aVar = this.f422816b) != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.AbstractActivityC13156x6363e8e1) aVar).d7();
        }
    }

    public void i() {
        synchronized (this) {
            java.util.ArrayList arrayList = this.f422815a;
            if (arrayList != null) {
                java.util.Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ix1.a aVar = (ix1.a) it.next();
                    aVar.f376845b = false;
                    aVar.f376850g = false;
                }
            }
        }
    }

    public final void j() {
        java.util.ArrayList arrayList = this.f422815a;
        if (arrayList != null) {
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ix1.a aVar = (ix1.a) it.next();
                aVar.f376845b = false;
                aVar.f376850g = false;
            }
        }
    }

    public java.lang.String k() {
        java.lang.String sb6;
        java.util.ArrayList arrayList;
        synchronized (this) {
            if (this.f422818d == 0 && (arrayList = this.f422815a) != null) {
                java.util.Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ix1.d dVar = (ix1.d) ((ix1.a) it.next());
                    if (dVar.f376856l.startsWith("WeNote_")) {
                        int P = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(dVar.f376856l.substring(7), -1);
                        int i17 = this.f422818d;
                        if (P <= i17) {
                            P = i17;
                        }
                        this.f422818d = P;
                    }
                }
            }
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
            sb7.append("WeNote_");
            int i18 = this.f422818d + 1;
            this.f422818d = i18;
            sb7.append(i18);
            sb6 = sb7.toString();
        }
        return sb6;
    }

    public ix1.a l(int i17) {
        java.util.ArrayList arrayList = this.f422815a;
        if (arrayList == null || i17 < 0 || i17 >= arrayList.size()) {
            return null;
        }
        return (ix1.a) this.f422815a.get(i17);
    }

    public java.util.ArrayList m() {
        if (this.f422815a == null) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        synchronized (this) {
            java.util.Iterator it = this.f422815a.iterator();
            while (it.hasNext()) {
                arrayList.add(com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.u1.a((ix1.a) it.next()));
            }
        }
        return arrayList;
    }

    public int n() {
        synchronized (this) {
            if (this.f422815a == null) {
                return -1;
            }
            for (int i17 = 0; i17 < this.f422815a.size(); i17++) {
                ix1.a aVar = (ix1.a) this.f422815a.get(i17);
                if (aVar != null && aVar.b() != -3 && aVar.b() != -2) {
                    return i17;
                }
            }
            return -1;
        }
    }

    public java.lang.String o() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        synchronized (this) {
            java.util.ArrayList arrayList = this.f422815a;
            if (arrayList != null && arrayList.size() > 0) {
                for (int i17 = 0; i17 < this.f422815a.size(); i17++) {
                    ix1.a aVar = (ix1.a) this.f422815a.get(i17);
                    switch (aVar.b()) {
                        case -1:
                            sb6.append("<hr/>");
                            break;
                        case 1:
                            ix1.l lVar = (ix1.l) aVar;
                            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(lVar.f376871s)) {
                                sb6.append("<br/>");
                                break;
                            } else {
                                if (!lVar.f376871s.startsWith("<wx-p>")) {
                                    sb6.append("<wx-p>");
                                }
                                sb6.append(lVar.f376871s);
                                if (lVar.f376871s.endsWith("</wx-p>")) {
                                    break;
                                } else {
                                    sb6.append("</wx-p>");
                                    break;
                                }
                            }
                        case 2:
                            sb6.append(A(((ix1.j) aVar).f376856l, 2));
                            break;
                        case 3:
                            sb6.append(A(((ix1.e) aVar).f376856l, 3));
                            break;
                        case 4:
                            sb6.append(A(((ix1.n) aVar).f376856l, 4));
                            break;
                        case 5:
                            sb6.append(A(((ix1.b) aVar).f376856l, 5));
                            break;
                        case 6:
                            sb6.append(A(((ix1.m) aVar).f376856l, 6));
                            break;
                    }
                }
                return new java.lang.StringBuilder(sb6.toString().replaceAll("\n", "<br/>")).toString();
            }
            return "";
        }
    }

    public int p() {
        synchronized (this) {
            java.util.ArrayList arrayList = this.f422815a;
            if (arrayList == null) {
                return -1;
            }
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ix1.a aVar = (ix1.a) this.f422815a.get(size);
                if (aVar != null && aVar.b() != -3 && aVar.b() != -2) {
                    return size;
                }
            }
            return -1;
        }
    }

    public int r(ix1.a aVar, com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.p1339x633fb29.p1340xb9121c89.p1341x31c90fad.C13158x154ec45a c13158x154ec45a, boolean z17, boolean z18, boolean z19, boolean z27, boolean z28) {
        if (aVar == null) {
            return -1;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(aVar);
        return s(arrayList, c13158x154ec45a, z17, z18, z19, z27, z28);
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0140 A[Catch: all -> 0x0236, TryCatch #0 {, blocks: (B:31:0x0059, B:32:0x0065, B:34:0x006b, B:36:0x0076, B:38:0x007a, B:41:0x0085, B:48:0x017b, B:83:0x0088, B:85:0x0092, B:87:0x0094, B:89:0x009d, B:91:0x00a3, B:93:0x00d0, B:95:0x00d8, B:96:0x00e1, B:98:0x00eb, B:100:0x00fa, B:101:0x0102, B:102:0x0135, B:103:0x013a, B:105:0x0140, B:108:0x014f, B:114:0x010f, B:116:0x0115, B:118:0x011d, B:119:0x0125, B:120:0x0128, B:122:0x012d, B:124:0x0131, B:125:0x0152, B:127:0x0158, B:128:0x015a, B:129:0x0160, B:131:0x0166, B:134:0x0175), top: B:29:0x0057 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int s(java.util.ArrayList r6, com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.p1339x633fb29.p1340xb9121c89.p1341x31c90fad.C13158x154ec45a r7, boolean r8, boolean r9, boolean r10, boolean r11, boolean r12) {
        /*
            Method dump skipped, instructions count: 577
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: nx1.d.s(java.util.ArrayList, com.tencent.mm.plugin.component.editor.model.nativenote.manager.WXRTEditText, boolean, boolean, boolean, boolean, boolean):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00fc A[Catch: all -> 0x01cc, TryCatch #0 {, blocks: (B:25:0x0047, B:27:0x004c, B:29:0x0052, B:31:0x005d, B:33:0x0063, B:36:0x006b, B:38:0x008c, B:40:0x0094, B:41:0x009d, B:43:0x00a7, B:45:0x00b6, B:46:0x00be, B:47:0x00f1, B:48:0x00f6, B:50:0x00fc, B:53:0x010b, B:59:0x0159, B:86:0x00cb, B:88:0x00d1, B:90:0x00d9, B:91:0x00e1, B:92:0x00e4, B:94:0x00e9, B:96:0x00ed, B:97:0x0110, B:100:0x0120, B:101:0x0136, B:103:0x011c, B:105:0x013a, B:106:0x013c, B:107:0x0141, B:109:0x0147, B:112:0x0156), top: B:24:0x0047 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int t(java.util.ArrayList r5, int r6, int r7, int r8, int r9, boolean r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 472
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: nx1.d.t(java.util.ArrayList, int, int, int, int, boolean, boolean):int");
    }

    public final void u(ix1.a aVar) {
        java.util.ArrayList arrayList;
        if (aVar == null) {
            return;
        }
        ix1.d dVar = (ix1.d) aVar;
        if (dVar.b() > 1 && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(dVar.f376856l)) {
            if (this.f422818d == 0 && (arrayList = this.f422815a) != null) {
                java.util.Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ix1.d dVar2 = (ix1.d) ((ix1.a) it.next());
                    if (dVar2.f376856l.startsWith("WeNote_")) {
                        int P = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(dVar2.f376856l.substring(7), -1);
                        int i17 = this.f422818d;
                        if (P <= i17) {
                            P = i17;
                        }
                        this.f422818d = P;
                    }
                }
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("WeNote_");
            int i18 = this.f422818d + 1;
            this.f422818d = i18;
            sb6.append(i18);
            dVar.f376856l = sb6.toString();
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(aVar.f376844a)) {
            aVar.f376844a = hx1.b.a(aVar.toString(), 18);
        }
    }

    public void v() {
        gm0.j1.e().j(new nx1.c(this));
    }

    public boolean w(int i17, boolean z17) {
        boolean z18;
        mx1.a aVar;
        synchronized (this) {
            java.util.ArrayList arrayList = this.f422815a;
            z18 = false;
            if (arrayList != null && i17 >= 0 && i17 < arrayList.size()) {
                C((ix1.a) this.f422815a.get(i17), false);
                ((ix1.a) this.f422815a.remove(i17)).c();
                z18 = true;
            }
        }
        if (z18 && z17 && (aVar = this.f422816b) != null) {
            aVar.x1(i17);
            if (i17 > 0) {
                int i18 = i17 - 1;
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.AbstractActivityC13156x6363e8e1) this.f422816b).e7(i18, this.f422815a.size() - i18);
            } else {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.AbstractActivityC13156x6363e8e1) this.f422816b).e7(i17, this.f422815a.size() - i17);
            }
        }
        return z18;
    }

    public final boolean x(int i17, boolean z17) {
        mx1.a aVar;
        java.util.ArrayList arrayList = this.f422815a;
        boolean z18 = false;
        if (arrayList != null && i17 >= 0 && i17 < arrayList.size()) {
            C((ix1.a) this.f422815a.get(i17), false);
            ((ix1.a) this.f422815a.remove(i17)).c();
            z18 = true;
        }
        if (z18 && z17 && (aVar = this.f422816b) != null) {
            aVar.x1(i17);
            if (i17 > 0) {
                int i18 = i17 - 1;
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.AbstractActivityC13156x6363e8e1) this.f422816b).e7(i18, this.f422815a.size() - i18);
            } else {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.AbstractActivityC13156x6363e8e1) this.f422816b).e7(i17, this.f422815a.size() - i17);
            }
        }
        return z18;
    }

    public void y(int i17, boolean z17) {
        synchronized (this) {
            java.util.ArrayList arrayList = this.f422815a;
            if (arrayList != null && i17 >= 0 && i17 < arrayList.size()) {
                for (int i18 = 0; i18 < this.f422815a.size(); i18++) {
                    if (i18 == i17) {
                        ((ix1.a) this.f422815a.get(i18)).f376845b = true;
                        ((ix1.a) this.f422815a.get(i18)).f376850g = z17;
                    } else {
                        ((ix1.a) this.f422815a.get(i18)).f376845b = false;
                        ((ix1.a) this.f422815a.get(i18)).f376850g = false;
                    }
                }
            }
        }
    }

    public void z(int i17, boolean z17, boolean z18) {
        mx1.a aVar;
        mx1.a aVar2;
        synchronized (this) {
            java.util.ArrayList arrayList = this.f422815a;
            if (arrayList == null) {
                return;
            }
            if (i17 >= 0 && i17 < arrayList.size()) {
                ix1.a aVar3 = (ix1.a) this.f422815a.get(i17);
                if (aVar3 != null && aVar3.f376851h != z17) {
                    aVar3.f376851h = z17;
                    if (z18 && (aVar2 = this.f422816b) != null) {
                        aVar2.j3(i17, 0L);
                    }
                }
            } else if (i17 == -1) {
                for (int i18 = 0; i18 < this.f422815a.size(); i18++) {
                    ix1.a aVar4 = (ix1.a) this.f422815a.get(i18);
                    if (aVar4 != null && aVar4.f376851h != z17) {
                        aVar4.f376851h = z17;
                        if (z18 && (aVar = this.f422816b) != null) {
                            aVar.j3(i18, 0L);
                        }
                    }
                }
            }
        }
    }
}

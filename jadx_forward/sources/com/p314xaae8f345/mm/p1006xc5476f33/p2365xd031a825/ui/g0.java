package com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui;

/* loaded from: classes9.dex */
public class g0 {

    /* renamed from: a, reason: collision with root package name */
    public final vr4.j0 f261812a;

    /* renamed from: b, reason: collision with root package name */
    public java.util.Map f261813b;

    /* renamed from: c, reason: collision with root package name */
    public java.util.Map f261814c;

    public g0(vr4.j0 j0Var) {
        java.util.LinkedList linkedList;
        this.f261812a = null;
        this.f261813b = null;
        this.f261814c = null;
        iz5.a.d(null, j0Var);
        this.f261812a = j0Var;
        this.f261813b = new java.util.HashMap();
        java.util.LinkedList linkedList2 = j0Var.f521290h;
        if (linkedList2 != null) {
            for (int i17 = 0; i17 < linkedList2.size(); i17++) {
                vr4.i1 i1Var = (vr4.i1) linkedList2.get(i17);
                this.f261813b.put(i1Var.f521271h + "", i1Var);
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FavorLogicHelper", "func[initData] favorList null");
        }
        this.f261814c = new java.util.HashMap();
        vr4.k0 k0Var = j0Var.f521291i;
        if (k0Var == null || (linkedList = k0Var.f521303d) == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FavorLogicHelper", "func[initData] favorComposeList null");
            return;
        }
        for (int i18 = 0; i18 < linkedList.size(); i18++) {
            vr4.l0 l0Var = (vr4.l0) linkedList.get(i18);
            this.f261814c.put(l0Var.f521306d, l0Var);
        }
    }

    public static java.util.List h(int i17, java.lang.String str) {
        java.util.ArrayList a17 = ((pg0.a3) i95.n0.c(pg0.a3.class)).fj().a(true);
        if (!(i17 != 0)) {
            return a17;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i18 = 0; i18 < a17.size(); i18++) {
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) ? !((com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c) a17.get(i18)).f69223x58802fcb.equals(str) : ((com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c) a17.get(i18)).f69223x58802fcb.equals("CFT")) {
                arrayList.add((com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c) a17.get(i18));
            }
        }
        return arrayList;
    }

    public static boolean j(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19098xdf4bc178 c19098xdf4bc178, com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c c19091x9511676c) {
        java.lang.String str;
        java.util.List list;
        if (c19091x9511676c == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FavorLogicHelper", "curBankcard null");
            return true;
        }
        if (c19098xdf4bc178 != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c19098xdf4bc178.f261200d)) {
            if ((c19098xdf4bc178.f261201e != 0) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c19098xdf4bc178.f261202f) && (list = c19098xdf4bc178.f261205i) != null && list.contains(c19091x9511676c.f69225xed6d60f6)) {
                return false;
            }
        }
        return (c19098xdf4bc178.f261201e != 0) && (!(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c19098xdf4bc178.f261202f) || (str = c19091x9511676c.f69223x58802fcb) == null || str.equals(c19098xdf4bc178.f261202f)) || (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c19098xdf4bc178.f261202f) && c19091x9511676c.f69223x58802fcb.equals("CFT")));
    }

    public static java.lang.String[] k(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return null;
        }
        return str.split("-");
    }

    public java.lang.String a(java.lang.String str) {
        java.util.ArrayList a17 = ((pg0.a3) i95.n0.c(pg0.a3.class)).fj().a(true);
        java.util.HashMap hashMap = new java.util.HashMap();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i17 = 0; i17 < a17.size(); i17++) {
            hashMap.put(((com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c) a17.get(i17)).f69223x58802fcb, 0);
        }
        java.lang.String[] k17 = k(str);
        if (k17 != null) {
            for (java.lang.String str2 : k17) {
                vr4.i1 i1Var = (vr4.i1) ((java.util.HashMap) this.f261813b).get(str2);
                if (i1Var != null) {
                    if (i1Var.f521278r != 0) {
                        if (hashMap.containsKey(i1Var.f521279s) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(i1Var.f521279s)) {
                            arrayList.add(str2);
                        }
                    }
                }
                arrayList.add(str2);
            }
        }
        if (arrayList.size() == 0) {
            return "0";
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        for (int i18 = 0; i18 < arrayList.size(); i18++) {
            sb6.append(((java.lang.String) arrayList.get(i18)) + "");
            if (i18 < arrayList.size() - 1) {
                sb6.append("-");
            }
        }
        return sb6.toString();
    }

    public java.util.Map b(java.lang.String str, boolean z17) {
        java.util.LinkedList linkedList;
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.f0 f0Var;
        java.util.HashMap hashMap = new java.util.HashMap();
        vr4.k0 k0Var = this.f261812a.f521291i;
        if (k0Var == null || (linkedList = k0Var.f521303d) == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FavorLogicHelper", "favorComposeList null or favorComposeList.favorComposeInfo null");
        } else {
            double d17 = ((java.util.HashMap) this.f261814c).containsKey(str) ? ((vr4.l0) ((java.util.HashMap) this.f261814c).get(str)).f521307e : 0.0d;
            for (int i17 = 0; i17 < linkedList.size(); i17++) {
                vr4.l0 l0Var = (vr4.l0) linkedList.get(i17);
                java.lang.String[] k17 = k((!str.equals("0") || l0Var.equals("0")) ? (!l0Var.f521306d.startsWith(str) || str.equals(l0Var.f521306d)) ? null : l0Var.f521306d.replace(str.concat("-"), "") : l0Var.f521306d);
                if (k17 != null && k17.length > 0) {
                    vr4.i1 i1Var = (vr4.i1) ((java.util.HashMap) this.f261813b).get(k17[0]);
                    if (i1Var != null) {
                        if ((i1Var.f521278r != 0) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(i1Var.f521279s) && i1Var.f521282v.size() <= 0 && ((z17 || !i1Var.f521279s.equalsIgnoreCase("CFT")) && ((f0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.f0) hashMap.get(i1Var.f521279s)) == null || l0Var.f521307e > f0Var.f261792a.f521307e))) {
                            com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.f0 f0Var2 = new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.f0();
                            f0Var2.f261792a = l0Var;
                            f0Var2.f261793b = i1Var.f521280t;
                            f0Var2.f261794c = l0Var.f521307e - d17;
                            java.lang.String str2 = i1Var.f521279s;
                            f0Var2.f261795d = str2;
                            hashMap.put(str2, f0Var2);
                        }
                    }
                }
            }
        }
        return hashMap;
    }

    public java.lang.String c(java.lang.String str, boolean z17) {
        java.lang.String[] k17 = k(str);
        if (k17 == null) {
            return "0";
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        int i17 = 0;
        while (true) {
            if (i17 >= k17.length) {
                break;
            }
            vr4.i1 i1Var = (vr4.i1) this.f261813b.get(k17[i17] + "");
            if (i1Var != null) {
                if (!(i1Var.f521278r != 0) || (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(i1Var.f521279s) && !z17)) {
                    sb6.append(k17[i17]);
                    sb6.append("-");
                }
            }
            i17++;
        }
        return sb6.length() == 0 ? "0" : sb6.delete(sb6.length() - 1, sb6.length()).toString();
    }

    public java.util.Map d(java.lang.String str, boolean z17) {
        java.util.LinkedList linkedList;
        int i17;
        java.util.HashMap hashMap = new java.util.HashMap();
        vr4.k0 k0Var = this.f261812a.f521291i;
        if (k0Var == null || (linkedList = k0Var.f521303d) == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FavorLogicHelper", "favorComposeList null or favorComposeList.favorComposeInfo null");
        } else {
            double d17 = ((java.util.HashMap) this.f261814c).containsKey(str) ? ((vr4.l0) ((java.util.HashMap) this.f261814c).get(str)).f521307e : 0.0d;
            char c17 = 0;
            int i18 = 0;
            while (i18 < linkedList.size()) {
                vr4.l0 l0Var = (vr4.l0) linkedList.get(i18);
                java.lang.String[] k17 = k((!str.equals("0") || l0Var.equals("0")) ? (!l0Var.f521306d.startsWith(str) || str.equals(l0Var.f521306d)) ? null : l0Var.f521306d.replace(str.concat("-"), "") : l0Var.f521306d);
                if (k17 != null && k17.length > 0) {
                    vr4.i1 i1Var = (vr4.i1) ((java.util.HashMap) this.f261813b).get(k17[c17]);
                    if (i1Var != null) {
                        if ((i1Var.f521278r != 0 ? (char) 1 : c17) != 0) {
                            java.util.LinkedList linkedList2 = i1Var.f521282v;
                            if (linkedList2.size() > 0 && (z17 || !i1Var.f521279s.equalsIgnoreCase("CFT"))) {
                                java.util.Iterator it = linkedList2.iterator();
                                while (it.hasNext()) {
                                    java.lang.String b17 = x51.j1.b((com.p314xaae8f345.mm.p2495xc50a8b8b.g) it.next());
                                    com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.f0 f0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.f0) hashMap.get(b17);
                                    if (f0Var != null) {
                                        i17 = i18;
                                        if (l0Var.f521307e <= f0Var.f261792a.f521307e) {
                                            i18 = i17;
                                        }
                                    } else {
                                        i17 = i18;
                                    }
                                    com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.f0 f0Var2 = new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.f0();
                                    f0Var2.f261792a = l0Var;
                                    f0Var2.f261793b = i1Var.f521280t;
                                    f0Var2.f261794c = l0Var.f521307e - d17;
                                    f0Var2.f261795d = i1Var.f521279s;
                                    hashMap.put(b17, f0Var2);
                                    i18 = i17;
                                }
                            }
                        }
                    }
                }
                i18++;
                c17 = 0;
            }
        }
        return hashMap;
    }

    public vr4.l0 e(java.lang.String str, boolean z17) {
        if (!"0".equals(str) && this.f261814c.containsKey(str)) {
            return (vr4.l0) this.f261814c.get(str);
        }
        java.util.Iterator it = this.f261814c.keySet().iterator();
        while (it.hasNext()) {
            vr4.l0 l0Var = (vr4.l0) this.f261814c.get((java.lang.String) it.next());
            java.util.LinkedList linkedList = l0Var.f521309g;
            if (linkedList != null && linkedList.size() != 0) {
                java.util.LinkedList linkedList2 = l0Var.f521309g;
                int size = linkedList2.size();
                java.util.Iterator it6 = linkedList2.iterator();
                int i17 = 0;
                while (it6.hasNext()) {
                    vr4.j jVar = (vr4.j) it6.next();
                    if (!this.f261813b.containsKey(jVar.f521283d)) {
                        break;
                    }
                    vr4.i1 i1Var = (vr4.i1) this.f261813b.get(jVar.f521283d);
                    if (i1Var.f521279s.equals("") && i1Var.f521282v.size() == 0 && (!z17 || i1Var.f521278r == 0)) {
                        i17++;
                    }
                }
                if (i17 > 0 && i17 == size) {
                    return l0Var;
                }
            }
        }
        return null;
    }

    public vr4.l0 f(java.lang.String str) {
        return (vr4.l0) this.f261814c.get(str);
    }

    public com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19098xdf4bc178 g(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19098xdf4bc178 c19098xdf4bc178 = new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19098xdf4bc178();
        java.lang.Object obj = ((java.util.HashMap) this.f261814c).get(str);
        vr4.j0 j0Var = this.f261812a;
        if (obj == null) {
            c19098xdf4bc178.f261200d = "0";
            if (j0Var != null) {
                c19098xdf4bc178.f261203g = j0Var.f521289g;
            }
            c19098xdf4bc178.f261201e = 0;
            return c19098xdf4bc178;
        }
        c19098xdf4bc178.f261200d = str;
        if (j0Var != null) {
            c19098xdf4bc178.f261203g = j0Var.f521289g;
        }
        c19098xdf4bc178.f261201e = 0;
        java.lang.String[] k17 = k(str);
        if (k17 == null) {
            return c19098xdf4bc178;
        }
        int length = k17.length - 1;
        while (true) {
            if (length < 0) {
                break;
            }
            vr4.i1 i1Var = (vr4.i1) ((java.util.HashMap) this.f261813b).get(k17[length]);
            if (i1Var != null) {
                if (!(i1Var.f521278r != 0)) {
                    break;
                }
                c19098xdf4bc178.f261201e = 1;
                java.util.LinkedList linkedList = i1Var.f521282v;
                if (linkedList != null && linkedList.size() > 0) {
                    c19098xdf4bc178.f261205i = new java.util.LinkedList();
                    java.util.Iterator it = linkedList.iterator();
                    while (it.hasNext()) {
                        c19098xdf4bc178.f261205i.add(x51.j1.b((com.p314xaae8f345.mm.p2495xc50a8b8b.g) it.next()));
                    }
                }
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(i1Var.f521279s)) {
                    c19098xdf4bc178.f261202f = i1Var.f521279s;
                    break;
                }
            }
            length--;
        }
        return c19098xdf4bc178;
    }

    public java.util.List i() {
        java.util.ArrayList a17 = ((pg0.a3) i95.n0.c(pg0.a3.class)).fj().a(true);
        java.util.HashMap hashMap = new java.util.HashMap();
        for (int i17 = 0; i17 < a17.size(); i17++) {
            hashMap.put(((com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c) a17.get(i17)).f69223x58802fcb, 0);
        }
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.LinkedList linkedList2 = this.f261812a.f521290h;
        if (linkedList2 != null) {
            for (int i18 = 0; i18 < linkedList2.size(); i18++) {
                vr4.i1 i1Var = (vr4.i1) linkedList2.get(i18);
                if (i1Var != null) {
                    if (i1Var.f521278r != 0) {
                        if (hashMap.containsKey(i1Var.f521279s) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(i1Var.f521279s)) {
                            linkedList.add(i1Var);
                        }
                    }
                }
                linkedList.add(i1Var);
            }
        }
        return linkedList;
    }
}

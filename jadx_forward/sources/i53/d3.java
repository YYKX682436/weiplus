package i53;

/* loaded from: classes8.dex */
public class d3 {

    /* renamed from: o, reason: collision with root package name */
    public static final java.lang.String f370078o = com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1738x38a607f9.p1739x36f002.m.b(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1738x38a607f9.p1739x36f002.l.ONE_MONTH) + "haowan/";

    /* renamed from: p, reason: collision with root package name */
    public static int f370079p = 5;

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f370080a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.LinkedList f370081b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f370082c;

    /* renamed from: d, reason: collision with root package name */
    public i53.c3 f370083d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.Set f370084e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.Set f370085f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.Set f370086g;

    /* renamed from: h, reason: collision with root package name */
    public int f370087h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f370088i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f370089j;

    /* renamed from: k, reason: collision with root package name */
    public final java.util.HashMap f370090k;

    /* renamed from: l, reason: collision with root package name */
    public final java.lang.Runnable f370091l;

    /* renamed from: m, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.n0 f370092m;

    /* renamed from: n, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.m0 f370093n;

    public d3(java.lang.String str, int i17, java.util.LinkedList linkedList, boolean z17) {
        boolean z18;
        android.database.Cursor m145256x1d3f4980;
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        this.f370081b = linkedList2;
        this.f370084e = new java.util.HashSet();
        this.f370085f = new java.util.HashSet();
        this.f370086g = new java.util.HashSet();
        new java.util.HashMap();
        this.f370088i = false;
        this.f370089j = false;
        this.f370090k = new java.util.HashMap();
        this.f370091l = new i53.x2(this);
        this.f370092m = new i53.z2(this);
        this.f370093n = new i53.a3(this);
        this.f370080a = str;
        this.f370082c = z17;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(linkedList)) {
            return;
        }
        if (i17 == 2) {
            linkedList2.add((java.lang.String) linkedList.get(0));
        } else {
            linkedList2.addAll(linkedList);
        }
        i53.w wi6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.s1) ((m33.s1) i95.n0.c(m33.s1.class))).wi();
        wi6.getClass();
        if (str == null || (m145256x1d3f4980 = wi6.m145256x1d3f4980(java.lang.String.format("select * from %s where %s=\"%s\"", "GameHaowanMedia", "hostTaskId", str), new java.lang.String[0])) == null) {
            z18 = false;
        } else {
            z18 = m145256x1d3f4980.getCount() != 0;
            m145256x1d3f4980.close();
        }
        if (!z18) {
            java.util.Iterator it = linkedList2.iterator();
            while (it.hasNext()) {
                java.lang.String str2 = (java.lang.String) it.next();
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.AbstractC19284xdca64a7 b17 = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2413x7e9e6052.z.Zi().b(str2);
                if (b17 != null) {
                    i53.u uVar = new i53.u();
                    uVar.f67105x88be67a1 = b17.f264269e;
                    uVar.f67106xaca5bdda = b17.f264273i;
                    uVar.f67101xf1e9b966 = b17.f264271g;
                    uVar.f67110xe9deda16 = b17.f264270f;
                    uVar.f67107x1a330c39 = b17.f264275n;
                    uVar.f67109x22618426 = b17.f264276o;
                    uVar.f67113x2a070e41 = b17.f264277p;
                    uVar.f67102xfd0bc00c = b17.f264278q;
                    uVar.f67100x7d39d63b = b17.f264283v.getInt("mark_edit_flag", 0);
                    if (b17 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.C19287x4a9b6f36) {
                        uVar.f67099xa7075739 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.C19287x4a9b6f36) b17).f264287w;
                    }
                    if (b17 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.C19285xc6d09416) {
                        uVar.f67104x2945e2b5 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.C19285xc6d09416) b17).f264284w;
                    }
                    uVar.f67103x780729ad = this.f370080a;
                    if (b17.f264275n == 1) {
                        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                        sb6.append(f370078o);
                        sb6.append("microMsg.compress.");
                        sb6.append(java.lang.System.currentTimeMillis());
                        sb6.append((str2 == null ? "" : str2).hashCode() & 65535);
                        java.lang.String sb7 = sb6.toString();
                        if (this.f370082c && c(sb7, b17.f264271g)) {
                            uVar.f67098x6210f1cc = sb7;
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Haowan.GameUploadMediaEngine", "compress, originSize: %d, dstSize: %d", java.lang.Long.valueOf(com.p314xaae8f345.mm.vfs.w6.k(b17.f264271g)), java.lang.Long.valueOf(com.p314xaae8f345.mm.vfs.w6.k(uVar.f67098x6210f1cc)));
                            b17.f264271g = sb7;
                            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2413x7e9e6052.z.Zi().a(b17);
                        } else {
                            uVar.f67098x6210f1cc = b17.f264271g;
                        }
                    }
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.s1) ((m33.s1) i95.n0.c(m33.s1.class))).wi().mo880xb970c2b9(uVar);
                }
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.i4 bj6 = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2413x7e9e6052.z.bj();
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.n0 n0Var = this.f370092m;
        java.util.concurrent.CopyOnWriteArraySet copyOnWriteArraySet = bj6.f264470d;
        if (copyOnWriteArraySet != null && n0Var != null && !copyOnWriteArraySet.contains(n0Var)) {
            copyOnWriteArraySet.add(n0Var);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2413x7e9e6052.z.bj().b(this.f370093n);
    }

    public static int a(i53.d3 d3Var, int i17) {
        d3Var.getClass();
        if (i17 == 4) {
            return 2;
        }
        return i17 == 1 ? 1 : 0;
    }

    public void b() {
        this.f370089j = true;
        java.util.LinkedList linkedList = this.f370081b;
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2413x7e9e6052.z.bj().f((java.lang.String) it.next());
        }
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.s1) ((m33.s1) i95.n0.c(m33.s1.class))).wi().y0(linkedList);
        d();
    }

    public final boolean c(java.lang.String str, java.lang.String str2) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.y1.c(str2)) {
            return false;
        }
        try {
            ((et.k) ((ft.z3) i95.n0.c(ft.z3.class))).getClass();
            boolean a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.e0.a(str, str2, 1440, 1080, 70);
            if (a17) {
                com.p314xaae8f345.mm.vfs.w6.h(str2);
            }
            return a17;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Haowan.GameUploadMediaEngine", e17, "", new java.lang.Object[0]);
            return false;
        }
    }

    public void d() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2413x7e9e6052.z.bj().i(this.f370092m);
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.i4 bj6 = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2413x7e9e6052.z.bj();
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.m0 m0Var = this.f370093n;
        java.util.concurrent.CopyOnWriteArraySet copyOnWriteArraySet = bj6.f264471e;
        if (copyOnWriteArraySet != null && m0Var != null) {
            copyOnWriteArraySet.remove(m0Var);
        }
        ((java.util.HashSet) this.f370084e).clear();
        ((java.util.HashSet) this.f370086g).clear();
        ((java.util.HashSet) this.f370085f).clear();
        this.f370081b.clear();
        this.f370083d = null;
    }

    public final synchronized void e() {
        i53.c3 c3Var;
        if (this.f370089j) {
            return;
        }
        this.f370085f.addAll(this.f370084e);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Haowan.GameUploadMediaEngine", "upload, list : %s", this.f370085f.toString());
        this.f370088i = false;
        synchronized (this.f370084e) {
            java.util.Iterator it = ((java.util.HashSet) this.f370084e).iterator();
            while (it.hasNext()) {
                java.lang.String str = (java.lang.String) it.next();
                if (this.f370089j) {
                    return;
                }
                i53.u z07 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.s1) ((m33.s1) i95.n0.c(m33.s1.class))).wi().z0(str);
                if (z07 != null && z07.f67105x88be67a1 != null && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(z07.f67108xe8122c90)) {
                    if (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2413x7e9e6052.z.Zi().b(str) == null) {
                        int i17 = z07.f67107x1a330c39;
                        if (i17 == 1) {
                            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.C19285xc6d09416 c19285xc6d09416 = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.C19285xc6d09416();
                            c19285xc6d09416.f264269e = z07.f67105x88be67a1;
                            c19285xc6d09416.f264273i = z07.f67106xaca5bdda;
                            if (!this.f370082c || com.p314xaae8f345.mm.vfs.w6.j(z07.f67098x6210f1cc)) {
                                c19285xc6d09416.f264271g = z07.f67101xf1e9b966;
                            } else {
                                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                                sb6.append(f370078o);
                                sb6.append("microMsg.compress.");
                                sb6.append(java.lang.System.currentTimeMillis());
                                sb6.append((str == null ? "" : str).hashCode() & 65535);
                                java.lang.String sb7 = sb6.toString();
                                if (c(sb7, z07.f67101xf1e9b966)) {
                                    z07.f67098x6210f1cc = sb7;
                                } else {
                                    z07.f67098x6210f1cc = z07.f67101xf1e9b966;
                                }
                                c19285xc6d09416.f264271g = z07.f67098x6210f1cc;
                            }
                            c19285xc6d09416.f264270f = z07.f67110xe9deda16;
                            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2413x7e9e6052.z.Zi().a(c19285xc6d09416);
                        } else if (i17 == 4) {
                            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.C19287x4a9b6f36 c19287x4a9b6f36 = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.C19287x4a9b6f36();
                            c19287x4a9b6f36.f264269e = z07.f67105x88be67a1;
                            c19287x4a9b6f36.f264273i = z07.f67106xaca5bdda;
                            c19287x4a9b6f36.f264271g = z07.f67101xf1e9b966;
                            c19287x4a9b6f36.f264270f = z07.f67110xe9deda16;
                            c19287x4a9b6f36.f264287w = z07.f67099xa7075739;
                            c19287x4a9b6f36.f264277p = z07.f67113x2a070e41;
                            c19287x4a9b6f36.f264278q = z07.f67102xfd0bc00c;
                            c19287x4a9b6f36.f264276o = (int) z07.f67109x22618426;
                            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2413x7e9e6052.z.Zi().a(c19287x4a9b6f36);
                        }
                    }
                    int i18 = z07.f67107x1a330c39;
                    if (i18 != 1) {
                        if (i18 == 4 && !f(str, 20302, 214, 2)) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Haowan.GameUploadMediaEngine", "upload, ret is false, remvoe: %s", str);
                            ((java.util.HashSet) this.f370085f).remove(str);
                        }
                    } else if (!f(str, 20301, 215, 2)) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Haowan.GameUploadMediaEngine", "upload, ret is false, remvoe: %s", str);
                        ((java.util.HashSet) this.f370085f).remove(str);
                    }
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Haowan.GameUploadMediaEngine", "upload, remvoe: %s", str);
                ((java.util.HashSet) this.f370085f).remove(str);
            }
            this.f370088i = true;
            if (((java.util.HashSet) this.f370085f).isEmpty() && (c3Var = this.f370083d) != null) {
                ((i53.y) c3Var).a(true);
            }
        }
    }

    public final boolean f(java.lang.String str, int i17, int i18, int i19) {
        this.f370090k.put(str, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Haowan.GameUploadMediaEngine", "uploadMediaFile, localId : %s", str);
        p95.a.a(new i53.b3(this, str));
        return com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2413x7e9e6052.z.bj().c("", str, i17, i18, i19, null);
    }
}

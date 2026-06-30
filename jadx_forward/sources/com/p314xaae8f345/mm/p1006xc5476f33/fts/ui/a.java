package com.p314xaae8f345.mm.p1006xc5476f33.fts.ui;

/* loaded from: classes12.dex */
public abstract class a extends t13.b implements o13.x {

    /* renamed from: h, reason: collision with root package name */
    public long f219539h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f219540i;

    /* renamed from: m, reason: collision with root package name */
    public p13.c f219541m;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.List f219542n;

    /* renamed from: o, reason: collision with root package name */
    public java.util.HashSet f219543o;

    public a(android.content.Context context, t13.j jVar, int i17) {
        super(context, jVar, i17);
        this.f219542n = java.util.Collections.synchronizedList(new java.util.LinkedList());
        this.f219543o = new java.util.HashSet();
    }

    @Override // o13.x
    public void X2(p13.v vVar) {
        int i17 = vVar.f432691c;
        t13.j jVar = this.f496091d;
        p13.u uVar = vVar.f432689a;
        if (i17 == -3 || i17 == -2 || i17 == -1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.BaseNativeFTSUIUnit", "onSearchError: type=%d | errorCode=%d | originQuery=%s", java.lang.Integer.valueOf(mo9548xfb85f7b0()), java.lang.Integer.valueOf(vVar.f432691c), uVar.f432674c);
            if (uVar.f432674c.equals(this.f219540i)) {
                jVar.a(this, uVar.f432674c, false);
                return;
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.BaseNativeFTSUIUnit", "Native Search: Not Same Query");
                return;
            }
        }
        if (i17 != 0) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.BaseNativeFTSUIUnit", "search type %d | result %d", java.lang.Integer.valueOf(mo9548xfb85f7b0()), java.lang.Integer.valueOf(vVar.f432693e.size()));
        java.lang.String str = this.f219540i;
        if (str == null || !str.equals(uVar.f432674c)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.BaseNativeFTSUIUnit", "Native Search: Not Same query origin:%s current:%s", uVar.f432674c, this.f219540i);
            return;
        }
        this.f219539h = java.lang.System.currentTimeMillis();
        java.util.HashSet hashSet = uVar.f432681j;
        this.f219543o = hashSet;
        s(vVar, hashSet);
        jVar.a(this, uVar.f432674c, true);
        this.f496094g = this.f219542n.size();
    }

    @Override // t13.k
    public u13.g b(int i17) {
        java.util.List list = this.f219542n;
        int size = list.size();
        int i18 = 0;
        while (true) {
            u13.g gVar = null;
            if (i18 >= size) {
                return null;
            }
            t13.i iVar = (t13.i) list.get(i18);
            if (iVar.f496098a == i17 && iVar.f496099b) {
                gVar = m(i17, iVar);
            } else {
                int i19 = iVar.f496100c;
                if (i19 == i17 && iVar.f496101d) {
                    gVar = n(i17, iVar);
                } else if (i17 <= i19) {
                    gVar = o(i17, iVar);
                }
            }
            if (gVar != null) {
                if (gVar.f505292b == iVar.f496100c) {
                    gVar.f505294d = false;
                }
                gVar.f505298h = this.f496093f;
                gVar.f505295e = iVar.f496104g;
                gVar.f505297g = iVar.f496102e;
                return gVar;
            }
            i18++;
        }
    }

    @Override // t13.k
    public void c() {
        this.f219540i = null;
        this.f496094g = 0;
        this.f219543o.clear();
        this.f219542n.clear();
    }

    @Override // t13.k
    /* renamed from: cancelSearch */
    public void mo63601x92b73cc2() {
        if (this.f219541m != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).Ni(this.f219541m);
            this.f219541m = null;
        }
    }

    @Override // t13.k
    public long d() {
        return this.f219539h;
    }

    @Override // t13.k
    public int e() {
        return r();
    }

    @Override // t13.k
    public void f(java.lang.String str, com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var, java.util.HashSet hashSet, long j17) {
        mo63601x92b73cc2();
        c();
        this.f219540i = str;
        this.f219541m = q(n3Var, hashSet);
    }

    @Override // t13.k
    public java.util.LinkedList g() {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.List list = this.f219542n;
        int size = list.size();
        for (int i17 = 0; i17 < size; i17++) {
            t13.i iVar = (t13.i) list.get(i17);
            int i18 = iVar.f496098a;
            if (i18 != Integer.MAX_VALUE && iVar.f496099b) {
                linkedList.add(java.lang.Integer.valueOf(i18));
            }
        }
        return linkedList;
    }

    @Override // t13.k
    public java.util.List h(long j17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (this.f219539h > 0) {
            int i17 = 0;
            while (true) {
                java.util.List list = this.f219542n;
                if (i17 >= list.size()) {
                    break;
                }
                t13.i iVar = (t13.i) list.get(i17);
                int size = iVar.f496103f.size() + iVar.f496107j;
                for (int i18 = 0; i18 < size; i18++) {
                    p13.e l17 = l(i18, j17, iVar);
                    if (l17 != null) {
                        l17.f432611f = this.f219539h - j17;
                        if (iVar.f496099b) {
                            l17.f432607b = iVar.f496098a + i18 + 1;
                        } else {
                            l17.f432607b = iVar.f496098a + i18;
                        }
                        l17.f432609d = 1;
                        l17.f432606a = i18;
                        l17.f432617l = com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.x2.b(((p13.y) iVar.f496103f.get(i18)).f432717b, ((p13.y) iVar.f496103f.get(i18)).f432718c, ((p13.y) iVar.f496103f.get(i18)).f432734s);
                        arrayList.add(l17);
                    }
                }
                if (iVar.f496101d) {
                    p13.e eVar = new p13.e();
                    eVar.f432612g = java.lang.String.valueOf(iVar.hashCode());
                    eVar.f432609d = 2;
                    eVar.f432606a = size;
                    int i19 = iVar.f496102e;
                    if (i19 == -3) {
                        eVar.f432608c = 4;
                    } else if (i19 == -4) {
                        eVar.f432608c = 3;
                    } else if (i19 == -1) {
                        eVar.f432608c = 12;
                    } else if (i19 == -2) {
                        eVar.f432608c = 11;
                    } else if (i19 == -6) {
                        eVar.f432608c = 10;
                    } else if (i19 == -13) {
                        eVar.f432608c = 19;
                    } else if (i19 == -7 || i19 == -27 || i19 == -29) {
                        eVar.f432608c = 5;
                    } else if (i19 == -24) {
                        eVar.f432608c = 33;
                    } else if (i19 == -23) {
                        eVar.f432608c = 31;
                    } else if (i19 == -28) {
                        eVar.f432608c = 36;
                    } else if (i19 == -30) {
                        eVar.f432608c = 39;
                    } else if (i19 == -32) {
                        eVar.f432608c = 40;
                    } else {
                        eVar = null;
                    }
                    if (eVar != null) {
                        eVar.f432611f = this.f219539h - j17;
                        eVar.f432607b = iVar.f496100c;
                        arrayList.add(eVar);
                    }
                }
                i17++;
            }
        }
        return arrayList;
    }

    @Override // t13.k
    public int j(int i17) {
        java.util.List list = this.f219542n;
        int size = list.size();
        for (int i18 = 0; i18 < size; i18++) {
            t13.i iVar = (t13.i) list.get(i18);
            iVar.f496098a = i17;
            if (iVar.f496099b) {
                i17++;
            }
            i17 += iVar.f496103f.size() + iVar.f496107j;
            iVar.f496100c = i17;
            if (iVar.f496101d) {
                i17++;
            }
        }
        return i17;
    }

    public p13.e l(int i17, long j17, t13.i iVar) {
        return null;
    }

    public e23.g0 m(int i17, t13.i iVar) {
        return new e23.g0(i17);
    }

    public e23.s0 n(int i17, t13.i iVar) {
        e23.s0 s0Var = new e23.s0(i17);
        s0Var.f505300j = iVar.f496100c - iVar.f496098a;
        s0Var.f505305o = true;
        return s0Var;
    }

    public abstract u13.g o(int i17, t13.i iVar);

    public u13.g p(int i17, int i18, p13.y yVar, t13.i iVar) {
        return null;
    }

    public abstract p13.c q(com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var, java.util.HashSet hashSet);

    /* JADX WARN: Failed to find 'out' block for switch in B:10:0x0030. Please report as an issue. */
    public int r() {
        java.util.List list = this.f219542n;
        int size = list.size();
        int i17 = 0;
        for (int i18 = 0; i18 < size; i18++) {
            java.util.Iterator it = ((t13.i) list.get(i18)).f496103f.iterator();
            while (it.hasNext()) {
                java.lang.String str = ((p13.y) it.next()).f432720e;
                boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                if (str == null) {
                    str = "";
                }
                char c17 = 65535;
                switch (str.hashCode()) {
                    case -19329355:
                        if (str.equals("create_chatroom\u200b")) {
                            c17 = 0;
                            break;
                        }
                        break;
                    case 255180560:
                        if (str.equals("no_result\u200b")) {
                            c17 = 1;
                            break;
                        }
                        break;
                    case 541269703:
                        if (str.equals("create_talker_message\u200b")) {
                            c17 = 2;
                            break;
                        }
                        break;
                }
                switch (c17) {
                    case 0:
                    case 1:
                    case 2:
                        break;
                    default:
                        i17++;
                        break;
                }
            }
        }
        return i17;
    }

    public abstract void s(p13.v vVar, java.util.HashSet hashSet);
}

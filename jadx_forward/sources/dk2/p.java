package dk2;

/* loaded from: classes3.dex */
public final class p {

    /* renamed from: n, reason: collision with root package name */
    public static final dk2.n f315404n = new dk2.n(null);

    /* renamed from: a, reason: collision with root package name */
    public final int f315405a;

    /* renamed from: b, reason: collision with root package name */
    public final int f315406b;

    /* renamed from: c, reason: collision with root package name */
    public java.util.List f315407c;

    /* renamed from: d, reason: collision with root package name */
    public int f315408d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.List f315409e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.ArrayList f315410f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.ArrayList f315411g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f315412h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f315413i;

    /* renamed from: j, reason: collision with root package name */
    public int f315414j;

    /* renamed from: k, reason: collision with root package name */
    public final java.util.Map f315415k;

    /* renamed from: l, reason: collision with root package name */
    public final java.util.Map f315416l;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.Map f315417m;

    public p() {
        ae2.in inVar = ae2.in.f85221a;
        this.f315405a = ((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.Q0).mo141623x754a37bb()).r()).intValue();
        this.f315406b = 50;
        this.f315407c = kz5.p0.f395529d;
        this.f315408d = -1;
        this.f315409e = new java.util.ArrayList();
        this.f315410f = new java.util.ArrayList();
        this.f315411g = new java.util.ArrayList();
        this.f315412h = "";
        r45.xg7 xg7Var = r45.xg7.emFinderLiveGetMusicTabListType_FinderMusic;
        jz5.l lVar = new jz5.l(xg7Var, 0);
        r45.xg7 xg7Var2 = r45.xg7.emFinderLiveGetMusicTabListType_Recommend;
        jz5.l lVar2 = new jz5.l(xg7Var2, 0);
        r45.xg7 xg7Var3 = r45.xg7.emFinderLiveGetMusicTabListType_Like;
        this.f315415k = kz5.c1.l(lVar, lVar2, new jz5.l(xg7Var3, 0));
        this.f315416l = kz5.c1.l(new jz5.l(xg7Var, null), new jz5.l(xg7Var2, null), new jz5.l(xg7Var3, null));
        this.f315417m = kz5.c1.k(new jz5.l(xg7Var, new java.util.ArrayList()), new jz5.l(xg7Var2, new java.util.ArrayList()), new jz5.l(xg7Var3, new java.util.ArrayList()));
    }

    public final void a(dk2.vg item, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        java.util.ArrayList arrayList = this.f315410f;
        r45.d22 d22Var = item.f315787a;
        if (z17) {
            arrayList.add(0, item);
            java.util.List list = this.f315409e;
            r45.rm1 rm1Var = new r45.rm1();
            rm1Var.set(0, java.lang.Integer.valueOf(d22Var.m75939xb282bd08(0)));
            rm1Var.set(1, d22Var.m75945x2fec8307(9));
            rm1Var.set(2, java.lang.Integer.valueOf(d22Var.m75939xb282bd08(10)));
            list.add(0, rm1Var);
        } else {
            arrayList.add(item);
            java.util.List list2 = this.f315409e;
            r45.rm1 rm1Var2 = new r45.rm1();
            rm1Var2.set(0, java.lang.Integer.valueOf(d22Var.m75939xb282bd08(0)));
            rm1Var2.set(1, d22Var.m75945x2fec8307(9));
            rm1Var2.set(2, java.lang.Integer.valueOf(d22Var.m75939xb282bd08(10)));
            list2.add(rm1Var2);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveAnchorMusicData", "addMusicItem " + item + ", songId size:" + this.f315409e.size() + ", musicList id size:" + arrayList.size() + ", curPlayPos:" + this.f315408d);
    }

    public final jz5.l b(java.lang.String id6) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(id6, "id");
        int i17 = 0;
        for (java.lang.Object obj : this.f315410f) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            dk2.vg vgVar = (dk2.vg) obj;
            if ((id6.length() > 0) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(dk2.q.e(vgVar.f315787a), id6)) {
                return new jz5.l(vgVar, java.lang.Integer.valueOf(i17));
            }
            i17 = i18;
        }
        return new jz5.l(null, -1);
    }

    public final jz5.l c(dk2.vg musicItem, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(musicItem, "musicItem");
        k(musicItem, i17);
        java.util.ArrayList arrayList = this.f315410f;
        if (arrayList == null || arrayList.isEmpty()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderLiveAnchorMusicData", "musicList is empty!");
            return new jz5.l(null, -1);
        }
        int i18 = i17 + 1;
        int i19 = i18 < arrayList.size() ? i18 : 0;
        java.lang.Object obj = arrayList.get(i19);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
        dk2.vg vgVar = (dk2.vg) obj;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveAnchorMusicData", "songId size:" + this.f315409e.size() + ", musicList id size:" + arrayList.size() + ", findNextMusicItem pos:" + i17 + ", nextPos:" + i19 + ", curPlayPos:" + this.f315408d + ",nextMusicItem:" + vgVar);
        return new jz5.l(vgVar, java.lang.Integer.valueOf(i19));
    }

    public final dk2.vg d() {
        int i17 = this.f315408d;
        if (i17 < 0) {
            return null;
        }
        java.util.ArrayList arrayList = this.f315410f;
        if (i17 < arrayList.size()) {
            return (dk2.vg) arrayList.get(this.f315408d);
        }
        return null;
    }

    public final java.lang.String e() {
        int i17 = this.f315408d;
        if (i17 < 0 || i17 >= this.f315409e.size()) {
            return "0";
        }
        r45.rm1 rm1Var = (r45.rm1) this.f315409e.get(this.f315408d);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rm1Var, "<this>");
        boolean z17 = true;
        java.lang.String m75945x2fec8307 = rm1Var.m75945x2fec8307(1);
        if (m75945x2fec8307 != null && m75945x2fec8307.length() != 0) {
            z17 = false;
        }
        if (z17) {
            m75945x2fec8307 = java.lang.String.valueOf(rm1Var.m75939xb282bd08(0));
        }
        return m75945x2fec8307 == null ? "" : m75945x2fec8307;
    }

    public final r45.xl1 f() {
        r45.xl1 xl1Var = new r45.xl1();
        xl1Var.set(1, new java.util.LinkedList(this.f315409e));
        return xl1Var;
    }

    public final java.util.LinkedList g(boolean z17) {
        int i17;
        int size = this.f315409e.size();
        int size2 = this.f315410f.size();
        int i18 = size - size2;
        if (i18 <= 0) {
            return new java.util.LinkedList();
        }
        if (!z17 && (i17 = this.f315406b) <= i18) {
            i18 = i17;
        }
        return new java.util.LinkedList(this.f315409e.subList(size2, i18 + size2));
    }

    public final boolean h(r45.d22 d22Var) {
        java.lang.Object obj;
        java.util.Iterator it = this.f315409e.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (dk2.q.c(d22Var, (r45.rm1) obj)) {
                break;
            }
        }
        return obj != null;
    }

    public final void i(dk2.vg item, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        if (item.f315788b == 1) {
            item.f315788b = 2;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveAnchorMusicData", "pauseMusicItem " + item + " songId size:" + this.f315409e.size() + ", musicList id size:" + this.f315410f.size() + ", pos:" + i17 + ", curPlayPos:" + this.f315408d);
    }

    public final void j(dk2.vg item, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        try {
            dk2.vg d17 = d();
            java.util.ArrayList arrayList = this.f315410f;
            java.lang.Object obj = arrayList.get(i17);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
            dk2.vg vgVar = (dk2.vg) obj;
            if (dk2.q.d(vgVar.f315787a, item.f315787a)) {
                if (d17 != null) {
                    d17.f315788b = 0;
                }
                vgVar.f315788b = 1;
                this.f315408d = i17;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveAnchorMusicData", "playMusicItem item:" + item + " songId size:" + this.f315409e.size() + ", musicList id size:" + arrayList.size() + ", pos:" + i17 + " oriMusicItem:" + d17 + " newMusicItem:" + vgVar + ", curPlayPos:" + this.f315408d);
        } catch (java.lang.Exception e17) {
            hc2.c.a(e17, "FinderLiveAnchorMusicData playMusicItem");
        }
    }

    public final void k(dk2.vg vgVar, int i17) {
        if (vgVar != null) {
            vgVar.f315788b = 0;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveAnchorMusicData", "resetMusicItem " + vgVar + " songId size:" + this.f315409e.size() + ", musicList id size:" + this.f315410f.size() + ", pos:" + i17 + ", curPlayPos:" + this.f315408d);
    }

    public final void l(java.util.List list) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("savePrepareSongIdList size:");
        sb6.append(list != null ? java.lang.Integer.valueOf(list.size()) : null);
        sb6.append(", curPlayPos:");
        sb6.append(this.f315408d);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveAnchorMusicData", sb6.toString());
        if (list == null) {
            return;
        }
        this.f315407c = list;
    }

    public final void m(r45.gm1 resp) {
        java.util.ArrayList arrayList;
        boolean z17;
        dk2.vg vgVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        try {
            java.util.LinkedList<r45.d22> m75941xfb821914 = resp.m75941xfb821914(1);
            if (m75941xfb821914 != null) {
                arrayList = new java.util.ArrayList(kz5.d0.q(m75941xfb821914, 10));
                for (r45.d22 d22Var : m75941xfb821914) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(d22Var);
                    arrayList.add(new dk2.vg(d22Var, 0, 0, 0, false, 0L, 56, null));
                }
            } else {
                arrayList = null;
            }
            r45.d22 d22Var2 = (arrayList == null || (vgVar = (dk2.vg) kz5.n0.Z(arrayList)) == null) ? null : vgVar.f315787a;
            java.lang.String e17 = e();
            java.util.ArrayList arrayList2 = this.f315410f;
            java.util.Iterator it = arrayList2.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (dk2.q.d(((dk2.vg) it.next()).f315787a, d22Var2)) {
                        z17 = true;
                        break;
                    }
                } else {
                    z17 = false;
                    break;
                }
            }
            if (!z17 && arrayList != null) {
                arrayList2.addAll(arrayList);
                java.util.ArrayList<dk2.vg> arrayList3 = new java.util.ArrayList();
                for (java.lang.Object obj : arrayList2) {
                    if (dk2.q.f(((dk2.vg) obj).f315787a)) {
                        arrayList3.add(obj);
                    }
                }
                for (dk2.vg vgVar2 : arrayList3) {
                    qk.i9 i9Var = (qk.i9) i95.n0.c(qk.i9.class);
                    java.lang.String m75945x2fec8307 = vgVar2.f315787a.m75945x2fec8307(9);
                    if (m75945x2fec8307 == null) {
                        m75945x2fec8307 = "";
                    }
                    ((ef0.l4) i9Var).wi(m75945x2fec8307, true, false, new dk2.o(vgVar2));
                }
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append("updateMusicInfo respMusicInfo.first songId:");
            sb6.append(d22Var2);
            sb6.append(", cur songId:");
            sb6.append(e17);
            sb6.append(", songIdExist:");
            sb6.append(z17);
            sb6.append(", curPlayPos:");
            sb6.append(this.f315408d);
            sb6.append(", size:");
            java.util.List list = this.f315409e;
            sb6.append(list != null ? java.lang.Integer.valueOf(list.size()) : null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveAnchorMusicData", sb6.toString());
            f315404n.a(arrayList2, "updateMusicInfo", false);
        } catch (java.lang.Exception e18) {
            pm0.z.b(xy2.b.f539688b, "updateMusicInfo", false, null, null, false, false, null, 124, null);
            hc2.c.a(e18, "FinderLiveAnchorMusicData updateMusicInfo");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0076 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x003c A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void n(java.lang.String r20, r45.u82 r21) {
        /*
            Method dump skipped, instructions count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dk2.p.n(java.lang.String, r45.u82):void");
    }
}

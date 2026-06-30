package lf4;

/* loaded from: classes4.dex */
public class b0 extends lf4.l implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: e, reason: collision with root package name */
    public final lf4.h f399888e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.Map f399889f;

    /* renamed from: g, reason: collision with root package name */
    public final int f399890g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f399891h;

    /* renamed from: i, reason: collision with root package name */
    public final int f399892i;

    /* renamed from: m, reason: collision with root package name */
    public final int f399893m;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.List f399894n;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.List f399895o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f399896p;

    /* renamed from: q, reason: collision with root package name */
    public int f399897q;

    /* renamed from: r, reason: collision with root package name */
    public int f399898r;

    /* renamed from: s, reason: collision with root package name */
    public int f399899s;

    /* renamed from: t, reason: collision with root package name */
    public int f399900t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f399901u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f399902v;

    /* renamed from: w, reason: collision with root package name */
    public final boolean f399903w;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f399904x;

    /* renamed from: y, reason: collision with root package name */
    public final yz5.r f399905y;

    public /* synthetic */ b0(java.util.List list, java.lang.String str, lf4.h hVar, java.util.Map map, int i17, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(list, str, hVar, (i18 & 8) != 0 ? new java.util.HashMap() : map, (i18 & 16) != 0 ? 0 : i17);
    }

    @Override // lf4.l
    public void b(int i17) {
        java.util.List userList = this.f399894n;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(userList, "userList");
        lf4.m mVar = (lf4.m) kz5.n0.a0(userList, i17);
        if (mVar != null) {
            p(mVar);
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(userList, "userList");
        lf4.m mVar2 = (lf4.m) kz5.n0.a0(userList, this.f399892i + i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(userList, "userList");
        pm0.v.L("MultiUserGalleryPresenter_checkLoadMore", true, new lf4.n(mVar2, (lf4.m) kz5.n0.a0(userList, i17 + this.f399893m), this));
    }

    @Override // lf4.l
    public void c(int i17, int i18) {
    }

    @Override // lf4.l
    public void d() {
        gm0.j1.n().f354821b.q(bd1.f.f4202x366c91de, this);
        gf4.l.f352887d.j(this.f399905y);
    }

    @Override // lf4.l
    public void e(int i17) {
        this.f399900t = i17;
    }

    @Override // lf4.l
    public void f() {
        java.util.List list = this.f399894n;
        int size = list.size() <= 3 ? list.size() : 3;
        for (int i17 = 0; i17 < size; i17++) {
            java.lang.Object obj = list.get(i17);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
            p((lf4.m) obj);
        }
        if (list.size() > 0) {
            this.f399895o.add(list.get(0));
            n();
        }
    }

    @Override // lf4.l
    public void g(int i17) {
        this.f399899s = i17;
        if (i17 != 1 || this.f399904x) {
            return;
        }
        ef4.w.f334001t.l().mo50293x3498a0(new lf4.w(this));
    }

    @Override // lf4.l
    public void h(int i17, int i18, boolean z17) {
        if (i17 == 3) {
            if (!z17) {
                ef4.w.f334001t.l().mo50293x3498a0(new lf4.t(this));
            } else if (i18 == 0) {
                ef4.w.f334001t.l().mo50293x3498a0(new lf4.y(this));
            } else {
                if (i18 != 1) {
                    return;
                }
                ef4.w.f334001t.l().mo50293x3498a0(new lf4.t(this));
            }
        }
    }

    @Override // lf4.l
    public void i(int i17, int i18) {
        this.f399897q = i17;
        this.f399898r = i18;
        if (this.f399899s == 1) {
            ef4.w.f334001t.l().mo50293x3498a0(new lf4.w(this));
        }
    }

    public final void n() {
        if (this.f399896p) {
            return;
        }
        java.util.List list = this.f399895o;
        if (list.size() <= 0) {
            return;
        }
        lf4.m mVar = (lf4.m) list.get(0);
        java.util.List list2 = this.f399894n;
        int indexOf = list2.indexOf(mVar);
        if (!(indexOf >= 0 && indexOf < list2.size()) || mVar.f399972b == 2) {
            list.remove(0);
            n();
            return;
        }
        mVar.f399972b = 2;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f399891h, "LogStory: loadRemoteForUser " + mVar);
        this.f399896p = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void o(lf4.m r8, java.util.ArrayList r9) {
        /*
            r7 = this;
            java.util.List r0 = r7.f399894n
            int r1 = r0.indexOf(r8)
            boolean r2 = r9.isEmpty()
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L1e
            int r2 = r7.f399897q
            int r5 = r2 + (-1)
            int r2 = r2 + r4
            if (r1 > r2) goto L19
            if (r5 > r1) goto L19
            r2 = r4
            goto L1a
        L19:
            r2 = r3
        L1a:
            if (r2 != 0) goto L1e
            r2 = r4
            goto L1f
        L1e:
            r2 = r3
        L1f:
            boolean r5 = r9.isEmpty()
            r5 = r5 ^ r4
            if (r5 != 0) goto L2c
            int r5 = r7.f399899s
            if (r5 != 0) goto L2b
            goto L2c
        L2b:
            r4 = r3
        L2c:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "notifyUser: selection "
            r5.<init>(r6)
            java.lang.String r6 = "userList"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r0, r6)
            java.lang.Object r0 = kz5.n0.a0(r0, r1)
            r5.append(r0)
            r0 = 32
            r5.append(r0)
            r5.append(r1)
            r5.append(r0)
            int r6 = r7.f399897q
            r5.append(r6)
            java.lang.String r6 = ", "
            r5.append(r6)
            int r6 = r9.size()
            r5.append(r6)
            r5.append(r0)
            int r6 = r7.f399899s
            r5.append(r6)
            java.lang.String r6 = ", result "
            r5.append(r6)
            r5.append(r2)
            r5.append(r0)
            r5.append(r4)
            java.lang.String r5 = r5.toString()
            java.lang.String r6 = r7.f399891h
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r6, r5)
            java.util.ArrayList r5 = r8.f399973c
            r8.f399973c = r9
            if (r2 == 0) goto La3
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r2 = "remove user from gallery "
            r9.<init>(r2)
            r9.append(r1)
            r9.append(r0)
            r9.append(r8)
            java.lang.String r8 = r9.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r6, r8)
            lf4.o r8 = new lf4.o
            r8.<init>(r7, r1)
            pm0.v.X(r8)
            return
        La3:
            if (r4 != 0) goto La6
            return
        La6:
            int r8 = r7.f399899s
            if (r8 == 0) goto Lc7
            int r8 = r7.f399897q
            if (r1 == r8) goto Laf
            goto Lc7
        Laf:
            java.lang.String r8 = "oldItems"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r5, r8)
            lf4.j r8 = new lf4.j
            r8.<init>(r5, r9)
            androidx.recyclerview.widget.c0 r8 = p012xc85e97e9.p103xe821e364.p104xd1075a44.h0.a(r8, r3)
            lf4.r r0 = new lf4.r
            r0.<init>(r7, r1, r9, r8)
            pm0.v.X(r0)
            goto Lcf
        Lc7:
            lf4.p r8 = new lf4.p
            r8.<init>(r7, r1, r9)
            pm0.v.X(r8)
        Lcf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: lf4.b0.o(lf4.m, java.util.ArrayList):void");
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 scene) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scene, "scene");
        java.util.List list = this.f399895o;
        if (list.size() <= 0) {
            return;
        }
        lf4.m mVar = (lf4.m) list.get(0);
        java.util.List list2 = this.f399894n;
        int indexOf = list2.indexOf(mVar);
        if (!(indexOf >= 0 && indexOf < list2.size())) {
            list.remove(0);
            this.f399896p = false;
            n();
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f399891h, "LogStory: " + i17 + ' ' + i18 + ' ' + str + ", " + indexOf + ' ' + mVar);
    }

    public final void p(lf4.m mVar) {
        if (this.f399894n.indexOf(mVar) < 0) {
            return;
        }
        int i17 = mVar.f399972b;
        java.lang.String str = this.f399891h;
        if (i17 != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "LogStory: preloadForUser already preload");
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("LogStory: preloadForUser ");
        sb6.append(mVar);
        sb6.append(' ');
        boolean z17 = this.f399901u;
        sb6.append(z17);
        sb6.append(' ');
        sb6.append(this.f399890g);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
        lf4.k kVar = lf4.l.f399969d;
        boolean z18 = this.f399903w;
        java.lang.String str2 = "LogStory: preload add sync item and local item, ";
        boolean z19 = this.f399902v;
        java.lang.String username = mVar.f399971a;
        if (z18) {
            mVar.f399972b = 1;
            int e17 = c01.id.e();
            ef4.n.f333993a.a();
            ef4.v vVar = ef4.w.f334001t;
            int max = java.lang.Math.max(e17 - 86400, (int) (vVar.g().y0(username).f66291xea0d6f28 / 1000));
            mVar.f399974d = max;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (nf4.j jVar : z19 ? vVar.i().W0(username, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(vVar.e(), username), max) : vVar.i().P0(username, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(vVar.e(), username), max, true)) {
                r45.lf6 y07 = jVar.y0();
                r45.oe6 oe6Var = y07.f460965h;
                if (oe6Var != null && oe6Var.f463738e.size() != 0) {
                    arrayList2.add(new if4.f(jVar, jVar.y0(), if4.g.f372783d));
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Gallery.GalleryController", "getGalleryItemsFromDb story username " + username + ' ' + arrayList2.size() + " content " + ((r45.xe6) y07.f460965h.f463738e.get(0)).f471558h + " and " + ((r45.xe6) y07.f460965h.f463738e.get(0)).f471556f + " id:" + jVar.f69410x443468b + " storyUsername: " + jVar.f69412xdde069b + " tryCount:" + jVar.v0().f472551e + " flag:" + jVar.f69406x52c1d072);
                    str2 = str2;
                }
            }
            java.lang.String str3 = str2;
            if (!arrayList2.isEmpty()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, str3 + arrayList2.size());
                arrayList.addAll(arrayList2);
            }
        } else if (z17) {
            mVar.f399972b = 2;
            ef4.v vVar2 = ef4.w.f334001t;
            boolean D0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(username, vVar2.e());
            java.util.ArrayList arrayList3 = (java.util.ArrayList) this.f399889f.get(username);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
            pm0.c cVar = new pm0.c("getGalleryItemsFromDbByStoryId");
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            nf4.l i18 = vVar2.i();
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            java.lang.String str4 = "select *,rowid from MMStoryInfo " + i18.y0(username, D0);
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
            sb7.append(str4);
            java.lang.String str5 = nf4.l.f418392n;
            if (!D0) {
                str5 = " AND " + nf4.l.f418393o + str5;
            }
            sb7.append(str5);
            android.database.Cursor f17 = i18.f418405h.f(sb7.toString(), null, 2);
            while (f17.moveToNext()) {
                nf4.j jVar2 = new nf4.j();
                jVar2.mo9015xbf5d97fd(f17);
                arrayList5.add(jVar2);
            }
            f17.close();
            java.util.ArrayList arrayList6 = new java.util.ArrayList();
            java.util.Iterator it = arrayList5.iterator();
            while (it.hasNext()) {
                java.lang.Object next = it.next();
                if (arrayList3 != null ? arrayList3.contains(java.lang.Long.valueOf(((nf4.j) next).f69410x443468b)) : true) {
                    arrayList6.add(next);
                }
            }
            java.util.Iterator it6 = arrayList6.iterator();
            while (it6.hasNext()) {
                nf4.j jVar3 = (nf4.j) it6.next();
                r45.lf6 y08 = jVar3.y0();
                r45.oe6 oe6Var2 = y08.f460965h;
                if (oe6Var2 != null && oe6Var2.f463738e.size() != 0) {
                    arrayList4.add(new if4.f(jVar3, jVar3.y0(), if4.g.f372784e));
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Gallery.GalleryController", "getGalleryItemsFromDbByStoryId story:" + jVar3 + ", content:" + ((r45.xe6) y08.f460965h.f463738e.get(0)).f471558h + " and " + ((r45.xe6) y08.f460965h.f463738e.get(0)).f471556f + ", id:" + jVar3.f69410x443468b + ", storyUsername:" + jVar3.f69412xdde069b);
                }
            }
            cVar.a();
            if (!arrayList4.isEmpty()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "LogStory: preload add sync item and local item, " + arrayList4.size());
                arrayList.addAll(arrayList4);
            }
        } else if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(ef4.w.f334001t.e(), username)) {
            mVar.f399972b = 1;
            java.util.ArrayList a17 = kVar.a(username, z19);
            if (a17.size() > 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "LogStory: preload add sync item and local item, " + a17.size());
                arrayList.addAll(a17);
            }
        } else {
            mVar.f399972b = 1;
            if4.f c17 = kVar.c(username, z19);
            if (c17 == null) {
                o(mVar, arrayList);
                return;
            }
            java.util.ArrayList a18 = kVar.a(username, z19);
            if (a18.size() > 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "LogStory: preload add sync item and local item, " + a18.size());
                if (((if4.f) a18.get(0)).f372779d != c17.f372779d) {
                    arrayList.add(c17);
                }
                arrayList.addAll(a18);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "LogStory: preload add sync item");
                arrayList.add(c17);
            }
        }
        o(mVar, arrayList);
    }

    public b0(java.util.List users, java.lang.String str, lf4.h groupCallback, java.util.Map storyFilterList, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(users, "users");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(groupCallback, "groupCallback");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(storyFilterList, "storyFilterList");
        this.f399888e = groupCallback;
        this.f399889f = storyFilterList;
        this.f399890g = i17;
        this.f399891h = "MicroMsg.MultiUserGalleryPresenter";
        this.f399892i = 3;
        this.f399893m = 1;
        this.f399894n = java.util.Collections.synchronizedList(new java.util.ArrayList());
        this.f399895o = java.util.Collections.synchronizedList(new java.util.LinkedList());
        this.f399897q = -1;
        this.f399898r = -1;
        this.f399901u = pm0.v.z(i17, 4);
        this.f399902v = pm0.v.z(i17, 1);
        this.f399903w = pm0.v.z(i17, 2);
        this.f399905y = new lf4.a0(this);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiUserGalleryPresenter", "TimeDiff: local: " + java.lang.System.currentTimeMillis() + ", server: " + c01.id.a());
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("chatRoom is ");
        sb6.append(str);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiUserGalleryPresenter", sb6.toString());
        java.util.Iterator it = users.iterator();
        while (it.hasNext()) {
            java.lang.String str2 = (java.lang.String) it.next();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f399891h, "LogStory: " + str2);
            this.f399894n.add(new lf4.m(str2, 0, new java.util.ArrayList(), 0, 8, null));
        }
        ((sf4.a1) this.f399888e).i(this.f399894n.size());
        gm0.j1.n().f354821b.a(bd1.f.f4202x366c91de, this);
        gf4.l.f352887d.a(this.f399905y);
        this.f399904x = bf4.f.f101248b.f();
    }
}

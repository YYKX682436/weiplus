package lf4;

/* loaded from: classes4.dex */
public class j1 extends lf4.l implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f399951e;

    /* renamed from: f, reason: collision with root package name */
    public final lf4.h f399952f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.Map f399953g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f399954h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.ArrayList f399955i;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.ArrayList f399956m;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.LinkedList f399957n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f399958o;

    /* renamed from: p, reason: collision with root package name */
    public int f399959p;

    /* renamed from: q, reason: collision with root package name */
    public int f399960q;

    /* renamed from: r, reason: collision with root package name */
    public int f399961r;

    /* renamed from: s, reason: collision with root package name */
    public int f399962s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f399963t;

    /* renamed from: u, reason: collision with root package name */
    public final java.util.ArrayList f399964u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f399965v;

    /* renamed from: w, reason: collision with root package name */
    public final yz5.r f399966w;

    public j1(java.lang.String username, java.util.List dates, lf4.h galleryUserCallback, java.util.Map storyFilterList, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dates, "dates");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(galleryUserCallback, "galleryUserCallback");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(storyFilterList, "storyFilterList");
        this.f399951e = username;
        this.f399952f = galleryUserCallback;
        this.f399953g = storyFilterList;
        this.f399954h = "MicroMsg.SelfHistoryGalleryPresenter";
        this.f399955i = new java.util.ArrayList();
        this.f399956m = new java.util.ArrayList();
        this.f399957n = new java.util.LinkedList();
        this.f399959p = -1;
        this.f399960q = -1;
        this.f399961r = -1;
        this.f399962s = -1;
        this.f399963t = pm0.v.z(i17, 4);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.f399964u = arrayList;
        this.f399966w = new lf4.i1(this);
        arrayList.addAll(dates);
        ((sf4.a1) galleryUserCallback).i(arrayList.size());
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f399954h, "LogStory: " + str);
            this.f399955i.add(new java.util.ArrayList());
            this.f399956m.add(new lf4.i(str));
        }
        gf4.l.f352887d.a(this.f399966w);
        gm0.j1.n().f354821b.a(764, this);
        gm0.j1.n().f354821b.a(yc1.z.f77533x366c91de, this);
        this.f399965v = bf4.f.f101248b.f();
    }

    @Override // lf4.l
    public void a(int i17, int i18) {
        this.f399959p = -1;
        this.f399960q = -1;
        gm0.j1.n().f354821b.c(764);
    }

    @Override // lf4.l
    public void b(int i17) {
        ef4.w.f334001t.l().mo50293x3498a0(new lf4.r0(this, i17));
    }

    @Override // lf4.l
    public void c(int i17, int i18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f399954h, "LogStory: deleteItem " + i17);
        if (i17 < 0 || i17 >= this.f399964u.size() || i18 < 0 || i18 >= ((java.util.ArrayList) this.f399955i.get(i17)).size()) {
            return;
        }
        ef4.w.f334001t.l().mo50293x3498a0(new lf4.t0(this, i17, i18));
    }

    @Override // lf4.l
    public void d() {
        gf4.l.f352887d.j(this.f399966w);
        gm0.j1.n().f354821b.q(yc1.z.f77533x366c91de, this);
        gm0.j1.n().f354821b.q(764, this);
    }

    @Override // lf4.l
    public void e(int i17) {
    }

    @Override // lf4.l
    public void f() {
        boolean z17;
        java.util.ArrayList arrayList = this.f399964u;
        java.util.Iterator it = arrayList.iterator();
        int i17 = 0;
        while (true) {
            boolean hasNext = it.hasNext();
            java.util.ArrayList arrayList2 = this.f399956m;
            if (hasNext) {
                java.lang.Object next = it.next();
                int i18 = i17 + 1;
                if (i17 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                ((lf4.i) arrayList2.get(i17)).f399945a = 1;
                i17 = i18;
            } else {
                java.util.Iterator it6 = arrayList.iterator();
                int i19 = 0;
                while (true) {
                    boolean hasNext2 = it6.hasNext();
                    java.util.ArrayList arrayList3 = this.f399955i;
                    if (!hasNext2) {
                        if (arrayList.size() > 0) {
                            this.f399957n.add(kz5.n0.X(arrayList));
                            n();
                        }
                        int i27 = 0;
                        for (java.lang.Object obj : arrayList) {
                            int i28 = i27 + 1;
                            if (i27 < 0) {
                                kz5.c0.p();
                                throw null;
                            }
                            java.lang.Object obj2 = arrayList.get(i27);
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj2, "get(...)");
                            java.lang.Object obj3 = arrayList3.get(i27);
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj3, "get(...)");
                            o((java.lang.String) obj2, (java.util.List) obj3);
                            i27 = i28;
                        }
                        return;
                    }
                    java.lang.Object next2 = it6.next();
                    int i29 = i19 + 1;
                    if (i19 < 0) {
                        kz5.c0.p();
                        throw null;
                    }
                    java.lang.Object obj4 = arrayList.get(i19);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj4, "get(...)");
                    java.lang.String str = (java.lang.String) obj4;
                    java.lang.Object obj5 = arrayList3.get(i19);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj5, "get(...)");
                    java.util.ArrayList arrayList4 = (java.util.ArrayList) obj5;
                    java.lang.Object obj6 = arrayList2.get(i19);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj6, "get(...)");
                    lf4.i iVar = (lf4.i) obj6;
                    lf4.k kVar = lf4.l.f399969d;
                    boolean z18 = this.f399963t;
                    java.lang.String str2 = this.f399951e;
                    java.lang.String str3 = this.f399954h;
                    if (z18) {
                        java.util.ArrayList b17 = kVar.b(str2, str);
                        java.util.ArrayList arrayList5 = new java.util.ArrayList();
                        java.util.Iterator it7 = b17.iterator();
                        while (it7.hasNext()) {
                            java.lang.Object next3 = it7.next();
                            if4.f fVar = (if4.f) next3;
                            java.util.ArrayList arrayList6 = (java.util.ArrayList) this.f399953g.get(str);
                            java.util.ArrayList arrayList7 = arrayList4;
                            if (arrayList6 != null ? arrayList6.contains(java.lang.Long.valueOf(fVar.f372779d)) : true) {
                                arrayList5.add(next3);
                            }
                            arrayList4 = arrayList7;
                        }
                        java.util.ArrayList arrayList8 = arrayList4;
                        if (!arrayList5.isEmpty()) {
                            arrayList8.addAll(arrayList5);
                            iVar.f399945a = 2;
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str3, "LogStory: preload Db with filter data " + arrayList5.size());
                        }
                        z17 = true;
                    } else {
                        nf4.h y07 = ef4.w.f334001t.h().y0(str);
                        int i37 = y07 != null ? y07.f69195x28f0318a : 0;
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str3, "LogStory: preloadForDate " + str + " historyCount " + i37);
                        java.util.ArrayList b18 = kVar.b(str2, str);
                        if (b18.size() > 0) {
                            arrayList4.addAll(b18);
                            if (b18.size() == i37) {
                                iVar.f399945a = 2;
                                z17 = true;
                            } else {
                                z17 = true;
                                iVar.f399945a = 1;
                            }
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str3, "LogStory: preload Db data " + b18.size());
                        } else {
                            z17 = true;
                            if (i37 != 0) {
                                iVar.f399945a = 1;
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str3, "LogStory: initLoad Sync data");
                            }
                        }
                    }
                    i19 = i29;
                }
            }
        }
    }

    @Override // lf4.l
    public void g(int i17) {
    }

    @Override // lf4.l
    public void h(int i17, int i18, boolean z17) {
        if (i17 == 3) {
            if (!z17) {
                ef4.w.f334001t.l().mo50293x3498a0(new lf4.b1(this));
            } else if (i18 == 0) {
                ef4.w.f334001t.l().mo50293x3498a0(new lf4.g1(this));
            } else {
                if (i18 != 1) {
                    return;
                }
                ef4.w.f334001t.l().mo50293x3498a0(new lf4.b1(this));
            }
        }
    }

    @Override // lf4.l
    public void i(int i17, int i18) {
        this.f399961r = i17;
        this.f399962s = i18;
        ef4.w.f334001t.l().mo50293x3498a0(new lf4.x0(this, i17));
    }

    @Override // lf4.l
    public void j() {
    }

    @Override // lf4.l
    public void k() {
    }

    @Override // lf4.l
    public void l(int i17, int i18, boolean z17, nf4.j jVar) {
        java.lang.String str = this.f399954h;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "LogStory: setFavorite " + i18);
        if (i17 < 0 || i17 >= this.f399964u.size() || i18 < 0) {
            return;
        }
        java.util.ArrayList arrayList = this.f399955i;
        if (i18 < ((java.util.ArrayList) arrayList.get(i17)).size()) {
            boolean z18 = !z17;
            java.lang.Object obj = ((java.util.ArrayList) arrayList.get(i17)).get(i18);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
            if4.f fVar = (if4.f) obj;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "LogStory: setFavorite storyinfo " + fVar + " localid " + fVar.f372780e.f372786a + " targetFavorite:" + z18);
            nf4.j J0 = ef4.w.f334001t.i().J0((int) fVar.f372776a.f72763xa3c65b86);
            if (J0 != null) {
                if (z18) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(1045L, 0L, 1L);
                } else {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(1045L, 1L, 1L);
                }
                mf4.d.f(mf4.d.f407693a, z18 ? 1L : 2L, java.lang.String.valueOf(J0.f69410x443468b), 2L, 0L, 0L, 16, null);
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                arrayList2.add(java.lang.Long.valueOf(J0.f69410x443468b));
                arrayList3.add(java.lang.Integer.valueOf((int) J0.f72763xa3c65b86));
                ef4.e0.f333974a.d(arrayList2, arrayList3, z18);
            }
        }
    }

    @Override // lf4.l
    public void m(int i17, int i18, boolean z17) {
        java.lang.String str = this.f399954h;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "LogStory: setPrivacy row:" + i17 + " column:" + i18);
        if (i17 < 0 || i17 >= this.f399964u.size() || i18 < 0) {
            return;
        }
        java.util.ArrayList arrayList = this.f399955i;
        if (i18 < ((java.util.ArrayList) arrayList.get(i17)).size()) {
            boolean z18 = !z17;
            java.lang.Object obj = ((java.util.ArrayList) arrayList.get(i17)).get(i18);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
            if4.f fVar = (if4.f) obj;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "LogStory: setPrivacy storyinfo " + fVar + " targetPrivacy:" + z18);
            nf4.j J0 = ef4.w.f334001t.i().J0((int) fVar.f372776a.f72763xa3c65b86);
            if (J0 != null) {
                if (z18) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(1045L, 2L, 1L);
                } else {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(1045L, 3L, 1L);
                }
                mf4.d.f(mf4.d.f407693a, z18 ? 3L : 4L, java.lang.String.valueOf(J0.f69410x443468b), 2L, 0L, 0L, 16, null);
                long j17 = J0.f69410x443468b;
                int i19 = (int) J0.f72763xa3c65b86;
                boolean z07 = J0.z0();
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                arrayList3.add(java.lang.Integer.valueOf(i19));
                arrayList2.add(new ff4.q(j17, 4, z18 ? 1 : 0, z07));
                gm0.j1.n().f354821b.g(new ff4.e(arrayList2, arrayList3));
            }
        }
    }

    public final void n() {
        if (this.f399958o) {
            return;
        }
        java.util.LinkedList linkedList = this.f399957n;
        if (linkedList.size() <= 0) {
            return;
        }
        java.lang.Object obj = linkedList.get(0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
        java.lang.String str = (java.lang.String) obj;
        int indexOf = this.f399964u.indexOf(str);
        java.util.ArrayList arrayList = this.f399956m;
        if (indexOf >= 0 && indexOf < arrayList.size()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f399954h, "LogStory: loadRemoteForDate ".concat(str));
            if (((lf4.i) arrayList.get(indexOf)).f399945a != 2) {
                gm0.j1.n().f354821b.g(new ff4.c(this.f399951e, 0L, str));
                this.f399958o = true;
            } else {
                linkedList.remove(0);
                n();
            }
        }
    }

    public final void o(java.lang.String str, java.util.List list) {
        int indexOf = this.f399964u.indexOf(str);
        if (list.isEmpty()) {
            pm0.v.X(new lf4.u0(this, indexOf));
        } else {
            pm0.v.X(new lf4.v0(this, indexOf, list));
        }
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 scene) {
        ff4.e eVar;
        ff4.a H;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scene, "scene");
        java.lang.String str2 = this.f399954h;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "LogStory: " + i17 + ' ' + i18 + ' ' + str);
        if (scene instanceof ff4.c) {
            java.lang.String str3 = ((ff4.c) scene).f343198d;
            java.lang.String str4 = this.f399951e;
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(str3, str4)) {
                java.lang.String str5 = (java.lang.String) this.f399957n.poll();
                java.util.ArrayList arrayList = this.f399964u;
                int indexOf = arrayList.indexOf(str5);
                java.util.ArrayList arrayList2 = this.f399956m;
                if (indexOf >= 0 && indexOf < arrayList2.size()) {
                    this.f399958o = false;
                    ((lf4.i) arrayList2.get(indexOf)).f399945a = 2;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "LogStory: updateUserGalleryItemsFromDb " + indexOf);
                    java.lang.Object obj = arrayList.get(indexOf);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
                    java.lang.String str6 = (java.lang.String) obj;
                    java.lang.Object obj2 = this.f399955i.get(indexOf);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj2, "get(...)");
                    java.util.ArrayList arrayList3 = (java.util.ArrayList) obj2;
                    java.util.ArrayList b17 = lf4.l.f399969d.b(str4, str6);
                    arrayList3.clear();
                    arrayList3.addAll(b17);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "LogStory: db data " + str6 + ' ' + arrayList3.size());
                    o(str6, arrayList3);
                    n();
                    return;
                }
                return;
            }
        }
        if (!(scene instanceof ff4.e) || (H = (eVar = (ff4.e) scene).H()) == null) {
            return;
        }
        boolean z17 = H instanceof ff4.p;
        java.util.List list = eVar.f343214e;
        if (z17) {
            if (i18 == 0) {
                java.util.Iterator it = list.iterator();
                while (it.hasNext()) {
                    ef4.e0.f333974a.a(((java.lang.Number) it.next()).intValue());
                }
            }
            pm0.v.X(new lf4.w0(i18 == 0, this));
            return;
        }
        if (H instanceof ff4.q) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "onSceneEnd MMSTORY_OBJ_OP_VISIBILITY_TYPE errType:" + i17 + ", errcode:" + i18);
            if (i18 == 0) {
                java.util.Iterator it6 = list.iterator();
                while (it6.hasNext()) {
                    int intValue = ((java.lang.Number) it6.next()).intValue();
                    ff4.q qVar = (ff4.q) H;
                    nf4.l i19 = ef4.w.f334001t.i();
                    nf4.j J0 = i19.J0(intValue);
                    if (J0 != null) {
                        if (qVar.f343243c == 1) {
                            J0.t0(4);
                        } else {
                            J0.A0(4);
                        }
                        i19.mo11260x413cb2b4(J0);
                    }
                }
                ff4.q qVar2 = (ff4.q) H;
                if (qVar2.f343243c == 1 && !qVar2.f343244d) {
                    r2 = true;
                }
                pm0.v.X(new lf4.z0(this, r2));
                return;
            }
            return;
        }
        if (H instanceof ff4.o) {
            if (i18 != 0) {
                if (i18 == 324) {
                    pm0.v.X(new lf4.y0(this, ((ff4.o) H).f343242c == 1, false));
                    return;
                }
                return;
            }
            java.util.Iterator it7 = list.iterator();
            while (it7.hasNext()) {
                int intValue2 = ((java.lang.Number) it7.next()).intValue();
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onSceneEnd update story favorite: errType ");
                sb6.append(i17);
                sb6.append(", errcode ");
                sb6.append(i18);
                sb6.append(", localId ");
                sb6.append(intValue2);
                sb6.append(", favorite:");
                int i27 = ((ff4.o) H).f343242c;
                sb6.append(i27);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, sb6.toString());
                nf4.l i28 = ef4.w.f334001t.i();
                nf4.j J02 = i28.J0(intValue2);
                if (J02 != null) {
                    if (i27 == 1) {
                        J02.t0(8);
                        J02.f69404x2b7f11ae = c01.id.e();
                    } else {
                        J02.A0(8);
                        J02.f69404x2b7f11ae = 0;
                    }
                    i28.mo11260x413cb2b4(J02);
                }
            }
            pm0.v.X(new lf4.y0(this, ((ff4.o) H).f343242c == 1, true));
        }
    }
}

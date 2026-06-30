package lf4;

/* loaded from: classes4.dex */
public final class q0 extends lf4.l implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f399994e;

    /* renamed from: f, reason: collision with root package name */
    public final lf4.h f399995f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f399996g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f399997h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.ArrayList f399998i;

    /* renamed from: m, reason: collision with root package name */
    public int f399999m;

    /* renamed from: n, reason: collision with root package name */
    public int f400000n;

    /* renamed from: o, reason: collision with root package name */
    public int f400001o;

    /* renamed from: p, reason: collision with root package name */
    public int f400002p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f400003q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f400004r;

    /* renamed from: s, reason: collision with root package name */
    public final yz5.r f400005s;

    public q0(java.lang.String username, lf4.h galleryCallback, boolean z17, boolean z18, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        z18 = (i17 & 8) != 0 ? false : z18;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(galleryCallback, "galleryCallback");
        this.f399994e = username;
        this.f399995f = galleryCallback;
        this.f399996g = z17;
        this.f399997h = z18;
        this.f399998i = new java.util.ArrayList();
        this.f400000n = -1;
        this.f400001o = -1;
        this.f400002p = -1;
        this.f400003q = true;
        lf4.p0 p0Var = new lf4.p0(this);
        this.f400005s = p0Var;
        gm0.j1.n().f354821b.a(bd1.f.f4202x366c91de, this);
        gm0.j1.n().f354821b.a(764, this);
        gf4.l.f352887d.a(p0Var);
        ((sf4.a1) galleryCallback).i(1);
        this.f400004r = bf4.f.f101248b.f();
    }

    @Override // lf4.l
    public void a(int i17, int i18) {
        this.f400000n = -1;
        gm0.j1.n().f354821b.c(764);
    }

    @Override // lf4.l
    public void c(int i17, int i18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SelfGalleryPresenter", "LogStory: deleteItem " + i18);
        if (i18 >= 0) {
            java.util.ArrayList arrayList = this.f399998i;
            if (i18 < arrayList.size()) {
                this.f400000n = i18;
                java.lang.Object obj = arrayList.get(i18);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
                if4.f fVar = (if4.f) obj;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SelfGalleryPresenter", "LogStory: deleteItem1 storyinfo " + fVar + " deleteItemIndex " + this.f400000n + " localid " + fVar.f372780e.f372786a);
                ef4.v vVar = ef4.w.f334001t;
                nf4.l i19 = vVar.i();
                if4.h hVar = fVar.f372780e;
                nf4.j J0 = i19.J0(hVar.f372786a);
                nf4.l i27 = vVar.i();
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                int i28 = hVar.f372786a;
                sb6.append(i28);
                sb6.append('_');
                sb6.append(hVar.f372788c);
                java.lang.String localId = sb6.toString();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(localId, "localId");
                i27.f418406i.add(localId);
                if (J0 != null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SelfGalleryPresenter", "LogStory: deleteItem2 storyinfo " + fVar + " deleteItemIndex " + this.f400000n + " localid " + i28 + ' ' + J0.f69410x443468b);
                    long j17 = J0.f69410x443468b;
                    if (j17 == 0) {
                        ef4.e0.f333974a.a(i28);
                        pm0.v.X(new lf4.e0(true, this));
                    } else if (this.f400000n != -1) {
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        java.util.ArrayList arrayList3 = new java.util.ArrayList();
                        arrayList2.add(new ff4.p(j17, 1));
                        arrayList3.add(java.lang.Integer.valueOf(i28));
                        gm0.j1.n().f354821b.g(new ff4.e(arrayList2, arrayList3));
                    }
                }
                if (hVar.a()) {
                    vVar.l().mo50293x3498a0(new lf4.c0(fVar));
                }
            }
        }
    }

    @Override // lf4.l
    public void d() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SelfGalleryPresenter", "LogStory: destroy");
        gm0.j1.n().f354821b.q(bd1.f.f4202x366c91de, this);
        gm0.j1.n().f354821b.q(764, this);
        gf4.l.f352887d.j(this.f400005s);
    }

    @Override // lf4.l
    public void e(int i17) {
    }

    @Override // lf4.l
    public void f() {
        java.util.ArrayList a17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SelfGalleryPresenter", "LogStory: initLoad");
        java.util.ArrayList oldItems = this.f399998i;
        if4.f fVar = (if4.f) kz5.n0.a0(oldItems, 0);
        boolean z17 = this.f399997h;
        boolean z18 = this.f399996g;
        java.lang.String str = this.f399994e;
        lf4.k kVar = lf4.l.f399969d;
        if (z17) {
            java.util.ArrayList a18 = kVar.a(str, z18);
            a17 = new java.util.ArrayList();
            int i17 = 0;
            for (java.lang.Object obj : a18) {
                int i18 = i17 + 1;
                if (i17 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                if (i17 == 0) {
                    a17.add(obj);
                }
                i17 = i18;
            }
        } else {
            a17 = kVar.a(str, z18);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SelfGalleryPresenter", "LogStory: preload Db count " + a17.size());
        if4.f fVar2 = (if4.f) kz5.n0.a0(a17, 0);
        lf4.h hVar = this.f399995f;
        if (fVar == null || fVar2 == null || fVar.f372779d == fVar2.f372779d) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(oldItems, "oldItems");
            p012xc85e97e9.p103xe821e364.p104xd1075a44.c0 a19 = p012xc85e97e9.p103xe821e364.p104xd1075a44.h0.a(new lf4.j(oldItems, a17), false);
            ((sf4.a1) hVar).h(0, oldItems);
            ((sf4.a1) hVar).d();
            a19.a(new lf4.d0(this, a17));
        } else {
            oldItems.clear();
            oldItems.addAll(a17);
            ((sf4.a1) hVar).h(0, oldItems);
            ((sf4.a1) hVar).c(0);
            ((sf4.a1) hVar).d();
        }
        if (!bf4.f.f101248b.f()) {
            n();
        } else if (this.f400003q) {
            this.f400003q = false;
            n();
        }
    }

    @Override // lf4.l
    public void g(int i17) {
        this.f399999m = i17;
        if (i17 == 0) {
            return;
        }
        boolean f17 = bf4.f.f101248b.f();
        ef4.w.f334001t.l().mo50293x3498a0(new lf4.l0(this));
        if (f17) {
            gf4.l.f352887d.n(false, false);
        }
        if (this.f400004r != f17) {
            this.f400004r = f17;
            java.util.ArrayList arrayList = this.f399998i;
            sf4.a1 a1Var = (sf4.a1) this.f399995f;
            a1Var.h(0, arrayList);
            a1Var.c(0);
        }
    }

    @Override // lf4.l
    public void h(int i17, int i18, boolean z17) {
        if (i17 == 3) {
            if (!z17) {
                ef4.w.f334001t.l().mo50293x3498a0(new lf4.i0(this));
            } else if (i18 == 0) {
                ef4.w.f334001t.l().mo50293x3498a0(new lf4.n0(this));
            } else {
                if (i18 != 1) {
                    return;
                }
                ef4.w.f334001t.l().mo50293x3498a0(new lf4.i0(this));
            }
        }
    }

    @Override // lf4.l
    public void i(int i17, int i18) {
        this.f400002p = i18;
        if (this.f399999m == 1) {
            ef4.w.f334001t.l().mo50293x3498a0(new lf4.l0(this));
        }
    }

    @Override // lf4.l
    public void j() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SelfGalleryPresenter", "LogStory: pause");
    }

    @Override // lf4.l
    public void k() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SelfGalleryPresenter", "LogStory: resume");
        f();
    }

    @Override // lf4.l
    public void l(int i17, int i18, boolean z17, nf4.j jVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SelfGalleryPresenter", "LogStory: setFavorite " + i18);
        if (i18 >= 0) {
            java.util.ArrayList arrayList = this.f399998i;
            if (i18 < arrayList.size()) {
                boolean z18 = !z17;
                java.lang.Object obj = arrayList.get(i18);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
                if4.f fVar = (if4.f) obj;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SelfGalleryPresenter", "LogStory: setFavorite storyinfo " + fVar + " localid " + fVar.f372780e.f372786a + " targetFavorite:" + z18);
                nf4.j J0 = ef4.w.f334001t.i().J0((int) fVar.f372776a.f72763xa3c65b86);
                if (J0 != null) {
                    if (z18) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(1045L, 0L, 1L);
                    } else {
                        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(1045L, 1L, 1L);
                    }
                    mf4.d.f(mf4.d.f407693a, z18 ? 1L : 2L, java.lang.String.valueOf(J0.f69410x443468b), 1L, 0L, 0L, 24, null);
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                    arrayList2.add(java.lang.Long.valueOf(J0.f69410x443468b));
                    arrayList3.add(java.lang.Integer.valueOf((int) J0.f72763xa3c65b86));
                    ef4.e0.f333974a.d(arrayList2, arrayList3, z18);
                }
            }
        }
    }

    @Override // lf4.l
    public void m(int i17, int i18, boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SelfGalleryPresenter", "LogStory: setPrivacy " + i18);
        if (i18 >= 0) {
            java.util.ArrayList arrayList = this.f399998i;
            if (i18 < arrayList.size()) {
                this.f400001o = i18;
                boolean z18 = !z17;
                java.lang.Object obj = arrayList.get(i18);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
                if4.f fVar = (if4.f) obj;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SelfGalleryPresenter", "LogStory: setPrivacy storyinfo " + fVar + " setPrivacyItemIndex " + this.f400001o + " localid " + fVar.f372780e.f372786a + " targetPrivacy:" + z18);
                nf4.j J0 = ef4.w.f334001t.i().J0((int) fVar.f372776a.f72763xa3c65b86);
                if (J0 != null) {
                    if (z18) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(1045L, 2L, 1L);
                    } else {
                        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(1045L, 3L, 1L);
                    }
                    mf4.d.f(mf4.d.f407693a, z18 ? 3L : 4L, java.lang.String.valueOf(J0.f69410x443468b), 1L, 0L, 0L, 24, null);
                    long j17 = J0.f69410x443468b;
                    int i19 = (int) J0.f72763xa3c65b86;
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                    arrayList3.add(java.lang.Integer.valueOf(i19));
                    arrayList2.add(new ff4.q(j17, 4, z18 ? 1 : 0, false));
                    gm0.j1.n().f354821b.g(new ff4.e(arrayList2, arrayList3));
                }
            }
        }
    }

    public final void n() {
        boolean z17;
        java.util.ArrayList arrayList = this.f399998i;
        boolean z18 = false;
        if (!(arrayList instanceof java.util.Collection) || !arrayList.isEmpty()) {
            java.util.Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if4.f fVar = (if4.f) it.next();
                if (bf4.f.f101248b.f()) {
                    if4.a aVar = fVar.f372781f;
                    z17 = aVar.f372770e || aVar.f372771f;
                } else {
                    z17 = fVar.f372781f.f372769d;
                }
                if (z17) {
                    z18 = true;
                    break;
                }
            }
        }
        boolean isEmpty = arrayList.isEmpty();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SelfGalleryPresenter", "LogStory: updateCommentRead " + z18 + ' ' + isEmpty);
        if (!z18) {
            gf4.l.f352887d.n(z18, isEmpty);
        } else if (this.f399999m == 0) {
            gf4.l.f352887d.n(z18, isEmpty);
        }
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        ff4.e eVar;
        ff4.a H;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SelfGalleryPresenter", "LogStory: " + i17 + ' ' + i18 + ' ' + str);
        if (!(m1Var instanceof ff4.e) || (H = (eVar = (ff4.e) m1Var).H()) == null) {
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
            pm0.v.X(new lf4.e0(i18 == 0, this));
            return;
        }
        if (H instanceof ff4.q) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SelfGalleryPresenter", "onSceneEnd MMSTORY_OBJ_OP_VISIBILITY_TYPE errType:" + i17 + ", errcode:" + i18);
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
                pm0.v.X(new lf4.g0(this));
                return;
            }
            return;
        }
        if (H instanceof ff4.o) {
            long j17 = H.f343192a;
            if (i18 != 0) {
                if (i18 == 324) {
                    pm0.v.X(new lf4.f0(this, j17, ((ff4.o) H).f343242c == 1, false));
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
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SelfGalleryPresenter", sb6.toString());
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
            pm0.v.X(new lf4.f0(this, j17, ((ff4.o) H).f343242c == 1, true));
        }
    }
}

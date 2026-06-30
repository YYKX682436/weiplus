package vh5;

/* loaded from: classes12.dex */
public final class q implements mf3.l, u3.q {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f518763d;

    /* renamed from: e, reason: collision with root package name */
    public final mf3.u f518764e;

    /* renamed from: f, reason: collision with root package name */
    public int f518765f;

    /* renamed from: g, reason: collision with root package name */
    public mf3.n f518766g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f518767h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1855x62f6fe4.p1858x373aa5.C16495xfae9f28 f518768i;

    /* renamed from: m, reason: collision with root package name */
    public vh5.g f518769m;

    /* renamed from: n, reason: collision with root package name */
    public final mf3.p f518770n;

    public q(android.view.View itemView, mf3.u mediaType) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemView, "itemView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaType, "mediaType");
        this.f518763d = itemView;
        this.f518764e = mediaType;
        this.f518765f = -1;
        this.f518767h = "";
        android.content.Context context = itemView.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        this.f518770n = new mf3.p(context);
    }

    @Override // mf3.l
    public void F() {
        b();
        mf3.n nVar = this.f518766g;
        if (nVar != null) {
            nVar.F();
        }
    }

    @Override // u3.q
    public void a(u3.s sVar, float f17, float f18) {
        this.f518763d.setTranslationX(f17);
    }

    public final java.lang.String b() {
        java.lang.String hexString = java.lang.Integer.toHexString(hashCode());
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(hexString, "toHexString(...)");
        return hexString;
    }

    public void c(int i17, vh5.o eventData) {
        mf3.j jVar;
        mf3.k kVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(eventData, "eventData");
        f06.d apiKClass = p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(vh5.p.class);
        mf3.p pVar = this.f518770n;
        pVar.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(apiKClass, "apiKClass");
        vh5.p pVar2 = (vh5.p) pVar.a(xz5.a.b(apiKClass));
        if (pVar2 != null) {
            wh5.k0 k0Var = (wh5.k0) pVar2;
            wh5.m0 m0Var = eventData instanceof wh5.m0 ? (wh5.m0) eventData : null;
            if (m0Var != null) {
                if (m0Var.f527611a) {
                    uf3.c cVar = (uf3.c) k0Var.g(uf3.c.class);
                    if (cVar != null) {
                        java.lang.String str = m0Var.f527612b;
                        if (str == null) {
                            str = "";
                        }
                        uf3.g gVar = (uf3.g) cVar;
                        mf3.s sVar = gVar.f407643m;
                        if (sVar != null && (kVar = sVar.f407650a) != null) {
                            gVar.Q("applyTranslateResult, path: ".concat(str), new java.lang.Object[0]);
                            vf3.a aVar = (vf3.a) gVar.H(vf3.a.class);
                            if (aVar != null) {
                                aVar.p1(kVar, str, gVar);
                            }
                            uf3.a aVar2 = (uf3.a) gVar.f407637d.a(uf3.a.class);
                            if (aVar2 != null) {
                                aVar2.h();
                            }
                        }
                    }
                } else {
                    uf3.c cVar2 = (uf3.c) k0Var.g(uf3.c.class);
                    if (cVar2 != null) {
                        uf3.g gVar2 = (uf3.g) cVar2;
                        uf3.a aVar3 = (uf3.a) gVar2.f407637d.a(uf3.a.class);
                        if (aVar3 != null) {
                            aVar3.D();
                        }
                        gVar2.V();
                    }
                }
            }
            wh5.j0 j0Var = eventData instanceof wh5.j0 ? (wh5.j0) eventData : null;
            if (j0Var != null) {
                if (j0Var.f527605a) {
                    uf3.a aVar4 = (uf3.a) k0Var.g(uf3.a.class);
                    if (aVar4 != null) {
                        aVar4.b();
                    }
                } else {
                    uf3.a aVar5 = (uf3.a) k0Var.g(uf3.a.class);
                    if (aVar5 != null) {
                        aVar5.D();
                    }
                }
            }
            wh5.i0 i0Var = eventData instanceof wh5.i0 ? (wh5.i0) eventData : null;
            if (i0Var != null) {
                uf3.c cVar3 = (uf3.c) k0Var.g(uf3.c.class);
                if (cVar3 != null) {
                    uf3.g gVar3 = (uf3.g) cVar3;
                    em.o1 o1Var = gVar3.f508717o;
                    if (o1Var == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootVB");
                        throw null;
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.p1855x62f6fe4.p1857x32b0ec.C16493x22c368e7 f17 = o1Var.f();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(f17, "getLiveSwitchableContainer(...)");
                    if (f17.getWidth() > f17.getHeight()) {
                        gVar3.W(false);
                    } else {
                        gVar3.R();
                    }
                }
                if (i0Var.f527603a || (jVar = (uf3.a) k0Var.g(uf3.a.class)) == null) {
                    return;
                }
                ((pf3.g) jVar).e0();
            }
        }
    }

    @Override // mf3.l
    public void i() {
        b();
        mf3.n nVar = this.f518766g;
        if (nVar != null) {
            nVar.i();
        }
    }

    @Override // mf3.l
    public mg3.b l() {
        mf3.n nVar = this.f518766g;
        if (nVar != null) {
            return nVar.l();
        }
        return null;
    }

    @Override // mf3.l
    public mg3.e o() {
        return this.f518769m;
    }

    @Override // mf3.l
    /* renamed from: onPause */
    public void mo129547xb01dfb57() {
        b();
        mf3.n nVar = this.f518766g;
        if (nVar != null) {
            nVar.mo129547xb01dfb57();
        }
    }

    @Override // mf3.l
    /* renamed from: onResume */
    public void mo124474x57429eec() {
        b();
        mf3.n nVar = this.f518766g;
        if (nVar != null) {
            nVar.mo124474x57429eec();
        }
    }

    @Override // mf3.l
    public void q(float f17) {
        mf3.n nVar = this.f518766g;
        if (nVar != null) {
            nVar.q(f17);
        }
    }

    @Override // mf3.l
    /* renamed from: recycle */
    public void mo129548x408b7293() {
        b();
        mf3.n nVar = this.f518766g;
        if (nVar != null) {
            nVar.mo129548x408b7293();
        }
    }

    @Override // mf3.l
    public void t(mf3.s bindContext) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bindContext, "bindContext");
        this.f518765f = bindContext.f407651b;
        vh5.g gVar = this.f518769m;
        if (gVar != null) {
            gVar.f518745g = bindContext;
        }
        this.f518767h = bindContext.f407650a.mo2110x5db1b11();
        b();
        mf3.n nVar = this.f518766g;
        if (nVar != null) {
            nVar.t(bindContext);
        }
        android.view.View findViewById = this.f518763d.findViewById(com.p314xaae8f345.mm.R.id.cra);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        android.widget.TextView textView = (android.widget.TextView) findViewById;
        int i17 = this.f518765f;
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).nj(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2518x55bb7a46.C20025xc6e1c289()) == 1) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append("【index】" + i17 + " \n");
            sb6.append("【holder】" + b() + "\n【mediaId】" + this.f518767h);
            textView.setText(sb6.toString());
        }
    }

    @Override // mf3.l
    public void u(android.view.View parentView) {
        mf3.n nVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parentView, "parentView");
        if (this.f518766g == null) {
            f06.d a17 = p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(mf3.m.class);
            mf3.p pVar = this.f518770n;
            mf3.m mVar = (mf3.m) pVar.b(a17);
            lf3.j jVar = (lf3.j) pVar.b(p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(lf3.j.class));
            android.view.View view = this.f518763d;
            android.view.View findViewById = view.findViewById(com.p314xaae8f345.mm.R.id.shc);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
            this.f518768i = (com.p314xaae8f345.mm.p1006xc5476f33.p1855x62f6fe4.p1858x373aa5.C16495xfae9f28) findViewById;
            mf3.u uVar = this.f518764e;
            if (mVar != null) {
                android.content.Context context = view.getContext();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
                nVar = mVar.O0(context, pVar, uVar);
            } else {
                nVar = null;
            }
            this.f518766g = nVar;
            if (nVar == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MediaGallery.LiveGalleryHolder", "createHolder error, factory: " + mVar + " mediaType: " + uVar);
            }
            mf3.n nVar2 = this.f518766g;
            if (nVar2 != null) {
                nVar2.p(b());
                com.p314xaae8f345.mm.p1006xc5476f33.p1855x62f6fe4.p1858x373aa5.C16495xfae9f28 c16495xfae9f28 = this.f518768i;
                if (c16495xfae9f28 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("interceptorLayout");
                    throw null;
                }
                nVar2.u(c16495xfae9f28);
                com.p314xaae8f345.mm.p1006xc5476f33.p1855x62f6fe4.p1858x373aa5.C16495xfae9f28 c16495xfae9f282 = this.f518768i;
                if (c16495xfae9f282 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("interceptorLayout");
                    throw null;
                }
                c16495xfae9f282.m66601x534b960f(nVar2);
                com.p314xaae8f345.mm.p1006xc5476f33.p1855x62f6fe4.p1858x373aa5.C16495xfae9f28 c16495xfae9f283 = this.f518768i;
                if (c16495xfae9f283 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("interceptorLayout");
                    throw null;
                }
                vh5.g gVar = new vh5.g(c16495xfae9f283, nVar2, jVar);
                f06.d api = p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(mf3.o.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(api, "api");
                pVar.d(xz5.a.b(api), gVar);
                this.f518769m = gVar;
            }
        }
    }
}

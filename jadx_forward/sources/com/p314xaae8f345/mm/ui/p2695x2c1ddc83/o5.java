package com.p314xaae8f345.mm.ui.p2695x2c1ddc83;

/* loaded from: classes11.dex */
public class o5 implements c01.y8, l75.z0, xg3.h0 {
    public boolean A;
    public boolean B;
    public ag5.b D;
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d E;
    public boolean F;
    public int G;
    public int H;
    public boolean I;

    /* renamed from: J, reason: collision with root package name */
    public long f289456J;
    public final java.util.concurrent.atomic.AtomicBoolean K;

    /* renamed from: d, reason: collision with root package name */
    public yf5.j0 f289457d;

    /* renamed from: e, reason: collision with root package name */
    public android.content.Context f289458e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ViewOnTouchListenerC22366xcd5c2226 f289459f;

    /* renamed from: g, reason: collision with root package name */
    public s35.b f289460g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.LinearLayout f289461h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.View f289462i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.TextView f289463m;

    /* renamed from: n, reason: collision with root package name */
    public int f289464n;

    /* renamed from: o, reason: collision with root package name */
    public int f289465o;

    /* renamed from: p, reason: collision with root package name */
    public int f289466p;

    /* renamed from: q, reason: collision with root package name */
    public int f289467q;

    /* renamed from: r, reason: collision with root package name */
    public int f289468r;

    /* renamed from: s, reason: collision with root package name */
    public int f289469s;

    /* renamed from: t, reason: collision with root package name */
    public int f289470t;

    /* renamed from: v, reason: collision with root package name */
    public boolean f289472v;

    /* renamed from: w, reason: collision with root package name */
    public int f289473w;

    /* renamed from: x, reason: collision with root package name */
    public int f289474x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f289475y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f289476z;

    /* renamed from: u, reason: collision with root package name */
    public int f289471u = -1;
    public final java.lang.Runnable C = new com.p314xaae8f345.mm.ui.p2695x2c1ddc83.b5(this);

    public o5() {
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        this.E = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5596xf29ef930>(a0Var) { // from class: com.tencent.mm.ui.conversation.FolderHelper$convBoxEventListener$1
            {
                this.f39173x3fe91575 = -1733768384;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5596xf29ef930 c5596xf29ef930) {
                com.p314xaae8f345.mm.ui.p2695x2c1ddc83.d8 d8Var;
                java.util.ArrayList arrayList;
                java.util.HashMap hashMap;
                java.util.Collection values;
                jz5.f0 f0Var;
                yf5.a aVar;
                android.util.SparseArray sparseArray;
                int i17;
                int i18;
                int i19;
                jz5.f0 f0Var2;
                jz5.f0 f0Var3;
                jz5.f0 f0Var4;
                jz5.f0 f0Var5;
                java.util.Collection values2;
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5596xf29ef930 event = c5596xf29ef930;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                am.pf pfVar = event.f135921g;
                int i27 = pfVar.f89151c;
                com.p314xaae8f345.mm.ui.p2695x2c1ddc83.o5 o5Var = com.p314xaae8f345.mm.ui.p2695x2c1ddc83.o5.this;
                if (i27 == 0) {
                    yf5.j0 j0Var = o5Var.f289457d;
                    if (j0Var == null || (sparseArray = (aVar = ((yf5.w0) j0Var).f543518q).f543378b) == null) {
                        f0Var = null;
                    } else {
                        java.util.HashMap hashMap2 = aVar.f543379c;
                        if (hashMap2 == null || (values2 = hashMap2.values()) == null) {
                            i17 = 0;
                        } else {
                            java.util.ArrayList arrayList2 = new java.util.ArrayList();
                            for (java.lang.Object obj : values2) {
                                if (((com.p314xaae8f345.mm.p2621x8fb0427b.m4) c01.d9.b().r()).J((com.p314xaae8f345.mm.p2621x8fb0427b.l4) obj)) {
                                    arrayList2.add(obj);
                                }
                            }
                            i17 = arrayList2.size();
                        }
                        int size = sparseArray.size();
                        if (size >= 0) {
                            int i28 = 0;
                            i18 = 0;
                            while (true) {
                                java.lang.String str = (java.lang.String) sparseArray.get(i28);
                                if (i28 < o5Var.f289470t + i17) {
                                    com.p314xaae8f345.mm.p2621x8fb0427b.l4 l17 = o5Var.l(str);
                                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(l17 != null ? l17.W0() : null, "conversationboxservice") || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "conversationboxservice") || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, pfVar.f89150b)) {
                                        i18++;
                                    }
                                }
                                if (i28 == size) {
                                    break;
                                }
                                i28++;
                            }
                        } else {
                            i18 = 0;
                        }
                        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(sparseArray.get(o5Var.f289470t + i17), "conversationboxservice")) {
                            i18++;
                        }
                        int i29 = i17 + o5Var.f289470t + i18;
                        java.lang.String str2 = (java.lang.String) sparseArray.get(i29);
                        jz5.f0 f0Var6 = jz5.f0.f384359a;
                        if (str2 != null) {
                            com.p314xaae8f345.mm.p2621x8fb0427b.l4 l18 = o5Var.l(str2);
                            if (l18 != null) {
                                com.p314xaae8f345.mm.ui.p2695x2c1ddc83.d8 d8Var2 = pfVar.f89149a;
                                if (d8Var2 != null) {
                                    i19 = size;
                                    d8Var2.b(l18.w0() + 1000);
                                } else {
                                    i19 = size;
                                }
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FolderHelper", "handleGetConvEvent updateConvTime: " + l18.w0() + ", talker: " + l18.h1() + ", position: " + i29 + ", offset: " + i18);
                                f0Var5 = f0Var6;
                            } else {
                                i19 = size;
                                f0Var5 = null;
                            }
                            if (f0Var5 == null) {
                                com.p314xaae8f345.mm.ui.p2695x2c1ddc83.d8 d8Var3 = pfVar.f89149a;
                                if (d8Var3 != null) {
                                    d8Var3.b(0L);
                                }
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FolderHelper", "handleGetConvEvent updateConvTime: 0");
                            }
                            f0Var2 = f0Var6;
                        } else {
                            i19 = size;
                            f0Var2 = null;
                        }
                        if (f0Var2 == null) {
                            int i37 = i19;
                            int i38 = i37 < 1 ? 0 : i37 - 1;
                            java.lang.String str3 = (java.lang.String) sparseArray.get(i38);
                            if (str3 != null) {
                                com.p314xaae8f345.mm.p2621x8fb0427b.l4 l19 = o5Var.l(str3);
                                if (l19 != null) {
                                    com.p314xaae8f345.mm.ui.p2695x2c1ddc83.d8 d8Var4 = pfVar.f89149a;
                                    if (d8Var4 != null) {
                                        d8Var4.b(l19.w0() - 1000);
                                    }
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FolderHelper", "handleGetConvEvent updateConvTime _lastUserName:" + str3 + " pos:" + i38);
                                    f0Var4 = f0Var6;
                                } else {
                                    f0Var4 = null;
                                }
                                if (f0Var4 == null) {
                                    com.p314xaae8f345.mm.ui.p2695x2c1ddc83.d8 d8Var5 = pfVar.f89149a;
                                    if (d8Var5 != null) {
                                        d8Var5.b(0L);
                                    }
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FolderHelper", "handleGetConvEvent updateConvTime: 0, pos item is empty for findConversationWithDB");
                                }
                                f0Var3 = f0Var6;
                            } else {
                                f0Var3 = null;
                            }
                            if (f0Var3 == null) {
                                com.p314xaae8f345.mm.ui.p2695x2c1ddc83.d8 d8Var6 = pfVar.f89149a;
                                if (d8Var6 != null) {
                                    d8Var6.b(0L);
                                }
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FolderHelper", "handleGetConvEvent updateConvTime: 0, pos item is empty");
                            }
                        }
                        f0Var = f0Var6;
                    }
                    if (f0Var == null) {
                        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.d8 d8Var7 = pfVar.f89149a;
                        if (d8Var7 != null) {
                            d8Var7.b(0L);
                        }
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FolderHelper", "handleGetConvEvent updateConvTime: 0, pos is empty");
                    }
                } else if (i27 == 1 && (d8Var = pfVar.f89149a) != null) {
                    yf5.j0 j0Var2 = o5Var.f289457d;
                    if (j0Var2 == null || (hashMap = ((yf5.w0) j0Var2).f543518q.f543379c) == null || (values = hashMap.values()) == null) {
                        arrayList = null;
                    } else {
                        arrayList = new java.util.ArrayList();
                        for (java.lang.Object obj2 : values) {
                            if (r01.z.n(((com.p314xaae8f345.mm.p2621x8fb0427b.l4) obj2).h1())) {
                                arrayList.add(obj2);
                            }
                        }
                    }
                    d8Var.a(arrayList);
                }
                return true;
            }
        };
        this.G = -1;
        this.H = -1;
        this.K = new java.util.concurrent.atomic.AtomicBoolean(false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x004b, code lost:
    
        if (((va3.z0) q21.d.a()).f(r9.Q0()) == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0054, code lost:
    
        if (r9.mo78013xfb85f7b0() != 268445456) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:97:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(com.p314xaae8f345.mm.ui.p2695x2c1ddc83.o5 r7, xg3.l0 r8, com.p314xaae8f345.mm.p2621x8fb0427b.f9 r9, boolean r10) {
        /*
            Method dump skipped, instructions count: 541
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.ui.p2695x2c1ddc83.o5.a(com.tencent.mm.ui.conversation.o5, xg3.l0, com.tencent.mm.storage.f9, boolean):void");
    }

    public static /* synthetic */ void h(com.p314xaae8f345.mm.ui.p2695x2c1ddc83.o5 o5Var, int i17, boolean z17, int i18, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: checkFoldBannerVisible");
        }
        if ((i18 & 2) != 0) {
            z17 = true;
        }
        o5Var.f(i17, z17);
    }

    public final void A(boolean z17) {
        if (this.f289458e == null || !gm0.j1.a() || this.f289461h == null || this.f289459f == null || this.f289457d == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FolderHelper", "acc is not ready!");
            return;
        }
        boolean z18 = z17 || this.I;
        this.I = false;
        pm0.v.V(100L, new com.p314xaae8f345.mm.ui.p2695x2c1ddc83.n5(this, z18));
    }

    public final void B(java.util.List userNames, java.lang.String parentRef) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userNames, "userNames");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parentRef, "parentRef");
        g95.x.f351360a.f(userNames, parentRef);
    }

    @Override // c01.y8
    public void a0() {
        A(true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00e3, code lost:
    
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r0 != null ? r0.W0() : null, "hidden_conv_parent") != false) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01f9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int b(com.p314xaae8f345.mm.p2621x8fb0427b.l4 r16, boolean r17, boolean r18) {
        /*
            Method dump skipped, instructions count: 532
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.ui.p2695x2c1ddc83.o5.b(com.tencent.mm.storage.l4, boolean, boolean):int");
    }

    public final void c(int i17, boolean z17) {
        if (z17) {
            try {
                i17 -= com.p314xaae8f345.mm.ui.bl.c(this.f289458e);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.FolderHelper", e17, "", new java.lang.Object[0]);
                return;
            }
        }
        int h17 = com.p314xaae8f345.mm.ui.bl.h(this.f289458e);
        int a17 = com.p314xaae8f345.mm.ui.bl.a(this.f289458e);
        int h18 = i65.a.h(this.f289458e, com.p314xaae8f345.mm.R.C30860x5b28f31.f561160b2);
        int i18 = (i17 - a17) - h18;
        this.f289467q = i18;
        this.f289469s = i17 - h18;
        this.f289468r = a17 + h17;
        this.f289470t = i18 / this.f289464n;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FolderHelper", "configParams, height: " + i17);
    }

    @Override // xg3.h0
    public void c0(xg3.m0 m0Var, xg3.l0 l0Var) {
        ((ku5.t0) ku5.t0.f394148d).h(new com.p314xaae8f345.mm.ui.p2695x2c1ddc83.g5(l0Var, this), "FolderHelper");
    }

    public final void d(com.p314xaae8f345.mm.p2621x8fb0427b.l4 conv) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(conv, "conv");
        if (p()) {
            return;
        }
        java.lang.String W0 = conv.W0();
        if (!(W0 == null || W0.length() == 0) || com.p314xaae8f345.mm.p2621x8fb0427b.z3.X3(conv.h1())) {
            return;
        }
        conv.e2(com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7.f58223x264a8965);
        boolean r17 = r();
        g95.w wVar = g95.x.f351360a;
        if (!r17) {
            java.lang.String h17 = conv.h1();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(h17, "getUsername(...)");
            wVar.e(h17, conv.W0(), conv.u0());
        } else {
            conv.T1("message_fold");
            java.lang.String h18 = conv.h1();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(h18, "getUsername(...)");
            wVar.e(h18, "message_fold", conv.u0());
        }
    }

    public final void e(java.lang.String str, boolean z17) {
        com.p314xaae8f345.mm.p2621x8fb0427b.l4 p17 = ((com.p314xaae8f345.mm.p2621x8fb0427b.m4) c01.d9.b().r()).p(str);
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(p17 != null ? p17.W0() : null, "message_fold")) {
            if (z17) {
                p17.c2(com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7.f58223x264a8965);
            }
            g95.w wVar = g95.x.f351360a;
            java.lang.String h17 = p17.h1();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(h17, "getUsername(...)");
            wVar.e(h17, "", p17.u0());
        }
    }

    public final void f(int i17, boolean z17) {
        android.widget.LinearLayout linearLayout;
        android.widget.LinearLayout linearLayout2 = this.f289461h;
        if (!(linearLayout2 != null && linearLayout2.getVisibility() == i17) && (linearLayout = this.f289461h) != null) {
            linearLayout.setVisibility(i17);
        }
        if (i17 == 0) {
            boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.R("message_fold_config2").o("fold_button_status_int_sync", 65536) == 131072;
            z(z18 ? 131072 : 262144, this.f289462i, this.f289463m, z17 ? !z18 ? this.f289473w : g95.x.f351360a.c() : this.f289473w);
        }
    }

    @Override // l75.z0
    public void g(int i17, l75.a1 stg, java.lang.Object obj) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(stg, "stg");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(obj, "obj");
        if (gm0.j1.a() && stg == c01.d9.b().p()) {
            int o17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.o1(obj, 0);
            if (8193 == o17) {
                A(true);
            }
            if (42 == o17) {
                A(true);
                return;
            }
            return;
        }
        if (stg instanceof com.p314xaae8f345.mm.p2621x8fb0427b.l8) {
            java.lang.String str = (java.lang.String) obj;
            if (i17 == 5) {
                if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.X3(str)) {
                    pm0.v.X(new com.p314xaae8f345.mm.ui.p2695x2c1ddc83.h5(this));
                } else {
                    A(true);
                }
                ((py.a) ((qy.i) i95.n0.c(qy.i.class))).getClass();
                if (c01.v1.y(str)) {
                    if (((xf5.c) ((qy.j) i95.n0.c(qy.j.class))).Ai() == 0) {
                        ((com.p314xaae8f345.mm.p2621x8fb0427b.m4) c01.d9.b().r()).k("conversationboxservice");
                    } else {
                        ((xf5.c) ((qy.j) i95.n0.c(qy.j.class))).aj(false);
                    }
                }
                g95.d0.f351329a.a(str);
                ti3.c.f501112a.c(str, "");
            }
        }
    }

    public final void i(boolean z17, int i17) {
        yf5.n m17 = m("message_fold");
        if (m17 != null) {
            z(z17 ? 131072 : 262144, m17.f543465s, m17.f543466t, i17);
        }
        android.widget.LinearLayout linearLayout = this.f289461h;
        boolean z18 = false;
        if (linearLayout != null && linearLayout.getVisibility() == 0) {
            z18 = true;
        }
        if (z18) {
            z(z17 ? 131072 : 262144, this.f289462i, this.f289463m, i17);
        }
        if (p()) {
            return;
        }
        this.f289473w = i17;
    }

    public final boolean j(boolean z17) {
        java.util.Map map;
        boolean z18 = k("message_fold") != null;
        if (!z17 && z18) {
            return false;
        }
        yf5.j0 j0Var = this.f289457d;
        if (j0Var == null || (map = ((yf5.w0) j0Var).f543518q.f543379c) == null) {
            map = kz5.q0.f395534d;
        }
        java.util.Collection values = java.util.Collections.synchronizedMap(map).values();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : values) {
            com.p314xaae8f345.mm.p2621x8fb0427b.l4 l4Var = (com.p314xaae8f345.mm.p2621x8fb0427b.l4) obj;
            if (com.p314xaae8f345.mm.p2621x8fb0427b.l8.f276625b.contains(java.lang.Integer.valueOf(l4Var.f276618g2)) && ((com.p314xaae8f345.mm.p2621x8fb0427b.m4) c01.d9.b().r()).J(l4Var) && !com.p314xaae8f345.mm.p2621x8fb0427b.z3.X3(l4Var.h1())) {
                arrayList.add(obj);
            }
        }
        int size = arrayList.size() + (r() ? g95.x.f351360a.c() : 0);
        boolean o17 = o(size);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("checkIfShowFoldItem, ifShow:");
        sb6.append(o17);
        sb6.append(", existFoldItem:");
        sb6.append(z18);
        sb6.append(", topSize:");
        sb6.append(size);
        sb6.append(", forceShowBanner:");
        sb6.append(z17);
        sb6.append(", isCollapse:");
        sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.R("message_fold_config2").o("fold_button_status_int_sync", 65536) == 131072);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FolderHelper", sb6.toString());
        return o17;
    }

    public final com.p314xaae8f345.mm.p2621x8fb0427b.l4 k(java.lang.String str) {
        yf5.j0 j0Var = this.f289457d;
        if (j0Var != null) {
            return ((yf5.w0) j0Var).h(str);
        }
        return null;
    }

    public final com.p314xaae8f345.mm.p2621x8fb0427b.l4 l(java.lang.String str) {
        com.p314xaae8f345.mm.p2621x8fb0427b.l4 h17;
        yf5.j0 j0Var = this.f289457d;
        return (j0Var == null || (h17 = ((yf5.w0) j0Var).h(str)) == null) ? ((com.p314xaae8f345.mm.p2621x8fb0427b.m4) c01.d9.b().r()).p(str) : h17;
    }

    public final yf5.n m(java.lang.String str) {
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ViewOnTouchListenerC22366xcd5c2226 viewOnTouchListenerC22366xcd5c2226 = this.f289459f;
        if (viewOnTouchListenerC22366xcd5c2226 != null) {
            int childCount = viewOnTouchListenerC22366xcd5c2226.getChildCount();
            for (int i17 = 0; i17 < childCount; i17++) {
                android.view.View childAt = viewOnTouchListenerC22366xcd5c2226.getChildAt(i17);
                android.view.View findViewById = childAt != null ? childAt.findViewById(com.p314xaae8f345.mm.R.id.f565477cj1) : null;
                if (findViewById != null && (findViewById.getTag() instanceof yf5.n)) {
                    java.lang.Object tag = findViewById.getTag();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.e(tag, "null cannot be cast to non-null type com.tencent.mm.ui.conversation.adapter.ConvViewHolder");
                    yf5.n nVar = (yf5.n) tag;
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(nVar.f543459m, str)) {
                        return nVar;
                    }
                }
            }
        }
        return null;
    }

    public final java.util.Collection n() {
        java.util.Map map;
        yf5.j0 j0Var = this.f289457d;
        if (j0Var == null || (map = ((yf5.w0) j0Var).f543518q.f543379c) == null) {
            map = kz5.q0.f395534d;
        }
        java.util.Collection values = java.util.Collections.synchronizedMap(map).values();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : values) {
            if (!com.p314xaae8f345.mm.p2621x8fb0427b.z3.X3(((com.p314xaae8f345.mm.p2621x8fb0427b.l4) obj).h1())) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final boolean o(int i17) {
        if (this.G == -1) {
            this.G = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_android_msg_fold_limit_num, Integer.MAX_VALUE);
        }
        return i17 <= this.G && ((float) (i17 * this.f289464n)) >= ((float) this.f289467q) * 1.0f;
    }

    public final boolean p() {
        java.util.HashMap hashMap;
        java.util.Collection values;
        yf5.j0 j0Var = this.f289457d;
        java.lang.Object obj = null;
        if (j0Var != null && (hashMap = ((yf5.w0) j0Var).f543518q.f543379c) != null && (values = hashMap.values()) != null) {
            java.util.Iterator it = values.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                java.lang.Object next = it.next();
                int i17 = ((com.p314xaae8f345.mm.p2621x8fb0427b.l4) next).f276618g2;
                if (i17 == 66 || i17 == 132) {
                    obj = next;
                    break;
                }
            }
            obj = (com.p314xaae8f345.mm.p2621x8fb0427b.l4) obj;
        }
        return obj != null || this.A || this.B;
    }

    public final void q() {
        java.util.HashMap hashMap;
        if (((com.p314xaae8f345.mm.p2621x8fb0427b.m4) c01.d9.b().r()).p("message_fold") != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FolderHelper", "fold item exist");
            return;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.l4 l4Var = new com.p314xaae8f345.mm.p2621x8fb0427b.l4();
        l4Var.f276618g2 = 262144;
        l4Var.b2("message_fold");
        android.content.Context context = this.f289458e;
        l4Var.l1(context != null ? context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.b1q) : null);
        l4Var.n1(0L);
        l4Var.z1(xg3.b.b(l4Var, 2, 0L));
        if (((com.p314xaae8f345.mm.p2621x8fb0427b.m4) c01.d9.b().r()).G(l4Var) == -1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FolderHelper", "insert fold item failed, ignore it");
            return;
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.R("message_fold_config2").A("fold_button_status_int_sync", 262144);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        yf5.j0 j0Var = this.f289457d;
        if (j0Var != null && (hashMap = ((yf5.w0) j0Var).f543518q.f543379c) != null) {
            java.util.Iterator it = hashMap.entrySet().iterator();
            while (it.hasNext()) {
                com.p314xaae8f345.mm.p2621x8fb0427b.l4 l4Var2 = (com.p314xaae8f345.mm.p2621x8fb0427b.l4) ((java.util.Map.Entry) it.next()).getValue();
                if (l4Var2 != null) {
                    l4Var2.f276618g2 = b(l4Var2, false, false);
                }
                int i17 = l4Var2.f276618g2;
                if (i17 == 2 || i17 == 66) {
                    arrayList.add(l4Var2.h1());
                }
            }
        }
        B(arrayList, "message_fold");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FolderHelper", "insert fold item suc");
    }

    public final boolean r() {
        return com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.R("message_fold_config2").o("fold_button_status_int_sync", 65536) == 131072;
    }

    public final boolean s() {
        int o17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.R("message_fold_config2").o("fold_button_status_int_sync", 65536);
        return o17 == 262144 || o17 == 65536;
    }

    public final void t() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FolderHelper", "onTabPause");
        if (this.F) {
            this.F = false;
            s35.b bVar = this.f289460g;
            if (bVar != null) {
                bVar.j();
            }
            c01.d9.b().p().e(this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void u(yf5.n nVar) {
        long j17;
        int i17;
        boolean z17;
        float f17;
        int i18;
        java.lang.String str;
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.i5 i5Var;
        int i19;
        java.lang.String str2;
        long j18;
        android.view.View view;
        java.util.HashMap hashMap;
        jz5.f0 f0Var;
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.o5 o5Var = this;
        yf5.j0 j0Var = o5Var.f289457d;
        int i27 = 132;
        android.view.View view2 = null;
        boolean z18 = false;
        long j19 = 0;
        if (j0Var == null || (hashMap = ((yf5.w0) j0Var).f543518q.f543379c) == null) {
            j17 = 0;
            i17 = 0;
            z17 = false;
        } else {
            java.util.Iterator it = hashMap.entrySet().iterator();
            i17 = 0;
            z17 = false;
            while (it.hasNext()) {
                com.p314xaae8f345.mm.p2621x8fb0427b.l4 l4Var = (com.p314xaae8f345.mm.p2621x8fb0427b.l4) ((java.util.Map.Entry) it.next()).getValue();
                int b17 = o5Var.b(l4Var, false, false);
                if (b17 == 2 || b17 == 66) {
                    if (o5Var.m(l4Var.h1()) != null) {
                        o5Var.y(l4Var, 132, null);
                        f0Var = jz5.f0.f384359a;
                    } else {
                        f0Var = null;
                    }
                    if (f0Var == null) {
                        o5Var.y(l4Var, 4, "message_fold");
                    }
                    i17++;
                }
                if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.X3(l4Var.h1())) {
                    o5Var.y(l4Var, 131072, null);
                    z17 = true;
                } else if (((com.p314xaae8f345.mm.p2621x8fb0427b.m4) c01.d9.b().r()).J(l4Var)) {
                    j19++;
                }
            }
            j17 = j19;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
        java.lang.String str3 = ", allTopCount: ";
        java.lang.String str4 = "MicroMsg.FolderHelper";
        if (!z17) {
            p75.i0 g17 = dm.i2.K.g(kz5.b0.c(dm.i2.L));
            p75.y yVar = (p75.y) dm.i2.T.o(4611686018427387904L).c(dm.i2.W.m());
            yVar.f(dm.i2.M.i(0));
            yVar.f(dm.i2.f319059p0.i(0));
            yVar.f(dm.i2.X.g(537919488, 0));
            g17.f434190d = yVar;
            java.util.List l17 = g17.a().l(gm0.j1.u().f354686f);
            h0Var.f391656d = l17;
            i17 = l17.size();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FolderHelper", "performAllCollapse, fold item not exit! topFoldCount: " + i17 + ", allTopCount: " + j17);
        }
        int i28 = i17;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.R("message_fold_config2").A("fold_button_status_int_sync", 131072);
        o5Var.i(true, i28);
        o5Var.f289472v = false;
        o5Var.f289476z = false;
        o5Var.A = true;
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ViewOnTouchListenerC22366xcd5c2226 viewOnTouchListenerC22366xcd5c2226 = o5Var.f289459f;
        if (viewOnTouchListenerC22366xcd5c2226 != null) {
            int headerViewsCount = viewOnTouchListenerC22366xcd5c2226 != null ? viewOnTouchListenerC22366xcd5c2226.getHeaderViewsCount() : 0;
            com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ViewOnTouchListenerC22366xcd5c2226 viewOnTouchListenerC22366xcd5c22262 = o5Var.f289459f;
            int footerViewsCount = headerViewsCount + (viewOnTouchListenerC22366xcd5c22262 != null ? viewOnTouchListenerC22366xcd5c22262.getFooterViewsCount() : 0);
            yf5.j0 j0Var2 = o5Var.f289457d;
            f17 = viewOnTouchListenerC22366xcd5c2226.c(footerViewsCount + (j0Var2 != null ? ((yf5.w0) j0Var2).f543518q.f543377a : 0), i28, true);
        } else {
            f17 = 0.0f;
        }
        float f18 = f17;
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ViewOnTouchListenerC22366xcd5c2226 viewOnTouchListenerC22366xcd5c22263 = o5Var.f289459f;
        int m80520x655227d9 = viewOnTouchListenerC22366xcd5c22263 != null ? viewOnTouchListenerC22366xcd5c22263.m80520x655227d9() : 0;
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ViewOnTouchListenerC22366xcd5c2226 viewOnTouchListenerC22366xcd5c22264 = o5Var.f289459f;
        int count = viewOnTouchListenerC22366xcd5c22264 != null ? viewOnTouchListenerC22366xcd5c22264.getCount() : 0;
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.i5 i5Var2 = new com.p314xaae8f345.mm.ui.p2695x2c1ddc83.i5(new p3321xbce91901.jvm.p3324x21ffc6bd.f0(), count, o5Var, h0Var);
        boolean z19 = false;
        int i29 = 0;
        while (i29 < count) {
            com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ViewOnTouchListenerC22366xcd5c2226 viewOnTouchListenerC22366xcd5c22265 = o5Var.f289459f;
            android.view.View childAt = viewOnTouchListenerC22366xcd5c22265 != null ? viewOnTouchListenerC22366xcd5c22265.getChildAt(i29) : view2;
            android.view.View findViewById = childAt != null ? childAt.findViewById(com.p314xaae8f345.mm.R.id.f565477cj1) : view2;
            if (findViewById == null || !(findViewById.getTag() instanceof yf5.n)) {
                i18 = i29;
                str = str4;
                i5Var = i5Var2;
                i19 = count;
                str2 = str3;
                j18 = j17;
                view = null;
                i5Var.a(null);
            } else {
                java.lang.Object tag = findViewById.getTag();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(tag, "null cannot be cast to non-null type com.tencent.mm.ui.conversation.adapter.ConvViewHolder");
                yf5.n nVar2 = (yf5.n) tag;
                yf5.j0 j0Var3 = o5Var.f289457d;
                com.p314xaae8f345.mm.p2621x8fb0427b.l4 item = j0Var3 != null ? ((yf5.w0) j0Var3).getItem(nVar2.f543461o) : view2;
                if ((item == 0 || item.f276618g2 != i27) ? z18 : true) {
                    android.view.ViewGroup.LayoutParams layoutParams = nVar2.f543463q.getLayoutParams();
                    int measuredHeight = nVar2.f543463q.getMeasuredHeight();
                    j18 = j17;
                    oa5.b p17 = oa5.b.b(nVar2.f543463q).g(250L).p(new com.p314xaae8f345.mm.ui.p2695x2c1ddc83.j5(nVar2, o5Var));
                    i18 = i29;
                    str = str4;
                    i5Var = i5Var2;
                    i19 = count;
                    str2 = str3;
                    p17.k(new com.p314xaae8f345.mm.ui.p2695x2c1ddc83.k5(measuredHeight, layoutParams, nVar2, m80520x655227d9, f18, this)).o(new com.p314xaae8f345.mm.ui.p2695x2c1ddc83.l5(nVar2, layoutParams, i5Var)).l();
                } else {
                    i18 = i29;
                    str = str4;
                    i5Var = i5Var2;
                    i19 = count;
                    str2 = str3;
                    j18 = j17;
                    i5Var.a(nVar2);
                }
                z19 = true;
                view = null;
            }
            i29 = i18 + 1;
            str3 = str2;
            str4 = str;
            i5Var2 = i5Var;
            j17 = j18;
            count = i19;
            i27 = 132;
            z18 = false;
            o5Var = this;
            view2 = view;
        }
        java.lang.String str5 = str4;
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.i5 i5Var3 = i5Var2;
        java.lang.String str6 = str3;
        long j27 = j17;
        if (!z19) {
            java.util.List list = (java.util.List) i5Var3.f289278d.f391656d;
            com.p314xaae8f345.mm.ui.p2695x2c1ddc83.o5 o5Var2 = i5Var3.f289277c;
            o5Var2.x(false, list);
            o5Var2.K.set(false);
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6975x729241b7 c6975x729241b7 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6975x729241b7();
        c6975x729241b7.f142847d = j27;
        c6975x729241b7.f142848e = 1L;
        c6975x729241b7.k();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str5, "[perform collapse] topFoldCount: " + i28 + str6 + j27);
    }

    public final void v() {
        boolean z17;
        java.util.HashMap hashMap;
        jz5.f0 f0Var;
        if (p()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FolderHelper", "performFoldItemClick in animation");
            return;
        }
        if (s()) {
            yf5.n m17 = m("message_fold");
            if (m17 != null) {
                u(m17);
                f0Var = jz5.f0.f384359a;
            } else {
                f0Var = null;
            }
            if (f0Var == null) {
                u(null);
                return;
            }
            return;
        }
        if (!r()) {
            h(this, 8, false, 2, null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FolderHelper", "fold item no exist or no need collapse or expand !");
            return;
        }
        yf5.j0 j0Var = this.f289457d;
        long j17 = 0;
        if (j0Var == null || (hashMap = ((yf5.w0) j0Var).f543518q.f543379c) == null) {
            z17 = false;
        } else {
            java.util.Iterator it = hashMap.entrySet().iterator();
            z17 = false;
            while (it.hasNext()) {
                com.p314xaae8f345.mm.p2621x8fb0427b.l4 l4Var = (com.p314xaae8f345.mm.p2621x8fb0427b.l4) ((java.util.Map.Entry) it.next()).getValue();
                if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.X3(l4Var.h1())) {
                    y(l4Var, 262144, null);
                    z17 = true;
                } else if (((com.p314xaae8f345.mm.p2621x8fb0427b.m4) c01.d9.b().r()).J(l4Var)) {
                    j17++;
                }
            }
        }
        if (!z17) {
            h(this, 8, false, 2, null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FolderHelper", "performAllExpand, fold item not exit!");
            return;
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.R("message_fold_config2").A("fold_button_status_int_sync", 262144);
        this.f289472v = true;
        this.K.set(true);
        x(true, null);
        int i17 = this.f289473w;
        long j18 = j17 + i17;
        i(false, i17);
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6975x729241b7 c6975x729241b7 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6975x729241b7();
        c6975x729241b7.f142847d = j18;
        c6975x729241b7.f142848e = 2L;
        c6975x729241b7.k();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FolderHelper", "[perform expand], allPlaceTopCount: " + j18 + ", foldedItemCounts:" + this.f289473w);
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ViewOnTouchListenerC22366xcd5c2226 viewOnTouchListenerC22366xcd5c2226 = this.f289459f;
        java.lang.Runnable runnable = this.C;
        if (viewOnTouchListenerC22366xcd5c2226 != null) {
            viewOnTouchListenerC22366xcd5c2226.removeCallbacks(runnable);
        }
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ViewOnTouchListenerC22366xcd5c2226 viewOnTouchListenerC22366xcd5c22262 = this.f289459f;
        if (viewOnTouchListenerC22366xcd5c22262 != null) {
            viewOnTouchListenerC22366xcd5c22262.postDelayed(runnable, 500L);
        }
    }

    public final void w(boolean z17) {
        int i17;
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ViewOnTouchListenerC22366xcd5c2226 viewOnTouchListenerC22366xcd5c2226 = this.f289459f;
        if (viewOnTouchListenerC22366xcd5c2226 != null) {
            yf5.j0 j0Var = this.f289457d;
            android.util.SparseArray sparseArray = j0Var != null ? ((yf5.w0) j0Var).f543518q.f543378b : null;
            if (sparseArray != null) {
                int size = sparseArray.size();
                i17 = 0;
                while (i17 < size) {
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(sparseArray.get(i17), "message_fold")) {
                        break;
                    } else {
                        i17++;
                    }
                }
            }
            i17 = -1;
            int intValue = java.lang.Integer.valueOf(i17).intValue();
            if (intValue >= 0) {
                if (z17) {
                    viewOnTouchListenerC22366xcd5c2226.smoothScrollToPositionFromTop(viewOnTouchListenerC22366xcd5c2226.getHeaderViewsCount() + intValue, 0, (int) 100);
                } else {
                    viewOnTouchListenerC22366xcd5c2226.smoothScrollToPositionFromTop(viewOnTouchListenerC22366xcd5c2226.getHeaderViewsCount() + intValue, 0, 0);
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0065, code lost:
    
        if ((r6 != null && r6.f276618g2 == 132) != false) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void x(boolean r11, java.util.List r12) {
        /*
            r10 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            yf5.j0 r2 = r10.f289457d
            java.lang.String r3 = "message_fold"
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L86
            yf5.w0 r2 = (yf5.w0) r2
            yf5.a r2 = r2.f543518q
            java.util.HashMap r2 = r2.f543379c
            if (r2 == 0) goto L86
            java.util.Set r2 = r2.entrySet()
            java.util.Iterator r2 = r2.iterator()
        L22:
            boolean r6 = r2.hasNext()
            if (r6 == 0) goto L86
            java.lang.Object r6 = r2.next()
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6
            java.lang.Object r6 = r6.getValue()
            com.tencent.mm.storage.l4 r6 = (com.p314xaae8f345.mm.p2621x8fb0427b.l4) r6
            c01.f r7 = c01.d9.b()
            com.tencent.mm.storage.l8 r7 = r7.r()
            com.tencent.mm.storage.m4 r7 = (com.p314xaae8f345.mm.p2621x8fb0427b.m4) r7
            boolean r7 = r7.J(r6)
            r8 = 0
            if (r7 == 0) goto L82
            if (r6 != 0) goto L48
            goto L4e
        L48:
            int r7 = r10.b(r6, r5, r5)
            r6.f276618g2 = r7
        L4e:
            if (r6 == 0) goto L57
            int r7 = r6.f276618g2
            r9 = 4
            if (r7 != r9) goto L57
            r7 = r4
            goto L58
        L57:
            r7 = r5
        L58:
            if (r7 != 0) goto L67
            if (r6 == 0) goto L64
            int r7 = r6.f276618g2
            r9 = 132(0x84, float:1.85E-43)
            if (r7 != r9) goto L64
            r7 = r4
            goto L65
        L64:
            r7 = r5
        L65:
            if (r7 == 0) goto L6e
        L67:
            java.lang.String r7 = r6.h1()
            r0.add(r7)
        L6e:
            if (r6 == 0) goto L74
            java.lang.String r8 = r6.W0()
        L74:
            boolean r7 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r8, r3)
            if (r7 == 0) goto L22
            java.lang.String r6 = r6.h1()
            r1.add(r6)
            goto L22
        L82:
            r10.y(r6, r5, r8)
            goto L22
        L86:
            if (r11 != 0) goto Lb0
            ag5.b r11 = r10.D
            if (r11 == 0) goto L8f
            r11.a()
        L8f:
            r10.f289474x = r5
            com.tencent.mm.ui.conversation.ConversationListView r11 = r10.f289459f
            if (r11 == 0) goto L98
            r11.h(r5)
        L98:
            if (r12 == 0) goto L9f
            int r11 = r12.size()
            goto La3
        L9f:
            int r11 = r0.size()
        La3:
            r10.f289473w = r11
            r10.A = r5
            r10.f289476z = r4
            if (r12 != 0) goto Lac
            r12 = r0
        Lac:
            r10.B(r12, r3)
            goto Lce
        Lb0:
            java.lang.System.currentTimeMillis()
            g95.w r11 = g95.x.f351360a
            java.util.List r11 = r11.b()
            r12 = r11
            java.util.ArrayList r12 = (java.util.ArrayList) r12
            int r12 = r12.size()
            r10.f289473w = r12
            r10.f289474x = r12
            r10.B = r4
            java.lang.String r12 = ""
            r10.B(r11, r12)
            java.lang.System.currentTimeMillis()
        Lce:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.ui.p2695x2c1ddc83.o5.x(boolean, java.util.List):void");
    }

    public final void y(com.p314xaae8f345.mm.p2621x8fb0427b.l4 l4Var, int i17, java.lang.String str) {
        if (l4Var != null) {
            l4Var.f276618g2 = i17;
        }
        if (l4Var == null) {
            return;
        }
        l4Var.T1(str);
    }

    public final void z(int i17, android.view.View view, android.widget.TextView textView, int i18) {
        if (i17 == 131072) {
            if (view != null) {
                view.setRotation(0.0f);
            }
            if (textView != null) {
                android.content.res.Resources resources = textView.getResources();
                textView.setText(resources != null ? resources.getString(com.p314xaae8f345.mm.R.C30867xcad56011.b1p, java.lang.Integer.valueOf(i18)) : null);
            }
            this.f289473w = i18;
            return;
        }
        if (view != null) {
            view.setRotation(180.0f);
        }
        if (textView == null) {
            return;
        }
        android.content.res.Resources resources2 = textView.getResources();
        textView.setText(resources2 != null ? resources2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.b1q) : null);
    }
}

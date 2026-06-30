package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

@yn.c(m177365x976763e5 = sb5.w1.class)
/* loaded from: classes12.dex */
public class lk extends com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a implements sb5.w1, r70.b, o23.a {

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 f280971e;

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, yn.l
    public void E() {
        ((v70.w) ((xs.d1) i95.n0.c(xs.d1.class))).Zi(this);
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.hg
    public void I() {
        super.I();
        ((v70.w) ((xs.d1) i95.n0.c(xs.d1.class))).mj(this);
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, yn.l
    public void K() {
        ((v70.w) ((xs.d1) i95.n0.c(xs.d1.class))).mj(this);
    }

    @Override // r70.b
    public void K3(r70.c cVar) {
        android.view.View view;
        r70.d dVar = cVar.f474608b;
        if (dVar == r70.d.f474618f) {
            dw3.c0 c0Var = dw3.c0.f325715a;
            java.lang.String str = cVar.f474607a.f474637f;
            if (str != null) {
                c0Var.j(dw3.c0.f325719e.u(str, ""));
            }
            sb5.z zVar = (sb5.z) this.f280113d.f542241c.a(sb5.z.class);
            long j17 = cVar.f474609c;
            boolean z17 = cVar.f474612f;
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.k kVar = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.k) zVar;
            java.util.HashMap hashMap = (java.util.HashMap) kVar.Q;
            if (hashMap.containsKey(java.lang.Long.valueOf(j17))) {
                if (((java.util.HashMap) kVar.R).containsKey(java.lang.Long.valueOf(j17))) {
                    java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) hashMap.get(java.lang.Long.valueOf(j17));
                    view = weakReference != null ? (android.view.View) weakReference.get() : null;
                    if (view != null) {
                        java.lang.Object tag = view.getTag();
                        if (tag instanceof ze5.w6) {
                            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.C22081xf5de6b82 c22081xf5de6b82 = ((ze5.w6) tag).f553817c;
                            c22081xf5de6b82.getClass();
                            if (z17) {
                                if (pd5.l.f435113b.a(com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2518x55bb7a46.p2523x6c8cc133.C20104xc7ce92cc.class, false)) {
                                    c22081xf5de6b82.m80095x1cddf0a2().e().setVisibility(8);
                                    return;
                                }
                                com.p314xaae8f345.mm.ui.p2650x55bb7a46.w5.A(c22081xf5de6b82.m80095x1cddf0a2().d(), false, false);
                                c22081xf5de6b82.m80095x1cddf0a2().f().setVisibility(4);
                                c22081xf5de6b82.m80095x1cddf0a2().g().setVisibility(4);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        if (dVar == r70.d.f474617e) {
            int round = java.lang.Math.round(cVar.f474611e * 100.0f);
            sb5.z zVar2 = (sb5.z) this.f280113d.f542241c.a(sb5.z.class);
            long j18 = cVar.f474609c;
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.k kVar2 = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.k) zVar2;
            java.util.HashMap hashMap2 = (java.util.HashMap) kVar2.Q;
            if (hashMap2.containsKey(java.lang.Long.valueOf(j18))) {
                if (((java.util.HashMap) kVar2.R).containsKey(java.lang.Long.valueOf(j18))) {
                    java.lang.ref.WeakReference weakReference2 = (java.lang.ref.WeakReference) hashMap2.get(java.lang.Long.valueOf(j18));
                    view = weakReference2 != null ? (android.view.View) weakReference2.get() : null;
                    if (view != null) {
                        java.lang.Object tag2 = view.getTag();
                        if (tag2 instanceof ze5.w6) {
                            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.C22081xf5de6b82 c22081xf5de6b822 = ((ze5.w6) tag2).f553817c;
                            c22081xf5de6b822.getClass();
                            int i17 = round >= 100 ? 100 : (int) ((round * 100) / 100);
                            if (pd5.l.f435113b.a(com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2518x55bb7a46.p2523x6c8cc133.C20104xc7ce92cc.class, false)) {
                                if (i17 < 100 || c22081xf5de6b822.m80095x1cddf0a2().e().getVisibility() == 0) {
                                    em.o m80095x1cddf0a2 = c22081xf5de6b822.m80095x1cddf0a2();
                                    if (m80095x1cddf0a2.f336182d == null) {
                                        m80095x1cddf0a2.f336182d = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2764xc454c22d.C22713x95c5cea1) m80095x1cddf0a2.f336179a.findViewById(com.p314xaae8f345.mm.R.id.f569040lg);
                                    }
                                    m80095x1cddf0a2.f336182d.m82113x3ae760af(i17);
                                    c22081xf5de6b822.m80095x1cddf0a2().e().setVisibility(0);
                                    return;
                                }
                                return;
                            }
                            if (i17 < 100 || c22081xf5de6b822.m80095x1cddf0a2().f().getVisibility() == 0) {
                                android.widget.TextView f17 = c22081xf5de6b822.m80095x1cddf0a2().f();
                                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                                sb6.append(i17);
                                sb6.append('%');
                                f17.setText(sb6.toString());
                                com.p314xaae8f345.mm.ui.p2650x55bb7a46.w5.A(c22081xf5de6b822.m80095x1cddf0a2().d(), true, false);
                                c22081xf5de6b822.m80095x1cddf0a2().f().setVisibility(0);
                                c22081xf5de6b822.m80095x1cddf0a2().g().setVisibility(0);
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // yn.d
    public void N(int i17, int i18, android.content.Intent intent) {
        n0(i17, i18, intent);
    }

    public boolean m0(android.view.MenuItem menuItem, final com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        if (menuItem.getItemId() != 110) {
            return false;
        }
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2668x31c90fad.t.a(f9Var, this.f280113d.g(), new java.lang.Runnable() { // from class: com.tencent.mm.ui.chatting.component.lk$$a
            @Override // java.lang.Runnable
            public final void run() {
                m11.b0 b0Var;
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.lk lkVar = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.lk.this;
                android.app.Activity g17 = lkVar.f280113d.g();
                yb5.d dVar = lkVar.f280113d;
                java.util.Map map = com.p314xaae8f345.mm.ui.p2650x55bb7a46.w5.f287745a;
                if (!c01.d9.b().E()) {
                    db5.t7.k(g17, dVar.f542250l.m78646xc2a54588());
                    return;
                }
                com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var2 = f9Var;
                if (f9Var2.m124847x74d37ac6() > 0) {
                    ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
                    b0Var = m11.b1.Di().T1(f9Var2.Q0(), f9Var2.m124847x74d37ac6());
                } else {
                    b0Var = null;
                }
                if ((b0Var == null || b0Var.f404166a <= 0) && f9Var2.I0() > 0) {
                    ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
                    b0Var = m11.b1.Di().b2(f9Var2.Q0(), f9Var2.I0());
                }
                if (b0Var == null) {
                    return;
                }
                java.lang.String c17 = m11.c0.c(f9Var2, b0Var);
                if (f9Var2.z2()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingItemHelper", "image is clean!!!");
                    db5.e1.t(g17, g17.getString(com.p314xaae8f345.mm.R.C30867xcad56011.g07), g17.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), new com.p314xaae8f345.mm.ui.p2650x55bb7a46.t5());
                    return;
                }
                if (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.z4.f(f9Var2, c17)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingItemHelper", "img is expired or clean!!!");
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingItemHelper", "[ImageGalleryUI] enter");
                    android.content.Intent intent = new android.content.Intent(g17, (java.lang.Class<?>) com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ViewOnClickListenerC21748xb3d38e6b.class);
                    intent.putExtra("img_gallery_msg_id", f9Var2.m124847x74d37ac6());
                    intent.putExtra("img_gallery_msg_svr_id", f9Var2.I0());
                    intent.putExtra("img_gallery_talker", f9Var2.Q0());
                    intent.putExtra("img_gallery_chatroom_name", f9Var2.Q0());
                    intent.putExtra("img_gallery_is_restransmit_after_download", true);
                    intent.putExtra("Retr_show_success_tips", true);
                    if (dVar != null) {
                        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.z4.a(dVar, f9Var2, intent);
                    } else {
                        com.p314xaae8f345.mm.ui.p2650x55bb7a46.w5.a(f9Var2, intent);
                    }
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    arrayList.add(intent);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(g17, arrayList.toArray(), "com/tencent/mm/ui/chatting/ChattingItemHelper", "retransmitImg", "(Lcom/tencent/mm/storage/MsgInfo;Landroid/content/Context;Lcom/tencent/mm/ui/chatting/context/ChattingContext;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    g17.startActivity((android.content.Intent) arrayList.get(0));
                    yj0.a.f(g17, "com/tencent/mm/ui/chatting/ChattingItemHelper", "retransmitImg", "(Lcom/tencent/mm/storage/MsgInfo;Landroid/content/Context;Lcom/tencent/mm/ui/chatting/context/ChattingContext;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    return;
                }
                java.lang.String c18 = m11.p0.c(f9Var2);
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c18)) {
                    yd5.f.m0(6, dVar.C(), c18);
                }
                com.p314xaae8f345.mm.p954x7e3e6bb0.C11124xda6b8ad6 b17 = com.p314xaae8f345.mm.p954x7e3e6bb0.C11124xda6b8ad6.f152783m.b(f9Var2);
                if (b17 != null && b17.a()) {
                    ((qv.s) ((qk.r6) i95.n0.c(qk.r6.class))).Di(b17, dVar.D() ? 2 : 1, 6);
                }
                jd5.a aVar = new jd5.a();
                long m124847x74d37ac6 = f9Var2.m124847x74d37ac6();
                int i17 = aVar.f125235d;
                aVar.set(i17 + 0, java.lang.Long.valueOf(m124847x74d37ac6));
                aVar.set(i17 + 2, java.lang.Long.valueOf(f9Var2.I0()));
                aVar.set(i17 + 3, java.lang.Integer.valueOf(f9Var2.mo78013xfb85f7b0()));
                java.lang.String Q0 = f9Var2.Q0();
                if (Q0 == null) {
                    Q0 = "";
                }
                aVar.set(i17 + 1, Q0);
                n13.r rVar = new n13.r();
                rVar.f415650a = true;
                rVar.f415653d.f415672a = com.p314xaae8f345.mm.ui.p2724x335620.uic.p2727x2c1ddc83.p2728xc846465b.e.b(f9Var2.Q0());
                rVar.f415651b = 231;
                ((dk5.b0) ((n13.b0) i95.n0.c(n13.b0.class))).Bi(g17, aVar, rVar);
            }
        });
        if (!c01.ia.M(f9Var)) {
            return true;
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6923x523f4526 c6923x523f4526 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6923x523f4526();
        c6923x523f4526.f142386d = f9Var.I0();
        c6923x523f4526.f142387e = f9Var.mo78013xfb85f7b0();
        c6923x523f4526.f142388f = c01.ia.l(f9Var);
        c6923x523f4526.f142389g = 4L;
        c6923x523f4526.k();
        return true;
    }

    public boolean n0(final int i17, int i18, final android.content.Intent intent) {
        this.f280113d.b();
        boolean z17 = false;
        if (i18 != -1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChattingUI.SendImgComponent", "[dealWithRequestCode] resultCode:%d", java.lang.Integer.valueOf(i18));
            return false;
        }
        if (i17 != 200) {
            if (i17 == 201) {
                vb0.o oVar = (vb0.o) i95.n0.c(vb0.o.class);
                android.content.Context applicationContext = this.f280113d.g().getApplicationContext();
                java.lang.String a17 = g83.a.a();
                ((ub0.r) oVar).getClass();
                java.lang.String b17 = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.l7.b(applicationContext, intent, a17);
                if (b17 != null) {
                    if (com.p314xaae8f345.mm.vfs.w6.j(b17)) {
                        zb0.b0 b0Var = (zb0.b0) i95.n0.c(zb0.b0.class);
                        android.app.Activity g17 = this.f280113d.g();
                        ((yb0.g) b0Var).getClass();
                        com.p314xaae8f345.mm.p1004x2137b148.C11325x6ace8b92.b(g17, b17, null);
                    }
                    android.content.Intent intent2 = new android.content.Intent();
                    java.util.ArrayList<java.lang.String> arrayList = new java.util.ArrayList<>(1);
                    arrayList.add(b17);
                    intent2.putExtra("query_source_type", 3);
                    intent2.putExtra("preview_image", true);
                    intent2.putExtra("isTakePhoto", true);
                    intent2.putExtra("GalleryUI_FromUser", this.f280113d.t());
                    intent2.putExtra("GalleryUI_ToUser", this.f280113d.x());
                    intent2.putExtra("is_long_click", true);
                    intent2.putStringArrayListExtra("preview_image_list", arrayList);
                    intent2.addFlags(67108864);
                    if (this.f280113d.f542241c.a(sb5.s0.class) == null || ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.jb) ((sb5.s0) this.f280113d.f542241c.a(sb5.s0.class))).f280796e == null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChattingUI.SendImgComponent", "onResult, footer is null");
                    } else {
                        r15.b m75465xd0d4a36c = ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.jb) ((sb5.s0) this.f280113d.f542241c.a(sb5.s0.class))).f280796e.m75465xd0d4a36c();
                        if (m75465xd0d4a36c != null) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingUI.SendImgComponent", "quoteExtCommonInfo is not null");
                            ok5.d.b(intent2, "key_quote_extcommon", m75465xd0d4a36c, new ok5.h());
                            z17 = true;
                        } else {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChattingUI.SendImgComponent", "quoteExtCommonInfo is null");
                        }
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingUI.SendImgComponent", "appendQuoteInfoToIntent:%b", java.lang.Boolean.valueOf(z17));
                    j45.l.p(this.f280113d.f542250l, "gallery", ".ui.GalleryEntryUI", intent2, 217);
                }
            } else if (i17 == 203) {
                sb5.s0 s0Var = (sb5.s0) this.f280113d.f542241c.a(sb5.s0.class);
                java.lang.String stringExtra = intent.getStringExtra("CropImage_OutputPath");
                if (stringExtra != null) {
                    boolean a18 = c01.z1.a(stringExtra, this.f280113d.x(), intent.getBooleanExtra("CropImage_Compress_Img", true));
                    int intExtra = intent.getIntExtra("from_source", 0);
                    int intExtra2 = intent.getIntExtra("CropImage_rotateCount", 0);
                    intent.getIntExtra("from_source", 0);
                    o0(a18 ? 1 : 0, intExtra, intExtra2, stringExtra, "");
                    ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.jb) s0Var).f280796e.clearFocus();
                    return false;
                }
                ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.jb) s0Var).f280796e.clearFocus();
            } else {
                if (i17 != 217) {
                    if (i17 != 231) {
                        return false;
                    }
                    java.util.ArrayList<java.lang.String> stringArrayListExtra = intent != null ? intent.getStringArrayListExtra("SendMsgUsernames") : new java.util.ArrayList<>();
                    if (stringArrayListExtra == null) {
                        return false;
                    }
                    java.util.Iterator<java.lang.String> it = stringArrayListExtra.iterator();
                    while (it.hasNext()) {
                        com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(it.next());
                    }
                    return false;
                }
                if (intent != null) {
                    java.lang.String stringExtra2 = intent.getStringExtra("GalleryUI_ToUser");
                    final java.lang.String x17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra2) ? this.f280113d.x() : stringExtra2;
                    final yb5.q v17 = this.f280113d.v();
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingUI.SendImgComponent", "CONTEXT_MENU_WECHAT_GALLERY_IMAGE userFromIntent:%s rawUsername:%s", stringExtra2, this.f280113d.x());
                    final sb5.s0 s0Var2 = (sb5.s0) this.f280113d.f542241c.a(sb5.s0.class);
                    com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.jb jbVar = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.jb) s0Var2;
                    jbVar.f280796e.clearFocus();
                    jbVar.f280796e.m75483x4f8b3b49(8);
                    ((ku5.t0) ku5.t0.f394148d).l(new java.lang.Runnable() { // from class: com.tencent.mm.ui.chatting.component.lk$$b
                        /* JADX WARN: Removed duplicated region for block: B:124:0x03b9  */
                        /* JADX WARN: Removed duplicated region for block: B:126:0x03bb  */
                        /* JADX WARN: Removed duplicated region for block: B:129:0x03cc  */
                        /* JADX WARN: Removed duplicated region for block: B:131:0x03df  */
                        /* JADX WARN: Removed duplicated region for block: B:133:0x03e7  */
                        /* JADX WARN: Removed duplicated region for block: B:136:0x03f5  */
                        /* JADX WARN: Removed duplicated region for block: B:138:0x03fb  */
                        /* JADX WARN: Removed duplicated region for block: B:141:0x03fe  */
                        /* JADX WARN: Removed duplicated region for block: B:143:0x03f8  */
                        /* JADX WARN: Removed duplicated region for block: B:155:0x0459  */
                        /* JADX WARN: Removed duplicated region for block: B:162:0x07b3  */
                        /* JADX WARN: Removed duplicated region for block: B:211:0x088c  */
                        /* JADX WARN: Removed duplicated region for block: B:213:? A[RETURN, SYNTHETIC] */
                        /* JADX WARN: Removed duplicated region for block: B:227:0x065e  */
                        /* JADX WARN: Removed duplicated region for block: B:252:0x04e3  */
                        /* JADX WARN: Removed duplicated region for block: B:259:0x0529  */
                        /* JADX WARN: Removed duplicated region for block: B:266:0x054f  */
                        /* JADX WARN: Removed duplicated region for block: B:275:0x05a5  */
                        /* JADX WARN: Removed duplicated region for block: B:291:0x059c  */
                        /* JADX WARN: Removed duplicated region for block: B:294:0x04e8  */
                        /* JADX WARN: Removed duplicated region for block: B:299:0x06aa  */
                        /* JADX WARN: Removed duplicated region for block: B:52:0x0260  */
                        /* JADX WARN: Removed duplicated region for block: B:55:0x026e A[SYNTHETIC] */
                        @Override // java.lang.Runnable
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public final void run() {
                            /*
                                Method dump skipped, instructions count: 2194
                                To view this dump add '--comments-level debug' option
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.RunnableC21715x6231a03.run():void");
                        }
                    }, 100L, "SendImgComponent");
                    return false;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChattingUI.SendImgComponent", "CONTEXT_MENU_WECHAT_GALLERY_IMAGE intent == null");
            }
        } else if (intent != null) {
            android.content.Intent intent3 = new android.content.Intent();
            intent3.setClassName(this.f280113d.g(), "com.tencent.mm.ui.tools.CropImageNewUI");
            intent3.putExtra("CropImageMode", 4);
            intent3.putExtra("CropImage_Filter", true);
            java.lang.String x18 = this.f280113d.x();
            intent3.putExtra("CropImage_Has_Raw_Img_Btn", (com.p314xaae8f345.mm.p2621x8fb0427b.z3.G4(x18) || com.p314xaae8f345.mm.p2621x8fb0427b.z3.s4(x18)) ? false : true);
            intent3.putExtra("from_source", 3);
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.AbstractC21611x7536149b abstractC21611x7536149b = this.f280113d.f542250l;
            java.lang.String a19 = g83.a.a();
            if (intent.getData().toString().startsWith("content://com.google.android.gallery3d")) {
                new com.p314xaae8f345.mm.ui.p2740x696c9db.d1(intent, abstractC21611x7536149b, a19, null, intent3, 203).execute(0);
            } else {
                java.lang.String b18 = com.p314xaae8f345.mm.ui.p2740x696c9db.i1.b(abstractC21611x7536149b.mo7438x76847179(), intent, a19);
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(b18)) {
                    intent3.putExtra("CropImage_ImgPath", b18);
                    abstractC21611x7536149b.m7587x5dc77fb5(intent3, 203);
                }
            }
        }
        return true;
    }

    public void o0(int i17, int i18, int i19, java.lang.String str, java.lang.String str2) {
        if (str == null || str.equals("") || !com.p314xaae8f345.mm.vfs.w6.j(str)) {
            return;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 u17 = this.f280113d.u();
        java.util.Map map = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.z4.f281893a;
        if (u17.d1().equals("medianote") && (c01.z1.p() & 16384) == 0) {
            return;
        }
        k70.i0 i0Var = new k70.i0();
        i0Var.f386175a = 4;
        i0Var.f386197w = str2;
        java.lang.String t17 = this.f280113d.t();
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        r70.g gVar = new r70.g(str, i17, t17 == null ? "" : t17, this.f280113d.x(), i0Var);
        gVar.f474639h = i19;
        gVar.f474641j = "component_send_img";
        ((v70.w) ((xs.d1) i95.n0.c(xs.d1.class))).nj(gVar);
        this.f280113d.L(true);
    }

    public final com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.rk p0(java.lang.String str) {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.rk rkVar = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.rk(null);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 z2Var = this.f280971e;
        if ((z2Var == null || !z2Var.h()) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) && com.p314xaae8f345.mm.sdk.p2603x2137b148.y1.f(str)) {
            android.graphics.Bitmap T = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.T(str, 300, 300, false);
            if (T == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChattingUI.SendImgComponent", "showAlert fail, bmp is null");
                return rkVar;
            }
            sb5.s0 s0Var = (sb5.s0) this.f280113d.f542241c.a(sb5.s0.class);
            android.widget.ImageView imageView = new android.widget.ImageView(this.f280113d.g());
            this.f280113d.s().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561399hf);
            imageView.setImageBitmap(T);
            android.content.ContentResolver m78385x607f9d69 = this.f280113d.f542250l.m78385x607f9d69();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add("default_input_method");
            arrayList.add(m78385x607f9d69);
            java.lang.Object obj = new java.lang.Object();
            java.util.Collections.reverse(arrayList);
            java.lang.String str2 = (java.lang.String) yj0.a.k(obj, arrayList.toArray(), "com/tencent/mm/ui/chatting/component/SendImgComponent", "sendImgFromInput", "(Ljava/lang/String;)Lcom/tencent/mm/ui/chatting/component/SendImgComponent$IMESendImageResult;", "android/provider/Settings$Secure", "getString", "(Landroid/content/ContentResolver;Ljava/lang/String;)Ljava/lang/String;");
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.y1.d(com.p314xaae8f345.mm.vfs.w6.N(str, 0, -1)) && str2 != null && (str2.contains("com.sohu.inputmethod.sogou") || str2.contains("com.tencent.qqpinyin"));
            if (!z17) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1062, 20);
            } else if (str2.contains("com.sohu.inputmethod.sogou")) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1062, 1);
            } else if (str2.contains("com.tencent.qqpinyin")) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1062, 2);
            }
            if (z17 && com.p314xaae8f345.mm.p2621x8fb0427b.z3.K3(this.f280113d.x())) {
                rkVar.f281395b = true;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingUI.SendImgComponent", "gamelife fobidden image: from the third playground");
                dp.a.m125854x26a183b(this.f280113d.g(), this.f280113d.s().getString(com.p314xaae8f345.mm.R.C30867xcad56011.bxy), 0).show();
                return rkVar;
            }
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 z2Var2 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2(this.f280113d.g(), 1, 2);
            this.f280971e = z2Var2;
            z2Var2.q(this.f280113d.g().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ogq));
            com.p314xaae8f345.mm.ui.bk.r0(this.f280971e.C.getPaint(), 0.8f);
            this.f280971e.j(imageView);
            this.f280971e.m(this.f280113d.g().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg), this.f280113d.g().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572084ya));
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 z2Var3 = this.f280971e;
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.ok okVar = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.ok(this);
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.pk pkVar = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.pk(this, z17, s0Var, str2, str);
            z2Var3.D = okVar;
            z2Var3.E = pkVar;
            z2Var3.C();
            rkVar.f281394a = true;
            rkVar.f281395b = true;
        }
        return rkVar;
    }
}

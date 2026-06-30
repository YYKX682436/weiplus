package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

@yn.c(m177365x976763e5 = sb5.p2.class)
/* loaded from: classes12.dex */
public class jo extends com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a implements sb5.p2 {

    /* renamed from: e, reason: collision with root package name */
    public final android.util.SparseBooleanArray f280847e = new android.util.SparseBooleanArray();

    /* renamed from: f, reason: collision with root package name */
    public boolean f280848f = false;

    public jo() {
        new java.util.HashMap();
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, yn.l
    public void K() {
        java.util.Map map = com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2085xb06291ee.p2086x633fb29.s.H;
        wf0.k1 k1Var = (wf0.k1) i95.n0.c(wf0.k1.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2085xb06291ee.p2086x633fb29.c cVar = new com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2085xb06291ee.p2086x633fb29.c();
        ((vf0.y1) k1Var).getClass();
        t21.o2.aj(cVar, 0L);
        this.f280847e.clear();
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x034a  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x038c  */
    @Override // yn.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void N(int r32, int r33, android.content.Intent r34) {
        /*
            Method dump skipped, instructions count: 1057
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.jo.N(int, int, android.content.Intent):void");
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, yn.l
    public void a() {
        this.f280848f = j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2518x55bb7a46.p2522x740fd51b.C20098x69ffd088()) == 1;
        new java.util.HashMap();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingUI.VideoComponent", "videoExtInfoOptEnable: " + this.f280848f);
    }

    public boolean m0(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, boolean z17) {
        if (!f9Var.m78014x7b98c171() && !f9Var.Y2()) {
            return z17;
        }
        t21.v2 s17 = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.j1.s(f9Var);
        if (s17 == null) {
            return false;
        }
        int i17 = s17.f496544i;
        int g17 = t21.d3.g(s17);
        boolean i18 = s17.i();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingUI.VideoComponent", "it is video download: %b, status %d, download progress %d", java.lang.Boolean.valueOf(i18), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(g17));
        return i18;
    }

    public boolean n0(android.view.MenuItem menuItem, final com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        int i17;
        int i18;
        int i19;
        int itemId = menuItem.getItemId();
        if (itemId == 106) {
            ((vf0.w1) ((wf0.q1) i95.n0.c(wf0.q1.class))).getClass();
            t21.v2 g17 = t21.o2.Ui().g(f9Var.z0());
            if (g17 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChattingUI.VideoComponent", "save video but videoInfo is null!");
                return true;
            }
            if (g17.f496544i != 199) {
                gm0.j1.e().j(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.ko(this, g17.d(), 6));
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingUI.VideoComponent", "[ImageGalleryUI] enter");
                android.content.Intent intent = new android.content.Intent(this.f280113d.g(), (java.lang.Class<?>) com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ViewOnClickListenerC21748xb3d38e6b.class);
                intent.putExtra("img_gallery_msg_id", f9Var.m124847x74d37ac6());
                intent.putExtra("img_gallery_msg_svr_id", f9Var.I0());
                intent.putExtra("img_gallery_talker", f9Var.Q0());
                intent.putExtra("img_gallery_chatroom_name", f9Var.Q0());
                intent.putExtra("img_gallery_enter_video_opcode", t21.d3.d(f9Var.m124847x74d37ac6(), 2));
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.z4.a(this.f280113d, f9Var, intent);
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.AbstractC21611x7536149b abstractC21611x7536149b = this.f280113d.f542250l;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(intent);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(abstractC21611x7536149b, arrayList.toArray(), "com/tencent/mm/ui/chatting/component/VideoComponent", "longClickSaveVideo", "(Lcom/tencent/mm/storage/MsgInfo;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                abstractC21611x7536149b.mo7585xa4df9991((android.content.Intent) arrayList.get(0));
                yj0.a.f(abstractC21611x7536149b, "com/tencent/mm/ui/chatting/component/VideoComponent", "longClickSaveVideo", "(Lcom/tencent/mm/storage/MsgInfo;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                this.f280113d.f542250l.m78401x4d12b7e0(0, 0);
                return true;
            }
            java.lang.String rj6 = ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).rj(f9Var, bm5.f0.f104104s, f9Var.z0(), false);
            if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(g17.h())) {
                i17 = ((py.a) ((qy.i) i95.n0.c(qy.i.class))).wi(g17.h());
            } else {
                i17 = 0;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
            g0Var.mo68477x336bdfd8(106L, 215L, 1L, false);
            g0Var.d(12084, java.lang.Integer.valueOf(g17.f496541f), java.lang.Integer.valueOf(g17.f496548m * 1000), 0, 2, g17.h(), java.lang.Integer.valueOf(i17), t21.v2.c(g17.g()), java.lang.Long.valueOf(g17.f496545j));
            java.lang.String str = g17.S;
            ((vf0.y1) ((wf0.x1) i95.n0.c(wf0.x1.class))).getClass();
            t21.v2 h17 = t21.d3.h(str);
            if (h17 != null && h17.f496544i == 199) {
                rj6 = ((vf0.c) ((c35.m) i95.n0.c(c35.m.class))).Ai(f9Var, false);
            }
            ((yb0.g) ((zb0.b0) i95.n0.c(zb0.b0.class))).Bi(this.f280113d.g(), rj6, new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.lo(this));
            return true;
        }
        if (itemId == 107) {
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2668x31c90fad.t.a(f9Var, this.f280113d.g(), new java.lang.Runnable() { // from class: com.tencent.mm.ui.chatting.component.jo$$a
                @Override // java.lang.Runnable
                public final void run() {
                    com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.jo joVar = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.jo.this;
                    joVar.getClass();
                    if (!c01.d9.b().E()) {
                        db5.t7.k(joVar.f280113d.g(), joVar.f280113d.f542250l.m78646xc2a54588());
                        return;
                    }
                    com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var2 = f9Var;
                    if (f9Var2.M2()) {
                        android.content.Intent intent2 = new android.content.Intent(joVar.f280113d.g(), (java.lang.Class<?>) com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22567x42e895b8.class);
                        intent2.putExtra("Retr_Msg_Id", f9Var2.m124847x74d37ac6());
                        intent2.putExtra("Retr_MsgTalker", f9Var2.Q0());
                        intent2.putExtra("Retr_Msg_content", f9Var2.j());
                        intent2.putExtra("Retr_From", "chattingui");
                        intent2.putExtra("scene_from", 17);
                        intent2.putExtra("Retr_Msg_Type", 1);
                        com.p314xaae8f345.mm.ui.p2650x55bb7a46.AbstractC21611x7536149b abstractC21611x7536149b2 = joVar.f280113d.f542250l;
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        arrayList2.add(intent2);
                        java.util.Collections.reverse(arrayList2);
                        yj0.a.d(abstractC21611x7536149b2, arrayList2.toArray(), "com/tencent/mm/ui/chatting/component/VideoComponent", "longClickRetransmitVideo", "(Lcom/tencent/mm/storage/MsgInfo;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        abstractC21611x7536149b2.mo7585xa4df9991((android.content.Intent) arrayList2.get(0));
                        yj0.a.f(abstractC21611x7536149b2, "com/tencent/mm/ui/chatting/component/VideoComponent", "longClickRetransmitVideo", "(Lcom/tencent/mm/storage/MsgInfo;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        return;
                    }
                    wf0.x1 x1Var = (wf0.x1) i95.n0.c(wf0.x1.class);
                    java.lang.String z07 = f9Var2.z0();
                    ((vf0.y1) x1Var).getClass();
                    t21.v2 h18 = t21.d3.h(z07);
                    if (h18 == null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChattingUI.VideoComponent", "retransmit video but videoInfo is null!");
                        return;
                    }
                    java.lang.String f17 = h18.f();
                    if (!com.p314xaae8f345.mm.vfs.w6.j(f17)) {
                        f17 = ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).rj(f9Var2, bm5.f0.f104104s, f9Var2.z0(), false);
                    }
                    java.lang.String rj7 = ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).rj(f9Var2, bm5.f0.f104103r, f9Var2.z0(), false);
                    if (f9Var2.z2()) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingUI.VideoComponent", "video is clean!!!");
                        db5.e1.t(joVar.f280113d.g(), joVar.f280113d.g().getString(com.p314xaae8f345.mm.R.C30867xcad56011.k6n), joVar.f280113d.g().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.mo(joVar));
                        return;
                    }
                    if (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.z4.f(f9Var2, f17) && com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.z4.f(f9Var2, rj7)) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingUI.VideoComponent", "video is expired");
                        gm0.j1.e().j(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.ko(joVar, h18.d(), 3));
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingUI.VideoComponent", "[ImageGalleryUI] enter");
                        android.content.Intent intent3 = new android.content.Intent(joVar.f280113d.g(), (java.lang.Class<?>) com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ViewOnClickListenerC21748xb3d38e6b.class);
                        intent3.putExtra("img_gallery_msg_id", f9Var2.m124847x74d37ac6());
                        intent3.putExtra("img_gallery_msg_svr_id", f9Var2.I0());
                        intent3.putExtra("img_gallery_talker", f9Var2.Q0());
                        intent3.putExtra("img_gallery_chatroom_name", f9Var2.Q0());
                        intent3.putExtra("img_gallery_enter_video_opcode", t21.d3.d(f9Var2.m124847x74d37ac6(), 1));
                        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.z4.a(joVar.f280113d, f9Var2, intent3);
                        com.p314xaae8f345.mm.ui.p2650x55bb7a46.AbstractC21611x7536149b abstractC21611x7536149b3 = joVar.f280113d.f542250l;
                        java.util.ArrayList arrayList3 = new java.util.ArrayList();
                        arrayList3.add(intent3);
                        java.util.Collections.reverse(arrayList3);
                        yj0.a.d(abstractC21611x7536149b3, arrayList3.toArray(), "com/tencent/mm/ui/chatting/component/VideoComponent", "longClickRetransmitVideo", "(Lcom/tencent/mm/storage/MsgInfo;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        abstractC21611x7536149b3.mo7585xa4df9991((android.content.Intent) arrayList3.get(0));
                        yj0.a.f(abstractC21611x7536149b3, "com/tencent/mm/ui/chatting/component/VideoComponent", "longClickRetransmitVideo", "(Lcom/tencent/mm/storage/MsgInfo;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        joVar.f280113d.f542250l.m78401x4d12b7e0(0, 0);
                        return;
                    }
                    if (((vf0.y2) ((wf0.b2) i95.n0.c(wf0.b2.class))).fj(vf0.j3.f517738g)) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingUI.VideoComponent", "start forward video " + f9Var2.m124847x74d37ac6() + " launch forward UIC ");
                        jd5.c cVar = new jd5.c();
                        long m124847x74d37ac6 = f9Var2.m124847x74d37ac6();
                        int i27 = cVar.f125235d;
                        cVar.set(i27 + 0, java.lang.Long.valueOf(m124847x74d37ac6));
                        cVar.set(i27 + 2, java.lang.Long.valueOf(f9Var2.I0()));
                        cVar.set(i27 + 3, java.lang.Integer.valueOf(f9Var2.mo78013xfb85f7b0()));
                        java.lang.String Q0 = f9Var2.Q0();
                        if (Q0 == null) {
                            Q0 = "";
                        }
                        cVar.set(i27 + 1, Q0);
                        cVar.q(h18.f496548m);
                        n13.r rVar = new n13.r();
                        rVar.f415650a = true;
                        rVar.f415653d.f415672a = 1;
                        ((dk5.b0) ((n13.b0) i95.n0.c(n13.b0.class))).Bi(joVar.f280113d.f542250l.mo7430x19263085(), cVar, rVar);
                        return;
                    }
                    if (!f9Var2.m78014x7b98c171() && !f9Var2.Y2()) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ChattingUI.VideoComponent", "retranmist video unknow status.");
                        return;
                    }
                    android.content.Intent intent4 = new android.content.Intent(joVar.f280113d.g(), (java.lang.Class<?>) com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22567x42e895b8.class);
                    intent4.putExtra("Retr_length", h18.f496548m);
                    intent4.putExtra("Retr_File_Name", f9Var2.z0());
                    intent4.putExtra("Retr_video_isexport", h18.f496555t);
                    intent4.putExtra("Retr_Msg_Id", f9Var2.m124847x74d37ac6());
                    intent4.putExtra("Retr_MsgTalker", f9Var2.Q0());
                    intent4.putExtra("Retr_From", "chattingui");
                    intent4.putExtra("scene_from", 17);
                    if (f9Var2.Y2()) {
                        intent4.putExtra("Retr_Msg_Type", 11);
                    } else {
                        intent4.putExtra("Retr_Msg_Type", 1);
                    }
                    com.p314xaae8f345.mm.ui.p2650x55bb7a46.AbstractC21611x7536149b abstractC21611x7536149b4 = joVar.f280113d.f542250l;
                    java.util.ArrayList arrayList4 = new java.util.ArrayList();
                    arrayList4.add(intent4);
                    java.util.Collections.reverse(arrayList4);
                    yj0.a.d(abstractC21611x7536149b4, arrayList4.toArray(), "com/tencent/mm/ui/chatting/component/VideoComponent", "longClickRetransmitVideo", "(Lcom/tencent/mm/storage/MsgInfo;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    abstractC21611x7536149b4.mo7585xa4df9991((android.content.Intent) arrayList4.get(0));
                    yj0.a.f(abstractC21611x7536149b4, "com/tencent/mm/ui/chatting/component/VideoComponent", "longClickRetransmitVideo", "(Lcom/tencent/mm/storage/MsgInfo;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                }
            });
            if (c01.ia.M(f9Var)) {
                com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6923x523f4526 c6923x523f4526 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6923x523f4526();
                c6923x523f4526.f142386d = f9Var.I0();
                c6923x523f4526.f142387e = f9Var.mo78013xfb85f7b0();
                c6923x523f4526.f142388f = c01.ia.l(f9Var);
                c6923x523f4526.f142389g = 4L;
                c6923x523f4526.k();
            }
            return false;
        }
        if (itemId != 130) {
            return false;
        }
        if (((fo.e) ((le5.e) i95.n0.c(le5.e.class))).bj(this.f280113d.g(), f9Var.G, null)) {
            return true;
        }
        android.content.Intent intent2 = menuItem.getIntent();
        int[] iArr = new int[2];
        if (intent2 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChattingUI.VideoComponent", "[LONGCLICK_MENU_MUTE_PLAY] intent is null!");
            i18 = 0;
            i19 = 0;
        } else {
            int intExtra = intent2.getIntExtra("img_gallery_width", 0);
            int intExtra2 = intent2.getIntExtra("img_gallery_height", 0);
            iArr[0] = intent2.getIntExtra("img_gallery_left", 0);
            iArr[1] = intent2.getIntExtra("img_gallery_top", 0);
            i18 = intExtra;
            i19 = intExtra2;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingUI.VideoComponent", "[ImageGalleryUI] LONGCLICK_MENU_MUTE_PLAY");
        android.content.Intent intent3 = new android.content.Intent(this.f280113d.g(), (java.lang.Class<?>) com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ViewOnClickListenerC21748xb3d38e6b.class);
        intent3.putExtra("img_gallery_msg_id", f9Var.m124847x74d37ac6());
        intent3.putExtra("img_gallery_msg_svr_id", f9Var.I0());
        intent3.putExtra("img_gallery_talker", f9Var.Q0());
        intent3.putExtra("img_gallery_chatroom_name", f9Var.Q0());
        intent3.putExtra("img_gallery_left", iArr[0]);
        intent3.putExtra("img_gallery_top", iArr[1]);
        intent3.putExtra("img_gallery_width", i18);
        intent3.putExtra("img_gallery_height", i19);
        intent3.putExtra("img_gallery_enter_video_opcode", t21.d3.d(f9Var.m124847x74d37ac6(), 3));
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.z4.a(this.f280113d, f9Var, intent3);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.AbstractC21611x7536149b abstractC21611x7536149b2 = this.f280113d.f542250l;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(intent3);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(abstractC21611x7536149b2, arrayList2.toArray(), "com/tencent/mm/ui/chatting/component/VideoComponent", "dealWithLongClick", "(Landroid/view/MenuItem;Lcom/tencent/mm/storage/MsgInfo;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        abstractC21611x7536149b2.mo7585xa4df9991((android.content.Intent) arrayList2.get(0));
        yj0.a.f(abstractC21611x7536149b2, "com/tencent/mm/ui/chatting/component/VideoComponent", "dealWithLongClick", "(Landroid/view/MenuItem;Lcom/tencent/mm/storage/MsgInfo;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        this.f280113d.f542250l.m78401x4d12b7e0(0, 0);
        return true;
    }

    public final void o0(android.content.Intent intent, java.lang.String str) {
        t21.l0 l0Var = new t21.l0();
        l0Var.a(this.f280113d.g(), intent, str, !intent.getBooleanExtra("CropImage_Compress_Img", true) && t21.d3.s(), new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.po(this, str, intent != null ? intent.getStringExtra("MsgRevokeBatchId") : ""));
        yb5.d dVar = this.f280113d;
        dVar.W(dVar.g(), this.f280113d.s().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), this.f280113d.s().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572137zq), true, true, new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.qo(this, l0Var));
    }

    public void p0(android.content.Intent intent, java.lang.String str) {
        if (com.p314xaae8f345.mm.p971x6de15a2e.y2.a(this.f280113d.g())) {
            o0(intent, str);
        } else {
            db5.e1.n(this.f280113d.g(), com.p314xaae8f345.mm.R.C30867xcad56011.k77, com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv, new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.oo(this, intent, str), null);
        }
    }

    public final void q0(android.content.Intent intent) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingUI.VideoComponent", "sendVideoFromCustomRecord");
        if (intent == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChattingUI.VideoComponent", "data == null");
            return;
        }
        java.lang.String stringExtra = intent.getStringExtra("VideoRecorder_ToUser");
        java.lang.String stringExtra2 = intent.getStringExtra("VideoRecorder_FileName");
        int intExtra = intent.getIntExtra("VideoRecorder_VideoLength", 0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChattingUI.VideoComponent", "fileName " + stringExtra2 + " length " + intExtra + " user " + stringExtra);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra2) || intExtra < 0) {
            return;
        }
        if (!stringExtra.equals("medianote") || (c01.z1.p() & 16384) != 0) {
            t21.d3.p(stringExtra2, null, intExtra, stringExtra, null, 0, "", 43, null, "", null, null, null, false, -1L, null, "");
            ((vf0.y1) ((wf0.x1) i95.n0.c(wf0.x1.class))).getClass();
            t21.d3.M(stringExtra2);
            this.f280113d.L(true);
            return;
        }
        t21.v2 v2Var = new t21.v2();
        v2Var.f496533a = stringExtra2;
        v2Var.f496548m = intExtra;
        v2Var.f496552q = stringExtra;
        v2Var.f496554s = (java.lang.String) gm0.j1.u().c().l(2, "");
        v2Var.f496545j = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1();
        v2Var.f496546k = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1();
        v2Var.f496540e = intExtra;
        v2Var.f496539d = intExtra;
        int t17 = t21.w2.t(((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).rj(null, bm5.f0.f104104s, stringExtra2, false));
        if (t17 <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.VideoLogic", "get Video size failed :" + stringExtra2);
            return;
        }
        v2Var.f496541f = t17;
        java.lang.String tj6 = ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).tj(null, stringExtra2, false);
        int t18 = t21.w2.t(tj6);
        if (t18 <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.VideoLogic", "get Thumb size failed :" + tj6 + " size:" + t18);
            return;
        }
        v2Var.f496543h = t18;
        v2Var.f496544i = 199;
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = new com.p314xaae8f345.mm.p2621x8fb0427b.f9();
        f9Var.u1(v2Var.h());
        f9Var.m124850x7650bebc(43);
        f9Var.j1(1);
        if (!((vf0.c) ((c35.m) i95.n0.c(c35.m.class))).hj()) {
            f9Var.i1(stringExtra2);
        }
        f9Var.r1(2);
        f9Var.e1(c01.w9.o(v2Var.h()));
        v2Var.f496549n = c01.w9.x(f9Var);
        v2Var.n(f9Var.Q0());
        t21.o2.Ui().x(v2Var, true);
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, yn.l
    public void x() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingUI.VideoComponent", "[onChattingResume]");
        sb5.z zVar = (sb5.z) this.f280113d.f542241c.a(sb5.z.class);
        ((vf0.w1) ((wf0.q1) i95.n0.c(wf0.q1.class))).getClass();
        t21.o2.Ui().b(((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.k) zVar).N1, android.os.Looper.getMainLooper());
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, yn.l
    public void y() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingUI.VideoComponent", "[onChattingPause]");
        sb5.z zVar = (sb5.z) this.f280113d.f542241c.a(sb5.z.class);
        ((vf0.w1) ((wf0.q1) i95.n0.c(wf0.q1.class))).getClass();
        t21.o2.Ui().A(((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.k) zVar).N1);
    }
}

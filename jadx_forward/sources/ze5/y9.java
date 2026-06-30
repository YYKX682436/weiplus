package ze5;

/* loaded from: classes9.dex */
public class y9 extends com.p314xaae8f345.mm.ui.p2650x55bb7a46.b6 {

    /* renamed from: m, reason: collision with root package name */
    public static boolean f553861m;

    /* renamed from: g, reason: collision with root package name */
    public int f553862g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2650x55bb7a46.m5 f553863h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f553864i;

    public y9(yb5.d dVar, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er erVar) {
        super(dVar, erVar);
        this.f553862g = 0;
        this.f553863h = null;
        this.f553864i = false;
        this.f553864i = erVar.c().A0() != 1;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.b6
    public void a(android.view.View view, yb5.d dVar, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        if (((fo.e) ((le5.e) i95.n0.c(le5.e.class))).bj(dVar.g(), f9Var.G, null)) {
            return;
        }
        ze5.ja jaVar = (ze5.ja) this.f280026e;
        ((u90.a) ((v90.v) i95.n0.c(v90.v.class))).wi(f9Var);
        b(jaVar.c(), f9Var.Q0(), jaVar.f285442e, jaVar.R, view);
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.N4(f9Var.Q0())) {
            return;
        }
        boolean z17 = this.f553864i;
        long I0 = f9Var.I0();
        java.lang.String Q0 = f9Var.Q0();
        el0.e eVar = el0.i.f335260h;
        if (eVar != null) {
            wl0.l lVar = (wl0.l) eVar;
            ((ku5.t0) ku5.t0.f394148d).r(new wl0.k(lVar, I0, z17, Q0), "KaraEvent");
        }
    }

    public final void b(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, java.lang.String str, java.lang.String str2, int i17, android.view.View view) {
        int i18;
        int i19;
        java.lang.String Zi;
        com.p314xaae8f345.mm.p959x883644fd.a aVar = com.p314xaae8f345.mm.p959x883644fd.a.Click;
        yb5.d dVar = this.f280025d;
        com.p314xaae8f345.mm.p959x883644fd.b.d(f9Var, aVar, dVar.f542255q, dVar.k());
        if (2 != i17) {
            if (f9Var.A0() == 0) {
                wf0.x1 x1Var = (wf0.x1) i95.n0.c(wf0.x1.class);
                java.lang.String z07 = f9Var.z0();
                ((vf0.y1) x1Var).getClass();
                t21.v2 h17 = t21.d3.h(z07);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DesignerClickListener", "videoReceiverEvent video status:" + h17.f496544i + " is sender:" + f9Var.A0());
                if (i17 == 3) {
                    d(h17);
                } else if (i17 == 4) {
                    if (c01.d9.b().E()) {
                        t21.d3.y(f9Var.z0());
                    } else {
                        yb5.d dVar2 = this.f280025d;
                        db5.t7.k(dVar2.g(), dVar2.f542250l.m78646xc2a54588());
                    }
                }
            }
            if (f9Var.A0() == 1) {
                ((vf0.w1) ((wf0.q1) i95.n0.c(wf0.q1.class))).getClass();
                t21.v2 g17 = t21.o2.Ui().g(f9Var.z0());
                if (g17 == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.DesignerClickListener", "videoSendEvent but video info is null [%s]", f9Var.z0());
                    return;
                }
                int i27 = g17.f496544i;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DesignerClickListener", " videoSendEvent status : " + i27);
                if (i17 != 3) {
                    if (i17 != 4) {
                        if (i17 != 5) {
                            if (i17 != 6) {
                                return;
                            }
                        }
                    }
                    if (i27 == 112) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DesignerClickListener", "this video come from pc weixin, user pause recv now.");
                        t21.d3.y(f9Var.z0());
                        return;
                    } else {
                        t21.d3.z(f9Var.z0());
                        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5991xa0d42363 c5991xa0d42363 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5991xa0d42363();
                        c5991xa0d42363.f136286g.f88994a = f9Var;
                        c5991xa0d42363.e();
                        return;
                    }
                }
                if (i27 == 113) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DesignerClickListener", "this video come from pc weixin, user restart now.");
                    d(g17);
                    return;
                }
                if (g17.k()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.DesignerClickListener", "this video come from gallery, but it is illegal.");
                    java.lang.String string = this.f280025d.g().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574978k75);
                    if (i27 == 142) {
                        string = this.f280025d.g().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574978k75);
                    } else if (i27 == 141) {
                        string = this.f280025d.g().getString(com.p314xaae8f345.mm.R.C30867xcad56011.k76);
                    } else if (i27 == 140) {
                        string = this.f280025d.g().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574977k74);
                    }
                    db5.e1.s(this.f280025d.g(), string, this.f280025d.g().getString(com.p314xaae8f345.mm.R.C30867xcad56011.jz9));
                    return;
                }
                f9Var.m78015x9dfe85a();
                ((com.p314xaae8f345.mm.p2621x8fb0427b.g9) c01.d9.b().u()).lb(f9Var.m124847x74d37ac6(), f9Var, true);
                if (c01.id.a() - f9Var.mo78012x3fdd41df() >= 432000000) {
                    com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.k0.Q(this.f280025d, f9Var, g17.f496544i == 198 ? com.p314xaae8f345.mm.R.C30867xcad56011.f572022wi : com.p314xaae8f345.mm.R.C30867xcad56011.f572023wj);
                    return;
                }
                if (g17.f496544i == 198) {
                    t21.d3.C(f9Var.z0());
                    return;
                }
                final java.lang.String z08 = f9Var.z0();
                ((vf0.y1) ((wf0.x1) i95.n0.c(wf0.x1.class))).getClass();
                t21.d3.M(z08);
                ((ku5.t0) ku5.t0.f394148d).g(new java.lang.Runnable() { // from class: ze5.y9$$a
                    @Override // java.lang.Runnable
                    public final void run() {
                        f65.y0 y0Var = f65.y0.f341552a;
                        java.lang.String str3 = z08;
                        if (str3 == null) {
                            return;
                        }
                        ((ku5.t0) ku5.t0.f394148d).b(new f65.r0(str3), "MicroMsg.VideoSendReporter");
                    }
                });
                return;
            }
            return;
        }
        if (iq.b.C(this.f280025d.g()) || iq.b.v(this.f280025d.g()) || iq.b.e(this.f280025d.g())) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DesignerClickListener", "Voip or multitalk is running, can't do this");
            return;
        }
        if (f9Var.A0() == 1) {
            if (((vf0.y2) ((wf0.b2) i95.n0.c(wf0.b2.class))).ij(new com.p314xaae8f345.mm.p1006xc5476f33.msg.C16564xb55e1d5(f9Var.m124847x74d37ac6(), f9Var.Q0())) && ((Zi = ((xf0.u) ((wf0.y1) i95.n0.c(wf0.y1.class))).Zi(f9Var)) == null || !com.p314xaae8f345.mm.vfs.w6.j(Zi))) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DesignerClickListener", "video sending, can't click video to launch imagegallery, playPath not exist");
                return;
            }
        }
        int[] iArr = new int[2];
        if (view != null) {
            view.getLocationOnScreen(iArr);
            i19 = view.getWidth();
            i18 = view.getHeight();
        } else {
            i18 = 0;
            i19 = 0;
        }
        long m124847x74d37ac6 = f9Var.m124847x74d37ac6();
        long I0 = f9Var.I0();
        int i28 = this.f553862g;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DesignerClickListener", "[ImageGalleryUI] showImgGallery");
        yb5.d dVar3 = this.f280025d;
        android.content.Intent intent = new android.content.Intent(dVar3.g(), (java.lang.Class<?>) com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ViewOnClickListenerC21748xb3d38e6b.class);
        intent.putExtra("show_search_chat_content_result", ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.jk) ((sb5.u1) dVar3.f542241c.a(sb5.u1.class))).f280828f);
        intent.putExtra("img_gallery_msg_id", m124847x74d37ac6);
        intent.putExtra("key_is_biz_chat", ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.biz.a) ((sb5.f) dVar3.f542241c.a(sb5.f.class))).f280286r);
        intent.putExtra("key_biz_chat_id", ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.biz.a) ((sb5.f) dVar3.f542241c.a(sb5.f.class))).w0());
        intent.putExtra("img_gallery_msg_svr_id", I0);
        intent.putExtra("img_gallery_talker", str);
        intent.putExtra("img_gallery_chatroom_name", str2);
        intent.putExtra("img_gallery_left", iArr[0]);
        intent.putExtra("img_gallery_top", iArr[1]);
        intent.putExtra("img_gallery_width", i19);
        intent.putExtra("img_gallery_height", i18);
        intent.putExtra("KOpenArticleSceneFromScene", 1);
        intent.putExtra("img_gallery_enter_from_chatting_ui", true);
        intent.putExtra("msg_type", i28);
        if (i28 == 0) {
            intent.putExtra("key_enter_scene", 1);
        } else if (i28 == 4) {
            intent.putExtra("key_enter_scene", 5);
        }
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.m5 m5Var = this.f553863h;
        if (m5Var != null) {
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.l5 f5Var = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.f5(false, 0);
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.l5 a17 = m5Var.a(com.p314xaae8f345.mm.ui.p2650x55bb7a46.f5.class);
            if (a17 != null) {
                f5Var = a17;
            }
            intent.putExtra("key_is_from_news_jump", ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.f5) f5Var).f282019a);
        }
        java.lang.String x17 = dVar3.x();
        java.lang.String t17 = f9Var.A0() == 1 ? dVar3.t() : str;
        android.os.Bundle bundle = new android.os.Bundle();
        if (dVar3.D()) {
            bundle.putInt("stat_scene", 2);
        } else {
            bundle.putInt("stat_scene", c01.e2.G(x17) ? 7 : 1);
        }
        bundle.putString("stat_msg_id", "msg_" + java.lang.Long.toString(I0));
        bundle.putString("stat_chat_talker_username", x17);
        bundle.putString("stat_send_msg_user", t17);
        intent.putExtra("_stat_obj", bundle);
        if (f9Var.M2()) {
            intent.putExtra("img_gallery_mp_video_click_from", 2);
        }
        com.p314xaae8f345.mm.ui.p2731xc84c5534.C22471x941a9a3f c17 = com.p314xaae8f345.mm.ui.p2731xc84c5534.C22471x941a9a3f.c(dVar3.g());
        c17.f291149h = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.r0(I0);
        c17.f291150i = com.p314xaae8f345.mm.ui.p2731xc84c5534.h0.Video;
        int i29 = bundle.getInt("stat_scene", 0);
        if (i29 == 1) {
            c17.f291146e = com.p314xaae8f345.mm.ui.p2731xc84c5534.j0.SingleChat;
            c17.b(com.p314xaae8f345.mm.ui.p2731xc84c5534.i0.EnterSingleChat);
        } else if (i29 == 2) {
            c17.f291146e = com.p314xaae8f345.mm.ui.p2731xc84c5534.j0.GroupChat;
            c17.b(com.p314xaae8f345.mm.ui.p2731xc84c5534.i0.EnterGroupChat);
        }
        c17.a(intent);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.bm.a(intent, dVar3.g());
        yb5.d dVar4 = this.f280025d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(dVar4, arrayList.toArray(), "com/tencent/mm/ui/chatting/viewitems/mvvmitem/ChattingItemVideoMvvm$VideoClickListener", "showImgGallery", "(Lcom/tencent/mm/storage/MsgInfo;JJLjava/lang/String;Ljava/lang/String;[IIII)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        dVar4.a0((android.content.Intent) arrayList.get(0));
        yj0.a.f(dVar4, "com/tencent/mm/ui/chatting/viewitems/mvvmitem/ChattingItemVideoMvvm$VideoClickListener", "showImgGallery", "(Lcom/tencent/mm/storage/MsgInfo;JJLjava/lang/String;Ljava/lang/String;[IIII)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        dVar3.f542250l.m78401x4d12b7e0(0, 0);
        if (f9Var.Y2() && str != null) {
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.a aVar2 = com.p314xaae8f345.mm.ui.p2650x55bb7a46.a.EnterFullScreen;
            com.p314xaae8f345.mm.p2493x1bc889d6.C19772x1c2cd081 c19772x1c2cd081 = new com.p314xaae8f345.mm.p2493x1bc889d6.C19772x1c2cd081();
            com.p314xaae8f345.mm.p2493x1bc889d6.C19772x1c2cd081 c19772x1c2cd0812 = new com.p314xaae8f345.mm.p2493x1bc889d6.C19772x1c2cd081();
            if (com.p314xaae8f345.mm.ui.p2650x55bb7a46.e.b(f9Var, c19772x1c2cd081, c19772x1c2cd0812)) {
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.e.a(aVar2, f9Var, c19772x1c2cd081.f38869x6ac9171, c19772x1c2cd0812.f38869x6ac9171);
            }
            if (str.toLowerCase().endsWith("@chatroom")) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(11444, 2);
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(11444, 1);
            }
        }
        g90.s sVar = (g90.s) ((h90.v) i95.n0.c(h90.v.class));
        sVar.getClass();
        if (f9Var.m124847x74d37ac6() <= 0) {
            return;
        }
        ((ku5.t0) ku5.t0.f394148d).h(new g90.e(sVar, f9Var), "c2c_origin_auto_clean");
    }

    public void c(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, android.view.View view) {
        int i17 = this.f553862g;
        if (i17 != 1) {
            if (i17 != 4) {
                return;
            }
            b(f9Var, f9Var.Q0(), "", 2, view);
        } else {
            if (((fo.e) ((le5.e) i95.n0.c(le5.e.class))).bj(view.getContext(), f9Var.G, null)) {
                return;
            }
            ((u90.a) ((v90.v) i95.n0.c(v90.v.class))).wi(f9Var);
            b(f9Var, f9Var.Q0(), "", 2, view);
        }
    }

    public final void d(t21.v2 v2Var) {
        boolean E = c01.d9.b().E();
        yb5.d dVar = this.f280025d;
        if (!E) {
            db5.t7.k(dVar.g(), dVar.f542250l.m78646xc2a54588());
            return;
        }
        if (v2Var.f496544i == 198) {
            t21.d3.B(v2Var.d());
            return;
        }
        if (!com.p314xaae8f345.mm.p971x6de15a2e.y2.a(dVar.g()) && !f553861m) {
            f553861m = true;
            db5.e1.n(dVar.g(), com.p314xaae8f345.mm.R.C30867xcad56011.k77, com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv, new ze5.z9(this, v2Var), new ze5.aa(this));
        } else {
            java.lang.String d17 = v2Var.d();
            ((vf0.y1) ((wf0.x1) i95.n0.c(wf0.x1.class))).getClass();
            t21.d3.L(d17);
        }
    }

    public y9(yb5.d dVar) {
        super(dVar, null);
        this.f553862g = 0;
        this.f553863h = null;
        this.f553864i = false;
    }
}

package sr2;

/* loaded from: classes10.dex */
public final class j4 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1603x3498a0.C14609xb4d6eef6 f493138d;

    public j4(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1603x3498a0.C14609xb4d6eef6 c14609xb4d6eef6) {
        this.f493138d = c14609xb4d6eef6;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/post/PostMainUIC$initPostBtn$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("click post btn, isFromAd: ");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1603x3498a0.C14609xb4d6eef6 c14609xb4d6eef6 = this.f493138d;
        sb6.append(c14609xb4d6eef6.k7().Y);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderPostUI", sb6.toString());
        if (c14609xb4d6eef6.k7().Y) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.x80 c76 = c14609xb4d6eef6.c7();
            c76.f66236x88be67a1 = ((qs2.q) ((w40.e) i95.n0.c(w40.e.class))).cj();
            c76.f66231xac3be4e = c01.id.e();
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56 m76802x2dd01666 = c76.t0().m59240x7c94657b().m76802x2dd01666();
            r45.zw0 m76943xbb439a28 = m76802x2dd01666 != null ? m76802x2dd01666.m76943xbb439a28() : null;
            if (m76943xbb439a28 != null) {
                com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19783xd9a946b7 c19783xd9a946b7 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p2.f206771b;
                m76943xbb439a28.set(14, java.lang.Integer.valueOf(c19783xd9a946b7 != null ? c19783xd9a946b7.m76275xbcc8608a() : 0));
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p2 p2Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p2.f206770a;
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19783xd9a946b7 c19783xd9a946b72 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p2.f206771b;
            if (c19783xd9a946b72 != null) {
                c19783xd9a946b72.m76437x47bc391(c19783xd9a946b72.m76275xbcc8608a());
            }
            r45.qb4 m60705xa8f45ee4 = c76.m60705xa8f45ee4();
            r45.ip2 ip2Var = new r45.ip2();
            ip2Var.set(0, java.lang.Integer.valueOf(c14609xb4d6eef6.k7().U));
            ip2Var.set(1, c14609xb4d6eef6.k7().f482948b0);
            m60705xa8f45ee4.set(29, ip2Var);
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("doPostAdDraft:");
            sb7.append(c76.f66236x88be67a1);
            sb7.append(" des:");
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56 m76802x2dd016662 = c76.t0().getFeedObject().m76802x2dd01666();
            sb7.append(m76802x2dd016662 != null ? m76802x2dd016662.m76944x730bcac6() : null);
            sb7.append(" showOrigin:");
            sb7.append(c76.t0().getFeedObject().m76830x805d0e64());
            sb7.append(" localId:");
            sb7.append(c76.f66236x88be67a1);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderPostUI", sb7.toString());
            mv2.f0 f0Var = mv2.f0.f413094a;
            ov2.c cVar = mv2.f0.f413096c;
            cVar.getClass();
            ((java.util.ArrayList) cVar.f430706f).add(c76);
            f0Var.c();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LogPost.FinderPostManager", "doPostDraft " + c76.f66236x88be67a1);
            pm0.v.X(new sr2.x3(c14609xb4d6eef6));
            c14609xb4d6eef6.t7(false, 2);
        } else {
            boolean[] zArr = c14609xb4d6eef6.Z;
            if (zArr[0]) {
                zArr[0] = false;
            } else {
                fo3.s sVar = fo3.s.INSTANCE;
                sVar.Z7("ce_feed_publish", "<FeedPublish>");
                sVar.H2("ce_feed_publish", android.view.MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 65535));
                sVar.Qa("ce_feed_publish");
            }
            if (c14609xb4d6eef6.B7()) {
                java.lang.String string = c14609xb4d6eef6.m158354x19263085().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.nlw);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
                java.lang.String string2 = c14609xb4d6eef6.m158354x19263085().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.nlv);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
                java.lang.String string3 = c14609xb4d6eef6.m158354x19263085().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string3, "getString(...)");
                db5.e1.D(c14609xb4d6eef6.m158354x19263085(), string, "", string2, string3, true, new sr2.y3(c14609xb4d6eef6), sr2.z3.f493360d, com.p314xaae8f345.mm.R.C30859x5a72f63.f560154cg);
            } else {
                c14609xb4d6eef6.r7();
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p2 p2Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p2.f206770a;
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p2.L(p2Var2, c14609xb4d6eef6.m80379x76847179(), 66, c14609xb4d6eef6.k7().P, 0L, 0, 24, null);
                c14609xb4d6eef6.K7(c14609xb4d6eef6.n7(), "post_icon");
                java.util.Map Ai = ((yy0.m7) ((pp0.l0) i95.n0.c(pp0.l0.class))).Ai();
                Ai.put("view_id", "post_click");
                ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).yj("post_click", null, Ai, 6, false);
                long c17 = c01.id.c();
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p2.z(p2Var2, "FirstToPostAction", "PostPage", null, 0, c17, 12, null);
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p2.z(p2Var2, "RealWait", null, null, 0, c17, 14, null);
                p2Var2.G("andr_Post_Page_Click", null);
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.b6 b6Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.b6.f206502a;
                android.app.Activity context = c14609xb4d6eef6.m80379x76847179();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = context instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class) : null;
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.b6.d(b6Var, nyVar != null ? nyVar.V6() : null, "song_finish_publish", 1, (org.json.JSONObject) ((jz5.n) c14609xb4d6eef6.S).mo141623x754a37bb(), false, null, 48, null);
                c14609xb4d6eef6.I7().b7();
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.ad0 ad0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.ad0.f207935a;
                ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.ad0.f207934J).mo141623x754a37bb()).l();
                ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.ad0.K).mo141623x754a37bb()).l();
                ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.ad0.L).mo141623x754a37bb()).l();
                ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.ad0.M).mo141623x754a37bb()).l();
                ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.ad0.N).mo141623x754a37bb()).l();
                ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.ad0.O).mo141623x754a37bb()).l();
                mv2.f0.f413094a.p(mv2.g0.f413103e);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/post/PostMainUIC$initPostBtn$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

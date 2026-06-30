package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui;

/* loaded from: classes10.dex */
public final class jc {
    public jc(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final boolean a(android.content.Context context, android.content.Intent intent, java.lang.String str, int i17, int i18, java.lang.String str2, boolean z17, int i19) {
        java.lang.String str3;
        java.lang.String m76317x2a881cd1;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        float f17 = i18 / i17;
        e42.e0 e0Var = (e42.e0) i95.n0.c(e42.e0.class);
        e42.d0 d0Var = e42.d0.clicfg_long_video_max_wh_rate;
        float Di = ((h62.d) e0Var).Di(d0Var, 3.0f);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderPostRouterUI", "getLongVideoMaxRatio " + Di);
        if (f17 <= Di) {
            float Di2 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Di(d0Var, 3.0f);
            float f18 = Di2 >= 1.0f ? 1.0f / Di2 : 0.33333334f;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderPostRouterUI", "getLongVideoMinRatio " + f18);
            if (f17 >= f18) {
                if (!com.p314xaae8f345.mm.vfs.w6.j(str)) {
                    return false;
                }
                android.content.Intent intent2 = new android.content.Intent();
                if (z17 && (context instanceof android.app.Activity)) {
                    intent2.putExtras(((android.app.Activity) context).getIntent());
                }
                intent2.putExtra("post_id", str2);
                intent2.putExtra("edit_id", gm0.j1.b().j() + '_' + java.lang.System.currentTimeMillis());
                intent2.putExtra("postType", 4);
                intent2.putExtra("postMediaList", kz5.c0.d(str));
                intent2.putExtra("postTypeList", kz5.c0.d(4));
                intent2.putExtra("isLongVideoPost", true);
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p2 p2Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p2.f206770a;
                p2Var.W(p2Var.i(context, i19, false));
                if (intent != null) {
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0.class)).nl(intent2, intent);
                    int intExtra = intent.getIntExtra("key_finder_post_sns_video_duration_ms", -1);
                    if (intExtra > 0 && intExtra < (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a.q2() + 1) * 1000) {
                        intent2.putExtra("isLongVideoPost", false);
                    }
                }
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0.class)).hk(context, intent2);
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.s5 s5Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.s5.f206882a;
                com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19783xd9a946b7 c19783xd9a946b7 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p2.f206771b;
                java.lang.String str4 = "";
                if (c19783xd9a946b7 == null || (str3 = c19783xd9a946b7.m76255x7117c88d()) == null) {
                    str3 = "";
                }
                com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19783xd9a946b7 c19783xd9a946b72 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p2.f206771b;
                if (c19783xd9a946b72 != null && (m76317x2a881cd1 = c19783xd9a946b72.m76317x2a881cd1()) != null) {
                    str4 = m76317x2a881cd1;
                }
                long c17 = c01.id.c() / 1000;
                com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6560x6997f09c c6560x6997f09c = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6560x6997f09c();
                c6560x6997f09c.f139086d = c6560x6997f09c.b("ClickId", str3, true);
                c6560x6997f09c.f139087e = c6560x6997f09c.b("PostId", str4, true);
                long j17 = 2;
                c6560x6997f09c.f139088f = j17;
                c6560x6997f09c.f139089g = c17;
                c6560x6997f09c.f139090h = j17;
                c6560x6997f09c.k();
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class)).Zk(c6560x6997f09c);
                return true;
            }
        }
        db5.t7.m123882x26a183b(context, com.p314xaae8f345.mm.R.C30867xcad56011.evp, 0).show();
        return false;
    }
}

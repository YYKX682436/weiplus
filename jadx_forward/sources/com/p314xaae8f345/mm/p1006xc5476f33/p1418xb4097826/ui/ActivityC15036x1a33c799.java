package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/finder/ui/FinderHomeUI;", "Lcom/tencent/mm/plugin/finder/ui/slideprofile/FinderHomeSlideProfileUI;", "<init>", "()V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.ui.FinderHomeUI */
/* loaded from: classes2.dex */
public class ActivityC15036x1a33c799 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1643x4b88b2d8.AbstractActivityC15139x91efb0f1 {
    public boolean A;

    /* renamed from: y, reason: collision with root package name */
    public boolean f210116y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f210117z;

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa
    /* renamed from: W6 */
    public int getD() {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class)).bl(((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15456x2c452bca) pf5.z.f435481a.a(this).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15456x2c452bca.class)).S6());
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa
    public int Y6() {
        return 1;
    }

    @Override // com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f
    /* renamed from: enableEdge2Edge */
    public boolean mo60885x863d972f() {
        return false;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8
    /* renamed from: enableLazyInitUIC */
    public boolean mo47004x48370588() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
        return ((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209391o7).mo141623x754a37bb()).r()).intValue() == 1;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void finish() {
        p012xc85e97e9.p093xedfae76a.c1 a17 = pf5.z.f435481a.a(this).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.gg.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
        if (((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.gg) a17).P6(false)) {
            return;
        }
        int intExtra = getIntent().getIntExtra("FROM_SCENE_KEY", 0);
        boolean booleanExtra = mo55332x76847179().getIntent().getBooleanExtra("KEY_POST_DIRECTLY_FROM_SNS", false);
        boolean booleanExtra2 = mo55332x76847179().getIntent().getBooleanExtra("KEY_FROM_SNS_SYNC_POST", false);
        boolean booleanExtra3 = mo55332x76847179().getIntent().getBooleanExtra("KEY_POST_FROM_NORMAL_TASK", false);
        boolean booleanExtra4 = mo55332x76847179().getIntent().getBooleanExtra("KEY_BACK_TO_NORMAL", false);
        if (intExtra == 5) {
            if (!mo55332x76847179().getIntent().getBooleanExtra("KEY_PUSH_FAIL_RETURN_READY", false)) {
                l7();
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(23669, getIntent().getStringExtra("KEY_TASK_ID"), "fail_return_to", java.lang.Long.valueOf(java.lang.System.currentTimeMillis()), "", 1, 1);
            int intExtra2 = getIntent().getIntExtra("KEY_PUSH_RETURN_TO", -1);
            if (intExtra2 == 4) {
                m7();
            } else {
                if (intExtra2 != 5) {
                    super.finish();
                    return;
                }
                l7();
            }
        } else if (booleanExtra || booleanExtra2 || booleanExtra3) {
            r7(false);
        } else if (getIntent().getBooleanExtra("KEY_FROM_SHARE_REL", false) || booleanExtra4 || intExtra == 4 || this.A) {
            l7();
        } else if (((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.gg) pf5.z.f435481a.a(this).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.gg.class)).f216038d || this.f210116y || intExtra == 6 || !this.f210117z) {
            int taskId = getTaskId();
            i95.m c17 = i95.n0.c(au2.q.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            if (taskId == ((au2.q) c17).f95623h) {
                l7();
            } else if (!this.f210116y) {
                r7(false);
            }
        } else {
            l7();
        }
        sc2.a8 a8Var = (sc2.a8) pf5.z.f435481a.a(this).e(sc2.a8.class);
        if (a8Var != null) {
            a8Var.n7();
        }
        pm0.v.V(0L, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.x6(this));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.ak_;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1643x4b88b2d8.AbstractActivityC15139x91efb0f1
    public void i7(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.el elVar = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15456x2c452bca) pf5.z.f435481a.a(this).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15456x2c452bca.class)).f215109p;
        if (z17) {
            elVar.b();
        } else {
            elVar.a();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.p2688xb5e90917.ActivityC22284xa3359eae, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8
    /* renamed from: importUIComponents */
    public java.util.Set mo43419xa59964ef() {
        java.util.Set e17 = kz5.p1.e(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15456x2c452bca.class, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.bl.class, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.u6.class, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.v6.class, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.di.class, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.uc.class, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ko.class, cs2.k.class, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ru.class, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.h80.class, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.hy.class, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15477xbd78f833.class, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.sx.class, hy2.f.class, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.u70.class, d92.b2.class, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.f2.class, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.fy.class, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.gg.class, pf5.a0.a(p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(zy2.b8.class)), com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ya0.class, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.pt.class, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15442xfd56d647.class, d92.p1.class, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.a4.class, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.qn.class, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.cl.class, ey2.b0.class, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.d7.class, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ea.class);
        sr2.t tVar = sr2.t.f493251d;
        if (((java.lang.Boolean) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.ad0.f207934J).mo141623x754a37bb()).r()).booleanValue()) {
            e17.add(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15468xd6e8b5a4.class);
        }
        if (!((java.lang.Boolean) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a.N0().r()).booleanValue()) {
            e17.add(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.hs.class);
            e17.add(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.nq.class);
            e17.add(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.e90.class);
        }
        return e17;
    }

    @Override // com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f
    /* renamed from: isHideStatusBar */
    public boolean getP() {
        return true;
    }

    public void l7() {
        android.content.Intent intent = new android.content.Intent();
        intent.addFlags(67108864);
        intent.addFlags(268435456);
        intent.putExtra("preferred_tab", 2);
        j45.l.u(this, ".ui.LauncherUI", intent, null);
        overridePendingTransition(com.p314xaae8f345.mm.R.C30854x2dc211.f559413e4, com.p314xaae8f345.mm.R.C30854x2dc211.f559422ed);
    }

    public void m7() {
        android.content.Intent intent = new android.content.Intent();
        intent.addFlags(67108864);
        intent.putExtra("preferred_tab", 0);
        j45.l.u(this, ".ui.LauncherUI", intent, null);
        overridePendingTransition(com.p314xaae8f345.mm.R.C30854x2dc211.f559413e4, com.p314xaae8f345.mm.R.C30854x2dc211.f559422ed);
    }

    public final void n7(android.content.Intent intent) {
        boolean booleanExtra = intent != null ? intent.getBooleanExtra("KEY_FINDER_JUMP_FOLLOW_TAB", false) : false;
        android.content.Intent intent2 = getIntent();
        if (intent2 != null) {
            intent2.putExtra("KEY_FINDER_JUMP_FOLLOW_TAB", booleanExtra);
        }
        if (booleanExtra) {
            pf5.u uVar = pf5.u.f435469a;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15482x9b531b34 c15482x9b531b34 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15482x9b531b34) uVar.e(c61.l7.class).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15482x9b531b34.class);
            c15482x9b531b34.getClass();
            pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.n90(c15482x9b531b34));
            p012xc85e97e9.p093xedfae76a.c1 a17 = uVar.c(this).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15456x2c452bca.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putInt("Source", 0);
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15456x2c452bca) a17).f7(3, bundle);
        }
    }

    public final void o7(android.content.Intent intent, boolean z17) {
        boolean booleanExtra = intent != null ? intent.getBooleanExtra("KEY_FINDER_JUMP_FRIEND_TAB", false) : false;
        android.content.Intent intent2 = getIntent();
        if (intent2 != null) {
            intent2.putExtra("KEY_FINDER_JUMP_FRIEND_TAB", booleanExtra);
        }
        if (booleanExtra) {
            pf5.u uVar = pf5.u.f435469a;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15482x9b531b34 c15482x9b531b34 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15482x9b531b34) uVar.e(c61.l7.class).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15482x9b531b34.class);
            c15482x9b531b34.getClass();
            pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.n90(c15482x9b531b34));
            p012xc85e97e9.p093xedfae76a.c1 a17 = uVar.c(this).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15456x2c452bca.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putInt("Source", 0);
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15456x2c452bca) a17).f7(1, bundle);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1643x4b88b2d8.AbstractActivityC15139x91efb0f1, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15086x1d5b7f69, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        java.lang.String str;
        super.onCreate(bundle);
        java.lang.String str2 = "";
        ((k40.f) ((l40.e) i95.n0.c(l40.e.class))).Zi("", "homeUIClear");
        jx3.f.INSTANCE.mo68477x336bdfd8(1279L, 41L, 1L, false);
        boolean z17 = true;
        if (getIntent().getBooleanExtra("key_form_sns", false)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0 i0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0.class);
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("key_from_sns_post", true);
            i0Var.qk(this, intent);
        }
        n7(getIntent());
        o7(getIntent(), false);
        p7(getIntent());
        q7(getIntent());
        android.content.Intent intent2 = getIntent();
        boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(intent2 != null ? intent2.getStringExtra("KEY_FROM_PATH") : null, "appPush");
        if (((ey2.t0) pf5.u.f435469a.e(c61.l7.class).a(ey2.t0.class)).N6(4).f338985l && !b17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.x2 x2Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.x2.f206962a;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a(this).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class);
            if (nyVar != null && (str = nyVar.f216915p) != null) {
                str2 = str;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.x2.f206964c = str2;
        }
        if (b17) {
            overridePendingTransition(com.p314xaae8f345.mm.R.C30854x2dc211.f559419ea, com.p314xaae8f345.mm.R.C30854x2dc211.f559415e6);
        }
        if (!com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a.U0()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.HomeUI", "onCreate: multi task is close, clear all finder task");
            i95.m c17 = i95.n0.c(zy2.c9.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            zy2.c9.ad((zy2.c9) c17, false, 1, null);
        }
        getIntent().putExtra("is_report_feed_immediate", true);
        if (getIntent().getLongExtra("key_finder_post_local_id", -1L) == -1 || (!getIntent().getBooleanExtra("KEY_FINDER_JUMP_FOLLOW_TAB", false) && !getIntent().getBooleanExtra("KEY_FINDER_JUMP_HOT_TAB", false))) {
            z17 = false;
        }
        this.A = z17;
        U6();
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ak(this, iy1.c.FinderHomeAffinityUI);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Rj(this, iy1.a.Finder);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).dk(this, getClass().getSimpleName());
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ik(this, be1.r0.f4232x366c91de, 24184);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ai(this, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.y6(this));
        if (getIntent().getBooleanExtra("key_need_update_task_id", false)) {
            pm0.v.K(null, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.z6(this));
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        if (!iq.b.l(null, false)) {
            ((b92.d1) ((c61.zb) i95.n0.c(c61.zb.class))).getClass();
            zl2.r4.f555483a.s3(true, true);
            co0.b.f125242e2.a();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.q1.f206791d = null;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.q1.f206789b = 0L;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.q1.f206790c = 0L;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.q1.f206792e = false;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.q1.f206794g = true;
        ig2.m.f372926a.g();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onNewIntent(android.content.Intent intent) {
        super.onNewIntent(intent);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a(this).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class);
        if (nyVar != null) {
            nyVar.m7(intent, getIntent(), false);
        }
        n7(intent);
        o7(intent, true);
        p7(intent);
        q7(intent);
        if (intent != null) {
            getIntent().putExtra("isEnableShowUnreadFeed", intent.getBooleanExtra("isEnableShowUnreadFeed", false));
            getIntent().putExtra("KEY_POST_DIRECTLY_FROM_SNS", intent.getBooleanExtra("KEY_POST_DIRECTLY_FROM_SNS", false));
            getIntent().putExtra("key_finder_post_local_id", intent.getLongExtra("key_finder_post_local_id", -1L));
            getIntent().putExtra("KEY_PUSH_RETURN_TO", intent.getIntExtra("KEY_PUSH_RETURN_TO", -1));
            getIntent().putExtra("KEY_TASK_ID", intent.getStringExtra("KEY_TASK_ID"));
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15456x2c452bca c15456x2c452bca = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15456x2c452bca) pf5.z.f435481a.a(this).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15456x2c452bca.class);
        c15456x2c452bca.m80380x71e92c1d().post(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.a7(c15456x2c452bca));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, al5.f3
    /* renamed from: onSwipeBack */
    public void mo2295x59cfc822() {
        this.f210116y = true;
        super.mo2295x59cfc822();
    }

    public final void p7(android.content.Intent intent) {
        boolean booleanExtra = intent != null ? intent.getBooleanExtra("KEY_FINDER_JUMP_HOT_TAB", false) : false;
        boolean booleanExtra2 = intent != null ? intent.getBooleanExtra("KEY_FINDER_JUMP_HOT_TAB_WITH_ANIM", true) : false;
        int intExtra = intent != null ? intent.getIntExtra("Source", 0) : 0;
        android.content.Intent intent2 = getIntent();
        if (intent2 != null) {
            intent2.putExtra("KEY_FINDER_JUMP_HOT_TAB", booleanExtra);
        }
        if (booleanExtra) {
            pf5.u uVar = pf5.u.f435469a;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15482x9b531b34 c15482x9b531b34 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15482x9b531b34) uVar.e(c61.l7.class).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15482x9b531b34.class);
            c15482x9b531b34.getClass();
            pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.n90(c15482x9b531b34));
            p012xc85e97e9.p093xedfae76a.c1 a17 = uVar.c(this).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15456x2c452bca.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putInt("Source", intExtra);
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15456x2c452bca) a17).g7(4, booleanExtra2, bundle);
        }
    }

    public final void q7(android.content.Intent intent) {
        java.lang.String stringExtra = intent != null ? intent.getStringExtra("KEY_ROUTE_TO_PAGE") : null;
        boolean booleanExtra = intent != null ? intent.getBooleanExtra("KEY_ROUTE_TO_TOPIC", false) : false;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.HomeUI", "checkRoute " + stringExtra + ' ' + booleanExtra);
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15063x2c6bbac6.class).g(), stringExtra)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.HomeUI", "jumpFinderPersonCenter");
            android.content.Intent intent2 = new android.content.Intent();
            intent2.putExtra("RED_DOT_EXIST_ON_ENTER", true);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.iy.d(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.L1, this, intent2, 0L, null, 0, 0, false, 0, null, 508, null);
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0.class)).qk(this, intent2);
        }
        if (booleanExtra) {
            xc2.y2.f534876a.f(intent, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.w6(this));
        }
    }

    public void r7(boolean z17) {
    }
}

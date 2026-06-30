package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui;

@db5.a(m123858x6ac9171 = dc1.e.f65819x366c91de)
@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/FinderProfileTimeLineUI;", "Lcom/tencent/mm/plugin/finder/ui/MMFinderFeedDetailUI;", "Lcom/tencent/mm/modelbase/u0;", "<init>", "()V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderProfileTimeLineUI */
/* loaded from: classes2.dex */
public class ActivityC14074xf8b1598 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15086x1d5b7f69 implements com.p314xaae8f345.mm.p944x882e457a.u0 {
    public static final /* synthetic */ int R = 0;
    public java.lang.String A;
    public boolean B;
    public long C;
    public java.lang.Boolean D;
    public boolean E;
    public boolean F;
    public boolean G;
    public long H;

    /* renamed from: J, reason: collision with root package name */
    public int f191037J;
    public r45.a34 L;
    public r45.q13 N;

    /* renamed from: u, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.kr f191039u;

    /* renamed from: v, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 f191040v;

    /* renamed from: w, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15307x329a684e f191041w;

    /* renamed from: x, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15307x329a684e f191042x;

    /* renamed from: y, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15282xfe3c9a46 f191043y;

    /* renamed from: z, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.xr f191044z;

    /* renamed from: t, reason: collision with root package name */
    public final java.lang.String f191038t = "Finder.FinderProfileTimeLineUI";
    public java.lang.String I = "";
    public java.lang.String K = "";
    public java.lang.String M = "";
    public final jz5.g P = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.fj(this));
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.dj Q = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.dj();

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa
    /* renamed from: W6 */
    public int getD() {
        boolean z17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(getIntent().getStringExtra("finder_username"), xy2.c.e(this)) && getIntent().getBooleanExtra("KEY_FINDER_SELF_FLAG", false);
        int intExtra = getIntent().getIntExtra("KEY_SPECIFY_COMMENTSCENE", 0);
        return intExtra != 0 ? intExtra : z17 ? 8 : 1;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa
    public int Y6() {
        return 2;
    }

    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.kr c7(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf context, java.lang.String username, boolean z17, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.kr(context, username, z17, j17, this.F, this.G, this.H, this.I, this.f191037J, this.K, this.L, this.M, this.N);
    }

    public final vb2.m d7() {
        return (vb2.m) ((jz5.n) this.P).mo141623x754a37bb();
    }

    public final void e7() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f191038t, "goBack");
        pf5.u uVar = pf5.u.f435469a;
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = mo55332x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo55332x76847179, "getContext(...)");
        if (((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.di) uVar.c(mo55332x76847179).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.di.class)).mo2274xbdc3c5dc()) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2.w1 w1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2.w1) uVar.c(this).e(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2.w1.class);
        if (w1Var != null && w1Var.mo2274xbdc3c5dc()) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15471x9d199e5b c15471x9d199e5b = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15471x9d199e5b) uVar.c(this).e(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15471x9d199e5b.class);
        if (c15471x9d199e5b != null && c15471x9d199e5b.mo2274xbdc3c5dc()) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1470xd7658cb4.u uVar2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1470xd7658cb4.u) uVar.c(this).e(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1470xd7658cb4.u.class);
        if (uVar2 != null && uVar2.mo2274xbdc3c5dc()) {
            return;
        }
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x768471792 = mo55332x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo55332x768471792, "getContext(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.v6 v6Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.v6) uVar.c(mo55332x768471792).e(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.v6.class);
        if (v6Var != null && v6Var.O6()) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.kr krVar = this.f191039u;
        if (krVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("presenter");
            throw null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.f5 j27 = krVar.j2();
        if (j27 != null && j27.b()) {
            j27.a();
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15307x329a684e c15307x329a684e = this.f191041w;
        if (c15307x329a684e == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("likeDrawer");
            throw null;
        }
        if (c15307x329a684e.q()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15307x329a684e c15307x329a684e2 = this.f191041w;
            if (c15307x329a684e2 != null) {
                c15307x329a684e2.u();
                return;
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("likeDrawer");
                throw null;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15307x329a684e c15307x329a684e3 = this.f191042x;
        if (c15307x329a684e3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("friendLikeDrawer");
            throw null;
        }
        if (c15307x329a684e3.q()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15307x329a684e c15307x329a684e4 = this.f191042x;
            if (c15307x329a684e4 != null) {
                c15307x329a684e4.u();
                return;
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("friendLikeDrawer");
                throw null;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15282xfe3c9a46 c15282xfe3c9a46 = this.f191043y;
        if (c15282xfe3c9a46 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("friendFavDrawer");
            throw null;
        }
        if (!c15282xfe3c9a46.q()) {
            p012xc85e97e9.p093xedfae76a.c1 a17 = uVar.c(this).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.gg.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
            if (((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.gg) a17).P6(false)) {
                return;
            }
            finish();
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15282xfe3c9a46 c15282xfe3c9a462 = this.f191043y;
        if (c15282xfe3c9a462 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("friendFavDrawer");
            throw null;
        }
        if (c15282xfe3c9a462.q()) {
            c15282xfe3c9a462.n(true);
        }
    }

    public void f7() {
        if (this.f191039u != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f191038t, "saveLoaderData");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.kr krVar = this.f191039u;
            if (krVar == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("presenter");
                throw null;
            }
            arrayList.addAll(krVar.m().m56388xcaeb60d0());
            java.util.Iterator it = arrayList.iterator();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(it, "iterator(...)");
            while (it.hasNext()) {
                java.lang.Object next = it.next();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(next, "next(...)");
                so2.j5 j5Var = (so2.j5) next;
                if ((j5Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) && ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) j5Var).getIsProfileAdFeed()) {
                    it.remove();
                } else if ((j5Var instanceof so2.n1) && ((so2.n1) j5Var).f2()) {
                    it.remove();
                }
            }
            android.content.Intent intent = getIntent();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.kr krVar2 = this.f191039u;
            if (krVar2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("presenter");
                throw null;
            }
            hc2.e0.b(intent, 0, arrayList, krVar2.m().m56357x44e5026c(), null);
            setResult(-1, getIntent());
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void finish() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
        if ((((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.E1).mo141623x754a37bb()).r()).intValue() == 1 && this.E && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.D, java.lang.Boolean.TRUE)) ? false : true) {
            f7();
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f191038t, "can't save loader data,because hasFinish=" + this.E + ",needBackData=" + this.D);
        }
        super.finish();
        this.E = true;
    }

    public final void g7() {
        if (!com.p314xaae8f345.mm.ui.bk.y()) {
            d7().f516211n.setVisibility(8);
            d7().f516209l.setVisibility(8);
            d7().f516205h.setVisibility(8);
            return;
        }
        d7().f516211n.setVisibility(0);
        d7().f516209l.setVisibility(0);
        d7().f516205h.setVisibility(4);
        if (com.p314xaae8f345.mm.ui.bk.w0()) {
            if (com.p314xaae8f345.mm.ui.fj.b(this)) {
                d7().f516212o.setImageResource(com.p314xaae8f345.mm.R.raw.f80164x8f15f9e0);
            } else {
                d7().f516212o.setImageResource(com.p314xaae8f345.mm.R.raw.f80311xadf8c434);
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.b7e;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.p2688xb5e90917.ActivityC22284xa3359eae, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8
    /* renamed from: importUIComponents */
    public java.util.Set mo43419xa59964ef() {
        return kz5.z.D0(new java.lang.Class[]{com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.pt.class, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15442xfd56d647.class, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.h80.class, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15477xbd78f833.class, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.sx.class, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.f2.class, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.fy.class, ni3.n.class, cs2.k.class, hy2.f.class, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.a4.class, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.gg.class, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.di.class, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.u6.class, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.v6.class, pf5.a0.a(p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(zy2.v9.class))});
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        java.lang.Object obj;
        java.util.LinkedList linkedList;
        fc2.c n17;
        fc2.c n18;
        fc2.c n19;
        ya2.g gVar = ya2.h.f542017a;
        java.lang.String str = this.A;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
        ya2.b2 b17 = gVar.b(str);
        mo54450xbf7c1df6(b17 != null ? b17.w0() : "");
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.m6e);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f191040v = (com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00) findViewById;
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.aj(this));
        java.lang.String str2 = this.A;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str2);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.kr c76 = c7(this, str2, this.B, this.C);
        this.f191039u = c76;
        if (c76 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("presenter");
            throw null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.xr xrVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.xr(this, c76);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.kr krVar = this.f191039u;
        if (krVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("presenter");
            throw null;
        }
        krVar.f188780x = xrVar;
        int i17 = krVar.f188765f ? 8 : 1;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13888xeed42a34 m17 = krVar.m();
        if (!(m17 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13888xeed42a34)) {
            m17 = null;
        }
        if (m17 != null) {
            m17.m56241xf3442622(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.vq(krVar));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13888xeed42a34 m18 = krVar.m();
        if (!(m18 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13888xeed42a34)) {
            m18 = null;
        }
        if (m18 != null) {
            m18.m56240x525f07a8(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.wq(krVar));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13888xeed42a34 m19 = krVar.m();
        if (!(m19 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13888xeed42a34)) {
            m19 = null;
        }
        if (m19 != null) {
            m19.m56242x17fcb79c(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.xq(krVar));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13888xeed42a34 m27 = krVar.m();
        if (!(m27 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13888xeed42a34)) {
            m27 = null;
        }
        if (m27 != null) {
            m27.m56262x318962d9(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.yq(krVar));
        }
        krVar.f188762J.mo48813x58998cd();
        krVar.K.mo48813x58998cd();
        if (bd2.r.f100817a.b()) {
            krVar.L.mo48813x58998cd();
        }
        krVar.M.mo48813x58998cd();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15216x1b6b354b c15216x1b6b354b = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15216x1b6b354b(krVar.m());
        krVar.F = c15216x1b6b354b;
        c15216x1b6b354b.mo48813x58998cd();
        cw2.f8 f8Var = krVar.I;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.xr xrVar2 = krVar.f188780x;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(xrVar2);
        cw2.f8.L0(f8Var, xrVar2.f192628d, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.rq(krVar), false, 8, null);
        boolean z17 = ((java.lang.Boolean) ((nb2.a) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209330l0).mo141623x754a37bb()).r()).booleanValue() || ((java.lang.Boolean) ((nb2.a) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209348m0).mo141623x754a37bb()).r()).booleanValue();
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf activity = krVar.f188763d;
        if (z17) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
            pf5.z zVar = pf5.z.f435481a;
            ni3.n nVar = (ni3.n) zVar.a(activity).a(ni3.n.class);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13920xa5f564aa m56388xcaeb60d0 = krVar.m().m56388xcaeb60d0();
            cw2.f8 f8Var2 = krVar.I;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) zVar.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class);
            nVar.P6(m56388xcaeb60d0, 0, f8Var2, nyVar != null ? zy2.ra.n1(nyVar, 0, 1, null) : null, -1);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.zq zqVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.zq(krVar);
        int i18 = krVar.C;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.l0 l0Var = krVar.f188782z;
        l0Var.N0(i18, i17, zqVar);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.xr xrVar3 = krVar.f188780x;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 m56677x4905e9fa = xrVar3 != null ? xrVar3.m56677x4905e9fa() : null;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1447x5c6729a.p1448xe821e364.C13728x20aad6ea c13728x20aad6ea = m56677x4905e9fa instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1447x5c6729a.p1448xe821e364.C13728x20aad6ea ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1447x5c6729a.p1448xe821e364.C13728x20aad6ea) m56677x4905e9fa : null;
        if (c13728x20aad6ea != null) {
            c13728x20aad6ea.m55765x156e0547(krVar.X);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.xr xrVar4 = krVar.f188780x;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 m56677x4905e9fa2 = xrVar4 != null ? xrVar4.m56677x4905e9fa() : null;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1447x5c6729a.p1448xe821e364.C13728x20aad6ea c13728x20aad6ea2 = m56677x4905e9fa2 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1447x5c6729a.p1448xe821e364.C13728x20aad6ea ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1447x5c6729a.p1448xe821e364.C13728x20aad6ea) m56677x4905e9fa2 : null;
        if (c13728x20aad6ea2 != null) {
            c13728x20aad6ea2.m55761xe02f1f0f(krVar.Z);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.iy iyVar = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.L1;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny e17 = iyVar.e(activity);
        if (e17 != null && (n19 = zy2.ra.n1(e17, 0, 1, null)) != null) {
            n19.a(l0Var);
        }
        pf5.z zVar2 = pf5.z.f435481a;
        krVar.G = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.w3(((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) zVar2.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class)).V6()).f206954b;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny e18 = iyVar.e(activity);
        if (e18 != null && (n18 = zy2.ra.n1(e18, 0, 1, null)) != null) {
            fc2.d dVar = krVar.G;
            if (dVar == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("observerForExposeReport");
                throw null;
            }
            n18.a(dVar);
        }
        zy2.h8 h8Var = krVar.A;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ar arVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ar(krVar);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.xr xrVar5 = krVar.f188780x;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.s3 s3Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.s3) h8Var;
        s3Var.N0(arVar, xrVar5 != null ? xrVar5.m56677x4905e9fa() : null);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny e19 = iyVar.e(activity);
        if (e19 != null && (n17 = zy2.ra.n1(e19, 0, 1, null)) != null) {
            s3Var.getClass();
            n17.a(s3Var);
        }
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15452x854f54e7) zVar2.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15452x854f54e7.class)).P6(xrVar.m56677x4905e9fa());
        java.lang.String stringExtra = activity.getIntent().getStringExtra("FLOAT_BALL_KEY");
        boolean z18 = !(stringExtra == null || stringExtra.length() == 0);
        java.lang.String str3 = krVar.f188776t;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str3, "fromFloatBall " + z18);
        if (!z18) {
            java.util.ArrayList arrayList = krVar.f188778v;
            r45.q13 q13Var = krVar.f188775s;
            if (q13Var != null && (linkedList = q13Var.f465097f) != null) {
                int i19 = 0;
                for (java.lang.Object obj2 : linkedList) {
                    int i27 = i19 + 1;
                    if (i19 < 0) {
                        kz5.c0.p();
                        throw null;
                    }
                    java.lang.Integer num = (java.lang.Integer) obj2;
                    java.util.LinkedList linkedList2 = q13Var.f465096e;
                    java.lang.Integer num2 = linkedList2 != null ? (java.lang.Integer) linkedList2.get(i19) : null;
                    if (num2 != null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(num);
                        arrayList.add(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.yr(num.intValue(), num2.intValue(), 0L, null));
                    } else {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(num);
                        arrayList.add(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.yr(num.intValue(), 0, 0L, null));
                    }
                    i19 = i27;
                }
            }
            if (q13Var != null) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("promotionAdsInfo style_info ");
                sb6.append(q13Var.f465098g);
                sb6.append(" text ");
                r45.fg6 fg6Var = q13Var.f465098g;
                sb6.append(fg6Var != null ? fg6Var.f455857d : null);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str3, sb6.toString());
            }
            if (arrayList.size() > 1) {
                kz5.g0.t(arrayList, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.uq());
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.xr xrVar6 = krVar.f188780x;
        if (xrVar6 != null) {
            xrVar6.m56677x4905e9fa().i(krVar.H);
        }
        com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 c22801x87cbdc00 = xrVar.f192631g;
        if (c22801x87cbdc00 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rlLayout");
            throw null;
        }
        c22801x87cbdc00.m82683xb165a19d(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.qr(xrVar));
        java.util.regex.Pattern pattern = pm0.v.f438335a;
        pm0.v.J(km5.u.d(), new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ur(xrVar));
        int intValue = ((java.lang.Number) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a.M().r()).intValue();
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = xrVar.f192632h;
        if (intValue == -1) {
            if (c1163xf1deaba4 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("recyclerView");
                throw null;
            }
            oj5.x.e(c1163xf1deaba4, kz5.c0.i(new int[]{4, 6}, new int[]{2, 3}), null, null, 6, null);
        }
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf activity2 = xrVar.f192628d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity2, "activity");
        p012xc85e97e9.p093xedfae76a.c1 a17 = pf5.z.f435481a.a(activity2).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
        fc2.o Z6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) a17).Z6(-1);
        if (Z6 != null) {
            if (c1163xf1deaba4 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("recyclerView");
                throw null;
            }
            Z6.d(c1163xf1deaba4);
        }
        if (c1163xf1deaba4 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("recyclerView");
            throw null;
        }
        if ((c1163xf1deaba4 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1447x5c6729a.p1448xe821e364.C13728x20aad6ea) && (c1163xf1deaba4.getLayoutManager() instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de)) {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = c1163xf1deaba4.getLayoutManager();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
            obj = null;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1447x5c6729a.p1448xe821e364.C13728x20aad6ea.i1((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1447x5c6729a.p1448xe821e364.C13728x20aad6ea) c1163xf1deaba4, (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de) layoutManager, null, 2, null);
        } else {
            obj = null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.AbstractC13922x2e8bf6c7.m56397xe61f0140(xrVar.f192630f.m(), xrVar.f192634m, false, 2, obj);
        this.f191044z = xrVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.vc vcVar = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15307x329a684e.D;
        this.f191041w = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.vc.a(vcVar, this, getWindow(), 2, false, false, 24, null);
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = mo55332x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo55332x76847179, "getContext(...)");
        this.f191042x = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.vc.a(vcVar, mo55332x76847179, getWindow(), 1, false, false, 24, null);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p9 p9Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15282xfe3c9a46.B;
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x768471792 = mo55332x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo55332x768471792, "getContext(...)");
        this.f191043y = p9Var.a(mo55332x768471792, getWindow(), 0);
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x768471793 = mo55332x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo55332x768471793, "getContext(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.vc.a(vcVar, mo55332x768471793, getWindow(), 4, false, false, 24, null);
        android.view.View findViewById2 = findViewById(com.p314xaae8f345.mm.R.id.ggn);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/feed/ui/FinderProfileTimeLineUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/feed/ui/FinderProfileTimeLineUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById(com.p314xaae8f345.mm.R.id.aa9).setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.bj(this));
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.ggl);
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x768471794 = mo55332x76847179();
        java.lang.String w07 = b17 != null ? b17.w0() : "";
        ((ke0.e) xVar).getClass();
        textView.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(mo55332x768471794, w07));
        android.view.View decorView = getWindow().getDecorView();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(decorView, "getDecorView(...)");
        decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 1024 | 256);
        getWindow().setStatusBarColor(0);
        mo78514x143f1b92().W0(this, getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a9e));
        com.p314xaae8f345.mm.ui.r0.a(this, false);
        p012xc85e97e9.p016x746ad0e3.app.b mo2533x106ab264 = mo2533x106ab264();
        if (mo2533x106ab264 != null) {
            mo2533x106ab264.w(new android.graphics.drawable.ColorDrawable(0));
            mo2533x106ab264.o();
        }
        int h17 = com.p314xaae8f345.mm.ui.bl.h(this);
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) findViewById(com.p314xaae8f345.mm.R.id.ggn);
        viewGroup.setPadding(0, h17, 0, 0);
        com.p314xaae8f345.mm.ui.a4.g(viewGroup, true);
        g7();
        d7().f516211n.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.zi(this));
        mo78514x143f1b92().O0(true);
        d7().f516198a.setBackgroundColor(-16777216);
        mo78578x8b18f126(-16777216);
        ((android.view.ViewGroup) findViewById(com.p314xaae8f345.mm.R.id.m67)).setBackgroundColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560693rk));
        com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 c22801x87cbdc002 = this.f191040v;
        if (c22801x87cbdc002 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rlLayout");
            throw null;
        }
        android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(mo55332x76847179()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.bs8, (android.view.ViewGroup) null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "inflate(...)");
        c22801x87cbdc002.m82697xe136b7d8(inflate);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) findViewById(com.p314xaae8f345.mm.R.id.f564848aa4);
        if (c22699x3dcdb352 != null) {
            c22699x3dcdb352.m82040x7541828(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560785u4));
        }
        android.view.View findViewById3 = findViewById(com.p314xaae8f345.mm.R.id.g8o);
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(0);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(findViewById3, arrayList3.toArray(), "com/tencent/mm/plugin/finder/feed/ui/FinderProfileTimeLineUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(findViewById3, "com/tencent/mm/plugin/finder/feed/ui/FinderProfileTimeLineUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById3.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.cj(this));
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.gg ggVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.gg) pf5.z.f435481a.a(this).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.gg.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.kr krVar2 = this.f191039u;
        if (krVar2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("presenter");
            throw null;
        }
        ggVar.f216045n = krVar2.m();
        ggVar.U6(getIntent().getExtras());
    }

    @Override // com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f
    /* renamed from: isHideStatusBar */
    public boolean getP() {
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onBackPressed() {
        e7();
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(android.content.res.Configuration newConfig) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        g7();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15086x1d5b7f69, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        byte[] byteArrayExtra;
        super.onCreate(bundle);
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        iy1.c cVar = iy1.c.FinderProfileTimelineUI;
        ((cy1.a) rVar).ak(this, cVar);
        this.A = getIntent().getStringExtra("finder_username");
        boolean z17 = false;
        this.B = getIntent().getBooleanExtra("KEY_FINDER_SELF_FLAG", false);
        this.C = getIntent().getLongExtra("KEY_FROM_TOPIC_ID", 0L);
        this.F = getIntent().getBooleanExtra("key_from_profile_search", false);
        this.G = getIntent().getBooleanExtra("key_from_biz_photo", false);
        this.H = getIntent().getLongExtra("feed_encrypted_object_id", 0L);
        java.lang.String stringExtra = getIntent().getStringExtra("feed_object_nonceId");
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.I = stringExtra;
        this.f191037J = getIntent().getIntExtra("key_reuqest_scene", 0);
        this.K = getIntent().getStringExtra("key_session_id");
        r45.a34 a34Var = new r45.a34();
        a34Var.set(0, java.lang.Integer.valueOf(getIntent().getIntExtra("KEY_JSAPI_SOURCE_TYPE", 0)));
        java.lang.String stringExtra2 = getIntent().getStringExtra("KEY_JSAPI_SOURCE_BUFFER");
        if (stringExtra2 != null) {
            a34Var.set(1, stringExtra2);
        }
        this.L = a34Var;
        java.lang.String stringExtra3 = getIntent().getStringExtra("feed_encrypted_object_id");
        this.M = stringExtra3 != null ? stringExtra3 : "";
        if (getIntent().hasExtra("KEY_REQUEST_BACK_DATA")) {
            this.D = java.lang.Boolean.valueOf(getIntent().getBooleanExtra("KEY_REQUEST_BACK_DATA", false));
        }
        if (getIntent().hasExtra("key_profile_promotion_ads_info") && (byteArrayExtra = getIntent().getByteArrayExtra("key_profile_promotion_ads_info")) != null) {
            r45.q13 q13Var = new r45.q13();
            this.N = q13Var;
            q13Var.mo11468x92b714fd(byteArrayExtra);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f191038t, "username " + this.A + ", selfFlag " + this.B + ", topicId " + this.C + ", needBackData " + this.D);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.A)) {
            finish();
            return;
        }
        java.lang.String str = this.A;
        if (str != null) {
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = mo55332x76847179();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo55332x76847179, "getContext(...)");
            z17 = str.equals(xy2.c.e(mo55332x76847179));
        }
        if (z17) {
            boolean z18 = this.B;
        }
        mo43517x10010bd5();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.xr xrVar = this.f191044z;
        if (xrVar != null) {
            xrVar.m56677x4905e9fa().i(this.Q);
        }
        d7().f516204g.setBackground(null);
        if (getIntent().hasExtra("key_extra_info")) {
            long longExtra = getIntent().getLongExtra("KEY_FINDER_FEEDID", 0L);
            java.lang.String stringExtra4 = getIntent().getStringExtra("KEY_FINDER_FEED_DUP_FLAG");
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x768471792 = mo55332x76847179();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo55332x768471792, "getContext(...)");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = mo55332x768471792 instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a(mo55332x768471792).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class) : null;
            if (nyVar != null) {
                nyVar.t7(longExtra, stringExtra4, this.A);
            }
        }
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ak(this, cVar);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Rj(this, iy1.a.Finder);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).dk(this, getClass().getSimpleName());
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ik(this, 40, 24184);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ai(this, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ej(this));
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.xr xrVar2 = this.f191044z;
        if (xrVar2 != null) {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 m56677x4905e9fa = xrVar2.m56677x4905e9fa();
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = m56677x4905e9fa.getLayoutManager();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1671x31c90fad.C15415x74224fd8 c15415x74224fd8 = layoutManager instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1671x31c90fad.C15415x74224fd8 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1671x31c90fad.C15415x74224fd8) layoutManager : null;
            if (c15415x74224fd8 == null) {
                return;
            }
            m56677x4905e9fa.post(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.wi(this, c15415x74224fd8, m56677x4905e9fa));
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.xr xrVar = this.f191044z;
        if (xrVar != null) {
            xrVar.m56677x4905e9fa().V0(this.Q);
        }
        super.onDestroy();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.xr xrVar2 = this.f191044z;
        if (xrVar2 != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.kr krVar = xrVar2.f192630f;
            krVar.m().m56401x31d4943c(xrVar2.f192634m);
            krVar.mo979x3f5eee52();
            xrVar2.m56677x4905e9fa().mo7960x6cab2c8d(null);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        super.onPause();
        i95.m c17 = i95.n0.c(zy2.zb.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        zy2.zb zbVar = (zy2.zb) c17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.xr xrVar = this.f191044z;
        zy2.zb.Kh(zbVar, xrVar != null ? xrVar.m56677x4905e9fa() : null, ml2.x1.f409735f, "1", ml2.y.f409774f, 0, 0L, 0, 112, null);
        r30.p pVar = (r30.p) i95.n0.c(r30.p.class);
        java.lang.String Ri = ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Ri();
        java.lang.String simpleName = getClass().getSimpleName();
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        int i17 = r30.p.f450482f1;
        long j17 = currentTimeMillis - r30.o.f450480a;
        long j18 = r30.o.f450480a;
        long currentTimeMillis2 = java.lang.System.currentTimeMillis();
        ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
        java.lang.String d17 = b52.b.d();
        ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
        java.lang.String e17 = v52.c.g().e();
        p52.d[] dVarArr = p52.d.f433540d;
        ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
        java.lang.String b17 = b52.b.b();
        java.lang.String str = r30.m.f450479a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(b17);
        ((q30.k) pVar).wi(new q52.e(Ri, simpleName, j17, j18, currentTimeMillis2, d17, e17, 0, false, str, null, b17, false, 0, false, 0, 0, null, 259328, null));
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.xr xrVar2 = this.f191044z;
        if (xrVar2 != null) {
            xrVar2.f192630f.D.getClass();
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.kr krVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.xr xrVar;
        super.onResume();
        kk.l lVar = so2.f0.f491867a;
        java.lang.String str = this.A;
        if (str == null) {
            str = "";
        }
        so2.f0.f491868b = str;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.xr xrVar2 = this.f191044z;
        if (xrVar2 != null && (xrVar = (krVar = xrVar2.f192630f).f188780x) != null) {
            xrVar.m56677x4905e9fa().post(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.br(krVar));
        }
        i95.m c17 = i95.n0.c(zy2.zb.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        zy2.zb zbVar = (zy2.zb) c17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.xr xrVar3 = this.f191044z;
        zy2.zb.Kh(zbVar, xrVar3 != null ? xrVar3.m56677x4905e9fa() : null, ml2.x1.f409735f, "1", ml2.y.f409773e, 0, 0L, 0, 112, null);
        int i17 = r30.p.f450482f1;
        r30.o.f450480a = java.lang.System.currentTimeMillis();
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f191038t, "errType " + i17 + ", errCode " + i18 + ", errMsg " + str);
    }
}

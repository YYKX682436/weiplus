package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.ui;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tencent/mm/plugin/finder/member/ui/FinderMemberTimelineUI;", "Lcom/tencent/mm/plugin/finder/feed/ui/FinderLoaderFeedUI;", "Lcom/tencent/mm/plugin/finder/feed/model/FinderMemberTimelineLoader;", "Lcom/tencent/mm/plugin/finder/feed/hm;", "Lcom/tencent/mm/plugin/finder/feed/em;", "<init>", "()V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
@ul5.d(m168215x6ac9171 = 0)
/* renamed from: com.tencent.mm.plugin.finder.member.ui.FinderMemberTimelineUI */
/* loaded from: classes2.dex */
public final class ActivityC14488x37b59d35 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.AbstractActivityC14050x88d1020b<com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13876xef737654, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.hm, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.em> {
    public android.view.View A;
    public int F;
    public int G;
    public int H;

    /* renamed from: J, reason: collision with root package name */
    public int f202949J;

    /* renamed from: x, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.em f202950x;

    /* renamed from: y, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.hm f202951y;

    /* renamed from: z, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13876xef737654 f202952z;
    public final int B = 2;
    public java.lang.String C = "";
    public java.lang.String D = "";
    public int E = -1;
    public java.lang.String I = "";
    public int K = -1;
    public final lo2.q0 L = new lo2.q0(this);

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa
    /* renamed from: W6 */
    public int getD() {
        if (this.E == -1) {
            this.E = getIntent().getIntExtra("key_finder_member_visitor_status", 0);
        }
        if (this.K == -1) {
            this.K = getIntent().getIntExtra("key_finder_member_feed_type", 0);
        }
        if (this.E != 0) {
            return this.K == 1 ? 257 : 256;
        }
        if (this.K == 1) {
            return com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.EnumC4451x33e61cdb.f18263x2b3a4fa4;
        }
        return 258;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa
    public int Y6() {
        return 2;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.AbstractActivityC14050x88d1020b
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.AbstractC13834x56f46d28 d7() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13876xef737654 c13876xef737654 = this.f202952z;
        if (c13876xef737654 != null) {
            return c13876xef737654;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("feedLoader");
        throw null;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.AbstractActivityC14050x88d1020b
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.dj e7() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.em emVar = this.f202950x;
        if (emVar != null) {
            return emVar;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("presenter");
        throw null;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.AbstractActivityC14050x88d1020b
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.gj g7() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.hm hmVar = this.f202951y;
        if (hmVar != null) {
            return hmVar;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewCallback");
        throw null;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.b2z;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.AbstractActivityC14050x88d1020b
    public void h7() {
        java.util.ArrayList arrayList;
        java.util.ArrayList<so2.j5> arrayList2;
        getWindow().addFlags(8192);
        java.lang.String stringExtra = getIntent().getStringExtra("key_author_finder_name");
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.C = stringExtra;
        java.lang.String stringExtra2 = getIntent().getStringExtra("key_finder_member_ticket");
        if (stringExtra2 == null) {
            stringExtra2 = "";
        }
        this.D = stringExtra2;
        this.E = getIntent().getIntExtra("key_finder_member_visitor_status", 0);
        this.K = getIntent().getIntExtra("key_finder_member_feed_type", 0);
        this.F = getIntent().getIntExtra("key_member_price", 0);
        this.G = getIntent().getIntExtra("key_member_subscribe_price", 0);
        this.H = getIntent().getIntExtra("key_enable_member_subscribe", 0);
        java.lang.String stringExtra3 = getIntent().getStringExtra("key_member_title");
        if (stringExtra3 == null) {
            stringExtra3 = "";
        }
        this.I = stringExtra3;
        int intExtra = getIntent().getIntExtra("key_remain_feed_count", 0);
        this.f202949J = getIntent().getIntExtra("key_member_preview_mode", 0);
        mo54450xbf7c1df6("");
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.f565762dg3);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.A = findViewById;
        if (this.C.length() == 0) {
            finish();
            return;
        }
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = mo55332x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo55332x76847179, "getContext(...)");
        pf5.z zVar = pf5.z.f435481a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.p1567xed08e3c8.k kVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.p1567xed08e3c8.k) zVar.a(mo55332x76847179).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.p1567xed08e3c8.k.class);
        java.lang.String username = this.C;
        int i17 = this.F;
        int i18 = this.G;
        int i19 = this.H;
        java.lang.String title = this.I;
        int i27 = this.K;
        int i28 = this.f202949J;
        kVar.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(title, "title");
        kVar.f202776h = username;
        android.app.Activity context = kVar.m80379x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = context instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class) : null;
        kVar.f202775g = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.ha0(nyVar != null ? nyVar.f216913n : -1, null, false, kVar.f202776h, 6, null);
        kVar.f202777i = i17;
        kVar.f202778m = i18;
        kVar.f202779n = i19;
        kVar.f202784s = i28;
        kVar.f202780o = title;
        kVar.f202781p = ya2.h.f542017a.b(kVar.f202776h);
        kVar.f202782q = i27;
        kVar.f202783r = intExtra;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.em emVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.em(this, this.B, this.C, this.E, this.K);
        this.f202950x = emVar;
        this.f202951y = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.hm(this, emVar, this.B, getD());
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13876xef737654 c13876xef737654 = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13876xef737654(((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) zVar.a(this).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class)).V6(), this.C, this.D, this.K);
        c13876xef737654.m56361x5fd54ec8(getIntent());
        if (this.E == 0 && c13876xef737654.m56356xb1ee36ee() == 0) {
            pm0.v.X(new lo2.r0(this));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.r9 m56353x743e55cc = c13876xef737654.m56353x743e55cc();
        if (m56353x743e55cc != null && (arrayList2 = m56353x743e55cc.f189833a) != null) {
            for (so2.j5 j5Var : arrayList2) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(j5Var, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.model.BaseFinderFeed");
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) j5Var;
                if (abstractC14490x69736cb5.h() != -18) {
                    i95.m c17 = i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) c17).rk(abstractC14490x69736cb5.getFeedObject().getFeedObject(), getD(), null);
                } else {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.hm hmVar = this.f202951y;
                    if (hmVar == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewCallback");
                        throw null;
                    }
                    hmVar.f188462s = true;
                }
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.r9 m56353x743e55cc2 = c13876xef737654.m56353x743e55cc();
        if (m56353x743e55cc2 != null && (arrayList = m56353x743e55cc2.f189833a) != null) {
            kz5.h0.B(arrayList, lo2.n0.f401691d);
        }
        c13876xef737654.m56375x868b9334(new lo2.o0(this, c13876xef737654));
        c13876xef737654.f189056g = new lo2.p0(this);
        this.f202952z = c13876xef737654;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.r9 m56353x743e55cc3 = c13876xef737654.m56353x743e55cc();
        java.util.ArrayList arrayList3 = m56353x743e55cc3 != null ? m56353x743e55cc3.f189833a : null;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.hm hmVar2 = this.f202951y;
        if (hmVar2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewCallback");
            throw null;
        }
        if (hmVar2.f188462s || intExtra <= 0 || this.E != 0 || arrayList3 == null) {
            return;
        }
        arrayList3.add(new jo2.c(this.C, this.I, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079(), this.K));
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.hm hmVar3 = this.f202951y;
        if (hmVar3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewCallback");
            throw null;
        }
        hmVar3.f188462s = true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.AbstractActivityC14050x88d1020b
    public boolean i7() {
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.AbstractActivityC14050x88d1020b, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.p2688xb5e90917.ActivityC22284xa3359eae, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8
    /* renamed from: importUIComponents */
    public java.util.Set mo43419xa59964ef() {
        java.util.HashSet Q0 = kz5.n0.Q0(super.mo43419xa59964ef());
        Q0.add(eo2.b.class);
        Q0.add(go2.a1.class);
        Q0.add(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.p1567xed08e3c8.k.class);
        return Q0;
    }
}

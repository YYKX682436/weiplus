package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/FinderInteractionSearchUI;", "Lcom/tencent/mm/plugin/finder/ui/MMFinderUI;", "<init>", "()V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderInteractionSearchUI */
/* loaded from: classes2.dex */
public final class ActivityC13974xf3622848 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa {

    /* renamed from: y, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.a6 f190839y;

    /* renamed from: z, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.p6 f190840z;

    /* renamed from: t, reason: collision with root package name */
    public final java.util.ArrayList f190834t = new java.util.ArrayList();

    /* renamed from: u, reason: collision with root package name */
    public int f190835u = 2;

    /* renamed from: v, reason: collision with root package name */
    public int f190836v = -1;

    /* renamed from: w, reason: collision with root package name */
    public int f190837w = -1;

    /* renamed from: x, reason: collision with root package name */
    public int f190838x = -1;
    public final jz5.g A = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.u5(this));
    public boolean B = true;

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa
    /* renamed from: W6 */
    public int getD() {
        return getIntent().getIntExtra("KEY_SCENE", 2) == 2 ? com.p314xaae8f345.p3006xb8ff1437.api.C26181xd678f817.f50673x992affbf : com.p314xaae8f345.p3006xb8ff1437.api.C26181xd678f817.f50613xc9bdf6cd;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void finish() {
        super.finish();
        overridePendingTransition(com.p314xaae8f345.mm.R.C30854x2dc211.f559261p, com.p314xaae8f345.mm.R.C30854x2dc211.f559261p);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.akk;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar;
        fc2.o Z6;
        super.onCreate(bundle);
        overridePendingTransition(com.p314xaae8f345.mm.R.C30854x2dc211.f559261p, com.p314xaae8f345.mm.R.C30854x2dc211.f559261p);
        this.f190835u = getIntent().getIntExtra("KEY_SCENE", 2);
        this.f190836v = getIntent().getIntExtra("KEY_MIX_SEARCH_TAB_TYPE", -1);
        int i17 = 7;
        int intExtra = getIntent().getIntExtra("KEY_MIX_SEARCH_CUR_TAB", 7);
        this.f190837w = intExtra;
        if (intExtra == 7) {
            i17 = getIntent().getIntExtra("KEY_MIX_SEARCH_MIX_SUB_TAB", 7);
        } else if (intExtra == 8) {
            i17 = getIntent().getIntExtra("KEY_MIX_SEARCH_HISTORY_SUB_TAB", 7);
        }
        this.f190838x = i17;
        java.util.ArrayList parcelableArrayListExtra = getIntent().getParcelableArrayListExtra("KEY_TOPIC_LIST");
        if (parcelableArrayListExtra == null) {
            parcelableArrayListExtra = new java.util.ArrayList();
        }
        java.util.ArrayList arrayList = this.f190834t;
        arrayList.clear();
        java.util.Iterator it = parcelableArrayListExtra.iterator();
        while (it.hasNext()) {
            r45.r03 r03Var = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13878x16d00f4e) it.next()).f189064d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r03Var, "getTopicInfo(...)");
            arrayList.add(new so2.e5(r03Var, 2));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.a6 a6Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.a6(this, arrayList, this.f190835u, this.f190836v, this.f190837w, this.f190838x);
        this.f190839y = a6Var;
        vb2.p pVar = (vb2.p) ((jz5.n) this.A).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(pVar, "<get-uiBinding>(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.p6 p6Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.p6(this, a6Var, pVar, this.f190835u);
        this.f190840z = p6Var;
        final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.a6 a6Var2 = this.f190839y;
        if (a6Var2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("presenter");
            throw null;
        }
        a6Var2.f191189m = p6Var;
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5468xcc4031b7> abstractC20980x9b9ad01d = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5468xcc4031b7>(a0Var) { // from class: com.tencent.mm.plugin.finder.feed.ui.FinderInteractionSearchUIContract$Presenter$onAttach$1
            {
                this.f39173x3fe91575 = 169359783;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5468xcc4031b7 c5468xcc4031b7) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5468xcc4031b7 event = c5468xcc4031b7;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                java.util.ArrayList arrayList2 = event.f135806g.f87973a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(arrayList2, "null cannot be cast to non-null type java.util.ArrayList<com.tencent.mm.protocal.protobuf.FinderTopicInfo>{ kotlin.collections.TypeAliasesKt.ArrayList<com.tencent.mm.protocal.protobuf.FinderTopicInfo> }");
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.a6 a6Var3 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.a6.this;
                a6Var3.f191184e.clear();
                java.util.Iterator it6 = arrayList2.iterator();
                while (it6.hasNext()) {
                    a6Var3.f191184e.add(new so2.e5((r45.r03) it6.next(), 2));
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.p6 p6Var2 = a6Var3.f191189m;
                if (p6Var2 != null) {
                    pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.l6(p6Var2));
                    java.util.ArrayList arrayList3 = p6Var2.f191932e.f191184e;
                    org.json.JSONObject jSONObject = new org.json.JSONObject();
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                    java.util.Iterator it7 = arrayList3.iterator();
                    while (true) {
                        if (!it7.hasNext()) {
                            break;
                        }
                        java.lang.String m75945x2fec8307 = ((so2.e5) it7.next()).f491863d.m75945x2fec8307(0);
                        if (m75945x2fec8307 == null) {
                            m75945x2fec8307 = "";
                        }
                        sb6.append(m75945x2fec8307);
                        sb6.append(";");
                    }
                    if (sb6.length() > 0) {
                        sb6.deleteCharAt(sb6.length() - 1);
                    }
                    jSONObject.put("tag", java.lang.String.valueOf(sb6));
                    i95.m c17 = i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3 o3Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) c17;
                    java.lang.String jSONObject2 = jSONObject.toString();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
                    com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f context = p6Var2.f191931d;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a(context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class);
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.ij(o3Var, 0, "fav_tag", jSONObject2, nyVar2 != null ? nyVar2.V6() : null, null, 16, null);
                }
                return true;
            }
        };
        a6Var2.f191198v = abstractC20980x9b9ad01d;
        abstractC20980x9b9ad01d.mo48813x58998cd();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.p6 p6Var2 = this.f190840z;
        if (p6Var2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewCallback");
            throw null;
        }
        com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f activityC21401x6ce6f73f = p6Var2.f191931d;
        com.p314xaae8f345.mm.ui.p2736xc9fa65a8.C22482x50bddb92 c22482x50bddb92 = new com.p314xaae8f345.mm.ui.p2736xc9fa65a8.C22482x50bddb92((android.content.Context) activityC21401x6ce6f73f, false);
        p6Var2.f191941q = c22482x50bddb92;
        c22482x50bddb92.m81002xcd6a5043(p6Var2);
        com.p314xaae8f345.mm.ui.p2736xc9fa65a8.C22482x50bddb92 c22482x50bddb922 = p6Var2.f191941q;
        if (c22482x50bddb922 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("searchView");
            throw null;
        }
        c22482x50bddb922.m80997xdc5215a6().m80989x764b0e09(activityC21401x6ce6f73f.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572949d10));
        com.p314xaae8f345.mm.ui.p2736xc9fa65a8.C22482x50bddb92 c22482x50bddb923 = p6Var2.f191941q;
        if (c22482x50bddb923 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("searchView");
            throw null;
        }
        c22482x50bddb923.m80997xdc5215a6().m80988xce28f7ee(p6Var2);
        com.p314xaae8f345.mm.ui.p2736xc9fa65a8.C22482x50bddb92 c22482x50bddb924 = p6Var2.f191941q;
        if (c22482x50bddb924 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("searchView");
            throw null;
        }
        c22482x50bddb924.m80997xdc5215a6().m80980x55355581(true);
        com.p314xaae8f345.mm.ui.p2736xc9fa65a8.C22482x50bddb92 c22482x50bddb925 = p6Var2.f191941q;
        if (c22482x50bddb925 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("searchView");
            throw null;
        }
        c22482x50bddb925.m80997xdc5215a6().m();
        com.p314xaae8f345.mm.ui.p2736xc9fa65a8.C22482x50bddb92 c22482x50bddb926 = p6Var2.f191941q;
        if (c22482x50bddb926 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("searchView");
            throw null;
        }
        c22482x50bddb926.m80997xdc5215a6().t();
        com.p314xaae8f345.mm.ui.p2736xc9fa65a8.C22482x50bddb92 c22482x50bddb927 = p6Var2.f191941q;
        if (c22482x50bddb927 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("searchView");
            throw null;
        }
        c22482x50bddb927.m80997xdc5215a6().g();
        com.p314xaae8f345.mm.ui.p2736xc9fa65a8.C22482x50bddb92 c22482x50bddb928 = p6Var2.f191941q;
        if (c22482x50bddb928 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("searchView");
            throw null;
        }
        android.widget.TextView textView = (android.widget.TextView) c22482x50bddb928.m80997xdc5215a6().m80976x4d774800().findViewById(com.p314xaae8f345.mm.R.id.nvv);
        android.view.ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.rightMargin = activityC21401x6ce6f73f.getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.f561271dv);
        textView.setLayoutParams(marginLayoutParams);
        p012xc85e97e9.p016x746ad0e3.app.b mo2533x106ab264 = activityC21401x6ce6f73f.mo2533x106ab264();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mo2533x106ab264);
        com.p314xaae8f345.mm.ui.p2736xc9fa65a8.C22482x50bddb92 c22482x50bddb929 = p6Var2.f191941q;
        if (c22482x50bddb929 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("searchView");
            throw null;
        }
        mo2533x106ab264.y(c22482x50bddb929);
        jz5.g gVar = p6Var2.f191935h;
        ((com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25) ((jz5.n) gVar).mo141623x754a37bb()).N(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.v5(activityC21401x6ce6f73f, 0, 2, null));
        ((com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25) ((jz5.n) gVar).mo141623x754a37bb()).mo7967x900dcbe1(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1456x30012e.C13830x9baef275());
        in5.s sVar = new in5.s() { // from class: com.tencent.mm.plugin.finder.feed.ui.FinderInteractionSearchUIContract$ViewCallback$buildTopicItemConverts$1
            @Override // in5.s
            /* renamed from: getItemConvert */
            public in5.r mo43555xf2bb75ea(int type) {
                return type != 1 ? type != 2 ? new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.z2() : new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.a3() : new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.gx();
            }
        };
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.a6 a6Var3 = p6Var2.f191932e;
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf = new com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf(sVar, a6Var3.f191184e, false);
        c22848x6ddd90cf.f374638o = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.h6(p6Var2);
        ((com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25) ((jz5.n) gVar).mo141623x754a37bb()).mo7960x6cab2c8d(c22848x6ddd90cf);
        if (p6Var2.j()) {
            p6Var2.g().setVisibility(0);
        } else {
            p6Var2.g().setVisibility(8);
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 m56636x4905e9fa = p6Var2.m56636x4905e9fa();
        if (m56636x4905e9fa != null) {
            m56636x4905e9fa.mo7967x900dcbe1(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1671x31c90fad.C15416x1f1f78b7(2, 1));
        }
        p6Var2.f191942r = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.d6(p6Var2, p6Var2.f191943s.b(null), a6Var3.f191196t);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 m56636x4905e9fa2 = p6Var2.m56636x4905e9fa();
        if (m56636x4905e9fa2 != null) {
            m56636x4905e9fa2.N(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.ij0());
        }
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf2 = p6Var2.f191942r;
        if (c22848x6ddd90cf2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("adapter");
            throw null;
        }
        c22848x6ddd90cf2.f374638o = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.e6(p6Var2);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 m56636x4905e9fa3 = p6Var2.m56636x4905e9fa();
        if (m56636x4905e9fa3 != null) {
            com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf3 = p6Var2.f191942r;
            if (c22848x6ddd90cf3 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("adapter");
                throw null;
            }
            m56636x4905e9fa3.mo7960x6cab2c8d(c22848x6ddd90cf3);
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 m56636x4905e9fa4 = p6Var2.m56636x4905e9fa();
        if (m56636x4905e9fa4 != null) {
            ym5.a1.g(m56636x4905e9fa4, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.f6(p6Var2));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1674xc086f2ae.C15430xb1d1f629 c15430xb1d1f629 = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1674xc086f2ae.C15430xb1d1f629(activityC21401x6ce6f73f, null);
        c15430xb1d1f629.j(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570760bs5);
        p6Var2.a().D(c15430xb1d1f629);
        p6Var2.a().m82945xba09cf09(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.g6(p6Var2));
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 m56636x4905e9fa5 = p6Var2.m56636x4905e9fa();
        if (m56636x4905e9fa5 == null || (nyVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a(activityC21401x6ce6f73f).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class)) == null || (Z6 = nyVar.Z6(-1)) == null) {
            return;
        }
        Z6.d(m56636x4905e9fa5);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.a6 a6Var = this.f190839y;
        if (a6Var != null) {
            a6Var.mo979x3f5eee52();
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("presenter");
            throw null;
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        if (this.B) {
            this.B = false;
        } else {
            mo48674x36654fab();
        }
    }
}

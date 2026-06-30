package com.tencent.mm.plugin.finder.activity.uic;

/* loaded from: classes2.dex */
public class FinderActivityTabUIC extends x92.m {
    public final com.tencent.mm.plugin.finder.activity.uic.FinderActivityTabUIC$finderTopicInfoListener$1 A;
    public boolean B;
    public final ra2.a C;
    public final jz5.g D;
    public final jz5.g E;

    /* renamed from: y, reason: collision with root package name */
    public r45.r03 f101829y;

    /* renamed from: z, reason: collision with root package name */
    public androidx.fragment.app.Fragment f101830z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v1, types: [com.tencent.mm.plugin.finder.activity.uic.FinderActivityTabUIC$finderTopicInfoListener$1] */
    public FinderActivityTabUIC(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.A = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.FinderTopicEvent>(a0Var) { // from class: com.tencent.mm.plugin.finder.activity.uic.FinderActivityTabUIC$finderTopicInfoListener$1
            {
                this.__eventId = 1705444769;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.FinderTopicEvent finderTopicEvent) {
                com.tencent.mm.autogen.events.FinderTopicEvent event = finderTopicEvent;
                kotlin.jvm.internal.o.g(event, "event");
                am.od odVar = event.f54335g;
                if (odVar != null && odVar.f7523a == 7) {
                    int i17 = odVar != null ? odVar.f7524b : -1;
                    java.lang.String str = odVar != null ? odVar.f7525c : null;
                    if (str == null) {
                        str = "";
                    }
                    com.tencent.mars.xlog.Log.i("FinderActivityTabUIC", "FinderTopicEvent: errCode=" + i17 + " errMsg=" + str);
                    if (i17 != 0) {
                        com.tencent.mm.plugin.finder.activity.uic.FinderActivityTabUIC.this.C7(i17, str);
                    }
                }
                return true;
            }
        };
        this.C = new ra2.a(0, 1, null);
        this.D = jz5.h.b(com.tencent.mm.plugin.finder.activity.uic.j1.f101900d);
        this.E = jz5.h.b(new com.tencent.mm.plugin.finder.activity.uic.k1(this));
    }

    @Override // x92.m
    public boolean A7(int i17) {
        return i17 == -4063 || i17 == -4058 || i17 == -4056;
    }

    @Override // x92.m
    public void D7() {
        r45.r03 r03Var = (r45.r03) this.f452710v;
        if (r03Var != null) {
            this.f452711w = r03Var;
            E7(r03Var);
            Q7(r03Var);
        }
        this.f452710v = null;
    }

    @Override // x92.m
    public void G7() {
        long longExtra = getIntent().getLongExtra("key_activity_id", 0L);
        java.lang.String stringExtra = getIntent().getStringExtra("key_encrypted_topic_id");
        if (stringExtra == null) {
            stringExtra = "";
        }
        long longExtra2 = getIntent().getLongExtra("key_feed_id", 0L);
        if (longExtra == 0 && longExtra2 == 0) {
            if (stringExtra.length() == 0) {
                com.tencent.mars.xlog.Log.e("FinderActivityTabUIC", "topicId and refObjectId is zero");
                getContext().finish();
            }
        }
        pf5.e.launch$default(this, null, null, new com.tencent.mm.plugin.finder.activity.uic.p1(this, null), 3, null);
    }

    public com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment I7(r45.bo6 tagInfo) {
        kotlin.jvm.internal.o.g(tagInfo, "tagInfo");
        com.tencent.mm.plugin.finder.activity.fragment.FinderActivityFragment finderActivityFragment = new com.tencent.mm.plugin.finder.activity.fragment.FinderActivityFragment();
        finderActivityFragment.f129265p = tagInfo.getInteger(1) - 1;
        finderActivityFragment.f129266q = tagInfo.getString(0);
        finderActivityFragment.f101753u = tagInfo.getLong(2);
        java.lang.String string = tagInfo.getString(0);
        if (string == null) {
            string = "";
        }
        finderActivityFragment.f101754v = string;
        return finderActivityFragment;
    }

    public com.tencent.mm.plugin.finder.activity.fragment.FinderActivityFragment J7(com.tencent.mm.plugin.finder.activity.uic.i1 mediaTabInfo, java.util.LinkedList tags) {
        kotlin.jvm.internal.o.g(mediaTabInfo, "mediaTabInfo");
        kotlin.jvm.internal.o.g(tags, "tags");
        com.tencent.mm.plugin.finder.activity.topic.fragment.FinderActivityTabParentFragment finderActivityTabParentFragment = new com.tencent.mm.plugin.finder.activity.topic.fragment.FinderActivityTabParentFragment();
        finderActivityTabParentFragment.f101804w = mediaTabInfo;
        finderActivityTabParentFragment.f101805x = tags;
        finderActivityTabParentFragment.f101806y = this.C;
        return finderActivityTabParentFragment;
    }

    public w92.a K7(r45.bo6 tagInfo, boolean z17) {
        kotlin.jvm.internal.o.g(tagInfo, "tagInfo");
        java.lang.String string = tagInfo.getString(0);
        if (string == null) {
            string = "";
        }
        return new w92.a(-1, string, z17, N7(), 0, 16, null);
    }

    public boolean L7() {
        return !(this instanceof ea2.k0);
    }

    public y92.b M7() {
        long longExtra = getIntent().getLongExtra("key_activity_id", 0L);
        java.lang.String stringExtra = getIntent().getStringExtra("key_encrypted_topic_id");
        if (stringExtra == null) {
            stringExtra = "";
        }
        java.lang.String str = stringExtra;
        long longExtra2 = getIntent().getLongExtra("key_feed_id", 0L);
        return new y92.b(longExtra, str, java.lang.Long.valueOf(longExtra2), longExtra == 0 ? 1 : 0, null, 16, null);
    }

    public int N7() {
        return 7;
    }

    @Override // x92.m
    /* renamed from: O7, reason: merged with bridge method [inline-methods] */
    public r45.r03 B7() {
        long longExtra = getIntent().getLongExtra("key_activity_id", 0L);
        java.lang.String stringExtra = getIntent().getStringExtra("key_encrypted_topic_id");
        if (stringExtra == null) {
            stringExtra = "";
        }
        u92.b a17 = u92.a.a(u92.b.f425822e, longExtra, stringExtra, null, 4, null);
        if (a17 == null) {
            return null;
        }
        if (!a17.d()) {
            a17 = null;
        }
        if (a17 == null) {
            return null;
        }
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) a17.f36361b;
        r45.ma1 ma1Var = fVar != null ? (r45.ma1) fVar.f70618d : null;
        if (ma1Var != null) {
            return (r45.r03) ma1Var.getCustom(1);
        }
        return null;
    }

    public final void P7(java.util.LinkedList tags, final boolean z17) {
        androidx.viewpager.widget.ViewPager viewPager;
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView;
        kotlin.jvm.internal.o.g(tags, "tags");
        if (!((java.lang.Boolean) ((jz5.n) this.D).getValue()).booleanValue() || !L7()) {
            java.util.Iterator it = tags.iterator();
            while (it.hasNext()) {
                r45.bo6 bo6Var = (r45.bo6) it.next();
                com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment I7 = I7(bo6Var);
                if (this.f101830z == null) {
                    this.f101830z = I7;
                }
                com.tencent.mm.plugin.finder.viewmodel.component.FinderTabUIC.R6(this, K7(bo6Var, z17), I7, false, 4, null);
                java.lang.String string = bo6Var.getString(0);
                if (string == null) {
                    string = "";
                }
                F7(string, bo6Var.getInteger(1), 0);
            }
            r7();
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(tags, 10));
        java.util.Iterator it6 = tags.iterator();
        while (it6.hasNext()) {
            arrayList.add(new ra2.b((r45.bo6) it6.next(), this.C));
        }
        final java.util.ArrayList arrayList2 = new java.util.ArrayList(arrayList);
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.nvf);
        if (findViewById != null) {
            findViewById.setPadding(findViewById.getPaddingLeft(), getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479738dv), findViewById.getPaddingRight(), 0);
        }
        if (z17 && (wxRecyclerView = this.f133660i) != null) {
            wxRecyclerView.setBackground(getContext().getResources().getDrawable(com.tencent.mm.R.drawable.f481664zg));
        }
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView2 = this.f133660i;
        if (wxRecyclerView2 != null) {
            wxRecyclerView2.setVisibility(0);
            wxRecyclerView2.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(getContext(), 0, false));
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = new com.tencent.mm.view.recyclerview.WxRecyclerAdapter(new in5.s() { // from class: com.tencent.mm.plugin.finder.activity.uic.FinderActivityTabUIC$buildConvert$1
                @Override // in5.s
                public in5.r getItemConvert(int type) {
                    return new qa2.a(arrayList2, z17);
                }
            }, arrayList2, false);
            wxRecyclerAdapter.f293105o = new com.tencent.mm.plugin.finder.activity.uic.l1();
            wxRecyclerView2.setAdapter(wxRecyclerAdapter);
        }
        jz5.g gVar = this.E;
        for (com.tencent.mm.plugin.finder.activity.uic.i1 i1Var : (java.util.List) ((jz5.n) gVar).getValue()) {
            com.tencent.mm.plugin.finder.activity.fragment.FinderActivityFragment J7 = J7(i1Var, tags);
            if (this.f101830z == null) {
                this.f101830z = J7;
            }
            com.tencent.mm.plugin.finder.viewmodel.component.FinderTabUIC.R6(this, new com.tencent.mm.plugin.finder.activity.uic.m1(z17, i1Var.f101891a, N7()), J7, false, 4, null);
        }
        r7();
        int intExtra = getIntent().getIntExtra("KEY_ENTER_MEDIA_TAB_TYPE", 0);
        com.tencent.mars.xlog.Log.i("FinderActivityTabUIC", "onRequestTopicTabSuc() called enterMediaTab:" + intExtra);
        if (intExtra != 0) {
            int i17 = 0;
            for (java.lang.Object obj : (java.util.List) ((jz5.n) gVar).getValue()) {
                int i18 = i17 + 1;
                if (i17 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                if (((com.tencent.mm.plugin.finder.activity.uic.i1) obj).f101892b == intExtra && (viewPager = this.f133659h) != null) {
                    viewPager.setCurrentItem(i17, false);
                }
                i17 = i18;
            }
        }
    }

    public boolean Q7(r45.r03 topicInfo) {
        kotlin.jvm.internal.o.g(topicInfo, "topicInfo");
        this.f101829y = topicInfo;
        getIntent().putExtra("key_has_cover", a2());
        r45.e21 e21Var = (r45.e21) topicInfo.getCustom(16);
        if (e21Var == null) {
            return false;
        }
        z5();
        r45.q03 q03Var = (r45.q03) e21Var.getCustom(16);
        if (q03Var == null) {
            return false;
        }
        java.util.LinkedList list = q03Var.getList(0);
        kotlin.jvm.internal.o.f(list, "getList(...)");
        P7(list, !com.tencent.mm.sdk.platformtools.t8.K0(e21Var.getString(5)));
        return true;
    }

    @Override // com.tencent.mm.plugin.finder.viewmodel.component.FinderTabUIC
    public void V6() {
        if (!((java.lang.Boolean) ((jz5.n) this.D).getValue()).booleanValue()) {
            super.V6();
            return;
        }
        if (f7().isEmpty()) {
            com.tencent.mm.view.HardTouchableLayout h17 = c7().h();
            if (h17 == null) {
                return;
            }
            h17.setVisibility(8);
            return;
        }
        com.tencent.mm.view.HardTouchableLayout h18 = c7().h();
        if (h18 == null) {
            return;
        }
        h18.setVisibility(0);
    }

    @Override // x92.m, com.tencent.mm.plugin.finder.viewmodel.component.FinderTabUIC, com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        alive();
    }

    @Override // com.tencent.mm.plugin.finder.viewmodel.component.FinderTabUIC, com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        super.onDestroy();
        dead();
    }

    @Override // x92.m
    public int w7() {
        return com.tencent.mm.R.layout.adu;
    }

    @Override // x92.m
    public boolean y7() {
        r45.e21 e21Var;
        r45.r03 r03Var = (r45.r03) this.f452710v;
        return ((r03Var == null || (e21Var = (r45.e21) r03Var.getCustom(16)) == null) ? null : (r45.q03) e21Var.getCustom(16)) != null;
    }

    @Override // x92.m
    public void z7() {
        getIntent().getStringExtra("key_cover_url");
    }
}

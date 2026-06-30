package com.tencent.mm.plugin.finder.feed.ui;

@db5.a(32)
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/FinderLiveAnchorCommentManagerUI;", "Lcom/tencent/mm/plugin/finder/ui/MMLiveFinderUI;", "<init>", "()V", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
@ul5.d(0)
/* loaded from: classes3.dex */
public final class FinderLiveAnchorCommentManagerUI extends com.tencent.mm.plugin.finder.ui.MMLiveFinderUI {

    /* renamed from: J, reason: collision with root package name */
    public static final /* synthetic */ int f109322J = 0;
    public bm2.v1 A;
    public android.view.View B;
    public android.widget.ScrollView C;
    public android.view.View D;
    public com.tencent.mm.plugin.finder.live.widget.hp E;
    public long F;
    public long G;

    /* renamed from: y, reason: collision with root package name */
    public com.tencent.mm.ui.widget.imageview.WeImageView f109326y;

    /* renamed from: z, reason: collision with root package name */
    public androidx.recyclerview.widget.RecyclerView f109327z;

    /* renamed from: v, reason: collision with root package name */
    public final java.lang.String f109323v = "Finder.FinderLiveAnchorCommentManagerUI";

    /* renamed from: w, reason: collision with root package name */
    public int f109324w = 5;

    /* renamed from: x, reason: collision with root package name */
    public final java.util.LinkedList f109325x = new java.util.LinkedList();
    public final int H = 111;
    public final int I = 112;

    public static final void d7(com.tencent.mm.plugin.finder.feed.ui.FinderLiveAnchorCommentManagerUI finderLiveAnchorCommentManagerUI, int i17) {
        finderLiveAnchorCommentManagerUI.getClass();
        android.content.Intent intent = new android.content.Intent();
        if (i17 == finderLiveAnchorCommentManagerUI.H) {
            intent.setClassName(finderLiveAnchorCommentManagerUI.getContext(), "com.tencent.mm.ui.contact.SelectContactUI");
            intent.putExtra("list_type", 1);
            intent.putExtra("titile", finderLiveAnchorCommentManagerUI.getContext().getResources().getString(com.tencent.mm.R.string.ece));
            intent.putExtra("without_openim", true);
            com.tencent.mm.ui.contact.i5.e();
            intent.putExtra("list_attr", com.tencent.mm.ui.contact.i5.g(com.tencent.mm.ui.contact.i5.f206782c & (-16777217), 131072));
            bm2.v1 v1Var = finderLiveAnchorCommentManagerUI.A;
            if (v1Var == null) {
                kotlin.jvm.internal.o.o("adapter");
                throw null;
            }
            intent.putExtra("block_contact", com.tencent.mm.sdk.platformtools.t8.c1(v1Var.x(), ","));
            intent.putExtra("Forbid_SelectChatRoom", true);
            intent.putExtra("can_go_to_profile", true);
            intent.putExtra("too_many_member_tip_string", finderLiveAnchorCommentManagerUI.getContext().getResources().getString(com.tencent.mm.R.string.eab, java.lang.String.valueOf(finderLiveAnchorCommentManagerUI.f109324w)));
            int i18 = finderLiveAnchorCommentManagerUI.f109324w;
            bm2.v1 v1Var2 = finderLiveAnchorCommentManagerUI.A;
            if (v1Var2 == null) {
                kotlin.jvm.internal.o.o("adapter");
                throw null;
            }
            intent.putExtra("max_limit_num", i18 - ((java.util.ArrayList) v1Var2.x()).size());
        } else {
            intent.setClass(finderLiveAnchorCommentManagerUI.getContext(), com.tencent.mm.plugin.finder.feed.ui.FinderLiveDelManagerUI.class);
            r45.g72 g72Var = new r45.g72();
            g72Var.getList(0).addAll(finderLiveAnchorCommentManagerUI.f109325x);
            intent.putExtra("selectcontactitem", g72Var.toByteArray());
        }
        finderLiveAnchorCommentManagerUI.startActivityForResult(intent, i17);
    }

    public final java.util.LinkedList e7(java.lang.String str, java.lang.String str2) {
        r26.t tVar = new r26.t(str2);
        java.lang.String[] strArr = (java.lang.String[]) tVar.g(str, 0).toArray(new java.lang.String[0]);
        java.util.LinkedList linkedList = new java.util.LinkedList();
        for (java.lang.String str3 : strArr) {
            linkedList.add(str3);
        }
        return linkedList;
    }

    public final void f7() {
        pq5.g l17 = new ek2.i1(xy2.c.e(this), this.F, this.G).l();
        l17.K(new com.tencent.mm.plugin.finder.feed.ui.m7(this));
        l17.f(this);
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.alm;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        java.lang.String stringExtra;
        java.lang.String stringExtra2;
        super.onActivityResult(i17, i18, intent);
        if (i17 == this.H) {
            if (intent == null || (stringExtra2 = intent.getStringExtra("Select_Contact")) == null) {
                return;
            }
            if (stringExtra2.length() == 0) {
                return;
            }
            java.lang.String stringExtra3 = intent.getStringExtra("Select_Contact");
            java.util.LinkedList<java.lang.String> e76 = e7(stringExtra3 != null ? stringExtra3 : "", ",");
            java.lang.String e17 = xy2.c.e(this);
            long j17 = this.F;
            long j18 = this.G;
            r45.fe1 fe1Var = new r45.fe1();
            for (java.lang.String str : e76) {
                java.util.LinkedList list = fe1Var.getList(0);
                r45.l82 l82Var = new r45.l82();
                l82Var.set(0, str);
                l82Var.set(1, 1);
                list.add(l82Var);
            }
            pq5.g l17 = new ek2.s1(e17, j17, j18, 1, fe1Var, null, 32, null).l();
            l17.K(new com.tencent.mm.plugin.finder.feed.ui.i7(this));
            l17.f(this);
            return;
        }
        if (i17 != this.I || intent == null || (stringExtra = intent.getStringExtra("Select_Contact")) == null) {
            return;
        }
        if (stringExtra.length() == 0) {
            return;
        }
        java.lang.String stringExtra4 = intent.getStringExtra("Select_Contact");
        if (stringExtra4 == null) {
            stringExtra4 = "";
        }
        java.util.LinkedList<java.lang.String> e77 = e7(stringExtra4, ",");
        java.lang.String e18 = xy2.c.e(this);
        long j19 = this.F;
        long j27 = this.G;
        r45.g72 g72Var = new r45.g72();
        for (java.lang.String str2 : e77) {
            java.util.LinkedList list2 = g72Var.getList(0);
            r45.l82 l82Var2 = new r45.l82();
            l82Var2.set(0, str2);
            bm2.v1 v1Var = this.A;
            java.lang.Object obj = null;
            if (v1Var == null) {
                kotlin.jvm.internal.o.o("adapter");
                throw null;
            }
            java.lang.String string = l82Var2.getString(0);
            java.lang.String str3 = string == null ? "" : string;
            java.util.Iterator it = v1Var.f22374g.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                java.lang.Object next = it.next();
                if (kotlin.jvm.internal.o.b(((r45.ty1) next).getString(0), str3)) {
                    obj = next;
                    break;
                }
            }
            r45.ty1 ty1Var = (r45.ty1) obj;
            l82Var2.set(1, java.lang.Integer.valueOf(ty1Var != null ? ty1Var.getInteger(2) : 1));
            list2.add(l82Var2);
        }
        pq5.g l18 = new ek2.s1(e18, j19, j27, 2, null, g72Var, 16, null).l();
        l18.K(new com.tencent.mm.plugin.finder.feed.ui.j7(this));
        l18.f(this);
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMLiveFinderUI, com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        vj5.o.e(getWindow());
        supportRequestWindowFeature(1);
        super.onCreate(bundle);
        this.F = getIntent().getLongExtra("objectid", 0L);
        this.G = getIntent().getLongExtra("liveid", 0L);
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.c7j);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f109326y = (com.tencent.mm.ui.widget.imageview.WeImageView) findViewById;
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.c7k);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f109327z = (androidx.recyclerview.widget.RecyclerView) findViewById2;
        android.view.View findViewById3 = findViewById(com.tencent.mm.R.id.qhr);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.B = findViewById3;
        android.view.View findViewById4 = findViewById(com.tencent.mm.R.id.hiq);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        this.D = findViewById4;
        android.view.View findViewById5 = findViewById(com.tencent.mm.R.id.c7n);
        kotlin.jvm.internal.o.f(findViewById5, "findViewById(...)");
        this.C = (android.widget.ScrollView) findViewById5;
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = this.f109326y;
        if (weImageView == null) {
            kotlin.jvm.internal.o.o("closeBtn");
            throw null;
        }
        weImageView.setOnClickListener(new com.tencent.mm.plugin.finder.feed.ui.a7(this));
        bm2.v1 v1Var = new bm2.v1();
        this.A = v1Var;
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f109327z;
        if (recyclerView == null) {
            kotlin.jvm.internal.o.o("managerList");
            throw null;
        }
        recyclerView.setAdapter(v1Var);
        androidx.recyclerview.widget.GridLayoutManager gridLayoutManager = new androidx.recyclerview.widget.GridLayoutManager((android.content.Context) getContext(), 4, 1, false);
        androidx.recyclerview.widget.RecyclerView recyclerView2 = this.f109327z;
        if (recyclerView2 == null) {
            kotlin.jvm.internal.o.o("managerList");
            throw null;
        }
        recyclerView2.setLayoutManager(gridLayoutManager);
        androidx.appcompat.app.AppCompatActivity context = getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        com.tencent.mm.plugin.finder.live.widget.hp hpVar = new com.tencent.mm.plugin.finder.live.widget.hp(context, null, null, 6, null);
        this.E = hpVar;
        bm2.v1 v1Var2 = this.A;
        if (v1Var2 == null) {
            kotlin.jvm.internal.o.o("adapter");
            throw null;
        }
        v1Var2.f22371d = new com.tencent.mm.plugin.finder.feed.ui.b7(this);
        v1Var2.f22372e = new com.tencent.mm.plugin.finder.feed.ui.c7(this);
        v1Var2.f22373f = new com.tencent.mm.plugin.finder.feed.ui.d7(this);
        hpVar.K = new com.tencent.mm.plugin.finder.feed.ui.e7(this);
        hpVar.f118579J = com.tencent.mm.plugin.finder.feed.ui.f7.f110007d;
        hpVar.L = new com.tencent.mm.plugin.finder.feed.ui.g7(this);
        hpVar.N = new com.tencent.mm.plugin.finder.feed.ui.h7(this);
        hpVar.f0();
        if (isFragmentMode()) {
            android.view.View view = this.B;
            if (view == null) {
                kotlin.jvm.internal.o.o("avaterRoot");
                throw null;
            }
            android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
            if (marginLayoutParams != null) {
                marginLayoutParams.setMargins(0, 0, 0, 0);
            }
            view.setLayoutParams(layoutParams);
            androidx.recyclerview.widget.RecyclerView recyclerView3 = this.f109327z;
            if (recyclerView3 == null) {
                kotlin.jvm.internal.o.o("managerList");
                throw null;
            }
            android.view.ViewGroup.LayoutParams layoutParams2 = recyclerView3.getLayoutParams();
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams2 : null;
            if (marginLayoutParams2 != null) {
                marginLayoutParams2.setMargins(0, 48, 0, 0);
            }
            recyclerView3.setLayoutParams(layoutParams2);
            android.view.View view2 = this.D;
            if (view2 == null) {
                kotlin.jvm.internal.o.o("nameView");
                throw null;
            }
            android.view.ViewGroup.LayoutParams layoutParams3 = view2.getLayoutParams();
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams3 = layoutParams3 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams3 : null;
            if (marginLayoutParams3 != null) {
                marginLayoutParams3.setMargins(0, 5, 0, 0);
            }
            view2.setLayoutParams(layoutParams3);
            android.widget.ScrollView scrollView = this.C;
            if (scrollView == null) {
                kotlin.jvm.internal.o.o("scrollView");
                throw null;
            }
            scrollView.setOnTouchListener(com.tencent.mm.plugin.finder.feed.ui.z6.f110793d);
        }
        f7();
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMLiveFinderUI, com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        com.tencent.mm.plugin.finder.live.widget.hp hpVar = this.E;
        if (hpVar != null) {
            hpVar.g0();
        }
    }
}

package com.tencent.mm.plugin.finder.feed.ui;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/FinderLiveDelManagerUI;", "Lcom/tencent/mm/ui/MMActivity;", "<init>", "()V", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class FinderLiveDelManagerUI extends com.tencent.mm.ui.MMActivity {

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f109360m = 0;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.ui.widget.MMEditText f109362e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f109363f;

    /* renamed from: g, reason: collision with root package name */
    public androidx.recyclerview.widget.RecyclerView f109364g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.live.widget.hp f109365h;

    /* renamed from: d, reason: collision with root package name */
    public final bm2.m2 f109361d = new bm2.m2();

    /* renamed from: i, reason: collision with root package name */
    public final java.util.LinkedList f109366i = new java.util.LinkedList();

    public final void T6() {
        int size = ((java.util.ArrayList) this.f109361d.x()).size();
        if (size > 0) {
            enableOptionMenu(1, true);
            updateOptionMenuText(1, getString(com.tencent.mm.R.string.dc7, java.lang.Integer.valueOf(size)));
        } else {
            enableOptionMenu(1, false);
            updateOptionMenuText(1, getString(com.tencent.mm.R.string.dc6));
        }
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.f488880aq0;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        com.tencent.mm.protocal.protobuf.FinderContact finderContact;
        super.onCreate(bundle);
        this.f109362e = (com.tencent.mm.ui.widget.MMEditText) findViewById(com.tencent.mm.R.id.f484033cs2);
        this.f109363f = (android.widget.TextView) findViewById(com.tencent.mm.R.id.f484034cs3);
        this.f109364g = (androidx.recyclerview.widget.RecyclerView) findViewById(com.tencent.mm.R.id.cs8);
        addTextOptionMenu(1, getString(com.tencent.mm.R.string.dc6), new com.tencent.mm.plugin.finder.feed.ui.e9(this), null, com.tencent.mm.ui.fb.GREEN);
        setMMTitle(getString(com.tencent.mm.R.string.dc8));
        setBackBtn(new com.tencent.mm.plugin.finder.feed.ui.f9(this));
        enableOptionMenu(1, false);
        androidx.appcompat.app.AppCompatActivity context = getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        this.f109365h = new com.tencent.mm.plugin.finder.live.widget.hp(context, null, null, 6, null);
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f109364g;
        bm2.m2 m2Var = this.f109361d;
        if (recyclerView != null) {
            recyclerView.setAdapter(m2Var);
        }
        androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = new androidx.recyclerview.widget.LinearLayoutManager(this);
        androidx.recyclerview.widget.RecyclerView recyclerView2 = this.f109364g;
        if (recyclerView2 != null) {
            recyclerView2.setLayoutManager(linearLayoutManager);
        }
        m2Var.f22092f = new com.tencent.mm.plugin.finder.feed.ui.g9(this);
        m2Var.f22093g = new com.tencent.mm.plugin.finder.feed.ui.h9(this);
        m2Var.f22094h = new com.tencent.mm.plugin.finder.feed.ui.i9(this);
        com.tencent.mm.ui.widget.MMEditText mMEditText = this.f109362e;
        if (mMEditText != null) {
            mMEditText.addTextChangedListener(new com.tencent.mm.plugin.finder.feed.ui.j9(this));
        }
        com.tencent.mm.ui.widget.MMEditText mMEditText2 = this.f109362e;
        if (mMEditText2 != null) {
            mMEditText2.setOnFocusChangeListener(new com.tencent.mm.plugin.finder.feed.ui.k9(this));
        }
        com.tencent.mm.ui.widget.MMEditText mMEditText3 = this.f109362e;
        if (mMEditText3 != null) {
            mMEditText3.setOnEditorActionListener(new com.tencent.mm.plugin.finder.feed.ui.l9(this));
        }
        com.tencent.mm.plugin.finder.live.widget.hp hpVar = this.f109365h;
        if (hpVar != null) {
            hpVar.K = new com.tencent.mm.plugin.finder.feed.ui.m9(this);
        }
        if (hpVar != null) {
            hpVar.f118579J = com.tencent.mm.plugin.finder.feed.ui.b9.f109700d;
        }
        if (hpVar != null) {
            hpVar.L = new com.tencent.mm.plugin.finder.feed.ui.c9(this);
        }
        if (hpVar != null) {
            hpVar.N = new com.tencent.mm.plugin.finder.feed.ui.d9(this);
        }
        if (hpVar != null) {
            hpVar.f0();
        }
        byte[] byteArrayExtra = getIntent().getByteArrayExtra("selectcontactitem");
        if (byteArrayExtra != null) {
            r45.g72 g72Var = new r45.g72();
            g72Var.parseFrom(byteArrayExtra);
            java.util.LinkedList<r45.ty1> linkedList = new java.util.LinkedList();
            java.util.LinkedList<r45.l82> list = g72Var.getList(0);
            kotlin.jvm.internal.o.f(list, "getRoom_manager_list(...)");
            for (r45.l82 l82Var : list) {
                r45.ty1 ty1Var = new r45.ty1();
                ty1Var.set(0, l82Var.getString(0));
                ty1Var.set(2, java.lang.Integer.valueOf(l82Var.getInteger(1)));
                r45.xn1 xn1Var = (r45.xn1) l82Var.getCustom(2);
                java.lang.String str = null;
                ty1Var.set(4, (xn1Var == null || (finderContact = (com.tencent.mm.protocal.protobuf.FinderContact) xn1Var.getCustom(0)) == null) ? null : finderContact.getHeadUrl());
                r45.xn1 xn1Var2 = (r45.xn1) l82Var.getCustom(2);
                if (xn1Var2 != null) {
                    str = xn1Var2.getString(6);
                }
                ty1Var.set(1, str);
                linkedList.add(ty1Var);
            }
            java.util.LinkedList linkedList2 = this.f109366i;
            linkedList2.clear();
            linkedList2.addAll(g72Var.getList(0));
            m2Var.getClass();
            java.util.ArrayList arrayList = m2Var.f22091e;
            arrayList.clear();
            for (r45.ty1 ty1Var2 : linkedList) {
                arrayList.add(new bm2.l2(ty1Var2, false));
                m2Var.f22090d.add(new bm2.l2(ty1Var2, false));
            }
            m2Var.notifyDataSetChanged();
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        com.tencent.mm.plugin.finder.live.widget.hp hpVar = this.f109365h;
        if (hpVar != null) {
            hpVar.g0();
        }
    }
}

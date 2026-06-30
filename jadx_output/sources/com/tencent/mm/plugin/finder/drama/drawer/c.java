package com.tencent.mm.plugin.finder.drama.drawer;

/* loaded from: classes2.dex */
public final class c extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: d, reason: collision with root package name */
    public androidx.recyclerview.widget.RecyclerView f105201d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.ArrayList f105202e;

    /* renamed from: f, reason: collision with root package name */
    public int f105203f;

    /* renamed from: g, reason: collision with root package name */
    public long f105204g;

    /* renamed from: h, reason: collision with root package name */
    public long f105205h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f105206i;

    /* renamed from: m, reason: collision with root package name */
    public int f105207m;

    /* renamed from: n, reason: collision with root package name */
    public com.google.android.material.appbar.AppBarLayout f105208n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f105209o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f105202e = new java.util.ArrayList();
        this.f105207m = -1;
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        androidx.recyclerview.widget.f2 adapter;
        java.util.LinkedList list;
        java.util.LinkedList<r45.oj2> list2;
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        r45.nb4 nb4Var = null;
        com.tencent.mm.ui.MMActivity mMActivity = activity instanceof com.tencent.mm.ui.MMActivity ? (com.tencent.mm.ui.MMActivity) activity : null;
        if (mMActivity != null) {
            hc2.i.e(mMActivity, true);
        }
        this.f105204g = getIntent().getLongExtra("native_drama_id", 0L);
        byte[] byteArrayExtra = getIntent().getByteArrayExtra("native_drama_episode");
        if (byteArrayExtra != null) {
            com.tencent.mm.protobuf.f parseFrom = new r45.nb4().parseFrom(byteArrayExtra);
            if (parseFrom instanceof r45.nb4) {
                nb4Var = (r45.nb4) parseFrom;
            }
        }
        java.util.ArrayList arrayList = this.f105202e;
        if (nb4Var != null && (list2 = nb4Var.getList(0)) != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(list2, 10));
            for (r45.oj2 oj2Var : list2) {
                kotlin.jvm.internal.o.d(oj2Var);
                arrayList2.add(new zb2.b(oj2Var));
            }
            arrayList.addAll(arrayList2);
        }
        this.f105203f = getIntent().getIntExtra("native_drama_init_position", 0);
        this.f105205h = getIntent().getLongExtra("native_drama_enter_object_id", 0L);
        this.f105207m = getIntent().getIntExtra("native_drama_enter_promotion_comment_scene", -1);
        this.f105209o = getIntent().getStringExtra("native_drama_session_buffer");
        this.f105206i = getIntent().getStringExtra("native_drama_enter_dupflag");
        this.f105201d = (androidx.recyclerview.widget.RecyclerView) findViewById(com.tencent.mm.R.id.ujx);
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.tencent.mm.R.id.ujw);
        if (textView != null) {
            android.app.Activity context = getContext();
            java.lang.Object[] objArr = new java.lang.Object[1];
            objArr[0] = java.lang.Integer.valueOf((nb4Var == null || (list = nb4Var.getList(0)) == null) ? 0 : list.size());
            textView.setText(context.getString(com.tencent.mm.R.string.nyd, objArr));
        }
        com.tencent.mm.ui.bk.s0(((android.widget.TextView) findViewById(com.tencent.mm.R.id.ujn)).getPaint());
        this.f105208n = (com.google.android.material.appbar.AppBarLayout) getRootView().findViewById(com.tencent.mm.R.id.f483236a25);
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f105201d;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(new androidx.recyclerview.widget.GridLayoutManager(getContext(), 6));
        }
        androidx.recyclerview.widget.RecyclerView recyclerView2 = this.f105201d;
        if (recyclerView2 != null) {
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = new com.tencent.mm.view.recyclerview.WxRecyclerAdapter(new in5.s() { // from class: com.tencent.mm.plugin.finder.drama.drawer.FinderNativeDramaAllEpisodeUIC$onCreate$2
                @Override // in5.s
                public in5.r getItemConvert(int type) {
                    return new com.tencent.mm.plugin.finder.drama.drawer.a(com.tencent.mm.plugin.finder.drama.drawer.c.this);
                }
            }, arrayList, false);
            wxRecyclerAdapter.f293105o = new com.tencent.mm.plugin.finder.drama.drawer.b(this);
            recyclerView2.setAdapter(wxRecyclerAdapter);
        }
        androidx.recyclerview.widget.RecyclerView recyclerView3 = this.f105201d;
        if (recyclerView3 == null || (adapter = recyclerView3.getAdapter()) == null) {
            return;
        }
        adapter.notifyDataSetChanged();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(androidx.fragment.app.Fragment fragment) {
        super(fragment);
        kotlin.jvm.internal.o.g(fragment, "fragment");
        this.f105202e = new java.util.ArrayList();
        this.f105207m = -1;
    }
}

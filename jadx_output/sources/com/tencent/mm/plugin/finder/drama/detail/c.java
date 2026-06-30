package com.tencent.mm.plugin.finder.drama.detail;

/* loaded from: classes2.dex */
public final class c extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: d, reason: collision with root package name */
    public androidx.recyclerview.widget.RecyclerView f105131d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.ArrayList f105132e;

    /* renamed from: f, reason: collision with root package name */
    public int f105133f;

    /* renamed from: g, reason: collision with root package name */
    public long f105134g;

    /* renamed from: h, reason: collision with root package name */
    public long f105135h;

    /* renamed from: i, reason: collision with root package name */
    public int f105136i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f105137m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f105138n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(androidx.fragment.app.Fragment fragment) {
        super(fragment);
        kotlin.jvm.internal.o.g(fragment, "fragment");
        this.f105132e = new java.util.ArrayList();
        this.f105136i = -1;
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public int getLayoutId() {
        return com.tencent.mm.R.layout.ecz;
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        r45.pj2 pj2Var;
        androidx.recyclerview.widget.f2 adapter;
        android.os.Bundle arguments;
        android.os.Bundle arguments2;
        android.os.Bundle arguments3;
        android.os.Bundle arguments4;
        android.os.Bundle arguments5;
        android.os.Bundle arguments6;
        byte[] byteArray;
        android.os.Bundle arguments7;
        androidx.fragment.app.Fragment fragment = getFragment();
        long j17 = 0;
        this.f105134g = (fragment == null || (arguments7 = fragment.getArguments()) == null) ? 0L : arguments7.getLong("native_drama_id");
        androidx.fragment.app.Fragment fragment2 = getFragment();
        java.lang.String str = null;
        if (fragment2 == null || (arguments6 = fragment2.getArguments()) == null || (byteArray = arguments6.getByteArray("native_drama_range")) == null) {
            pj2Var = null;
        } else {
            com.tencent.mm.protobuf.f parseFrom = new r45.pj2().parseFrom(byteArray);
            kotlin.jvm.internal.o.e(parseFrom, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderNativeDramaEpisodeRange");
            pj2Var = (r45.pj2) parseFrom;
        }
        androidx.fragment.app.Fragment fragment3 = getFragment();
        this.f105133f = (fragment3 == null || (arguments5 = fragment3.getArguments()) == null) ? 0 : arguments5.getInt("native_drama_init_position");
        androidx.fragment.app.Fragment fragment4 = getFragment();
        if (fragment4 != null && (arguments4 = fragment4.getArguments()) != null) {
            j17 = arguments4.getLong("native_drama_enter_object_id", 0L);
        }
        this.f105135h = j17;
        androidx.fragment.app.Fragment fragment5 = getFragment();
        int i17 = -1;
        if (fragment5 != null && (arguments3 = fragment5.getArguments()) != null) {
            i17 = arguments3.getInt("native_drama_enter_promotion_comment_scene", -1);
        }
        this.f105136i = i17;
        androidx.fragment.app.Fragment fragment6 = getFragment();
        this.f105137m = (fragment6 == null || (arguments2 = fragment6.getArguments()) == null) ? null : arguments2.getString("native_drama_enter_dupflag");
        androidx.fragment.app.Fragment fragment7 = getFragment();
        if (fragment7 != null && (arguments = fragment7.getArguments()) != null) {
            str = arguments.getString("native_drama_session_buffer");
        }
        this.f105138n = str;
        androidx.recyclerview.widget.RecyclerView recyclerView = (androidx.recyclerview.widget.RecyclerView) findViewById(com.tencent.mm.R.id.t8e);
        this.f105131d = recyclerView;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(new androidx.recyclerview.widget.GridLayoutManager(getContext(), 6));
        }
        androidx.recyclerview.widget.RecyclerView recyclerView2 = this.f105131d;
        java.util.ArrayList arrayList = this.f105132e;
        if (recyclerView2 != null) {
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = new com.tencent.mm.view.recyclerview.WxRecyclerAdapter(new in5.s() { // from class: com.tencent.mm.plugin.finder.drama.detail.FinderNativeDramaDetailEpisodeUIC$onCreate$1
                @Override // in5.s
                public in5.r getItemConvert(int type) {
                    return new com.tencent.mm.plugin.finder.drama.detail.a(com.tencent.mm.plugin.finder.drama.detail.c.this);
                }
            }, arrayList, false);
            wxRecyclerAdapter.f293105o = new com.tencent.mm.plugin.finder.drama.detail.b(this);
            recyclerView2.setAdapter(wxRecyclerAdapter);
        }
        arrayList.clear();
        if (pj2Var != null) {
            java.util.LinkedList<r45.oj2> list = pj2Var.getList(1);
            kotlin.jvm.internal.o.f(list, "getFeed_list(...)");
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(list, 10));
            for (r45.oj2 oj2Var : list) {
                kotlin.jvm.internal.o.d(oj2Var);
                arrayList2.add(new zb2.b(oj2Var));
            }
            arrayList.addAll(arrayList2);
        }
        androidx.recyclerview.widget.RecyclerView recyclerView3 = this.f105131d;
        if (recyclerView3 != null && (adapter = recyclerView3.getAdapter()) != null) {
            adapter.notifyDataSetChanged();
        }
        arrayList.isEmpty();
    }
}

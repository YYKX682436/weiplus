package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752;

/* loaded from: classes9.dex */
public final class f0 implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.f9 f282441d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.h0 f282442e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 f282443f;

    public f0(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.h0 h0Var, p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var) {
        this.f282441d = f9Var;
        this.f282442e = h0Var;
        this.f282443f = k3Var;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/gallery/EmojiHistoryListAdapter$onBindViewHolder$1", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[onLongClick] :: long clicked with msgId: ");
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = this.f282441d;
        sb6.append(f9Var != null ? java.lang.Long.valueOf(f9Var.m124847x74d37ac6()) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("EmojiHistoryListAdapter", sb6.toString());
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.h0 h0Var = this.f282442e;
        if (h0Var.f282506f) {
            de5.a.f310929a.k(14, 7, 8);
        } else {
            de5.a.f(de5.a.f310929a, 14, 8, 0, 0, 12, null);
        }
        new com.p314xaae8f345.mm.ui.p2740x696c9db.s6(h0Var.f282504d).a(this.f282443f.f3639x46306858, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.d0.f282381d, new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.e0(f9Var, h0Var), null);
        yj0.a.i(true, this, "com/tencent/mm/ui/chatting/gallery/EmojiHistoryListAdapter$onBindViewHolder$1", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return true;
    }
}

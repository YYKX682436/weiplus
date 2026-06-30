package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752;

/* loaded from: classes9.dex */
public final class g0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.f9 f282474d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 f282475e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.h0 f282476f;

    public g0(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 c21053xdbf1e5f4, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.h0 h0Var) {
        this.f282474d = f9Var;
        this.f282475e = c21053xdbf1e5f4;
        this.f282476f = h0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/gallery/EmojiHistoryListAdapter$onBindViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[onClick] :: clicked with msgId: ");
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = this.f282474d;
        sb6.append(f9Var != null ? java.lang.Long.valueOf(f9Var.m124847x74d37ac6()) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("EmojiHistoryListAdapter", sb6.toString());
        com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 c21053xdbf1e5f4 = this.f282475e;
        if (c21053xdbf1e5f4 != null ? c21053xdbf1e5f4.k() : true) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("EmojiHistoryListAdapter", "[onClick] :: game emoji click disabled");
            yj0.a.h(this, "com/tencent/mm/ui/chatting/gallery/EmojiHistoryListAdapter$onBindViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.h0 h0Var = this.f282476f;
        if (h0Var.f282506f) {
            de5.a.f310929a.k(5, 7, 8);
        } else {
            de5.a.e(de5.a.f310929a, 8, 0, 0, 6, null);
        }
        java.lang.String mo42933xb5885648 = c21053xdbf1e5f4 != null ? c21053xdbf1e5f4.mo42933xb5885648() : null;
        if (mo42933xb5885648 == null) {
            mo42933xb5885648 = "";
        }
        qk.u uVar = new qk.u(mo42933xb5885648, c21053xdbf1e5f4);
        java.lang.String str = c21053xdbf1e5f4 != null ? c21053xdbf1e5f4.f68643xf1b7e6de : null;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        uVar.f445538g = str != null ? str : "";
        ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.f4) ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.p6) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.p6.class))).wi(h0Var.f282504d, uVar);
        yj0.a.h(this, "com/tencent/mm/ui/chatting/gallery/EmojiHistoryListAdapter$onBindViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

package com.p314xaae8f345.mm.ui.p2695x2c1ddc83;

/* loaded from: classes11.dex */
public class w2 implements android.widget.AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final yf5.j0 f289744d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.ListView f289745e;

    /* renamed from: f, reason: collision with root package name */
    public final android.app.Activity f289746f;

    public w2(yf5.j0 j0Var, android.widget.ListView listView, android.app.Activity activity) {
        this.f289744d = j0Var;
        this.f289745e = listView;
        this.f289746f = activity;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        com.p314xaae8f345.mm.p2621x8fb0427b.l4 l4Var;
        yf5.j0 j0Var = this.f289744d;
        android.widget.ListView listView = this.f289745e;
        if (i17 < listView.getHeaderViewsCount()) {
            return;
        }
        int headerViewsCount = i17 - listView.getHeaderViewsCount();
        try {
            l4Var = ((yf5.w0) j0Var).getItem(headerViewsCount);
        } catch (java.lang.IllegalStateException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ConversationClickListener", e17, "", new java.lang.Object[0]);
            l4Var = null;
        }
        if (l4Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ConversationClickListener", "null user at position = " + headerViewsCount);
            return;
        }
        if (view.getTag() instanceof yf5.n) {
            yf5.n nVar = (yf5.n) view.getTag();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ConversationClickListener", "[onItemClick] position:%s [%s,%s]", java.lang.Integer.valueOf(headerViewsCount), l4Var.h1(), nVar.f543459m);
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(nVar.f543459m) && !java.util.Objects.equals(l4Var.h1(), nVar.f543459m)) {
                com.p314xaae8f345.mm.p2621x8fb0427b.l4 h17 = ((yf5.w0) j0Var).h(nVar.f543459m);
                if (h17 != null) {
                    l4Var = h17;
                }
            }
        }
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.u2.b(this.f289746f, view, l4Var, headerViewsCount, new com.p314xaae8f345.mm.ui.p2695x2c1ddc83.v2(this));
    }
}

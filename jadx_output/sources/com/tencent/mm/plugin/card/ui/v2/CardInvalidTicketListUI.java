package com.tencent.mm.plugin.card.ui.v2;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/card/ui/v2/CardInvalidTicketListUI;", "Lcom/tencent/mm/plugin/card/ui/v2/CardNewBaseUI;", "<init>", "()V", "plugin-card_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes9.dex */
public final class CardInvalidTicketListUI extends com.tencent.mm.plugin.card.ui.v2.CardNewBaseUI {

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ int f95198v = 0;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.widget.recyclerview.LoadMoreRecyclerView f95199i;

    /* renamed from: m, reason: collision with root package name */
    public iu1.v0 f95200m;

    /* renamed from: o, reason: collision with root package name */
    public int f95202o;

    /* renamed from: q, reason: collision with root package name */
    public boolean f95204q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f95205r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f95206s;

    /* renamed from: u, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.u3 f95208u;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.ArrayList f95201n = new java.util.ArrayList();

    /* renamed from: p, reason: collision with root package name */
    public final int f95203p = 10;

    /* renamed from: t, reason: collision with root package name */
    public boolean f95207t = true;

    @Override // com.tencent.mm.plugin.card.ui.v2.CardNewBaseUI
    public void T6(int i17, boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.CardInvalidTicketListUI", "location finish: [%s, %s], ret: %s, isOk: %s", java.lang.Float.valueOf(this.f95212d), java.lang.Float.valueOf(this.f95213e), java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(z17));
        if (this.f95207t) {
            X6();
        } else {
            if (z17) {
                return;
            }
            W6();
        }
    }

    public final void X6() {
        com.tencent.mars.xlog.Log.i("MicroMsg.CardInvalidTicketListUI", "do get invalid ticket: %s, %s, %s, %s", java.lang.Integer.valueOf(this.f95202o), java.lang.Integer.valueOf(this.f95203p), java.lang.Boolean.valueOf(this.f95204q), java.lang.Boolean.valueOf(this.f95205r));
        if (this.f95204q || this.f95205r) {
            return;
        }
        this.f95205r = true;
        new au1.q(this.f95202o, this.f95203p, this.f95212d, this.f95213e).l().h(new iu1.f0(this));
    }

    public final iu1.v0 Y6() {
        iu1.v0 v0Var = this.f95200m;
        if (v0Var != null) {
            return v0Var;
        }
        kotlin.jvm.internal.o.o("mTicketAdapter");
        throw null;
    }

    public final com.tencent.mm.plugin.appbrand.widget.recyclerview.LoadMoreRecyclerView Z6() {
        com.tencent.mm.plugin.appbrand.widget.recyclerview.LoadMoreRecyclerView loadMoreRecyclerView = this.f95199i;
        if (loadMoreRecyclerView != null) {
            return loadMoreRecyclerView;
        }
        kotlin.jvm.internal.o.o("mTicketRv");
        throw null;
    }

    public final void a7(java.lang.Boolean bool) {
        if (bool == null) {
            return;
        }
        com.tencent.mm.ui.widget.dialog.u3 u3Var = null;
        if (bool.booleanValue()) {
            u3Var = com.tencent.mm.ui.widget.dialog.u3.f(getContext(), getString(com.tencent.mm.R.string.f490604zq), true, 3, null);
        } else {
            com.tencent.mm.ui.widget.dialog.u3 u3Var2 = this.f95208u;
            if (u3Var2 != null) {
                u3Var2.dismiss();
            }
        }
        this.f95208u = u3Var;
    }

    public final void b7(r45.j45 j45Var) {
        java.util.ArrayList arrayList = this.f95201n;
        if (j45Var != null) {
            java.util.LinkedList page_ticket_element = j45Var.f377579d;
            kotlin.jvm.internal.o.f(page_ticket_element, "page_ticket_element");
            if (!page_ticket_element.isEmpty()) {
                java.util.Iterator it = j45Var.f377579d.iterator();
                while (it.hasNext()) {
                    r45.g45 g45Var = (r45.g45) it.next();
                    iu1.w0 w0Var = new iu1.w0();
                    w0Var.f294974d = g45Var;
                    w0Var.f294971a = 2;
                    arrayList.add(w0Var);
                }
            }
        }
        iu1.v0 Y6 = Y6();
        Y6.f294965f = null;
        Y6.f294963d = arrayList;
        Y6.f294964e = null;
        Y6.f294968i = null;
        Y6.notifyDataSetChanged();
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.f488372rj;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.cnr);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f95199i = (com.tencent.mm.plugin.appbrand.widget.recyclerview.LoadMoreRecyclerView) findViewById;
        this.f95200m = new iu1.v0(true);
        Y6().setHasStableIds(true);
        Z6().setAdapter(Y6());
        Z6().setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(getContext()));
        Z6().setEmptyView(findViewById(com.tencent.mm.R.id.f483723bv1));
        ((android.widget.TextView) Z6().getEmptyView().findViewById(com.tencent.mm.R.id.f483724bv2)).setText(getString(com.tencent.mm.R.string.asz));
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) Z6().getEmptyView().findViewById(com.tencent.mm.R.id.f483722bv0);
        weImageView.setImageResource(com.tencent.mm.R.raw.icon_history_card_empty);
        weImageView.setIconColor(getResources().getColor(com.tencent.mm.R.color.FG_2));
        androidx.recyclerview.widget.i0 i0Var = new androidx.recyclerview.widget.i0(this, 1);
        i0Var.d(getResources().getDrawable(com.tencent.mm.R.drawable.f481109kz));
        Z6().N(i0Var);
        Z6().setLoadingView(com.tencent.mm.R.layout.f488314pw);
        Z6().setOnLoadingStateChangedListener(new iu1.g0(this));
        Z6().setOnItemClickListener(new iu1.h0(this));
        Z6().setOnItemLongClickListener(new iu1.i0(this));
    }

    @Override // com.tencent.mm.plugin.card.ui.v2.CardNewBaseUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        fixStatusbar(true);
        super.onCreate(bundle);
        hideActionbarLine();
        initView();
        r45.j45 j45Var = new r45.j45();
        java.lang.String str = (java.lang.String) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_CARD_INVALID_TICKET_STRING_SYNC, null);
        if (str != null) {
            byte[] bytes = str.getBytes(r26.c.f368867c);
            kotlin.jvm.internal.o.f(bytes, "getBytes(...)");
            j45Var.parseFrom(bytes);
        }
        b7(j45Var);
        setMMTitle(com.tencent.mm.R.string.jxt);
        setBackBtn(new iu1.j0(this));
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(16322, 9);
    }

    @Override // com.tencent.mm.plugin.card.ui.v2.CardNewBaseUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        r45.j45 j45Var = new r45.j45();
        j45Var.f377579d = new java.util.LinkedList();
        java.util.Iterator it = this.f95201n.iterator();
        while (it.hasNext()) {
            r45.g45 g45Var = ((iu1.w0) it.next()).f294974d;
            if (g45Var != null) {
                j45Var.f377579d.add(g45Var);
            }
        }
        byte[] byteArray = j45Var.toByteArray();
        kotlin.jvm.internal.o.f(byteArray, "toByteArray(...)");
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_CARD_INVALID_TICKET_STRING_SYNC, new java.lang.String(byteArray, r26.c.f368867c));
    }
}

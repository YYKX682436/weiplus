package ze5;

/* loaded from: classes9.dex */
public final class m0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ze5.n0 f553607d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.f9 f553608e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yb5.d f553609f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ c00.j4 f553610g;

    public m0(ze5.n0 n0Var, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, yb5.d dVar, c00.j4 j4Var) {
        this.f553607d = n0Var;
        this.f553608e = f9Var;
        this.f553609f = dVar;
        this.f553610g = j4Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/viewitems/mvvmitem/ChattingItemAppMsgEcsProductCardMvvm$ChattingItemAppMsgEcProduct$preDealData$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ze5.n0 n0Var = this.f553607d;
        bw5.u8 u8Var = n0Var.f553635t;
        if (u8Var != null) {
            ze5.n0.k0(n0Var, "view_clk", this.f553609f, this.f553608e, u8Var, n0Var.f553636u);
        }
        ((b00.a0) ((c00.u3) i95.n0.c(c00.u3.class))).aj("view_clk", this.f553608e, "ecs_kf_card_product");
        yb5.d dVar = this.f553609f;
        com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a i17 = dVar.i();
        if (i17 != null) {
            p3325xe03a0797.p3326xc267989b.l.d(i17, null, null, new ze5.l0(dVar, this.f553610g, null), 3, null);
        }
        yj0.a.h(this, "com/tencent/mm/ui/chatting/viewitems/mvvmitem/ChattingItemAppMsgEcsProductCardMvvm$ChattingItemAppMsgEcProduct$preDealData$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

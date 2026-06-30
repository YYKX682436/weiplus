package ze5;

/* loaded from: classes9.dex */
public final class a1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yb5.d f553340d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.f9 f553341e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ c00.k4 f553342f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ze5.b1 f553343g;

    public a1(yb5.d dVar, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, c00.k4 k4Var, ze5.b1 b1Var) {
        this.f553340d = dVar;
        this.f553341e = f9Var;
        this.f553342f = k4Var;
        this.f553343g = b1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/viewitems/mvvmitem/ChattingItemAppMsgEcsShopWindowCardMvvm$ChattingItemAppMsgEcsShopWindowCard$preDealData$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a i17 = this.f553340d.i();
        if (i17 != null) {
            p3325xe03a0797.p3326xc267989b.l.d(i17, null, null, new ze5.z0(this.f553340d, view, this.f553341e, this.f553342f, this.f553343g, null), 3, null);
        }
        yj0.a.h(this, "com/tencent/mm/ui/chatting/viewitems/mvvmitem/ChattingItemAppMsgEcsShopWindowCardMvvm$ChattingItemAppMsgEcsShopWindowCard$preDealData$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

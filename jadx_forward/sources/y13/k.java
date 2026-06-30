package y13;

/* loaded from: classes7.dex */
public final class k implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ y13.n f540421d;

    public k(y13.n nVar) {
        this.f540421d = nVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/fts/ui/ad/FTSAddFriendAdUIC$initYuanBaoAd$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("view_id", "add_fri_yuanbao_btn");
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("view_clk", hashMap, 34004);
        ((vh0.f3) ((vh0.n1) i95.n0.c(vh0.n1.class))).aj(this.f540421d.m158354x19263085(), 16, "wxid_wi_1d142z0zdj03", false, null, null);
        yj0.a.h(this, "com/tencent/mm/plugin/fts/ui/ad/FTSAddFriendAdUIC$initYuanBaoAd$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

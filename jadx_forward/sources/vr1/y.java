package vr1;

/* loaded from: classes3.dex */
public final class y implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1295x37f74295.p1296x14eafa71.ActivityC12994x7e10022b f521139d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ vr1.o f521140e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ vr1.b0 f521141f;

    public y(com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1295x37f74295.p1296x14eafa71.ActivityC12994x7e10022b activityC12994x7e10022b, vr1.o oVar, vr1.b0 b0Var) {
        this.f521139d = activityC12994x7e10022b;
        this.f521140e = oVar;
        this.f521141f = b0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/brandservice/ui/personalcenter/recentread/BizPCRecentReadStateUIC$initHasClosedTv$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        vr1.o oVar = this.f521140e;
        this.f521139d.T6(oVar.f521116e.f537727e, false, new vr1.x(oVar, this.f521141f));
        yj0.a.h(this, "com/tencent/mm/plugin/brandservice/ui/personalcenter/recentread/BizPCRecentReadStateUIC$initHasClosedTv$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

package bm2;

/* loaded from: classes3.dex */
public final class x7 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dk2.zf f22436d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bm2.a8 f22437e;

    public x7(dk2.zf zfVar, bm2.a8 a8Var) {
        this.f22436d = zfVar;
        this.f22437e = a8Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveShopMsgAdapter$_onBindViewHolder$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        dk2.zf zfVar = this.f22436d;
        java.lang.String j17 = zfVar.j();
        com.tencent.mars.xlog.Log.i(this.f22437e.f21778i, "resend msg: " + j17);
        if (j17 != null) {
            com.tencent.mm.autogen.events.ResendFinderLiveShopMsgEvent resendFinderLiveShopMsgEvent = new com.tencent.mm.autogen.events.ResendFinderLiveShopMsgEvent();
            am.sr srVar = resendFinderLiveShopMsgEvent.f54703g;
            srVar.f7930a = j17;
            srVar.f7931b = zfVar.v();
            resendFinderLiveShopMsgEvent.e();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveShopMsgAdapter$_onBindViewHolder$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

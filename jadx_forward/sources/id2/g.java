package id2;

/* loaded from: classes3.dex */
public final class g implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f372109d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ id2.l f372110e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f372111f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f372112g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.content.DialogInterface.OnClickListener f372113h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 f372114i;

    public g(android.content.Intent intent, id2.l lVar, android.app.Activity activity, int i17, android.content.DialogInterface.OnClickListener onClickListener, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 z2Var) {
        this.f372109d = intent;
        this.f372110e = lVar;
        this.f372111f = activity;
        this.f372112g = i17;
        this.f372113h = onClickListener;
        this.f372114i = z2Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/feed/ui/uic/ChatRoomCustomUIC$initOnCreate$1$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        id2.m.f372195a.b("room_live_start_create_finder", "154");
        android.content.Intent intent = this.f372109d;
        if (intent == null) {
            intent = new android.content.Intent();
        }
        intent.putExtra("key_create_scene", this.f372110e.P6().f372435e);
        c61.ub ubVar = (c61.ub) i95.n0.c(c61.ub.class);
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) ubVar).rj(this.f372111f, intent, this.f372112g);
        android.content.DialogInterface.OnClickListener onClickListener = this.f372113h;
        if (onClickListener != null) {
            onClickListener.onClick(null, -1);
        }
        this.f372114i.B();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/feed/ui/uic/ChatRoomCustomUIC$initOnCreate$1$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

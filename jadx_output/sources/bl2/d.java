package bl2;

/* loaded from: classes3.dex */
public final class d implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bl2.f f21701d;

    public d(bl2.f fVar) {
        this.f21701d = fVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        mf2.b0 b0Var;
        df2.tc tcVar;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/plugin/view/FinderLiveGuideAnchorWriteTopicPanel$openPanel$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        bl2.f fVar = this.f21701d;
        com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController liveRoomController = fVar.f21703h;
        if (liveRoomController != null && (tcVar = (df2.tc) liveRoomController.controller(df2.tc.class)) != null) {
            df2.tc.Z6(tcVar, 2, null, null, null, 14, null);
        }
        com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController liveRoomController2 = fVar.f21703h;
        if (liveRoomController2 != null && (b0Var = (if2.b) liveRoomController2.controller(yf2.i2.class)) != null && (b0Var instanceof jm2.a)) {
            ((yf2.i2) ((jm2.a) b0Var)).a7(3);
        }
        fVar.a();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/plugin/view/FinderLiveGuideAnchorWriteTopicPanel$openPanel$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

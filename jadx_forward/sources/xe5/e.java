package xe5;

/* loaded from: classes3.dex */
public final class e implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xe5.f f535546d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yb5.d f535547e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f535548f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f535549g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f535550h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f535551i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ xe5.i f535552m;

    public e(xe5.f fVar, yb5.d dVar, java.lang.String str, java.util.Map map, java.lang.String str2, long j17, long j18, xe5.i iVar) {
        this.f535546d = fVar;
        this.f535547e = dVar;
        this.f535548f = str;
        this.f535549g = map;
        this.f535550h = j17;
        this.f535551i = j18;
        this.f535552m = iVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/viewitems/fnderlivenotifytmpl/FinderLiveGameTeamUpNotifyTmpl$filling$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0((android.content.Context) this.f535547e.g(), 1, false);
        xe5.f fVar = this.f535546d;
        fVar.f535560a = k0Var;
        boolean z17 = xe5.g0.f535559g.getBoolean(this.f535548f + "_game_team", false);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var2 = fVar.f535560a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(k0Var2);
        k0Var2.f293405n = new xe5.a(z17, fVar, this.f535549g, ".msg.appmsg.extinfo.notifymsg");
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var3 = fVar.f535560a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(k0Var3);
        xe5.f fVar2 = this.f535546d;
        k0Var3.f293414s = new xe5.d(fVar2, this.f535548f, this.f535550h, this.f535547e, this.f535551i, this.f535552m);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var4 = fVar2.f535560a;
        if (k0Var4 != null) {
            k0Var4.v();
        }
        yj0.a.h(this, "com/tencent/mm/ui/chatting/viewitems/fnderlivenotifytmpl/FinderLiveGameTeamUpNotifyTmpl$filling$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

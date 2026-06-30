package wo1;

/* loaded from: classes5.dex */
public final class e0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wo1.a1 f529454d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qo1.f0 f529455e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ po1.d f529456f;

    public e0(wo1.a1 a1Var, qo1.f0 f0Var, po1.d dVar) {
        this.f529454d = a1Var;
        this.f529455e = f0Var;
        this.f529456f = dVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/backup/roambackup/ui/component/BaseTaskStatusView$onDisconnectedError$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        long j17 = this.f529455e.f447016i;
        wo1.a1 a1Var = this.f529454d;
        a1Var.getClass();
        po1.d device = this.f529456f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(device, "device");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BaseTaskStatusView", "try to regenerate device path, device=" + device);
        android.content.Intent d17 = to1.g.f502444a.d(po1.d.a(device, null, null, null, null, "/", null, null, 111, null));
        android.content.Context context = a1Var.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMFragmentActivity");
        ((com.p314xaae8f345.mm.ui.bd) ((com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f) context).m78751x5dc77fb5(d17)).f279410a = new wo1.y0(device, a1Var, j17);
        yj0.a.h(this, "com/tencent/mm/plugin/backup/roambackup/ui/component/BaseTaskStatusView$onDisconnectedError$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

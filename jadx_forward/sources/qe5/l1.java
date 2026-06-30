package qe5;

/* loaded from: classes12.dex */
public final class l1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qe5.n1 f443673d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f443674e;

    public l1(qe5.n1 n1Var, boolean z17) {
        this.f443673d = n1Var;
        this.f443674e = z17;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/uic/file/FilePageLogicUIC$setRoundProgressBar$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        qe5.n1 n1Var = this.f443673d;
        j75.f Q6 = n1Var.Q6();
        if (Q6 != null) {
            Q6.B3(new kd5.t(this.f443674e));
        }
        j75.f Q62 = n1Var.Q6();
        if (Q62 != null) {
            kd5.n nVar = new kd5.n(com.p314xaae8f345.mm.ui.p2731xc84c5534.p.f291258m);
            nVar.f388437c = false;
            nVar.f388438d = com.p314xaae8f345.mm.ui.p2731xc84c5534.l.f291221i;
            Q62.B3(nVar);
        }
        yj0.a.h(this, "com/tencent/mm/ui/chatting/uic/file/FilePageLogicUIC$setRoundProgressBar$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

package pj5;

/* loaded from: classes9.dex */
public final class s implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f436938d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ pj5.l f436939e;

    public s(in5.s0 s0Var, pj5.l lVar) {
        this.f436938d = s0Var;
        this.f436939e = lVar;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/schedulemsg/ScheduleMsgItemConvert$onBindViewHolder$1$3", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        in5.s0 s0Var = this.f436938d;
        rl5.r rVar = new rl5.r(s0Var.f374654e, view);
        rVar.C = true;
        rVar.f478888y = pj5.p.f436933a;
        rVar.f478887x = new pj5.r(s0Var, this.f436939e);
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        rVar.n(iArr[0] + ((int) (view.getWidth() / 2.0f)), iArr[1]);
        yj0.a.i(true, this, "com/tencent/mm/ui/schedulemsg/ScheduleMsgItemConvert$onBindViewHolder$1$3", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return true;
    }
}

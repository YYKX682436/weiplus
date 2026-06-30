package qh2;

/* loaded from: classes10.dex */
public final class e implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lj2.x0 f444972d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qh2.i f444973e;

    public e(lj2.x0 x0Var, qh2.i iVar) {
        this.f444972d = x0Var;
        this.f444973e = iVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/ktv/widget/KTVSingMicAudioCoverWidget$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        lj2.x0 x0Var = this.f444972d;
        if (x0Var.V()) {
            zh2.b m17 = x0Var.m();
            if (m17 != null) {
                ((ch2.o2) m17).z7(4);
            }
            yj0.a.h(this, "com/tencent/mm/plugin/finder/live/ktv/widget/KTVSingMicAudioCoverWidget$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        qh2.i iVar = this.f444973e;
        if (iVar.G()) {
            wj2.w.U(iVar, 0, 1, null);
        } else {
            iVar.X();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/ktv/widget/KTVSingMicAudioCoverWidget$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

package te2;

/* loaded from: classes3.dex */
public final class q8 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ te2.s8 f499892d;

    public q8(te2.s8 s8Var) {
        this.f499892d = s8Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/component/FinderLiveNoticeQRCodeWithPreviewUIC$loadPreviewData$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        te2.s8 s8Var = this.f499892d;
        s8Var.E1 = 1;
        te2.p8.s7(s8Var, false, 1, null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/component/FinderLiveNoticeQRCodeWithPreviewUIC$loadPreviewData$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

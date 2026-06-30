package te2;

/* loaded from: classes3.dex */
public final class g8 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ te2.p8 f499572d;

    public g8(te2.p8 p8Var) {
        this.f499572d = p8Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/component/FinderLiveNoticeQRCodeUIC$setAnchorBottomWithState$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        te2.p8 p8Var = this.f499572d;
        yz5.a aVar = p8Var.F1;
        if (aVar != null) {
            if (aVar != null) {
                aVar.mo152xb9724478();
            }
            yj0.a.h(this, "com/tencent/mm/plugin/finder/live/component/FinderLiveNoticeQRCodeUIC$setAnchorBottomWithState$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        } else {
            ml2.c3[] c3VarArr = ml2.c3.f408864d;
            p8Var.o7(4);
            p8Var.m158354x19263085().finish();
            yj0.a.h(this, "com/tencent/mm/plugin/finder/live/component/FinderLiveNoticeQRCodeUIC$setAnchorBottomWithState$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }
}

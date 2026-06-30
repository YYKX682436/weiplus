package qv4;

/* loaded from: classes5.dex */
public final class d0 implements android.view.View.OnScrollChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ qv4.k0 f448496a;

    public d0(qv4.k0 k0Var) {
        this.f448496a = k0Var;
    }

    @Override // android.view.View.OnScrollChangeListener
    public final void onScrollChange(android.view.View view, int i17, int i18, int i19, int i27) {
        zj0.b bVar = new zj0.b();
        bVar.c(view);
        bVar.b(i17);
        bVar.b(i18);
        bVar.b(i19);
        bVar.b(i27);
        yj0.a.b("com/tencent/mm/plugin/websearch/teach/global/FTSGlobalTeachVerticalSearchEntryViewHolder$loadVerticalEntryItemView$5$2", "android/view/View$OnScrollChangeListener", "onScrollChange", "(Landroid/view/View;IIII)V", this, bVar.a());
        qv4.k0 k0Var = this.f448496a;
        yz5.l lVar = k0Var.f448526m;
        if (lVar != null) {
        }
        yj0.a.h(this, "com/tencent/mm/plugin/websearch/teach/global/FTSGlobalTeachVerticalSearchEntryViewHolder$loadVerticalEntryItemView$5$2", "android/view/View$OnScrollChangeListener", "onScrollChange", "(Landroid/view/View;IIII)V");
    }
}

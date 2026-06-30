package ax2;

/* loaded from: classes3.dex */
public final class b extends ym5.n0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.crit.LiveCritBuffAnimView f15031a;

    public b(com.tencent.mm.plugin.finder.view.crit.LiveCritBuffAnimView liveCritBuffAnimView) {
        this.f15031a = liveCritBuffAnimView;
    }

    @Override // ym5.n0
    public void onViewExposed(android.view.View view, long j17, long j18, boolean z17) {
        kotlin.jvm.internal.o.g(view, "view");
        if (z17) {
            return;
        }
        android.widget.LinearLayout linearLayout = this.f15031a.f131804d;
        if (linearLayout != null) {
            linearLayout.removeAllViews();
        } else {
            kotlin.jvm.internal.o.o("root");
            throw null;
        }
    }
}

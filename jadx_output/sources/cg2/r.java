package cg2;

/* loaded from: classes5.dex */
public final class r extends yp.o {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f41122d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.view.StrokeTextView f41123e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.view.StrokeTextView f41124f;

    /* renamed from: g, reason: collision with root package name */
    public android.animation.AnimatorSet f41125g;

    /* renamed from: h, reason: collision with root package name */
    public android.animation.AnimatorSet f41126h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(android.view.View itemView) {
        super(itemView);
        kotlin.jvm.internal.o.g(itemView, "itemView");
        this.f41122d = itemView;
        android.view.View findViewById = itemView.findViewById(com.tencent.mm.R.id.sni);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f41123e = (com.tencent.mm.plugin.finder.view.StrokeTextView) findViewById;
        android.view.View findViewById2 = itemView.findViewById(com.tencent.mm.R.id.snj);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f41124f = (com.tencent.mm.plugin.finder.view.StrokeTextView) findViewById2;
    }

    @Override // yp.o
    public void f() {
        this.f41124f.animate().cancel();
        android.animation.AnimatorSet animatorSet = this.f41125g;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.f41125g = null;
        android.animation.AnimatorSet animatorSet2 = this.f41126h;
        if (animatorSet2 != null) {
            animatorSet2.cancel();
        }
        this.f41126h = null;
    }
}

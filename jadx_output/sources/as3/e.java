package as3;

/* loaded from: classes3.dex */
public final class e extends androidx.recyclerview.widget.p2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.tab.view.BizProfileFollowMoreView f13501d;

    public e(com.tencent.mm.plugin.profile.ui.tab.view.BizProfileFollowMoreView bizProfileFollowMoreView) {
        this.f13501d = bizProfileFollowMoreView;
    }

    @Override // androidx.recyclerview.widget.p2
    public void getItemOffsets(android.graphics.Rect outRect, android.view.View view, androidx.recyclerview.widget.RecyclerView parent, androidx.recyclerview.widget.h3 state) {
        kotlin.jvm.internal.o.g(outRect, "outRect");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(parent, "parent");
        kotlin.jvm.internal.o.g(state, "state");
        super.getItemOffsets(outRect, view, parent, state);
        java.lang.Integer valueOf = java.lang.Integer.valueOf(parent.u0(view));
        if (!(valueOf.intValue() == 0)) {
            valueOf = null;
        }
        if (valueOf != null) {
            valueOf.intValue();
            android.content.Context context = this.f13501d.getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            outRect.left = com.tencent.mm.plugin.appbrand.ui.u5.a(context, 20);
        }
    }
}

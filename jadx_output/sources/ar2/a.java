package ar2;

/* loaded from: classes2.dex */
public final class a extends androidx.recyclerview.widget.p2 {

    /* renamed from: d, reason: collision with root package name */
    public final int f13380d;

    /* renamed from: e, reason: collision with root package name */
    public final int f13381e;

    /* renamed from: f, reason: collision with root package name */
    public int f13382f;

    public a(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        this.f13380d = com.tencent.mm.ui.zk.a(com.tencent.mm.sdk.platformtools.x2.f193071a, 6);
        this.f13381e = com.tencent.mm.ui.zk.a(com.tencent.mm.sdk.platformtools.x2.f193071a, 12);
        this.f13382f = com.tencent.mm.ui.zk.a(com.tencent.mm.sdk.platformtools.x2.f193071a, 8);
    }

    @Override // androidx.recyclerview.widget.p2
    public void getItemOffsets(android.graphics.Rect outRect, android.view.View view, androidx.recyclerview.widget.RecyclerView parent, androidx.recyclerview.widget.h3 state) {
        kotlin.jvm.internal.o.g(outRect, "outRect");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(parent, "parent");
        kotlin.jvm.internal.o.g(state, "state");
        int u07 = parent.u0(view);
        boolean z17 = u07 % 2 == 0;
        if (u07 == 0 || u07 == 1) {
            outRect.top = this.f13382f;
        }
        int i17 = this.f13380d;
        int i18 = this.f13381e;
        outRect.left = z17 ? i18 : i17;
        if (!z17) {
            i17 = i18;
        }
        outRect.right = i17;
        outRect.bottom = i18;
    }
}

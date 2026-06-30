package com.tencent.mm.plugin.fav.ui;

/* loaded from: classes11.dex */
public final class k8 extends androidx.recyclerview.widget.p2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.y8 f101228d;

    public k8(com.tencent.mm.plugin.fav.ui.y8 y8Var) {
        this.f101228d = y8Var;
    }

    @Override // androidx.recyclerview.widget.p2
    public void getItemOffsets(android.graphics.Rect outRect, android.view.View view, androidx.recyclerview.widget.RecyclerView parent, androidx.recyclerview.widget.h3 state) {
        kotlin.jvm.internal.o.g(outRect, "outRect");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(parent, "parent");
        kotlin.jvm.internal.o.g(state, "state");
        super.getItemOffsets(outRect, view, parent, state);
        int u07 = parent.u0(view);
        int f17 = i65.a.f(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.dimen.f479738dv);
        switch (this.f101228d.getItemViewType(u07)) {
            case 18:
            case 19:
                if (u07 != 0) {
                    outRect.top = f17;
                } else {
                    outRect.top = f17 / 2;
                }
                outRect.bottom = f17;
                outRect.right = f17;
                outRect.left = f17;
                return;
            case 20:
                if (u07 % 3 == 0) {
                    outRect.right = f17;
                }
                outRect.left = f17;
                outRect.bottom = f17;
                return;
            case 21:
                if (((u07 - r5.f101625d.size()) - 1) % 3 == 0) {
                    outRect.right = f17;
                }
                outRect.left = f17;
                outRect.bottom = f17;
                return;
            default:
                return;
        }
    }
}

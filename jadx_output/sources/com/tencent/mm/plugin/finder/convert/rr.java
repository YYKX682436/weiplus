package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class rr extends androidx.recyclerview.widget.p2 {

    /* renamed from: d, reason: collision with root package name */
    public final int f104500d;

    /* renamed from: e, reason: collision with root package name */
    public final int f104501e;

    public rr(com.tencent.mm.plugin.finder.convert.wr wrVar, int i17, int i18) {
        this.f104500d = i17;
        this.f104501e = i18;
    }

    @Override // androidx.recyclerview.widget.p2
    public void getItemOffsets(android.graphics.Rect outRect, int i17, androidx.recyclerview.widget.RecyclerView parent) {
        kotlin.jvm.internal.o.g(outRect, "outRect");
        kotlin.jvm.internal.o.g(parent, "parent");
        super.getItemOffsets(outRect, i17, parent);
        int i18 = i17 % 3;
        int i19 = this.f104500d;
        if (i18 == 0) {
            outRect.left = i19;
            return;
        }
        outRect.left = this.f104501e;
        if (i18 == 2) {
            outRect.right = i19;
        }
    }
}

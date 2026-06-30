package com.tencent.mm.plugin.finder.account.component;

/* loaded from: classes2.dex */
public class f extends com.tencent.mm.plugin.finder.account.api.component.FinderAccountSwitchDrawer {

    /* renamed from: z, reason: collision with root package name */
    public boolean f101705z;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public f(android.content.Context r1, android.util.AttributeSet r2, boolean r3, int r4, kotlin.jvm.internal.i r5) {
        /*
            r0 = this;
            r4 = r4 & 2
            if (r4 == 0) goto L5
            r2 = 0
        L5:
            java.lang.String r4 = "context"
            kotlin.jvm.internal.o.g(r1, r4)
            r0.<init>(r1, r2)
            r0.f101705z = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.account.component.f.<init>(android.content.Context, android.util.AttributeSet, boolean, int, kotlin.jvm.internal.i):void");
    }

    @Override // com.tencent.mm.view.drawer.RecyclerViewDrawer
    public com.tencent.mm.view.drawer.RecyclerViewDrawerSquares p() {
        android.content.Context context = getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        return new com.tencent.mm.view.drawer.NewLifeRecyclerViewDrawerSquares(context, null);
    }

    public final void setNeedCreateAccount(boolean z17) {
        this.f101705z = z17;
    }

    @Override // com.tencent.mm.plugin.finder.account.api.component.FinderAccountSwitchDrawer
    public int u(android.content.Context context, int i17) {
        int i18;
        kotlin.jvm.internal.o.g(context, "context");
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479662c0) + (context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479649bo) * i17) + (this.f101705z ? context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479733dq) : context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479675cc));
        int c17 = com.tencent.mm.ui.bl.c(context);
        android.graphics.Point b17 = com.tencent.mm.ui.bl.b(com.tencent.mm.sdk.platformtools.x2.f193071a);
        int i19 = b17.x;
        int i27 = b17.y;
        java.lang.System.nanoTime();
        boolean z17 = com.tencent.mm.ui.bk.y() || com.tencent.mm.ui.bk.Q() || com.tencent.mm.ui.bk.A();
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        if (z17) {
            i18 = i27 - c17;
        } else {
            if (i27 >= i19) {
                i19 = i27;
            }
            i18 = i19 - c17;
        }
        int i28 = (int) (i18 * 0.75f);
        int i29 = dimensionPixelSize >= i28 ? i28 : dimensionPixelSize;
        com.tencent.mars.xlog.Log.i("Finder.FinderAccountSwitchDrawer", "totalHeight=" + i18 + " realHeight=" + dimensionPixelSize + " maxHeight=" + i28);
        return i18 - i29;
    }
}

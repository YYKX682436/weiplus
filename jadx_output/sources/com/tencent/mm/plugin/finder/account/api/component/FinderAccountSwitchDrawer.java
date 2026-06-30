package com.tencent.mm.plugin.finder.account.api.component;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u000f\u0010B\u001b\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fB#\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\r\u001a\u00020\u0003¢\u0006\u0004\b\u000b\u0010\u000eJ\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003¨\u0006\u0011"}, d2 = {"Lcom/tencent/mm/plugin/finder/account/api/component/FinderAccountSwitchDrawer;", "Lcom/tencent/mm/view/drawer/RecyclerViewDrawer;", "Lcom/tencent/mm/view/drawer/RecyclerViewDrawerSquares$a;", "", "size", "Ljz5/f0;", "setTopPadding", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "h92/a", "h92/b", "plugin-finder-account-api_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public class FinderAccountSwitchDrawer extends com.tencent.mm.view.drawer.RecyclerViewDrawer {

    /* renamed from: y, reason: collision with root package name */
    public static final h92.b f101699y = new h92.b(null);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderAccountSwitchDrawer(android.content.Context context) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
    }

    @Override // com.tencent.mm.view.drawer.RecyclerViewDrawer, com.tencent.mm.view.drawer.RecyclerViewDrawerSquares.a
    public void c(boolean z17, boolean z18, int i17) {
        super.c(z17, z18, i17);
    }

    public final void setTopPadding(int i17) {
        android.content.Context context = getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        setTopOffset(u(context, i17));
        com.tencent.mars.xlog.Log.i("Finder.FinderAccountSwitchDrawer", "topOffset=" + getTopOffset());
        setPadding(0, getTopOffset(), 0, 0);
    }

    public int u(android.content.Context context, int i17) {
        int i18;
        kotlin.jvm.internal.o.g(context, "context");
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479731dn) + (context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479734dr) * i17) + context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479734dr);
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderAccountSwitchDrawer(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderAccountSwitchDrawer(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
    }
}

package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1419xb9d38a2d.api.p1420xac8f1cfd;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u000f\u0010B\u001b\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fB#\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\r\u001a\u00020\u0003¢\u0006\u0004\b\u000b\u0010\u000eJ\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003¨\u0006\u0011"}, d2 = {"Lcom/tencent/mm/plugin/finder/account/api/component/FinderAccountSwitchDrawer;", "Lcom/tencent/mm/view/drawer/RecyclerViewDrawer;", "Lcom/tencent/mm/view/drawer/RecyclerViewDrawerSquares$a;", "", "size", "Ljz5/f0;", "setTopPadding", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "h92/a", "h92/b", "plugin-finder-account-api_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.account.api.component.FinderAccountSwitchDrawer */
/* loaded from: classes2.dex */
public class C13638xb683e9ec extends com.p314xaae8f345.mm.p2776x373aa5.p2778xb118f8f1.C22821xbaee45b5 {

    /* renamed from: y, reason: collision with root package name */
    public static final h92.b f183232y = new h92.b(null);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13638xb683e9ec(android.content.Context context) {
        super(context);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    @Override // com.p314xaae8f345.mm.p2776x373aa5.p2778xb118f8f1.C22821xbaee45b5, com.p314xaae8f345.mm.p2776x373aa5.p2778xb118f8f1.C22822xceb63781.a
    public void c(boolean z17, boolean z18, int i17) {
        super.c(z17, z18, i17);
    }

    /* renamed from: setTopPadding */
    public final void m55420xbd04defe(int i17) {
        android.content.Context context = getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        m82810x46bc3006(u(context, i17));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderAccountSwitchDrawer", "topOffset=" + getTopOffset());
        setPadding(0, getTopOffset(), 0, 0);
    }

    public int u(android.content.Context context, int i17) {
        int i18;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561264dn) + (context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561267dr) * i17) + context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561267dr);
        int c17 = com.p314xaae8f345.mm.ui.bl.c(context);
        android.graphics.Point b17 = com.p314xaae8f345.mm.ui.bl.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        int i19 = b17.x;
        int i27 = b17.y;
        java.lang.System.nanoTime();
        boolean z17 = com.p314xaae8f345.mm.ui.bk.y() || com.p314xaae8f345.mm.ui.bk.Q() || com.p314xaae8f345.mm.ui.bk.A();
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
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
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderAccountSwitchDrawer", "totalHeight=" + i18 + " realHeight=" + dimensionPixelSize + " maxHeight=" + i28);
        return i18 - i29;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13638xb683e9ec(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13638xb683e9ec(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }
}

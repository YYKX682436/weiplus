package com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u0001B-\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/tencent/mm/view/recyclerview/WxLinearLayoutManager;", "Landroidx/recyclerview/widget/LinearLayoutManager;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "libmmui_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.view.recyclerview.WxLinearLayoutManager */
/* loaded from: classes4.dex */
public class C22847x422a813d extends p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de {

    /* renamed from: v, reason: collision with root package name */
    public final android.content.Context f295247v;

    public C22847x422a813d(android.content.Context context) {
        super(context);
        this.f295247v = context;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de
    public void P(int i17, int i18) {
        super.P(i17, i18);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c("MicroMsg.WxLinearLayoutManager", "scrollToPositionWithOffset:" + i17 + " offset:" + i18, new java.lang.Object[0]);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: onLayoutChildren */
    public void mo2418x457c9b08(p012xc85e97e9.p103xe821e364.p104xd1075a44.z2 z2Var, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 h3Var) {
        android.content.Context context = this.f295247v;
        try {
            super.mo2418x457c9b08(z2Var, h3Var);
        } catch (java.lang.IllegalArgumentException e17) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onLayoutChildren ");
            sb6.append(context != null ? context.getClass().getName() : null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WxLinearLayoutManager", e17, sb6.toString(), new java.lang.Object[0]);
        } catch (java.lang.IndexOutOfBoundsException unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WxLinearLayoutManager", "meet a IOOBE in RecyclerView");
        } catch (java.lang.Exception e18) {
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("onLayoutChildren ");
            sb7.append(context != null ? context.getClass().getName() : null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WxLinearLayoutManager", e18, sb7.toString(), new java.lang.Object[0]);
            int i17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274645h;
            if ((i17 == 788529167 || i17 == 788529166) || z65.c.a()) {
                throw e18;
            }
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: scrollToPosition */
    public void mo2420xc593c771(int i17) {
        super.mo2420xc593c771(i17);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c("MicroMsg.WxLinearLayoutManager", "scrollToPosition:" + i17, new java.lang.Object[0]);
    }

    public C22847x422a813d(android.content.Context context, int i17, boolean z17) {
        super(context, i17, z17);
        this.f295247v = context;
    }

    public C22847x422a813d(android.content.Context context, android.util.AttributeSet attributeSet, int i17, int i18) {
        super(context, attributeSet, i17, i18);
        this.f295247v = context;
    }
}

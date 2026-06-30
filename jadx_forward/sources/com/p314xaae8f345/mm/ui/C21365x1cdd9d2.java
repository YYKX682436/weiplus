package com.p314xaae8f345.mm.ui;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0013\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001d\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bB%\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/tencent/mm/ui/FinderImplIconViewTipPreference;", "Lcom/tencent/mm/ui/FinderIconViewTipPreference;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "app_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.ui.FinderImplIconViewTipPreference */
/* loaded from: classes8.dex */
public final class C21365x1cdd9d2 extends com.p314xaae8f345.mm.ui.C21363x65d29512 {

    /* renamed from: m3, reason: collision with root package name */
    public final java.lang.String f278252m3;

    /* renamed from: n3, reason: collision with root package name */
    public boolean f278253n3;

    public C21365x1cdd9d2(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f278252m3 = "FinderImplIconViewTipPreference";
        g1();
    }

    public final void g1() {
        ((c61.p7) ((m40.k0) i95.n0.c(m40.k0.class))).getClass();
        boolean D = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.aj0.f207973a.D();
        this.f278253n3 = D;
        java.lang.String str = this.f278252m3;
        if (D) {
            android.content.Context context = this.f279303d;
            jz5.f0 f0Var = null;
            com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f activityC21401x6ce6f73f = context instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f) context : null;
            if (activityC21401x6ce6f73f != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.aa.f186892d.mo7806x9d92d11c(activityC21401x6ce6f73f, ((c61.t8) ((zy2.ca) i95.n0.c(zy2.ca.class))).bj(new com.p314xaae8f345.mm.ui.n6(this)));
                f0Var = jz5.f0.f384359a;
            }
            if (f0Var == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "init but getContext=" + context);
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "mRenderAttachCtrlInfo=" + this.f278253n3);
    }

    public C21365x1cdd9d2(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f278252m3 = "FinderImplIconViewTipPreference";
        g1();
    }

    public C21365x1cdd9d2(android.content.Context context) {
        super(context, null);
        this.f278252m3 = "FinderImplIconViewTipPreference";
        g1();
    }
}

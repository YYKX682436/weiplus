package com.p314xaae8f345.mm.p1006xc5476f33.p1335x38a0fd3f;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/combine/CombineVisibilityFragment;", "Lcom/tencent/mm/ui/vas/VASCommonFragment;", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.combine.CombineVisibilityFragment */
/* loaded from: classes16.dex */
public final class C13150x1ad45f01 extends com.p314xaae8f345.mm.ui.vas.C22584xf7d97e83 {
    public boolean S1;

    @Override // com.p314xaae8f345.mm.ui.vas.C22584xf7d97e83, com.p314xaae8f345.mm.ui.vas.p2743x9da2e250.AbstractC22586x21703f69, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onCreateView */
    public android.view.View mo7503x18bad100(android.view.LayoutInflater inflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(inflater, "inflater");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[");
        sb6.append(m7479x8cdac1b());
        sb6.append("]onCreateView fixStatusBar:");
        sb6.append(this.S1);
        sb6.append(" ActClz=");
        com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37 abstractActivityC22579xbed01a37 = this.f292654p;
        sb6.append(abstractActivityC22579xbed01a37 != null ? abstractActivityC22579xbed01a37.getClass().getSimpleName() : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f292653o, sb6.toString());
        android.view.View mo7503x18bad100 = super.mo7503x18bad100(inflater, viewGroup, bundle);
        if (mo7503x18bad100 == null) {
            return mo7503x18bad100;
        }
        android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(mo7503x18bad100.getContext());
        frameLayout.addView(mo7503x18bad100, new android.widget.FrameLayout.LayoutParams(-1, -1));
        return frameLayout;
    }
}

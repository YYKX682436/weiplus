package com.tencent.mm.plugin.finder.feed.ui;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/FinderFollowAggregationFragment;", "Lcom/tencent/mm/plugin/finder/ui/fragment/FinderHomeTabFragment;", "<init>", "()V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class FinderFollowAggregationFragment extends com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment {
    public FinderFollowAggregationFragment() {
    }

    @Override // com.tencent.mm.ui.component.UIComponentFragment
    public int getLayoutId() {
        int ordinal = y0().ordinal();
        if (ordinal == 0) {
            return com.tencent.mm.R.layout.aiz;
        }
        if (ordinal == 1) {
            return com.tencent.mm.R.layout.f489080ee1;
        }
        throw new jz5.j();
    }

    @Override // com.tencent.mm.ui.component.UIComponentFragment
    /* renamed from: l0 */
    public java.util.Set getF123295n() {
        int ordinal = y0().ordinal();
        if (ordinal == 0) {
            return kz5.o1.c(com.tencent.mm.plugin.finder.viewmodel.component.lh.class);
        }
        if (ordinal == 1) {
            return kz5.o1.c(dv2.j1.class);
        }
        throw new jz5.j();
    }

    public final dv2.i y0() {
        java.lang.String string;
        java.lang.Object m521constructorimpl;
        android.os.Bundle arguments = getArguments();
        if (arguments != null && (string = arguments.getString("key_aggregation_tab")) != null) {
            try {
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                m521constructorimpl = kotlin.Result.m521constructorimpl(dv2.i.valueOf(string));
            } catch (java.lang.Throwable th6) {
                kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                m521constructorimpl = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
            }
            if (kotlin.Result.m527isFailureimpl(m521constructorimpl)) {
                m521constructorimpl = null;
            }
            dv2.i iVar = (dv2.i) m521constructorimpl;
            if (iVar != null) {
                return iVar;
            }
        }
        return dv2.i.f243865e;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FinderFollowAggregationFragment(dv2.i aggregationTab) {
        this();
        kotlin.jvm.internal.o.g(aggregationTab, "aggregationTab");
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("key_aggregation_tab", aggregationTab.name());
        setArguments(bundle);
    }
}

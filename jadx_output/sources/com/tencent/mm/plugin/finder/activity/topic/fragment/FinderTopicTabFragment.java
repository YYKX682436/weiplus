package com.tencent.mm.plugin.finder.activity.topic.fragment;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/finder/activity/topic/fragment/FinderTopicTabFragment;", "Lcom/tencent/mm/plugin/finder/activity/fragment/FinderActivityFragment;", "<init>", "()V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class FinderTopicTabFragment extends com.tencent.mm.plugin.finder.activity.fragment.FinderActivityFragment {
    @Override // com.tencent.mm.plugin.finder.activity.fragment.FinderActivityFragment, com.tencent.mm.ui.component.UIComponentFragment
    /* renamed from: l0 */
    public java.util.Set getF123295n() {
        return kz5.z.D0(new java.lang.Class[]{com.tencent.mm.plugin.finder.viewmodel.component.ny.class, va2.i.class});
    }

    @Override // com.tencent.mm.plugin.finder.activity.fragment.FinderActivityFragment, com.tencent.mm.plugin.finder.ui.fragment.MMFinderFragment
    /* renamed from: r0 */
    public int getB() {
        return 22;
    }

    @Override // com.tencent.mm.plugin.finder.activity.fragment.FinderActivityFragment
    public com.tencent.mm.plugin.finder.viewmodel.component.FinderTabUIC y0(androidx.fragment.app.FragmentActivity activity) {
        kotlin.jvm.internal.o.g(activity, "activity");
        pf5.z zVar = pf5.z.f353948a;
        if (!(activity instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        androidx.lifecycle.c1 a17 = zVar.a((androidx.appcompat.app.AppCompatActivity) activity).a(va2.n.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        return (com.tencent.mm.plugin.finder.viewmodel.component.FinderTabUIC) a17;
    }

    public final java.lang.String z0() {
        r45.mb4 mb4Var;
        com.tencent.mm.plugin.finder.feed.model.FinderTopicFeedLoader finderTopicFeedLoader = ((va2.i) pf5.z.f353948a.b(this).a(va2.i.class)).f101966r;
        if (finderTopicFeedLoader == null) {
            kotlin.jvm.internal.o.o("feedLoader");
            throw null;
        }
        java.util.List<E> listOfType = finderTopicFeedLoader.getListOfType(com.tencent.mm.plugin.finder.model.BaseFinderFeed.class);
        if ((listOfType == 0 || listOfType.isEmpty()) || (mb4Var = (r45.mb4) kz5.n0.a0(((com.tencent.mm.plugin.finder.model.BaseFinderFeed) listOfType.get(0)).getFeedObject().getMediaList(), 0)) == null) {
            return "";
        }
        return mb4Var.getString(1) + mb4Var.getString(19);
    }
}

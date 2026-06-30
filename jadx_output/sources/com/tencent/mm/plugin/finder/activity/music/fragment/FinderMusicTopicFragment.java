package com.tencent.mm.plugin.finder.activity.music.fragment;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/finder/activity/music/fragment/FinderMusicTopicFragment;", "Lcom/tencent/mm/plugin/finder/activity/fragment/FinderActivityFragment;", "<init>", "()V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class FinderMusicTopicFragment extends com.tencent.mm.plugin.finder.activity.fragment.FinderActivityFragment {
    @Override // com.tencent.mm.plugin.finder.activity.fragment.FinderActivityFragment, com.tencent.mm.ui.component.UIComponentFragment
    /* renamed from: l0 */
    public java.util.Set getF123295n() {
        return kz5.z.D0(new java.lang.Class[]{com.tencent.mm.plugin.finder.viewmodel.component.ny.class, ea2.j0.class});
    }

    @Override // com.tencent.mm.plugin.finder.ui.fragment.MMFinderFragment, com.tencent.mm.ui.component.UIComponentFragment
    public void q0(java.util.HashSet set) {
        kotlin.jvm.internal.o.g(set, "set");
        super.q0(set);
        set.remove(pf5.a0.a(kotlin.jvm.internal.i0.a(zy2.k9.class)));
    }

    @Override // com.tencent.mm.plugin.finder.activity.fragment.FinderActivityFragment, com.tencent.mm.plugin.finder.ui.fragment.MMFinderFragment
    /* renamed from: r0 */
    public int getB() {
        return 138;
    }

    @Override // com.tencent.mm.plugin.finder.activity.fragment.FinderActivityFragment
    public com.tencent.mm.plugin.finder.viewmodel.component.FinderTabUIC y0(androidx.fragment.app.FragmentActivity activity) {
        kotlin.jvm.internal.o.g(activity, "activity");
        pf5.z zVar = pf5.z.f353948a;
        if (!(activity instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        androidx.lifecycle.c1 a17 = zVar.a((androidx.appcompat.app.AppCompatActivity) activity).a(ea2.k0.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        return (com.tencent.mm.plugin.finder.viewmodel.component.FinderTabUIC) a17;
    }
}

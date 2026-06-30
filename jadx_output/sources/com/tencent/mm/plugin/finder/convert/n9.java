package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class n9 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.qe f104084d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f104085e;

    public n9(com.tencent.mm.plugin.finder.convert.qe qeVar, in5.s0 s0Var) {
        this.f104084d = qeVar;
        this.f104085e = s0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed;
        com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment finderHomeTabFragment;
        com.tencent.mm.plugin.finder.convert.qe qeVar = this.f104084d;
        in5.s0 holder = this.f104085e;
        qeVar.y0(holder);
        com.tencent.mm.plugin.finder.feed.k8 k8Var = qeVar.f104358f;
        jz5.f0 f0Var = null;
        com.tencent.mm.plugin.finder.feed.pz pzVar = k8Var instanceof com.tencent.mm.plugin.finder.feed.pz ? (com.tencent.mm.plugin.finder.feed.pz) k8Var : null;
        if (pzVar != null && (finderHomeTabFragment = pzVar.f108756h) != null) {
            com.tencent.mm.plugin.finder.viewmodel.component.pv pvVar = (com.tencent.mm.plugin.finder.viewmodel.component.pv) pf5.z.f353948a.b(finderHomeTabFragment).e(com.tencent.mm.plugin.finder.viewmodel.component.pv.class);
            if (pvVar != null) {
                kotlin.jvm.internal.o.g(holder, "holder");
                com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed2 = (com.tencent.mm.plugin.finder.model.BaseFinderFeed) holder.f293125i;
                if (baseFinderFeed2 != null) {
                    pvVar.Q6(baseFinderFeed2);
                }
                f0Var = jz5.f0.f302826a;
            }
            if (f0Var != null) {
                return;
            }
        }
        android.content.Context context = holder.f293121e;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        com.tencent.mm.plugin.finder.viewmodel.component.pv pvVar2 = (com.tencent.mm.plugin.finder.viewmodel.component.pv) zVar.a((androidx.appcompat.app.AppCompatActivity) context).e(com.tencent.mm.plugin.finder.viewmodel.component.pv.class);
        if (pvVar2 == null || (baseFinderFeed = (com.tencent.mm.plugin.finder.model.BaseFinderFeed) holder.f293125i) == null) {
            return;
        }
        pvVar2.Q6(baseFinderFeed);
    }
}

package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes10.dex */
public final class di implements in5.y {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.li f106568d;

    public di(com.tencent.mm.plugin.finder.feed.li liVar) {
        this.f106568d = liVar;
    }

    @Override // in5.y
    public boolean c(androidx.recyclerview.widget.f2 adapter, android.view.View view, int i17, androidx.recyclerview.widget.k3 k3Var) {
        in5.s0 holder = (in5.s0) k3Var;
        kotlin.jvm.internal.o.g(adapter, "adapter");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(holder, "holder");
        int a07 = i17 - ((in5.n0) adapter).a0();
        if (a07 < 0) {
            return true;
        }
        com.tencent.mm.plugin.finder.feed.li liVar = this.f106568d;
        if (a07 >= liVar.f107294d.f109191p.size()) {
            return true;
        }
        java.lang.Object obj = liVar.f107294d.f109191p.get(a07);
        kotlin.jvm.internal.o.f(obj, "get(...)");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onLongClick ");
        sb6.append(a07);
        sb6.append(" id:");
        cd2.c cVar = ((cd2.b) obj).f40655d;
        sb6.append(cVar.i());
        sb6.append(" commentId:");
        sb6.append(cVar.a());
        com.tencent.mars.xlog.Log.i("FinderLiveMention.NotifyViewCallback", sb6.toString());
        rl5.r rVar = liVar.f107304q;
        if (rVar == null) {
            kotlin.jvm.internal.o.o("popupMenu");
            throw null;
        }
        rVar.a();
        rl5.r rVar2 = liVar.f107304q;
        if (rVar2 != null) {
            rVar2.h(view, new com.tencent.mm.plugin.finder.feed.ei(liVar, view), new com.tencent.mm.plugin.finder.feed.ii(liVar, cVar, a07), com.tencent.mm.view.TouchableLayout.f213511d, com.tencent.mm.view.TouchableLayout.f213512e);
            return true;
        }
        kotlin.jvm.internal.o.o("popupMenu");
        throw null;
    }
}

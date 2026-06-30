package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class mo implements ym5.q1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.no f107392d;

    public mo(com.tencent.mm.plugin.finder.feed.no noVar) {
        this.f107392d = noVar;
    }

    @Override // ym5.m1
    public void onChanged() {
        com.tencent.mm.plugin.finder.feed.to toVar = this.f107392d.f108588e;
        if (toVar != null) {
            toVar.g().onChanged();
        }
    }

    @Override // ym5.m1
    public void onItemRangeChanged(int i17, int i18) {
        com.tencent.mm.plugin.finder.feed.to toVar = this.f107392d.f108588e;
        if (toVar != null) {
            toVar.g().onItemRangeChanged(i17, i18);
        }
    }

    @Override // ym5.m1
    public void onItemRangeInserted(int i17, int i18) {
        com.tencent.mm.plugin.finder.feed.to toVar = this.f107392d.f108588e;
        if (toVar != null) {
            toVar.g().onItemRangeInserted(i17, i18);
        }
    }

    @Override // ym5.m1
    public void onItemRangeMoved(int i17, int i18, int i19) {
        com.tencent.mm.plugin.finder.feed.to toVar = this.f107392d.f108588e;
        if (toVar != null) {
            toVar.g().onItemRangeMoved(i17, i18, i19);
        }
    }

    @Override // ym5.m1
    public void onItemRangeRemoved(int i17, int i18) {
        com.tencent.mm.plugin.finder.feed.to toVar = this.f107392d.f108588e;
        if (toVar != null) {
            toVar.g().onItemRangeRemoved(i17, i18);
        }
    }

    @Override // ym5.p1
    public void onPreFinishLoadMore(ym5.s3 reason) {
        kotlin.jvm.internal.o.g(reason, "reason");
        com.tencent.mm.plugin.finder.feed.to toVar = this.f107392d.f108588e;
        if (toVar != null) {
            toVar.g().O(reason);
        }
    }

    @Override // ym5.p1
    public void onPreFinishLoadMoreSmooth(ym5.s3 reason) {
        kotlin.jvm.internal.o.g(reason, "reason");
        com.tencent.mm.plugin.finder.feed.to toVar = this.f107392d.f108588e;
        if (toVar != null) {
            toVar.g().onPreFinishLoadMoreSmooth(reason);
        }
    }

    @Override // ym5.p1
    public void onPreFinishRefresh(ym5.s3 reason) {
        kotlin.jvm.internal.o.g(reason, "reason");
        com.tencent.mm.plugin.finder.feed.to toVar = this.f107392d.f108588e;
        if (toVar != null) {
            toVar.g().Q(reason);
        }
    }

    @Override // ym5.m1
    public void onItemRangeChanged(int i17, int i18, java.lang.Object obj) {
        com.tencent.mm.plugin.finder.feed.to toVar = this.f107392d.f108588e;
        if (toVar != null) {
            toVar.g().onItemRangeChanged(i17, i18, obj);
        }
    }
}

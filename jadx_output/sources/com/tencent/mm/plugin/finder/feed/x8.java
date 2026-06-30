package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class x8 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.b9 f111046d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.autogen.events.FeedUpdateEvent f111047e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x8(com.tencent.mm.plugin.finder.feed.b9 b9Var, com.tencent.mm.autogen.events.FeedUpdateEvent feedUpdateEvent) {
        super(0);
        this.f111046d = b9Var;
        this.f111047e = feedUpdateEvent;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.feed.i0 i0Var;
        com.tencent.mm.plugin.finder.feed.i0 i0Var2;
        com.tencent.mm.plugin.finder.feed.b9 b9Var = this.f111046d;
        java.lang.String v17 = b9Var.v();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("feedChangeListener ");
        com.tencent.mm.autogen.events.FeedUpdateEvent feedUpdateEvent = this.f111047e;
        sb6.append(feedUpdateEvent.f54252g.f6918a);
        com.tencent.mars.xlog.Log.i(v17, sb6.toString());
        java.util.ArrayList arrayList = b9Var.f106364u;
        if (arrayList.size() > 0) {
            long itemId = ((so2.j5) arrayList.get(0)).getItemId();
            am.ia iaVar = feedUpdateEvent.f54252g;
            long j17 = iaVar.f6918a;
            if (itemId == j17 && j17 != 0) {
                int i17 = iaVar.f6919b;
                if (i17 == 0) {
                    com.tencent.mm.plugin.finder.feed.i0 i0Var3 = b9Var.f106424g;
                    if (i0Var3 != null) {
                        i0Var3.a().notifyItemRangeChanged(0, 1, 1);
                    }
                } else if (i17 == 4) {
                    com.tencent.mm.plugin.finder.feed.i0 i0Var4 = b9Var.f106424g;
                    if (i0Var4 != null) {
                        i0Var4.a().notifyItemRangeChanged(0, 1, new jz5.l(3, 1));
                    }
                    if (iaVar.f6928k > 0 && (i0Var = b9Var.f106424g) != null) {
                        i0Var.a().notifyItemRangeChanged(0, 1, new jz5.l(35, feedUpdateEvent));
                    }
                } else if (i17 == 5) {
                    com.tencent.mm.plugin.finder.feed.i0 i0Var5 = b9Var.f106424g;
                    if (i0Var5 != null) {
                        i0Var5.a().notifyItemRangeChanged(0, 1, new jz5.l(4, 1));
                    }
                    if (iaVar.f6928k > 0 && (i0Var2 = b9Var.f106424g) != null) {
                        i0Var2.a().notifyItemRangeChanged(0, 1, new jz5.l(35, feedUpdateEvent));
                    }
                }
            }
        }
        return jz5.f0.f302826a;
    }
}

package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class io extends com.tencent.mm.plugin.finder.playlist.d {

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f103680e;

    public io(java.lang.String authorFinderUsername) {
        kotlin.jvm.internal.o.g(authorFinderUsername, "authorFinderUsername");
        this.f103680e = authorFinderUsername;
    }

    @Override // com.tencent.mm.plugin.finder.playlist.d, in5.r
    public int e() {
        return com.tencent.mm.R.layout.dhq;
    }

    @Override // com.tencent.mm.plugin.finder.playlist.d
    public void o(in5.s0 holder, r45.vx0 info, int i17) {
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(info, "info");
        com.tencent.mm.plugin.finder.report.d2 d2Var = com.tencent.mm.plugin.finder.report.d2.f124994a;
        android.view.View itemView = holder.itemView;
        kotlin.jvm.internal.o.f(itemView, "itemView");
        com.tencent.mm.plugin.finder.report.d2.m(d2Var, itemView, "member_zone_collection", 8, 0, kz5.c1.k(new jz5.l("author_finder_username", this.f103680e), new jz5.l("collection_id", pm0.v.u(info.getLong(0))), new jz5.l("collection_location_id", java.lang.Integer.valueOf(i17))), null, 40, null);
    }
}

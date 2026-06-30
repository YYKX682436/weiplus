package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class n8 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.t8 f108563d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.model.BaseFinderFeed f108564e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n8(com.tencent.mm.plugin.finder.feed.t8 t8Var, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed) {
        super(1);
        this.f108563d = t8Var;
        this.f108564e = baseFinderFeed;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String D0;
        int i17;
        com.tencent.mm.plugin.finder.feed.i0 i0Var;
        androidx.recyclerview.widget.RecyclerView recyclerView;
        androidx.recyclerview.widget.f2 adapter;
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        com.tencent.mm.plugin.finder.feed.t8 t8Var = this.f108563d;
        java.lang.String str = t8Var.P;
        if (fVar != null && str != null) {
            eo2.f.f255565a.g(str, fVar);
        }
        jz5.f0 f0Var = jz5.f0.f302826a;
        java.lang.String str2 = "";
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = this.f108564e;
        if (fVar != null && (i17 = fVar.f70615a) == 0 && i17 == 0 && eo2.f.f255565a.d(java.lang.Integer.valueOf(((r45.xr0) fVar.f70618d).f390352e))) {
            dw2.c0 c0Var = t8Var.f106429o.f223703n;
            if (c0Var != null) {
                c0Var.y("memberVideo", false, true);
            }
            if (t8Var.G != 0 && (i0Var = t8Var.f106424g) != null && (recyclerView = i0Var.getRecyclerView()) != null && (adapter = recyclerView.getAdapter()) != null) {
                adapter.notifyItemChanged(0, new jz5.l(53, java.lang.Long.valueOf(t8Var.G)));
            }
            com.tencent.mm.plugin.finder.feed.i0 i0Var2 = t8Var.f106424g;
            com.tencent.mm.plugin.finder.feed.w8 w8Var = i0Var2 instanceof com.tencent.mm.plugin.finder.feed.w8 ? (com.tencent.mm.plugin.finder.feed.w8) i0Var2 : null;
            if (w8Var != null) {
                java.lang.String str3 = t8Var.P;
                if (str3 == null) {
                    ya2.b2 contact = baseFinderFeed.getContact();
                    D0 = contact != null ? contact.D0() : null;
                    if (D0 != null) {
                        str2 = D0;
                    }
                } else {
                    str2 = str3;
                }
                w8Var.y(false, false, str2, baseFinderFeed);
                return f0Var;
            }
        } else {
            com.tencent.mm.plugin.finder.feed.i0 i0Var3 = t8Var.f106424g;
            com.tencent.mm.plugin.finder.feed.w8 w8Var2 = i0Var3 instanceof com.tencent.mm.plugin.finder.feed.w8 ? (com.tencent.mm.plugin.finder.feed.w8) i0Var3 : null;
            if (w8Var2 != null) {
                java.lang.String str4 = t8Var.P;
                if (str4 == null) {
                    ya2.b2 contact2 = baseFinderFeed.getContact();
                    D0 = contact2 != null ? contact2.D0() : null;
                    if (D0 != null) {
                        str2 = D0;
                    }
                } else {
                    str2 = str4;
                }
                w8Var2.y(true, true, str2, baseFinderFeed);
                return f0Var;
            }
        }
        return null;
    }
}

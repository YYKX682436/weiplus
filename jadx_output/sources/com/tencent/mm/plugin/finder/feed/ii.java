package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes10.dex */
public final class ii implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.li f107034d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cd2.c f107035e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f107036f;

    public ii(com.tencent.mm.plugin.finder.feed.li liVar, cd2.c cVar, int i17) {
        this.f107034d = liVar;
        this.f107035e = cVar;
        this.f107036f = i17;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        com.tencent.mm.plugin.finder.feed.li liVar = this.f107034d;
        if (itemId == liVar.f107305r) {
            com.tencent.mm.plugin.finder.feed.uh uhVar = liVar.f107294d;
            byte[] bArr = (byte[]) uhVar.f109187i.get(java.lang.Integer.valueOf(uhVar.f109183e));
            if (bArr == null) {
                bArr = new byte[0];
            }
            com.tencent.mm.protobuf.g b17 = com.tencent.mm.protobuf.g.b(bArr);
            az2.c cVar = az2.f.f16125d;
            com.tencent.mm.ui.MMActivity mMActivity = liVar.f107297g;
            az2.f a17 = az2.c.a(cVar, mMActivity, mMActivity.getResources().getString(com.tencent.mm.R.string.f9y), 200L, null, 8, null);
            a17.a();
            i95.m c17 = i95.n0.c(cq.k.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            java.lang.String str = (java.lang.String) ((jz5.n) uhVar.f109189n).getValue();
            cd2.c cVar2 = this.f107035e;
            cq.j1.e((cq.k) c17, str, cVar2.i(), null, cVar2.l(), cVar2.a(), b17, cVar2.p(), cVar2.o(), new com.tencent.mm.plugin.finder.feed.fi(a17, cVar2, liVar, this.f107036f), new com.tencent.mm.plugin.finder.feed.gi(a17, cVar2, liVar), new com.tencent.mm.plugin.finder.feed.hi(a17));
        }
    }
}

package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes10.dex */
public final class cf implements lj2.t0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.kf f106471a;

    public cf(com.tencent.mm.plugin.finder.feed.kf kfVar) {
        this.f106471a = kfVar;
    }

    @Override // lj2.t0
    public java.lang.String G(int i17) {
        java.lang.String str = (java.lang.String) this.f106471a.f107192f.get(java.lang.Integer.valueOf(i17));
        return str == null ? "" : str;
    }

    @Override // lj2.t0
    public int I() {
        return this.f106471a.G;
    }

    @Override // lj2.t0
    public boolean M() {
        return this.f106471a.f107198l;
    }

    @Override // lj2.t0
    public int a() {
        return this.f106471a.I;
    }

    @Override // lj2.t0
    public void b(yz5.l callback) {
        com.tencent.mm.plugin.finder.storage.FeedData feedData;
        kotlin.jvm.internal.o.g(callback, "callback");
        com.tencent.mm.plugin.finder.feed.kf kfVar = this.f106471a;
        java.lang.String str = kfVar.f107209w;
        if (!(str.length() > 0)) {
            str = null;
        }
        if (str == null && ((feedData = kfVar.f107194h) == null || (str = feedData.getUserName()) == null)) {
            str = "";
        }
        ya2.b2 b17 = ya2.h.f460484a.b(str);
        if (b17 != null) {
            zl2.r4.f473950a.Y(b17.y0(), new com.tencent.mm.plugin.finder.feed.bf(callback));
        }
    }

    @Override // lj2.t0
    public java.util.List g() {
        java.util.List list = this.f106471a.f107210x;
        kotlin.jvm.internal.o.f(list, "access$getAnchorPkUserList$p(...)");
        return list;
    }

    @Override // lj2.t0
    public int k() {
        return this.f106471a.H;
    }

    @Override // lj2.t0
    public java.util.List l() {
        java.util.List list = this.f106471a.f107211y;
        kotlin.jvm.internal.o.f(list, "access$getAudienceUserList$p(...)");
        return list;
    }

    @Override // lj2.t0
    public java.lang.String p() {
        return this.f106471a.f107208v;
    }

    @Override // lj2.t0
    public java.lang.String r() {
        return this.f106471a.f107209w;
    }

    @Override // lj2.t0
    public int y() {
        return 0;
    }
}

package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class kv extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f103862d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ys f103863e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.FinderStreamCardAlbumConvert$fetchContent$loader$1 f103864f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.ew f103865g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ r45.vd6 f103866h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ yz5.l f103867i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kv(boolean z17, com.tencent.mm.plugin.finder.feed.ys ysVar, com.tencent.mm.plugin.finder.convert.FinderStreamCardAlbumConvert$fetchContent$loader$1 finderStreamCardAlbumConvert$fetchContent$loader$1, com.tencent.mm.plugin.finder.convert.ew ewVar, r45.vd6 vd6Var, yz5.l lVar) {
        super(1);
        this.f103862d = z17;
        this.f103863e = ysVar;
        this.f103864f = finderStreamCardAlbumConvert$fetchContent$loader$1;
        this.f103865g = ewVar;
        this.f103866h = vd6Var;
        this.f103867i = lVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        r45.z91 z91Var;
        java.util.LinkedList list;
        fp0.r task = (fp0.r) obj;
        kotlin.jvm.internal.o.g(task, "task");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[fetchContent#execute] isRefresh=");
        boolean z17 = this.f103862d;
        sb6.append(z17);
        sb6.append(' ');
        com.tencent.mm.plugin.finder.feed.ys ysVar = this.f103863e;
        sb6.append(fb2.l.a(ysVar.f111192d));
        com.tencent.mars.xlog.Log.i("Finder.FinderStreamCardAlbumConvert", sb6.toString());
        com.tencent.mm.plugin.finder.convert.FinderStreamCardAlbumConvert$fetchContent$loader$1 finderStreamCardAlbumConvert$fetchContent$loader$1 = this.f103864f;
        if (z17) {
            r45.xw2 xw2Var = (r45.xw2) ysVar.f111192d.getCustom(22);
            finderStreamCardAlbumConvert$fetchContent$loader$1.f107426q = xw2Var != null ? (r45.z91) xw2Var.getCustom(2) : null;
        } else {
            r45.xw2 xw2Var2 = (r45.xw2) ysVar.f111192d.getCustom(20);
            finderStreamCardAlbumConvert$fetchContent$loader$1.f107426q = xw2Var2 != null ? (r45.z91) xw2Var2.getCustom(2) : null;
        }
        com.tencent.mm.plugin.finder.convert.ew ewVar = this.f103865g;
        if (((java.lang.Boolean) ((jz5.n) ewVar.f103297i).getValue()).booleanValue()) {
            finderStreamCardAlbumConvert$fetchContent$loader$1.setPreload(ewVar.f103300o);
        }
        r45.vd6 vd6Var = this.f103866h;
        if (vd6Var != null && (z91Var = finderStreamCardAlbumConvert$fetchContent$loader$1.f107426q) != null && (list = z91Var.getList(22)) != null) {
            list.add(vd6Var);
        }
        finderStreamCardAlbumConvert$fetchContent$loader$1.f107430u = new com.tencent.mm.plugin.finder.convert.jv(task, this.f103863e, this.f103862d, this.f103865g, this.f103867i);
        finderStreamCardAlbumConvert$fetchContent$loader$1.requestRefresh();
        return jz5.f0.f302826a;
    }
}

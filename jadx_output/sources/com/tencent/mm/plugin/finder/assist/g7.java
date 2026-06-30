package com.tencent.mm.plugin.finder.assist;

/* loaded from: classes8.dex */
public final class g7 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.storage.FinderItem f102197d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.app.AppCompatActivity f102198e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f102199f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ db5.h4 f102200g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ yz5.l f102201h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g7(com.tencent.mm.plugin.finder.storage.FinderItem finderItem, boolean z17, androidx.appcompat.app.AppCompatActivity appCompatActivity, java.lang.String str, db5.h4 h4Var, yz5.l lVar) {
        super(1);
        this.f102197d = finderItem;
        this.f102198e = appCompatActivity;
        this.f102199f = str;
        this.f102200g = h4Var;
        this.f102201h = lVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        zy2.i iVar = (zy2.i) obj;
        if (iVar != null) {
            androidx.appcompat.app.AppCompatActivity appCompatActivity = this.f102198e;
            db5.h4 h4Var = this.f102200g;
            yz5.l lVar = this.f102201h;
            com.tencent.mm.plugin.finder.storage.FinderItem finderItem = this.f102197d;
            int i17 = finderItem.isNativeDramaFeed() ? 42 : finderItem.isMemberFeed() ? 36 : 18;
            ot0.q qVar = new ot0.q();
            qVar.f(iVar);
            qVar.f348666i = i17;
            qVar.f348654f = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.giz);
            qVar.f348674k = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f492409gj0);
            fc5.i iVar2 = new fc5.i();
            l15.c cVar = new l15.c();
            java.lang.String u17 = ot0.q.u(qVar, null, null);
            kotlin.jvm.internal.o.f(u17, "makeLocalContent(...)");
            cVar.fromXml(u17);
            iVar2.k(cVar);
            com.tencent.mm.plugin.finder.assist.f7 f7Var = new com.tencent.mm.plugin.finder.assist.f7(appCompatActivity, h4Var, finderItem, iVar, lVar);
            n13.t tVar = new n13.t();
            tVar.f334133a = f7Var;
            if (j62.e.g().c(new com.tencent.mm.repairer.config.forward.RepairerConfigFinderQuickForwardPauseFix()) == 1) {
                tVar.f334137e = false;
            }
            ((dk5.y) ((n13.a0) i95.n0.c(n13.a0.class))).wi(appCompatActivity, iVar2, this.f102199f, tVar);
        } else {
            com.tencent.mars.xlog.Log.i("FinderCommonService", "can not share!");
        }
        return jz5.f0.f302826a;
    }
}

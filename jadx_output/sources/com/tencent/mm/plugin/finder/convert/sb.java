package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class sb extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.qe f104533d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sb(com.tencent.mm.plugin.finder.convert.qe qeVar) {
        super(0);
        this.f104533d = qeVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed;
        com.tencent.mm.plugin.finder.convert.qe qeVar = this.f104533d;
        in5.s0 s0Var = qeVar.f104375z;
        if (s0Var != null && (baseFinderFeed = (com.tencent.mm.plugin.finder.model.BaseFinderFeed) s0Var.f293125i) != null) {
            android.content.Context context = s0Var.f293121e;
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            pf5.z zVar = pf5.z.f353948a;
            if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            ed2.i iVar = (ed2.i) zVar.a((androidx.appcompat.app.AppCompatActivity) context).e(ed2.i.class);
            boolean z17 = false;
            if (iVar != null) {
                if ((iVar.f251269e == ed2.a.f251253e) == true) {
                    z17 = true;
                }
            }
            if (z17) {
                zy2.m7 feedTipsStatus = baseFinderFeed.getFeedTipsStatus();
                zy2.l7 l7Var = feedTipsStatus != null ? feedTipsStatus.f477476b : null;
                if (l7Var != null) {
                    l7Var.f477455a = true;
                }
            } else {
                zy2.m7 feedTipsStatus2 = baseFinderFeed.getFeedTipsStatus();
                zy2.k7 k7Var = feedTipsStatus2 != null ? feedTipsStatus2.f477475a : null;
                if (k7Var != null) {
                    k7Var.f477442b = true;
                }
            }
            com.tencent.mars.xlog.Log.i("Finder.FeedFullConvert", "onClickToShare " + hc2.b0.f(baseFinderFeed, true) + ' ' + qeVar.P());
            android.view.View p17 = s0Var.p(com.tencent.mm.R.id.msw);
            kotlin.jvm.internal.o.f(p17, "getView(...)");
            qeVar.n0(s0Var, baseFinderFeed, p17, 3);
        }
        return jz5.f0.f302826a;
    }
}

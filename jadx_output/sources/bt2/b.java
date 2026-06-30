package bt2;

/* loaded from: classes3.dex */
public final class b implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bt2.c f24178d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.view.k0 f24179e;

    public b(bt2.c cVar, com.tencent.mm.plugin.finder.live.view.k0 k0Var) {
        this.f24178d = cVar;
        this.f24179e = k0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        jz5.f0 f0Var;
        dt2.d0 uiClickListener;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/replay/shopping/FinderLiveShoppingReplayDecorateUIC$initPlugins$1$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        bt2.c cVar = this.f24178d;
        com.tencent.mm.protocal.protobuf.FinderObject finderObject = ((mm2.c1) cVar.c(mm2.c1.class)).f328846n;
        if (finderObject != null) {
            if (com.tencent.mm.sdk.platformtools.t8.D0(finderObject.getUsername(), xy2.c.e(cVar.f449092b))) {
                i95.m c17 = i95.n0.c(c61.ub.class);
                kotlin.jvm.internal.o.f(c17, "getService(...)");
                c61.ub ubVar = (c61.ub) c17;
                androidx.appcompat.app.AppCompatActivity appCompatActivity = cVar.f449092b;
                long id6 = finderObject.getId();
                java.lang.String objectNonceId = finderObject.getObjectNonceId();
                java.lang.String str = objectNonceId == null ? "" : objectNonceId;
                r45.nw1 liveInfo = finderObject.getLiveInfo();
                if (liveInfo == null) {
                    liveInfo = new r45.nw1();
                }
                c61.ub.Rf(ubVar, appCompatActivity, id6, str, liveInfo, null, null, null, null, finderObject.getSessionBuffer(), null, null, 1776, null);
            } else {
                r45.wk0 wk0Var = new r45.wk0();
                wk0Var.set(0, "");
                wk0Var.set(1, "");
                wk0Var.set(2, java.lang.Boolean.FALSE);
                wk0Var.set(3, -1);
                wk0Var.set(4, -1);
                wk0Var.set(5, -1);
                wk0Var.set(6, null);
                ((vd2.f1) ((ss5.e0) i95.n0.c(ss5.e0.class))).Ni(cVar.f449092b, null, kz5.b0.c(finderObject), 0, wk0Var, null);
            }
            f0Var = jz5.f0.f302826a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            com.tencent.mars.xlog.Log.e(cVar.f24180d, "gotoFinderLive error finderObject is null!");
        }
        com.tencent.mm.plugin.finder.live.view.k0 k0Var = cVar.f449093c;
        if (k0Var != null) {
            k0Var.finish();
        }
        com.tencent.mm.plugin.finder.live.view.k0 k0Var2 = this.f24179e;
        com.tencent.mm.plugin.finder.replay.shopping.FinderLiveShoppingReplayPluginLayout finderLiveShoppingReplayPluginLayout = k0Var2 instanceof com.tencent.mm.plugin.finder.replay.shopping.FinderLiveShoppingReplayPluginLayout ? (com.tencent.mm.plugin.finder.replay.shopping.FinderLiveShoppingReplayPluginLayout) k0Var2 : null;
        if (finderLiveShoppingReplayPluginLayout != null && (uiClickListener = finderLiveShoppingReplayPluginLayout.getUiClickListener()) != null) {
            uiClickListener.c(qs5.o.f366456i);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/replay/shopping/FinderLiveShoppingReplayDecorateUIC$initPlugins$1$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes3.dex */
public final class qd extends com.tencent.mm.ui.component.UIComponent {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qd(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        if (getIntent().getIntExtra("finder_jump_type", 0) == 1) {
            try {
                java.lang.String stringExtra = getIntent().getStringExtra("finder_jump_data");
                if (stringExtra == null) {
                    stringExtra = "";
                }
                java.lang.String str = stringExtra;
                com.tencent.mm.plugin.finder.feed.nd ndVar = com.tencent.mm.plugin.finder.feed.nd.f108570a;
                com.tencent.mm.plugin.finder.feed.nd.f108573d = new com.tencent.mm.plugin.finder.feed.pd(this);
                boolean booleanExtra = getIntent().getBooleanExtra("is_from_app_brand", false);
                zy2.b6 b6Var = (zy2.b6) i95.n0.c(zy2.b6.class);
                if (b6Var != null) {
                    ((c61.l7) b6Var).Zk(getActivity(), str, com.tencent.mm.plugin.finder.feed.nd.f108571b, com.tencent.mm.plugin.finder.feed.nd.f108572c, booleanExtra);
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace(pf5.o.TAG, e17, "reserveChannelsLive exception", new java.lang.Object[0]);
                com.tencent.mm.plugin.finder.feed.nd ndVar2 = com.tencent.mm.plugin.finder.feed.nd.f108570a;
                com.tencent.mm.plugin.finder.feed.nd.f108572c.a(-1);
            }
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        com.tencent.mm.plugin.finder.feed.nd.f108570a.a();
    }
}

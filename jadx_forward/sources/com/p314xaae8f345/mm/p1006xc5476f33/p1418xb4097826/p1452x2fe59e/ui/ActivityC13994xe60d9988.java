package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui;

@db5.a(m123858x6ac9171 = 50)
@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¨\u0006\b"}, d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/FinderLiveConcertUI;", "Lcom/tencent/mm/plugin/finder/ui/MMLiveFinderUI;", "Landroid/view/View;", "root", "Ljz5/f0;", "adjustStatusbarPadding", "<init>", "()V", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
@ul5.d(m168215x6ac9171 = 0)
/* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderLiveConcertUI */
/* loaded from: classes.dex */
public final class ActivityC13994xe60d9988 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15088xfbe96806 {
    /* renamed from: adjustStatusbarPadding */
    public final void m56576xb754b39f(android.view.View view) {
        if (view != null) {
            view.setPadding(view.getPaddingLeft(), view.getPaddingTop() + com.p314xaae8f345.mm.ui.bl.h(view.getContext()), view.getPaddingRight(), view.getPaddingBottom() + com.p314xaae8f345.mm.ui.bl.c(view.getContext()));
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15088xfbe96806, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        mo2550x7c2abd06(1);
        super.onCreate(bundle);
        m78583x85ccfe01(8);
        getWindow().addFlags(67108864);
        getWindow().clearFlags(67108864);
        getWindow().getDecorView().setSystemUiVisibility(1792);
        getWindow().addFlags(Integer.MIN_VALUE);
        getWindow().setStatusBarColor(0);
        getWindow().setNavigationBarColor(0);
        getWindow().setFormat(-3);
        getWindow().setSoftInputMode(51);
        m56576xb754b39f(findViewById(com.p314xaae8f345.mm.R.id.evr));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa, com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8
    /* renamed from: superImportUIComponents */
    public void mo43518x5e67c7ca(java.util.HashSet set) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(set, "set");
        super.mo43518x5e67c7ca(set);
        set.add(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.af.class);
    }
}

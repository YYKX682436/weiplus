package s74;

/* loaded from: classes4.dex */
public final class j implements w64.w {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s74.o0 f485892a;

    public j(s74.o0 o0Var) {
        this.f485892a = o0Var;
    }

    @Override // w64.w
    public void a(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("seek", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent$bindComponentModel$6$animInfo$1$seekable$1");
        s74.o0 o0Var = this.f485892a;
        if (o0Var.C().b().getChildCount() > 0) {
            android.view.View childAt = o0Var.C().b().getChildAt(0);
            if (childAt instanceof com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17983xb14a9c8d) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17983xb14a9c8d) childAt).M(0, false);
                s74.o2 o2Var = (s74.o2) o0Var;
                o2Var.getClass();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onVideoSeekToBegin", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicComponent");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("DynamicComponent", "the onVideoSeekToBegin is called, hasProcessOnVideoEnd is " + o2Var.M);
                o2Var.Z();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onVideoSeekToBegin", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicComponent");
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("seek", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent$bindComponentModel$6$animInfo$1$seekable$1");
    }
}

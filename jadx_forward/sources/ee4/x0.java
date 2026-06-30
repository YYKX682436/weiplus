package ee4;

/* loaded from: classes4.dex */
public final class x0 extends ee4.t {

    /* renamed from: n, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.r2 f333301n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(ce4.b pcContext) {
        super(pcContext);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pcContext, "pcContext");
    }

    @Override // ce4.a
    public java.util.ArrayList b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("dependComponents", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicMediaErrorPc");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(l());
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("dependComponents", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicMediaErrorPc");
        return arrayList;
    }

    @Override // ce4.a
    public java.lang.String d() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getTag", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicMediaErrorPc");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getTag", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicMediaErrorPc");
        return "SnsPublish.MultiPicMediaErrorPc";
    }

    @Override // ce4.a
    public boolean h(android.os.Bundle bundle) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onCreate", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicMediaErrorPc");
        if (!super.h(bundle)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onCreate", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicMediaErrorPc");
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("initCollectLivePhotoWorkFlowJob", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicMediaErrorPc");
        this.f333301n = p3325xe03a0797.p3326xc267989b.l.d(o().p(), null, null, new ee4.w0(this, null), 3, null);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initCollectLivePhotoWorkFlowJob", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicMediaErrorPc");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onCreate", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicMediaErrorPc");
        return true;
    }

    @Override // ce4.a
    public void i() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onDestroy", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicMediaErrorPc");
        super.i();
        p3325xe03a0797.p3326xc267989b.r2 r2Var = this.f333301n;
        if (r2Var != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
        }
        this.f333301n = null;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDestroy", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicMediaErrorPc");
    }
}

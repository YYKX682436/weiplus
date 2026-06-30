package ee4;

/* loaded from: classes4.dex */
public final class n0 implements p3325xe03a0797.p3326xc267989b.p3328x30012e.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ee4.r0 f333261d;

    public n0(ee4.r0 r0Var) {
        this.f333261d = r0Var;
    }

    @Override // p3325xe03a0797.p3326xc267989b.p3328x30012e.k
    /* renamed from: emit */
    public java.lang.Object mo771x2f8fd3(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("emit", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicLivePhotoWorkPc$initCollectEventJob$1$1");
        jz5.l lVar = (jz5.l) obj;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("emit", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicLivePhotoWorkPc$initCollectEventJob$1$1");
        java.lang.String str = "collect event code: " + ((java.lang.Number) lVar.f384366d).intValue();
        ee4.r0 r0Var = this.f333261d;
        r0Var.f(str);
        java.lang.Number number = (java.lang.Number) lVar.f384366d;
        int intValue = number.intValue();
        if (intValue == 1) {
            ee4.r0.p(r0Var, true);
        } else if (intValue != 2) {
            r0Var.e("invalid code >> " + number.intValue());
        } else {
            ee4.r0.p(r0Var, false);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("emit", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicLivePhotoWorkPc$initCollectEventJob$1$1");
        jz5.f0 f0Var = jz5.f0.f384359a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("emit", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicLivePhotoWorkPc$initCollectEventJob$1$1");
        return f0Var;
    }
}

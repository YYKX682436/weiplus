package ee4;

/* loaded from: classes4.dex */
public final class h1 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f333247a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f333248b;

    public h1(boolean z17, boolean z18) {
        this.f333247a = z17;
        this.f333248b = z18;
    }

    /* renamed from: equals */
    public boolean m127521xb2c87fbf(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("equals", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.SnsLivePhotoCheckWorkJobResult");
        if (this == obj) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.SnsLivePhotoCheckWorkJobResult");
            return true;
        }
        if (!(obj instanceof ee4.h1)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.SnsLivePhotoCheckWorkJobResult");
            return false;
        }
        ee4.h1 h1Var = (ee4.h1) obj;
        if (this.f333247a != h1Var.f333247a) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.SnsLivePhotoCheckWorkJobResult");
            return false;
        }
        boolean z17 = this.f333248b;
        boolean z18 = h1Var.f333248b;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.SnsLivePhotoCheckWorkJobResult");
        return z17 == z18;
    }

    /* renamed from: hashCode */
    public int m127522x8cdac1b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("hashCode", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.SnsLivePhotoCheckWorkJobResult");
        int hashCode = (java.lang.Boolean.hashCode(this.f333247a) * 31) + java.lang.Boolean.hashCode(this.f333248b);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("hashCode", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.SnsLivePhotoCheckWorkJobResult");
        return hashCode;
    }

    /* renamed from: toString */
    public java.lang.String m127523x9616526c() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("toString", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.SnsLivePhotoCheckWorkJobResult");
        java.lang.String str = "SnsLivePhotoCheckWorkJobResult(isNeedToCancelPublish=" + this.f333247a + ", isBlockPublishToShowLoading=" + this.f333248b + ')';
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("toString", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.SnsLivePhotoCheckWorkJobResult");
        return str;
    }
}

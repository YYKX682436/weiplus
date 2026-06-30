package i33;

/* loaded from: classes10.dex */
public final class s1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5683x770cde8a f369777d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui.uic.C15668x4eca9882 f369778e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s1(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5683x770cde8a c5683x770cde8a, com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui.uic.C15668x4eca9882 c15668x4eca9882) {
        super(0);
        this.f369777d = c5683x770cde8a;
        this.f369778e = c15668x4eca9882;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("mediaId: ");
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5683x770cde8a c5683x770cde8a = this.f369777d;
        sb6.append(c5683x770cde8a.f136009g.f90099a);
        sb6.append(" isUseLivePhoto:");
        am.zi ziVar = c5683x770cde8a.f136009g;
        sb6.append(ziVar.f90100b);
        sb6.append(" scene: ");
        sb6.append(ziVar.f90101c);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImagePreviewEventUIC", sb6.toString());
        com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui.uic.C15668x4eca9882 c15668x4eca9882 = this.f369778e;
        c15668x4eca9882.getClass();
        if (ziVar.f90101c == 1) {
            android.app.Activity m80379x76847179 = c15668x4eca9882.m80379x76847179();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m80379x76847179, "null cannot be cast to non-null type com.tencent.mm.plugin.gallery.ui.ImagePreviewUI");
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui.ActivityC15656x6f26b561) m80379x76847179).f220114f;
            e33.h5 h5Var = (c1163xf1deaba4 == null || (mo7946xf939df19 = c1163xf1deaba4.mo7946xf939df19()) == null) ? null : (e33.h5) mo7946xf939df19;
            if (h5Var != null && !android.text.TextUtils.isEmpty(ziVar.f90102d)) {
                int indexOf = h5Var.f328793h.indexOf(ziVar.f90102d);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImagePreviewEventUIC", "notifyMediaDataChange index: " + indexOf);
                if (indexOf >= 0) {
                    h5Var.m8147xed6e4d18(indexOf);
                    android.app.Activity m80379x768471792 = c15668x4eca9882.m80379x76847179();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m80379x768471792, "null cannot be cast to non-null type com.tencent.mm.plugin.gallery.ui.ImagePreviewUI");
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui.ActivityC15656x6f26b561) m80379x768471792).s7();
                }
            }
        }
        return jz5.f0.f384359a;
    }
}

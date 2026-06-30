package ed4;

/* loaded from: classes4.dex */
public class s implements jb4.u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.q0 f332856a;

    public s(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.q0 q0Var) {
        this.f332856a = q0Var;
    }

    @Override // jb4.u
    public void a(boolean z17, java.lang.String str, android.graphics.Bitmap bitmap, java.lang.String str2) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onFinish", "com.tencent.mm.plugin.sns.ui.item.SphereCardAdTimeLineItem$2");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SphereImageView.SphereCardAdTimeLineItem", "ImageLoader onFinish, isSucc=" + z17 + ", errInfo=" + str);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.q0 q0Var = this.f332856a;
        if (q0Var.f250941s == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SphereImageView.SphereCardAdTimeLineItem", "onFinish, mViewHolder==null");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onFinish", "com.tencent.mm.plugin.sns.ui.item.SphereCardAdTimeLineItem$2");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p pVar = q0Var.f250940r;
        java.lang.String str3 = pVar != null ? pVar.f247628g : "";
        if (str2 == null || !str2.equals(str3)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SphereImageView.SphereCardAdTimeLineItem", "onFinish, url != nowUrl");
        } else {
            q0Var.f250941s.G0.j(bitmap, str2);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onFinish", "com.tencent.mm.plugin.sns.ui.item.SphereCardAdTimeLineItem$2");
    }

    @Override // jb4.u
    public void b(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onStart", "com.tencent.mm.plugin.sns.ui.item.SphereCardAdTimeLineItem$2");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onStart", "com.tencent.mm.plugin.sns.ui.item.SphereCardAdTimeLineItem$2");
    }
}

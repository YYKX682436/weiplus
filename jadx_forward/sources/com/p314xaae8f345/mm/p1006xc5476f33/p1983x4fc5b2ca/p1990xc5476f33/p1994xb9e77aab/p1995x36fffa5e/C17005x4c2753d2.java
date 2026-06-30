package com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1994xb9e77aab.p1995x36fffa5e;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¨\u0006\u000b"}, d2 = {"Lcom/tencent/mm/plugin/recordvideo/plugin/improve_photo/finder_cover/FinderLiveAvatarEditPluginLayout;", "Lcom/tencent/mm/plugin/recordvideo/plugin/improve_photo/ImproveBaseEditPhotoLayout;", "", "Ldu3/e;", "getFuncButtonOrder", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-recordvideo_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.recordvideo.plugin.improve_photo.finder_cover.FinderLiveAvatarEditPluginLayout */
/* loaded from: classes3.dex */
public final class C17005x4c2753d2 extends com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1994xb9e77aab.C17003xb6ccea09 {

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ int f237301w = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17005x4c2753d2(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1994xb9e77aab.C17003xb6ccea09
    /* renamed from: getFuncButtonOrder */
    public java.util.List<du3.e> mo67938x5bd3d3a2() {
        return kz5.c0.i(du3.e.f325098g, du3.e.f325095d, du3.e.f325096e, du3.e.f325097f, du3.e.f325099h, du3.e.f325100i);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1994xb9e77aab.C17003xb6ccea09, com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1996xc4ab08aa.AbstractC17010x26b2d1ce
    public void r(ct0.b bVar) {
        float f17;
        android.os.Bundle bundle;
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 configProvider = getConfigProvider();
        float f18 = 0.75f;
        if (configProvider != null && (bundle = configProvider.M) != null) {
            f18 = bundle.getFloat("crop_fix_ratio", 0.75f);
        }
        float f19 = f18;
        m67943x22b6fe95(f19);
        qc0.y0 y0Var = (qc0.y0) i95.n0.c(qc0.y0.class);
        if (y0Var != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 configProvider2 = getConfigProvider();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(configProvider2);
            f17 = f19;
            qc0.a aVar = new qc0.a(this, this, configProvider2, new gu3.a(this), com.p314xaae8f345.mm.R.id.pxc, com.p314xaae8f345.mm.R.id.pvk, com.p314xaae8f345.mm.R.id.pv7, com.p314xaae8f345.mm.R.id.px_, com.p314xaae8f345.mm.R.id.px8, com.p314xaae8f345.mm.R.id.px7, new gu3.b(this), false, 2048, null);
            eg2.a0 a0Var = (eg2.a0) y0Var;
            android.view.ViewGroup viewGroup = a0Var.f334063d;
            android.view.ViewGroup viewGroup2 = aVar.f442880b;
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(viewGroup, viewGroup2)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FinderLiveCoverEditDelegateImpl", "setupCoverEditPlugins already called for this page, skip");
            } else {
                a0Var.f334063d = viewGroup2;
                ju3.d0 d0Var = aVar.f442879a;
                new eg2.x(d0Var, viewGroup2, aVar);
                eg2.n nVar = new eg2.n(d0Var, viewGroup2, aVar);
                new eg2.p(d0Var, viewGroup2, aVar).f334144o = new eg2.y(nVar);
                nVar.f334131s = new eg2.z(aVar);
            }
        } else {
            f17 = f19;
        }
        super.r(bVar);
        post(new gu3.c(this));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderLiveAvatarEditPluginLayout", "loadCurrentPage: cropRatio=" + f17);
    }
}

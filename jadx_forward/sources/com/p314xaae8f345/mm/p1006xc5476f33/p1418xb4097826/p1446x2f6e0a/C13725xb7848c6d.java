package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1446x2f6e0a;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002R$\u0010\r\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u0014"}, d2 = {"Lcom/tencent/mm/plugin/finder/edit/FinderLiveFixRatioPhoneEditPluginLayout;", "Lcom/tencent/mm/plugin/recordvideo/plugin/parent/EditPhotoPluginLayout;", "", com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714, "Ljz5/f0;", "setOutputSize", "Landroid/view/ViewGroup;", "w", "Landroid/view/ViewGroup;", "getLayout", "()Landroid/view/ViewGroup;", "setLayout", "(Landroid/view/ViewGroup;)V", "layout", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-vlog-finder_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.edit.FinderLiveFixRatioPhoneEditPluginLayout */
/* loaded from: classes3.dex */
public final class C13725xb7848c6d extends com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1996xc4ab08aa.C17015x41d97285 {

    /* renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ int f186837x = 0;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    public android.view.ViewGroup layout;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13725xb7848c6d(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        com.p314xaae8f345.mm.p647x5a0af82.C10322x22f91ed2 a17 = com.p314xaae8f345.mm.p647x5a0af82.C10322x22f91ed2.a();
        java.lang.String str = com.p314xaae8f345.mm.vfs.q7.c("finder") + '/';
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EditPhotoPluginLayout", "FINDER_DATA_ROOT=" + str);
        java.lang.String str2 = str + "image/";
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EditPhotoPluginLayout", "FINDER_IMG_DIR=" + str2);
        a17.g(str2 + "cover_edit_for_output");
    }

    /* renamed from: setOutputSize */
    private final void m55751xd0770aa4(java.lang.String str) {
        android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.x.J(str, options);
        if (options.outWidth <= 0 || options.outHeight <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EditPhotoPluginLayout", "setOutputSize getOption error. path:" + str);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EditPhotoPluginLayout", "setOutputSize config[origin[" + options.outWidth + ',' + options.outHeight + "] target[1080,1440]");
        l45.q qVar = getEditPhotoWrapper().f547120o;
        if (qVar != null) {
            ((l45.n) qVar).x(1080, 1440);
        }
    }

    public final android.view.ViewGroup getLayout() {
        return this.layout;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1996xc4ab08aa.C17015x41d97285, com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1996xc4ab08aa.AbstractC17010x26b2d1ce
    public void r(ct0.b bVar) {
        android.os.Bundle bundle;
        super.r(bVar);
        l45.q qVar = getEditPhotoWrapper().f547120o;
        if (qVar != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 configProvider = getConfigProvider();
            ((l45.n) qVar).f398001i = (configProvider == null || (bundle = configProvider.M) == null) ? 0.75f : bundle.getFloat("crop_fix_ratio");
        }
        l45.q qVar2 = getEditPhotoWrapper().f547120o;
        l45.n nVar = qVar2 instanceof l45.n ? (l45.n) qVar2 : null;
        if (nVar != null) {
            nVar.f398002j = true;
            java.util.Iterator it = nVar.f397996d.iterator();
            while (it.hasNext()) {
                dl.b bVar2 = (dl.b) it.next();
                if (bVar2 instanceof dl.t) {
                    dl.t tVar = (dl.t) bVar2;
                    tVar.F = false;
                    tVar.f316657r = (int) com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274608e.getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561247d7);
                }
            }
        }
        getPhotoControlUI().f547204d.setVisibility(8);
        postDelayed(new dc2.e(this), 300L);
        if (bVar != null) {
            m55751xd0770aa4(bVar.f303746j);
        }
    }

    /* renamed from: setLayout */
    public final void m55753x1627522c(android.view.ViewGroup viewGroup) {
        this.layout = viewGroup;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0100, code lost:
    
        if (r8.getBoolean("can_show_preview", false) == true) goto L35;
     */
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1996xc4ab08aa.C17015x41d97285, ju3.d0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void w(ju3.c0 r8, android.os.Bundle r9) {
        /*
            Method dump skipped, instructions count: 302
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1446x2f6e0a.C13725xb7848c6d.w(ju3.c0, android.os.Bundle):void");
    }
}

package com.tencent.mm.plugin.finder.edit;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002R$\u0010\r\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u0014"}, d2 = {"Lcom/tencent/mm/plugin/finder/edit/FinderLiveFixRatioPhoneEditPluginLayout;", "Lcom/tencent/mm/plugin/recordvideo/plugin/parent/EditPhotoPluginLayout;", "", com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH, "Ljz5/f0;", "setOutputSize", "Landroid/view/ViewGroup;", "w", "Landroid/view/ViewGroup;", "getLayout", "()Landroid/view/ViewGroup;", "setLayout", "(Landroid/view/ViewGroup;)V", "layout", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-vlog-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class FinderLiveFixRatioPhoneEditPluginLayout extends com.tencent.mm.plugin.recordvideo.plugin.parent.EditPhotoPluginLayout {

    /* renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ int f105304x = 0;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    public android.view.ViewGroup layout;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderLiveFixRatioPhoneEditPluginLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mm.cache.ArtistCacheManager a17 = com.tencent.mm.cache.ArtistCacheManager.a();
        java.lang.String str = com.tencent.mm.vfs.q7.c("finder") + '/';
        com.tencent.mars.xlog.Log.i("MicroMsg.EditPhotoPluginLayout", "FINDER_DATA_ROOT=" + str);
        java.lang.String str2 = str + "image/";
        com.tencent.mars.xlog.Log.i("MicroMsg.EditPhotoPluginLayout", "FINDER_IMG_DIR=" + str2);
        a17.g(str2 + "cover_edit_for_output");
    }

    private final void setOutputSize(java.lang.String str) {
        android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        com.tencent.mm.sdk.platformtools.x.J(str, options);
        if (options.outWidth <= 0 || options.outHeight <= 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.EditPhotoPluginLayout", "setOutputSize getOption error. path:" + str);
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.EditPhotoPluginLayout", "setOutputSize config[origin[" + options.outWidth + ',' + options.outHeight + "] target[1080,1440]");
        l45.q qVar = getEditPhotoWrapper().f465587o;
        if (qVar != null) {
            ((l45.n) qVar).x(1080, 1440);
        }
    }

    public final android.view.ViewGroup getLayout() {
        return this.layout;
    }

    @Override // com.tencent.mm.plugin.recordvideo.plugin.parent.EditPhotoPluginLayout, com.tencent.mm.plugin.recordvideo.plugin.parent.BasePluginLayout
    public void r(ct0.b bVar) {
        android.os.Bundle bundle;
        super.r(bVar);
        l45.q qVar = getEditPhotoWrapper().f465587o;
        if (qVar != null) {
            com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider configProvider = getConfigProvider();
            ((l45.n) qVar).f316468i = (configProvider == null || (bundle = configProvider.M) == null) ? 0.75f : bundle.getFloat("crop_fix_ratio");
        }
        l45.q qVar2 = getEditPhotoWrapper().f465587o;
        l45.n nVar = qVar2 instanceof l45.n ? (l45.n) qVar2 : null;
        if (nVar != null) {
            nVar.f316469j = true;
            java.util.Iterator it = nVar.f316463d.iterator();
            while (it.hasNext()) {
                dl.b bVar2 = (dl.b) it.next();
                if (bVar2 instanceof dl.t) {
                    dl.t tVar = (dl.t) bVar2;
                    tVar.F = false;
                    tVar.f235124r = (int) com.tencent.mm.sdk.platformtools.x2.f193075e.getDimension(com.tencent.mm.R.dimen.f479714d7);
                }
            }
        }
        getPhotoControlUI().f465671d.setVisibility(8);
        postDelayed(new dc2.e(this), 300L);
        if (bVar != null) {
            setOutputSize(bVar.f222213j);
        }
    }

    public final void setLayout(android.view.ViewGroup viewGroup) {
        this.layout = viewGroup;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0100, code lost:
    
        if (r8.getBoolean("can_show_preview", false) == true) goto L35;
     */
    @Override // com.tencent.mm.plugin.recordvideo.plugin.parent.EditPhotoPluginLayout, ju3.d0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void w(ju3.c0 r8, android.os.Bundle r9) {
        /*
            Method dump skipped, instructions count: 302
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.edit.FinderLiveFixRatioPhoneEditPluginLayout.w(ju3.c0, android.os.Bundle):void");
    }
}

package xc5;

/* loaded from: classes12.dex */
public final class f2 extends lf3.n implements bg3.f {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f2(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
    }

    @Override // bg3.f
    public void S2(mf3.k mediaInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaInfo, "mediaInfo");
        xc5.c cVar = mediaInfo instanceof xc5.c ? (xc5.c) mediaInfo : null;
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = cVar != null ? cVar.f534932a : null;
        if (f9Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MsgHistoryGallerySaveComponent", "save fail, mediaInfo is not BaseMsgHistoryGalleryMediaInfo");
            return;
        }
        boolean z17 = mediaInfo.mo147256x74bf41ce() == mf3.w.f407662e;
        android.app.Activity context = m80379x76847179();
        java.util.List c17 = kz5.b0.c(f9Var);
        xc5.e2 e2Var = new xc5.e2(this);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a c20976x6ba6452a = gm0.j1.b().f354778h.f354678e;
        if (c20976x6ba6452a == null || v65.i.b(c20976x6ba6452a, null, new zc5.l(c17, z17, true, context, e2Var, null), 1, null) == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MsgHistoryGalleryMediaHelper", "executeDownloadAndSave: accountScope is null, skip");
            e2Var.mo146xb9724478(java.lang.Boolean.FALSE);
        }
    }
}

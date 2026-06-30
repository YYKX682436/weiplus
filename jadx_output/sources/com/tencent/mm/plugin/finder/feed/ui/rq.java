package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes10.dex */
public final class rq extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f110514d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.SelectLocalFileRouterUI f110515e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rq(java.lang.String str, com.tencent.mm.plugin.finder.feed.ui.SelectLocalFileRouterUI selectLocalFileRouterUI) {
        super(0);
        this.f110514d = str;
        this.f110515e = selectLocalFileRouterUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.String str = this.f110514d;
        java.lang.String str2 = com.tencent.mm.plugin.finder.assist.e9.f102143l + c01.id.c() + '_' + com.tencent.mm.sdk.platformtools.t8.Y(8);
        try {
            com.tencent.mm.vfs.w6.c(str, str2);
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("FinderSelectLocalFileUI", th6, "uploadAudioTrack: copy error", new java.lang.Object[0]);
        }
        java.lang.String str3 = com.tencent.mm.vfs.w6.j(str2) ? str2 : str;
        dn.m mVar = new dn.m();
        com.tencent.mm.plugin.finder.feed.ui.SelectLocalFileRouterUI selectLocalFileRouterUI = this.f110515e;
        mVar.f241787f = (com.tencent.mm.plugin.finder.feed.ui.fq) ((jz5.n) selectLocalFileRouterUI.f109635m).getValue();
        java.lang.String str4 = "upload_" + com.tencent.mm.sdk.platformtools.w2.a(str3);
        selectLocalFileRouterUI.f109636n = str4;
        mVar.field_mediaId = str4;
        mVar.field_fullpath = str3;
        mVar.field_needStorage = true;
        mVar.field_fileType = 20305;
        mVar.field_appType = 251;
        mVar.Z = 8;
        mVar.field_bzScene = 2;
        mVar.A = 60;
        mVar.B = 600;
        mVar.field_priority = 2;
        if (!kotlin.jvm.internal.o.b(str2, str3)) {
            str2 = "";
        }
        selectLocalFileRouterUI.f109637o = str2;
        ((rx.l) ((sx.e0) i95.n0.c(sx.e0.class))).Bi(mVar);
        com.tencent.mars.xlog.Log.i("FinderSelectLocalFileUI", "uploadAudioTrack: start upload, curMediaId=" + selectLocalFileRouterUI.f109636n + ", uploadPath=" + str3 + ", originPath=" + str);
        return jz5.f0.f302826a;
    }
}

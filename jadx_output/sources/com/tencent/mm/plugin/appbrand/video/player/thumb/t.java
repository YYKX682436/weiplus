package com.tencent.mm.plugin.appbrand.video.player.thumb;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u00062\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u00002*\u0010\u0005\u001a&\u0012\f\u0012\n \u0001*\u0004\u0018\u00010\u00040\u0004 \u0001*\u0012\u0012\f\u0012\n \u0001*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/tencent/mm/plugin/webview/ui/tools/video/samelayer/finder/WebViewVideoFinderActionHandler$FinderVideoInfoForMpWrapper;", "kotlin.jvm.PlatformType", com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, "Lcom/tencent/mm/ipcinvoker/r;", "Lcom/tencent/mm/ipcinvoker/type/IPCVoid;", "callback", "Ljz5/f0;", "invoke", "(Lcom/tencent/mm/plugin/webview/ui/tools/video/samelayer/finder/WebViewVideoFinderActionHandler$FinderVideoInfoForMpWrapper;Lcom/tencent/mm/ipcinvoker/r;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes8.dex */
final class t<InputType, ResultType> implements com.tencent.mm.ipcinvoker.j {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.video.player.thumb.t f90905d = new com.tencent.mm.plugin.appbrand.video.player.thumb.t();

    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
        r45.n23 n23Var = ((com.tencent.mm.plugin.webview.ui.tools.video.samelayer.finder.WebViewVideoFinderActionHandler$FinderVideoInfoForMpWrapper) obj).f186983d;
        if (n23Var != null) {
            zy2.b6 b6Var = (zy2.b6) i95.n0.c(zy2.b6.class);
            com.tencent.mm.protocal.protobuf.FinderObject finderObject = (com.tencent.mm.protocal.protobuf.FinderObject) n23Var.getCustom(0);
            long id6 = finderObject != null ? finderObject.getId() : -1L;
            java.lang.String string = n23Var.getString(1);
            java.lang.String str = string == null ? "" : string;
            java.lang.String string2 = n23Var.getString(2);
            java.lang.String str2 = string2 == null ? "" : string2;
            int integer = n23Var.getInteger(4);
            java.lang.String string3 = n23Var.getString(5);
            ((c61.l7) b6Var).hl(id6, str, "", str2, integer, string3 == null ? "" : string3, n23Var.getInteger(13), n23Var.getLong(11), n23Var.getLong(12), n23Var.getInteger(14), n23Var.getInteger(15), n23Var.getString(6), n23Var.getString(7), n23Var.getBoolean(21));
        }
    }
}

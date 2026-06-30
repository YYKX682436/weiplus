package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class pk extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f104269d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f104270e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pk(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f104269d = jz5.h.b(new com.tencent.mm.plugin.finder.convert.mk(this));
        this.f104270e = jz5.h.b(com.tencent.mm.plugin.finder.convert.lk.f103932d);
    }

    public static void R6(com.tencent.mm.plugin.finder.convert.pk pkVar, int i17, long j17, java.lang.String str, int i18, in5.s0 s0Var, int i19, int i27, int i28, java.lang.Object obj) {
        pkVar.getClass();
        com.tencent.mm.plugin.finder.video.FinderVideoLayout finderVideoLayout = (com.tencent.mm.plugin.finder.video.FinderVideoLayout) s0Var.p(com.tencent.mm.R.id.e_k);
        int i29 = i17 != 1 ? i17 != 2 ? i17 != 3 ? 0 : 30000 : 30001 : 30002;
        com.tencent.mm.autogen.events.FinderFeedUiActionEvent finderFeedUiActionEvent = new com.tencent.mm.autogen.events.FinderFeedUiActionEvent();
        am.fb fbVar = finderFeedUiActionEvent.f54275g;
        fbVar.f6663a = j17;
        fbVar.f6669g = str;
        fbVar.f6664b = i29;
        fbVar.f6665c = finderVideoLayout != null ? finderVideoLayout.getVideoDurationSec() : 0;
        fbVar.f6666d = (int) ((finderVideoLayout != null ? finderVideoLayout.getCurrentPosMs() : 0L) / 1000);
        finderFeedUiActionEvent.e();
    }

    public final boolean O6(in5.s0 s0Var) {
        com.tencent.mm.plugin.finder.video.FinderVideoLayout finderVideoLayout = (com.tencent.mm.plugin.finder.video.FinderVideoLayout) s0Var.p(com.tencent.mm.R.id.e_k);
        cw2.da videoView = finderVideoLayout != null ? finderVideoLayout.getVideoView() : null;
        com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy finderThumbPlayerProxy = videoView instanceof com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy ? (com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy) videoView : null;
        return finderThumbPlayerProxy != null && finderThumbPlayerProxy.getCurrentPlayMs() > ((long) ((java.lang.Number) this.f104270e.getValue()).intValue());
    }

    public final boolean P6() {
        return ((java.lang.Boolean) this.f104269d.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0501  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0506  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x051a  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0649  */
    /* JADX WARN: Removed duplicated region for block: B:186:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0522  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0509  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0503  */
    /* JADX WARN: Type inference failed for: r0v125 */
    /* JADX WARN: Type inference failed for: r0v126 */
    /* JADX WARN: Type inference failed for: r0v36, types: [com.tencent.mm.plugin.finder.ui.qm] */
    /* JADX WARN: Type inference failed for: r1v28 */
    /* JADX WARN: Type inference failed for: r1v29, types: [android.widget.TextView] */
    /* JADX WARN: Type inference failed for: r1v66 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r2v16, types: [com.tencent.mm.ui.widget.imageview.WeImageView] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Q6(in5.s0 r31, int r32, com.tencent.mm.plugin.finder.model.BaseFinderFeed r33, int r34, com.tencent.mm.plugin.finder.feed.k8 r35, yz5.a r36) {
        /*
            Method dump skipped, instructions count: 1705
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.convert.pk.Q6(in5.s0, int, com.tencent.mm.plugin.finder.model.BaseFinderFeed, int, com.tencent.mm.plugin.finder.feed.k8, yz5.a):void");
    }

    public final void S6(com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, int i17, int i18) {
        if (i18 == 10) {
            com.tencent.mm.autogen.events.FinderFeedUiActionEvent finderFeedUiActionEvent = new com.tencent.mm.autogen.events.FinderFeedUiActionEvent();
            long id6 = baseFinderFeed.getFeedObject().getId();
            am.fb fbVar = finderFeedUiActionEvent.f54275g;
            fbVar.f6663a = id6;
            fbVar.f6669g = baseFinderFeed.w();
            fbVar.getClass();
            fbVar.f6664b = 40001;
            finderFeedUiActionEvent.e();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pk(androidx.fragment.app.Fragment fragment) {
        super(fragment);
        kotlin.jvm.internal.o.g(fragment, "fragment");
        this.f104269d = jz5.h.b(new com.tencent.mm.plugin.finder.convert.mk(this));
        this.f104270e = jz5.h.b(com.tencent.mm.plugin.finder.convert.lk.f103932d);
    }
}

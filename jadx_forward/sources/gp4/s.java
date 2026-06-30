package gp4;

/* loaded from: classes10.dex */
public final class s extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2328xc5476f33.p2331x84359257.C18801xf3fcf614 f355968d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2328xc5476f33.p2331x84359257.C18801xf3fcf614 c18801xf3fcf614) {
        super(0);
        this.f355968d = c18801xf3fcf614;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.view.ViewGroup m72577xb3ec4739;
        gp4.m m72582xd4d63606;
        com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2328xc5476f33.p2331x84359257.C18801xf3fcf614 c18801xf3fcf614 = this.f355968d;
        m72577xb3ec4739 = c18801xf3fcf614.m72577xb3ec4739();
        m72577xb3ec4739.setVisibility(8);
        c18801xf3fcf614.removeCallbacks(c18801xf3fcf614.I);
        m72582xd4d63606 = c18801xf3fcf614.m72582xd4d63606();
        m72582xd4d63606.setVisibility(4);
        yz5.l showCaptionDialogListener = c18801xf3fcf614.getShowCaptionDialogListener();
        if (showCaptionDialogListener != null) {
            android.view.View view = c18801xf3fcf614.f257497y;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(view, "null cannot be cast to non-null type com.tencent.mm.plugin.recordvideo.ui.editor.CaptionItemView");
            showCaptionDialogListener.mo146xb9724478((wu3.h) view);
        }
        return jz5.f0.f384359a;
    }
}

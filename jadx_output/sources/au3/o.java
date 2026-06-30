package au3;

/* loaded from: classes10.dex */
public final class o implements com.tencent.mm.plugin.mmsight.segment.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.recordvideo.plugin.cropvideo.EditVideoSeekBarView f14134a;

    public o(com.tencent.mm.plugin.recordvideo.plugin.cropvideo.EditVideoSeekBarView editVideoSeekBarView) {
        this.f14134a = editVideoSeekBarView;
    }

    @Override // com.tencent.mm.plugin.mmsight.segment.g
    public final void a(boolean z17) {
        if (z17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.VideoSeekBarEditorView", "Not Supported init SegmentSeekBar failed.");
            return;
        }
        com.tencent.mm.plugin.recordvideo.plugin.cropvideo.EditVideoSeekBarView editVideoSeekBarView = this.f14134a;
        com.tencent.mm.plugin.mmsight.segment.RecyclerThumbSeekBar recyclerThumbSeekBar = editVideoSeekBarView.getRecyclerThumbSeekBar();
        recyclerThumbSeekBar.getViewTreeObserver().addOnPreDrawListener(new au3.n(recyclerThumbSeekBar, editVideoSeekBarView));
    }
}

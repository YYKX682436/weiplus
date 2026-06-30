package au3;

/* loaded from: classes10.dex */
public final class m implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.recordvideo.plugin.cropvideo.EditVideoSeekBarView f14131d;

    public m(com.tencent.mm.plugin.recordvideo.plugin.cropvideo.EditVideoSeekBarView editVideoSeekBarView) {
        this.f14131d = editVideoSeekBarView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.recordvideo.plugin.cropvideo.EditVideoSeekBarView editVideoSeekBarView = this.f14131d;
        editVideoSeekBarView.c(editVideoSeekBarView.recyclerThumbSeekBar.c(), editVideoSeekBarView.recyclerThumbSeekBar.b());
    }
}

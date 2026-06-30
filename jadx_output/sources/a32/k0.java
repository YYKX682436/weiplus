package a32;

/* loaded from: classes10.dex */
public final class k0 extends androidx.recyclerview.widget.t0 {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.emojicapture.ui.capture.MoreStickerView f1025c;

    public k0(com.tencent.mm.plugin.emojicapture.ui.capture.MoreStickerView moreStickerView) {
        this.f1025c = moreStickerView;
    }

    @Override // androidx.recyclerview.widget.t0
    public int c(int i17) {
        com.tencent.mm.plugin.emojicapture.ui.capture.MoreStickerView moreStickerView = this.f1025c;
        if (moreStickerView.f98685y.getItemViewType(i17) == 0) {
            return 1;
        }
        return moreStickerView.A;
    }
}

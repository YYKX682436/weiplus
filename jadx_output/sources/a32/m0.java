package a32;

/* loaded from: classes10.dex */
public final class m0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.emojicapture.ui.capture.MoreStickerView f1030d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(com.tencent.mm.plugin.emojicapture.ui.capture.MoreStickerView moreStickerView) {
        super(1);
        this.f1030d = moreStickerView;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        yz5.a loadMoreCallback;
        int intValue = ((java.lang.Number) obj).intValue();
        com.tencent.mm.plugin.emojicapture.ui.capture.MoreStickerView moreStickerView = this.f1030d;
        if (intValue >= moreStickerView.f98685y.getItemCount() - moreStickerView.A && (loadMoreCallback = moreStickerView.getLoadMoreCallback()) != null) {
            loadMoreCallback.invoke();
        }
        return jz5.f0.f302826a;
    }
}

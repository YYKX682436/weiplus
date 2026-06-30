package a32;

/* loaded from: classes10.dex */
public final class l0 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.emojicapture.ui.capture.MoreStickerView f1028d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(com.tencent.mm.plugin.emojicapture.ui.capture.MoreStickerView moreStickerView) {
        super(2);
        this.f1028d = moreStickerView;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        int intValue = ((java.lang.Number) obj).intValue();
        t85.d info = (t85.d) obj2;
        kotlin.jvm.internal.o.g(info, "info");
        com.tencent.mm.plugin.emojicapture.ui.capture.MoreStickerView moreStickerView = this.f1028d;
        z22.f fVar = moreStickerView.f98685y;
        int i17 = fVar.f469718e;
        if (i17 != intValue) {
            fVar.notifyItemChanged(i17);
            fVar.f469718e = intValue;
            fVar.notifyItemChanged(intValue);
        }
        yz5.l selectionCallback = moreStickerView.getSelectionCallback();
        if (selectionCallback != null) {
            selectionCallback.invoke(info);
        }
        moreStickerView.B = info.f416456a.f382792d;
        return jz5.f0.f302826a;
    }
}

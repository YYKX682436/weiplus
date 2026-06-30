package a32;

/* loaded from: classes8.dex */
public final class i0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.emojicapture.ui.capture.EditorStickerView f1020d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(com.tencent.mm.plugin.emojicapture.ui.capture.EditorStickerView editorStickerView) {
        super(0);
        this.f1020d = editorStickerView;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        y9.i iVar = this.f1020d.f98677r;
        if (iVar != null) {
            iVar.dismiss();
        }
        return jz5.f0.f302826a;
    }
}

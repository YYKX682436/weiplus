package aw3;

/* loaded from: classes10.dex */
public final class c extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.recordvideo.ui.editor.sticker.StickerEditorContainer f14830d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qc0.p1 f14831e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.ee6 f14832f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(com.tencent.mm.plugin.recordvideo.ui.editor.sticker.StickerEditorContainer stickerEditorContainer, qc0.p1 p1Var, r45.ee6 ee6Var) {
        super(0);
        this.f14830d = stickerEditorContainer;
        this.f14831e = p1Var;
        this.f14832f = ee6Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        int i17 = com.tencent.mm.plugin.recordvideo.ui.editor.sticker.StickerEditorContainer.f156425h;
        this.f14830d.l(false);
        yz5.l lVar = this.f14831e.f361430a;
        if (lVar != null) {
            r45.ei0 editorItemRestoreData = this.f14832f.f373372h;
            kotlin.jvm.internal.o.f(editorItemRestoreData, "editorItemRestoreData");
            lVar.invoke(editorItemRestoreData);
        }
        return jz5.f0.f302826a;
    }
}

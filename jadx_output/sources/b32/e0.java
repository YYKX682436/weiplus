package b32;

/* loaded from: classes10.dex */
public final class e0 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.emojicapture.ui.editor.TextEditorItemView f17634d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(com.tencent.mm.plugin.emojicapture.ui.editor.TextEditorItemView textEditorItemView) {
        super(2);
        this.f17634d = textEditorItemView;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        android.graphics.Matrix m17 = (android.graphics.Matrix) obj;
        ((java.lang.Boolean) obj2).booleanValue();
        kotlin.jvm.internal.o.g(m17, "m");
        com.tencent.mm.plugin.emojicapture.ui.editor.TextEditorItemView textEditorItemView = this.f17634d;
        if (textEditorItemView.f98756d) {
            textEditorItemView.G.f24917g.set(m17);
            textEditorItemView.invalidate();
        }
        return jz5.f0.f302826a;
    }
}

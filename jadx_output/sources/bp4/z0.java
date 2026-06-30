package bp4;

/* loaded from: classes10.dex */
public final class z0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bp4.b1 f23434d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(bp4.b1 b1Var) {
        super(0);
        this.f23434d = b1Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        bp4.b1 b1Var = this.f23434d;
        android.view.LayoutInflater from = android.view.LayoutInflater.from(b1Var.f23098d.getContext());
        com.tencent.mm.plugin.recordvideo.ui.editor.EditorPanelHolder editorPanelHolder = b1Var.f23098d;
        android.view.View inflate = from.inflate(com.tencent.mm.R.layout.a5k, (android.view.ViewGroup) editorPanelHolder, false);
        kotlin.jvm.internal.o.d(inflate);
        com.tencent.mm.plugin.recordvideo.ui.editor.EditorPanelHolder.k(editorPanelHolder, inflate, null, 2, null);
        return inflate;
    }
}

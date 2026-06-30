package bp4;

/* loaded from: classes10.dex */
public final class m4 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bp4.o4 f23272d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m4(bp4.o4 o4Var) {
        super(0);
        this.f23272d = o4Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        bp4.o4 o4Var = this.f23272d;
        android.view.LayoutInflater from = android.view.LayoutInflater.from(o4Var.f23316f.getContext());
        com.tencent.mm.plugin.recordvideo.ui.editor.EditorPanelHolder editorPanelHolder = o4Var.f23316f;
        android.view.View inflate = from.inflate(com.tencent.mm.R.layout.d49, (android.view.ViewGroup) editorPanelHolder, false);
        kotlin.jvm.internal.o.d(inflate);
        com.tencent.mm.plugin.recordvideo.ui.editor.EditorPanelHolder.k(editorPanelHolder, inflate, null, 2, null);
        return (android.view.ViewGroup) inflate;
    }
}

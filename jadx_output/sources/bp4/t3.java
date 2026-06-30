package bp4;

/* loaded from: classes10.dex */
public final class t3 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bp4.z3 f23383d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t3(bp4.z3 z3Var) {
        super(0);
        this.f23383d = z3Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        bp4.z3 z3Var = this.f23383d;
        android.view.LayoutInflater from = android.view.LayoutInflater.from(z3Var.f23437f.getContext());
        com.tencent.mm.plugin.recordvideo.ui.editor.EditorPanelHolder editorPanelHolder = z3Var.f23437f;
        android.view.View inflate = from.inflate(com.tencent.mm.R.layout.bpk, (android.view.ViewGroup) editorPanelHolder, false);
        kotlin.jvm.internal.o.d(inflate);
        com.tencent.mm.plugin.recordvideo.ui.editor.EditorPanelHolder.k(editorPanelHolder, inflate, null, 2, null);
        return inflate;
    }
}

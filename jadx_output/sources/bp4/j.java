package bp4;

/* loaded from: classes10.dex */
public final class j extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bp4.n f23200d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(bp4.n nVar) {
        super(0);
        this.f23200d = nVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        bp4.n nVar = this.f23200d;
        android.view.LayoutInflater from = android.view.LayoutInflater.from(nVar.f23274g.getContext());
        com.tencent.mm.plugin.recordvideo.ui.editor.EditorPanelHolder editorPanelHolder = nVar.f23274g;
        android.view.View inflate = from.inflate(com.tencent.mm.R.layout.bnz, (android.view.ViewGroup) editorPanelHolder, false);
        kotlin.jvm.internal.o.d(inflate);
        com.tencent.mm.plugin.recordvideo.ui.editor.EditorPanelHolder.k(editorPanelHolder, inflate, null, 2, null);
        return (android.view.ViewGroup) inflate;
    }
}

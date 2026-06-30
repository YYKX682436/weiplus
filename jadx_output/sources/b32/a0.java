package b32;

/* loaded from: classes10.dex */
public final class a0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.emojicapture.ui.editor.EditorItemContainer f17627d;

    public a0(com.tencent.mm.plugin.emojicapture.ui.editor.EditorItemContainer editorItemContainer) {
        this.f17627d = editorItemContainer;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.emojicapture.ui.editor.EditorItemContainer editorItemContainer = this.f17627d;
        b32.c0 c0Var = editorItemContainer.f98735q;
        if (c0Var != null) {
            kotlin.jvm.internal.o.d(c0Var);
            if (!c0Var.l()) {
                android.view.ViewGroup viewGroup = editorItemContainer.f98728g;
                java.lang.Object obj = editorItemContainer.f98735q;
                kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type android.view.View");
                viewGroup.removeView((android.view.View) obj);
            }
        }
        editorItemContainer.f98735q = null;
        editorItemContainer.f98733o = null;
    }
}

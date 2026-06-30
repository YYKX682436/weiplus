package b32;

/* loaded from: classes10.dex */
public final class z implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.emojicapture.ui.editor.EditorItemContainer f17657d;

    public z(com.tencent.mm.plugin.emojicapture.ui.editor.EditorItemContainer editorItemContainer) {
        this.f17657d = editorItemContainer;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.emojicapture.ui.editor.EditorItemContainer editorItemContainer = this.f17657d;
        b32.c0 c0Var = editorItemContainer.f98733o;
        if (c0Var != null) {
            kotlin.jvm.internal.o.d(c0Var);
            editorItemContainer.d(c0Var, false);
        }
    }
}

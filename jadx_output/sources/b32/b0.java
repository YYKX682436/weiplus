package b32;

/* loaded from: classes10.dex */
public final class b0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.emojicapture.ui.editor.EditorItemContainer f17629d;

    public b0(com.tencent.mm.plugin.emojicapture.ui.editor.EditorItemContainer editorItemContainer) {
        this.f17629d = editorItemContainer;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.emojicapture.ui.editor.EditorItemContainer editorItemContainer = this.f17629d;
        editorItemContainer.getValidRect();
        if (editorItemContainer.f98732n.isEmpty()) {
            return;
        }
        java.util.Iterator it = editorItemContainer.f98736r.iterator();
        while (it.hasNext()) {
            ((java.lang.Runnable) it.next()).run();
        }
    }
}

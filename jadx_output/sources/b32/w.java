package b32;

/* loaded from: classes10.dex */
public final class w implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.emojicapture.ui.editor.EditorItemContainer f17652d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f17653e;

    public w(com.tencent.mm.plugin.emojicapture.ui.editor.EditorItemContainer editorItemContainer, android.content.Context context) {
        this.f17652d = editorItemContainer;
        this.f17653e = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.emojicapture.ui.editor.EditorItemContainer editorItemContainer = this.f17652d;
        editorItemContainer.f98729h.a(editorItemContainer.getValidRect(), this.f17653e.getResources().getDimension(com.tencent.mm.R.dimen.f480351vc));
    }
}

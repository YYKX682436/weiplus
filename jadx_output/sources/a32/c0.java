package a32;

/* loaded from: classes10.dex */
public final class c0 implements fp0.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.emojicapture.ui.capture.EditorStickerView f1007a;

    public c0(com.tencent.mm.plugin.emojicapture.ui.capture.EditorStickerView editorStickerView) {
        this.f1007a = editorStickerView;
    }

    @Override // fp0.p
    public void a(fp0.d dVar, fp0.u status) {
        u85.o task = (u85.o) dVar;
        kotlin.jvm.internal.o.g(task, "task");
        kotlin.jvm.internal.o.g(status, "status");
        java.lang.String str = task.f425719f.f193690e;
        com.tencent.mm.plugin.emojicapture.ui.capture.EditorStickerView editorStickerView = this.f1007a;
        if (kotlin.jvm.internal.o.b(str, editorStickerView.f98679t)) {
            com.tencent.mars.xlog.Log.i(editorStickerView.f98666d, "onLoaderFin: " + status);
            editorStickerView.c(status);
        }
    }
}

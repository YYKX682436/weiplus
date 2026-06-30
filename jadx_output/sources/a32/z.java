package a32;

/* loaded from: classes8.dex */
public final class z implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.emojicapture.ui.capture.EditorStickerView f1050d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f1051e;

    public z(com.tencent.mm.plugin.emojicapture.ui.capture.EditorStickerView editorStickerView, int i17) {
        this.f1050d = editorStickerView;
        this.f1051e = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.emojicapture.ui.capture.EditorStickerView editorStickerView = this.f1050d;
        androidx.recyclerview.widget.RecyclerView recyclerView = editorStickerView.f98668f;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        int i17 = this.f1051e;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(recyclerView, arrayList.toArray(), "com/tencent/mm/plugin/emojicapture/ui/capture/EditorStickerView$3$updateSelection$1", "run", "()V", "Undefined", "scrollToPosition", "(I)V");
        recyclerView.a1(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(recyclerView, "com/tencent/mm/plugin/emojicapture/ui/capture/EditorStickerView$3$updateSelection$1", "run", "()V", "Undefined", "scrollToPosition", "(I)V");
        com.tencent.mm.plugin.emojicapture.ui.capture.EditorStickerView.b(editorStickerView, i17);
        editorStickerView.f98668f.post(new a32.y(editorStickerView));
    }
}

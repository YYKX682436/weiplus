package com.tencent.mm.plugin.component.editor;

/* loaded from: classes12.dex */
public class w implements com.tencent.mm.pluginsdk.ui.tools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.component.editor.EditorFileUI f96642d;

    public w(com.tencent.mm.plugin.component.editor.EditorFileUI editorFileUI) {
        this.f96642d = editorFileUI;
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.a4
    public void T4(int i17, int i18) {
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.a4
    public void onCompletion() {
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.a4
    public void onError(int i17, int i18) {
        com.tencent.mm.plugin.component.editor.EditorFileUI editorFileUI = this.f96642d;
        editorFileUI.f96468q.stop();
        if (editorFileUI.f96472u) {
            return;
        }
        editorFileUI.f96472u = true;
        android.graphics.Bitmap f17 = com.tencent.mm.plugin.component.editor.u1.f(hx1.b.e(editorFileUI.f96470s), null);
        java.lang.String f174598m = editorFileUI.f96468q.getF174598m();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        ((be0.e) ((com.tencent.mm.feature.sight.api.o) i95.n0.c(com.tencent.mm.feature.sight.api.o.class))).getClass();
        sb6.append(com.tencent.mm.plugin.sight.base.e.b());
        sb6.append("[RecordMsgFileUI] on play sight error, what=");
        sb6.append(i17);
        sb6.append(", extra=");
        sb6.append(i18);
        sb6.append(", path=");
        sb6.append(f174598m == null ? "" : f174598m);
        z65.c.b(android.util.Base64.encodeToString(sb6.toString().getBytes(), 2), "FullScreenPlaySight");
        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.component.editor.v(this, f17, f174598m));
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.a4
    public void onPrepared() {
        fp.k.b();
        com.tencent.mm.plugin.component.editor.EditorFileUI editorFileUI = this.f96642d;
        editorFileUI.f96468q.setLoop(true);
        editorFileUI.f96468q.start();
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.a4
    public int q(int i17, int i18) {
        return 0;
    }
}

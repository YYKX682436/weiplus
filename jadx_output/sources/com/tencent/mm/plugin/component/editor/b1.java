package com.tencent.mm.plugin.component.editor;

/* loaded from: classes12.dex */
public class b1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.component.editor.EditorUI f96534d;

    public b1(com.tencent.mm.plugin.component.editor.EditorUI editorUI) {
        this.f96534d = editorUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.component.editor.EditorUI editorUI = this.f96534d;
        try {
            int x17 = ((androidx.recyclerview.widget.LinearLayoutManager) editorUI.f96497d.getLayoutManager()).x();
            ix1.a l17 = nx1.d.q().l(x17);
            if (l17 == null || l17.b() != 4 || ((ix1.n) l17).f295328q) {
                return;
            }
            editorUI.j3(x17, 0L);
        } catch (java.lang.NullPointerException unused) {
        }
    }
}

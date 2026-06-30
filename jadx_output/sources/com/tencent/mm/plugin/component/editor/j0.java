package com.tencent.mm.plugin.component.editor;

/* loaded from: classes12.dex */
public class j0 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f96576d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.component.editor.n0 f96577e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.List f96578f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.component.editor.EditorImageUI f96579g;

    public j0(com.tencent.mm.plugin.component.editor.EditorImageUI editorImageUI, java.util.List list, com.tencent.mm.plugin.component.editor.n0 n0Var, java.util.List list2) {
        this.f96579g = editorImageUI;
        this.f96576d = list;
        this.f96577e = n0Var;
        this.f96578f = list2;
    }

    @Override // db5.o4
    public void onCreateMMMenu(db5.g4 g4Var) {
        com.tencent.mm.plugin.component.editor.EditorImageUI editorImageUI = this.f96579g;
        editorImageUI.f96485n.o(null);
        g4Var.clear();
        g4Var.setHeaderTitle("");
        int i17 = 0;
        while (true) {
            java.util.List list = this.f96576d;
            if (i17 >= list.size()) {
                return;
            }
            if (((java.lang.Integer) list.get(i17)).intValue() == 3) {
                com.tencent.mm.ui.widget.dialog.k0 k0Var = editorImageUI.f96485n;
                editorImageUI.getClass();
                com.tencent.mm.plugin.component.editor.n0 n0Var = this.f96577e;
                com.tencent.mm.autogen.events.RecogQBarOfImageFileResultEvent recogQBarOfImageFileResultEvent = n0Var.f96613a;
                com.tencent.mm.pluginsdk.ui.tools.s6 s6Var = com.tencent.mm.pluginsdk.ui.tools.s6.f191898a;
                int c17 = s6Var.c(recogQBarOfImageFileResultEvent);
                int d17 = s6Var.d(recogQBarOfImageFileResultEvent);
                java.lang.String e17 = s6Var.e(recogQBarOfImageFileResultEvent);
                com.tencent.mm.plugin.component.editor.l0 l0Var = new com.tencent.mm.plugin.component.editor.l0(editorImageUI, recogQBarOfImageFileResultEvent, e17, c17, d17);
                if (!n0Var.f96614b) {
                    n0Var.f96614b = true;
                    ((com.tencent.mm.plugin.scanner.ScanCodeSheetItemLogic) editorImageUI.f96490s).h(c17, e17);
                }
                k0Var.o(((com.tencent.mm.plugin.scanner.ScanCodeSheetItemLogic) editorImageUI.f96490s).b(l0Var, c17, e17, 5));
            } else {
                g4Var.f(((java.lang.Integer) list.get(i17)).intValue(), (java.lang.CharSequence) this.f96578f.get(i17));
            }
            i17++;
        }
    }
}

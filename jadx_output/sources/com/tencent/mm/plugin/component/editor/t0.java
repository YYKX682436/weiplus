package com.tencent.mm.plugin.component.editor;

/* loaded from: classes3.dex */
public class t0 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.component.editor.EditorUI f96635d;

    public t0(com.tencent.mm.plugin.component.editor.EditorUI editorUI) {
        this.f96635d = editorUI;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        dialogInterface.dismiss();
        tb0.j jVar = (tb0.j) i95.n0.c(tb0.j.class);
        androidx.appcompat.app.AppCompatActivity context = this.f96635d.getContext();
        ((sb0.f) jVar).getClass();
        j35.u.g(context);
    }
}

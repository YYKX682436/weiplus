package com.tencent.mm.plugin.component.editor;

/* loaded from: classes12.dex */
public class g1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.component.editor.c f96561d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.component.editor.i1 f96562e;

    public g1(com.tencent.mm.plugin.component.editor.i1 i1Var, com.tencent.mm.plugin.component.editor.c cVar) {
        this.f96562e = i1Var;
        this.f96561d = cVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.component.editor.c cVar = this.f96561d;
        boolean z17 = cVar.f96544j;
        com.tencent.mm.plugin.component.editor.i1 i1Var = this.f96562e;
        if (!z17) {
            if (cVar.f96546l >= 0) {
                androidx.recyclerview.widget.f2 adapter = i1Var.f96574a.f96497d.getAdapter();
                int i17 = cVar.f96546l;
                ((fx1.b) i1Var.f96574a.f96497d.getAdapter()).getClass();
                adapter.notifyItemChanged(i17 + 0);
                return;
            }
            return;
        }
        i1Var.f96574a.H.remove(cVar.f96536b);
        com.tencent.mm.plugin.component.editor.EditorUI editorUI = i1Var.f96574a;
        if (editorUI.H.isEmpty()) {
            editorUI.F.field_edittime = com.tencent.mm.sdk.platformtools.t8.i1();
            editorUI.F.field_updateTime = java.lang.System.currentTimeMillis();
            o72.r2 r2Var = editorUI.F;
            r2Var.field_favProto.g(r2Var.field_edittime);
            java.lang.String G0 = o72.r2.G0(editorUI.F);
            java.lang.String str = "";
            boolean z18 = true;
            for (int i18 = 0; i18 < nx1.d.q().B(); i18++) {
                if (i18 != 0 && !str.endsWith("\n")) {
                    str = str.concat("\n");
                }
                ix1.a l17 = nx1.d.q().l(i18);
                str = str + com.tencent.mm.plugin.component.editor.u1.k(com.tencent.mm.plugin.component.editor.u1.b(editorUI, l17));
                if (l17.b() != 1) {
                    z18 = false;
                }
            }
            editorUI.b7(str, G0, z18);
            android.app.ProgressDialog progressDialog = editorUI.f96515y;
            if (progressDialog != null) {
                progressDialog.dismiss();
                editorUI.f96515y = null;
            }
        }
    }
}

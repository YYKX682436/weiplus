package com.tencent.mm.plugin.component.editor;

/* loaded from: classes12.dex */
public class o1 implements nx1.o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.component.editor.EditorUI f96618a;

    public o1(com.tencent.mm.plugin.component.editor.EditorUI editorUI) {
        this.f96618a = editorUI;
    }

    public void a(java.lang.String str, ix1.i iVar) {
        com.tencent.mm.vfs.x1 m17;
        ix1.m mVar = (ix1.m) iVar;
        com.tencent.mars.xlog.Log.i("MicroMsg.EditorActivityUI", "compressNoteVideo onExportFinish");
        if (com.tencent.mm.sdk.platformtools.t8.K0(str) || !com.tencent.mm.vfs.w6.j(str) || mVar == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.EditorActivityUI", "file not exist or user canceled");
        } else {
            com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(str);
            java.lang.String str2 = a17.f213279f;
            if (str2 != null) {
                java.lang.String l17 = com.tencent.mm.vfs.e8.l(str2, false, false);
                if (!str2.equals(l17)) {
                    a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
                }
            }
            mVar.f295329r = str;
            com.tencent.mm.vfs.z2 m18 = com.tencent.mm.vfs.a3.f212781a.m(a17, null);
            long j17 = 0;
            if (m18.a() && (m17 = m18.f213266a.m(m18.f213267b)) != null) {
                j17 = m17.f213233c;
            }
            mVar.f295326o = j17;
        }
        com.tencent.mm.plugin.component.editor.EditorUI editorUI = this.f96618a;
        editorUI.A.remove(mVar.f295311a);
        java.lang.Runnable runnable = editorUI.E;
        if (runnable != null) {
            runnable.run();
            editorUI.E = null;
        }
    }
}

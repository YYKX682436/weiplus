package com.tencent.mm.plugin.component.editor;

/* loaded from: classes12.dex */
public class t implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.component.editor.u f96634d;

    public t(com.tencent.mm.plugin.component.editor.u uVar) {
        this.f96634d = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        ec5.a aVar;
        com.tencent.mm.vfs.x1 m17;
        int itemId = menuItem.getItemId();
        int i18 = 1;
        com.tencent.mm.plugin.component.editor.u uVar = this.f96634d;
        if (itemId != 0) {
            if (itemId == 1 && uVar.f96636d.f96471t != null) {
                ((d73.i) i95.n0.c(d73.i.class)).f6(uVar.f96636d.f96471t);
                return;
            }
            return;
        }
        com.tencent.mm.plugin.component.editor.EditorFileUI editorFileUI = uVar.f96636d;
        int i19 = com.tencent.mm.plugin.component.editor.EditorFileUI.A;
        int T6 = editorFileUI.T6();
        com.tencent.mm.plugin.component.editor.EditorFileUI editorFileUI2 = uVar.f96636d;
        if (T6 == 8) {
            java.lang.String c17 = hx1.b.c(editorFileUI2.f96470s);
            if (!com.tencent.mm.vfs.w6.j(c17)) {
                com.tencent.mars.xlog.Log.e("MicroMsg.EditorFileUI", "share file failed, file not exists");
                android.widget.Toast.makeText(editorFileUI2, editorFileUI2.getString(com.tencent.mm.R.string.ccu), 1).show();
                return;
            }
            com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(c17);
            java.lang.String str = a17.f213279f;
            if (str != null) {
                java.lang.String l17 = com.tencent.mm.vfs.e8.l(str, false, false);
                if (!str.equals(l17)) {
                    a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
                }
            }
            com.tencent.mm.vfs.z2 m18 = com.tencent.mm.vfs.a3.f212781a.m(a17, null);
            if (((m18.a() && (m17 = m18.f213266a.m(m18.f213267b)) != null) ? m17.f213233c : 0L) > com.tencent.mm.plugin.component.editor.EditorFileUI.f96457z) {
                com.tencent.mars.xlog.Log.e("MicroMsg.EditorFileUI", "share file failed, file too large");
                android.widget.Toast.makeText(editorFileUI2, editorFileUI2.getString(com.tencent.mm.R.string.ccv), 1).show();
                return;
            }
        }
        editorFileUI2.getClass();
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Select_Conv_Type", 3);
        intent.putExtra("select_is_ret", true);
        intent.putExtra("mutil_select_is_ret", true);
        if (editorFileUI2.T6() == 15) {
            intent.putExtra("image_path", hx1.b.e(editorFileUI2.f96470s));
            jd5.c cVar = new jd5.c();
            cVar.r(hx1.b.c(editorFileUI2.f96470s));
            cVar.q(editorFileUI2.f96470s.f375448y);
            cVar.o(hx1.b.e(editorFileUI2.f96470s));
            aVar = cVar;
            i18 = 11;
        } else if (editorFileUI2.T6() == 4) {
            intent.putExtra("image_path", hx1.b.e(editorFileUI2.f96470s));
            jd5.c cVar2 = new jd5.c();
            cVar2.r(hx1.b.c(editorFileUI2.f96470s));
            cVar2.q(editorFileUI2.f96470s.f375448y);
            cVar2.o(hx1.b.e(editorFileUI2.f96470s));
            aVar = cVar2;
        } else {
            intent.putExtra("desc_title", editorFileUI2.f96470s.f375404d);
            ec5.a aVar2 = new ec5.a();
            aVar2.l(hx1.b.c(editorFileUI2.f96470s));
            n13.v vVar = n13.v.f334140a;
            r45.gp0 gp0Var = editorFileUI2.f96470s;
            aVar2.k(vVar.b(gp0Var.f375404d, gp0Var.K, gp0Var.R));
            aVar = aVar2;
            i18 = 3;
        }
        intent.putExtra("Retr_Msg_Type", i18);
        ((n13.b0) i95.n0.c(n13.b0.class)).getClass();
        ((dk5.b0) ((n13.b0) i95.n0.c(n13.b0.class))).Bi(editorFileUI2, aVar, n13.r.a(1001));
    }
}

package com.tencent.mm.plugin.component.editor;

/* loaded from: classes12.dex */
public class y implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.component.editor.EditorImageUI f96663d;

    public y(com.tencent.mm.plugin.component.editor.EditorImageUI editorImageUI) {
        this.f96663d = editorImageUI;
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        ix1.c cVar;
        r45.gp0 gp0Var;
        int itemId = menuItem.getItemId();
        com.tencent.mm.plugin.component.editor.EditorImageUI editorImageUI = this.f96663d;
        if (itemId == 0) {
            int i18 = com.tencent.mm.plugin.component.editor.EditorImageUI.f96477x;
            editorImageUI.f96484m = editorImageUI.T6();
            ((n13.b0) i95.n0.c(n13.b0.class)).getClass();
            jd5.a aVar = new jd5.a();
            aVar.p(editorImageUI.f96484m);
            n13.b0 b0Var = (n13.b0) i95.n0.c(n13.b0.class);
            n13.r a17 = n13.r.a(1001);
            a17.f334120d.f334139a = 9;
            ((dk5.b0) b0Var).Bi(editorImageUI, aVar, a17);
            return;
        }
        if (itemId == 1) {
            editorImageUI.getClass();
            return;
        }
        if (itemId == 2) {
            int i19 = com.tencent.mm.plugin.component.editor.EditorImageUI.f96477x;
            editorImageUI.getClass();
            vb0.o oVar = (vb0.o) i95.n0.c(vb0.o.class);
            java.lang.String T6 = editorImageUI.T6();
            androidx.appcompat.app.AppCompatActivity context = editorImageUI.getContext();
            ((ub0.r) oVar).getClass();
            com.tencent.mm.pluginsdk.ui.tools.l7.a(T6, context, null);
            return;
        }
        if (itemId == 4) {
            if (com.tencent.mm.sdk.platformtools.f9.ContextTranslate.k(editorImageUI.getContext(), null)) {
                com.tencent.mm.autogen.mmdata.rpt.GalleryTranslateReportStruct galleryTranslateReportStruct = new com.tencent.mm.autogen.mmdata.rpt.GalleryTranslateReportStruct();
                galleryTranslateReportStruct.f58317e = 3L;
                galleryTranslateReportStruct.f58318f = 5L;
                int selectedItemPosition = editorImageUI.f96480f.getSelectedItemPosition();
                if (-1 != selectedItemPosition && (gp0Var = (cVar = (ix1.c) editorImageUI.f96481g.getItem(selectedItemPosition)).f295324m) != null) {
                    galleryTranslateReportStruct.q(gp0Var.f375434s);
                    galleryTranslateReportStruct.p(cVar.f295324m.f375438u);
                }
                galleryTranslateReportStruct.k();
                editorImageUI.f96489r.a();
                return;
            }
            return;
        }
        if (itemId != 5) {
            return;
        }
        int i27 = com.tencent.mm.plugin.component.editor.EditorImageUI.f96477x;
        java.lang.String T62 = editorImageUI.T6();
        com.tencent.mars.xlog.Log.i("MicroMsg.Editor.EditorImageUI", "edit image path:%s msgId:%s", T62, java.lang.Long.valueOf(editorImageUI.f96483i));
        com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider b17 = com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider.b(T62, "");
        b17.F = 0;
        com.tencent.mm.component.api.jumper.UICustomParam uICustomParam = new com.tencent.mm.component.api.jumper.UICustomParam((hp.a) null);
        java.util.Map map = uICustomParam.f64779h;
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        java.util.HashMap hashMap = (java.util.HashMap) map;
        hashMap.put("plugin_filter", bool);
        hashMap.put("plugin_poi", bool);
        hashMap.put("plugin_tip", bool);
        hashMap.put("plugin_menu", bool);
        b17.f155677o = uICustomParam;
        ut3.m.f431182a.f(editorImageUI.getContext(), 4369, com.tencent.mm.R.anim.f477876e0, -1, b17, 1, 2);
    }
}

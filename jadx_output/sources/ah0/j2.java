package ah0;

/* loaded from: classes8.dex */
public class j2 implements hh4.j {
    @Override // hh4.j
    public void k0(com.tencent.mm.plugin.multitask.model.MultiTaskInfo multiTaskInfo) {
        multiTaskInfo.field_showData.getString(1);
        r45.k97 k97Var = new r45.k97();
        try {
            k97Var.parseFrom(multiTaskInfo.field_data);
            int integer = k97Var.getInteger(19);
            java.lang.String string = k97Var.getString(1);
            if (integer > -1 && !com.tencent.mm.sdk.platformtools.t8.K0(string)) {
                k97Var.getString(9);
                int integer2 = k97Var.getInteger(13);
                multiTaskInfo.field_showData.getString(1);
                ((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).d(string, integer, integer2, new java.lang.Object[0]);
            }
            com.tencent.mm.plugin.webview.ui.tools.floatball.h0.f184201a.e(multiTaskInfo);
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("WvTaskBarEventListener", "WebMultiTaskData parse fail", th6);
        }
    }

    @Override // hh4.j
    public void m6(android.content.Context context, com.tencent.mm.plugin.multitask.model.MultiTaskInfo multiTaskInfo) {
        int i17 = vx4.d.D;
        r45.k97 k97Var = new r45.k97();
        try {
            k97Var.parseFrom(multiTaskInfo.field_data);
            java.lang.String str = multiTaskInfo.field_id;
            java.lang.String string = k97Var.getString(1);
            com.tencent.mars.xlog.Log.i("MicroMsg.WebMultiTaskHelper", "handleClicked, url:%s", string);
            int integer = k97Var.getInteger(19);
            android.content.Intent intent = new android.content.Intent();
            try {
                r45.w60 w60Var = new r45.w60();
                w60Var.set(2, java.lang.Boolean.TRUE);
                intent.putExtra("key_multi_task_common_info", w60Var.toByteArray());
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WebMultiTaskHelper", e17, "onTaskBarItemClicked", new java.lang.Object[0]);
            }
            ((com.tencent.mm.plugin.multitask.p1) ((com.tencent.mm.plugin.multitask.l0) i95.n0.c(com.tencent.mm.plugin.multitask.l0.class))).getClass();
            al3.d.b(intent, k97Var);
            intent.putExtra("rawUrl", string);
            intent.putExtra("minimize_secene", 0);
            intent.putExtra("float_ball_key", str);
            intent.putExtra("key_enable_teen_mode_check", true);
            intent.putExtra("key_enable_fts_quick", true);
            intent.putExtra("webpageTitle", k97Var.getString(4));
            if (integer > -1) {
                boolean z17 = integer == 5 || integer == 16;
                int integer2 = k97Var.getInteger(13);
                int integer3 = k97Var.getInteger(14);
                ((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).getClass();
                if (com.tencent.mm.plugin.brandservice.ui.timeline.preload.t1.e(integer2)) {
                    if (((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).E(context == null ? com.tencent.mm.sdk.platformtools.x2.f193071a : context, string, integer, z17, integer2, integer3, intent)) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.WebMultiTaskHelper", "openWebPage, use fast Load");
                        return;
                    }
                }
            }
            if (context == null) {
                context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            }
            j45.l.j(context, "webview", ".ui.tools.WebViewUI", intent, null);
            com.tencent.mm.plugin.webview.ui.tools.floatball.h0 h0Var = com.tencent.mm.plugin.webview.ui.tools.floatball.h0.f184201a;
            com.tencent.mm.plugin.webview.ui.tools.floatball.h0.f184204d.remove(multiTaskInfo.field_id);
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WebMultiTaskHelper", "WebMultiTaskData parse fail", th6);
        }
    }

    @Override // hh4.j
    public void p0(com.tencent.mm.plugin.multitask.model.MultiTaskInfo multiTaskInfo) {
        multiTaskInfo.field_showData.getString(1);
        com.tencent.mm.plugin.webview.ui.tools.floatball.h0.f184201a.f(multiTaskInfo);
    }
}

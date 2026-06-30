package uy;

/* loaded from: classes8.dex */
public class l implements hh4.j {
    @Override // hh4.j
    public void k0(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c c16601x7ed0e40c) {
    }

    @Override // hh4.j
    public void m6(android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c c16601x7ed0e40c) {
        boolean z17 = md5.b.A;
        if (c16601x7ed0e40c.f66790x225a93cf == null) {
            return;
        }
        android.content.Context context2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        r45.qs0 qs0Var = new r45.qs0();
        try {
            qs0Var.mo11468x92b714fd(c16601x7ed0e40c.f66790x225a93cf);
        } catch (java.lang.Throwable unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FilesFloatBall.FilesPageMultiTaskHelper", "FileMultiTaskData parse error");
        }
        java.lang.String m75945x2fec8307 = qs0Var.m75945x2fec8307(1);
        if (!com.p314xaae8f345.mm.vfs.w6.j(m75945x2fec8307)) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1(context2);
            u1Var.u("");
            u1Var.g(context2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.cfe));
            u1Var.a(true);
            u1Var.l(null);
            u1Var.q(false);
            ((gh4.e0) ((gh4.s) i95.n0.c(gh4.s.class))).Ui(c16601x7ed0e40c.f66791xc8a07680, true, 0);
            return;
        }
        r45.w60 w60Var = new r45.w60();
        w60Var.set(2, java.lang.Boolean.TRUE);
        if (!qs0Var.m75933x41a8a7f2(0)) {
            java.lang.String m75945x2fec83072 = qs0Var.m75945x2fec8307(2);
            java.lang.String m75945x2fec83073 = qs0Var.m75945x2fec8307(3);
            boolean m75933x41a8a7f2 = qs0Var.m75933x41a8a7f2(6);
            java.lang.String m75945x2fec83074 = qs0Var.m75945x2fec8307(4);
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(m75945x2fec83074)) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.f5) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.f5.class)).v7(context2, m75945x2fec8307, m75945x2fec83072, m75945x2fec83073, m75933x41a8a7f2, m75945x2fec83074);
                return;
            }
            jt.v vVar = (jt.v) i95.n0.c(jt.v.class);
            java.lang.String m75945x2fec83075 = c16601x7ed0e40c.v0().m75945x2fec8307(1);
            ((ht.a) vVar).getClass();
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.f.j(0L, "", m75945x2fec8307, m75945x2fec83072, m75945x2fec83075, 12, w60Var);
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.setClassName(context2, "com.tencent.mm.ui.chatting.AppAttachNewDownloadUI");
        al3.d.a(intent, qs0Var);
        try {
            intent.putExtra("key_multi_task_common_info", w60Var.mo14344x5f01b1f6());
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.FilesFloatBall.FilesPageMultiTaskHelper", e17, "onTaskBarItemClicked", new java.lang.Object[0]);
        }
        intent.getExtras().putInt(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, 12);
        intent.addFlags(268435456);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context2, arrayList.toArray(), "com/tencent/mm/ui/chatting/multitask/FilesPageMultiTaskHelper", "onTaskBarItemClicked", "(Lcom/tencent/mm/plugin/multitask/model/MultiTaskInfo;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context2.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context2, "com/tencent/mm/ui/chatting/multitask/FilesPageMultiTaskHelper", "onTaskBarItemClicked", "(Lcom/tencent/mm/plugin/multitask/model/MultiTaskInfo;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    @Override // hh4.j
    public void p0(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c c16601x7ed0e40c) {
    }
}

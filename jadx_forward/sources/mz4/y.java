package mz4;

/* loaded from: classes12.dex */
public class y implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mz4.a0 f414890d;

    public y(mz4.a0 a0Var) {
        this.f414890d = a0Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wenote/model/nativenote/manager/WNNoteEditorOperateWindow$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        mz4.a0 a0Var = this.f414890d;
        a0Var.f414753a.dismiss();
        android.view.View view2 = a0Var.f414754b;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/wenote/model/nativenote/manager/WNNoteEditorOperateWindow$4", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        boolean z17 = false;
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/wenote/model/nativenote/manager/WNNoteEditorOperateWindow$4", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        mz4.z zVar = a0Var.f414755c;
        if (zVar != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89.ActivityC19519x7af4daf3 activityC19519x7af4daf3 = (com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89.ActivityC19519x7af4daf3) zVar;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Note.NoteEditorUI", "onOperateWindowPaste %s", java.lang.Long.valueOf(activityC19519x7af4daf3.A));
            hz4.h hVar = ((hz4.f) hz4.f.wi()).f367940d;
            if (hVar != null) {
                java.lang.String h17 = hVar.h();
                hz4.i iVar = hVar.f367951i;
                java.lang.String a17 = iVar.a(h17);
                boolean g17 = hVar.g();
                com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6447xbd8a5a3 c6447xbd8a5a3 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6447xbd8a5a3();
                c6447xbd8a5a3.f137877d = 32;
                c6447xbd8a5a3.f137879f = c6447xbd8a5a3.b("noteid", a17, true);
                c6447xbd8a5a3.f137880g = g17 ? 1 : 0;
                c6447xbd8a5a3.f137878e = c6447xbd8a5a3.b("sessionID", iVar.f367958a, true);
                c6447xbd8a5a3.k();
                if (com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40535xf2ceb016() <= 1) {
                    java.lang.String n17 = c6447xbd8a5a3.n();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(n17, "toShowString(...)");
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WNNoteReporter", "report%s %s", 14547, r26.i0.t(n17, com.p314xaae8f345.p592x631407a.p595x2eaf0c.log.p598x36f002.C4772x9611bb53.f20376x98ef612e, " ", false));
                }
            }
            int c17 = mz4.u.c(activityC19519x7af4daf3.mo55332x76847179());
            if (c17 == 2) {
                java.util.ArrayList arrayList3 = nz4.e.f423134a.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a).f423133b;
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(arrayList3)) {
                    activityC19519x7af4daf3.o7(arrayList3);
                } else if (mz4.u.d(activityC19519x7af4daf3)) {
                    activityC19519x7af4daf3.v7();
                } else {
                    mz4.d dVar = activityC19519x7af4daf3.J1;
                    dVar.getClass();
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.d5.b(new mz4.RunnableC29177x2e0107(dVar, z17));
                    mz4.u.a();
                    iz4.i iVar2 = new iz4.i();
                    iVar2.f377688t = "";
                    iVar2.f377637b = false;
                    iVar2.f377643h = false;
                    iVar2.f377638c = 0;
                    iVar2.f377645j = true;
                    dVar.b(iVar2, false);
                    activityC19519x7af4daf3.t7();
                }
            } else if (c17 == 3) {
                activityC19519x7af4daf3.o7(mz4.u.b());
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/wenote/model/nativenote/manager/WNNoteEditorOperateWindow$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

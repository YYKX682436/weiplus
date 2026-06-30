package tz4;

/* loaded from: classes12.dex */
public class r implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tz4.l f504910d;

    public r(tz4.l lVar) {
        this.f504910d = lVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wenote/ui/nativenote/toolview/WNToolViewHolder$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        tz4.l lVar = this.f504910d;
        if (lVar.f504893f.get() != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89.ActivityC19519x7af4daf3 activityC19519x7af4daf3 = (com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89.ActivityC19519x7af4daf3) ((tz4.k) lVar.f504893f.get());
            activityC19519x7af4daf3.getClass();
            ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).getClass();
            boolean a17 = j35.u.a(activityC19519x7af4daf3, "android.permission.RECORD_AUDIO", 80, null, null);
            java.lang.Boolean valueOf = java.lang.Boolean.valueOf(a17);
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Note.NoteEditorUI", "summerper checkPermission checkMicrophone[%b],stack[%s]", valueOf, new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
            if (a17) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.p2447x633fb29.p2448xb9121c89.p2449x31c90fad.C19515x154ec45a b17 = activityC19519x7af4daf3.f269680m.b();
                int height = activityC19519x7af4daf3.f269683p.getHeight() - activityC19519x7af4daf3.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561432ic);
                if (activityC19519x7af4daf3.O1 == null) {
                    com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.ib ibVar = new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.ib(activityC19519x7af4daf3.mo55332x76847179(), false, null);
                    activityC19519x7af4daf3.O1 = ibVar;
                    ibVar.m75550x9f36c276(true);
                    activityC19519x7af4daf3.f269683p.addView(activityC19519x7af4daf3.O1, new android.view.ViewGroup.LayoutParams(-1, height));
                    activityC19519x7af4daf3.O1.m75547x6c4ebec7(new com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89.x1(activityC19519x7af4daf3, height, b17));
                }
                android.view.ViewGroup.LayoutParams layoutParams = activityC19519x7af4daf3.O1.getLayoutParams();
                if (layoutParams != null && (layoutParams instanceof android.view.ViewGroup.MarginLayoutParams)) {
                    ((android.view.ViewGroup.MarginLayoutParams) layoutParams).topMargin = activityC19519x7af4daf3.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561432ic);
                    layoutParams.height = height;
                    activityC19519x7af4daf3.O1.setLayoutParams(layoutParams);
                }
                activityC19519x7af4daf3.O1.k(true);
                activityC19519x7af4daf3.O1.h();
                activityC19519x7af4daf3.O1.setVisibility(0);
                activityC19519x7af4daf3.O1.setTranslationY(height);
                activityC19519x7af4daf3.O1.animate().cancel();
                activityC19519x7af4daf3.O1.animate().translationY(0.0f).withEndAction(new com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89.y1(activityC19519x7af4daf3)).start();
                hz4.h hVar = ((hz4.f) hz4.f.wi()).f367940d;
                if (hVar != null) {
                    java.lang.String h17 = hVar.h();
                    hz4.i iVar = hVar.f367951i;
                    java.lang.String a18 = iVar.a(h17);
                    boolean g17 = hVar.g();
                    com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6447xbd8a5a3 c6447xbd8a5a3 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6447xbd8a5a3();
                    c6447xbd8a5a3.f137877d = 17;
                    c6447xbd8a5a3.f137879f = c6447xbd8a5a3.b("noteid", a18, true);
                    c6447xbd8a5a3.f137880g = g17 ? 1 : 0;
                    c6447xbd8a5a3.f137878e = c6447xbd8a5a3.b("sessionID", iVar.f367958a, true);
                    c6447xbd8a5a3.k();
                    if (com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40535xf2ceb016() <= 1) {
                        java.lang.String n17 = c6447xbd8a5a3.n();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(n17, "toShowString(...)");
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WNNoteReporter", "report%s %s", 14547, r26.i0.t(n17, com.p314xaae8f345.p592x631407a.p595x2eaf0c.log.p598x36f002.C4772x9611bb53.f20376x98ef612e, " ", false));
                    }
                }
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/wenote/ui/nativenote/toolview/WNToolViewHolder$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

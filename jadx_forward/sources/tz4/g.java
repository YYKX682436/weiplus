package tz4;

/* loaded from: classes12.dex */
public class g implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tz4.i f504876d;

    public g(tz4.i iVar) {
        this.f504876d = iVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wenote/ui/nativenote/toolview/WNToolBarAdapter$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        tz4.i iVar = this.f504876d;
        if (iVar.f504879f.get() != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89.ActivityC19519x7af4daf3 activityC19519x7af4daf3 = (com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89.ActivityC19519x7af4daf3) ((tz4.k) iVar.f504879f.get());
            activityC19519x7af4daf3.getClass();
            java.text.SimpleDateFormat simpleDateFormat = new java.text.SimpleDateFormat(com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.j() ? "yyyy年MM月dd日 HH:mm" : "yyyy/MM/dd HH:mm");
            java.util.Date date = new java.util.Date(java.lang.System.currentTimeMillis());
            mz4.j0 j0Var = activityC19519x7af4daf3.f269680m;
            java.lang.String format = simpleDateFormat.format(date);
            com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.p2447x633fb29.p2448xb9121c89.p2449x31c90fad.C19515x154ec45a b17 = j0Var.b();
            if (b17 != null) {
                b17.getEditableText().insert(b17.getSelectionEnd(), format);
            }
            hz4.h hVar = ((hz4.f) hz4.f.wi()).f367940d;
            if (hVar != null) {
                java.lang.String h17 = hVar.h();
                hz4.i iVar2 = hVar.f367951i;
                java.lang.String a17 = iVar2.a(h17);
                boolean g17 = hVar.g();
                com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6447xbd8a5a3 c6447xbd8a5a3 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6447xbd8a5a3();
                c6447xbd8a5a3.f137877d = 22;
                c6447xbd8a5a3.f137879f = c6447xbd8a5a3.b("noteid", a17, true);
                c6447xbd8a5a3.f137880g = g17 ? 1 : 0;
                c6447xbd8a5a3.f137878e = c6447xbd8a5a3.b("sessionID", iVar2.f367958a, true);
                c6447xbd8a5a3.k();
                if (com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40535xf2ceb016() <= 1) {
                    java.lang.String n17 = c6447xbd8a5a3.n();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(n17, "toShowString(...)");
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WNNoteReporter", "report%s %s", 14547, r26.i0.t(n17, com.p314xaae8f345.p592x631407a.p595x2eaf0c.log.p598x36f002.C4772x9611bb53.f20376x98ef612e, " ", false));
                }
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/wenote/ui/nativenote/toolview/WNToolBarAdapter$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

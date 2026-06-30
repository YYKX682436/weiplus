package os3;

/* loaded from: classes8.dex */
public class e implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1971xc73f03d7.ui.ActivityC16930x4222da3c f429594d;

    public e(com.p314xaae8f345.mm.p1006xc5476f33.p1971xc73f03d7.ui.ActivityC16930x4222da3c activityC16930x4222da3c) {
        this.f429594d = activityC16930x4222da3c;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/qqmail/ui/AttachDownloadPage$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1971xc73f03d7.ui.ActivityC16930x4222da3c activityC16930x4222da3c = this.f429594d;
        activityC16930x4222da3c.A = 2;
        if (!activityC16930x4222da3c.D) {
            ((hs3.s) ((ks3.t) i95.n0.c(ks3.t.class))).wi().b(activityC16930x4222da3c.B);
            activityC16930x4222da3c.B = 0L;
        } else if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(activityC16930x4222da3c.E)) {
            ((com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0) com.p314xaae8f345.p542x3306d5.C4435xa52e04fa.m37502x6f964b77(com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.class)).m37741x70920b1f(activityC16930x4222da3c.E);
            activityC16930x4222da3c.E = null;
        }
        activityC16930x4222da3c.b7();
        yj0.a.h(this, "com/tencent/mm/plugin/qqmail/ui/AttachDownloadPage$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

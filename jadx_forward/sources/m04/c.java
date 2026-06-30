package m04;

/* loaded from: classes12.dex */
public class c implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2049xc9fa65a8.ui.ActivityC17352x4a0e3167 f404088d;

    public c(com.p314xaae8f345.mm.p1006xc5476f33.p2049xc9fa65a8.ui.ActivityC17352x4a0e3167 activityC17352x4a0e3167) {
        this.f404088d = activityC17352x4a0e3167;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/search/ui/FTSInfoUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p2049xc9fa65a8.ui.ActivityC17352x4a0e3167 activityC17352x4a0e3167 = this.f404088d;
        if (activityC17352x4a0e3167.f241577i == null) {
            activityC17352x4a0e3167.f241577i = db5.e1.Q(activityC17352x4a0e3167, "", activityC17352x4a0e3167.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ggc), true, true, new m04.b(this));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2049xc9fa65a8.ui.ActivityC17352x4a0e3167 activityC17352x4a0e31672 = this.f404088d;
        activityC17352x4a0e31672.f241577i.show();
        p13.u uVar = new p13.u();
        uVar.f432673b = 65526;
        uVar.f432684m = activityC17352x4a0e31672;
        ((com.p314xaae8f345.mm.p1006xc5476f33.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).sj(10000, uVar);
        yj0.a.h(this, "com/tencent/mm/plugin/search/ui/FTSInfoUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

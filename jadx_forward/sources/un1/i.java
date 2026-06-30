package un1;

/* loaded from: classes.dex */
public final class i implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ un1.l f510976d;

    public i(un1.l lVar) {
        this.f510976d = lVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/backup/backupui/RoamLiteBanner$onInitializeView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        un1.l lVar = this.f510976d;
        long j17 = lVar.f510986p;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(lVar.f510983m, "[onRefreshWholeUi] open task detail ui from banner. pkgId=" + j17);
        if (j17 < 0) {
            yj0.a.h(this, "com/tencent/mm/plugin/backup/backupui/RoamLiteBanner$onInitializeView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        android.content.Intent intent = new android.content.Intent(view.getContext(), (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.p1260xddd27357.ActivityC12851x5f788c81.class);
        if (!(view.getContext() instanceof android.app.Activity)) {
            intent.setFlags(268435456);
        }
        intent.putExtra("packageId", j17);
        android.content.Context context = view.getContext();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(intent);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(context, arrayList2.toArray(), "com/tencent/mm/plugin/backup/backupui/RoamLiteBanner$onInitializeView$1", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList2.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/backup/backupui/RoamLiteBanner$onInitializeView$1", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        yj0.a.h(this, "com/tencent/mm/plugin/backup/backupui/RoamLiteBanner$onInitializeView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

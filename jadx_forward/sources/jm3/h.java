package jm3;

/* loaded from: classes10.dex */
public final class h implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.ActivityC16652x736766a6 f381853d;

    public h(com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.ActivityC16652x736766a6 activityC16652x736766a6) {
        this.f381853d = activityC16652x736766a6;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/mv/ui/MusicMvMakerPreviewUI$onCreate$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.ActivityC16652x736766a6 activityC16652x736766a6 = this.f381853d;
        android.content.Intent intent = new android.content.Intent(activityC16652x736766a6, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.ActivityC16654xdc9bdf62.class);
        r45.ss4 ss4Var = activityC16652x736766a6.f232399e;
        if (ss4Var != null) {
            intent.putExtra("key_track_data", ss4Var.mo14344x5f01b1f6());
        }
        pm0.v.g(intent, activityC16652x736766a6.getIntent(), "key_mv_from_scene", 0);
        activityC16652x736766a6.f232400f = true;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(intent);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(activityC16652x736766a6, arrayList2.toArray(), "com/tencent/mm/plugin/mv/ui/MusicMvMakerPreviewUI$onCreate$8", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activityC16652x736766a6.startActivity((android.content.Intent) arrayList2.get(0));
        yj0.a.f(activityC16652x736766a6, "com/tencent/mm/plugin/mv/ui/MusicMvMakerPreviewUI$onCreate$8", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activityC16652x736766a6.finish();
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6775xb6999670 c17 = fm3.g0.f345603a.c();
        c17.f141015k = 7L;
        c17.G = 0;
        c17.k();
        c17.o();
        yj0.a.h(this, "com/tencent/mm/plugin/mv/ui/MusicMvMakerPreviewUI$onCreate$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

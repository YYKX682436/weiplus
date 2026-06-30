package com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1921x6854f06;

/* loaded from: classes10.dex */
public class j implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1921x6854f06.ActivityC16662x5873ebce f232483d;

    public j(com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1921x6854f06.ActivityC16662x5873ebce activityC16662x5873ebce) {
        this.f232483d = activityC16662x5873ebce;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/mv/ui/shake/MusicMainUINew$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1921x6854f06.ActivityC16662x5873ebce activityC16662x5873ebce = this.f232483d;
        b21.r rVar = activityC16662x5873ebce.f232440m;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MusicMainUINew", "MusicType:%d, SongWebUrl ", java.lang.Integer.valueOf(rVar.f98878d), rVar.f98887p);
        if (!com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1921x6854f06.p.b(activityC16662x5873ebce.f232440m).isEmpty()) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.String[] strArr = {activityC16662x5873ebce.getString(com.p314xaae8f345.mm.R.C30867xcad56011.h4u), activityC16662x5873ebce.getString(com.p314xaae8f345.mm.R.C30867xcad56011.h4v)};
            arrayList2.add(0);
            arrayList2.add(1);
            db5.e1.e(activityC16662x5873ebce, "", strArr, "", new com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1921x6854f06.d(activityC16662x5873ebce));
        }
        yj0.a.h(this, "com/tencent/mm/plugin/mv/ui/shake/MusicMainUINew$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

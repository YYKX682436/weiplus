package na2;

/* loaded from: classes2.dex */
public final class b implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ na2.c f417486d;

    public b(na2.c cVar) {
        this.f417486d = cVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/activity/postplay/uic/FinderPostPlayActionBarUIC$initViews$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        na2.c cVar = this.f417486d;
        if (!cVar.m158354x19263085().isFinishing()) {
            cVar.m158354x19263085().finish();
        }
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = cVar.m158354x19263085();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.p1429x2d2bd3d4.ui.ActivityC13661xea07466e activityC13661xea07466e = m158354x19263085 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.p1429x2d2bd3d4.ui.ActivityC13661xea07466e ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.p1429x2d2bd3d4.ui.ActivityC13661xea07466e) m158354x19263085 : null;
        if (activityC13661xea07466e != null) {
            activityC13661xea07466e.f183334v = 1;
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/activity/postplay/uic/FinderPostPlayActionBarUIC$initViews$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

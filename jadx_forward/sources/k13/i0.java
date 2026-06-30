package k13;

/* loaded from: classes10.dex */
public final class i0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i13.c f384755d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1712x126205f4.ui.ActivityC15563xb39a5965 f384756e;

    public i0(i13.c cVar, com.p314xaae8f345.mm.p1006xc5476f33.p1712x126205f4.ui.ActivityC15563xb39a5965 activityC15563xb39a5965) {
        this.f384755d = cVar;
        this.f384756e = activityC15563xb39a5965;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/forcenotify/ui/ForceNotifyShowUI$onCreate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(view);
        this.f384755d.k(view);
        com.p314xaae8f345.mm.p1006xc5476f33.p1712x126205f4.ui.ActivityC15563xb39a5965 activityC15563xb39a5965 = this.f384756e;
        activityC15563xb39a5965.f218883p = false;
        activityC15563xb39a5965.f218884q = false;
        activityC15563xb39a5965.finish();
        yj0.a.h(this, "com/tencent/mm/plugin/forcenotify/ui/ForceNotifyShowUI$onCreate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

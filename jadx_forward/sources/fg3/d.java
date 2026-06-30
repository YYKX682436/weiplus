package fg3;

/* loaded from: classes12.dex */
public final class d implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fg3.g f343963d;

    public d(fg3.g gVar) {
        this.f343963d = gVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        mf3.k kVar;
        dg3.m mVar;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/media/video/VideoBottomBarLayer$attach$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        dg3.q qVar = dg3.q.f313874e;
        fg3.g gVar = this.f343963d;
        mf3.s sVar = gVar.f407643m;
        if (sVar != null && (kVar = sVar.f407650a) != null && (mVar = (dg3.m) gVar.H(dg3.m.class)) != null) {
            mVar.Z0(kVar, gVar.f435359s, qVar);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/media/video/VideoBottomBarLayer$attach$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

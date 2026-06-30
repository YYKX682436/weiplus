package di5;

/* loaded from: classes12.dex */
public final class e implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ di5.m f314330d;

    public e(di5.m mVar) {
        this.f314330d = mVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        mf3.k kVar;
        dg3.m mVar;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/media/finder/live/finderpost/FinderPostImageBottomBarLayer$attach$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        di5.m mVar2 = this.f314330d;
        mf3.s sVar = mVar2.f407643m;
        if (sVar != null && (kVar = sVar.f407650a) != null && (mVar = (dg3.m) mVar2.H(dg3.m.class)) != null) {
            mVar.y6(kVar, mVar2.f435359s);
        }
        yj0.a.h(this, "com/tencent/mm/ui/media/finder/live/finderpost/FinderPostImageBottomBarLayer$attach$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

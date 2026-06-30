package rf3;

/* loaded from: classes12.dex */
public final class i implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rf3.p f476524d;

    public i(rf3.p pVar) {
        this.f476524d = pVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        mf3.k kVar;
        dg3.m mVar;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/media/image/ImageBottomBarLayer$attach$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        rf3.p pVar = this.f476524d;
        mf3.s sVar = pVar.f407643m;
        if (sVar != null && (kVar = sVar.f407650a) != null && (mVar = (dg3.m) pVar.H(dg3.m.class)) != null) {
            mVar.y6(kVar, pVar.f435359s);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/media/image/ImageBottomBarLayer$attach$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

package wh5;

/* loaded from: classes12.dex */
public final class l implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wh5.s f527607d;

    public l(wh5.s sVar) {
        this.f527607d = sVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        mf3.k kVar;
        dg3.m mVar;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/media/chat/live/ChatLiveBottomBarLayer$attach$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        wh5.s sVar = this.f527607d;
        mf3.s sVar2 = sVar.f407643m;
        if (sVar2 != null && (kVar = sVar2.f407650a) != null && (mVar = (dg3.m) sVar.H(dg3.m.class)) != null) {
            mVar.y6(kVar, sVar.f435359s);
        }
        yj0.a.h(this, "com/tencent/mm/ui/media/chat/live/ChatLiveBottomBarLayer$attach$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

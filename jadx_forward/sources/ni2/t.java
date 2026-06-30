package ni2;

/* loaded from: classes3.dex */
public final class t implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ni2.w f419001d;

    public t(ni2.w wVar) {
        this.f419001d = wVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/mic/panel/FinderLiveMicGiftMemberPanelWidget$initContentView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f419001d.a();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/mic/panel/FinderLiveMicGiftMemberPanelWidget$initContentView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

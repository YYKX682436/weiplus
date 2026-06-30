package z35;

/* loaded from: classes4.dex */
public final class c0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.ui.p2486x75877a9b.C19718xcf23ab46 f551539d;

    public c0(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2486x75877a9b.C19718xcf23ab46 c19718xcf23ab46) {
        this.f551539d = c19718xcf23ab46;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/pluginsdk/ui/seekbar/HeroSeekBarView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f551539d.d();
        yj0.a.h(this, "com/tencent/mm/pluginsdk/ui/seekbar/HeroSeekBarView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

package cj4;

/* loaded from: classes3.dex */
public final class d implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cj4.k f41918d;

    public d(cj4.k kVar) {
        this.f41918d = kVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/textstatus/logic/BaseMiniStatusLoadLogic$handleSameFriendsTip$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f41918d.getClass();
        yj0.a.h(this, "com/tencent/mm/plugin/textstatus/logic/BaseMiniStatusLoadLogic$handleSameFriendsTip$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

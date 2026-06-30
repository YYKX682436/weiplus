package ue2;

/* loaded from: classes3.dex */
public final class m implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ue2.o f508358d;

    public m(ue2.o oVar) {
        this.f508358d = oVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/component/livechat/FinderLiveChatAnchorPluginLayout$setupDialogButtonListeners$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ue2.o oVar = this.f508358d;
        ue2.e0 e0Var = oVar.f508370p;
        if (e0Var != null) {
            e0Var.a(false);
        }
        ue2.o.r(oVar);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/component/livechat/FinderLiveChatAnchorPluginLayout$setupDialogButtonListeners$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

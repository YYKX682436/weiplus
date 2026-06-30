package hr3;

/* loaded from: classes8.dex */
public class t implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16833xebe5488f f365526d;

    public t(com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16833xebe5488f activityC16833xebe5488f) {
        this.f365526d = activityC16833xebe5488f;
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/profile/ui/AddDescriptionUI$9", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        rl5.r rVar = new rl5.r(this.f365526d.mo55332x76847179(), view);
        rVar.f478884u = new hr3.r(this);
        rVar.f478887x = new hr3.s(this);
        rVar.m();
        yj0.a.i(false, this, "com/tencent/mm/plugin/profile/ui/AddDescriptionUI$9", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return false;
    }
}

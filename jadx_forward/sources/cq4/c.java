package cq4;

/* loaded from: classes5.dex */
public final class c implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2343xd1075a44.C18831xf8e91db9 f302996d;

    public c(com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2343xd1075a44.C18831xf8e91db9 c18831xf8e91db9) {
        this.f302996d = c18831xf8e91db9;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/vlog/ui/widget/PagInputView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        yz5.l lVar = this.f302996d.textChangeCallback;
        if (lVar != null) {
            lVar.mo146xb9724478(java.lang.Boolean.TRUE);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/vlog/ui/widget/PagInputView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

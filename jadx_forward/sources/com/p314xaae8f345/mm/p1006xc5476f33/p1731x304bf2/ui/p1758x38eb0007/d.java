package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1758x38eb0007;

/* loaded from: classes3.dex */
public class d implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1758x38eb0007.ActivityC16014x161f98d8 f223074d;

    public d(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1758x38eb0007.ActivityC16014x161f98d8 activityC16014x161f98d8) {
        this.f223074d = activityC16014x161f98d8;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/game/ui/message/GameMsgCenterUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f223074d.finish();
        yj0.a.h(this, "com/tencent/mm/plugin/game/ui/message/GameMsgCenterUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

package com.p314xaae8f345.mm.p1006xc5476f33.fts.ui;

/* loaded from: classes3.dex */
public class o implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.ActivityC15588x58c11aee f219660d;

    public o(com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.ActivityC15588x58c11aee activityC15588x58c11aee) {
        this.f219660d = activityC15588x58c11aee;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/fts/ui/FTSAddFriendUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f219660d.finish();
        yj0.a.h(this, "com/tencent/mm/plugin/fts/ui/FTSAddFriendUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

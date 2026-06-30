package com.p314xaae8f345.mm.p1006xc5476f33.fav.ui;

/* loaded from: classes12.dex */
public class w5 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ActivityC13571xe8c83cab f183047d;

    public w5(com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ActivityC13571xe8c83cab activityC13571xe8c83cab) {
        this.f183047d = activityC13571xe8c83cab;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/fav/ui/FavSelectUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int intValue = ((java.lang.Integer) view.getTag()).intValue();
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_enter_fav_search_from", 1);
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ActivityC13571xe8c83cab activityC13571xe8c83cab = this.f183047d;
        if (intValue == 20) {
            intent.putExtra("key_to_user", activityC13571xe8c83cab.T);
            com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ec.d(activityC13571xe8c83cab.mo55332x76847179(), intent);
        } else {
            intent.putExtra("key_preset_search_type", intValue);
            intent.putExtra("key_to_user", activityC13571xe8c83cab.T);
            intent.putExtra("key_fav_item_id", activityC13571xe8c83cab.S);
            intent.putExtra("key_search_type", 1);
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = activityC13571xe8c83cab.mo55332x76847179();
            if (activityC13571xe8c83cab.U.f182017q) {
                intent.putExtra("key_search_type", 2);
                o72.x1.M0(mo55332x76847179, ".ui.FavFilterUI", intent, 4103, null);
            } else {
                o72.x1.L0(mo55332x76847179, ".ui.FavFilterUI", intent, null);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/fav/ui/FavSelectUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

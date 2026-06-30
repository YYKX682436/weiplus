package com.p314xaae8f345.mm.p1006xc5476f33.fav.ui;

/* loaded from: classes8.dex */
public class ob implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ActivityC13579xef51058a f182859d;

    public ob(com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ActivityC13579xef51058a activityC13579xef51058a) {
        this.f182859d = activityC13579xef51058a;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        long j17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/fav/ui/FavoriteIndexUI$27", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.w0.a(c01.id.c()) + com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.s0().toString();
        android.content.Intent intent = new android.content.Intent();
        int i17 = 0;
        intent.putExtra("key_enter_fav_cleanui_from", 0);
        java.util.List o47 = ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().o4();
        long j18 = 0;
        if (o47 != null) {
            java.util.Iterator it = o47.iterator();
            j17 = 0;
            while (it.hasNext()) {
                j17 += o72.x1.b((o72.r2) it.next());
            }
        } else {
            j17 = 0;
        }
        intent.putExtra("key_enter_fav_cleanui_status", j17 > o72.x1.K() ? 2 : o72.x1.m0() ? 1 : 0);
        intent.putExtra("key_enter_fav_cleanui_sessionid", str);
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ActivityC13579xef51058a activityC13579xef51058a = this.f182859d;
        o72.x1.L0(activityC13579xef51058a.mo55332x76847179(), ".ui.FavCleanUI", intent, null);
        int i18 = com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ActivityC13579xef51058a.f181969y1;
        activityC13579xef51058a.getClass();
        java.util.HashMap hashMap = new java.util.HashMap();
        java.util.List o48 = ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().o4();
        if (o48 != null) {
            java.util.Iterator it6 = o48.iterator();
            while (it6.hasNext()) {
                j18 += o72.x1.b((o72.r2) it6.next());
            }
        }
        if (j18 > o72.x1.K()) {
            i17 = 2;
        } else if (o72.x1.m0()) {
            i17 = 1;
        }
        hashMap.put("fav_cap_status", java.lang.Integer.valueOf(i17));
        hashMap.put("fav_cap_usage", java.lang.Float.valueOf(((float) o72.x1.b0()) / 1024.0f));
        hashMap.put("fav_cap_limit", java.lang.Float.valueOf(((float) o72.x1.a0()) / 1024.0f));
        hashMap.put("fav_clean_sessionid", str);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("fav_cap_detail_clean", "view_clk", hashMap, 32903);
        yj0.a.h(this, "com/tencent/mm/plugin/fav/ui/FavoriteIndexUI$27", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

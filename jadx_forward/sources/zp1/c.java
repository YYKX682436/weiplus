package zp1;

/* loaded from: classes12.dex */
public class c extends p012xc85e97e9.p103xe821e364.p104xd1075a44.w2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de f556480d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1280xec41ae0d.p1281x68ac49f.ActivityC12952x7179b981 f556481e;

    public c(com.p314xaae8f345.mm.p1006xc5476f33.p1280xec41ae0d.p1281x68ac49f.ActivityC12952x7179b981 activityC12952x7179b981, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de c1162x665295de) {
        this.f556481e = activityC12952x7179b981;
        this.f556480d = c1162x665295de;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.w2
    /* renamed from: onScrollStateChanged */
    public void mo481x4d79408f(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(c1163xf1deaba4);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/battery/stats/MMBatteryStatsActivity$2", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
        yj0.a.h(this, "com/tencent/mm/plugin/battery/stats/MMBatteryStatsActivity$2", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.w2
    /* renamed from: onScrolled */
    public void mo482x8d21972b(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, int i17, int i18) {
        boolean z17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(c1163xf1deaba4);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Integer.valueOf(i18));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/battery/stats/MMBatteryStatsActivity$2", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de c1162x665295de = this.f556480d;
        int w17 = c1162x665295de.w();
        int i19 = com.p314xaae8f345.mm.p1006xc5476f33.p1280xec41ae0d.p1281x68ac49f.ActivityC12952x7179b981.f175360m;
        com.p314xaae8f345.mm.p1006xc5476f33.p1280xec41ae0d.p1281x68ac49f.ActivityC12952x7179b981 activityC12952x7179b981 = this.f556481e;
        activityC12952x7179b981.U6(w17);
        if (c1162x665295de.y() == ((java.util.ArrayList) activityC12952x7179b981.f175361d.f518358a.f518352d).size() - 1) {
            zp1.e eVar = activityC12952x7179b981.f175361d;
            if (java.lang.Math.abs(eVar.f518361d) >= eVar.f518359b) {
                z17 = false;
            } else {
                int i27 = eVar.f518361d - 1;
                eVar.f518361d = i27;
                ph.a.b(com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p560x68ac49f.k.class, new vh.u(eVar, i27));
                z17 = true;
            }
            if (!z17 && !activityC12952x7179b981.f175366i) {
                activityC12952x7179b981.f175366i = true;
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/battery/stats/MMBatteryStatsActivity$2", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
    }
}

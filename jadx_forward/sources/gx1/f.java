package gx1;

/* loaded from: classes12.dex */
public class f implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gx1.g f358830d;

    public f(gx1.g gVar) {
        this.f358830d = gVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/component/editor/adapter/itemholder/EditorLocationItemHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ix1.e eVar = (ix1.e) this.f358830d.f358836e;
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("map_view_type", 2);
        intent.putExtra("kwebmap_slat", eVar.f376864t);
        intent.putExtra("kwebmap_lng", eVar.f376865u);
        intent.putExtra("kPoiName", eVar.f376863s);
        intent.putExtra("Kwebmap_locaion", eVar.f376867w);
        double d17 = eVar.f376866v;
        if (d17 >= 0.0d) {
            intent.putExtra("kwebmap_scale", d17);
        }
        intent.putExtra("kisUsername", "");
        intent.putExtra("kwebmap_from_to", true);
        intent.putExtra("KFavLocSigleView", true);
        intent.putExtra("kFavCanDel", false);
        intent.putExtra("kFavCanRemark", false);
        intent.putExtra("kPoiid", eVar.f376868x);
        intent.putExtra("KIsFromPoiList", eVar.f376869y);
        intent.putExtra("KPoiCategoryTips", eVar.f376870z);
        intent.putExtra("kPoiBusinessHour", eVar.A);
        intent.putExtra("KPoiPhone", eVar.B);
        intent.putExtra("KPoiPriceTips", eVar.C);
        intent.putExtra("kBuildingID", eVar.D);
        intent.putExtra("kFloorName", eVar.E);
        j45.l.j(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, ya.b.f77489x9ff58fb5, ".ui.RedirectUI", intent, null);
        yj0.a.h(this, "com/tencent/mm/plugin/component/editor/adapter/itemholder/EditorLocationItemHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

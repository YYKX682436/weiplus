package w82;

/* loaded from: classes8.dex */
public class f0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1416xd1075a44.C13622x4798ee75 f525373d;

    public f0(com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1416xd1075a44.C13622x4798ee75 c13622x4798ee75) {
        this.f525373d = c13622x4798ee75;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/fav/ui/widget/FavTagEntrance$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_fav_scene", 1);
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1416xd1075a44.C13622x4798ee75 c13622x4798ee75 = this.f525373d;
        intent.putExtra("key_fav_item_id", c13622x4798ee75.f183090e);
        o72.x1.L0(c13622x4798ee75.getContext(), ".ui.FavTagEditUI", intent, null);
        yj0.a.h(this, "com/tencent/mm/plugin/fav/ui/widget/FavTagEntrance$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

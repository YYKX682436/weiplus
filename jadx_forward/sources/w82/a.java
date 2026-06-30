package w82;

/* loaded from: classes8.dex */
public class a implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1416xd1075a44.C13616x9df1f62f f525344d;

    public a(com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1416xd1075a44.C13616x9df1f62f c13616x9df1f62f) {
        this.f525344d = c13616x9df1f62f;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/fav/ui/widget/FavCapacityPanel$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Intent intent = new android.content.Intent();
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1416xd1075a44.C13616x9df1f62f c13616x9df1f62f = this.f525344d;
        if (c13616x9df1f62f.f183058g == 0) {
            intent.putExtra("key_enter_fav_cleanui_from", 1);
        } else {
            intent.putExtra("key_enter_fav_cleanui_from", 2);
        }
        o72.x1.L0(c13616x9df1f62f.getContext(), ".ui.FavCleanUI", intent, null);
        yj0.a.h(this, "com/tencent/mm/plugin/fav/ui/widget/FavCapacityPanel$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

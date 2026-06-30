package w82;

/* loaded from: classes10.dex */
public final class w implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1416xd1075a44.C13619xdbaf3371 f525472d;

    public w(com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1416xd1075a44.C13619xdbaf3371 c13619xdbaf3371) {
        this.f525472d = c13619xdbaf3371;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/fav/ui/widget/FavFilterPanel$initView$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1416xd1075a44.C13619xdbaf3371 c13619xdbaf3371 = this.f525472d;
        int i17 = c13619xdbaf3371.f183075u;
        if (i17 == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1416xd1075a44.C13619xdbaf3371.b(c13619xdbaf3371, false, null, 3, null);
        } else if (!c13619xdbaf3371.f183076v) {
            if (i17 == -1 || i17 == 0) {
                c13619xdbaf3371.d(0);
            } else {
                c13619xdbaf3371.a(false, new w82.t(c13619xdbaf3371, 0));
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/fav/ui/widget/FavFilterPanel$initView$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

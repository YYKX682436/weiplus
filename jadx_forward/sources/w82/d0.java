package w82;

/* loaded from: classes11.dex */
public class d0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1416xd1075a44.C13620xa33772de f525369d;

    public d0(com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1416xd1075a44.C13620xa33772de c13620xa33772de) {
        this.f525369d = c13620xa33772de;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/fav/ui/widget/FavSearchActionView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1416xd1075a44.C13620xa33772de c13620xa33772de = this.f525369d;
        if (c13620xa33772de.f183087i == null) {
            yj0.a.h(this, "com/tencent/mm/plugin/fav/ui/widget/FavSearchActionView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        c13620xa33772de.f183083e.o();
        c13620xa33772de.f183083e.g();
        ((java.util.LinkedList) c13620xa33772de.f183086h).clear();
        ((java.util.LinkedList) c13620xa33772de.f183085g).clear();
        ((com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.j5) c13620xa33772de.f183087i).a(c13620xa33772de.f183084f, c13620xa33772de.f183086h, c13620xa33772de.f183085g, true);
        c13620xa33772de.b();
        yj0.a.h(this, "com/tencent/mm/plugin/fav/ui/widget/FavSearchActionView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

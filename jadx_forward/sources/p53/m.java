package p53;

/* loaded from: classes8.dex */
public class m implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.tab.C16024xb4559647 f433599d;

    public m(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.tab.C16024xb4559647 c16024xb4559647) {
        this.f433599d = c16024xb4559647;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/game/ui/tab/GameTabWidget$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        try {
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.tab.C16024xb4559647.c(this.f433599d.f223305d, (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.C15921xfed2506d.TabItem) view.getTag(), false, false, false);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GameTabWidget", "selectTab err:%s", e17.getMessage());
        }
        yj0.a.h(this, "com/tencent/mm/plugin/game/ui/tab/GameTabWidget$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

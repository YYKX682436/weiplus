package in4;

/* loaded from: classes9.dex */
public class n implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in4.p f374516d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.xn6 f374517e;

    public n(in4.q qVar, in4.p pVar, r45.xn6 xn6Var) {
        this.f374516d = pVar;
        this.f374517e = xn6Var;
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/topstory/ui/widget/MorePopupWindow$3", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.MorePopupWindow", "onLongClick favorite");
        in4.p pVar = this.f374516d;
        if (pVar != null) {
            pVar.b(this.f374517e);
        }
        yj0.a.i(false, this, "com/tencent/mm/plugin/topstory/ui/widget/MorePopupWindow$3", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return false;
    }
}

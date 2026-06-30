package in4;

/* loaded from: classes9.dex */
public class l implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in4.p f374512d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.xn6 f374513e;

    public l(in4.q qVar, in4.p pVar, r45.xn6 xn6Var) {
        this.f374512d = pVar;
        this.f374513e = xn6Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/topstory/ui/widget/MorePopupWindow$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.MorePopupWindow", "onClick unlike");
        in4.p pVar = this.f374512d;
        if (pVar != null) {
            pVar.a(this.f374513e);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/topstory/ui/widget/MorePopupWindow$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

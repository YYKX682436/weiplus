package w24;

/* loaded from: classes11.dex */
public class o implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f524166d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2079xd1075a44.C17660x9d61a64 f524167e;

    public o(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2079xd1075a44.C17660x9d61a64 c17660x9d61a64, java.lang.String str) {
        this.f524167e = c17660x9d61a64;
        this.f524166d = str;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        w24.s sVar;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/setting/ui/widget/SwitchAccountGridView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2079xd1075a44.C17660x9d61a64 c17660x9d61a64 = this.f524167e;
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(c17660x9d61a64.f243583d);
        java.lang.Boolean valueOf2 = java.lang.Boolean.valueOf(c17660x9d61a64.f243584e);
        java.lang.Boolean valueOf3 = java.lang.Boolean.valueOf(c17660x9d61a64.f243585f);
        java.lang.String str = this.f524166d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SwitchAccountGridView", "click %s, deleteState %s, logoutState %s, loginState %s", str, valueOf, valueOf2, valueOf3);
        if (!c17660x9d61a64.f243583d && !c17660x9d61a64.f243584e && !c17660x9d61a64.f243585f && (sVar = c17660x9d61a64.f243592p) != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.rm) sVar).a(str);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/setting/ui/widget/SwitchAccountGridView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

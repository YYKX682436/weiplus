package g63;

/* loaded from: classes.dex */
public final class d1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1760x9697b1ee.ui.ActivityC16048x951c5ec6 f350632d;

    public d1(com.p314xaae8f345.mm.p1006xc5476f33.p1760x9697b1ee.ui.ActivityC16048x951c5ec6 activityC16048x951c5ec6) {
        this.f350632d = activityC16048x951c5ec6;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/gamelife/ui/TestUI$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1760x9697b1ee.ui.ActivityC16048x951c5ec6 activityC16048x951c5ec6 = this.f350632d;
        java.util.LinkedList linkedList = new java.util.LinkedList(kz5.c0.i(activityC16048x951c5ec6.f223533e, activityC16048x951c5ec6.f223532d));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CgiTest", "getChatUserInfo, userNameList = " + linkedList);
        new w53.d(linkedList).l();
        yj0.a.h(this, "com/tencent/mm/plugin/gamelife/ui/TestUI$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

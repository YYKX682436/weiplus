package g63;

/* loaded from: classes.dex */
public final class i1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public static final g63.i1 f350659d = new g63.i1();

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/gamelife/ui/TestUI$onCreate$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1760x9697b1ee.ui.ActivityC16048x951c5ec6.f223531h;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CgiTest", "setChatSessionData, sessionId = S1_BgAAdQoEcfnVwzCiSbiVnB7BOg@gamelifesess, mask = 1, switch = true");
        new w53.f("S1_BgAAdQoEcfnVwzCiSbiVnB7BOg@gamelifesess", 1L, true).l();
        yj0.a.h(this, "com/tencent/mm/plugin/gamelife/ui/TestUI$onCreate$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

package fh4;

/* loaded from: classes3.dex */
public class t implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2254xdba97f87.ui.ActivityC18551xd77e8c9b f344240d;

    public t(com.p314xaae8f345.mm.p1006xc5476f33.p2254xdba97f87.ui.ActivityC18551xd77e8c9b activityC18551xd77e8c9b) {
        this.f344240d = activityC18551xd77e8c9b;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/talkroom/ui/TalkRoomUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p2254xdba97f87.ui.ActivityC18551xd77e8c9b activityC18551xd77e8c9b = this.f344240d;
        activityC18551xd77e8c9b.getClass();
        boolean z17 = false;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.j1((java.lang.Integer) c01.d9.b().p().l(144641, null), 0) <= 0) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k2 k2Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k2(activityC18551xd77e8c9b, com.p314xaae8f345.mm.R.C30868x68b1db1.f576327wg);
            android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) com.p314xaae8f345.mm.ui.id.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.cxu, (android.view.ViewGroup) null);
            linearLayout.setMinimumWidth(10000);
            android.widget.Button button = (android.widget.Button) linearLayout.findViewById(com.p314xaae8f345.mm.R.id.h5h);
            k2Var.setCanceledOnTouchOutside(true);
            k2Var.setOnDismissListener(new fh4.a0(activityC18551xd77e8c9b));
            k2Var.setCancelable(false);
            button.setOnClickListener(new fh4.h(activityC18551xd77e8c9b, k2Var));
            k2Var.setContentView(linearLayout);
            k2Var.show();
            z17 = true;
        }
        if (!z17) {
            activityC18551xd77e8c9b.onBackPressed();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/talkroom/ui/TalkRoomUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

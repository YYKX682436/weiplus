package com.p314xaae8f345.mm.p648x55baa833.ui;

/* renamed from: com.tencent.mm.chatroom.ui.SeeMemberRecordUI */
/* loaded from: classes12.dex */
public class ActivityC10363x24719672 extends com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10372xd653ffea {
    @Override // com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10372xd653ffea
    public void a7(android.view.View view, int i17, long j17) {
        android.widget.ListAdapter adapter = this.f145504d.getAdapter();
        com.p314xaae8f345.mm.p648x55baa833.ui.kd kdVar = this.f145510m;
        if (adapter != kdVar) {
            android.widget.ListAdapter adapter2 = this.f145504d.getAdapter();
            com.p314xaae8f345.mm.ui.p2690x38b72420.e5 e5Var = this.f145509i;
            if (adapter2 == e5Var) {
                d7(e5Var.getItem(i17).f288383s);
                return;
            }
            return;
        }
        com.p314xaae8f345.mm.p648x55baa833.ui.bd item = kdVar.getItem(i17);
        if (item == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SeeMemberRecordUI", "item is null!");
            return;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var = item.f145592a;
        if (z3Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SeeMemberRecordUI", "contact is null!");
        } else {
            d7(z3Var.d1());
        }
    }

    public final void d7(java.lang.String str) {
        mo48674x36654fab();
        android.content.Intent intent = new android.content.Intent(this, (java.lang.Class<?>) com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10375x35d0ae60.class);
        intent.putExtra("RoomInfo_Id", this.f145512o);
        intent.putExtra("room_member", str);
        intent.putExtra(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28, getString(com.p314xaae8f345.mm.R.C30867xcad56011.iem));
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/chatroom/ui/SeeMemberRecordUI", "doSeeMemberRecord", "(Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(this, "com/tencent/mm/chatroom/ui/SeeMemberRecordUI", "doSeeMemberRecord", "(Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    @Override // com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10372xd653ffea, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        android.transition.Transition inflateTransition = android.transition.TransitionInflater.from(this).inflateTransition(android.R.transition.fade);
        inflateTransition.excludeTarget(getWindow().getDecorView().findViewById(com.p314xaae8f345.mm.R.id.f563968ei), true);
        inflateTransition.excludeTarget(android.R.id.statusBarBackground, true);
        getWindow().setEnterTransition(inflateTransition);
    }
}

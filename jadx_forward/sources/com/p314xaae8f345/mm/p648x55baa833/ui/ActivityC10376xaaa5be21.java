package com.p314xaae8f345.mm.p648x55baa833.ui;

/* renamed from: com.tencent.mm.chatroom.ui.TransferRoomOwnerUI */
/* loaded from: classes12.dex */
public class ActivityC10376xaaa5be21 extends com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10372xd653ffea implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: v, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f145539v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f145540w;

    @Override // com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10372xd653ffea
    public void W6() {
        super.W6();
        this.f145540w = getIntent().getBooleanExtra("quit_room", false);
    }

    @Override // com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10372xd653ffea
    public void a7(android.view.View view, int i17, long j17) {
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var;
        java.lang.String z07;
        com.p314xaae8f345.mm.p648x55baa833.ui.bd item = this.f145510m.getItem(i17);
        if (item == null || (z3Var = item.f145592a) == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.TransferRoomOwnerUI", "null == item || null == item.contact");
            return;
        }
        java.lang.String d17 = z3Var.d1();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(z3Var.w0())) {
            com.p314xaae8f345.mm.p2621x8fb0427b.a3 a3Var = this.f145511n;
            z07 = a3Var == null ? null : a3Var.z0(z3Var.d1());
        } else {
            z07 = z3Var.w0();
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(z07)) {
            z07 = z3Var.f2();
        }
        if (!z3Var.r2()) {
            com.p314xaae8f345.mm.p2621x8fb0427b.ya z08 = ((com.p314xaae8f345.mm.p2621x8fb0427b.ab) ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).mj()).z0(z3Var.d1());
            if (z08 != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(z08.f66692x4854b29d)) {
                z07 = z08.f66692x4854b29d;
            }
        }
        java.lang.String a17 = t41.g.a(z3Var);
        if (!android.text.TextUtils.isEmpty(a17)) {
            z07 = z07 + ((java.lang.Object) a17);
        }
        db5.e1.u(this, !this.f145540w ? getString(com.p314xaae8f345.mm.R.C30867xcad56011.i6q, z07) : getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574427i60, z07), "", new com.p314xaae8f345.mm.p648x55baa833.ui.me(this, d17), new com.p314xaae8f345.mm.p648x55baa833.ui.ne(this));
    }

    @Override // com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10372xd653ffea
    public boolean c7() {
        return false;
    }

    @Override // com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10372xd653ffea, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.q4(this.f145512o)) {
            gm0.j1.n().f354821b.a(811, this);
        } else {
            gm0.j1.n().f354821b.a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.yc.f35026x366c91de, this);
        }
    }

    @Override // com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10372xd653ffea, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = this.f145539v;
        if (u3Var != null && u3Var.isShowing()) {
            this.f145539v.dismiss();
        }
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.q4(this.f145512o)) {
            gm0.j1.n().f354821b.q(811, this);
        } else {
            gm0.j1.n().f354821b.q(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.yc.f35026x366c91de, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = this.f145539v;
        if (u3Var != null && u3Var.isShowing()) {
            this.f145539v.dismiss();
        }
        if (m1Var.mo808xfb85f7b0() == 990 || m1Var.mo808xfb85f7b0() == 811) {
            if (i17 != 0 || i18 != 0) {
                db5.t7.m123882x26a183b(this, com.p314xaae8f345.mm.R.C30867xcad56011.i6n, 1).show();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.TransferRoomOwnerUI", "dz[onSceneEnd transfer failed: %d %d %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
                return;
            }
            if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.q4(this.f145512o)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TransferRoomOwnerUI", "dz[onSceneEnd transfer successfully],owner_username:%s", ((l41.g0) ((ab0.w) m1Var)).f397350f);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TransferRoomOwnerUI", "dz[onSceneEnd transfer successfully],owner_username:%s", ((kn.c0) m1Var).f390915f);
            }
            db5.t7.m123882x26a183b(this, com.p314xaae8f345.mm.R.C30867xcad56011.i6o, 1).show();
            android.content.Intent intent = new android.content.Intent(mo55332x76847179(), (java.lang.Class<?>) com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10332x8a1129f5.class);
            intent.putExtra("RoomInfo_Id", this.f145512o);
            intent.putExtra("Chat_User", this.f145512o);
            intent.putExtra("Is_Chatroom", true);
            intent.setFlags(67108864);
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = mo55332x76847179();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(mo55332x76847179, arrayList.toArray(), "com/tencent/mm/chatroom/ui/TransferRoomOwnerUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            mo55332x76847179.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(mo55332x76847179, "com/tencent/mm/chatroom/ui/TransferRoomOwnerUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            finish();
        }
    }
}

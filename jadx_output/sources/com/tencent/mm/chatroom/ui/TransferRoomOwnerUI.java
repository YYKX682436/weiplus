package com.tencent.mm.chatroom.ui;

/* loaded from: classes12.dex */
public class TransferRoomOwnerUI extends com.tencent.mm.chatroom.ui.SelectMemberUI implements com.tencent.mm.modelbase.u0 {

    /* renamed from: v, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.u3 f64006v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f64007w;

    @Override // com.tencent.mm.chatroom.ui.SelectMemberUI
    public void W6() {
        super.W6();
        this.f64007w = getIntent().getBooleanExtra("quit_room", false);
    }

    @Override // com.tencent.mm.chatroom.ui.SelectMemberUI
    public void a7(android.view.View view, int i17, long j17) {
        com.tencent.mm.storage.z3 z3Var;
        java.lang.String z07;
        com.tencent.mm.chatroom.ui.bd item = this.f63977m.getItem(i17);
        if (item == null || (z3Var = item.f64059a) == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.TransferRoomOwnerUI", "null == item || null == item.contact");
            return;
        }
        java.lang.String d17 = z3Var.d1();
        if (com.tencent.mm.sdk.platformtools.t8.K0(z3Var.w0())) {
            com.tencent.mm.storage.a3 a3Var = this.f63978n;
            z07 = a3Var == null ? null : a3Var.z0(z3Var.d1());
        } else {
            z07 = z3Var.w0();
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(z07)) {
            z07 = z3Var.f2();
        }
        if (!z3Var.r2()) {
            com.tencent.mm.storage.ya z08 = ((com.tencent.mm.storage.ab) ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).mj()).z0(z3Var.d1());
            if (z08 != null && !com.tencent.mm.sdk.platformtools.t8.K0(z08.field_conRemark)) {
                z07 = z08.field_conRemark;
            }
        }
        java.lang.String a17 = t41.g.a(z3Var);
        if (!android.text.TextUtils.isEmpty(a17)) {
            z07 = z07 + ((java.lang.Object) a17);
        }
        db5.e1.u(this, !this.f64007w ? getString(com.tencent.mm.R.string.i6q, z07) : getString(com.tencent.mm.R.string.f492894i60, z07), "", new com.tencent.mm.chatroom.ui.me(this, d17), new com.tencent.mm.chatroom.ui.ne(this));
    }

    @Override // com.tencent.mm.chatroom.ui.SelectMemberUI
    public boolean c7() {
        return false;
    }

    @Override // com.tencent.mm.chatroom.ui.SelectMemberUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        if (com.tencent.mm.storage.z3.q4(this.f63979o)) {
            gm0.j1.n().f273288b.a(811, this);
        } else {
            gm0.j1.n().f273288b.a(com.tencent.mm.plugin.appbrand.jsapi.yc.CTRL_INDEX, this);
        }
    }

    @Override // com.tencent.mm.chatroom.ui.SelectMemberUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        com.tencent.mm.ui.widget.dialog.u3 u3Var = this.f64006v;
        if (u3Var != null && u3Var.isShowing()) {
            this.f64006v.dismiss();
        }
        if (com.tencent.mm.storage.z3.q4(this.f63979o)) {
            gm0.j1.n().f273288b.q(811, this);
        } else {
            gm0.j1.n().f273288b.q(com.tencent.mm.plugin.appbrand.jsapi.yc.CTRL_INDEX, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mm.ui.widget.dialog.u3 u3Var = this.f64006v;
        if (u3Var != null && u3Var.isShowing()) {
            this.f64006v.dismiss();
        }
        if (m1Var.getType() == 990 || m1Var.getType() == 811) {
            if (i17 != 0 || i18 != 0) {
                db5.t7.makeText(this, com.tencent.mm.R.string.i6n, 1).show();
                com.tencent.mars.xlog.Log.w("MicroMsg.TransferRoomOwnerUI", "dz[onSceneEnd transfer failed: %d %d %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
                return;
            }
            if (com.tencent.mm.storage.z3.q4(this.f63979o)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.TransferRoomOwnerUI", "dz[onSceneEnd transfer successfully],owner_username:%s", ((l41.g0) ((ab0.w) m1Var)).f315817f);
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.TransferRoomOwnerUI", "dz[onSceneEnd transfer successfully],owner_username:%s", ((kn.c0) m1Var).f309382f);
            }
            db5.t7.makeText(this, com.tencent.mm.R.string.i6o, 1).show();
            android.content.Intent intent = new android.content.Intent(getContext(), (java.lang.Class<?>) com.tencent.mm.chatroom.ui.ChatroomInfoUI.class);
            intent.putExtra("RoomInfo_Id", this.f63979o);
            intent.putExtra("Chat_User", this.f63979o);
            intent.putExtra("Is_Chatroom", true);
            intent.setFlags(67108864);
            androidx.appcompat.app.AppCompatActivity context = getContext();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/chatroom/ui/TransferRoomOwnerUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(context, "com/tencent/mm/chatroom/ui/TransferRoomOwnerUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            finish();
        }
    }
}

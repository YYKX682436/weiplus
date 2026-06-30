package com.tencent.mm.chatroom.ui;

/* loaded from: classes12.dex */
public class SeeMemberRecordUI extends com.tencent.mm.chatroom.ui.SelectMemberUI {
    @Override // com.tencent.mm.chatroom.ui.SelectMemberUI
    public void a7(android.view.View view, int i17, long j17) {
        android.widget.ListAdapter adapter = this.f63971d.getAdapter();
        com.tencent.mm.chatroom.ui.kd kdVar = this.f63977m;
        if (adapter != kdVar) {
            android.widget.ListAdapter adapter2 = this.f63971d.getAdapter();
            com.tencent.mm.ui.contact.e5 e5Var = this.f63976i;
            if (adapter2 == e5Var) {
                d7(e5Var.getItem(i17).f206850s);
                return;
            }
            return;
        }
        com.tencent.mm.chatroom.ui.bd item = kdVar.getItem(i17);
        if (item == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SeeMemberRecordUI", "item is null!");
            return;
        }
        com.tencent.mm.storage.z3 z3Var = item.f64059a;
        if (z3Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SeeMemberRecordUI", "contact is null!");
        } else {
            d7(z3Var.d1());
        }
    }

    public final void d7(java.lang.String str) {
        hideVKB();
        android.content.Intent intent = new android.content.Intent(this, (java.lang.Class<?>) com.tencent.mm.chatroom.ui.SelectedMemberChattingRecordUI.class);
        intent.putExtra("RoomInfo_Id", this.f63979o);
        intent.putExtra("room_member", str);
        intent.putExtra(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE, getString(com.tencent.mm.R.string.iem));
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/chatroom/ui/SeeMemberRecordUI", "doSeeMemberRecord", "(Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(this, "com/tencent/mm/chatroom/ui/SeeMemberRecordUI", "doSeeMemberRecord", "(Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    @Override // com.tencent.mm.chatroom.ui.SelectMemberUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        android.transition.Transition inflateTransition = android.transition.TransitionInflater.from(this).inflateTransition(android.R.transition.fade);
        inflateTransition.excludeTarget(getWindow().getDecorView().findViewById(com.tencent.mm.R.id.f482435ei), true);
        inflateTransition.excludeTarget(android.R.id.statusBarBackground, true);
        getWindow().setEnterTransition(inflateTransition);
    }
}

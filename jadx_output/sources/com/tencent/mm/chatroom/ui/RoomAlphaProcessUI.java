package com.tencent.mm.chatroom.ui;

@db5.a(3)
@java.lang.Deprecated
/* loaded from: classes.dex */
public class RoomAlphaProcessUI extends com.tencent.mm.ui.MMActivity implements com.tencent.mm.chatroom.ui.da {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f63839d;

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return -1;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.f63839d = getIntent().getStringExtra("RoomInfo_Id");
        initView();
        kn.e0 e0Var = new kn.e0(this.f63839d);
        gm0.j1.n().f273288b.a(com.tencent.mm.plugin.appbrand.jsapi.video.jsapi.g.CTRL_INDEX, new com.tencent.mm.chatroom.ui.ca(false, db5.e1.Q(this, null, getString(com.tencent.mm.R.string.ggc), true, false, new com.tencent.mm.chatroom.ui.ba()), this, this));
        gm0.j1.n().f273288b.g(e0Var);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }
}

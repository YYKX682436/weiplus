package com.tencent.mm.plugin.exdevice.ui;

/* loaded from: classes13.dex */
public class ExdeviceManageDeviceUI extends com.tencent.mm.ui.MMActivity {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.ListView f99295d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.exdevice.ui.n3 f99296e;

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.a9z;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        this.f99295d = (android.widget.ListView) findViewById(com.tencent.mm.R.id.i3y);
        this.f99296e = new com.tencent.mm.plugin.exdevice.ui.n3(this, null);
        android.view.View.inflate(this, com.tencent.mm.R.layout.a9l, null);
        this.f99295d.setAdapter((android.widget.ListAdapter) this.f99296e);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        com.tencent.mm.plugin.exdevice.ui.n3 n3Var = this.f99296e;
        java.util.List f17 = com.tencent.mm.plugin.exdevice.model.l3.Ui().f1();
        java.util.LinkedList linkedList = (java.util.LinkedList) n3Var.f99581d;
        linkedList.clear();
        if (((java.util.LinkedList) f17).size() != 0) {
            linkedList.addAll(f17);
        }
        this.f99296e.notifyDataSetChanged();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setBackBtn(new com.tencent.mm.plugin.exdevice.ui.i3(this));
        setMMTitle(com.tencent.mm.R.string.c3t);
        com.tencent.mm.autogen.events.ExDeviceGetBoundDevicesEvent exDeviceGetBoundDevicesEvent = new com.tencent.mm.autogen.events.ExDeviceGetBoundDevicesEvent();
        exDeviceGetBoundDevicesEvent.f54129g.f7605a = true;
        exDeviceGetBoundDevicesEvent.e();
        initView();
        gm0.j1.n().f273288b.a(537, this.f99296e);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        gm0.j1.n().f273288b.q(537, this.f99296e);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent keyEvent) {
        if (i17 != 4 || keyEvent.getRepeatCount() != 0 || !this.f99296e.f99582e) {
            return super.onKeyDown(i17, keyEvent);
        }
        updateOptionMenuText(0, getString(com.tencent.mm.R.string.f490381te));
        com.tencent.mm.plugin.exdevice.ui.n3 n3Var = this.f99296e;
        if (!n3Var.f99582e) {
            return true;
        }
        n3Var.f99582e = false;
        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.exdevice.ui.k3(n3Var));
        return true;
    }
}

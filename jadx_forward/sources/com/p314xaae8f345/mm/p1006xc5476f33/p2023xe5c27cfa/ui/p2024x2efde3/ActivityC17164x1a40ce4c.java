package com.p314xaae8f345.mm.p1006xc5476f33.p2023xe5c27cfa.ui.p2024x2efde3;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/repairer/ui/demo/RepairerTextStatusShowConfigUI;", "Lcom/tencent/mm/plugin/mvvmbase/BaseMvvmActivity;", "<init>", "()V", "ui-repairer_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.repairer.ui.demo.RepairerTextStatusShowConfigUI */
/* loaded from: classes11.dex */
public class ActivityC17164x1a40ce4c extends com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0 {
    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.cg9;
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        ((we0.j1) ((xe0.l0) i95.n0.c(xe0.l0.class))).getClass();
        org.json.JSONObject mo12245xcc313de3 = bk4.i.a().d().mo12245xcc313de3();
        java.lang.Object obj = mo12245xcc313de3.get("key");
        ((android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.onr)).setText("当前状态配置key:" + obj);
        ((android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.olv)).setText(mo12245xcc313de3.toString());
        android.widget.Button button = (android.widget.Button) findViewById(com.p314xaae8f345.mm.R.id.re8);
        if (button != null) {
            button.setOnClickListener(new yw3.g7(this));
        }
        android.widget.Button button2 = (android.widget.Button) findViewById(com.p314xaae8f345.mm.R.id.f565018re4);
        if (button2 != null) {
            button2.setOnClickListener(new yw3.h7(this));
        }
        android.widget.Button button3 = (android.widget.Button) findViewById(com.p314xaae8f345.mm.R.id.f565019re5);
        if (button3 != null) {
            button3.setOnClickListener(new yw3.i7(this));
        }
    }
}

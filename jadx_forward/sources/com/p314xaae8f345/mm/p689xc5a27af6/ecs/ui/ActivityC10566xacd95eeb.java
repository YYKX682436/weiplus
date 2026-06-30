package com.p314xaae8f345.mm.p689xc5a27af6.ecs.ui;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/feature/ecs/ui/EcsGiftFlutterUI;", "Lcom/tencent/mm/plugin/flutter/ui/MMFlutterViewActivity;", "<init>", "()V", "plugin-ecs_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.feature.ecs.ui.EcsGiftFlutterUI */
/* loaded from: classes9.dex */
public final class ActivityC10566xacd95eeb extends com.p314xaae8f345.mm.p1006xc5476f33.p1701xd2ae381c.ui.ActivityC15553x533c7950 {
    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getForceOrientation */
    public int mo44431x663c095b() {
        return 1;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1701xd2ae381c.ui.ActivityC15553x533c7950, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        b30.i a17 = b30.i.f99096b.a(this);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EcsActivityHelper", "requestCode:" + i17 + " size:" + a17.a().size());
        java.util.Iterator it = a17.a().iterator();
        while (it.hasNext()) {
            b30.e eVar = (b30.e) it.next();
            if (eVar.a(i17, i18, intent)) {
                a17.a().remove(eVar);
            }
        }
        a17.a().size();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1701xd2ae381c.ui.ActivityC15553x533c7950, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        setTheme(com.p314xaae8f345.mm.R.C30868x68b1db1.l_);
        super.onCreate(bundle);
        getWindow().getDecorView().setBackgroundColor(0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EcsGiftFlutterUI", "EcsGiftFlutterUI, " + hashCode() + " on create");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1701xd2ae381c.ui.ActivityC15553x533c7950, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EcsGiftFlutterUI", "EcsGiftFlutterUI, " + hashCode() + " destroy");
        b30.g gVar = b30.i.f99096b;
        ((java.util.WeakHashMap) ((jz5.n) b30.i.f99097c).mo141623x754a37bb()).remove(this);
    }
}

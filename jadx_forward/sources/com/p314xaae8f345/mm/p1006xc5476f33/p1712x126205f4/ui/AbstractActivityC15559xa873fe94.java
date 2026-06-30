package com.p314xaae8f345.mm.p1006xc5476f33.p1712x126205f4.ui;

@db5.a(m123858x6ac9171 = 3)
@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/forcenotify/ui/BaseForceNotifyShowUI;", "Lcom/tencent/mm/ui/MMActivity;", "<init>", "()V", "plugin-force-notify_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.forcenotify.ui.BaseForceNotifyShowUI */
/* loaded from: classes10.dex */
public abstract class AbstractActivityC15559xa873fe94 extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f218860d = "MicroMsg.ForceNotifyShowUI";

    /* renamed from: e, reason: collision with root package name */
    public i13.c f218861e;

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        finish();
        overridePendingTransition(0, com.p314xaae8f345.mm.R.C30854x2dc211.f559388dd);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        overridePendingTransition(com.p314xaae8f345.mm.R.C30854x2dc211.f559390df, com.p314xaae8f345.mm.R.C30854x2dc211.f559381d6);
        getWindow().addFlags(6815744);
        super.onCreate(bundle);
        m78505x1ef531b7(true);
        if (fp.h.c(19)) {
            getWindow().setFlags(201327616, 201327616);
        } else {
            getWindow().setFlags(1024, 1024);
        }
        mo54448x9c8c0d33(new k13.a(this));
        i13.l lVar = i13.n.f368830c;
        if (true ^ lVar.a().f368832a.isEmpty()) {
            this.f218861e = (i13.c) lVar.a().f368832a.poll();
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(this.f218860d, "forceNotify dataList is empty");
            finish();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        i13.c cVar = this.f218861e;
        if (cVar != null) {
            i13.n a17 = i13.n.f368830c.a();
            a17.getClass();
            java.lang.String forcePushId = cVar.f368808d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(forcePushId, "forcePushId");
            a17.f368833b.remove(forcePushId);
        }
        boolean z17 = !i13.n.f368830c.a().f368832a.isEmpty();
        java.lang.String str = this.f218860d;
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "continue to showNotifyActivity");
            ((h13.l0) i95.n0.c(h13.l0.class)).hj(true);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "[onDestroy]");
    }
}

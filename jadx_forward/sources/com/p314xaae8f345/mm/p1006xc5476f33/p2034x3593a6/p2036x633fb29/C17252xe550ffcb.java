package com.p314xaae8f345.mm.p1006xc5476f33.p2034x3593a6.p2036x633fb29;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/rtos/model/RtosWatchGetA8KeyRedirectListener;", "Lcom/tencent/mm/sdk/event/IListener;", "Lcom/tencent/mm/autogen/events/GetA8KeyRedirectEvent;", "<init>", "()V", "feature-exdevice_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.rtos.model.RtosWatchGetA8KeyRedirectListener */
/* loaded from: classes5.dex */
public final class C17252xe550ffcb extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5587xf7a06bec> {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f240118d;

    public C17252xe550ffcb() {
        super(com.p314xaae8f345.mm.app.a0.f134821d);
        this.f240118d = "MicroMsg.Rtos.RtosWatchGetA8KeyRedirectListener";
        this.f39173x3fe91575 = -1894126628;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
    /* renamed from: callback */
    public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5587xf7a06bec c5587xf7a06bec) {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5587xf7a06bec event = c5587xf7a06bec;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        java.lang.String str = this.f240118d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "callback");
        am.df dfVar = event.f135909g;
        int i17 = dfVar.f87979a;
        java.lang.String str2 = dfVar.f87980b;
        if (i17 != 54) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(str, "action code is no RtosWatch code. %d", java.lang.Integer.valueOf(i17));
        } else if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(str, "url is empty.");
        } else {
            java.lang.String queryParameter = android.net.Uri.parse(str2).getQueryParameter(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26371x1ed959cb.f52914x1ed75ebb);
            java.lang.String a17 = c01.b9.f118602c.a("last_avatar_path", "");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "device mac : %s", queryParameter);
            android.content.Intent intent = new android.content.Intent();
            intent.setFlags(268435456);
            intent.setClass(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.p1006xc5476f33.p2034x3593a6.ui.ActivityC17256xc70b42d4.class);
            intent.putExtra(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26371x1ed959cb.f52914x1ed75ebb, queryParameter);
            intent.putExtra("avatar", a17);
            android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/rtos/model/RtosWatchGetA8KeyRedirectListener", "callback", "(Lcom/tencent/mm/autogen/events/GetA8KeyRedirectEvent;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(context, "com/tencent/mm/plugin/rtos/model/RtosWatchGetA8KeyRedirectListener", "callback", "(Lcom/tencent/mm/autogen/events/GetA8KeyRedirectEvent;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
        return false;
    }
}

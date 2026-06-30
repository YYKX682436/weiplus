package com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.p2294x237a88eb;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/ting/notification/BaseTingBroadcastReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "plugin-ting_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.ting.notification.BaseTingBroadcastReceiver */
/* loaded from: classes.dex */
public abstract class AbstractC18719xaaab1211 extends android.content.BroadcastReceiver {
    public void a(android.content.Context context, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    public abstract void b();

    public abstract void c();

    public abstract void d();

    public abstract void e();

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(intent, "intent");
        int intExtra = intent.getIntExtra("com.tencent.mm.ting.ActionCode", 0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BaseTingBroadcastReceiver", "onReceive:" + intExtra);
        if (intExtra == 1) {
            d();
            return;
        }
        if (intExtra == 2) {
            c();
            return;
        }
        if (intExtra == 3) {
            b();
        } else if (intExtra == 4) {
            e();
        } else {
            if (intExtra != 5) {
                return;
            }
            a(context, intent.getIntExtra("com.tent.mm.ting.PlayAppId", -1));
        }
    }
}

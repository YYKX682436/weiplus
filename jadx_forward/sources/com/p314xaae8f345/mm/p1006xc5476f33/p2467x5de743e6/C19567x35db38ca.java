package com.p314xaae8f345.mm.p1006xc5476f33.p2467x5de743e6;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/xlabeffect/WeVisUpdateReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "plugin-xlabeffect_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.xlabeffect.WeVisUpdateReceiver */
/* loaded from: classes5.dex */
public final class C19567x35db38ca extends android.content.BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f270128a = 0;

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(intent, "intent");
        java.lang.String action = intent.getAction();
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b("com.tencent.mm.WeVisUpdate", action)) {
            java.lang.String stringExtra = intent.getStringExtra("type");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeVisUpdateReceiver", "onReceive: " + action + ", " + stringExtra);
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(stringExtra, "wevis_model")) {
                p05.p3.f432172a.c();
            } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(stringExtra, "effect_config")) {
                p05.v2.f432237d.Di();
            }
        }
    }
}

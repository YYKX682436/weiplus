package hp5;

/* loaded from: classes14.dex */
public final class k extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final hp5.k f364492d = new hp5.k();

    public k() {
        super(0);
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        return new android.content.BroadcastReceiver() { // from class: com.tencent.mm.voipmp.v2.sensor.VoIPMPSystemStatusController$screenStateReceiver$2$1
            @Override // android.content.BroadcastReceiver
            public void onReceive(android.content.Context context, android.content.Intent intent) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(intent, "intent");
                java.lang.String action = intent.getAction();
                if (action != null) {
                    int hashCode = action.hashCode();
                    if (hashCode != -2128145023) {
                        if (hashCode != -1454123155) {
                            if (hashCode == 823795052 && action.equals("android.intent.action.USER_PRESENT")) {
                                com.p314xaae8f345.mm.p1006xc5476f33.p2354xcfa97743.p2355x6fbd6873.c1.f258765b.a(com.p314xaae8f345.mm.p1006xc5476f33.p2354xcfa97743.p2355x6fbd6873.q.SCREEN_STATE_USER_PRESENT, hp5.j.f364491a);
                                return;
                            }
                        } else if (action.equals("android.intent.action.SCREEN_ON")) {
                            com.p314xaae8f345.mm.p1006xc5476f33.p2354xcfa97743.p2355x6fbd6873.v0.f258820b.x(true, hp5.f.f364487a);
                            com.p314xaae8f345.mm.p1006xc5476f33.p2354xcfa97743.p2355x6fbd6873.c1.f258765b.a(com.p314xaae8f345.mm.p1006xc5476f33.p2354xcfa97743.p2355x6fbd6873.q.SCREEN_STATE_SCREEN_ON, hp5.g.f364488a);
                            return;
                        }
                    } else if (action.equals("android.intent.action.SCREEN_OFF")) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p2354xcfa97743.p2355x6fbd6873.v0.f258820b.x(false, hp5.h.f364489a);
                        com.p314xaae8f345.mm.p1006xc5476f33.p2354xcfa97743.p2355x6fbd6873.c1.f258765b.a(com.p314xaae8f345.mm.p1006xc5476f33.p2354xcfa97743.p2355x6fbd6873.q.SCREEN_STATE_SCREEN_OFF, hp5.i.f364490a);
                        return;
                    }
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoIPMPSystemStatusController", "onReceive: " + intent.getAction());
            }
        };
    }
}

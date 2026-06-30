package com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.p2291x62f6fe4;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/ting/media/TingHeadsetChangeReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "fl4/b", "fl4/c", "plugin-ting_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.ting.media.TingHeadsetChangeReceiver */
/* loaded from: classes11.dex */
public final class C18716xd759b273 extends android.content.BroadcastReceiver {

    /* renamed from: c, reason: collision with root package name */
    public static final jz5.g f256221c;

    /* renamed from: a, reason: collision with root package name */
    public boolean f256222a;

    /* renamed from: b, reason: collision with root package name */
    public final jz5.g f256223b;

    static {
        new fl4.b(null);
        f256221c = jz5.h.b(fl4.a.f345463d);
    }

    public /* synthetic */ C18716xd759b273(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this();
    }

    public final void a(boolean z17) {
        java.util.Iterator it = ((com.p314xaae8f345.mm.sdk.p2603x2137b148.r2) ((jz5.n) this.f256223b).mo141623x754a37bb()).m77806xcee59d22().iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.p2291x62f6fe4.ServiceC18717xf3b2cd83 serviceC18717xf3b2cd83 = (com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.p2291x62f6fe4.ServiceC18717xf3b2cd83) ((fl4.c) it.next());
            if (z17) {
                serviceC18717xf3b2cd83.getClass();
            } else {
                b66.n h17 = serviceC18717xf3b2cd83.h();
                if (h17 != null && ((b66.q) h17).n() == bw5.pq0.Playing) {
                    b66.m.a(h17, null, 1, null);
                }
            }
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(intent, "intent");
        java.lang.String action = intent.getAction();
        if (android.text.TextUtils.equals(action, "android.media.AUDIO_BECOMING_NOISY")) {
            a(false);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TingApp.HeadsetChangeReceiver", "Headset off by ACTION_AUDIO_BECOMING_NOISY");
            this.f256222a = false;
            return;
        }
        if ((android.text.TextUtils.equals(action, "android.intent.action.HEADSET_PLUG") || android.text.TextUtils.equals(action, "android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED")) && intent.hasExtra("state")) {
            if (intent.getIntExtra("state", 2) == 0) {
                if (this.f256222a) {
                    a(false);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TingApp.HeadsetChangeReceiver", "Headset off");
                    this.f256222a = false;
                    return;
                }
                return;
            }
            if (intent.getIntExtra("state", 2) != 1 || this.f256222a) {
                return;
            }
            a(true);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TingApp.HeadsetChangeReceiver", "Headset on");
            this.f256222a = true;
        }
    }

    private C18716xd759b273() {
        this.f256223b = jz5.h.b(fl4.d.f345464d);
    }
}

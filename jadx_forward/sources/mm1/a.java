package mm1;

/* loaded from: classes13.dex */
public final class a implements com.p314xaae8f345.mm.p642xad8b531f.k {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.HashMap f410159a = new java.util.HashMap();

    public final void a(android.content.BroadcastReceiver broadcastReceiver, java.lang.String[] strArr, java.lang.String[] strArr2) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AudioBroadcastHelper", "registerBroadcast: ".concat(broadcastReceiver.getClass().getSimpleName()));
        android.content.IntentFilter intentFilter = new android.content.IntentFilter();
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.N0((java.lang.String[]) java.util.Arrays.copyOf(strArr, strArr.length))) {
            for (java.lang.String str : strArr) {
                intentFilter.addAction(str);
            }
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.N0((java.lang.String[]) java.util.Arrays.copyOf(strArr2, strArr2.length))) {
            for (java.lang.String str2 : strArr2) {
                intentFilter.addCategory(str2);
            }
        }
        if (fp.h.a(33)) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.registerReceiver(broadcastReceiver, intentFilter);
        } else {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.registerReceiver(broadcastReceiver, intentFilter, 2);
        }
    }

    public final void b(android.content.BroadcastReceiver broadcastReceiver) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AudioBroadcastHelper", "unRegisterBroadcast: ".concat(broadcastReceiver.getClass().getSimpleName()));
        com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.unregisterReceiver(broadcastReceiver);
    }

    @Override // com.p314xaae8f345.mm.p642xad8b531f.k
    /* renamed from: registerBroadcasts */
    public void mo43387xa1258ad5() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AudioBroadcastHelper", "registerBroadcasts()");
        com.p314xaae8f345.mm.p1006xc5476f33.p1239x58d9bd6.p1240x9f81e8c1.p1242x755ac2ae.C12825xdc66c29d c12825xdc66c29d = new com.p314xaae8f345.mm.p1006xc5476f33.p1239x58d9bd6.p1240x9f81e8c1.p1242x755ac2ae.C12825xdc66c29d();
        java.util.HashMap hashMap = this.f410159a;
        hashMap.put("BluetoothReceiver", c12825xdc66c29d);
        a(c12825xdc66c29d, new java.lang.String[]{"android.media.ACTION_SCO_AUDIO_STATE_UPDATED", "android.bluetooth.headset.profile.action.ACTIVE_DEVICE_CHANGED", "android.bluetooth.adapter.action.STATE_CHANGED", "android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED", "android.bluetooth.device.action.ACL_DISCONNECTED", "android.bluetooth.headset.profile.action.AUDIO_STATE_CHANGED", "android.bluetooth.headset.action.SHORTCUT_ACTION"}, new java.lang.String[0]);
        com.p314xaae8f345.mm.p1006xc5476f33.p1239x58d9bd6.p1240x9f81e8c1.p1243x2f67a282.C12826xf900791f c12826xf900791f = new com.p314xaae8f345.mm.p1006xc5476f33.p1239x58d9bd6.p1240x9f81e8c1.p1243x2f67a282.C12826xf900791f();
        hashMap.put("HeadsetPlugReceiver", c12826xf900791f);
        a(c12826xf900791f, new java.lang.String[]{"android.intent.action.HEADSET_PLUG"}, new java.lang.String[0]);
        com.p314xaae8f345.mm.p1006xc5476f33.p1239x58d9bd6.p1240x9f81e8c1.p1241x2e06d1.C12824x4a5e7874 c12824x4a5e7874 = new com.p314xaae8f345.mm.p1006xc5476f33.p1239x58d9bd6.p1240x9f81e8c1.p1241x2e06d1.C12824x4a5e7874();
        hashMap.put("BaseAudioReceiver", c12824x4a5e7874);
        a(c12824x4a5e7874, new java.lang.String[]{"android.media.AUDIO_BECOMING_NOISY"}, new java.lang.String[0]);
    }

    @Override // com.p314xaae8f345.mm.p642xad8b531f.k
    /* renamed from: unRegisterBroadcasts */
    public void mo43388x4b16414e() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AudioBroadcastHelper", "unRegisterBroadcasts()");
        java.util.HashMap hashMap = this.f410159a;
        try {
            java.lang.Object obj = hashMap.get("BluetoothReceiver");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type com.tencent.mm.plugin.audio.broadcast.bluetooth.BluetoothReceiver");
            b((com.p314xaae8f345.mm.p1006xc5476f33.p1239x58d9bd6.p1240x9f81e8c1.p1242x755ac2ae.C12825xdc66c29d) obj);
            java.lang.Object obj2 = hashMap.get("HeadsetPlugReceiver");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj2, "null cannot be cast to non-null type com.tencent.mm.plugin.audio.broadcast.headset.HeadsetPlugReceiver");
            b((com.p314xaae8f345.mm.p1006xc5476f33.p1239x58d9bd6.p1240x9f81e8c1.p1243x2f67a282.C12826xf900791f) obj2);
            java.lang.Object obj3 = hashMap.get("BaseAudioReceiver");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj3, "null cannot be cast to non-null type com.tencent.mm.plugin.audio.broadcast.base.BaseAudioReceiver");
            b((com.p314xaae8f345.mm.p1006xc5476f33.p1239x58d9bd6.p1240x9f81e8c1.p1241x2e06d1.C12824x4a5e7874) obj3);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AudioBroadcastHelper", "unRegisterBroadcasts() Exception = %s ", e17.getMessage());
        }
    }
}

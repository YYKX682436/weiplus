package com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb;

/* renamed from: com.tencent.thumbplayer.core.common.TPHeadsetPluginDetector */
/* loaded from: classes14.dex */
public class C26304xc368d61f {

    /* renamed from: AUDIO_TYPE_BLUETOOTH_A2DP */
    private static final int f51923xdff5250a = 2;

    /* renamed from: AUDIO_TYPE_BUILTIN_OTHERS */
    private static final int f51924x6840a8bb = 99;

    /* renamed from: AUDIO_TYPE_BUILTIN_SPEAKER */
    private static final int f51925x6c6dc587 = 0;

    /* renamed from: AUDIO_TYPE_HEADPHONES */
    private static final int f51926xe7d3f641 = 1;
    private static final java.lang.String TAG = "TPHeadsetPluginDetector";

    /* renamed from: hasRegisterReceiver */
    private static boolean f51927xd4988c6c;

    /* renamed from: isInitted */
    private static boolean f51928x5192c879;

    /* renamed from: mContextRef */
    private static java.lang.ref.WeakReference<android.content.Context> f51930xec8370b1;

    /* renamed from: mReceiver */
    private static android.content.BroadcastReceiver f51932xf4c9917c;

    /* renamed from: listeners */
    private static java.util.List<com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26304xc368d61f.HeadsetPluginListener> f51929xb75bd23f = new java.util.LinkedList();

    /* renamed from: mCurOutputs */
    private static java.util.Set<java.lang.Integer> f51931x7b700d7f = null;

    /* renamed from: com.tencent.thumbplayer.core.common.TPHeadsetPluginDetector$HeadsetPluginListener */
    /* loaded from: classes14.dex */
    public interface HeadsetPluginListener {
        /* renamed from: onHeadsetPlugin */
        void mo101767x164b78b6(java.util.Set<java.lang.Integer> set, java.util.Set<java.lang.Integer> set2);
    }

    /* renamed from: com.tencent.thumbplayer.core.common.TPHeadsetPluginDetector$HeadsetPluginReceiver */
    /* loaded from: classes14.dex */
    public static class HeadsetPluginReceiver extends android.content.BroadcastReceiver {
        private HeadsetPluginReceiver() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(android.content.Context context, android.content.Intent intent) {
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101886xba7add57(2, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26304xc368d61f.TAG, "onReceive: " + intent.getAction());
            java.util.Set m101770xbbd77eb1 = com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26304xc368d61f.m101770xbbd77eb1();
            if ("android.intent.action.HEADSET_PLUG".equals(intent.getAction())) {
                int intExtra = intent.hasExtra("state") ? intent.getIntExtra("state", 0) : 0;
                if (m101770xbbd77eb1 != null) {
                    if (intExtra == 0) {
                        m101770xbbd77eb1.remove(1);
                    } else if (intExtra == 1) {
                        m101770xbbd77eb1.add(1);
                    }
                }
                com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26304xc368d61f.m101782x68e8a953(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26304xc368d61f.f51931x7b700d7f, m101770xbbd77eb1);
                return;
            }
            if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
                if (m101770xbbd77eb1 != null) {
                    m101770xbbd77eb1.remove(1);
                }
                com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26304xc368d61f.m101782x68e8a953(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26304xc368d61f.f51931x7b700d7f, m101770xbbd77eb1);
            } else if ("android.bluetooth.a2dp.profile.action.CONNECTION_STATE_CHANGED".equals(intent.getAction())) {
                int intExtra2 = intent.getIntExtra("android.bluetooth.profile.extra.STATE", 0);
                if (m101770xbbd77eb1 != null) {
                    if (intExtra2 == 2) {
                        m101770xbbd77eb1.add(2);
                    } else if (intExtra2 == 0) {
                        m101770xbbd77eb1.remove(2);
                    }
                }
                com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26304xc368d61f.m101782x68e8a953(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26304xc368d61f.f51931x7b700d7f, m101770xbbd77eb1);
            }
        }
    }

    /* renamed from: access$100 */
    public static /* synthetic */ java.util.Set m101770xbbd77eb1() {
        return m101775xc076b952();
    }

    /* renamed from: addHeadsetPluginListener */
    public static void m101772x774dce08(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26304xc368d61f.HeadsetPluginListener headsetPluginListener) {
        synchronized (com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26304xc368d61f.class) {
            if (f51929xb75bd23f.add(headsetPluginListener) && !f51927xd4988c6c) {
                m101784xc20729b2();
                f51927xd4988c6c = true;
            }
        }
    }

    /* renamed from: deinit */
    public static void m101773xb0654911() {
        java.lang.ref.WeakReference<android.content.Context> weakReference;
        synchronized (com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26304xc368d61f.class) {
            if (f51928x5192c879 && (weakReference = f51930xec8370b1) != null) {
                weakReference.clear();
                f51928x5192c879 = false;
                com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101886xba7add57(2, TAG, "HeadsetPluginDetector deinit succeed!");
            }
        }
    }

    /* renamed from: getAudioManager */
    private static android.media.AudioManager m101774x342dc16d() {
        java.lang.ref.WeakReference<android.content.Context> weakReference;
        if (!f51928x5192c879 || (weakReference = f51930xec8370b1) == null) {
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101886xba7add57(4, TAG, "getAudioManager failed, HeadsetPluginDetector is not init yet!");
            return null;
        }
        android.content.Context context = weakReference.get();
        if (context == null) {
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101886xba7add57(4, TAG, "getAudioManager failed, context is null, maybe is invalid!");
            return null;
        }
        android.media.AudioManager audioManager = (android.media.AudioManager) context.getApplicationContext().getSystemService("audio");
        if (audioManager != null) {
            return audioManager;
        }
        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101886xba7add57(4, TAG, "getAudioManager failed, audioMgr is null!");
        return null;
    }

    /* renamed from: getAudioOutputs */
    private static java.util.Set<java.lang.Integer> m101775xc076b952() {
        android.media.AudioDeviceInfo[] devices;
        java.util.HashSet hashSet = new java.util.HashSet();
        android.media.AudioManager m101774x342dc16d = m101774x342dc16d();
        if (m101774x342dc16d != null && (devices = m101774x342dc16d.getDevices(2)) != null) {
            for (android.media.AudioDeviceInfo audioDeviceInfo : devices) {
                if (audioDeviceInfo.getType() == 2) {
                    hashSet.add(0);
                } else if (audioDeviceInfo.getType() == 8) {
                    hashSet.add(2);
                } else if (audioDeviceInfo.getType() == 3) {
                    hashSet.add(1);
                }
            }
        }
        return hashSet;
    }

    /* renamed from: getCurrentRoutes */
    public static java.util.Set<java.lang.Integer> m101776x411c3e6d() {
        return f51931x7b700d7f;
    }

    /* renamed from: init */
    public static void m101777x316510(android.content.Context context) {
        synchronized (com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26304xc368d61f.class) {
            if (f51928x5192c879) {
                return;
            }
            f51930xec8370b1 = new java.lang.ref.WeakReference<>(context.getApplicationContext());
            f51928x5192c879 = true;
            m101778xa8a88d09();
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101886xba7add57(2, TAG, "HeadsetPluginDetector init succeed!");
        }
    }

    /* renamed from: initCurrentOutputs */
    private static void m101778xa8a88d09() {
        f51931x7b700d7f = m101775xc076b952();
    }

    /* renamed from: isAudioRouteTypeOn */
    public static boolean m101779x7f4eddf6(int i17) {
        java.util.Set<java.lang.Integer> set = f51931x7b700d7f;
        if (set == null) {
            return false;
        }
        return set.contains(java.lang.Integer.valueOf(i17));
    }

    /* renamed from: isBluetoothPlugin */
    public static boolean m101780xb4af54f7() {
        android.media.AudioManager m101774x342dc16d = m101774x342dc16d();
        if (m101774x342dc16d == null) {
            return false;
        }
        return m101774x342dc16d.isBluetoothA2dpOn();
    }

    /* renamed from: isHeadsetPlugin */
    public static boolean m101781x647beb4b() {
        android.media.AudioManager m101774x342dc16d = m101774x342dc16d();
        if (m101774x342dc16d == null) {
            return false;
        }
        return m101774x342dc16d.isWiredHeadsetOn();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: notifyAudioOutputStateChange */
    public static void m101782x68e8a953(java.util.Set<java.lang.Integer> set, java.util.Set<java.lang.Integer> set2) {
        if (set == null || set2 == null || set.size() != set2.size() || !set2.containsAll(set)) {
            f51931x7b700d7f = set2;
            synchronized (com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26304xc368d61f.class) {
                java.util.Iterator<com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26304xc368d61f.HeadsetPluginListener> it = f51929xb75bd23f.iterator();
                while (it.hasNext()) {
                    it.next().mo101767x164b78b6(set, set2);
                }
            }
        }
    }

    /* renamed from: registerDeviceCallback */
    private static boolean m101783xf0f00e3e() {
        android.media.AudioManager m101774x342dc16d = m101774x342dc16d();
        if (m101774x342dc16d == null) {
            return false;
        }
        m101774x342dc16d.registerAudioDeviceCallback(new android.media.AudioDeviceCallback() { // from class: com.tencent.thumbplayer.core.common.TPHeadsetPluginDetector.1
            @Override // android.media.AudioDeviceCallback
            public void onAudioDevicesAdded(android.media.AudioDeviceInfo[] audioDeviceInfoArr) {
                com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101886xba7add57(2, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26304xc368d61f.TAG, "onAudioDevicesAdded!");
                com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26304xc368d61f.m101782x68e8a953(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26304xc368d61f.f51931x7b700d7f, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26304xc368d61f.m101770xbbd77eb1());
            }

            @Override // android.media.AudioDeviceCallback
            public void onAudioDevicesRemoved(android.media.AudioDeviceInfo[] audioDeviceInfoArr) {
                com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101886xba7add57(2, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26304xc368d61f.TAG, "onAudioDevicesRemoved!");
                com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26304xc368d61f.m101782x68e8a953(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26304xc368d61f.f51931x7b700d7f, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26304xc368d61f.m101770xbbd77eb1());
            }
        }, null);
        return true;
    }

    /* renamed from: registerReceiver */
    private static void m101784xc20729b2() {
        java.lang.ref.WeakReference<android.content.Context> weakReference;
        if (m101783xf0f00e3e()) {
            return;
        }
        if (f51932xf4c9917c == null) {
            f51932xf4c9917c = new com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26304xc368d61f.HeadsetPluginReceiver();
        }
        if (!f51928x5192c879 || (weakReference = f51930xec8370b1) == null) {
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101886xba7add57(4, TAG, "registerReceiver failed, TPHeadsetPluginDetector is not init yet!");
            return;
        }
        android.content.Context context = weakReference.get();
        if (context == null) {
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101886xba7add57(4, TAG, "registerReceiver failed, context is null, maybe is invalid!");
            return;
        }
        android.content.IntentFilter intentFilter = new android.content.IntentFilter();
        intentFilter.addAction("android.intent.action.HEADSET_PLUG");
        intentFilter.addAction("android.media.AUDIO_BECOMING_NOISY");
        intentFilter.addAction("android.bluetooth.a2dp.profile.action.CONNECTION_STATE_CHANGED");
        context.registerReceiver(f51932xf4c9917c, intentFilter);
    }

    /* renamed from: removeHeadsetPluginListener */
    public static void m101785x86ce2a05(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26304xc368d61f.HeadsetPluginListener headsetPluginListener) {
        synchronized (com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26304xc368d61f.class) {
            f51929xb75bd23f.remove(headsetPluginListener);
            if (f51929xb75bd23f.isEmpty() && f51927xd4988c6c) {
                m101786x41b0e64b();
                f51927xd4988c6c = false;
            }
        }
    }

    /* renamed from: unregisterReceiver */
    private static void m101786x41b0e64b() {
        java.lang.ref.WeakReference<android.content.Context> weakReference;
        if (!f51928x5192c879 || (weakReference = f51930xec8370b1) == null) {
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101886xba7add57(4, TAG, "registerReceiver failed, HeadsetPluginDetector is not init yet!");
            return;
        }
        android.content.Context context = weakReference.get();
        if (context == null) {
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101886xba7add57(4, TAG, "registerReceiver failed, context is null, maybe is invalid!");
        } else {
            context.unregisterReceiver(f51932xf4c9917c);
        }
    }
}

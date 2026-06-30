package com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb;

/* renamed from: com.tencent.thumbplayer.core.common.TPAudioPassThroughPluginDetector */
/* loaded from: classes13.dex */
public class C26286x2d472913 {

    /* renamed from: DEFAULT_MAX_CHANNEL_COUNT */
    private static final int f51610x7309283a = 8;
    private static final java.lang.String TAG = "TPAudioPassThroughPluginDetector";

    /* renamed from: hasRegisterReceiver */
    private static boolean f51611xd4988c6c;

    /* renamed from: isInitted */
    private static boolean f51612x5192c879;

    /* renamed from: mContextRef */
    private static java.lang.ref.WeakReference<android.content.Context> f51615xec8370b1;

    /* renamed from: mHandler */
    private static android.os.Handler f51616xc7640a1d;

    /* renamed from: mReceiver */
    private static android.content.BroadcastReceiver f51618xf4c9917c;

    /* renamed from: listeners */
    private static java.util.List<com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26286x2d472913.AudioPassThroughPluginListener> f51613xb75bd23f = new java.util.LinkedList();

    /* renamed from: mIsAudioPassThroughPlugin */
    private static boolean f51617x2dfbc3e8 = false;

    /* renamed from: mAudioPassThroughCapabilities */
    private static com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26284x25a42730 f51614x9b08b9a1 = null;

    /* renamed from: com.tencent.thumbplayer.core.common.TPAudioPassThroughPluginDetector$AudioPassThroughPluginListener */
    /* loaded from: classes13.dex */
    public interface AudioPassThroughPluginListener {
        /* renamed from: onAudioPassThroughPlugin */
        void mo101679xdaae3150(boolean z17);
    }

    /* renamed from: com.tencent.thumbplayer.core.common.TPAudioPassThroughPluginDetector$HdmiAudioPlugBroadcastReceiver */
    /* loaded from: classes13.dex */
    public static class HdmiAudioPlugBroadcastReceiver extends android.content.BroadcastReceiver {
        private HdmiAudioPlugBroadcastReceiver() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(android.content.Context context, android.content.Intent intent) {
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101886xba7add57(2, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26286x2d472913.TAG, "HdmiAudioPlugBroadcastReceiver onReceive: " + intent.getAction());
            boolean z17 = false;
            int intExtra = intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", 0);
            if (intExtra != 0 && intExtra == 1) {
                z17 = true;
            }
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101886xba7add57(2, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26286x2d472913.TAG, "HdmiAudioPlugBroadcastReceiver audioPassThroughState:" + intExtra + " bPlugin:" + z17);
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26286x2d472913.m101690xf1d42004(new com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26284x25a42730(intent.getIntArrayExtra("android.media.extra.ENCODINGS"), intent.getIntExtra("android.media.extra.MAX_CHANNEL_COUNT", 8)));
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26286x2d472913.m101689x88223ffa(z17);
        }
    }

    /* renamed from: addListener */
    public static void m101683x162a7075(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26286x2d472913.AudioPassThroughPluginListener audioPassThroughPluginListener) {
        synchronized (com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26286x2d472913.class) {
            if (f51613xb75bd23f.add(audioPassThroughPluginListener) && !f51611xd4988c6c) {
                m101691xc20729b2();
                f51611xd4988c6c = true;
            }
        }
    }

    /* renamed from: deinit */
    public static void m101684xb0654911() {
        java.lang.ref.WeakReference<android.content.Context> weakReference;
        synchronized (com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26286x2d472913.class) {
            if (f51612x5192c879 && (weakReference = f51615xec8370b1) != null) {
                weakReference.clear();
                f51612x5192c879 = false;
                com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101886xba7add57(2, TAG, "TPAudioPassThroughPluginDetector deinit succeed!");
            }
        }
    }

    /* renamed from: getLooper */
    private static android.os.Looper m101685x23b2dd47() {
        android.os.Looper myLooper = android.os.Looper.myLooper();
        return myLooper != null ? myLooper : android.os.Looper.getMainLooper();
    }

    /* renamed from: init */
    public static void m101686x316510(android.content.Context context) {
        synchronized (com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26286x2d472913.class) {
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101886xba7add57(2, TAG, "TPAudioPassThroughPluginDetector init enter!");
            if (f51612x5192c879) {
                return;
            }
            f51615xec8370b1 = new java.lang.ref.WeakReference<>(context.getApplicationContext());
            f51612x5192c879 = true;
            f51616xc7640a1d = new android.os.Handler(m101685x23b2dd47());
            m101691xc20729b2();
            f51611xd4988c6c = true;
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101886xba7add57(2, TAG, "TPAudioPassThroughPluginDetector init succeed!");
        }
    }

    /* renamed from: isAudioPassThroughPlugin */
    public static boolean m101687x659cd65b() {
        boolean z17;
        synchronized (com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26286x2d472913.class) {
            z17 = f51617x2dfbc3e8;
        }
        return z17;
    }

    /* renamed from: isAudioPassThroughSupport */
    public static boolean m101688xfbc9fda7(int i17, int i18) {
        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26284x25a42730 c26284x25a42730 = f51614x9b08b9a1;
        if (c26284x25a42730 != null) {
            return c26284x25a42730.m101673xe9e647f7(i17) && i18 <= f51614x9b08b9a1.m101671x8cab631a();
        }
        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101886xba7add57(4, TAG, "isAudioPassThroughSupport failed, mAudioPassThroughCapabilities is not init yet!");
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: notifyAudioPassThroughStateChange */
    public static void m101689x88223ffa(boolean z17) {
        if (f51617x2dfbc3e8 != z17) {
            f51617x2dfbc3e8 = z17;
            synchronized (com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26286x2d472913.class) {
                java.util.Iterator<com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26286x2d472913.AudioPassThroughPluginListener> it = f51613xb75bd23f.iterator();
                while (it.hasNext()) {
                    it.next().mo101679xdaae3150(z17);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onUpdateAudioCapabilities */
    public static void m101690xf1d42004(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26284x25a42730 c26284x25a42730) {
        if (c26284x25a42730.m101670xb2c87fbf(f51614x9b08b9a1)) {
            return;
        }
        f51614x9b08b9a1 = c26284x25a42730;
        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101886xba7add57(2, TAG, "onUpdateAudioCapabilities AudioCapabilities:" + f51614x9b08b9a1.m101674x9616526c());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: registerReceiver */
    private static void m101691xc20729b2() {
        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101886xba7add57(2, TAG, "registerReceiver enter");
        if (!f51612x5192c879 || f51615xec8370b1 == null) {
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101886xba7add57(4, TAG, "registerReceiver failed, TPAudioPassThroughPluginDetector is not init yet!");
            return;
        }
        android.content.Intent intent = null;
        java.lang.Object[] objArr = 0;
        if (f51618xf4c9917c == null) {
            f51618xf4c9917c = new com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26286x2d472913.HdmiAudioPlugBroadcastReceiver();
        }
        android.content.Context context = f51615xec8370b1.get();
        if (context == null) {
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101886xba7add57(4, TAG, "registerReceiver failed, context is null, maybe is invalid!");
            return;
        }
        if (f51618xf4c9917c != null) {
            android.content.IntentFilter intentFilter = new android.content.IntentFilter();
            intentFilter.addAction("android.media.action.HDMI_AUDIO_PLUG");
            intent = context.registerReceiver(f51618xf4c9917c, intentFilter, null, f51616xc7640a1d);
        }
        f51614x9b08b9a1 = com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26284x25a42730.m101669x847a22c(context, intent);
        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101886xba7add57(2, TAG, "registerReceiver leave");
    }

    /* renamed from: removeListener */
    public static void m101692xf1335d58(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26286x2d472913.AudioPassThroughPluginListener audioPassThroughPluginListener) {
        synchronized (com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26286x2d472913.class) {
            f51613xb75bd23f.remove(audioPassThroughPluginListener);
            if (f51613xb75bd23f.isEmpty() && f51611xd4988c6c) {
                m101693x41b0e64b();
                f51611xd4988c6c = false;
            }
        }
    }

    /* renamed from: unregisterReceiver */
    private static void m101693x41b0e64b() {
        java.lang.ref.WeakReference<android.content.Context> weakReference;
        if (!f51612x5192c879 || (weakReference = f51615xec8370b1) == null) {
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101886xba7add57(4, TAG, "registerReceiver failed, TPAudioPassThroughPluginDetector is not init yet!");
            return;
        }
        android.content.Context context = weakReference.get();
        if (context == null) {
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101886xba7add57(4, TAG, "registerReceiver failed, context is null, maybe is invalid!");
        } else {
            context.unregisterReceiver(f51618xf4c9917c);
        }
    }
}

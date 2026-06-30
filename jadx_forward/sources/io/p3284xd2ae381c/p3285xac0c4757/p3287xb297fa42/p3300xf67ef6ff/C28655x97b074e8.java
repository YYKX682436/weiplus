package io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff;

/* renamed from: io.flutter.embedding.engine.systemchannels.KeyEventChannel */
/* loaded from: classes15.dex */
public class C28655x97b074e8 {
    private static final java.lang.String TAG = "KeyEventChannel";

    /* renamed from: channel */
    public final io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa<java.lang.Object> f71295x2c0b7d03;

    /* renamed from: io.flutter.embedding.engine.systemchannels.KeyEventChannel$EventResponseHandler */
    /* loaded from: classes15.dex */
    public interface EventResponseHandler {
        /* renamed from: onFrameworkResponse */
        void mo137300x49d85840(boolean z17);
    }

    /* renamed from: io.flutter.embedding.engine.systemchannels.KeyEventChannel$FlutterKeyEvent */
    /* loaded from: classes15.dex */
    public static class FlutterKeyEvent {

        /* renamed from: complexCharacter */
        public final java.lang.Character f71296xa94bc59;

        /* renamed from: event */
        public final android.view.KeyEvent f71297x5c6729a;

        public FlutterKeyEvent(android.view.KeyEvent keyEvent) {
            this(keyEvent, null);
        }

        public FlutterKeyEvent(android.view.KeyEvent keyEvent, java.lang.Character ch6) {
            this.f71297x5c6729a = keyEvent;
            this.f71296xa94bc59 = ch6;
        }
    }

    public C28655x97b074e8(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 interfaceC28679x1b8c77f2) {
        this.f71295x2c0b7d03 = new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa<>(interfaceC28679x1b8c77f2, "flutter/keyevent", io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28683x71412957.f71607x4fbc8495);
    }

    /* renamed from: createReplyHandler */
    private static io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.Reply<java.lang.Object> m138164xb503fc1c(final io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28655x97b074e8.EventResponseHandler eventResponseHandler) {
        return new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.Reply() { // from class: io.flutter.embedding.engine.systemchannels.KeyEventChannel$$a
            @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.Reply
            /* renamed from: reply */
            public final void mo84787x67612ea(java.lang.Object obj) {
                io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28655x97b074e8.m138166xe0388e65(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28655x97b074e8.EventResponseHandler.this, obj);
            }
        };
    }

    /* renamed from: encodeKeyEvent */
    private java.util.Map<java.lang.String, java.lang.Object> m138165x2da533b1(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28655x97b074e8.FlutterKeyEvent flutterKeyEvent, boolean z17) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("type", z17 ? "keyup" : "keydown");
        hashMap.put("keymap", com.p159x477cd522.p160x333422.C1461x7397cc93.f4735xf773c24f);
        hashMap.put("flags", java.lang.Integer.valueOf(flutterKeyEvent.f71297x5c6729a.getFlags()));
        hashMap.put("plainCodePoint", java.lang.Integer.valueOf(flutterKeyEvent.f71297x5c6729a.getUnicodeChar(0)));
        hashMap.put("codePoint", java.lang.Integer.valueOf(flutterKeyEvent.f71297x5c6729a.getUnicodeChar()));
        hashMap.put("keyCode", java.lang.Integer.valueOf(flutterKeyEvent.f71297x5c6729a.getKeyCode()));
        hashMap.put(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1108x71e6f5fe.p.f34754x24728b, java.lang.Integer.valueOf(flutterKeyEvent.f71297x5c6729a.getScanCode()));
        hashMap.put("metaState", java.lang.Integer.valueOf(flutterKeyEvent.f71297x5c6729a.getMetaState()));
        java.lang.Character ch6 = flutterKeyEvent.f71296xa94bc59;
        if (ch6 != null) {
            hashMap.put(ya.b.f77466x353cb09, ch6.toString());
        }
        hashMap.put(ya.b.f77502x92235c1b, java.lang.Integer.valueOf(flutterKeyEvent.f71297x5c6729a.getSource()));
        hashMap.put("deviceId", java.lang.Integer.valueOf(flutterKeyEvent.f71297x5c6729a.getDeviceId()));
        hashMap.put("repeatCount", java.lang.Integer.valueOf(flutterKeyEvent.f71297x5c6729a.getRepeatCount()));
        return hashMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$createReplyHandler$0 */
    public static /* synthetic */ void m138166xe0388e65(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28655x97b074e8.EventResponseHandler eventResponseHandler, java.lang.Object obj) {
        boolean z17 = false;
        if (obj != null) {
            try {
                z17 = ((org.json.JSONObject) obj).getBoolean("handled");
            } catch (org.json.JSONException e17) {
                io.p3284xd2ae381c.Log.e(TAG, "Unable to unpack JSON message: " + e17);
            }
        }
        eventResponseHandler.mo137300x49d85840(z17);
    }

    /* renamed from: sendFlutterKeyEvent */
    public void m138167x1060af0f(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28655x97b074e8.FlutterKeyEvent flutterKeyEvent, boolean z17, io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28655x97b074e8.EventResponseHandler eventResponseHandler) {
        this.f71295x2c0b7d03.m138403x35cf88(m138165x2da533b1(flutterKeyEvent, z17), m138164xb503fc1c(eventResponseHandler));
    }
}

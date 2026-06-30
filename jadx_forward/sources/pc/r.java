package pc;

/* loaded from: classes14.dex */
public final class r implements pc.p {

    /* renamed from: a, reason: collision with root package name */
    public android.media.SoundPool f434756a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.HashMap f434757b;

    /* renamed from: c, reason: collision with root package name */
    public volatile int f434758c;

    public r(android.content.Context context) {
        this.f434758c = -1;
        int i17 = ic.d.f371814k;
        com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p333xb29de3e3.C2920x9dce3f52 c2920x9dce3f52 = ic.c.f371813a.f371823i;
        if (!(c2920x9dce3f52 == null ? false : c2920x9dce3f52.m21853xa0c225a2())) {
            mc.p.f407064a.e("SoundPoolHelper", "audio is not open on need create SoundPoolHelper");
            return;
        }
        if (context == null) {
            mc.p.f407064a.e("SoundPoolHelper", "context is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        android.media.SoundPool soundPool = new android.media.SoundPool(1, 3, 0);
        this.f434756a = soundPool;
        soundPool.setOnLoadCompleteListener(new pc.C29971x345e2f());
        this.f434757b = new java.util.HashMap(21);
        a(com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p334x5c30b92.EnumC2925x4120adb0.ACT_BLINK, "act_blink");
        a(com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p334x5c30b92.EnumC2925x4120adb0.ACT_OPEN_MOUTH, "act_open_mouth");
        a(com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p334x5c30b92.EnumC2925x4120adb0.ACT_NOD_HEAD, "act_nod_head");
        a(com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p334x5c30b92.EnumC2925x4120adb0.ACT_SHAKE_HEAD, "act_shake_head");
        a(com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p334x5c30b92.EnumC2925x4120adb0.NO_FACE, "no_face");
        a(com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p334x5c30b92.EnumC2925x4120adb0.NO_LEFT_FACE, "no_left_face");
        a(com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p334x5c30b92.EnumC2925x4120adb0.NO_RIGHT_FACE, "no_right_face");
        a(com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p334x5c30b92.EnumC2925x4120adb0.NO_CHIN, "no_chin");
        a(com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p334x5c30b92.EnumC2925x4120adb0.NO_MOUTH, "no_mouth");
        a(com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p334x5c30b92.EnumC2925x4120adb0.NO_NOSE, "no_nose");
        a(com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p334x5c30b92.EnumC2925x4120adb0.NO_LEFT_EYE, "no_left_eye");
        a(com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p334x5c30b92.EnumC2925x4120adb0.NO_RIGHT_EYE, "no_right_eye");
        a(com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p334x5c30b92.EnumC2925x4120adb0.POSE_KEEP, "pose_keep");
        a(com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p334x5c30b92.EnumC2925x4120adb0.POSE_CLOSER, "pose_closer");
        a(com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p334x5c30b92.EnumC2925x4120adb0.POSE_FARTHER, "pose_farther");
        a(com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p334x5c30b92.EnumC2925x4120adb0.POSE_INCORRECT, com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27886x1906edbe.f61583x274251f0);
        a(com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p334x5c30b92.EnumC2925x4120adb0.POSE_OPEN_EYE, "plase_open_eye");
        a(com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p334x5c30b92.EnumC2925x4120adb0.TOO_MANY_FACE, com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27886x1906edbe.f61588x8645643a);
        a(com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p334x5c30b92.EnumC2925x4120adb0.INCOMPLETE_FACE, com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27886x1906edbe.f61572x9f190f25);
        a(com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p334x5c30b92.EnumC2925x4120adb0.ACT_SCREEN_SHAKING, "act_screen_shaking");
        mc.p.f407064a.b("SoundPoolHelper", "SoundPoolHelper init cost time: " + (java.lang.System.currentTimeMillis() - currentTimeMillis));
        this.f434758c = -1;
    }

    public final void a(com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p334x5c30b92.EnumC2925x4120adb0 enumC2925x4120adb0, java.lang.String str) {
        java.util.HashMap hashMap;
        if (this.f434756a == null || (hashMap = this.f434757b) == null) {
            return;
        }
        try {
            int i17 = ic.d.f371814k;
            android.content.Context a17 = ic.c.f371813a.a();
            if (a17 == null) {
                mc.p.f407064a.e("SoundPoolHelper", "context is null");
                return;
            }
            android.content.res.AssetFileDescriptor openFd = a17.getAssets().openFd("audio/huiyan_" + str + ".ogg");
            hashMap.put(enumC2925x4120adb0, java.lang.Integer.valueOf(this.f434756a.load(openFd, 1)));
            openFd.close();
        } catch (java.lang.Exception e17) {
            mc.p.f407064a.e("SoundPoolHelper", "loadSound error: " + e17.getLocalizedMessage());
        }
    }
}

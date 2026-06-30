package vq4;

/* loaded from: classes14.dex */
public abstract class n0 {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.Map f520899a;

    static {
        java.util.HashMap hashMap = new java.util.HashMap();
        f520899a = hashMap;
        hashMap.put(0, "CALLING_STATE_VIDEO_INVITING");
        hashMap.put(1, "CALLING_STATE_VOICE_INVITING");
        hashMap.put(2, "CALLING_STATE_VIDEO_WAITTING_ACCEPT");
        hashMap.put(3, "CALLING_STATE_VOICE_WAITTING_ACCEPT");
        hashMap.put(4, "CALLING_STATE_VIDEO_CONNECTING");
        hashMap.put(5, "CALLING_STATE_VOICE_CONNECTING");
        hashMap.put(6, "CALLING_STATE_VIDEO_TALKING");
        hashMap.put(7, "CALLING_STATE_VOICE_TALKING");
        hashMap.put(8, "CALLING_STATE_FINISH");
        hashMap.put(256, "CALLED_STATE_VIDEO_INVITING");
        hashMap.put(257, "CALLED_STATE_VOICE_INVITING");
        hashMap.put(258, "CALLED_STATE_VIDEO_CONNECTING");
        hashMap.put(java.lang.Integer.valueOf(com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.EnumC4451x33e61cdb.f18263x2b3a4fa4), "CALLED_STATE_VOICE_CONNECTING");
        hashMap.put(260, "CALLED_STATE_VIDEO_TALKING");
        hashMap.put(261, "CALLED_STATE_VOICE_TALKING");
        hashMap.put(262, "CALLED_STATE_FINISH");
        hashMap.put(4096, "ACTION_NOP");
        hashMap.put(4097, "ACTION_INVITE_RESPOND");
        hashMap.put(4098, "ACTION_CANCEL_INVITE");
        hashMap.put(4099, "ACTION_REJECT_INVITE");
        hashMap.put(4100, "ACTION_ACCEPT_INVITE");
        hashMap.put(4101, "ACTION_CLOSE_CAMERA");
        hashMap.put(4102, "ACTION_CONNECT_SUCC");
        hashMap.put(4103, "ACTION_SELF_HANGUP");
        hashMap.put(4104, "ACTION_ANOTHER_HANGUP");
        hashMap.put(4105, "ACTION_INVITE_TIMEOUT");
        hashMap.put(4106, "ACTION_SO_SHUTDOWN");
        hashMap.put(4107, "ACTION_PHONE_COMING");
        hashMap.put(4108, "ACTION_IGNORE_INVITE");
        hashMap.put(4109, "ACTION_ON_ERROR");
        hashMap.put(4110, "ACTION_SESSION_CALLED");
    }

    public static vq4.o0 a(int i17) {
        vq4.o0 o0Var = new vq4.o0(i17);
        o0Var.a(256, 4098, 262);
        o0Var.a(256, 4099, 262);
        o0Var.a(256, 4105, 262);
        o0Var.a(256, 4106, 262);
        o0Var.a(256, 4107, 262);
        o0Var.a(256, 4108, 262);
        o0Var.a(256, 4109, 262);
        o0Var.a(256, 4100, 258);
        o0Var.a(256, 4101, 257);
        o0Var.a(257, 4100, com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.EnumC4451x33e61cdb.f18263x2b3a4fa4);
        o0Var.a(257, 4098, 262);
        o0Var.a(257, 4099, 262);
        o0Var.a(257, 4105, 262);
        o0Var.a(257, 4106, 262);
        o0Var.a(257, 4107, 262);
        o0Var.a(257, 4108, 262);
        o0Var.a(257, 4109, 262);
        o0Var.a(258, 4098, 262);
        o0Var.a(258, 4099, 262);
        o0Var.a(258, 4106, 262);
        o0Var.a(258, 4107, 262);
        o0Var.a(258, 4103, 262);
        o0Var.a(258, 4109, 262);
        o0Var.a(258, 4102, 260);
        o0Var.a(com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.EnumC4451x33e61cdb.f18263x2b3a4fa4, 4102, 261);
        o0Var.a(com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.EnumC4451x33e61cdb.f18263x2b3a4fa4, 4098, 262);
        o0Var.a(com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.EnumC4451x33e61cdb.f18263x2b3a4fa4, 4099, 262);
        o0Var.a(com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.EnumC4451x33e61cdb.f18263x2b3a4fa4, 4106, 262);
        o0Var.a(com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.EnumC4451x33e61cdb.f18263x2b3a4fa4, 4107, 262);
        o0Var.a(com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.EnumC4451x33e61cdb.f18263x2b3a4fa4, 4103, 262);
        o0Var.a(com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.EnumC4451x33e61cdb.f18263x2b3a4fa4, 4109, 262);
        o0Var.a(260, 4101, 261);
        o0Var.a(260, 4103, 262);
        o0Var.a(260, 4104, 262);
        o0Var.a(260, 4106, 262);
        o0Var.a(260, 4107, 262);
        o0Var.a(260, 4109, 262);
        o0Var.a(261, 4103, 262);
        o0Var.a(261, 4104, 262);
        o0Var.a(261, 4106, 262);
        o0Var.a(261, 4107, 262);
        o0Var.a(261, 4109, 262);
        return o0Var;
    }

    public static vq4.o0 b(int i17) {
        vq4.o0 o0Var = new vq4.o0(i17);
        o0Var.a(0, 4098, 8);
        o0Var.a(0, 4106, 8);
        o0Var.a(0, 4107, 8);
        o0Var.a(0, 4109, 8);
        o0Var.a(0, 4097, 2);
        o0Var.a(0, 4101, 1);
        o0Var.a(1, 4097, 3);
        o0Var.a(1, 4098, 8);
        o0Var.a(1, 4106, 8);
        o0Var.a(1, 4107, 8);
        o0Var.a(1, 4109, 8);
        o0Var.a(2, 4098, 8);
        o0Var.a(2, 4099, 8);
        o0Var.a(2, 4105, 8);
        o0Var.a(2, 4106, 8);
        o0Var.a(2, 4107, 8);
        o0Var.a(2, 4109, 8);
        o0Var.a(2, 4100, 4);
        o0Var.a(2, 4101, 3);
        o0Var.a(3, 4100, 5);
        o0Var.a(3, 4098, 8);
        o0Var.a(3, 4099, 8);
        o0Var.a(3, 4105, 8);
        o0Var.a(3, 4106, 8);
        o0Var.a(3, 4107, 8);
        o0Var.a(3, 4109, 8);
        o0Var.a(4, 4102, 6);
        o0Var.a(4, 4101, 5);
        o0Var.a(5, 4102, 7);
        o0Var.a(6, 4103, 8);
        o0Var.a(6, 4104, 8);
        o0Var.a(6, 4106, 8);
        o0Var.a(6, 4107, 8);
        o0Var.a(6, 4109, 8);
        o0Var.a(6, 4101, 7);
        o0Var.a(7, 4103, 8);
        o0Var.a(7, 4104, 8);
        o0Var.a(7, 4106, 8);
        o0Var.a(7, 4107, 8);
        o0Var.a(7, 4109, 8);
        o0Var.a(4, 4098, 8);
        o0Var.a(4, 4099, 8);
        o0Var.a(4, 4106, 8);
        o0Var.a(4, 4107, 8);
        o0Var.a(4, 4103, 8);
        o0Var.a(4, 4109, 8);
        o0Var.a(5, 4098, 8);
        o0Var.a(5, 4099, 8);
        o0Var.a(5, 4106, 8);
        o0Var.a(5, 4107, 8);
        o0Var.a(5, 4103, 8);
        o0Var.a(5, 4109, 8);
        o0Var.a(0, 4110, 4);
        o0Var.a(1, 4110, 5);
        return o0Var;
    }

    public static int c(boolean z17, boolean z18) {
        if (true == z17 && true == z18) {
            return 0;
        }
        if (true != z17 || z18) {
            return (z17 || true != z18) ? 257 : 256;
        }
        return 1;
    }

    public static java.lang.String d(int i17) {
        java.util.Map map = f520899a;
        if (!((java.util.HashMap) map).containsKey(java.lang.Integer.valueOf(i17))) {
            return "no found value";
        }
        return (java.lang.String) ((java.util.HashMap) map).get(java.lang.Integer.valueOf(i17));
    }

    public static boolean e(int i17) {
        return 257 == i17 || 256 == i17;
    }

    public static boolean f(int i17) {
        return 1 == i17 || i17 == 0 || 2 == i17 || 3 == i17;
    }

    public static boolean g(int i17) {
        return i17 == 0 || 2 == i17 || 4 == i17 || 6 == i17 || 256 == i17 || 258 == i17 || 260 == i17;
    }

    public static boolean h(int i17) {
        return 260 == i17 || 261 == i17 || 6 == i17 || 7 == i17;
    }
}

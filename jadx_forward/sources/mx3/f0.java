package mx3;

/* loaded from: classes10.dex */
public final class f0 {

    /* renamed from: a, reason: collision with root package name */
    public static final mx3.f0 f414081a = new mx3.f0();

    /* renamed from: b, reason: collision with root package name */
    public static final java.lang.String f414082b;

    /* renamed from: c, reason: collision with root package name */
    public static final java.lang.String f414083c;

    /* renamed from: d, reason: collision with root package name */
    public static final p012xc85e97e9.p093xedfae76a.j0 f414084d;

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String f414085e;

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.String f414086f;

    /* renamed from: g, reason: collision with root package name */
    public static final java.lang.String f414087g;

    /* renamed from: h, reason: collision with root package name */
    public static final java.lang.String f414088h;

    /* renamed from: i, reason: collision with root package name */
    public static final java.lang.String f414089i;

    /* renamed from: j, reason: collision with root package name */
    public static final java.lang.String f414090j;

    /* renamed from: k, reason: collision with root package name */
    public static final java.lang.String f414091k;

    static {
        java.lang.String str = lp0.b.X() + "app_ringtone";
        f414082b = str;
        f414083c = str + '/';
        f414084d = new p012xc85e97e9.p093xedfae76a.j0();
        f414085e = "phonering.mp3";
        f414086f = "playend.mp3";
        f414087g = "close_sound.mp3";
        f414088h = "voip_bad_netstatus_hint.mp3";
        f414089i = "animation_ringonte_ring.wxam";
        f414090j = "animation_ringonte_ring_dark.wxam";
        f414091k = "animation_ringtone_ring_gold.wxam";
    }

    public static final java.lang.Object b(java.lang.String str, boolean z17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return p3325xe03a0797.p3326xc267989b.l.g(p3325xe03a0797.p3326xc267989b.q1.f392103c, new mx3.c0(str, z17, null), interfaceC29045xdcb5ca57);
    }

    public static final android.net.Uri c(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.lang.String str = f414083c;
        sb6.append(str);
        java.lang.String str2 = f414086f;
        sb6.append(str2);
        com.p314xaae8f345.mm.vfs.z7 a17 = com.p314xaae8f345.mm.vfs.z7.a(sb6.toString());
        java.lang.String str3 = a17.f294812f;
        if (str3 != null) {
            java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str3, false, false);
            if (!str3.equals(l17)) {
                a17 = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, l17, a17.f294813g, a17.f294814h);
            }
        }
        com.p314xaae8f345.mm.vfs.z2 m17 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(a17, null);
        if (!(m17.a() ? m17.f294799a.F(m17.f294800b) : false)) {
            f414081a.a();
        }
        android.net.Uri b17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.i1.b(context, new com.p314xaae8f345.mm.vfs.r6(str + str2));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(b17, "getUriForFile(...)");
        return b17;
    }

    public static final java.lang.String f(boolean z17) {
        mx3.f0 f0Var = f414081a;
        return z17 ? f0Var.d(f414090j) : f0Var.d(f414089i);
    }

    public static final java.lang.String g(java.lang.String toUser, java.lang.String fileName) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(toUser, "toUser");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fileName, "fileName");
        java.lang.String t17 = r26.i0.t(fileName, "/", " ", false);
        if (t17.length() == 0) {
            t17 = java.lang.String.valueOf(java.lang.System.currentTimeMillis());
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(f414083c);
        sb6.append(toUser.length() > 0 ? toUser.concat("/") : "");
        sb6.append(t17);
        com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(sb6.toString());
        com.p314xaae8f345.mm.vfs.r6 s17 = r6Var.s();
        if (s17 != null && !s17.m()) {
            s17.J();
        }
        java.lang.String o17 = r6Var.o();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(o17, "getAbsolutePath(...)");
        return o17;
    }

    public static final boolean h() {
        return ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_android_bluetooth_sco_ringtone_fix, true);
    }

    public static final boolean i() {
        return ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_voip_forbid_setmode_while_invited_ringing, false);
    }

    public static final boolean j() {
        if (!fp.h.c(29)) {
            return false;
        }
        return ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_ringtone_ringtone_channel_grant_permission, true);
    }

    public final void a() {
        com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(f414082b);
        if (r6Var.A()) {
            r6Var.l();
        }
        if (!r6Var.m()) {
            r6Var.J();
        }
        java.lang.System.currentTimeMillis();
        if (!fp.q.b("phonering")) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.RingBackHelper", "copyRingtone failed, expansions not ready.");
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("assets:///");
        java.lang.String str = f414085e;
        sb6.append(str);
        java.lang.String sb7 = sb6.toString();
        java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
        java.lang.String str2 = f414083c;
        sb8.append(str2);
        sb8.append(str);
        com.p314xaae8f345.mm.vfs.w6.c(sb7, sb8.toString());
        java.lang.StringBuilder sb9 = new java.lang.StringBuilder("assets:///");
        java.lang.String str3 = f414086f;
        sb9.append(str3);
        com.p314xaae8f345.mm.vfs.w6.c(sb9.toString(), str2 + str3);
        java.lang.StringBuilder sb10 = new java.lang.StringBuilder("assets:///");
        java.lang.String str4 = f414087g;
        sb10.append(str4);
        com.p314xaae8f345.mm.vfs.w6.c(sb10.toString(), str2 + str4);
        java.lang.StringBuilder sb11 = new java.lang.StringBuilder("assets:///");
        java.lang.String str5 = f414088h;
        sb11.append(str5);
        com.p314xaae8f345.mm.vfs.w6.c(sb11.toString(), str2 + str5);
        java.lang.StringBuilder sb12 = new java.lang.StringBuilder("assets:///");
        java.lang.String str6 = f414089i;
        sb12.append(str6);
        com.p314xaae8f345.mm.vfs.w6.c(sb12.toString(), str2 + str6);
        java.lang.StringBuilder sb13 = new java.lang.StringBuilder("assets:///");
        java.lang.String str7 = f414090j;
        sb13.append(str7);
        com.p314xaae8f345.mm.vfs.w6.c(sb13.toString(), str2 + str7);
        java.lang.StringBuilder sb14 = new java.lang.StringBuilder("assets:///");
        java.lang.String str8 = f414091k;
        sb14.append(str8);
        com.p314xaae8f345.mm.vfs.w6.c(sb14.toString(), str2 + str8);
        java.lang.System.currentTimeMillis();
    }

    public final java.lang.String d(java.lang.String str) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.lang.String str2 = f414083c;
        sb6.append(str2);
        sb6.append(str);
        com.p314xaae8f345.mm.vfs.z7 a17 = com.p314xaae8f345.mm.vfs.z7.a(sb6.toString());
        java.lang.String str3 = a17.f294812f;
        if (str3 != null) {
            java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str3, false, false);
            if (!str3.equals(l17)) {
                a17 = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, l17, a17.f294813g, a17.f294814h);
            }
        }
        com.p314xaae8f345.mm.vfs.z2 m17 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(a17, null);
        if (!(m17.a() ? m17.f294799a.F(m17.f294800b) : false)) {
            a();
        }
        java.lang.String o17 = new com.p314xaae8f345.mm.vfs.r6(str2 + str).o();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(o17, "getAbsolutePath(...)");
        return o17;
    }

    public final java.lang.String e(int i17, java.lang.String mediaId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaId, "mediaId");
        return f414083c + i17 + '_' + mediaId + ".ringtone";
    }

    public final boolean k() {
        return ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_multitalk_start_sco_when_ring, false);
    }
}

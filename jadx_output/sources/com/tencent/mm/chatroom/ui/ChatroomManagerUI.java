package com.tencent.mm.chatroom.ui;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/chatroom/ui/ChatroomManagerUI;", "Lcom/tencent/mm/ui/base/preference/MMPreference;", "<init>", "()V", "com/tencent/mm/chatroom/ui/h1", "ui-chatroom_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class ChatroomManagerUI extends com.tencent.mm.ui.base.preference.MMPreference {

    /* renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ int f63727s = 0;

    /* renamed from: d, reason: collision with root package name */
    public android.content.SharedPreferences f63728d;

    /* renamed from: i, reason: collision with root package name */
    public r45.kt5 f63733i;

    /* renamed from: o, reason: collision with root package name */
    public int f63736o;

    /* renamed from: q, reason: collision with root package name */
    public boolean f63738q;

    /* renamed from: r, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.z2 f63739r;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f63729e = jz5.h.b(new com.tencent.mm.chatroom.ui.p1(this));

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f63730f = jz5.h.b(new com.tencent.mm.chatroom.ui.o1(this));

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f63731g = jz5.h.b(new com.tencent.mm.chatroom.ui.q1(this));

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f63732h = jz5.h.b(new com.tencent.mm.chatroom.ui.t1(this));

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f63734m = jz5.h.b(new com.tencent.mm.chatroom.ui.u1(this));

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f63735n = jz5.h.b(new com.tencent.mm.chatroom.ui.r1(this));

    /* renamed from: p, reason: collision with root package name */
    public final jz5.g f63737p = jz5.h.b(new com.tencent.mm.chatroom.ui.s1(this));

    public static final void V6(com.tencent.mm.chatroom.ui.ChatroomManagerUI chatroomManagerUI) {
        java.util.LinkedList linkedList;
        r45.kt5 kt5Var = chatroomManagerUI.f63733i;
        jz5.g gVar = chatroomManagerUI.f63731g;
        if (kt5Var == null || com.tencent.mm.sdk.platformtools.t8.L0(kt5Var.f378942e)) {
            com.tencent.mm.ui.base.preference.r preferenceScreen = chatroomManagerUI.getPreferenceScreen();
            if (preferenceScreen != null) {
                ((com.tencent.mm.ui.base.preference.h0) preferenceScreen).m("room_bind_app_info_key", true);
            }
        } else {
            r45.kt5 kt5Var2 = chatroomManagerUI.f63733i;
            kotlin.jvm.internal.o.d(kt5Var2);
            r45.jt5 jt5Var = (r45.jt5) kt5Var2.f378942e.getFirst();
            com.tencent.mm.ui.base.preference.r preferenceScreen2 = chatroomManagerUI.getPreferenceScreen();
            if (preferenceScreen2 != null) {
                ((com.tencent.mm.ui.base.preference.h0) preferenceScreen2).m("room_bind_app_info_key", false);
            }
            com.tencent.mm.ui.base.preference.Preference preference = (com.tencent.mm.ui.base.preference.Preference) ((jz5.n) gVar).getValue();
            if (preference != null) {
                java.lang.String str = jt5Var.f378100e;
                if (str == null) {
                    str = "";
                }
                preference.H(str);
            }
        }
        r45.kt5 kt5Var3 = chatroomManagerUI.f63733i;
        if (kt5Var3 != null && (linkedList = kt5Var3.f378942e) != null) {
            r45.jt5 jt5Var2 = (r45.jt5) linkedList.getFirst();
            com.tencent.mm.ui.base.preference.r preferenceScreen3 = chatroomManagerUI.getPreferenceScreen();
            if (preferenceScreen3 != null) {
                ((com.tencent.mm.ui.base.preference.h0) preferenceScreen3).m("room_bind_app_info_key", false);
            }
            com.tencent.mm.ui.base.preference.Preference preference2 = (com.tencent.mm.ui.base.preference.Preference) ((jz5.n) gVar).getValue();
            if (preference2 != null) {
                java.lang.String str2 = jt5Var2.f378100e;
                boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                preference2.H(str2 != null ? str2 : "");
            }
        }
        com.tencent.mm.ui.base.preference.r preferenceScreen4 = chatroomManagerUI.getPreferenceScreen();
        if (preferenceScreen4 != null) {
            ((com.tencent.mm.ui.base.preference.h0) preferenceScreen4).notifyDataSetChanged();
        }
    }

    public final void W6(long j17, long j18) {
        ((ku5.t0) ku5.t0.f312615d).g(new com.tencent.mm.chatroom.ui.n1(j17, j18, this));
    }

    public final com.tencent.mm.ui.base.preference.CheckBoxPreference X6() {
        return (com.tencent.mm.ui.base.preference.CheckBoxPreference) ((jz5.n) this.f63730f).getValue();
    }

    public final com.tencent.mm.ui.base.preference.CheckBoxPreference Y6() {
        return (com.tencent.mm.ui.base.preference.CheckBoxPreference) ((jz5.n) this.f63729e).getValue();
    }

    public final java.lang.String Z6() {
        return (java.lang.String) ((jz5.n) this.f63735n).getValue();
    }

    public final com.tencent.mm.plugin.newtips.NewTipPreference a7() {
        return (com.tencent.mm.plugin.newtips.NewTipPreference) ((jz5.n) this.f63732h).getValue();
    }

    public final r45.jt5 b7() {
        r45.kt5 kt5Var = this.f63733i;
        if (kt5Var == null) {
            return null;
        }
        kotlin.jvm.internal.o.d(kt5Var);
        if (com.tencent.mm.sdk.platformtools.t8.L0(kt5Var.f378942e)) {
            return null;
        }
        r45.kt5 kt5Var2 = this.f63733i;
        kotlin.jvm.internal.o.d(kt5Var2);
        return (r45.jt5) kt5Var2.f378942e.getFirst();
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference
    public int getResourceId() {
        return com.tencent.mm.R.xml.f494903dn;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        com.tencent.mars.xlog.Log.i("MicroMsg.ChatroomManagerUI", "onActivityResult requestCode:" + i17 + ", resultCode:" + i18);
        if (i17 == 1 && intent != null) {
            int intExtra = intent.getIntExtra("into_room_type", -1);
            com.tencent.mars.xlog.Log.i("MicroMsg.ChatroomManagerUI", "[openVerify] roomId:%s, type:%s", Z6(), java.lang.Integer.valueOf(intExtra));
            r45.mn4 mn4Var = new r45.mn4();
            java.lang.String Z6 = Z6();
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            if (Z6 == null) {
                Z6 = "";
            }
            mn4Var.f380691d = Z6;
            mn4Var.f380692e = intExtra;
            ((e21.z0) ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).fj()).c(new xg3.p0(66, mn4Var));
        }
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        jz5.f0 f0Var;
        com.tencent.mm.ui.base.preference.r preferenceScreen;
        super.onCreate(bundle);
        android.content.SharedPreferences sharedPreferences = getSharedPreferences(getPackageName() + "_preferences", 0);
        kotlin.jvm.internal.o.f(sharedPreferences, "getSharedPreferences(...)");
        this.f63728d = sharedPreferences;
        com.tencent.mm.storage.a3 z07 = ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().z0(Z6());
        if (z07 != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ChatroomManagerUI", "mRoomId:" + Z6() + " chatroom status=" + z07.field_chatroomStatus);
            int y07 = z07.y0();
            int i17 = z07.field_qrCodeAccessType;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("init ChatroomAccess ");
            sb6.append(Z6());
            sb6.append(" chatroomType=");
            sb6.append(y07);
            sb6.append(" qrCodeAccessType=");
            r26.a.a(2);
            java.lang.String num = java.lang.Integer.toString(i17, 2);
            kotlin.jvm.internal.o.f(num, "toString(...)");
            sb6.append(num);
            com.tencent.mars.xlog.Log.i("MicroMsg.ChatroomManagerUI", sb6.toString());
            if (c01.e2.E(Z6())) {
                ((com.tencent.mm.ui.base.preference.h0) getPreferenceScreen()).m("room_access_by_qrcode_key", true);
                com.tencent.mars.xlog.Log.i("MicroMsg.ChatroomManagerUI", "isAssociateChatRoom hide qr code");
            }
            if (com.tencent.mm.storage.z3.q4(Z6())) {
                ((com.tencent.mm.ui.base.preference.h0) getPreferenceScreen()).m("room_access_by_qrcode_key", true);
                com.tencent.mm.ui.base.preference.CheckBoxPreference X6 = X6();
                if (X6 != null) {
                    X6.O((z07.y0() & 1) == 1);
                }
            } else {
                com.tencent.mm.ui.base.preference.CheckBoxPreference Y6 = Y6();
                if (Y6 != null) {
                    Y6.O((i17 & 2) > 0);
                }
                com.tencent.mm.ui.base.preference.CheckBoxPreference X62 = X6();
                if (X62 != null) {
                    X62.O(y07 == 2);
                }
            }
            com.tencent.mm.ui.base.preference.CheckBoxPreference Y62 = Y6();
            if (Y62 != null) {
                Y62.f197785v = false;
            }
            com.tencent.mm.ui.base.preference.CheckBoxPreference X63 = X6();
            if (X63 != null) {
                X63.f197785v = false;
            }
            if (X6() != null && (preferenceScreen = getPreferenceScreen()) != null) {
                ((com.tencent.mm.ui.base.preference.h0) preferenceScreen).m("room_access_verify_application_key", !r2.N());
            }
            if (z07.field_memberCount >= 200) {
                com.tencent.mm.ui.base.preference.CheckBoxPreference Y63 = Y6();
                if (Y63 != null) {
                    Y63.O(false);
                }
                com.tencent.mm.ui.base.preference.CheckBoxPreference Y64 = Y6();
                if (Y64 != null) {
                    Y64.w(false);
                }
                com.tencent.mm.ui.base.preference.CheckBoxPreference Y65 = Y6();
                if (Y65 != null) {
                    Y65.H(getString(com.tencent.mm.R.string.p68));
                }
            }
            if (!com.tencent.mm.storage.z3.q4(Z6()) && c01.v1.w()) {
                long j17 = z07.field_chatroomStatus;
                if ((j17 & 131072) != 131072 && (j17 & 65536) == 65536 && c01.v1.E()) {
                    com.tencent.mm.ui.base.preference.r preferenceScreen2 = getPreferenceScreen();
                    if (preferenceScreen2 != null) {
                        ((com.tencent.mm.ui.base.preference.h0) preferenceScreen2).m("use_wework_manager_room_key", false);
                    }
                    com.tencent.mm.plugin.newtips.NewTipPreference a76 = a7();
                    if (a76 != null) {
                        a76.R = new java.lang.ref.WeakReference(getPreferenceScreen());
                    }
                    ((ua0.m) ((va0.p) i95.n0.c(va0.p.class))).getClass();
                    rn3.i.Di().k(a7());
                    com.tencent.mm.plugin.newtips.NewTipPreference a77 = a7();
                    if (a77 != null) {
                        a77.M();
                    }
                }
            }
            f0Var = jz5.f0.f302826a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ChatroomManagerUI", "initChatroomAccess member is null");
        }
        setBackBtn(new com.tencent.mm.chatroom.ui.v1(this));
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        com.tencent.mm.ui.base.preference.CheckBoxPreference Y6 = Y6();
        java.lang.Boolean valueOf = Y6 != null ? java.lang.Boolean.valueOf(Y6.N()) : null;
        com.tencent.mm.ui.base.preference.CheckBoxPreference X6 = X6();
        java.lang.Boolean valueOf2 = X6 != null ? java.lang.Boolean.valueOf(X6.N()) : null;
        com.tencent.mars.xlog.Log.i("MicroMsg.ChatroomManagerUI", "dealWith ChatroomAccess roomId:" + Z6() + " isQRCodeOpen:" + valueOf + ", isInviteVerifyOpen:" + valueOf2 + ", changed=" + this.f63738q);
        if (this.f63738q) {
            if (com.tencent.mm.storage.z3.q4(Z6())) {
                ab0.y yVar = (ab0.y) i95.n0.c(ab0.y.class);
                java.lang.String Z6 = Z6();
                boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                java.lang.String str = Z6 != null ? Z6 : "";
                boolean b17 = kotlin.jvm.internal.o.b(valueOf2, java.lang.Boolean.TRUE);
                ((za0.i) yVar).getClass();
                ((e21.z0) ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).fj()).c(new p41.y(str, b17 ? 1 : 0));
            } else {
                r45.mn4 mn4Var = new r45.mn4();
                java.lang.String Z62 = Z6();
                boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                mn4Var.f380691d = Z62 != null ? Z62 : "";
                java.lang.Boolean bool = java.lang.Boolean.TRUE;
                mn4Var.f380692e = kotlin.jvm.internal.o.b(valueOf2, bool) ? 2 : 0;
                mn4Var.f380693f = 5;
                if (kotlin.jvm.internal.o.b(valueOf, bool)) {
                    mn4Var.f380693f |= 2;
                }
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("ModChatRoomAccessVerify ");
                sb6.append(Z6());
                sb6.append(" ChatRoomAccessVerify: Value = ");
                sb6.append(mn4Var.f380692e);
                sb6.append(", QRCodeAccessType = ");
                int i17 = mn4Var.f380693f;
                r26.a.a(2);
                java.lang.String num = java.lang.Integer.toString(i17, 2);
                kotlin.jvm.internal.o.f(num, "toString(...)");
                sb6.append(num);
                com.tencent.mars.xlog.Log.i("MicroMsg.ChatroomManagerUI", sb6.toString());
                ((e21.z0) ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).fj()).c(new xg3.p0(66, mn4Var));
                this.f63738q = false;
            }
        }
        super.onPause();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0319, code lost:
    
        if (r2 != false) goto L119;
     */
    @Override // com.tencent.mm.ui.base.preference.MMPreference
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onPreferenceTreeClick(com.tencent.mm.ui.base.preference.r r22, com.tencent.mm.ui.base.preference.Preference r23) {
        /*
            Method dump skipped, instructions count: 1322
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.chatroom.ui.ChatroomManagerUI.onPreferenceTreeClick(com.tencent.mm.ui.base.preference.r, com.tencent.mm.ui.base.preference.Preference):boolean");
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        com.tencent.mm.ui.base.preference.r preferenceScreen;
        jz5.f0 f0Var;
        com.tencent.mm.ui.base.preference.r preferenceScreen2;
        super.onResume();
        setMMTitle(com.tencent.mm.R.string.f492479gt0);
        if ((!c01.e2.E(Z6()) || (c01.z1.d() & 16) != 0) && (preferenceScreen = getPreferenceScreen()) != null) {
            ((com.tencent.mm.ui.base.preference.h0) preferenceScreen).m("room_manager_key", !((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).b(Z6()));
        }
        if (c01.e2.E(Z6())) {
            ((com.tencent.mm.ui.base.preference.h0) getPreferenceScreen()).m("room_access_by_qrcode_key", true);
            com.tencent.mars.xlog.Log.i("MicroMsg.ChatroomManagerUI", "isAssociateChatRoom hide qr code");
        }
        com.tencent.mm.ui.base.preference.r preferenceScreen3 = getPreferenceScreen();
        if (preferenceScreen3 != null) {
            ((com.tencent.mm.ui.base.preference.h0) preferenceScreen3).m("use_wework_manager_room_key", true);
        }
        com.tencent.mm.ui.base.preference.r preferenceScreen4 = getPreferenceScreen();
        if (preferenceScreen4 != null) {
            ((com.tencent.mm.ui.base.preference.h0) preferenceScreen4).m("room_bind_app_info_key", true);
        }
        boolean b17 = kotlin.jvm.internal.o.b(c01.z1.r(), (java.lang.String) ((jz5.n) this.f63737p).getValue());
        if (!b17) {
            com.tencent.mm.ui.base.preference.r preferenceScreen5 = getPreferenceScreen();
            if (preferenceScreen5 != null) {
                ((com.tencent.mm.ui.base.preference.h0) preferenceScreen5).m("room_transfer_room_owner_key", true);
            }
            com.tencent.mm.ui.base.preference.r preferenceScreen6 = getPreferenceScreen();
            if (preferenceScreen6 != null) {
                ((com.tencent.mm.ui.base.preference.h0) preferenceScreen6).w("dismiss_chatroom_quit_key");
            }
        }
        if (b17) {
            pq5.h.b(Z6()).q(com.tencent.mm.chatroom.ui.e2.f64124a).h(new com.tencent.mm.chatroom.ui.f2(this));
        }
        com.tencent.mm.storage.a3 z07 = ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().z0(Z6());
        if (z07 != null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("updateScreen mRoomId:");
            sb6.append(Z6());
            sb6.append(" chatroomType=");
            sb6.append(z07.y0());
            sb6.append(" chatroomstatus=0x");
            int i17 = z07.field_chatroomStatus;
            r26.a.a(2);
            java.lang.String num = java.lang.Integer.toString(i17, 2);
            kotlin.jvm.internal.o.f(num, "toString(...)");
            sb6.append(num);
            com.tencent.mars.xlog.Log.i("MicroMsg.ChatroomManagerUI", sb6.toString());
            if (!com.tencent.mm.storage.z3.q4(Z6()) && c01.v1.w()) {
                long j17 = z07.field_chatroomStatus;
                if ((j17 & 131072) != 131072 && (j17 & 65536) == 65536 && c01.v1.E()) {
                    com.tencent.mm.ui.base.preference.r preferenceScreen7 = getPreferenceScreen();
                    if (preferenceScreen7 != null) {
                        ((com.tencent.mm.ui.base.preference.h0) preferenceScreen7).m("use_wework_manager_room_key", false);
                    }
                    com.tencent.mm.plugin.newtips.NewTipPreference a76 = a7();
                    if (a76 != null) {
                        a76.R = new java.lang.ref.WeakReference(getPreferenceScreen());
                    }
                    ((ua0.m) ((va0.p) i95.n0.c(va0.p.class))).getClass();
                    rn3.i.Di().k(a7());
                    com.tencent.mm.plugin.newtips.NewTipPreference a77 = a7();
                    if (a77 != null) {
                        a77.M();
                    }
                }
            }
            if (com.tencent.mm.storage.z3.q4(Z6())) {
                com.tencent.mm.ui.base.preference.r preferenceScreen8 = getPreferenceScreen();
                if (preferenceScreen8 != null) {
                    ((com.tencent.mm.ui.base.preference.h0) preferenceScreen8).m("room_topic_mod_only_admin_key", true);
                }
            } else {
                com.tencent.mm.ui.base.preference.r preferenceScreen9 = getPreferenceScreen();
                if (preferenceScreen9 != null) {
                    ((com.tencent.mm.ui.base.preference.h0) preferenceScreen9).m("room_topic_mod_only_admin_key", false);
                }
                int i18 = z07.field_chatroomStatus;
                int i19 = i18 & Integer.MIN_VALUE;
                jz5.g gVar = this.f63734m;
                if (i19 == Integer.MIN_VALUE) {
                    boolean z17 = (i18 & 4) != 0;
                    com.tencent.mm.ui.base.preference.CheckBoxPreference checkBoxPreference = (com.tencent.mm.ui.base.preference.CheckBoxPreference) ((jz5.n) gVar).getValue();
                    if (checkBoxPreference != null) {
                        checkBoxPreference.O(z17);
                    }
                } else {
                    java.lang.String d17 = ((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("ChatRoomOwnerModTopic");
                    int D1 = !com.tencent.mm.sdk.platformtools.t8.K0(d17) ? com.tencent.mm.sdk.platformtools.t8.D1(d17, 0) : 0;
                    if (z07.field_memberCount >= D1 && D1 > 0) {
                        com.tencent.mm.ui.base.preference.CheckBoxPreference checkBoxPreference2 = (com.tencent.mm.ui.base.preference.CheckBoxPreference) ((jz5.n) gVar).getValue();
                        if (checkBoxPreference2 != null) {
                            checkBoxPreference2.O(true);
                        }
                    } else {
                        com.tencent.mm.ui.base.preference.CheckBoxPreference checkBoxPreference3 = (com.tencent.mm.ui.base.preference.CheckBoxPreference) ((jz5.n) gVar).getValue();
                        if (checkBoxPreference3 != null) {
                            checkBoxPreference3.O(false);
                        }
                    }
                }
            }
            this.f63736o = z07.field_memberCount;
            f0Var = jz5.f0.f302826a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ChatroomManagerUI", "updateScreen mRoomId:" + Z6() + " member is null");
        }
        com.tencent.mm.ui.base.preference.CheckBoxPreference X6 = X6();
        if (X6 != null) {
            X6.f197785v = false;
        }
        if (X6() != null && (preferenceScreen2 = getPreferenceScreen()) != null) {
            ((com.tencent.mm.ui.base.preference.h0) preferenceScreen2).m("room_access_verify_application_key", !r0.N());
        }
        com.tencent.mm.ui.base.preference.r preferenceScreen10 = getPreferenceScreen();
        if (preferenceScreen10 != null) {
            ((com.tencent.mm.ui.base.preference.h0) preferenceScreen10).notifyDataSetChanged();
        }
    }
}

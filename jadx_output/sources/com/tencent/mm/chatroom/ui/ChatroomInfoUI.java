package com.tencent.mm.chatroom.ui;

@db5.a(2048)
@gm0.a2
/* loaded from: classes11.dex */
public class ChatroomInfoUI extends com.tencent.mm.ui.base.preference.MMPreference implements com.tencent.mm.modelbase.u0, l75.z0, l75.q0, p21.a, pn.a {
    public static boolean Y;
    public java.lang.String A;
    public boolean B;
    public int C;
    public boolean D;
    public boolean E;
    public com.tencent.mm.storage.a3 F;
    public boolean G;
    public boolean H;
    public boolean I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f63688J;
    public boolean K;
    public boolean L;
    public boolean M;
    public boolean N;
    public java.lang.String P;
    public java.lang.String Q;
    public final com.tencent.mm.sdk.event.IListener R;
    public final com.tencent.mm.sdk.event.IListener S;
    public pn.m T;
    public com.tencent.mm.roomsdk.model.factory.a U;
    public com.tencent.mm.sdk.platformtools.b4 V;
    public int W;
    public android.view.View X;

    /* renamed from: d, reason: collision with root package name */
    public android.app.ProgressDialog f63689d = null;

    /* renamed from: e, reason: collision with root package name */
    public android.app.ProgressDialog f63690e = null;

    /* renamed from: f, reason: collision with root package name */
    public boolean f63691f = false;

    /* renamed from: g, reason: collision with root package name */
    public boolean f63692g = true;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.ui.base.preference.r f63693h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f63694i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.storage.z3 f63695m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f63696n;

    /* renamed from: o, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f63697o;

    /* renamed from: p, reason: collision with root package name */
    public com.tencent.mm.chatroom.ui.preference.RoomCardPreference f63698p;

    /* renamed from: q, reason: collision with root package name */
    public com.tencent.mm.ui.base.preference.Preference f63699q;

    /* renamed from: r, reason: collision with root package name */
    public com.tencent.mm.ui.base.preference.Preference f63700r;

    /* renamed from: s, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.ui.applet.ContactListExpandPreference f63701s;

    /* renamed from: t, reason: collision with root package name */
    public com.tencent.mm.ui.base.preference.CheckBoxPreference f63702t;

    /* renamed from: u, reason: collision with root package name */
    public com.tencent.mm.ui.base.preference.CheckBoxPreference f63703u;

    /* renamed from: v, reason: collision with root package name */
    public com.tencent.mm.ui.base.preference.KeyValuePreference f63704v;

    /* renamed from: w, reason: collision with root package name */
    public com.tencent.mm.ui.base.preference.KeyValuePreference f63705w;

    /* renamed from: x, reason: collision with root package name */
    public com.tencent.mm.plugin.newtips.NewTipPreference f63706x;

    /* renamed from: y, reason: collision with root package name */
    public android.content.SharedPreferences f63707y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f63708z;

    /* renamed from: com.tencent.mm.chatroom.ui.ChatroomInfoUI$3, reason: invalid class name */
    /* loaded from: classes5.dex */
    public class AnonymousClass3 extends com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.NotifyChatRoomStatusChangeEvent> {
        public AnonymousClass3(androidx.lifecycle.y yVar) {
            super(yVar);
            this.__eventId = -692279828;
        }

        @Override // com.tencent.mm.sdk.event.IListener
        public boolean callback(com.tencent.mm.autogen.events.NotifyChatRoomStatusChangeEvent notifyChatRoomStatusChangeEvent) {
            com.tencent.mm.autogen.events.NotifyChatRoomStatusChangeEvent notifyChatRoomStatusChangeEvent2 = notifyChatRoomStatusChangeEvent;
            if (!(notifyChatRoomStatusChangeEvent2 instanceof com.tencent.mm.autogen.events.NotifyChatRoomStatusChangeEvent)) {
                return false;
            }
            java.lang.String str = notifyChatRoomStatusChangeEvent2.f54538g.f7048a;
            com.tencent.mm.chatroom.ui.ChatroomInfoUI chatroomInfoUI = com.tencent.mm.chatroom.ui.ChatroomInfoUI.this;
            if (!com.tencent.mm.sdk.platformtools.t8.D0(str, chatroomInfoUI.A)) {
                return false;
            }
            com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(chatroomInfoUI.A, true);
            if (n17 == null || ((int) n17.E2) == 0) {
                com.tencent.mars.xlog.Log.i("MicroMsg.ChatroomInfoUI", "Get contact from db return null.(username : %s)", chatroomInfoUI.A);
                return false;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.ChatroomInfoUI", "try to refresh footer.");
            chatroomInfoUI.runOnUiThread(new com.tencent.mm.chatroom.ui.e0(this));
            return false;
        }
    }

    /* loaded from: classes4.dex */
    public static class LocalHistoryInfo implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<com.tencent.mm.chatroom.ui.ChatroomInfoUI.LocalHistoryInfo> CREATOR = new com.tencent.mm.chatroom.ui.g1();

        /* renamed from: d, reason: collision with root package name */
        public java.lang.String f63717d;

        /* renamed from: e, reason: collision with root package name */
        public java.lang.String f63718e;

        /* renamed from: f, reason: collision with root package name */
        public java.lang.String f63719f;

        /* renamed from: g, reason: collision with root package name */
        public int f63720g;

        /* renamed from: h, reason: collision with root package name */
        public int f63721h;

        /* renamed from: i, reason: collision with root package name */
        public java.lang.String f63722i;

        /* renamed from: m, reason: collision with root package name */
        public java.lang.String f63723m;

        /* renamed from: n, reason: collision with root package name */
        public java.lang.String f63724n;

        /* renamed from: o, reason: collision with root package name */
        public int f63725o;

        /* renamed from: p, reason: collision with root package name */
        public int f63726p;

        public LocalHistoryInfo(android.os.Parcel parcel) {
            this.f63717d = parcel.readString();
            this.f63718e = parcel.readString();
            this.f63719f = parcel.readString();
            this.f63720g = parcel.readInt();
            this.f63721h = parcel.readInt();
            this.f63722i = parcel.readString();
            this.f63723m = parcel.readString();
            this.f63724n = parcel.readString();
            this.f63725o = parcel.readInt();
            this.f63726p = parcel.readInt();
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public java.lang.String toString() {
            return "LocalHistoryInfo{fileid='" + this.f63717d + "', aeskey='" + this.f63718e + "', filemd5='" + this.f63719f + "', filelength=" + this.f63720g + ", msgsount=" + this.f63721h + ", newFormatFileid='" + this.f63722i + "', newFormatAeskey='" + this.f63723m + "', newFormatFilemd5='" + this.f63724n + "', newFormatFilelength=" + this.f63725o + ", newFormatMsgsount=" + this.f63726p + '}';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i17) {
            parcel.writeString(this.f63717d);
            parcel.writeString(this.f63718e);
            parcel.writeString(this.f63719f);
            parcel.writeInt(this.f63720g);
            parcel.writeInt(this.f63721h);
            parcel.writeString(this.f63722i);
            parcel.writeString(this.f63723m);
            parcel.writeString(this.f63724n);
            parcel.writeInt(this.f63725o);
            parcel.writeInt(this.f63726p);
        }
    }

    public ChatroomInfoUI() {
        this.f63696n = r35.v1.L > r35.v1.K;
        this.f63697o = new com.tencent.mm.chatroom.ui.s(this, android.os.Looper.getMainLooper());
        this.f63707y = null;
        this.B = false;
        this.E = false;
        this.F = null;
        this.G = true;
        this.H = false;
        this.I = false;
        this.f63688J = false;
        this.K = false;
        this.L = false;
        this.M = false;
        this.N = false;
        this.P = "";
        this.Q = null;
        com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.R = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.GetChatRoomInfoDetailEvent>(a0Var) { // from class: com.tencent.mm.chatroom.ui.ChatroomInfoUI.2
            {
                this.__eventId = 944120930;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.GetChatRoomInfoDetailEvent getChatRoomInfoDetailEvent) {
                com.tencent.mm.autogen.events.GetChatRoomInfoDetailEvent getChatRoomInfoDetailEvent2 = getChatRoomInfoDetailEvent;
                if (!(getChatRoomInfoDetailEvent2 instanceof com.tencent.mm.autogen.events.GetChatRoomInfoDetailEvent)) {
                    return false;
                }
                java.lang.String str = getChatRoomInfoDetailEvent2.f54383g.f7147a;
                com.tencent.mm.chatroom.ui.ChatroomInfoUI chatroomInfoUI = com.tencent.mm.chatroom.ui.ChatroomInfoUI.this;
                if (!com.tencent.mm.sdk.platformtools.t8.D0(str, chatroomInfoUI.A)) {
                    return false;
                }
                chatroomInfoUI.j7();
                return false;
            }
        };
        this.S = new com.tencent.mm.chatroom.ui.ChatroomInfoUI.AnonymousClass3(a0Var);
        this.T = null;
        this.U = null;
        this.V = null;
        this.W = 0;
    }

    public static void W6(com.tencent.mm.chatroom.ui.ChatroomInfoUI chatroomInfoUI, boolean z17) {
        java.lang.String str;
        chatroomInfoUI.getClass();
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(14553, 3, 2, chatroomInfoUI.A);
        Y = false;
        if (z17) {
            chatroomInfoUI.f63689d = db5.e1.Q(chatroomInfoUI, chatroomInfoUI.getString(com.tencent.mm.R.string.f490573yv), chatroomInfoUI.getString(com.tencent.mm.R.string.f490604zq), true, true, new com.tencent.mm.chatroom.ui.p(chatroomInfoUI));
        }
        if (Y) {
            str = null;
        } else {
            str = ((ng0.o) ((og0.n) i95.n0.c(og0.n.class))).wi(chatroomInfoUI.f63695m.d1());
        }
        de0.j jVar = (de0.j) i95.n0.c(de0.j.class);
        java.lang.String str2 = chatroomInfoUI.A;
        ((ce0.e) jVar).getClass();
        com.tencent.mm.modelsimple.g1.I(str2, 16);
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            kn.l0.e(chatroomInfoUI.A);
            c01.w9.h(chatroomInfoUI.f63695m.d1(), new com.tencent.mm.chatroom.ui.c1(chatroomInfoUI, chatroomInfoUI, chatroomInfoUI.f63695m.d1()));
        } else {
            android.app.ProgressDialog progressDialog = chatroomInfoUI.f63689d;
            if (progressDialog != null) {
                progressDialog.dismiss();
            }
            db5.e1.L(chatroomInfoUI, false, chatroomInfoUI.getString(com.tencent.mm.R.string.kk_, str), null, chatroomInfoUI.getString(com.tencent.mm.R.string.fs8), chatroomInfoUI.getString(com.tencent.mm.R.string.b96), new com.tencent.mm.chatroom.ui.q(chatroomInfoUI), new com.tencent.mm.chatroom.ui.r(chatroomInfoUI), -1, com.tencent.mm.R.color.f478622ch);
        }
    }

    public static void X6(com.tencent.mm.chatroom.ui.ChatroomInfoUI chatroomInfoUI) {
        chatroomInfoUI.getClass();
        ((c01.w1) ((rv1.e) i95.n0.c(rv1.e.class))).wi(chatroomInfoUI.A);
        de0.j jVar = (de0.j) i95.n0.c(de0.j.class);
        java.lang.String str = chatroomInfoUI.A;
        ((ce0.e) jVar).getClass();
        com.tencent.mm.modelsimple.g1.I(str, 15);
        c01.t1.d(chatroomInfoUI.A, null, chatroomInfoUI.getResources().getString(com.tencent.mm.R.string.hql), false, "", 0);
        ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.chatroom.ui.h0(chatroomInfoUI));
    }

    public static void Y6(com.tencent.mm.chatroom.ui.ChatroomInfoUI chatroomInfoUI, o65.f fVar) {
        java.lang.String str;
        java.lang.String string = chatroomInfoUI.getString(com.tencent.mm.R.string.f490368t1);
        str = "";
        if (fVar != null) {
            java.lang.String str2 = fVar.f343224b;
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            str = str2 != null ? str2 : "";
            string = fVar.f343225c;
            java.lang.String string2 = chatroomInfoUI.getString(com.tencent.mm.R.string.f490368t1);
            if (string == null) {
                string = string2;
            }
        }
        db5.e1.s(chatroomInfoUI, string, str);
    }

    public static void Z6(com.tencent.mm.chatroom.ui.ChatroomInfoUI chatroomInfoUI, java.lang.String str) {
        chatroomInfoUI.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.ChatroomInfoUI", "doDeleteChatroom");
        c01.w9.h(chatroomInfoUI.A, new com.tencent.mm.chatroom.ui.d1(chatroomInfoUI, chatroomInfoUI, str));
        de0.j jVar = (de0.j) i95.n0.c(de0.j.class);
        java.lang.String str2 = chatroomInfoUI.A;
        ((ce0.e) jVar).getClass();
        com.tencent.mm.modelsimple.g1.I(str2, 15);
        ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().k(chatroomInfoUI.A);
        java.lang.String str3 = chatroomInfoUI.A;
        if (c01.v1.B(str3)) {
            com.tencent.mm.storage.k4 Bi = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi();
            if (Bi.j0(str3)) {
                Bi.k(str3);
            } else {
                com.tencent.mars.xlog.Log.e("MicroMsg.ChatroomMembersLogic", "deleteWholeChatroom RoomName not exist:[" + str3 + "]");
            }
            ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().y0(str3);
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.ChatroomMembersLogic", "deleteWholeChatroom: room:[" + str3 + "]");
        }
        oo0.c wi6 = ((v80.k) ((w80.i) i95.n0.c(w80.i.class))).wi();
        java.lang.String str4 = chatroomInfoUI.A;
        int delete = ((oo0.e) wi6).f347120d.delete("LiveTipsBar", "hostRoomId= ? ", new java.lang.String[]{str4});
        if (delete < 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.LiveTipsBarStorage", "deleteByHostRoomId failed, hostRoomId:%s, result%d", str4, java.lang.Integer.valueOf(delete));
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.LiveTipsBarStorage", "deleteByHostRoomId, hostRoomId:%s, result%d", str4, java.lang.Integer.valueOf(delete));
        }
        com.tencent.mm.autogen.events.FinderLiveTipsBarEvent finderLiveTipsBarEvent = new com.tencent.mm.autogen.events.FinderLiveTipsBarEvent();
        am.ec ecVar = finderLiveTipsBarEvent.f54300g;
        ecVar.f6548a = 2;
        ecVar.f6549b = chatroomInfoUI.A;
        finderLiveTipsBarEvent.e();
        android.content.Intent intent = new android.content.Intent();
        intent.addFlags(67108864);
        intent.setComponent(new android.content.ComponentName(chatroomInfoUI.getPackageName(), "com.tencent.mm.ui.LauncherUI"));
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(chatroomInfoUI, arrayList.toArray(), "com/tencent/mm/chatroom/ui/ChatroomInfoUI", "doDeleteChatroom", "(Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        chatroomInfoUI.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(chatroomInfoUI, "com/tencent/mm/chatroom/ui/ChatroomInfoUI", "doDeleteChatroom", "(Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        chatroomInfoUI.finish();
    }

    public static com.tencent.mm.ui.widget.dialog.z2 s7(android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2, com.tencent.mm.chatroom.ui.b1 b1Var) {
        android.view.View inflate = com.tencent.mm.ui.id.b(context).inflate(com.tencent.mm.R.layout.f488403sc, (android.view.ViewGroup) null);
        android.widget.CheckBox checkBox = (android.widget.CheckBox) inflate.findViewById(com.tencent.mm.R.id.c__);
        android.graphics.drawable.Drawable drawable = context.getDrawable(com.tencent.mm.R.drawable.d6w);
        if (drawable != null) {
            int h17 = i65.a.h(context, com.tencent.mm.R.dimen.f479693cs);
            drawable.setBounds(0, 0, h17, h17);
            checkBox.setCompoundDrawables(drawable, null, null, null);
        }
        ((android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.czv)).setText(str2);
        ((android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.t3z)).setText(str3);
        android.widget.CheckBox checkBox2 = (android.widget.CheckBox) inflate.findViewById(com.tencent.mm.R.id.c__);
        b1Var.a(checkBox2);
        if (!android.text.TextUtils.isEmpty(str) && com.tencent.mm.storage.z3.L4(str)) {
            checkBox2.setVisibility(4);
        }
        com.tencent.mm.ui.widget.dialog.z2 z2Var = new com.tencent.mm.ui.widget.dialog.z2(context, 1, 0);
        z2Var.m(charSequence, charSequence2);
        z2Var.v(context.getResources().getColor(com.tencent.mm.R.color.a0c));
        z2Var.o(2);
        z2Var.j(inflate);
        int h18 = i65.a.h(context, com.tencent.mm.R.dimen.f479704cz);
        android.widget.LinearLayout linearLayout = z2Var.f212066r;
        linearLayout.setPadding(linearLayout.getPaddingLeft(), h18, linearLayout.getPaddingRight(), linearLayout.getPaddingBottom());
        com.tencent.mm.chatroom.ui.c0 c0Var = new com.tencent.mm.chatroom.ui.c0(z2Var);
        com.tencent.mm.chatroom.ui.d0 d0Var = new com.tencent.mm.chatroom.ui.d0(z2Var, b1Var, checkBox2);
        z2Var.D = c0Var;
        z2Var.E = d0Var;
        z2Var.C();
        return z2Var;
    }

    public final void A7() {
        if (this.f63694i) {
            int wi6 = ((py.a) ((qy.i) i95.n0.c(qy.i.class))).wi(this.A);
            this.C = wi6;
            if (wi6 == 0) {
                setMMTitle(getString(com.tencent.mm.R.string.i78));
            } else {
                setMMTitle(getString(com.tencent.mm.R.string.f492133fc0, getString(com.tencent.mm.R.string.i78), java.lang.Integer.valueOf(this.C)));
            }
        }
    }

    public final void V6(java.lang.String str) {
        int o17 = ((com.tencent.mm.ui.base.preference.h0) this.f63693h).o(str);
        android.widget.ListView listView = getListView();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(o17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(listView, arrayList.toArray(), "com/tencent/mm/chatroom/ui/ChatroomInfoUI", "MatteHighLightItem", "(Ljava/lang/String;)V", "Undefined", "smoothScrollToPosition", "(I)V");
        listView.smoothScrollToPosition(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(listView, "com/tencent/mm/chatroom/ui/ChatroomInfoUI", "MatteHighLightItem", "(Ljava/lang/String;)V", "Undefined", "smoothScrollToPosition", "(I)V");
        new com.tencent.mm.sdk.platformtools.n3().postDelayed(new com.tencent.mm.chatroom.ui.q0(this, o17), 10L);
    }

    @Override // pn.a
    public void Z0() {
        A7();
        com.tencent.mm.storage.a3 a3Var = this.F;
        if (a3Var != null) {
            this.C = a3Var.A0().size();
        }
        t7();
    }

    @Override // p21.a
    public void Z1(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        com.tencent.mm.pluginsdk.ui.applet.ContactListExpandPreference contactListExpandPreference;
        if (this.f63691f || !str.equals(this.A) || (contactListExpandPreference = this.f63701s) == null) {
            return;
        }
        contactListExpandPreference.s();
    }

    public final int a7(int i17) {
        com.tencent.mm.storage.z3 z3Var;
        if (!com.tencent.mm.ui.contact.i5.f() || (z3Var = this.f63695m) == null) {
            return i17;
        }
        java.lang.String d17 = z3Var.d1();
        return (com.tencent.mm.storage.z3.m4(d17) || com.tencent.mm.storage.z3.n4(d17) || c01.e2.E(d17)) ? i17 | com.tencent.thumbplayer.core.common.TPMediaCodecProfileLevel.HEVCMainTierLevel62 : i17 & (-16777217);
    }

    public final void b7() {
        if (this.f63691f || this.f63701s == null) {
            return;
        }
        this.f63696n = false;
        if (this.f63694i) {
            ((ku5.t0) ku5.t0.f312615d).g(new com.tencent.mm.chatroom.ui.k(this));
            return;
        }
        java.util.LinkedList linkedList = new java.util.LinkedList();
        linkedList.add(this.A);
        com.tencent.mm.pluginsdk.ui.applet.ContactListExpandPreference contactListExpandPreference = this.f63701s;
        java.lang.String str = this.A;
        boolean z17 = this.f63696n;
        r35.e2 e2Var = new r35.e2() { // from class: com.tencent.mm.chatroom.ui.ChatroomInfoUI$$a
            @Override // r35.e2
            public final void a() {
                final com.tencent.mm.chatroom.ui.ChatroomInfoUI chatroomInfoUI = com.tencent.mm.chatroom.ui.ChatroomInfoUI.this;
                boolean z18 = com.tencent.mm.chatroom.ui.ChatroomInfoUI.Y;
                chatroomInfoUI.getClass();
                ((ku5.t0) ku5.t0.f312615d).B(new java.lang.Runnable() { // from class: com.tencent.mm.chatroom.ui.ChatroomInfoUI$$d
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean z19 = com.tencent.mm.chatroom.ui.ChatroomInfoUI.Y;
                        com.tencent.mm.chatroom.ui.ChatroomInfoUI chatroomInfoUI2 = com.tencent.mm.chatroom.ui.ChatroomInfoUI.this;
                        chatroomInfoUI2.getClass();
                        r35.v1.L = r35.v1.K;
                        chatroomInfoUI2.y7();
                        chatroomInfoUI2.t7();
                        chatroomInfoUI2.l7();
                    }
                });
            }
        };
        lz.f fVar = contactListExpandPreference.M;
        if (fVar != null) {
            r35.u1 u1Var = (r35.u1) fVar;
            u1Var.f369278j = str;
            r35.v1 v1Var = u1Var.f369274f;
            v1Var.f369307z = true;
            v1Var.f369290f = linkedList;
            v1Var.F = z17;
            v1Var.f369289e = e2Var;
            u1Var.a(str);
        }
        getListView().postOnAnimation(new java.lang.Runnable() { // from class: com.tencent.mm.chatroom.ui.ChatroomInfoUI$$b
            @Override // java.lang.Runnable
            public final void run() {
                com.tencent.mm.chatroom.ui.ChatroomInfoUI chatroomInfoUI = com.tencent.mm.chatroom.ui.ChatroomInfoUI.this;
                chatroomInfoUI.getListView().smoothScrollToPositionFromTop(((com.tencent.mm.ui.base.preference.h0) chatroomInfoUI.f63693h).o("roominfo_contact_anchor"), 0, 0);
            }
        });
    }

    public final void c7() {
        if (!this.f63694i) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.kvStat(10170, "1");
            java.util.LinkedList linkedList = new java.util.LinkedList();
            linkedList.add(this.A);
            linkedList.add(c01.z1.r());
            java.lang.String c17 = com.tencent.mm.sdk.platformtools.t8.c1(linkedList, ",");
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("titile", getString(com.tencent.mm.R.string.f489933fw));
            intent.putExtra("list_type", 0);
            com.tencent.mm.ui.contact.i5.e();
            intent.putExtra("list_attr", a7(com.tencent.mm.ui.contact.i5.f206783d));
            intent.putExtra("always_select_contact", c17);
            intent.putExtra("create_group_recommend", true);
            intent.putExtra("block_contact", com.tencent.mm.sdk.platformtools.t8.J1(com.tencent.mm.ui.contact.i5.c(), ","));
            pf5.j0.a(intent, un.p0.class);
            pf5.j0.a(intent, cj5.d1.class);
            pf5.j0.a(intent, aj5.g1.class);
            pf5.j0.a(intent, aj5.i.class);
            pf5.j0.a(intent, cj5.u3.class);
            pf5.j0.a(intent, cj5.k4.class);
            pf5.j0.a(intent, cj5.s.class);
            pf5.j0.a(intent, cj5.h3.class);
            pf5.j0.a(intent, cj5.w2.class);
            pf5.j0.a(intent, cj5.l2.class);
            j45.l.u(this, ".ui.mvvm.MvvmContactListUI", intent, null);
            return;
        }
        boolean z17 = com.tencent.mm.storage.z3.N4(this.A) && !c01.e2.E(this.f63695m.d1());
        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(219L, 7L, 1L, true);
        qy.i iVar = (qy.i) i95.n0.c(qy.i.class);
        java.lang.String str = this.A;
        ((py.a) iVar).getClass();
        java.util.List m17 = c01.v1.m(str);
        java.lang.String c18 = com.tencent.mm.sdk.platformtools.t8.c1(m17, ",");
        if (m17 != null) {
            this.C = ((java.util.LinkedList) m17).size();
        }
        android.content.Intent intent2 = new android.content.Intent();
        intent2.putExtra("titile", getString(com.tencent.mm.R.string.f489934fx));
        intent2.putExtra("list_type", 1);
        com.tencent.mm.ui.contact.i5.e();
        intent2.putExtra("list_attr", a7(com.tencent.mm.ui.contact.i5.f206782c));
        intent2.putExtra("always_select_contact", c18);
        intent2.putExtra(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 3);
        intent2.putExtra("KBlockOpenImFav", z17);
        intent2.putExtra("chatroomName", this.A);
        intent2.putExtra("block_contact", com.tencent.mm.sdk.platformtools.t8.J1(com.tencent.mm.ui.contact.i5.c(), ","));
        if (z17) {
            pf5.j0.a(intent2, un.g1.class);
            pf5.j0.a(intent2, un.s0.class);
        } else {
            pf5.j0.a(intent2, un.p0.class);
            pf5.j0.a(intent2, cj5.d1.class);
        }
        pf5.j0.a(intent2, aj5.a0.class);
        pf5.j0.a(intent2, aj5.g1.class);
        pf5.j0.a(intent2, aj5.i.class);
        pf5.j0.a(intent2, cj5.u3.class);
        pf5.j0.a(intent2, cj5.k4.class);
        pf5.j0.a(intent2, cj5.s.class);
        pf5.j0.a(intent2, cj5.h3.class);
        pf5.j0.a(intent2, cj5.n3.class);
        pf5.j0.a(intent2, cj5.w2.class);
        pf5.j0.a(intent2, cj5.l2.class);
        pf5.j0.a(intent2, cj5.j.class);
        j45.l.v(this, ".ui.mvvm.MvvmContactListUI", intent2, 1);
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference
    public com.tencent.mm.ui.base.preference.h0 createAdapter(android.content.SharedPreferences sharedPreferences) {
        return new com.tencent.mm.ui.base.preference.b(this, getListView(), sharedPreferences);
    }

    @Override // pn.a
    public void d1() {
        if (!this.f63691f && this.f63701s != null) {
            if (this.f63694i) {
                y7();
            } else {
                java.util.LinkedList linkedList = new java.util.LinkedList();
                linkedList.add(this.A);
                this.f63701s.O(this.A, linkedList, this.f63696n);
            }
            this.f63701s.s();
        }
        boolean b17 = ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).b(this.A);
        if (p7()) {
            ((com.tencent.mm.ui.base.preference.h0) this.f63693h).m("room_manager_view", true);
            ((com.tencent.mm.ui.base.preference.h0) this.f63693h).m("manage_room", false);
        } else {
            ((com.tencent.mm.ui.base.preference.h0) this.f63693h).m("manage_room", true);
            ((com.tencent.mm.ui.base.preference.h0) this.f63693h).m("room_manager_view", !b17);
        }
        if (this.f63691f) {
            ((com.tencent.mm.ui.base.preference.h0) this.f63693h).m("manage_room", true);
        }
        t7();
        if (com.tencent.mm.storage.z3.q4(this.A)) {
            ((com.tencent.mm.ui.base.preference.h0) this.f63693h).m("room_manager_view", true);
        }
        ((com.tencent.mm.ui.base.preference.h0) this.f63693h).notifyDataSetChanged();
    }

    public final void d7() {
        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(219L, 8L, 1L, true);
        qy.i iVar = (qy.i) i95.n0.c(qy.i.class);
        java.lang.String str = this.A;
        ((py.a) iVar).getClass();
        java.util.List m17 = c01.v1.m(str);
        java.lang.String c17 = com.tencent.mm.sdk.platformtools.t8.c1(m17, ",");
        this.C = ((java.util.LinkedList) m17).size();
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("RoomInfo_Id", this.A);
        intent.putExtra("Is_Chatroom", true);
        intent.putExtra("Chatroom_member_list", c17);
        intent.putExtra("room_member_count", this.C);
        intent.putExtra("Is_RoomOwner", this.B);
        com.tencent.mm.ui.contact.i5.e();
        intent.putExtra("list_attr", com.tencent.mm.ui.contact.i5.f206782c);
        intent.putExtra("room_name", this.f63695m.d1());
        intent.putExtra("room_owner_name", this.F.field_roomowner);
        intent.setClass(this, com.tencent.mm.chatroom.ui.SelectDelMemberUI.class);
        startActivityForResult(intent, 7);
    }

    public final void e7(java.lang.String str) {
        java.lang.String str2;
        kn.l0.e(this.A);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(14553, 4, 2, this.A);
        long I0 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().r6(this.A).I0();
        r45.ac0 ac0Var = new r45.ac0();
        r45.du5 du5Var = new r45.du5();
        java.lang.String str3 = this.A;
        if (str3 == null) {
            str3 = "";
        }
        du5Var.f372756d = str3;
        du5Var.f372757e = true;
        ac0Var.f369912d = du5Var;
        ac0Var.f369914f = I0;
        ((e21.z0) ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).fj()).c(new xg3.p0(8, ac0Var));
        this.N = false;
        r7();
        if (this.N) {
            str2 = null;
        } else {
            str2 = ((ng0.o) ((og0.n) i95.n0.c(og0.n.class))).wi(this.f63695m.d1());
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            f7(this.A, str);
        } else {
            i7();
            db5.e1.L(this, false, getString(com.tencent.mm.R.string.kka, str2), null, getString(com.tencent.mm.R.string.fs8), getString(com.tencent.mm.R.string.i4a), new com.tencent.mm.chatroom.ui.i0(this), new com.tencent.mm.chatroom.ui.j0(this, str), -1, com.tencent.mm.R.color.f478622ch);
        }
    }

    public void f7(java.lang.String str, java.lang.String str2) {
        com.tencent.mars.xlog.Log.i("MicroMsg.ChatroomInfoUI", "delete chatroom %s", str);
        com.tencent.mars.xlog.Log.i("MicroMsg.ChatroomInfoUI", "QuitChatRoom without delete");
        com.tencent.mm.roomsdk.model.factory.a f17 = ((fd0.e) ((gd0.e) i95.n0.c(gd0.e.class))).wi(str).f(str, false);
        this.U = f17;
        f17.f192248d = new com.tencent.mm.chatroom.ui.m0(this, str, str2);
        f17.b();
    }

    @Override // l75.z0
    public void g(int i17, l75.a1 a1Var, java.lang.Object obj) {
        if (obj == null || !(obj instanceof java.lang.String)) {
            return;
        }
        onNotifyChange((java.lang.String) obj, null);
    }

    public final void g7(boolean z17, java.lang.String str) {
        java.lang.String str2 = this.A;
        if (str2 == null || str2.length() <= 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ChatroomInfoUI", "quitChatRoom : invalid args");
            return;
        }
        if (z17) {
            com.tencent.mm.autogen.events.TalkRoomServerEvent talkRoomServerEvent = new com.tencent.mm.autogen.events.TalkRoomServerEvent();
            talkRoomServerEvent.f54883g.f7584b = true;
            talkRoomServerEvent.e();
        }
        if (!((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().j0(this.A)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ChatroomInfoUI", "quitChatRoom : room[" + this.A + "] is not exist");
            return;
        }
        ((w80.i) i95.n0.c(w80.i.class)).getClass();
        ((w80.i) i95.n0.c(w80.i.class)).getClass();
        e7(str);
        fa0.q qVar = (fa0.q) i95.n0.c(fa0.q.class);
        java.lang.String str3 = this.A;
        ((fa0.t) qVar).getClass();
        ((com.tencent.mm.plugin.multitalk.model.y) i95.n0.c(com.tencent.mm.plugin.multitalk.model.y.class)).Ji(str3);
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference
    public int getResourceId() {
        return com.tencent.mm.R.xml.f494917bj;
    }

    public final void h7(int i17, java.lang.String str) {
        if (i17 != 0) {
            return;
        }
        ((w80.i) i95.n0.c(w80.i.class)).getClass();
        ((w80.i) i95.n0.c(w80.i.class)).getClass();
        e7(str);
        fa0.q qVar = (fa0.q) i95.n0.c(fa0.q.class);
        java.lang.String str2 = this.A;
        ((fa0.t) qVar).getClass();
        ((com.tencent.mm.plugin.multitalk.model.y) i95.n0.c(com.tencent.mm.plugin.multitalk.model.y.class)).Ji(str2);
    }

    public final void i7() {
        android.app.ProgressDialog progressDialog = this.f63690e;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0355  */
    @Override // com.tencent.mm.ui.MMActivity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void initView() {
        /*
            Method dump skipped, instructions count: 1048
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.chatroom.ui.ChatroomInfoUI.initView():void");
    }

    public final void j7() {
        com.tencent.mars.xlog.Log.i("MicroMsg.ChatroomInfoUI", "[doChatroomDetailCgi] :%s", this.A);
        com.tencent.mm.roomsdk.model.factory.a m17 = ((fd0.e) ((gd0.e) i95.n0.c(gd0.e.class))).wi(this.A).m(this.A);
        m17.f192246b = new com.tencent.mm.chatroom.ui.m(this);
        m17.b();
    }

    public void k7(long j17) {
        ((ku5.t0) ku5.t0.f312615d).g(new com.tencent.mm.chatroom.ui.u0(this, j17));
    }

    public final void l7() {
        if (this.X != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ChatroomInfoUI", "hideBottomCollapseMemberView");
            android.view.View view = this.X;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/chatroom/ui/ChatroomInfoUI", "hideBottomCollapseMemberView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/chatroom/ui/ChatroomInfoUI", "hideBottomCollapseMemberView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    public final void m7() {
        if (this.f63691f) {
            ((com.tencent.mm.ui.base.preference.h0) this.f63693h).m("room_name", true);
            ((com.tencent.mm.ui.base.preference.h0) this.f63693h).m("room_qr_code", true);
            ((com.tencent.mm.ui.base.preference.h0) this.f63693h).m("manage_room", true);
            ((com.tencent.mm.ui.base.preference.h0) this.f63693h).m("see_room_member", true);
            ((com.tencent.mm.ui.base.preference.h0) this.f63693h).m("expand_room_member", true);
            ((com.tencent.mm.ui.base.preference.h0) this.f63693h).m("collapse_room_member", true);
            ((com.tencent.mm.ui.base.preference.h0) this.f63693h).m("room_card", true);
            ((com.tencent.mm.ui.base.preference.h0) this.f63693h).m("room_upgrade_entry", true);
            ((com.tencent.mm.ui.base.preference.h0) this.f63693h).m("chatroom_info_chexboxes", true);
            ((un.p) component(un.p.class)).h7(this.D, this.f63691f);
            ((com.tencent.mm.ui.base.preference.h0) this.f63693h).m("room_nickname", true);
            ((com.tencent.mm.ui.base.preference.h0) this.f63693h).m("room_openim_about", true);
            ((com.tencent.mm.ui.base.preference.h0) this.f63693h).m("roominfo_contact_anchor_small_category", true);
            ((com.tencent.mm.ui.base.preference.h0) this.f63693h).m("room_clear_chatting_history", true);
            setMMTitle(getString(com.tencent.mm.R.string.f492887i50));
        }
    }

    public final boolean n7() {
        return !(com.tencent.mm.sdk.platformtools.t8.P(((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("WeComWatchMemberEntry"), 0) == 1) && c01.e2.E(this.A);
    }

    public final boolean o7() {
        com.tencent.mm.storage.z3 z3Var = this.f63695m;
        if (z3Var != null) {
            if (this.f63694i) {
                this.D = z3Var.T == 0;
            } else {
                this.D = c01.e2.P(z3Var);
            }
        }
        return this.D;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        java.lang.String stringExtra;
        super.onActivityResult(i17, i18, intent);
        if (i17 == 1) {
            if (i18 != -1) {
                ((y04.e) ((vg3.j4) i95.n0.c(vg3.j4.class))).wi(3);
                return;
            } else {
                if (intent == null) {
                    return;
                }
                this.T = new pn.m(this, this.A, intent.getStringExtra("Select_Contact"), (com.tencent.mm.chatroom.ui.ChatroomInfoUI.LocalHistoryInfo) intent.getParcelableExtra("select_record_msg_info"), intent.getLongExtra("select_record_fake_msg_id", 0L), this);
                return;
            }
        }
        if (i17 == 2) {
            if (i18 == -1) {
                finish();
                return;
            }
            return;
        }
        if (i17 == 4) {
            if (i18 == -1) {
                java.lang.String stringExtra2 = intent.getStringExtra("room_name");
                if (com.tencent.mm.sdk.platformtools.t8.K0(stringExtra2)) {
                    return;
                }
                new com.tencent.mm.autogen.events.UpdateSearchIndexAtOnceEvent().e();
                this.f63695m.M1(stringExtra2);
                ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().l0(this.f63695m);
                x7();
                return;
            }
            return;
        }
        if (i17 != 5) {
            if (i17 == 6) {
                if (i18 == -1) {
                    w7();
                    return;
                }
                return;
            }
            if (i17 == 7) {
                if (intent == null || (stringExtra = intent.getStringExtra("Select_Contact")) == null || stringExtra.equals("")) {
                    return;
                }
                com.tencent.mm.roomsdk.model.factory.a b17 = ((fd0.e) ((gd0.e) i95.n0.c(gd0.e.class))).wi(this.A).b(this.A, com.tencent.mm.sdk.platformtools.t8.P1(stringExtra.split(",")), 0);
                b17.f192246b = new com.tencent.mm.chatroom.ui.n0(this);
                b17.f192247c = new com.tencent.mm.chatroom.ui.o0(this);
                b17.c(this, getString(com.tencent.mm.R.string.f490573yv), getString(com.tencent.mm.R.string.i4_), true, true, new com.tencent.mm.chatroom.ui.p0(this, b17));
                return;
            }
            if (i17 == 10) {
                if (intent != null && intent.getBooleanExtra("dismiss_chatroom", false)) {
                    finish();
                    return;
                }
                return;
            }
            if (i17 == 132412 && intent != null) {
                java.lang.String stringExtra3 = intent.getStringExtra("intent_key_invitation_reason");
                pn.m mVar = this.T;
                if (mVar != null) {
                    mVar.b(stringExtra3 != null ? stringExtra3 : "", com.tencent.mm.R.string.g2b);
                }
            }
        }
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        com.tencent.mm.pluginsdk.ui.applet.ContactListExpandPreference contactListExpandPreference;
        super.onConfigurationChanged(configuration);
        if (this.f63691f || (contactListExpandPreference = this.f63701s) == null) {
            return;
        }
        contactListExpandPreference.s();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0174  */
    @Override // com.tencent.mm.ui.base.preference.MMPreference, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r9) {
        /*
            Method dump skipped, instructions count: 429
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.chatroom.ui.ChatroomInfoUI.onCreate(android.os.Bundle):void");
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        com.tencent.mm.pluginsdk.ui.applet.ContactListExpandPreference contactListExpandPreference;
        if (!this.f63691f && (contactListExpandPreference = this.f63701s) != null) {
            contactListExpandPreference.getClass();
        }
        if (p21.l.a() != null) {
            ((dh4.t) p21.l.a()).a(this);
        }
        gm0.j1.u().c().e(this);
        zg5.a.b();
        gm0.j1.n().f273288b.q(480, this);
        this.R.dead();
        this.S.dead();
        if (gm0.j1.a()) {
            ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().e(this);
            ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().remove(this);
        }
        if (p21.l.a() != null) {
            ((dh4.t) p21.l.a()).f(this);
        }
        com.tencent.mm.sdk.platformtools.b4 b4Var = this.V;
        if (b4Var != null) {
            b4Var.d();
        }
        r35.v1.L = r35.v1.K;
        this.f63696n = false;
        super.onDestroy();
    }

    @Override // l75.q0
    public void onNotifyChange(java.lang.String str, l75.w0 w0Var) {
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str) && com.tencent.mm.storage.z3.R4(str)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ChatroomInfoUI", "onNotifyChange event:" + str);
            if (this.f63694i && str.equals(this.A)) {
                gm0.j1.e().j(new com.tencent.mm.chatroom.ui.w0(this));
            }
            d1();
        }
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        com.tencent.mm.storage.a3 a3Var;
        super.onPause();
        if (this.E && this.f63694i && (a3Var = this.F) != null) {
            java.lang.String str = this.A;
            boolean z17 = this.f63708z;
            java.util.Map map = c01.v1.f37519a;
            a3Var.field_isShowname = z17 ? 1 : 0;
            ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().update(a3Var, new java.lang.String[0]);
            java.lang.String r17 = c01.z1.r();
            ((fd0.e) ((gd0.e) i95.n0.c(gd0.e.class))).wi(str).d(str, r17, z17).b();
            r45.pn4 pn4Var = new r45.pn4();
            pn4Var.f383228d = str;
            pn4Var.f383229e = r17;
            pn4Var.f383230f = 1;
            pn4Var.f383231g = z17 ? 1 : 2;
            ((e21.z0) ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).fj()).c(new xg3.p0(49, pn4Var));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x011e  */
    @Override // com.tencent.mm.ui.base.preference.MMPreference
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onPreferenceTreeClick(com.tencent.mm.ui.base.preference.r r36, com.tencent.mm.ui.base.preference.Preference r37) {
        /*
            Method dump skipped, instructions count: 3145
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.chatroom.ui.ChatroomInfoUI.onPreferenceTreeClick(com.tencent.mm.ui.base.preference.r, com.tencent.mm.ui.base.preference.Preference):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0191  */
    @Override // com.tencent.mm.ui.base.preference.MMPreference, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onResume() {
        /*
            Method dump skipped, instructions count: 438
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.chatroom.ui.ChatroomInfoUI.onResume():void");
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.ChatroomInfoUI", "onSceneEnd: errType = " + i17 + " errCode = " + i18 + " errMsg = " + str + " type = " + m1Var.getType());
        this.C = ((py.a) ((qy.i) i95.n0.c(qy.i.class))).wi(this.A);
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.component.UIComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z17) {
        super.onWindowFocusChanged(z17);
    }

    public final boolean p7() {
        com.tencent.mm.storage.a3 a3Var = this.F;
        return a3Var != null && a3Var.P0();
    }

    public final void q7() {
        if (r35.v1.L <= r35.v1.K) {
            return;
        }
        if (this.X == null) {
            this.X = android.view.LayoutInflater.from(this).inflate(com.tencent.mm.R.layout.e0l, (android.view.ViewGroup) null);
            android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) findViewById(com.tencent.mm.R.id.jlw);
            android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-1, -2);
            layoutParams.addRule(12);
            relativeLayout.addView(this.X, layoutParams);
            this.X.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.tencent.mm.chatroom.ui.ChatroomInfoUI$$e
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    boolean z17 = com.tencent.mm.chatroom.ui.ChatroomInfoUI.Y;
                    com.tencent.mm.chatroom.ui.ChatroomInfoUI chatroomInfoUI = com.tencent.mm.chatroom.ui.ChatroomInfoUI.this;
                    chatroomInfoUI.getClass();
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    arrayList.add(view);
                    java.lang.Object[] array = arrayList.toArray();
                    arrayList.clear();
                    yj0.a.b("com/tencent/mm/chatroom/ui/ChatroomInfoUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", chatroomInfoUI, array);
                    chatroomInfoUI.b7();
                    yj0.a.h(chatroomInfoUI, "com/tencent/mm/chatroom/ui/ChatroomInfoUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                }
            });
        }
        if (this.X != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ChatroomInfoUI", "showBottomCollapseMemberView");
            android.view.View view = this.X;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/chatroom/ui/ChatroomInfoUI", "showBottomCollapseMemberView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/chatroom/ui/ChatroomInfoUI", "showBottomCollapseMemberView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.X.post(new java.lang.Runnable() { // from class: com.tencent.mm.chatroom.ui.ChatroomInfoUI$$f
                @Override // java.lang.Runnable
                public final void run() {
                    com.tencent.mm.chatroom.ui.ChatroomInfoUI chatroomInfoUI = com.tencent.mm.chatroom.ui.ChatroomInfoUI.this;
                    chatroomInfoUI.X.requestLayout();
                    chatroomInfoUI.X.invalidate();
                }
            });
        }
    }

    public final void r7() {
        android.app.ProgressDialog progressDialog = this.f63690e;
        if (progressDialog == null) {
            this.f63690e = db5.e1.Q(this, getString(com.tencent.mm.R.string.f490573yv), getString(com.tencent.mm.R.string.f490604zq), true, false, new com.tencent.mm.chatroom.ui.k0(this));
        } else {
            progressDialog.show();
        }
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference, com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity
    public void superImportUIComponents(java.util.HashSet hashSet) {
        super.superImportUIComponents(hashSet);
        hashSet.add(sn.a.class);
        hashSet.add(un.p.class);
        hashSet.add(un.l.class);
    }

    public final void t7() {
        boolean z17 = (!p7() && this.C > r35.v1.K) || (p7() && this.C > r35.v1.K - 1);
        if (j62.e.g().c(new com.tencent.mm.repairer.config.profile.RepairerConfigChatroomInfoSearch()) != 1) {
            if (!z17) {
                ((com.tencent.mm.ui.base.preference.h0) this.f63693h).m("see_room_member", true);
                ((com.tencent.mm.ui.base.preference.h0) this.f63693h).m("expand_room_member", true);
                ((com.tencent.mm.ui.base.preference.h0) this.f63693h).m("collapse_room_member", true);
                return;
            } else {
                ((com.tencent.mm.ui.base.preference.h0) this.f63693h).m("see_room_member", this.f63691f);
                ((com.tencent.mm.ui.base.preference.h0) this.f63693h).m("expand_room_member", true);
                ((com.tencent.mm.ui.base.preference.h0) this.f63693h).m("collapse_room_member", true);
                this.f63700r.L(getString(com.tencent.mm.R.string.iee));
                return;
            }
        }
        ((com.tencent.mm.ui.base.preference.h0) this.f63693h).m("see_room_member", true);
        if (!z17 || this.f63691f) {
            ((com.tencent.mm.ui.base.preference.h0) this.f63693h).m("expand_room_member", true);
            ((com.tencent.mm.ui.base.preference.h0) this.f63693h).m("collapse_room_member", true);
        } else if (r35.v1.L > r35.v1.K) {
            ((com.tencent.mm.ui.base.preference.h0) this.f63693h).m("expand_room_member", true);
            ((com.tencent.mm.ui.base.preference.h0) this.f63693h).m("collapse_room_member", false);
        } else {
            ((com.tencent.mm.ui.base.preference.h0) this.f63693h).m("expand_room_member", false);
            ((com.tencent.mm.ui.base.preference.h0) this.f63693h).m("collapse_room_member", true);
        }
    }

    public final void u7() {
        this.f63695m = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(this.A, true);
        ((un.p) component(un.p.class)).f429273d = this.f63695m;
    }

    public final void v7() {
        if (this.f63707y == null) {
            this.f63707y = getSharedPreferences(getPackageName() + "_preferences", 0);
        }
        com.tencent.mm.storage.z3 z3Var = this.f63695m;
        if (z3Var != null) {
            if (this.f63694i) {
                this.D = z3Var.T == 0;
            } else {
                this.D = c01.e2.P(z3Var);
            }
        }
        java.lang.String string = this.D ? getResources().getString(com.tencent.mm.R.string.blb) : "";
        androidx.appcompat.app.AppCompatActivity activity = getContext();
        kotlin.jvm.internal.o.g(activity, "activity");
        ((sn.a) pf5.z.f353948a.a(activity).a(sn.a.class)).setValue("is_mute", string);
        if (this.D) {
            setTitleMuteIconVisibility(0);
            if (this.f63702t != null) {
                this.f63707y.edit().putBoolean("room_notify_new_msg", true).commit();
            }
        } else {
            setTitleMuteIconVisibility(8);
            if (this.f63702t != null) {
                this.f63707y.edit().putBoolean("room_notify_new_msg", false).commit();
            }
        }
        if (c01.v1.v()) {
            ((un.p) component(un.p.class)).h7(this.D, this.f63691f);
        } else {
            z7(this.D);
        }
        ((un.p) component(un.p.class)).b7(this.D);
        ((com.tencent.mm.ui.base.preference.h0) this.f63693h).notifyDataSetChanged();
    }

    public final void w7() {
        if (this.f63695m == null || this.f63698p == null) {
            return;
        }
        java.lang.String d17 = c01.v1.d(this.A);
        if (d17 == null || d17.length() <= 0) {
            this.f63698p.R = false;
        } else {
            com.tencent.mm.chatroom.ui.preference.RoomCardPreference roomCardPreference = this.f63698p;
            roomCardPreference.R = true;
            ((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).getClass();
            roomCardPreference.N = com.tencent.mm.pluginsdk.ui.span.c0.i(this, d17);
        }
        u7();
        java.lang.String P0 = this.f63695m.P0();
        if (!com.tencent.mm.sdk.platformtools.t8.K0(P0) && P0.length() <= 50) {
            java.lang.String g27 = this.f63695m.g2();
            com.tencent.mm.chatroom.ui.preference.RoomCardPreference roomCardPreference2 = this.f63698p;
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            if (g27.length() <= 0) {
                g27 = getString(com.tencent.mm.R.string.iy8);
            }
            ((ke0.e) xVar).getClass();
            roomCardPreference2.M = com.tencent.mm.pluginsdk.ui.span.c0.i(this, g27);
        } else {
            this.f63698p.M = getString(com.tencent.mm.R.string.i4x);
        }
        ((com.tencent.mm.ui.base.preference.h0) this.f63693h).notifyDataSetChanged();
    }

    public final void x7() {
        if (this.f63695m == null || this.f63699q == null) {
            return;
        }
        u7();
        java.lang.String P0 = this.f63695m.P0();
        if (!(!com.tencent.mm.sdk.platformtools.t8.K0(P0) && P0.length() <= 50)) {
            this.f63699q.H(getString(com.tencent.mm.R.string.i4x));
            return;
        }
        java.lang.String f27 = this.f63695m.f2();
        com.tencent.mm.ui.base.preference.Preference preference = this.f63699q;
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        if (f27.length() <= 0) {
            f27 = getString(com.tencent.mm.R.string.iy8);
        }
        ((ke0.e) xVar).getClass();
        preference.H(com.tencent.mm.pluginsdk.ui.span.c0.i(this, f27));
        com.tencent.mm.ui.base.preference.r rVar = this.f63693h;
        if (rVar != null) {
            ((com.tencent.mm.ui.base.preference.h0) rVar).notifyDataSetChanged();
        }
    }

    public final void y7() {
        if (this.f63691f || this.f63701s == null) {
            return;
        }
        if (this.f63694i) {
            ((ku5.t0) ku5.t0.f312615d).g(new com.tencent.mm.chatroom.ui.i(this));
        } else {
            java.util.LinkedList linkedList = new java.util.LinkedList();
            linkedList.add(this.A);
            this.f63701s.O(this.A, linkedList, this.f63696n);
        }
    }

    public final void z7(boolean z17) {
        if (!com.tencent.mm.storage.z3.N4(this.A)) {
            ((com.tencent.mm.ui.base.preference.h0) this.f63693h).m("room_special_follow_member", true);
            ((un.p) component(un.p.class)).Y6(true);
            return;
        }
        if (n7()) {
            ((com.tencent.mm.ui.base.preference.h0) this.f63693h).m("room_special_follow_member", true);
            ((un.p) component(un.p.class)).Y6(true);
            return;
        }
        if (this.f63691f) {
            ((com.tencent.mm.ui.base.preference.h0) this.f63693h).m("room_special_follow_member", true);
        } else {
            ((com.tencent.mm.ui.base.preference.h0) this.f63693h).m("room_special_follow_member", !z17);
        }
        ((un.p) component(un.p.class)).Y6(!z17);
        if (!z17 || this.L) {
            return;
        }
        this.L = true;
        com.tencent.mm.autogen.mmdata.rpt.ChatSpecialAttentionLogStruct chatSpecialAttentionLogStruct = new com.tencent.mm.autogen.mmdata.rpt.ChatSpecialAttentionLogStruct();
        chatSpecialAttentionLogStruct.f55663d = 1;
        chatSpecialAttentionLogStruct.f55664e = chatSpecialAttentionLogStruct.b("roomUsername", this.A, true);
        chatSpecialAttentionLogStruct.k();
    }
}

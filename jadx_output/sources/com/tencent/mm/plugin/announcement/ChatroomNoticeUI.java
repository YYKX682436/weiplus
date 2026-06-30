package com.tencent.mm.plugin.announcement;

@db5.a(512)
/* loaded from: classes12.dex */
public class ChatroomNoticeUI extends com.tencent.mm.plugin.component.editor.EditorUI implements com.tencent.mm.modelbase.u0 {

    /* renamed from: p1, reason: collision with root package name */
    public static final /* synthetic */ int f74675p1 = 0;
    public java.lang.String K;
    public java.lang.String L;
    public int M;
    public android.widget.LinearLayout N;
    public android.view.View P;
    public gh5.a Q;
    public boolean R;
    public boolean S;
    public java.lang.String T;
    public java.lang.String U;
    public java.lang.String V;
    public long W;
    public com.tencent.mm.ui.widget.dialog.u3 X;

    /* renamed from: x0, reason: collision with root package name */
    public boolean f74678x0;
    public boolean Y = false;
    public int Z = 0;

    /* renamed from: p0, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f74677p0 = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.RevokeMsgEvent>(this) { // from class: com.tencent.mm.plugin.announcement.ChatroomNoticeUI.1
        {
            this.__eventId = 675629679;
        }

        @Override // com.tencent.mm.sdk.event.IListener
        public boolean callback(com.tencent.mm.autogen.events.RevokeMsgEvent revokeMsgEvent) {
            java.util.Map d17;
            com.tencent.mm.autogen.events.RevokeMsgEvent revokeMsgEvent2 = revokeMsgEvent;
            if (!com.tencent.mm.sdk.platformtools.t8.K0(revokeMsgEvent2.f54713g.f6399f)) {
                com.tencent.mm.plugin.announcement.ChatroomNoticeUI chatroomNoticeUI = com.tencent.mm.plugin.announcement.ChatroomNoticeUI.this;
                if (!chatroomNoticeUI.Y && (d17 = com.tencent.mm.sdk.platformtools.aa.d(chatroomNoticeUI.U, "favitem", null)) != null && revokeMsgEvent2.f54713g.f6399f.equalsIgnoreCase((java.lang.String) d17.get(".favitem.announcement_id"))) {
                    android.content.Intent intent = chatroomNoticeUI.getIntent();
                    intent.putExtra("annoucement_revoke", true);
                    com.tencent.mm.plugin.announcement.ChatroomNoticeUI chatroomNoticeUI2 = com.tencent.mm.plugin.announcement.ChatroomNoticeUI.this;
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    arrayList.add(intent);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(chatroomNoticeUI2, arrayList.toArray(), "com/tencent/mm/plugin/announcement/ChatroomNoticeUI$1", "callback", "(Lcom/tencent/mm/autogen/events/RevokeMsgEvent;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    chatroomNoticeUI2.startActivity((android.content.Intent) arrayList.get(0));
                    yj0.a.f(chatroomNoticeUI2, "com/tencent/mm/plugin/announcement/ChatroomNoticeUI$1", "callback", "(Lcom/tencent/mm/autogen/events/RevokeMsgEvent;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                }
            }
            return false;
        }
    };

    /* renamed from: y0, reason: collision with root package name */
    public java.lang.Boolean f74679y0 = null;

    /* renamed from: l1, reason: collision with root package name */
    public java.lang.String f74676l1 = null;

    public static void m7(com.tencent.mm.plugin.announcement.ChatroomNoticeUI chatroomNoticeUI) {
        androidx.core.widget.NestedScrollView nestedScrollView = (androidx.core.widget.NestedScrollView) chatroomNoticeUI.findViewById(com.tencent.mm.R.id.f482256i);
        nestedScrollView.s(0 - nestedScrollView.getScrollX(), chatroomNoticeUI.N.getHeight() - nestedScrollView.getScrollY(), 100, false);
        nestedScrollView.postDelayed(new com.tencent.mm.plugin.announcement.g(chatroomNoticeUI, nestedScrollView), 100L);
        chatroomNoticeUI.updateOptionMenuText(0, chatroomNoticeUI.getString(com.tencent.mm.R.string.f490441v5));
        chatroomNoticeUI.updateOptionMenuStyle(0, com.tencent.mm.ui.fb.GREEN);
        chatroomNoticeUI.enableOptionMenu(false);
        chatroomNoticeUI.r7(3);
    }

    @Override // com.tencent.mm.plugin.component.editor.EditorUI, mx1.a
    public void U3() {
        enableOptionMenu(0, true);
        this.f74678x0 = true;
    }

    @Override // com.tencent.mm.plugin.component.editor.EditorUI
    public long X6() {
        return 4580249617L;
    }

    @Override // com.tencent.mm.plugin.component.editor.EditorUI
    public r45.jq0 Y6(o72.r2 r2Var) {
        java.lang.String r17 = c01.z1.r();
        r45.jq0 jq0Var = new r45.jq0();
        jq0Var.e(r17);
        jq0Var.j(this.K);
        jq0Var.g(r2Var.field_sourceType);
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        jq0Var.c(java.lang.System.currentTimeMillis());
        jq0Var.i(n7());
        return jq0Var;
    }

    @Override // com.tencent.mm.plugin.component.editor.EditorUI, mx1.a
    public void b5() {
        hideVKB();
        super.b5();
    }

    @Override // com.tencent.mm.plugin.component.editor.EditorUI
    public void b7(java.lang.String str, java.lang.String str2, boolean z17) {
        this.T = str;
        java.lang.String replace = str2.replace("<favitem", "<group_notice_item");
        this.U = replace;
        this.U = replace.replace("favitem>", "group_notice_item>");
        com.tencent.mars.xlog.Log.i("MicroMsg.ChatroomNoticeUI", "onContentSave. digest:%b, content:%b, isPureText:%b", java.lang.Boolean.valueOf(com.tencent.mm.sdk.platformtools.t8.K0(str)), java.lang.Boolean.valueOf(com.tencent.mm.sdk.platformtools.t8.K0(str2)), java.lang.Boolean.valueOf(z17));
        r45.v16 v16Var = new r45.v16();
        v16Var.f387806d = this.K;
        v16Var.f387807e = this.T;
        v16Var.f387809g = this.U;
        v16Var.f387812m = z17 ? 1 : 0;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70667d = uc1.z1.CTRL_INDEX;
        lVar.f70666c = "/cgi-bin/micromsg-bin/setchatroomannouncement";
        lVar.f70664a = v16Var;
        lVar.f70665b = new r45.w16();
        com.tencent.mm.modelbase.o a17 = lVar.a();
        com.tencent.mm.modelbase.i iVar = new com.tencent.mm.modelbase.i();
        iVar.p(a17);
        iVar.l().f(this).h(new com.tencent.mm.plugin.announcement.b(this));
    }

    @Override // com.tencent.mm.plugin.component.editor.EditorUI, mx1.a
    public void d5(int i17) {
        super.d5(i17);
        enableOptionMenu(0, true);
        this.f74678x0 = true;
    }

    @Override // com.tencent.mm.plugin.component.editor.EditorUI, kx1.a
    public void f3(android.widget.TextView textView) {
        gm0.j1.i();
        android.os.Bundle a17 = com.tencent.mm.pluginsdk.ui.span.m1.a(true, k01.d.a(((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(this.K, true).d1()));
        a17.putInt("geta8key_scene", 31);
        a17.putString("geta8key_username", this.K);
        a17.putString("msgUsername", this.V);
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        le0.r rVar = le0.x.P0;
        ((ke0.e) xVar).getClass();
        java.util.LinkedList linkedList = com.tencent.mm.pluginsdk.ui.span.c0.f191191a;
        if (textView == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MMSpanManager", "spanForTextView, textView cannot be null!");
            new android.text.SpannableString("");
            return;
        }
        android.content.Context context = textView.getContext();
        int textSize = (int) textView.getTextSize();
        com.tencent.mm.pluginsdk.ui.span.j1 j1Var = new com.tencent.mm.pluginsdk.ui.span.j1(context);
        j1Var.f191230i = true;
        j1Var.f191226e = true;
        j1Var.f191227f = true;
        j1Var.f191229h = com.tencent.mm.pluginsdk.ui.span.c0.d();
        j1Var.f191246y = 1;
        j1Var.f191231j = true;
        j1Var.f191234m = false;
        j1Var.B = true;
        j1Var.g(textView);
        j1Var.H = a17;
        j1Var.C = null;
        j1Var.f191232k = true;
        j1Var.f191235n = true;
        ((le0.v) rVar).a(context, j1Var);
        j1Var.e(textView.getText(), textSize, true);
    }

    @Override // com.tencent.mm.plugin.component.editor.EditorUI, com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.f488412sl;
    }

    @Override // com.tencent.mm.plugin.component.editor.EditorUI, mx1.a
    public void i0(int i17, int i18) {
        super.i0(i17, i18);
        enableOptionMenu(0, true);
        this.f74678x0 = true;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        super.initView();
        setMMTitle(com.tencent.mm.R.string.i5r);
        setNavigationbarColor(getResources().getColor(com.tencent.mm.R.color.aaw));
        getWindow().setBackgroundDrawable(new android.graphics.drawable.ColorDrawable(getResources().getColor(com.tencent.mm.R.color.aaw)));
        addTextOptionMenu(0, getString(com.tencent.mm.R.string.f490381te), new com.tencent.mm.plugin.announcement.h(this), null, com.tencent.mm.ui.fb.BLACK);
        gm0.j1.i();
        com.tencent.mm.pluginsdk.ui.span.m1.a(true, k01.d.a(((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(this.K, true).d1())).putInt("geta8key_scene", 31);
        boolean p76 = p7();
        boolean booleanExtra = getIntent().getBooleanExtra("room_notice_reedit", false);
        boolean z17 = this.R;
        if ((!z17 && !this.S) || (!p76 && !booleanExtra)) {
            if (!z17 && !this.S && p76) {
                android.view.View findViewById = findViewById(com.tencent.mm.R.id.m76);
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/announcement/ChatroomNoticeUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(findViewById, "com/tencent/mm/plugin/announcement/ChatroomNoticeUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            removeOptionMenu(0);
        }
        final androidx.core.widget.NestedScrollView nestedScrollView = (androidx.core.widget.NestedScrollView) findViewById(com.tencent.mm.R.id.f482256i);
        final android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.f482435ei);
        if (nestedScrollView != null && findViewById2 != null) {
            nestedScrollView.post(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.announcement.ChatroomNoticeUI$$b
                @Override // java.lang.Runnable
                public final void run() {
                    int i17 = com.tencent.mm.plugin.announcement.ChatroomNoticeUI.f74675p1;
                    int[] iArr = new int[2];
                    androidx.core.widget.NestedScrollView nestedScrollView2 = androidx.core.widget.NestedScrollView.this;
                    nestedScrollView2.getLocationOnScreen(iArr);
                    int i18 = iArr[1];
                    int[] iArr2 = new int[2];
                    android.view.View view = findViewById2;
                    view.getLocationOnScreen(iArr2);
                    int height = iArr2[1] + view.getHeight();
                    if (i18 < height) {
                        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) nestedScrollView2.getLayoutParams();
                        marginLayoutParams.topMargin = height - i18;
                        nestedScrollView2.setLayoutParams(marginLayoutParams);
                    }
                }
            });
        }
        if (booleanExtra) {
            ((ku5.t0) ku5.t0.f312615d).q(new com.tencent.mm.plugin.announcement.i(this));
        }
        this.N = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.gyx);
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.T)) {
            this.N.setVisibility(8);
        } else {
            android.widget.TextView textView = (android.widget.TextView) this.N.findViewById(com.tencent.mm.R.id.kfj);
            if (this.W != 0) {
                textView.setVisibility(0);
                textView.setText(k35.m1.d("yyyy-MM-dd HH:mm", this.W));
            } else {
                textView.setVisibility(8);
            }
            android.widget.TextView textView2 = (android.widget.TextView) this.N.findViewById(com.tencent.mm.R.id.kfe);
            tg3.v0 v0Var = (tg3.v0) i95.n0.c(tg3.v0.class);
            java.lang.String str = this.V;
            ((sg3.a) v0Var).getClass();
            java.lang.String e17 = c01.a2.e(str);
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            float textSize = textView2.getTextSize();
            ((ke0.e) xVar).getClass();
            textView2.setText(com.tencent.mm.pluginsdk.ui.span.c0.j(this, e17, textSize));
            android.widget.ImageView imageView = (android.widget.ImageView) this.N.findViewById(com.tencent.mm.R.id.kfd);
            java.lang.String str2 = this.V;
            if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
                imageView.setImageResource(com.tencent.mm.R.drawable.bhm);
            } else {
                ((com.tencent.mm.feature.avatar.w) ((kv.z) i95.n0.c(kv.z.class))).Ai(imageView, str2, null);
            }
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.T) && com.tencent.mm.sdk.platformtools.t8.K0(this.U)) {
            updateOptionMenuText(0, getContext().getString(com.tencent.mm.R.string.f490441v5));
            updateOptionMenuStyle(0, com.tencent.mm.ui.fb.GREEN);
            if (this.f74678x0) {
                enableOptionMenu(true);
            } else {
                enableOptionMenu(false);
            }
        }
        ((ku5.t0) ku5.t0.f312615d).a(new com.tencent.mm.plugin.announcement.k(this));
        this.P = findViewById(com.tencent.mm.R.id.c2m);
        final androidx.core.widget.NestedScrollView nestedScrollView2 = (androidx.core.widget.NestedScrollView) findViewById(com.tencent.mm.R.id.f482256i);
        getWindow().getDecorView().post(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.announcement.ChatroomNoticeUI$$a
            @Override // java.lang.Runnable
            public final void run() {
                int i17 = com.tencent.mm.plugin.announcement.ChatroomNoticeUI.f74675p1;
                com.tencent.mm.plugin.announcement.ChatroomNoticeUI chatroomNoticeUI = com.tencent.mm.plugin.announcement.ChatroomNoticeUI.this;
                android.view.View decorView = chatroomNoticeUI.getWindow().getDecorView();
                java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
                n3.g3 a17 = n3.b1.a(decorView);
                chatroomNoticeUI.Z = a17 != null ? a17.f334338a.h(2).f247047d : 0;
                androidx.core.widget.NestedScrollView nestedScrollView3 = nestedScrollView2;
                if (nestedScrollView3 != null) {
                    nestedScrollView3.setPadding(nestedScrollView3.getPaddingLeft(), nestedScrollView3.getPaddingTop(), nestedScrollView3.getPaddingRight(), chatroomNoticeUI.Z);
                }
            }
        });
        this.Q = new com.tencent.mm.plugin.announcement.l(this);
        gh5.b a17 = gh5.d.a(this);
        a17.f271978i = 1;
        android.view.View view = this.P;
        if (view != null) {
            a17.f271975f.addIfAbsent(new java.lang.ref.WeakReference(view));
        }
        a17.f(this.Q);
    }

    @Override // com.tencent.mm.plugin.component.editor.EditorUI, mx1.a
    public void j3(int i17, long j17) {
        super.j3(i17, j17);
        enableOptionMenu(0, true);
        this.f74678x0 = true;
    }

    public final java.lang.String n7() {
        if (this.f74676l1 == null) {
            this.f74676l1 = kk.k.g((c01.z1.r() + this.K + java.lang.System.currentTimeMillis()).getBytes());
        }
        return this.f74676l1;
    }

    public final void o7() {
        if (!this.R && !this.S) {
            setResult(0);
            finish();
            return;
        }
        if (!this.f74678x0) {
            setResult(0);
            finish();
            return;
        }
        com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(this);
        u1Var.g(getString(com.tencent.mm.R.string.i3s));
        u1Var.m(com.tencent.mm.R.string.i3u);
        u1Var.l(new com.tencent.mm.plugin.announcement.a(this));
        u1Var.j(getString(com.tencent.mm.R.string.i3t));
        u1Var.i(new com.tencent.mm.plugin.announcement.p(this));
        u1Var.q(false);
    }

    @Override // com.tencent.mm.plugin.component.editor.EditorUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        long j17;
        this.K = getIntent().getStringExtra("RoomInfo_Id");
        this.T = getIntent().getStringExtra("room_notice");
        java.lang.String stringExtra = getIntent().getStringExtra("room_notice_xml");
        this.U = stringExtra;
        if (com.tencent.mm.sdk.platformtools.t8.K0(stringExtra)) {
            this.U = this.T;
        }
        java.lang.String str = this.U;
        if (str == null) {
            str = "";
        }
        this.U = str;
        this.V = getIntent().getStringExtra("room_notice_editor");
        this.W = getIntent().getLongExtra("room_notice_publish_time", 0L);
        this.L = getIntent().getStringExtra("room_name");
        this.M = getIntent().getIntExtra("room_member_count", 0);
        this.R = getIntent().getBooleanExtra("Is_RoomOwner", false);
        this.S = getIntent().getBooleanExtra("Is_RoomManager", false);
        getIntent().putExtra("KEY_EDITABLE", com.tencent.mm.sdk.platformtools.t8.K0(this.U));
        java.lang.String replace = this.U.replace("<group_notice_item", "<favitem");
        this.U = replace;
        this.U = replace.replace("group_notice_item>", "favitem>");
        getIntent().putExtra("KEY_CONTENT_XML", this.U);
        getIntent().putExtra("KEY_CONTENT_PURE_TEXT", !this.U.trim().startsWith("<favitem"));
        super.onCreate(bundle);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(219L, 0L, 1L, true);
        initView();
        setBackBtn(new com.tencent.mm.plugin.announcement.m(this));
        if (getF65848t()) {
            getSwipeBackLayout().setEnableGesture(false);
        }
        com.tencent.mm.autogen.mmdata.rpt.ViewRoomDescTipsStruct viewRoomDescTipsStruct = new com.tencent.mm.autogen.mmdata.rpt.ViewRoomDescTipsStruct();
        viewRoomDescTipsStruct.f61634d = viewRoomDescTipsStruct.b("ChatName", this.K, true);
        viewRoomDescTipsStruct.f61636f = this.M;
        boolean z17 = this.R;
        if (z17) {
            j17 = 1;
        } else {
            j17 = z17 ? 2 : 0;
        }
        viewRoomDescTipsStruct.f61635e = j17;
        viewRoomDescTipsStruct.f61638h = viewRoomDescTipsStruct.b("NoticeId", "" + this.W, true);
        viewRoomDescTipsStruct.f61637g = 1L;
        viewRoomDescTipsStruct.k();
        this.f74677p0.alive();
    }

    @Override // com.tencent.mm.plugin.component.editor.EditorUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.Q = null;
        com.tencent.mm.ui.widget.dialog.u3 u3Var = this.X;
        if (u3Var == null || !u3Var.isShowing()) {
            return;
        }
        this.X.dismiss();
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() != 4) {
            super.onKeyDown(i17, keyEvent);
            return false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ChatroomNoticeUI", "press back.");
        o7();
        return true;
    }

    @Override // com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onNewIntent(android.content.Intent intent) {
        super.onNewIntent(intent);
        if (getIntent().getBooleanExtra("annoucement_revoke", false)) {
            db5.e1.E(this, getString(com.tencent.mm.R.string.f490001i3), null, getString(com.tencent.mm.R.string.f490507x1), false, new com.tencent.mm.plugin.announcement.n(this));
        }
    }

    @Override // com.tencent.mm.plugin.component.editor.EditorUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        androidx.core.widget.NestedScrollView nestedScrollView;
        super.onResume();
        android.view.View decorView = getWindow().getDecorView();
        java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
        n3.g3 a17 = n3.b1.a(decorView);
        int i17 = a17 != null ? a17.f334338a.h(2).f247047d : 0;
        if (i17 != this.Z) {
            this.Z = i17;
            if (gh5.d.b(this) || (nestedScrollView = (androidx.core.widget.NestedScrollView) findViewById(com.tencent.mm.R.id.f482256i)) == null) {
                return;
            }
            nestedScrollView.setPadding(nestedScrollView.getPaddingLeft(), nestedScrollView.getPaddingTop(), nestedScrollView.getPaddingRight(), this.Z);
        }
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        if (m1Var.getType() == 993) {
            q7(i17, i18, str);
        } else {
            com.tencent.mars.xlog.Log.w("MicroMsg.ChatroomNoticeUI", "error cgi type callback:[%d]", java.lang.Integer.valueOf(m1Var.getType()));
        }
    }

    public final boolean p7() {
        java.lang.Boolean bool = this.f74679y0;
        if (bool != null) {
            return bool.booleanValue();
        }
        java.lang.String g17 = c01.v1.g(this.K);
        java.util.Map d17 = com.tencent.mm.sdk.platformtools.aa.d(this.U, "favitem", null);
        if (d17 == null) {
            this.f74679y0 = java.lang.Boolean.TRUE;
            return true;
        }
        java.lang.String str = (java.lang.String) d17.get(".favitem.source.$sourceid");
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str) && !com.tencent.mm.sdk.platformtools.t8.K0(g17) && g17.contains(str)) {
            this.f74679y0 = java.lang.Boolean.TRUE;
            return true;
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            this.f74679y0 = java.lang.Boolean.FALSE;
            return false;
        }
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(java.lang.Math.abs(c01.v1.f(this.K) - this.W) < 5);
        this.f74679y0 = valueOf;
        return valueOf.booleanValue();
    }

    @Override // com.tencent.mm.plugin.component.editor.EditorUI, mx1.a
    public void q0(long j17) {
        long j18;
        int i17 = j17 == 1 ? 4 : j17 == 16 ? 1 : j17 == 65536 ? 2 : j17 == 4096 ? 3 : 0;
        com.tencent.mm.autogen.mmdata.rpt.GroupNoticeInfoStruct groupNoticeInfoStruct = new com.tencent.mm.autogen.mmdata.rpt.GroupNoticeInfoStruct();
        groupNoticeInfoStruct.f58389d = groupNoticeInfoStruct.b("ChatName", this.K, true);
        if (this.R) {
            j18 = 1;
        } else {
            j18 = this.S ? 2 : 3;
        }
        groupNoticeInfoStruct.f58390e = j18;
        groupNoticeInfoStruct.f58391f = this.M;
        groupNoticeInfoStruct.f58392g = com.tencent.mm.sdk.platformtools.t8.K0(this.U) ? 1L : 2L;
        groupNoticeInfoStruct.f58393h = groupNoticeInfoStruct.b("NoticeId", n7(), true);
        groupNoticeInfoStruct.f58394i = i17;
        groupNoticeInfoStruct.k();
    }

    public final void q7(int i17, int i18, java.lang.String str) {
        com.tencent.mm.ui.widget.dialog.u3 u3Var = this.X;
        if (u3Var != null && u3Var.isShowing()) {
            this.X.dismiss();
        }
        if (i17 != 0 || i18 != 0) {
            com.tencent.mars.xlog.Log.w("MicroMsg.ChatroomNoticeUI", "dz[handleSetNoticeFailed:%s]", str);
            tm.a b17 = tm.a.b(str);
            if (b17 != null) {
                b17.d(this, new com.tencent.mm.plugin.announcement.f(this));
            } else {
                db5.e1.T(getContext(), getString(com.tencent.mm.R.string.i68));
            }
            com.tencent.mars.xlog.Log.w("MicroMsg.ChatroomNoticeUI", "dz[onSceneEnd : set announcement failed:%d %d %s]", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ChatroomNoticeUI", "dz[onSceneEnd : set announcement successfully!]");
        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(219L, 15L, 1L, true);
        db5.t7.h(this, getString(com.tencent.mm.R.string.i66));
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("room_name", this.L);
        intent.putExtra("room_notice", this.T);
        setResult(-1, intent);
        finish();
    }

    public final void r7(int i17) {
        long j17;
        com.tencent.mm.autogen.mmdata.rpt.ViewRoomDescTipsStruct viewRoomDescTipsStruct = new com.tencent.mm.autogen.mmdata.rpt.ViewRoomDescTipsStruct();
        viewRoomDescTipsStruct.f61634d = viewRoomDescTipsStruct.b("ChatName", this.K, true);
        viewRoomDescTipsStruct.f61636f = this.M;
        if (this.R) {
            j17 = 1;
        } else {
            j17 = this.S ? 2 : 3;
        }
        viewRoomDescTipsStruct.f61635e = j17;
        viewRoomDescTipsStruct.f61638h = viewRoomDescTipsStruct.b("NoticeId", "" + this.W, true);
        viewRoomDescTipsStruct.f61637g = (long) i17;
        viewRoomDescTipsStruct.k();
    }

    @Override // com.tencent.mm.plugin.component.editor.EditorUI, com.tencent.mm.plugin.secdata.ui.MMSecDataActivity, com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity
    public void superImportUIComponents(java.util.HashSet hashSet) {
        super.superImportUIComponents(hashSet);
        hashSet.add(com.tencent.mm.plugin.announcement.r.class);
    }

    @Override // com.tencent.mm.plugin.component.editor.EditorUI, mx1.a
    public void x1(int i17) {
        super.x1(i17);
        enableOptionMenu(0, true);
        this.f74678x0 = true;
    }
}

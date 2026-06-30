package com.tencent.mm.chatroom.ui;

/* loaded from: classes5.dex */
public class SeeAccessVerifyInfoUI extends com.tencent.mm.ui.MMActivity implements com.tencent.mm.modelbase.u0 {
    public android.widget.TextView A;
    public android.widget.TextView B;
    public android.widget.TextView C;
    public android.widget.GridView D;
    public com.tencent.mm.ui.widget.dialog.u3 E;
    public boolean F = false;
    public boolean G = false;
    public boolean H = false;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.storage.a3 f63908d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.chatroom.ui.za f63909e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f63910f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f63911g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f63912h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f63913i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f63914m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f63915n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f63916o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f63917p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f63918q;

    /* renamed from: r, reason: collision with root package name */
    public long f63919r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f63920s;

    /* renamed from: t, reason: collision with root package name */
    public long f63921t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f63922u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f63923v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f63924w;

    /* renamed from: x, reason: collision with root package name */
    public android.widget.TextView f63925x;

    /* renamed from: y, reason: collision with root package name */
    public android.widget.TextView f63926y;

    /* renamed from: z, reason: collision with root package name */
    public android.widget.ImageView f63927z;

    public static void T6(com.tencent.mm.chatroom.ui.SeeAccessVerifyInfoUI seeAccessVerifyInfoUI, java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z17) {
        com.tencent.mm.storage.ya z07;
        seeAccessVerifyInfoUI.getClass();
        if (com.tencent.mm.sdk.platformtools.t8.K0(str2) && (z07 = ((com.tencent.mm.storage.ab) ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).mj()).z0(str)) != null && !com.tencent.mm.sdk.platformtools.t8.K0(z07.field_encryptUsername)) {
            str2 = z07.field_conRemark;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Contact_User", str);
        intent.putExtra("Contact_RemarkName", str2);
        com.tencent.mars.xlog.Log.i("MicroMsg.SeeAccessVerifyInfoUI", "mTicket:%s", seeAccessVerifyInfoUI.f63924w);
        intent.putExtra("key_add_contact_verify_ticket", seeAccessVerifyInfoUI.f63924w);
        com.tencent.mm.storage.a3 a3Var = seeAccessVerifyInfoUI.f63908d;
        if (a3Var != null) {
            intent.putExtra("Contact_RoomNickname", a3Var.z0(str));
        }
        intent.putExtra("Contact_Nick", str3);
        intent.putExtra("Contact_RoomMember", true);
        intent.putExtra("room_name", seeAccessVerifyInfoUI.f63922u);
        intent.putExtra("CONTACT_INFO_UI_SOURCE", 16);
        com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str, true);
        if (n17 != null && ((int) n17.E2) > 0 && n17.r2()) {
            com.tencent.mm.autogen.events.SetLocalQQMobileEvent setLocalQQMobileEvent = new com.tencent.mm.autogen.events.SetLocalQQMobileEvent();
            am.au auVar = setLocalQQMobileEvent.f54766g;
            auVar.f6187a = intent;
            auVar.f6188b = str;
            setLocalQQMobileEvent.e();
        }
        if (n17 != null && n17.k2()) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.kvStat(10298, n17.d1() + ",14");
        }
        if (z17) {
            intent.putExtra("Contact_Scene", 96);
        } else {
            intent.putExtra("Contact_Scene", 14);
        }
        intent.putExtra("Is_RoomOwner", true);
        intent.putExtra("Contact_ChatRoomId", seeAccessVerifyInfoUI.f63922u);
        j45.l.j(seeAccessVerifyInfoUI, com.google.android.gms.common.Scopes.PROFILE, ".ui.ContactInfoUI", intent, null);
    }

    public com.tencent.mm.chatroom.ui.ab U6(android.view.View view) {
        com.tencent.mm.chatroom.ui.ab abVar = new com.tencent.mm.chatroom.ui.ab(this);
        abVar.f64038a = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.m7e);
        abVar.f64039b = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.m7b);
        abVar.f64040c = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.m7d);
        return abVar;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.cj9;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        this.f63925x = (android.widget.TextView) findViewById(com.tencent.mm.R.id.hfa);
        this.f63926y = (android.widget.TextView) findViewById(com.tencent.mm.R.id.hf_);
        this.A = (android.widget.TextView) findViewById(com.tencent.mm.R.id.m7b);
        this.B = (android.widget.TextView) findViewById(com.tencent.mm.R.id.m7d);
        this.f63927z = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.m7e);
        this.C = (android.widget.TextView) findViewById(com.tencent.mm.R.id.f482348c3);
        android.widget.GridView gridView = (android.widget.GridView) findViewById(com.tencent.mm.R.id.afo);
        this.D = gridView;
        gridView.setAdapter((android.widget.ListAdapter) this.f63909e);
        android.widget.ImageView imageView = this.f63927z;
        if (imageView != null) {
            imageView.setOnClickListener(new com.tencent.mm.chatroom.ui.ra(this));
        }
        this.D.setOnTouchListener(new com.tencent.mm.chatroom.ui.sa(this));
        this.D.postDelayed(new com.tencent.mm.chatroom.ui.ta(this), 100L);
        java.lang.String str = null;
        android.text.SpannableString j17 = null;
        if (this.f63927z != null) {
            kv.z zVar = (kv.z) i95.n0.c(kv.z.class);
            android.widget.ImageView imageView2 = this.f63927z;
            java.lang.String str2 = this.f63916o;
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            if (str2 == null) {
                str2 = "";
            }
            ((com.tencent.mm.feature.avatar.w) zVar).Ai(imageView2, str2, null);
        }
        android.widget.TextView textView = this.A;
        if (textView != null) {
            java.lang.String str3 = this.f63916o;
            boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            if (str3 == null) {
                str3 = "";
            }
            com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str3, true);
            if (n17 == null) {
                com.tencent.mars.xlog.Log.w("MicroMsg.SeeAccessVerifyInfoUI", "ct == null");
            } else {
                if (com.tencent.mm.sdk.platformtools.t8.K0(n17.w0())) {
                    com.tencent.mm.storage.a3 a3Var = this.f63908d;
                    if (a3Var != null) {
                        str = a3Var.z0(str3);
                    }
                } else {
                    str = n17.w0();
                }
                if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                    str = n17.w0();
                }
                if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                    str = n17.f2();
                }
                le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
                if (str == null) {
                    str = "";
                }
                float textSize = textView.getTextSize();
                ((ke0.e) xVar).getClass();
                j17 = com.tencent.mm.pluginsdk.ui.span.c0.j(this, str, textSize);
            }
            textView.setText(j17);
        }
        if (this.B != null) {
            if (com.tencent.mm.storage.z3.q4(this.f63922u) && com.tencent.mm.storage.z3.m4(this.f63916o)) {
                dm.w8 w8Var = new dm.w8();
                w8Var.field_appid = this.f63917p;
                w8Var.field_wordingId = this.f63918q;
                w8Var.field_language = com.tencent.mm.sdk.platformtools.m2.f(com.tencent.mm.sdk.platformtools.x2.f193071a);
                ((u41.l) ((za0.k) ((ab0.b0) i95.n0.c(ab0.b0.class))).Ai()).y0(w8Var, new java.lang.String[]{"appid", "wordingId", com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_LANGUAGE});
                if (android.text.TextUtils.isEmpty(w8Var.field_wording)) {
                    if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f63918q) && !com.tencent.mm.sdk.platformtools.t8.K0(this.f63917p)) {
                        this.H = true;
                        java.util.LinkedList linkedList = new java.util.LinkedList();
                        linkedList.add(this.f63918q);
                        com.tencent.mm.modelbase.r1 r1Var = gm0.j1.n().f273288b;
                        ab0.b0 b0Var = (ab0.b0) i95.n0.c(ab0.b0.class);
                        java.lang.String str4 = this.f63917p;
                        java.lang.String str5 = w8Var.field_language;
                        ((za0.k) b0Var).getClass();
                        r1Var.g(new l41.z(str4, str5, linkedList, 0));
                    }
                    this.B.setVisibility(4);
                } else {
                    this.B.setVisibility(0);
                    this.B.setText("＠" + w8Var.field_wording);
                }
            } else {
                this.B.setVisibility(8);
            }
        }
        android.widget.TextView textView2 = this.f63925x;
        if (textView2 != null) {
            le0.x xVar2 = (le0.x) i95.n0.c(le0.x.class);
            java.lang.String str6 = this.f63915n;
            boolean z19 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            if (str6 == null) {
                str6 = "";
            }
            ((ke0.e) xVar2).getClass();
            textView2.setText(com.tencent.mm.pluginsdk.ui.span.c0.i(this, str6));
        }
        if (this.f63926y != null && !com.tencent.mm.sdk.platformtools.t8.K0(this.f63923v)) {
            android.widget.TextView textView3 = this.f63926y;
            le0.x xVar3 = (le0.x) i95.n0.c(le0.x.class);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("\"");
            java.lang.String str7 = this.f63923v;
            sb6.append(str7 != null ? str7 : "");
            sb6.append("\"");
            java.lang.String sb7 = sb6.toString();
            ((ke0.e) xVar3).getClass();
            textView3.setText(com.tencent.mm.pluginsdk.ui.span.c0.i(this, sb7));
        }
        android.widget.TextView textView4 = this.C;
        if (textView4 != null) {
            textView4.setOnClickListener(new com.tencent.mm.chatroom.ui.wa(this));
        }
        if (this.C == null || !pt0.f0.Li(this.f63920s, this.f63919r).I2()) {
            return;
        }
        this.C.setBackgroundResource(com.tencent.mm.R.drawable.f481063jr);
        this.C.setTextColor(getResources().getColor(com.tencent.mm.R.color.f479217t5));
        this.C.setText(getString(com.tencent.mm.R.string.f492273fw3));
        this.C.setEnabled(false);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        com.tencent.mars.xlog.Log.i("MicroMsg.SeeAccessVerifyInfoUI", "[onCreate]");
        setMMTitle(getString(com.tencent.mm.R.string.f489796bx));
        this.f63919r = getIntent().getLongExtra("msgLocalId", 0L);
        this.f63920s = getIntent().getStringExtra("msgTalker");
        this.f63921t = getIntent().getLongExtra("msgSvrId", 0L);
        this.f63915n = getIntent().getStringExtra("invitertitle");
        this.f63916o = getIntent().getStringExtra("inviterusername");
        this.f63917p = getIntent().getStringExtra("inviterappid");
        this.f63918q = getIntent().getStringExtra("inviterdescid");
        this.f63922u = getIntent().getStringExtra("chatroom");
        this.f63923v = getIntent().getStringExtra("invitationreason");
        this.f63924w = getIntent().getStringExtra("ticket");
        this.f63911g = getIntent().getStringExtra(dm.i4.COL_USERNAME);
        this.f63910f = getIntent().getStringExtra("nickname");
        this.f63912h = getIntent().getStringExtra("descid");
        this.f63913i = getIntent().getStringExtra("appid");
        this.f63914m = getIntent().getStringExtra("headimgurl");
        com.tencent.mm.storage.b3 a17 = ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a();
        java.lang.String str = this.f63922u;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str == null) {
            str = "";
        }
        this.f63908d = a17.W0(str);
        this.f63909e = new com.tencent.mm.chatroom.ui.za(this, this);
        java.lang.String[] split = this.f63911g.split(",");
        if (split != null && split.length > 0) {
            java.lang.String str2 = split[0];
            com.tencent.mars.xlog.Log.i("MicroMsg.SeeAccessVerifyInfoUI", "[%s] has been in chatroom![%s]", str2, this.f63922u);
            if (this.f63908d.A0() != null && this.f63908d.A0().contains(str2)) {
                com.tencent.mm.storage.f9 Li = pt0.f0.Li(this.f63920s, this.f63919r);
                if (!Li.I2()) {
                    Li.l1(Li.F | 128);
                    ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().lb(this.f63919r, Li, true);
                }
            }
        }
        initView();
        setBackBtn(new com.tencent.mm.chatroom.ui.qa(this));
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        gm0.j1.n().f273288b.q(453, this);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        com.tencent.mars.xlog.Log.i("MicroMsg.SeeAccessVerifyInfoUI", "[onResume]");
        gm0.j1.n().f273288b.a(453, this);
        super.onResume();
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        if ((m1Var instanceof ab0.u) && i17 == 0 && i18 == 0) {
            if (this.H && com.tencent.mm.sdk.platformtools.t8.J0(this.B.getText())) {
                this.H = false;
                dm.w8 w8Var = new dm.w8();
                w8Var.field_appid = this.f63917p;
                w8Var.field_wordingId = this.f63918q;
                w8Var.field_language = com.tencent.mm.sdk.platformtools.m2.f(com.tencent.mm.sdk.platformtools.x2.f193071a);
                ((u41.l) ((za0.k) ((ab0.b0) i95.n0.c(ab0.b0.class))).Ai()).y0(w8Var, new java.lang.String[]{"appid", "wordingId", com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_LANGUAGE});
                if (android.text.TextUtils.isEmpty(w8Var.field_wording)) {
                    if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f63918q) && !com.tencent.mm.sdk.platformtools.t8.K0(this.f63917p)) {
                        java.util.LinkedList linkedList = new java.util.LinkedList();
                        linkedList.add(this.f63918q);
                        com.tencent.mm.modelbase.r1 r1Var = gm0.j1.n().f273288b;
                        ab0.b0 b0Var = (ab0.b0) i95.n0.c(ab0.b0.class);
                        java.lang.String str2 = this.f63917p;
                        java.lang.String str3 = w8Var.field_language;
                        ((za0.k) b0Var).getClass();
                        r1Var.g(new l41.z(str2, str3, linkedList, 0));
                    }
                    this.B.setVisibility(4);
                } else {
                    this.B.setVisibility(0);
                    this.B.setText("＠" + w8Var.field_wording);
                }
            }
            if (this.G) {
                this.f63909e.notifyDataSetChanged();
            }
        }
    }
}

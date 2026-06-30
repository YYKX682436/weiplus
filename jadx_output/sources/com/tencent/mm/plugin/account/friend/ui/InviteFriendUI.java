package com.tencent.mm.plugin.account.friend.ui;

/* loaded from: classes8.dex */
public class InviteFriendUI extends com.tencent.mm.ui.MMActivity implements kv.e0 {

    /* renamed from: d, reason: collision with root package name */
    public int f73151d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f73152e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f73153f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f73154g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f73155h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.ImageView f73156i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.Button f73157m;

    /* renamed from: n, reason: collision with root package name */
    public int f73158n;

    /* renamed from: o, reason: collision with root package name */
    public int f73159o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f73160p = null;

    public static void T6(com.tencent.mm.plugin.account.friend.ui.InviteFriendUI inviteFriendUI) {
        int i17 = inviteFriendUI.f73158n;
        if (i17 <= 0 || inviteFriendUI.f73159o <= 0) {
            return;
        }
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(10991, java.lang.Integer.valueOf(i17), 7, java.lang.Integer.valueOf(inviteFriendUI.f73159o));
    }

    @Override // kv.e0
    public void U(java.lang.String str) {
        java.lang.String str2 = this.f73152e;
        if (str2 == null || str2.equals("")) {
            return;
        }
        ((com.tencent.mm.feature.avatar.w) ((kv.c0) i95.n0.c(kv.c0.class))).getClass();
        long j17 = -1;
        if (com.tencent.mm.storage.z3.s4(str)) {
            try {
                j17 = com.tencent.mm.sdk.platformtools.t8.V(str.split("@")[0], -1L);
            } catch (java.lang.Exception unused) {
            }
        }
        if (j17 > 0) {
            if (this.f73152e.equals("" + j17) && this.f73151d == 0) {
                android.widget.ImageView imageView = this.f73156i;
                ((com.tencent.mm.feature.avatar.w) ((kv.c0) i95.n0.c(kv.c0.class))).getClass();
                imageView.setImageBitmap(com.tencent.mm.modelavatar.g.a(str));
            }
        }
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.blb;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        android.graphics.Bitmap a17;
        android.graphics.Bitmap bitmap;
        this.f73156i = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.heq);
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.tencent.mm.R.id.hev);
        android.widget.TextView textView2 = (android.widget.TextView) findViewById(com.tencent.mm.R.id.hex);
        android.widget.TextView textView3 = (android.widget.TextView) findViewById(com.tencent.mm.R.id.hew);
        this.f73157m = (android.widget.Button) findViewById(com.tencent.mm.R.id.het);
        android.widget.Button button = (android.widget.Button) findViewById(com.tencent.mm.R.id.hey);
        textView.setText(this.f73153f);
        textView3.setText(getString(com.tencent.mm.R.string.g1q, this.f73153f));
        android.graphics.Bitmap bitmap2 = null;
        if (this.f73151d == 1) {
            this.f73156i.setBackgroundDrawable(i65.a.i(this, com.tencent.mm.R.raw.default_mobile_avatar));
            textView2.setText(getString(com.tencent.mm.R.string.f490408u5) + this.f73152e);
            java.lang.String g17 = kk.k.g(this.f73152e.getBytes());
            if (gm0.j1.u().l()) {
                ((m61.i) ((y61.e) i95.n0.c(y61.e.class))).getClass();
                r61.a i17 = m61.k.wi().i(g17);
                if (i17 != null) {
                    java.lang.String str = i17.f392787c;
                    if (str == null) {
                        str = "";
                    }
                    bitmap = o25.b.b(str, this, false);
                } else {
                    bitmap = null;
                }
            } else {
                ((com.tencent.mm.feature.avatar.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
                bitmap = com.tencent.mm.modelavatar.d1.Ai().k(com.tencent.mm.sdk.platformtools.x2.f193071a);
            }
            if (bitmap != null) {
                this.f73156i.setImageBitmap(bitmap);
            } else {
                this.f73156i.setImageDrawable(i65.a.i(this, com.tencent.mm.R.raw.default_mobile_avatar));
            }
        }
        if (this.f73151d == 0) {
            this.f73156i.setBackgroundDrawable(i65.a.i(this, com.tencent.mm.R.raw.default_qq_avatar));
            textView2.setText(getString(com.tencent.mm.R.string.u_) + this.f73152e);
            long b17 = (long) kk.v.b(this.f73152e);
            if (b17 != 0) {
                ((com.tencent.mm.feature.avatar.w) ((kv.c0) i95.n0.c(kv.c0.class))).getClass();
                bitmap2 = com.tencent.mm.modelavatar.g.a(new kk.v(b17) + "@qqim");
            }
            if (bitmap2 == null) {
                this.f73156i.setImageDrawable(i65.a.i(this, com.tencent.mm.R.raw.default_qq_avatar));
            } else {
                this.f73156i.setImageBitmap(bitmap2);
            }
            button.setVisibility(0);
        }
        if (this.f73151d == 2) {
            this.f73157m.setText(com.tencent.mm.R.string.fqy);
            this.f73156i.setBackgroundDrawable(i65.a.i(this, com.tencent.mm.R.drawable.bho));
            textView2.setText(getString(com.tencent.mm.R.string.f490397tu) + this.f73152e);
            if (gm0.j1.u().l()) {
                kv.c0 c0Var = (kv.c0) i95.n0.c(kv.c0.class);
                java.lang.String str2 = this.f73154g;
                ((com.tencent.mm.feature.avatar.w) c0Var).getClass();
                a17 = com.tencent.mm.modelavatar.g.a(str2 + "@google");
            } else {
                ((com.tencent.mm.feature.avatar.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
                a17 = com.tencent.mm.modelavatar.d1.Ai().k(com.tencent.mm.sdk.platformtools.x2.f193071a);
            }
            if (a17 != null) {
                this.f73156i.setImageBitmap(a17);
            } else {
                this.f73156i.setImageDrawable(i65.a.i(this, com.tencent.mm.R.drawable.bho));
            }
            if (android.text.TextUtils.isEmpty(this.f73153f)) {
                textView.setText(com.tencent.mm.sdk.platformtools.t8.Q1(this.f73152e));
                textView3.setText(getString(com.tencent.mm.R.string.g1q, com.tencent.mm.sdk.platformtools.t8.Q1(this.f73152e)));
            }
        }
        if (this.f73151d == 3) {
            this.f73157m.setText(com.tencent.mm.R.string.g1p);
            y60.f fVar = (y60.f) i95.n0.c(y60.f.class);
            java.lang.String str3 = this.f73160p;
            ((x60.e) fVar).getClass();
            android.graphics.Bitmap d17 = x51.w0.d(new com.tencent.mm.pluginsdk.ui.tools.v0(str3, str3, 0, 0));
            if (d17 != null) {
                this.f73156i.setImageBitmap(d17);
            } else {
                this.f73156i.setImageResource(com.tencent.mm.R.raw.default_avatar);
            }
            button.setVisibility(8);
        }
        this.f73157m.setOnClickListener(new s61.i0(this));
        button.setOnClickListener(new s61.j0(this));
        setBackBtn(new s61.k0(this));
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle(com.tencent.mm.R.string.g1s);
        android.content.Intent intent = getIntent();
        this.f73151d = intent.getIntExtra("friend_type", -1);
        this.f73153f = intent.getStringExtra("friend_nick");
        this.f73152e = intent.getStringExtra("friend_num");
        this.f73154g = intent.getStringExtra("friend_googleID");
        this.f73155h = intent.getStringExtra("friend_googleItemID");
        java.lang.String str = this.f73152e;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str == null) {
            str = "";
        }
        this.f73152e = str;
        intent.getStringExtra("friend_linkedInID");
        this.f73160p = intent.getStringExtra("friend_linkedInPicUrl");
        initView();
        this.f73158n = intent.getIntExtra("search_kvstat_scene", 0);
        this.f73159o = intent.getIntExtra("search_kvstat_position", 0);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        ((com.tencent.mm.feature.avatar.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
        com.tencent.mm.modelavatar.d1.Ai().f70579a.j(this);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        ((com.tencent.mm.feature.avatar.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
        com.tencent.mm.modelavatar.d1.Ai().f70579a.a(this, android.os.Looper.getMainLooper());
    }
}

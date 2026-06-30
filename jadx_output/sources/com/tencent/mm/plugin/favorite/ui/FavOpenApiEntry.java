package com.tencent.mm.plugin.favorite.ui;

@db5.a(7)
/* loaded from: classes9.dex */
public class FavOpenApiEntry extends com.tencent.mm.ui.MMActivity {

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ int f101681o = 0;

    /* renamed from: d, reason: collision with root package name */
    public android.content.Intent f101682d;

    /* renamed from: e, reason: collision with root package name */
    public android.os.Bundle f101683e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f101684f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f101685g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.opensdk.modelmsg.SendMessageToWX.Req f101686h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f101687i;

    /* renamed from: m, reason: collision with root package name */
    public int f101688m = 0;

    /* renamed from: n, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.b4 f101689n = new com.tencent.mm.sdk.platformtools.b4(new z82.b(this), true);

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x004b, code lost:
    
        if (r35.j1.k(r27.mController, r28.title, r28.thumbData, r28.description, r27.f101685g, false, r27.f101687i, new z82.c(r27, r28)) != null) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x016e, code lost:
    
        if (r35.j1.l(r27.mController, r28.description, r27.f101684f.equals("wx4310bbd51be7d979") ? "" : r27.f101685g, false, r27.f101687i, new z82.c(r27, r28)) != null) goto L67;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void T6(com.tencent.mm.plugin.favorite.ui.FavOpenApiEntry r27, com.tencent.mm.opensdk.modelmsg.WXMediaMessage r28) {
        /*
            Method dump skipped, instructions count: 530
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.favorite.ui.FavOpenApiEntry.T6(com.tencent.mm.plugin.favorite.ui.FavOpenApiEntry, com.tencent.mm.opensdk.modelmsg.WXMediaMessage):void");
    }

    public final void U6(com.tencent.mm.opensdk.modelmsg.WXMediaMessage wXMediaMessage, java.lang.String str) {
        com.tencent.mm.opensdk.modelmsg.WXMusicVideoObject wXMusicVideoObject = (com.tencent.mm.opensdk.modelmsg.WXMusicVideoObject) wXMediaMessage.mediaObject;
        o72.r2 r2Var = new o72.r2();
        r2Var.field_type = 21;
        W6(wXMediaMessage, r2Var);
        r45.gp0 gp0Var = new r45.gp0();
        gp0Var.O0(wXMediaMessage.title);
        gp0Var.m0(wXMediaMessage.description);
        X6(wXMediaMessage, gp0Var, r2Var.field_type);
        gp0Var.x0(true);
        gp0Var.h0(r2Var.field_type);
        gp0Var.K0(wXMusicVideoObject.musicUrl);
        gp0Var.I0(wXMusicVideoObject.musicDataUrl);
        gp0Var.D0(str);
        gp0Var.E0(wXMusicVideoObject.songLyric);
        r45.xs4 xs4Var = new r45.xs4();
        xs4Var.set(4, wXMusicVideoObject.singerName);
        xs4Var.set(5, wXMusicVideoObject.albumName);
        xs4Var.set(7, wXMusicVideoObject.musicGenre);
        xs4Var.set(8, java.lang.Long.valueOf(wXMusicVideoObject.issueDate));
        xs4Var.set(9, wXMusicVideoObject.identification);
        xs4Var.set(10, java.lang.Integer.valueOf(wXMusicVideoObject.duration));
        xs4Var.set(12, wXMusicVideoObject.musicOperationUrl);
        xs4Var.set(6, wXMediaMessage.messageExt);
        com.tencent.mm.opensdk.modelmsg.WXMusicVipInfo wXMusicVipInfo = wXMusicVideoObject.musicVipInfo;
        xs4Var.set(11, wXMusicVipInfo != null ? b21.m.e(wXMusicVipInfo.musicId) : "");
        java.lang.Object[] objArr = new java.lang.Object[2];
        objArr[0] = wXMusicVideoObject.singerName;
        objArr[1] = java.lang.Boolean.valueOf(wXMusicVideoObject.musicVipInfo != null);
        com.tencent.mars.xlog.Log.i("MicroMsg.FavOpenApiEntry", "share music mv to fav, singerName:%s, musicVipInfo is valid:%b", objArr);
        r45.hp0 hp0Var = new r45.hp0();
        hp0Var.C = xs4Var;
        gp0Var.J1 = hp0Var;
        r2Var.field_favProto.f370964f.add(gp0Var);
        Y6(r2Var, wXMediaMessage);
        com.tencent.mm.plugin.fav.ui.a0.a(r2Var);
    }

    public final r45.gp0 V6(com.tencent.mm.opensdk.modelmsg.WXMediaMessage wXMediaMessage, java.lang.String str, byte[] bArr, int i17) {
        r45.gp0 gp0Var = new r45.gp0();
        gp0Var.O0(wXMediaMessage.title);
        gp0Var.m0(wXMediaMessage.description);
        gp0Var.h0(i17);
        if (str != null) {
            gp0Var.A0(str);
            gp0Var.i0(com.tencent.mm.vfs.w6.n(str));
        } else {
            java.lang.String g17 = kk.k.g(bArr);
            if (bArr.length >= 256) {
                gp0Var.r0(g17);
            } else {
                byte[] bArr2 = new byte[256];
                java.lang.System.arraycopy(bArr, 0, bArr2, 0, 256);
                gp0Var.r0(kk.k.g(bArr2));
            }
            gp0Var.p0(g17);
            gp0Var.q0(bArr.length);
            java.lang.String obj = gp0Var.toString();
            com.tencent.mm.sdk.platformtools.o4 o4Var = o72.x1.f343515a;
            gp0Var.e0(o72.d2.d(obj, i17));
            ((y30.q) ((z30.u) i95.n0.c(z30.u.class))).getClass();
            com.tencent.mm.vfs.w6.a(o72.x1.x(gp0Var), bArr);
        }
        X6(wXMediaMessage, gp0Var, i17);
        return gp0Var;
    }

    public final void W6(com.tencent.mm.opensdk.modelmsg.WXMediaMessage wXMediaMessage, o72.r2 r2Var) {
        r2Var.field_sourceType = 4;
        r2Var.field_favProto.p(wXMediaMessage.title);
        r2Var.field_favProto.e(wXMediaMessage.description);
    }

    public final void X6(com.tencent.mm.opensdk.modelmsg.WXMediaMessage wXMediaMessage, r45.gp0 gp0Var, int i17) {
        byte[] bArr = wXMediaMessage.thumbData;
        if (bArr == null) {
            gp0Var.z0(true);
            return;
        }
        java.lang.String g17 = kk.k.g(bArr);
        gp0Var.N0(g17);
        byte[] bArr2 = wXMediaMessage.thumbData;
        if (bArr2.length >= 256) {
            gp0Var.M0(g17);
        } else {
            byte[] bArr3 = new byte[256];
            java.lang.System.arraycopy(bArr2, 0, bArr3, 0, 256);
            gp0Var.M0(kk.k.g(bArr3));
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(gp0Var.T)) {
            java.lang.String obj = gp0Var.toString();
            com.tencent.mm.sdk.platformtools.o4 o4Var = o72.x1.f343515a;
            gp0Var.e0(o72.d2.d(obj, i17));
        }
        gp0Var.L0(wXMediaMessage.thumbData.length);
        com.tencent.mm.vfs.w6.a(o72.x1.X(gp0Var), wXMediaMessage.thumbData);
    }

    public final void Y6(o72.r2 r2Var, com.tencent.mm.opensdk.modelmsg.WXMediaMessage wXMediaMessage) {
        r45.jq0 jq0Var = new r45.jq0();
        jq0Var.b(this.f101684f);
        jq0Var.g(4);
        jq0Var.e(c01.z1.r());
        jq0Var.j(c01.z1.r());
        r2Var.field_fromUser = jq0Var.f378036f;
        r2Var.field_toUser = jq0Var.f378038h;
        r2Var.field_favProto.o(jq0Var);
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return -1;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        androidx.appcompat.app.b supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.o();
        }
        getWindow().addFlags(67108864);
        if (this.f101682d == null) {
            this.f101682d = getIntent();
        }
        android.os.Bundle extras = this.f101682d.getExtras();
        this.f101683e = extras;
        java.lang.String string = extras.getString("SendAppMessageWrapper_AppId");
        this.f101684f = string;
        if (string == null) {
            this.f101684f = android.net.Uri.parse(this.f101683e.getString(com.tencent.mm.opensdk.constants.ConstantsAPI.CONTENT)).getQueryParameter("appid");
        }
        com.tencent.mm.opensdk.modelmsg.SendMessageToWX.Req req = new com.tencent.mm.opensdk.modelmsg.SendMessageToWX.Req(this.f101683e);
        this.f101686h = req;
        if (req.scene != 2) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FavOpenApiEntry", "scene not WXSceneFavorite!");
            finish();
        } else {
            this.f101687i = getString(com.tencent.mm.R.string.c__);
            this.f101685g = getString(com.tencent.mm.R.string.f490942bb4, o72.x1.v(this, this.f101684f));
            this.f101689n.c(100L, 100L);
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onNewIntent(android.content.Intent intent) {
        super.onNewIntent(intent);
        this.f101682d = intent;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }
}

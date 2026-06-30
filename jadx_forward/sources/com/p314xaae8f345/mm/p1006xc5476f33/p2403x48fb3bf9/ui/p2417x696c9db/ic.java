package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db;

/* loaded from: classes.dex */
public class ic implements ly1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f266372a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d f266373b;

    public ic(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d viewOnCreateContextMenuListenerC19337x37f3384d, android.content.Intent intent) {
        this.f266373b = viewOnCreateContextMenuListenerC19337x37f3384d;
        this.f266372a = intent;
    }

    @Override // ly1.a
    public java.util.Map b(java.lang.String str) {
        java.lang.String str2;
        java.util.HashMap hashMap = new java.util.HashMap();
        if (!"page_out".equals(str)) {
            return hashMap;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d viewOnCreateContextMenuListenerC19337x37f3384d = this.f266373b;
        hashMap.put("web_currenturl", viewOnCreateContextMenuListenerC19337x37f3384d.F7());
        hashMap.put("web_geta8keyscene", java.lang.Integer.valueOf(viewOnCreateContextMenuListenerC19337x37f3384d.getIntent().getIntExtra("geta8key_scene", 0)));
        hashMap.put("web_publisher", viewOnCreateContextMenuListenerC19337x37f3384d.getIntent().getStringExtra("srcUsername"));
        hashMap.put("web_nickname", viewOnCreateContextMenuListenerC19337x37f3384d.getIntent().getStringExtra("srcDisplayname"));
        hashMap.put("web_username", viewOnCreateContextMenuListenerC19337x37f3384d.getIntent().getStringExtra("geta8key_username"));
        hashMap.put("web_publisherid", viewOnCreateContextMenuListenerC19337x37f3384d.getIntent().getStringExtra("KPublisherId"));
        try {
            str2 = viewOnCreateContextMenuListenerC19337x37f3384d.getIntent().getStringExtra(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28);
            java.lang.String stringExtra = this.f266372a.getStringExtra("webpageTitle");
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            if (str2 == null) {
                str2 = stringExtra;
            }
            try {
                viewOnCreateContextMenuListenerC19337x37f3384d.getIntent().getStringExtra("share_report_pre_msg_desc");
            } catch (java.lang.Exception unused) {
                hashMap.put("web_sharesourcetitle", str2);
                hashMap.put("web_sharesourcedesc", "");
                return hashMap;
            }
        } catch (java.lang.Exception unused2) {
            str2 = "";
        }
    }
}

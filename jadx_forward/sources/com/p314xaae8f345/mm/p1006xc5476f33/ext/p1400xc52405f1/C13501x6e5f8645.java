package com.p314xaae8f345.mm.p1006xc5476f33.ext.p1400xc52405f1;

/* renamed from: com.tencent.mm.plugin.ext.provider.ExtControlProviderEntry */
/* loaded from: classes12.dex */
public class C13501x6e5f8645 extends com.p314xaae8f345.mm.p1006xc5476f33.ext.p1400xc52405f1.C13499x920707ba {

    /* renamed from: s, reason: collision with root package name */
    public static final android.content.UriMatcher f181412s;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f181413o;

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.String[] f181414p;

    /* renamed from: q, reason: collision with root package name */
    public int f181415q;

    /* renamed from: r, reason: collision with root package name */
    public android.content.Context f181416r;

    static {
        android.content.UriMatcher uriMatcher = new android.content.UriMatcher(-1);
        f181412s = uriMatcher;
        uriMatcher.addURI(com.p314xaae8f345.mm.sdk.p2603x2137b148.y8.a(), "view_profile", 2);
        uriMatcher.addURI(com.p314xaae8f345.mm.sdk.p2603x2137b148.y8.a(), "to_chatting", 3);
        uriMatcher.addURI(com.p314xaae8f345.mm.sdk.p2603x2137b148.y8.a(), "to_nearby", 4);
        uriMatcher.addURI(com.p314xaae8f345.mm.sdk.p2603x2137b148.y8.a(), "sns_comment_detail", 5);
        uriMatcher.addURI(com.p314xaae8f345.mm.sdk.p2603x2137b148.y8.a(), "share_time_line", 6);
    }

    public C13501x6e5f8645() {
        this.f181413o = false;
        this.f181414p = null;
        this.f181415q = -1;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.ext.p1400xc52405f1.C13499x920707ba, android.content.ContentProvider
    public int delete(android.net.Uri uri, java.lang.String str, java.lang.String[] strArr) {
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.ext.p1400xc52405f1.C13499x920707ba, android.content.ContentProvider
    public java.lang.String getType(android.net.Uri uri) {
        return null;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.ext.p1400xc52405f1.C13499x920707ba, android.content.ContentProvider
    public android.net.Uri insert(android.net.Uri uri, android.content.ContentValues contentValues) {
        return null;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.ext.p1400xc52405f1.C13499x920707ba, android.content.ContentProvider
    public android.database.Cursor query(android.net.Uri uri, java.lang.String[] strArr, java.lang.String str, java.lang.String[] strArr2, java.lang.String str2) {
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 p17;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("ExtControlProviderEntry query() mIsLocalUsed :");
        boolean z17 = this.f181413o;
        sb6.append(z17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ExtControlEntryProvider", sb6.toString());
        android.content.UriMatcher uriMatcher = f181412s;
        if (z17) {
            e(uri, this.f181416r, this.f181415q, this.f181414p);
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f181408g)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ExtControlEntryProvider", "AppID == null");
                l(3, 7);
                return v25.a.a(7);
            }
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(d())) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ExtControlEntryProvider", "PkgName == null");
                l(3, 6);
                return v25.a.a(6);
            }
            int h17 = h();
            if (h17 != 1) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ExtControlEntryProvider", "invalid appid ! return code = " + h17);
                l(2, h17);
                return v25.a.a(h17);
            }
        } else {
            android.content.Context context = getContext();
            this.f181416r = context;
            f(uri, context, uriMatcher);
            if (uri == null) {
                k(3);
                return null;
            }
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f181408g) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(d())) {
                k(3);
                return v25.a.a(3);
            }
            if (!b()) {
                k(1);
                return this.f181405d;
            }
            if (!i(this.f181416r)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ExtControlEntryProvider", "invalid appid ! return null");
                k(2);
                return null;
            }
        }
        java.lang.String queryParameter = uri.getQueryParameter(ya.b.f77502x92235c1b);
        if (queryParameter == null) {
            queryParameter = "";
        }
        if (!z17) {
            this.f181415q = uriMatcher.match(uri);
        }
        int i17 = this.f181415q;
        if (i17 == 2) {
            if (strArr2 == null || strArr2.length <= 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ExtControlEntryProvider", "wrong args");
                k(3);
                return null;
            }
            java.lang.String str3 = strArr2[0];
            if (str3 == null || str3.length() <= 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ExtControlEntryProvider", "contactId == null");
                k(3);
                return null;
            }
            try {
                com.p314xaae8f345.mm.p2621x8fb0427b.z3 p18 = ((com.p314xaae8f345.mm.p2621x8fb0427b.k4) c01.d9.b().q()).p(com.p314xaae8f345.mm.p1006xc5476f33.ext.key.C13497xe8ed7151.a(str3));
                if (p18 == null || ((int) p18.E2) <= 0 || this.f181416r == null) {
                    k(3);
                    return null;
                }
                android.content.Intent intent = new android.content.Intent();
                intent.addFlags(268435456);
                intent.putExtra("Contact_User", p18.d1());
                j45.l.j(this.f181416r, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1722x934978bf.f5860x185a1589, ".ui.ContactInfoUI", intent, null);
                k(0);
                return v25.a.a(1);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ExtControlEntryProvider", e17.getMessage());
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ExtControlEntryProvider", e17, "", new java.lang.Object[0]);
                k(3);
                return null;
            }
        }
        if (i17 == 3) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ExtControlEntryProvider", "toChattingUI");
            if (strArr2 == null || strArr2.length <= 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ExtControlEntryProvider", "wrong args");
                l(3, 3601);
                return v25.a.a(3601);
            }
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(queryParameter)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ExtControlEntryProvider", "callSource == null");
                l(3, 3602);
                return v25.a.a(3602);
            }
            java.lang.String str4 = strArr2[0];
            if (str4 == null || str4.length() <= 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ExtControlEntryProvider", "contactId == null");
                l(3, 3603);
                return v25.a.a(3603);
            }
            try {
                if (queryParameter.equalsIgnoreCase("openapi")) {
                    com.p314xaae8f345.mm.p2621x8fb0427b.eb z07 = n62.k.Ui().z0(str4);
                    if (z07 != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(z07.f67852x996f3ea) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(z07.f67853xdec927b)) {
                        p17 = ((com.p314xaae8f345.mm.p2621x8fb0427b.k4) c01.d9.b().q()).n(z07.f67853xdec927b, true);
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ExtControlEntryProvider", "openidInApp is null");
                    l(3, 3604);
                    return v25.a.a(3604);
                }
                p17 = ((com.p314xaae8f345.mm.p2621x8fb0427b.k4) c01.d9.b().q()).p(com.p314xaae8f345.mm.p1006xc5476f33.ext.key.C13497xe8ed7151.a(str4));
                if (p17 == null || ((int) p17.E2) <= 0 || this.f181416r == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ExtControlEntryProvider", "wrong args ct");
                    l(3, 3605);
                    return v25.a.a(3605);
                }
                android.content.Intent intent2 = new android.content.Intent();
                intent2.setComponent(new android.content.ComponentName(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b, "com.tencent.mm.ui.chatting.ChattingUI"));
                intent2.putExtra("Chat_User", p17.d1());
                intent2.putExtra("finish_direct", true);
                intent2.addFlags(268435456);
                intent2.addFlags(67108864);
                android.content.Context context2 = this.f181416r;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(intent2);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(context2, arrayList.toArray(), "com/tencent/mm/plugin/ext/provider/ExtControlProviderEntry", "toChattingUI", "([Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                context2.startActivity((android.content.Intent) arrayList.get(0));
                yj0.a.f(context2, "com/tencent/mm/plugin/ext/provider/ExtControlProviderEntry", "toChattingUI", "([Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                j(4, 0, 1);
                return v25.a.a(1);
            } catch (java.lang.Exception e18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ExtControlEntryProvider", e18.getMessage());
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ExtControlEntryProvider", e18, "", new java.lang.Object[0]);
                j(5, 4, 12);
                return v25.a.a(12);
            }
        }
        if (i17 == 4) {
            if (this.f181416r == null) {
                k(4);
                return null;
            }
            android.content.Intent intent3 = new android.content.Intent();
            intent3.setComponent(new android.content.ComponentName(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b, "com.tencent.mm.plugin.nearby.ui.NearbyFriendsUI"));
            intent3.addFlags(268435456);
            android.content.Context context3 = this.f181416r;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(intent3);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(context3, arrayList2.toArray(), "com/tencent/mm/plugin/ext/provider/ExtControlProviderEntry", "toNearBy", "()Landroid/database/Cursor;", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context3.startActivity((android.content.Intent) arrayList2.get(0));
            yj0.a.f(context3, "com/tencent/mm/plugin/ext/provider/ExtControlProviderEntry", "toNearBy", "()Landroid/database/Cursor;", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            k(0);
            return v25.a.a(1);
        }
        if (i17 != 5) {
            if (i17 != 6) {
                l(3, 15);
                return null;
            }
            if (strArr2 == null || strArr2.length <= 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ExtControlEntryProvider", "wrong args");
                k(3);
                return null;
            }
            if (this.f181416r == null) {
                k(4);
                return null;
            }
            android.content.Intent intent4 = new android.content.Intent();
            intent4.setComponent(new android.content.ComponentName(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b, "com.tencent.mm.ui.tools.ShareToTimeLineUI"));
            intent4.setAction("android.intent.action.SEND");
            intent4.addCategory("android.intent.category.DEFAULT");
            intent4.addFlags(268435456);
            java.lang.String str5 = strArr2[1];
            intent4.putExtra("android.intent.extra.TEXT", str5 != null ? str5 : "");
            java.lang.String str6 = strArr2[0];
            if (str6 != null && str6.trim().length() > 0) {
                intent4.putExtra("android.intent.extra.STREAM", android.net.Uri.parse(strArr2[0]));
            }
            intent4.putExtra("Ksnsupload_empty_img", true);
            intent4.setType("image/*");
            android.content.Context context4 = this.f181416r;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(intent4);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(context4, arrayList3.toArray(), "com/tencent/mm/plugin/ext/provider/ExtControlProviderEntry", "toShareTimeLine", "([Ljava/lang/String;)Landroid/database/Cursor;", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context4.startActivity((android.content.Intent) arrayList3.get(0));
            yj0.a.f(context4, "com/tencent/mm/plugin/ext/provider/ExtControlProviderEntry", "toShareTimeLine", "([Ljava/lang/String;)Landroid/database/Cursor;", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            k(0);
            return v25.a.a(1);
        }
        if (strArr2 == null || strArr2.length <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ExtControlEntryProvider", "wrong args");
            k(3);
            return null;
        }
        java.lang.String str7 = strArr2[0];
        if (str7 == null || str7.length() <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ExtControlEntryProvider", "wrong args");
            k(3);
            return null;
        }
        try {
            long a17 = com.p314xaae8f345.mm.p1006xc5476f33.ext.key.C13497xe8ed7151.a(str7);
            if (a17 <= 0) {
                k(3);
                return null;
            }
            if (this.f181416r == null) {
                k(4);
                return null;
            }
            android.content.Intent intent5 = new android.content.Intent();
            intent5.setComponent(new android.content.ComponentName(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b, "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI"));
            intent5.putExtra("INTENT_SNS_LOCAL_ID", (int) a17);
            intent5.addCategory("android.intent.category.DEFAULT");
            intent5.addFlags(268435456);
            android.content.Context context5 = this.f181416r;
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(intent5);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(context5, arrayList4.toArray(), "com/tencent/mm/plugin/ext/provider/ExtControlProviderEntry", "toSnsCommentDetail", "([Ljava/lang/String;)Landroid/database/Cursor;", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context5.startActivity((android.content.Intent) arrayList4.get(0));
            yj0.a.f(context5, "com/tencent/mm/plugin/ext/provider/ExtControlProviderEntry", "toSnsCommentDetail", "([Ljava/lang/String;)Landroid/database/Cursor;", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            k(0);
            return v25.a.a(1);
        } catch (java.lang.Exception e19) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ExtControlEntryProvider", e19.getMessage());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ExtControlEntryProvider", e19, "", new java.lang.Object[0]);
            k(3);
            return null;
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.ext.p1400xc52405f1.C13499x920707ba, android.content.ContentProvider
    public int update(android.net.Uri uri, android.content.ContentValues contentValues, java.lang.String str, java.lang.String[] strArr) {
        return 0;
    }

    public C13501x6e5f8645(java.lang.String[] strArr, int i17, android.content.Context context) {
        this.f181413o = false;
        this.f181414p = null;
        this.f181413o = true;
        this.f181414p = strArr;
        this.f181415q = i17;
        this.f181416r = context;
    }
}

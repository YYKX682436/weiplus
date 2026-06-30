package com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui;

/* loaded from: classes8.dex */
public class t2 {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f260606a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f260607b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f260608c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f260609d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f260610e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f260611f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f260612g;

    /* renamed from: h, reason: collision with root package name */
    public int f260613h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.ActivityC19055xad52aa6b f260614i;

    public t2(com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.ActivityC19055xad52aa6b activityC19055xad52aa6b, android.content.Context context) {
        this.f260614i = activityC19055xad52aa6b;
    }

    public final java.lang.String a(java.lang.String str, java.lang.String str2) {
        return android.net.Uri.parse(this.f260612g).buildUpon().appendQueryParameter(str, str2).build().toString();
    }

    public java.lang.String b() {
        int i17 = this.f260613h;
        return i17 == 0 ? a("qqpimsecurestatus", "not_installed") : i17 == 2 ? a("qqpimsecurestatus", "runing") : i17 == 1 ? a("qqpimsecurestatus", "not_run") : a("qqpimsecurestatus", "not_run");
    }
}

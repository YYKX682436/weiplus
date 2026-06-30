package com.p314xaae8f345.p3006xb8ff1437.log;

/* renamed from: com.tencent.thumbplayer.log.TPLoggerContext */
/* loaded from: classes16.dex */
public class C26478xc50084e3 {

    /* renamed from: DEFAULT_TAG */
    public static final java.lang.String f53978x665bdc5c = "TPLogger";

    /* renamed from: PREFIX_THUMB_PLAYER */
    public static final java.lang.String f53979x7ff61a17 = "ThumbPlayer";

    /* renamed from: classId */
    private java.lang.String f53980x32e134b3;

    /* renamed from: commentScene */
    private java.lang.String f53981x2ebb5d6d;

    /* renamed from: model */
    private java.lang.String f53982x633fb29;

    /* renamed from: prefix */
    private java.lang.String f53983xc594b292;

    /* renamed from: stack */
    private java.lang.String f53984x68ac288;
    private java.lang.String tag;

    /* renamed from: taskId */
    private java.lang.String f53985xcb7ef180;

    public C26478xc50084e3(java.lang.String str) {
        this(str, "", "", "");
    }

    /* renamed from: buildTag */
    private void m103232xaab9c24c() {
        this.tag = this.f53983xc594b292;
        if (!android.text.TextUtils.isEmpty(this.f53980x32e134b3)) {
            this.tag += "_C" + this.f53980x32e134b3;
        }
        if (!android.text.TextUtils.isEmpty(this.f53985xcb7ef180)) {
            this.tag += "_T" + this.f53985xcb7ef180;
        }
        if (!android.text.TextUtils.isEmpty(this.f53982x633fb29)) {
            this.tag += "_" + this.f53982x633fb29;
        }
        if (android.text.TextUtils.isEmpty(this.f53981x2ebb5d6d)) {
            return;
        }
        this.tag += "_" + this.f53981x2ebb5d6d;
    }

    /* renamed from: getClassId */
    public java.lang.String m103233x70ae707d() {
        return this.f53980x32e134b3;
    }

    /* renamed from: getCommentScene */
    public java.lang.String m103234x8fadefe3() {
        return this.f53981x2ebb5d6d;
    }

    /* renamed from: getModel */
    public java.lang.String m103235x74d1a173() {
        return this.f53982x633fb29;
    }

    /* renamed from: getPrefix */
    public java.lang.String m103236x2aabd588() {
        return this.f53983xc594b292;
    }

    /* renamed from: getStack */
    public java.lang.String m103237x752868d2() {
        return this.f53984x68ac288;
    }

    /* renamed from: getTag */
    public java.lang.String m103238xb5887064() {
        return this.tag;
    }

    /* renamed from: getTaskId */
    public java.lang.String m103239x30961476() {
        return this.f53985xcb7ef180;
    }

    /* renamed from: setTaskId */
    public void m103240x23cb4882(java.lang.String str) {
        this.f53985xcb7ef180 = str;
        m103232xaab9c24c();
    }

    /* renamed from: toString */
    public java.lang.String m103241x9616526c() {
        return "TPLoggerContext{prefix='" + this.f53983xc594b292 + "', classId='" + this.f53980x32e134b3 + "', taskId='" + this.f53985xcb7ef180 + "', model='" + this.f53982x633fb29 + "', tag='" + this.tag + "', commentScene='" + this.f53981x2ebb5d6d + "'}";
    }

    /* renamed from: update */
    public void m103242xce0038c9(com.p314xaae8f345.p3006xb8ff1437.log.C26478xc50084e3 c26478xc50084e3, java.lang.String str) {
        if (c26478xc50084e3 != null) {
            this.f53983xc594b292 = c26478xc50084e3.f53983xc594b292;
            this.f53980x32e134b3 = c26478xc50084e3.f53980x32e134b3;
            this.f53985xcb7ef180 = c26478xc50084e3.f53985xcb7ef180;
            this.f53984x68ac288 = c26478xc50084e3.f53984x68ac288;
            this.f53981x2ebb5d6d = c26478xc50084e3.f53981x2ebb5d6d;
        } else {
            this.f53983xc594b292 = "";
            this.f53980x32e134b3 = "";
            this.f53985xcb7ef180 = "";
        }
        this.f53982x633fb29 = str;
        m103232xaab9c24c();
    }

    public C26478xc50084e3(com.p314xaae8f345.p3006xb8ff1437.log.C26478xc50084e3 c26478xc50084e3) {
        this(c26478xc50084e3.f53983xc594b292, c26478xc50084e3.f53980x32e134b3, c26478xc50084e3.f53985xcb7ef180, c26478xc50084e3.f53982x633fb29);
    }

    public C26478xc50084e3(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        this(str, str2, str3, str4, "");
    }

    public C26478xc50084e3(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        this.tag = f53978x665bdc5c;
        this.f53984x68ac288 = "";
        this.f53983xc594b292 = str;
        this.f53980x32e134b3 = str2;
        this.f53985xcb7ef180 = str3;
        this.f53982x633fb29 = str4;
        this.f53981x2ebb5d6d = str5;
        m103232xaab9c24c();
        if (com.p314xaae8f345.p3006xb8ff1437.p3026xaf3f8342.C26278x84e5221f.f51528x6acacd80) {
            try {
                this.f53984x68ac288 = android.util.Log.getStackTraceString(new java.lang.Exception());
            } catch (java.lang.Exception unused) {
            }
        }
    }

    public C26478xc50084e3(com.p314xaae8f345.p3006xb8ff1437.log.C26478xc50084e3 c26478xc50084e3, java.lang.String str) {
        this.f53983xc594b292 = "";
        this.f53980x32e134b3 = "";
        this.f53985xcb7ef180 = "";
        this.f53982x633fb29 = "";
        this.tag = f53978x665bdc5c;
        this.f53984x68ac288 = "";
        this.f53981x2ebb5d6d = "";
        m103242xce0038c9(c26478xc50084e3, str);
    }
}

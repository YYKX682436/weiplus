package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db;

/* loaded from: classes7.dex */
public class p8 {

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.regex.Pattern f273372f = java.util.regex.Pattern.compile("(?:(http|https|file)\\:\\/\\/)?(?:([-A-Za-z0-9$_.+!*'(),;?&=]+(?:\\:[-A-Za-z0-9$_.+!*'(),;?&=]+)?)@)?([a-zA-Z0-9 -\ud7ff豈-﷏ﷰ-\uffef%_-][a-zA-Z0-9 -\ud7ff豈-﷏ﷰ-\uffef%_\\.-]*|\\[[0-9a-fA-F:\\.]+\\])?(?:\\:([0-9]*))?(\\/?[^#]*)?.*", 2);

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f273373a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f273374b;

    /* renamed from: c, reason: collision with root package name */
    public final int f273375c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f273376d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f273377e;

    public p8(java.lang.String str) {
        str.getClass();
        this.f273373a = "";
        this.f273374b = "";
        this.f273375c = -1;
        this.f273376d = "/";
        this.f273377e = "";
        java.util.regex.Matcher matcher = f273372f.matcher(str);
        if (!matcher.matches()) {
            throw new java.lang.Exception("Bad address");
        }
        java.lang.String group = matcher.group(1);
        if (group != null) {
            this.f273373a = group.toLowerCase();
        }
        java.lang.String group2 = matcher.group(2);
        if (group2 != null) {
            this.f273377e = group2;
        }
        java.lang.String group3 = matcher.group(3);
        if (group3 != null) {
            this.f273374b = group3;
        }
        java.lang.String group4 = matcher.group(4);
        if (group4 != null && group4.length() > 0) {
            try {
                this.f273375c = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(group4, -1);
            } catch (java.lang.NumberFormatException unused) {
                throw new java.lang.Exception("Bad port");
            }
        }
        java.lang.String group5 = matcher.group(5);
        if (group5 != null && group5.length() > 0) {
            if (group5.charAt(0) == '/') {
                this.f273376d = group5;
            } else {
                this.f273376d = "/".concat(group5);
            }
        }
        if (this.f273375c == 443 && this.f273373a.equals("")) {
            this.f273373a = "https";
        } else if (this.f273375c == -1) {
            if (this.f273373a.equals("https")) {
                this.f273375c = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1062x7dd491a9.h1.f33726x366c91de;
            } else {
                this.f273375c = 80;
            }
        }
        if (this.f273373a.equals("")) {
            this.f273373a = "http";
        }
    }

    /* renamed from: toString */
    public java.lang.String m75870x9616526c() {
        java.lang.String str;
        java.lang.String str2 = this.f273373a;
        java.lang.String str3 = "";
        int i17 = this.f273375c;
        if ((i17 == 443 || !str2.equals("https")) && (i17 == 80 || !str2.equals("http"))) {
            str = "";
        } else {
            str = ":" + java.lang.Integer.toString(i17);
        }
        java.lang.String str4 = this.f273377e;
        if (str4.length() > 0) {
            str3 = str4 + "@";
        }
        return str2 + "://" + str3 + this.f273374b + str + this.f273376d;
    }
}

package com.p314xaae8f345.p3210x3857dc;

/* loaded from: classes7.dex */
public class q0 {

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.regex.Pattern f302050f = java.util.regex.Pattern.compile("(?:(http|https|file)\\:\\/\\/)?(?:([-A-Za-z0-9$_.+!*'(),;?&=]+(?:\\:[-A-Za-z0-9$_.+!*'(),;?&=]+)?)@)?([a-zA-Z0-9 -\ud7ff豈-﷏ﷰ-\uffef%_-][a-zA-Z0-9 -\ud7ff豈-﷏ﷰ-\uffef%_\\.-]*|\\[[0-9a-fA-F:\\.]+\\])?(?:\\:([0-9]*))?(\\/?[^#]*)?.*", 2);

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f302051a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f302052b;

    /* renamed from: c, reason: collision with root package name */
    public final int f302053c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f302054d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f302055e;

    public q0(java.lang.String str) {
        str.getClass();
        this.f302051a = "";
        this.f302052b = "";
        this.f302053c = -1;
        this.f302054d = "/";
        this.f302055e = "";
        java.util.regex.Matcher matcher = f302050f.matcher(str);
        if (!matcher.matches()) {
            throw new com.p314xaae8f345.p3210x3857dc.p0("Bad address");
        }
        java.lang.String group = matcher.group(1);
        if (group != null) {
            this.f302051a = group.toLowerCase(java.util.Locale.ROOT);
        }
        java.lang.String group2 = matcher.group(2);
        if (group2 != null) {
            this.f302055e = group2;
        }
        java.lang.String group3 = matcher.group(3);
        if (group3 != null) {
            this.f302052b = group3;
        }
        java.lang.String group4 = matcher.group(4);
        if (group4 != null && group4.length() > 0) {
            try {
                this.f302053c = java.lang.Integer.parseInt(group4);
            } catch (java.lang.NumberFormatException unused) {
                throw new com.p314xaae8f345.p3210x3857dc.p0("Bad port");
            }
        }
        java.lang.String group5 = matcher.group(5);
        if (group5 != null && group5.length() > 0) {
            if (group5.charAt(0) == '/') {
                this.f302054d = group5;
            } else {
                this.f302054d = "/".concat(group5);
            }
        }
        if (this.f302053c == 443 && this.f302051a.equals("")) {
            this.f302051a = "https";
        } else if (this.f302053c == -1) {
            if (this.f302051a.equals("https")) {
                this.f302053c = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1062x7dd491a9.h1.f33726x366c91de;
            } else {
                this.f302053c = 80;
            }
        }
        if (this.f302051a.equals("")) {
            this.f302051a = "http";
        }
    }

    /* renamed from: toString */
    public java.lang.String m120498x9616526c() {
        java.lang.String str;
        java.lang.String str2 = this.f302051a;
        java.lang.String str3 = "";
        int i17 = this.f302053c;
        if ((i17 == 443 || !str2.equals("https")) && (i17 == 80 || !str2.equals("http"))) {
            str = "";
        } else {
            str = ":" + i17;
        }
        java.lang.String str4 = this.f302055e;
        if (str4.length() > 0) {
            str3 = str4 + "@";
        }
        return str2 + "://" + str3 + this.f302052b + str + this.f302054d;
    }
}

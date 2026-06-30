package com.p314xaae8f345.mm.p2621x8fb0427b;

/* loaded from: classes9.dex */
public class y4 {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f277886a;

    /* renamed from: b, reason: collision with root package name */
    public final long f277887b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f277888c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f277889d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f277890e;

    public y4(java.lang.String str) {
        java.lang.String str2;
        this.f277889d = "-1";
        this.f277890e = "";
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.emoji.EmojiContent", "EmojiContent parse failed. content is null.");
            return;
        }
        try {
            if (str.endsWith("\n")) {
                str2 = str.substring(0, str.length() - 1);
            } else {
                this.f277890e = str.replace(":", "*#*");
                str2 = str;
            }
            java.lang.String[] split = str2.split(":", 6);
            if (split.length > 0) {
                this.f277886a = split[0];
            }
            if (split.length > 1) {
                this.f277887b = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.V(split[1], 0L);
            }
            if (split.length > 2) {
                this.f277888c = split[2].equals("1");
            }
            if (split.length > 3) {
                this.f277889d = split[3];
            }
            if (split.length > 4) {
                this.f277890e = split[4].replace("*#*", ":");
            }
        } catch (java.lang.Exception e17) {
            this.f277887b = 0L;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.emoji.EmojiContent", "EmojiContent parse failed. Content:%s Excpetion:%s", str, com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e17));
        }
    }

    public static com.p314xaae8f345.mm.p2621x8fb0427b.y4 a(java.lang.String str) {
        return new com.p314xaae8f345.mm.p2621x8fb0427b.y4(str);
    }

    public static java.lang.String c(java.lang.String str) {
        java.lang.String replace = str.replace("*#*", ":");
        int indexOf = replace.indexOf("<msg");
        if (!z65.c.f551991d) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.EmojiContent", "getOriginContent: %s", java.lang.Integer.valueOf(indexOf));
        }
        if (indexOf < 0) {
            return null;
        }
        java.lang.String[] split = replace.substring(0, indexOf).split(":");
        int lastIndexOf = replace.substring(0, indexOf).lastIndexOf(":");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.EmojiContent", "getOriginContent: %s", java.lang.Integer.valueOf(split.length));
        if (split.length < 5) {
            return replace;
        }
        return split[4] + replace.substring(lastIndexOf);
    }

    public static java.lang.String e(java.lang.String str, long j17, boolean z17, java.lang.String str2, boolean z18, java.lang.String str3) {
        return str + ":" + j17 + ":" + (z17 ? 1 : 0) + ":" + str2 + ":" + str3.replace(":", "*#*") + ":0\n";
    }

    public java.lang.String b() {
        return this.f277886a;
    }

    public java.lang.String d() {
        return this.f277886a + ":" + this.f277887b + ":" + (this.f277888c ? 1 : 0) + ":" + this.f277889d + ":" + this.f277890e + ":\n";
    }
}

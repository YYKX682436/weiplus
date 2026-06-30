package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f;

/* loaded from: classes9.dex */
public abstract class f0 {

    /* renamed from: a, reason: collision with root package name */
    public long f279941a;

    /* renamed from: b, reason: collision with root package name */
    public final int f279942b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f279943c;

    /* renamed from: d, reason: collision with root package name */
    public long f279944d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f279945e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f279946f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f279947g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f279948h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.regex.Pattern f279949i = java.util.regex.Pattern.compile("[._a-zA-Z0-9]+");

    public f0() {
    }

    public int a() {
        return this.f279942b;
    }

    public boolean b(java.lang.String str) {
        for (char c17 : str.toCharArray()) {
            if (c17 >= 19968 && c17 <= 40891) {
                return true;
            }
        }
        return false;
    }

    public boolean c(java.lang.String str, java.lang.String str2) {
        boolean z17 = false;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            java.util.regex.Matcher matcher = this.f279949i.matcher(str2);
            while (matcher.find()) {
                java.lang.String group = matcher.group();
                z17 = group.startsWith(str);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaHistoryListAdapter", "[isContains] search:%s group:%s", str, group);
                if (z17) {
                    break;
                }
            }
        }
        return z17;
    }

    public boolean d(java.lang.String str) {
        boolean b17 = b(str);
        java.lang.String str2 = this.f279947g;
        java.lang.String str3 = this.f279948h;
        if (b17) {
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f279943c) && this.f279943c.toLowerCase().contains(str)) {
                return true;
            }
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f279946f) && this.f279946f.toLowerCase().contains(str)) {
                return true;
            }
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3) || !str3.toLowerCase().contains(str)) {
                return !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2) && str2.toLowerCase().contains(str);
            }
            return true;
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f279943c) && c(str, this.f279943c.toLowerCase())) {
            return true;
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f279946f) && c(str, this.f279946f.toLowerCase())) {
            return true;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3) || !c(str, str3.toLowerCase())) {
            return !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2) && c(str, str2.toLowerCase());
        }
        return true;
    }

    /* renamed from: equals */
    public boolean m79413xb2c87fbf(java.lang.Object obj) {
        return (obj == null || !(obj instanceof com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.f0)) ? super.equals(obj) : this.f279944d == ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.f0) obj).f279944d;
    }

    public f0(long j17, int i17, java.lang.String str, long j18, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        this.f279941a = j17;
        this.f279942b = i17;
        this.f279943c = str;
        this.f279944d = j18;
        this.f279945e = str2;
        this.f279946f = str3;
        this.f279947g = str4;
        this.f279948h = str5;
    }
}

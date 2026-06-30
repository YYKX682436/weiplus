package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8;

/* loaded from: classes9.dex */
public class w4 extends com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.f0 {

    /* renamed from: j, reason: collision with root package name */
    public int f284052j;

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f284053k;

    /* renamed from: l, reason: collision with root package name */
    public int f284054l;

    public w4(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.y4 y4Var, long j17, int i17, java.lang.String str, long j18, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        super(j17, i17, str, j18, str2, str3, str4, str5);
        this.f284054l = 0;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.f0
    public int a() {
        return this.f279942b;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.f0
    public boolean d(java.lang.String str) {
        if (str == null) {
            return false;
        }
        boolean d17 = super.d(str);
        return !d17 ? this.f279943c.contains(str) : d17;
    }

    /* renamed from: toString */
    public java.lang.String m79826x9616526c() {
        return "PayMediaHistoryListItem{appId='null', desc='" + this.f284053k + "', timestamp=" + this.f279941a + ", type=" + this.f279942b + ", title='" + this.f279943c + "', msgId=" + this.f279944d + ", username='" + this.f279945e + "', nickname='" + this.f279946f + "', remarkName='" + this.f279947g + "', nameInRoom='" + this.f279948h + "'}";
    }
}

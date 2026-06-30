package com.tencent.mm.normsg;

/* loaded from: classes12.dex */
public class g {

    /* renamed from: aa, reason: collision with root package name */
    private int f72204aa;

    /* renamed from: ab, reason: collision with root package name */
    private java.lang.String f72205ab;

    /* renamed from: ac, reason: collision with root package name */
    private long f72206ac;

    /* renamed from: ad, reason: collision with root package name */
    private java.lang.String f72207ad;

    public g(int i17, java.lang.String str, long j17, java.lang.String str2) {
        this.f72204aa = 0;
        this.f72205ab = "";
        this.f72206ac = 0L;
        this.f72207ad = "";
        if (i17 >= 0) {
            this.f72204aa = i17;
        }
        if (!android.text.TextUtils.isEmpty(str)) {
            this.f72205ab = str;
        }
        if (j17 >= 0) {
            this.f72206ac = j17;
        }
        if (android.text.TextUtils.isEmpty(str2)) {
            return;
        }
        this.f72207ad = str2;
    }
}

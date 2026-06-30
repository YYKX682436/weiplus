package com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29;

/* loaded from: classes4.dex */
public class k0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f245871a;

    /* renamed from: b, reason: collision with root package name */
    public int f245872b;

    /* renamed from: f, reason: collision with root package name */
    public final byte[] f245876f = new byte[0];

    /* renamed from: c, reason: collision with root package name */
    public long f245873c = -1;

    /* renamed from: d, reason: collision with root package name */
    public boolean f245874d = false;

    /* renamed from: e, reason: collision with root package name */
    public boolean f245875e = false;

    public k0(java.lang.String str, int i17) {
        this.f245871a = str;
        this.f245872b = i17;
    }

    public void a(long j17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setStartTime", "com.tencent.mm.plugin.sns.model.DownloadManager$SingleImgDownloadByFeedReporter");
        if (!this.f245874d) {
            synchronized (this.f245876f) {
                try {
                    if (!this.f245874d) {
                        this.f245874d = true;
                        this.f245873c = j17;
                    }
                } finally {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setStartTime", "com.tencent.mm.plugin.sns.model.DownloadManager$SingleImgDownloadByFeedReporter");
                }
            }
        }
    }
}
